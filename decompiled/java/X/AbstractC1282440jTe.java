package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import com.ss.pusher.core.base.TEBundle;
import com.ss.pusher.core.buffer.RoiInfo;
import com.ss.pusher.core.buffer.VideoFrame;
import com.ss.pusher.core.utils.AVLog;

/* JADX INFO: renamed from: X.0jTe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1282440jTe {
    public int LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final double LIZLLL;

    public abstract boolean LIZ(MediaCodec mediaCodec, TEBundle tEBundle);

    public abstract void LIZIZ(MediaFormat mediaFormat);

    public abstract void LIZLLL(MediaCodec mediaCodec, VideoFrame videoFrame);

    public AbstractC1282440jTe(TEBundle tEBundle) {
        this.LIZIZ = -6;
        this.LIZLLL = -1.0d;
        this.LIZ = tEBundle.getInt("roi_on");
        boolean bool = tEBundle.getBool("video_lossless_encode");
        if (this.LIZ == 1 && bool) {
            this.LIZ = -103;
            tEBundle.setInt("roi_on", -103);
        }
        if (tEBundle.contains("roi_qp") && tEBundle.getInt("roi_qp") != -100) {
            this.LIZIZ = tEBundle.getInt("roi_qp");
        }
        if (tEBundle.contains("roi_bitrate_ratio")) {
            this.LIZLLL = tEBundle.getDouble("roi_bitrate_ratio");
        }
        if (tEBundle.contains("roi_stretch")) {
            this.LIZJ = tEBundle.getBool("roi_stretch");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("roi enabled: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roi qp: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bitrate ratio: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", stretch roi: ");
        sbLIZ.append(this.LIZJ);
        AVLog.ioi("HardwareVideoEncodeRoi", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static AbstractC1282440jTe LIZJ(String str, TEBundle tEBundle) {
        AbstractC1282440jTe abstractC1282440jTe;
        final TEBundle bundle = tEBundle.getBundle("roi_settings");
        if (bundle == null || bundle.getInt("roi_on") != 1) {
            return null;
        }
        if (!str.startsWith("OMX.qcom.") && !str.startsWith("c2.qti.")) {
            if (str.startsWith("OMX.hisi.")) {
                abstractC1282440jTe = new AbstractC1282440jTe(bundle) { // from class: X.0jTj
                    public Bundle LJ;

                    @Override // X.AbstractC1282440jTe
                    public final void LIZIZ(MediaFormat mediaFormat) {
                        if (this.LIZ != 1) {
                            return;
                        }
                        mediaFormat.setInteger("vendor.hisi.hisi-ext-codec-vendor-configure", 1);
                    }

                    @Override // X.AbstractC1282440jTe
                    public final boolean LIZ(MediaCodec mediaCodec, TEBundle tEBundle2) {
                        if (this.LIZ != 1) {
                            return false;
                        }
                        MediaFormat outputFormat = mediaCodec.getOutputFormat();
                        if (!outputFormat.containsKey("vendor.hisi.hisi-ext-codec-roi-supported") || outputFormat.getInteger("vendor.hisi.hisi-ext-codec-roi-supported") != 1) {
                            this.LIZ = -101;
                            TEBundle bundle2 = tEBundle2.getBundle("roi_settings");
                            if (bundle2 != null) {
                                bundle2.setInt("roi_on", this.LIZ);
                                tEBundle2.setBundle("roi_settings", bundle2);
                            }
                        }
                        if (this.LIZ != 1) {
                            return false;
                        }
                        return true;
                    }

                    @Override // X.AbstractC1282440jTe
                    public final void LIZLLL(MediaCodec mediaCodec, VideoFrame videoFrame) {
                        int[] stretchedRoi;
                        if (this.LIZ == 1 && mediaCodec != null && videoFrame != null && videoFrame.getBuffer() != null) {
                            if (this.LJ == null) {
                                Bundle bundle2 = new Bundle();
                                this.LJ = bundle2;
                                bundle2.putInt("vendor.hisi.hisi-ext-codec-roi-0-qp-mode", 0);
                                this.LJ.putInt("vendor.hisi.hisi-ext-codec-roi-0-qp", this.LIZIZ);
                            }
                            VideoFrame.Buffer buffer = videoFrame.getBuffer();
                            RoiInfo rOIInfo = buffer.getROIInfo();
                            int width = buffer.getWidth();
                            int height = buffer.getHeight();
                            if (rOIInfo == null) {
                                this.LJ.putLong("vendor.hisi.hisi-ext-codec-roi-0-params", 0L);
                                mediaCodec.setParameters(this.LJ);
                                return;
                            }
                            int centerPosX = rOIInfo.getCenterPosX() - (rOIInfo.getRoiWidth() / 2);
                            int centerPosY = rOIInfo.getCenterPosY() - (rOIInfo.getRoiHeight() / 2);
                            int roiWidth = rOIInfo.getRoiWidth() + centerPosX;
                            int roiHeight = rOIInfo.getRoiHeight() + centerPosY;
                            if (this.LIZJ && (stretchedRoi = rOIInfo.getStretchedRoi()) != null && stretchedRoi.length >= 4) {
                                centerPosX = stretchedRoi[0];
                                centerPosY = stretchedRoi[1];
                                roiWidth = stretchedRoi[2];
                                roiHeight = stretchedRoi[3];
                            }
                            int iMin = Math.min(Math.max(0, centerPosX), width - 1);
                            int iMin2 = Math.min(Math.max(0, centerPosY), height - 1);
                            int iMin3 = Math.min(roiWidth - iMin, width - iMin);
                            int iMin4 = Math.min(roiHeight - iMin2, height - iMin2);
                            int i = width * height;
                            if (iMin3 * iMin4 > i / 5) {
                                double d = i;
                                double d2 = iMin3;
                                double d3 = iMin4;
                                double d4 = d / ((5.0d * d2) * d3);
                                int iSqrt = (int) (d2 * Math.sqrt(d4));
                                int iSqrt2 = (int) (Math.sqrt(d4) * d3);
                                iMin += (iMin3 - iSqrt) / 2;
                                iMin2 += (iMin4 - iSqrt2) / 2;
                                iMin4 = iSqrt2;
                                iMin3 = iSqrt;
                            }
                            this.LJ.putLong("vendor.hisi.hisi-ext-codec-roi-0-params", ((long) iMin) | (((long) iMin2) << 16) | (((long) iMin3) << 32) | (((long) iMin4) << 48));
                            mediaCodec.setParameters(this.LJ);
                        }
                    }
                };
            } else {
                bundle.setInt("roi_on", -102);
                abstractC1282440jTe = null;
            }
        } else {
            abstractC1282440jTe = new AbstractC1282440jTe(bundle) { // from class: X.0jTh
                public Bundle LJ;

                @Override // X.AbstractC1282440jTe
                public final void LIZIZ(MediaFormat mediaFormat) {
                    if (this.LIZ != 1) {
                        return;
                    }
                    mediaFormat.setInteger("bitrate-mode", 1);
                    mediaFormat.setString("vendor.qti-ext-extradata-enable.types", "roiinfo");
                }

                @Override // X.AbstractC1282440jTe
                public final boolean LIZ(MediaCodec mediaCodec, TEBundle tEBundle2) {
                    boolean z;
                    boolean z2;
                    if (this.LIZ != 1) {
                        return false;
                    }
                    MediaFormat outputFormat = mediaCodec.getOutputFormat();
                    if ((outputFormat.containsKey("vendor.qti-ext-enc-roiinfo-rect-mode.enable") && outputFormat.getInteger("vendor.qti-ext-enc-roiinfo-rect-mode.enable") == 0) || (outputFormat.containsKey("roi-on") && outputFormat.getInteger("roi-on") == 0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (outputFormat.getString("vendor.qti-ext-extradata-enable.types") != null && outputFormat.getString("vendor.qti-ext-extradata-enable.types").equals("roiinfo")) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z || !z2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Roi unsupported: ");
                        sbLIZ.append(outputFormat);
                        AVLog.logKibana(5, "HardwareVideoEncodeRoi", C2188811AlT.LIZIZ(sbLIZ), null);
                        this.LIZ = -101;
                        TEBundle bundle2 = tEBundle2.getBundle("roi_settings");
                        if (bundle2 != null) {
                            bundle2.setInt("roi_on", this.LIZ);
                            tEBundle2.setBundle("roi_settings", bundle2);
                        }
                    }
                    if (this.LIZ != 1) {
                        return false;
                    }
                    return true;
                }

                @Override // X.AbstractC1282440jTe
                public final void LIZLLL(MediaCodec mediaCodec, VideoFrame videoFrame) {
                    int[] stretchedRoi;
                    if (this.LIZ == 1 && mediaCodec != null && videoFrame != null && videoFrame.getBuffer() != null) {
                        if (this.LJ == null) {
                            Bundle bundle2 = new Bundle();
                            this.LJ = bundle2;
                            C786410Ut5.LJJJI("vendor.qti-ext-enc-roiinfo.type", "rect", bundle2);
                        }
                        this.LJ.putLong("vendor.qti-ext-enc-roiinfo.timestamp", videoFrame.getTimestampNs() / 1000);
                        VideoFrame.Buffer buffer = videoFrame.getBuffer();
                        RoiInfo rOIInfo = buffer.getROIInfo();
                        int width = buffer.getWidth();
                        int height = buffer.getHeight();
                        String strLIZIZ = "0,0-0,0=-6;";
                        if (rOIInfo == null) {
                            C786410Ut5.LJJJI("vendor.qti-ext-enc-roiinfo.rect-payload", "0,0-0,0=-6;", this.LJ);
                            mediaCodec.setParameters(this.LJ);
                            return;
                        }
                        int centerPosX = rOIInfo.getCenterPosX() - (rOIInfo.getRoiWidth() / 2);
                        int roiWidth = rOIInfo.getRoiWidth() + centerPosX;
                        int centerPosY = rOIInfo.getCenterPosY() - (rOIInfo.getRoiHeight() / 2);
                        int roiHeight = rOIInfo.getRoiHeight() + centerPosY;
                        if (this.LIZJ && (stretchedRoi = rOIInfo.getStretchedRoi()) != null && stretchedRoi.length >= 4) {
                            centerPosX = stretchedRoi[0];
                            centerPosY = stretchedRoi[1];
                            roiWidth = stretchedRoi[2];
                            roiHeight = stretchedRoi[3];
                        }
                        if (centerPosX + roiWidth + centerPosY + roiHeight > 0) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(Math.max(0, centerPosY));
                            sbLIZ.append(",");
                            sbLIZ.append(Math.max(0, centerPosX));
                            sbLIZ.append("-");
                            sbLIZ.append(Math.min(height - 1, roiHeight));
                            sbLIZ.append(",");
                            sbLIZ.append(Math.min(width - 1, roiWidth));
                            sbLIZ.append("=");
                            sbLIZ.append(this.LIZIZ);
                            sbLIZ.append(";");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        C786410Ut5.LJJJI("vendor.qti-ext-enc-roiinfo.rect-payload", strLIZIZ, this.LJ);
                        mediaCodec.setParameters(this.LJ);
                    }
                }
            };
        }
        if (bundle.getInt("roi_on") != 1) {
            tEBundle.setBundle("roi_settings", bundle);
            return null;
        }
        return abstractC1282440jTe;
    }
}
