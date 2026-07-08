package X;

import android.graphics.BitmapFactory;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackAlgorithm;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.ROTATE_DEGREE;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MbV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571670MbV {
    public static final /* synthetic */ int LIZ = 0;

    public static NLEResourceAV LIZIZ(String str) throws Throwable {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        C2471909mP.LJ(str, options);
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setResourceType(NLEResType.IMAGE);
        nLEResourceAV.setWidth(options.outWidth);
        nLEResourceAV.setHeight(options.outHeight);
        nLEResourceAV.setDuration(((long) LivePreCreateNextRoomPlayer.ENABLE) * 1000);
        nLEResourceAV.setResourceFile(str);
        return nLEResourceAV;
    }

    public static NLEResourceAV LIZJ(String str) {
        try {
            C13W2 c13w2LIZIZ = C13W4.LIZIZ(str);
            NLEResourceAV nLEResourceAV = new NLEResourceAV();
            nLEResourceAV.setResourceType(NLEResType.VIDEO);
            int i = c13w2LIZIZ.LJII;
            if (i == 90 || i == 270) {
                nLEResourceAV.setWidth(c13w2LIZIZ.LIZLLL);
                nLEResourceAV.setHeight(c13w2LIZIZ.LIZJ);
            } else {
                nLEResourceAV.setWidth(c13w2LIZIZ.LIZJ);
                nLEResourceAV.setHeight(c13w2LIZIZ.LIZLLL);
            }
            nLEResourceAV.setDuration(((long) c13w2LIZIZ.LJ) * 1000);
            nLEResourceAV.setResourceFile(str);
            return nLEResourceAV;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            return null;
        }
    }

    public static void LIZ(AbstractC574600MgE abstractC574600MgE, NLEEditor nLEEditor) {
        float f;
        NLETrack nLETrack;
        long j;
        String str;
        float f2;
        ROTATE_DEGREE rotate_degree;
        long j2 = 1000;
        long j3 = 0;
        if (abstractC574600MgE instanceof C1DOU) {
            C1DOU c1dou = (C1DOU) abstractC574600MgE;
            NLEModel model = nLEEditor.getModel();
            if (model != null) {
                model.clearTrack();
                NLETrack nLETrack2 = new NLETrack();
                nLETrack2.setExtra("__DEFAULT__", "__DEFAULT__");
                nLETrack2.setLayer(0);
                nLETrack2.setMainTrack(true);
                String[] strArr = c1dou.LIZ;
                if (strArr != null) {
                    int length = strArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        String str2 = strArr[i];
                        int i3 = i2 + 1;
                        NLETrackSlot nLETrackSlot = new NLETrackSlot();
                        nLETrackSlot.setStartTime(j3);
                        ROTATE_DEGREE[] rotate_degreeArr = c1dou.LJIIIZ;
                        if (rotate_degreeArr != null && (rotate_degree = rotate_degreeArr[i2]) != null) {
                            nLETrackSlot.setRotation(C1776260wK8.LIZIZ(rotate_degree));
                        }
                        NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                        if (C2286708xd.LJIILL(str2)) {
                            nLESegmentVideo.setAVFile(LIZIZ(str2));
                        } else {
                            nLESegmentVideo.setAVFile(LIZJ(str2));
                        }
                        float[] fArr = c1dou.LJIIIIZZ;
                        if (fArr != null) {
                            nLESegmentVideo.setSpeed(fArr[i2]);
                        }
                        int[] iArr = c1dou.LIZIZ;
                        if (iArr != null) {
                            nLESegmentVideo.setTimeClipStart(((long) iArr[i2]) * j2);
                        }
                        int[] iArr2 = c1dou.LIZJ;
                        if (iArr2 != null) {
                            nLESegmentVideo.setTimeClipEnd(((long) iArr2[i2]) * j2);
                        }
                        if (i2 == 0) {
                            EnumC1464490oDH enumC1464490oDH = c1dou.LJIIJ;
                            if (nLESegmentVideo.getAVFile().getWidth() != j3 && nLESegmentVideo.getAVFile().getHeight() != j3) {
                                long width = nLESegmentVideo.getAVFile().getWidth();
                                long height = nLESegmentVideo.getAVFile().getHeight();
                                if (width != j3 && height != j3) {
                                    int i4 = C1778400wNa.LJIIJJI[enumC1464490oDH.ordinal()];
                                    if (i4 != 1) {
                                        if (i4 != 2) {
                                            if (i4 != 3) {
                                                if (i4 != 4) {
                                                    if (i4 != 5) {
                                                        f2 = width / height;
                                                    } else {
                                                        f2 = 0.5625f;
                                                    }
                                                } else {
                                                    f2 = 1.7777778f;
                                                }
                                            } else {
                                                f2 = 0.75f;
                                            }
                                        } else {
                                            f2 = 1.3333334f;
                                        }
                                    } else {
                                        f2 = 1.0f;
                                    }
                                    model.setCanvasRatio(f2);
                                } else {
                                    throw new IllegalArgumentException("vWidth or vHeight can not be null");
                                }
                            } else {
                                model.setCanvasRatio(0.5625f);
                            }
                        }
                        nLETrackSlot.setMainSegment(nLESegmentVideo);
                        String[] strArr2 = c1dou.LIZLLL;
                        if (strArr2 != null && (str = strArr2[i2]) != null) {
                            NLESegmentTransition nLESegmentTransition = new NLESegmentTransition();
                            NLEResourceNode nLEResourceNode = new NLEResourceNode();
                            nLEResourceNode.setResourceFile(str);
                            nLESegmentTransition.setEffectSDKTransition(nLEResourceNode);
                            nLETrackSlot.setEndTransition(nLESegmentTransition);
                        }
                        nLETrack2.addSlot(nLETrackSlot);
                        i++;
                        i2 = i3;
                        j2 = 1000;
                        j3 = 0;
                    }
                }
                if (c1dou.LJ != null) {
                    nLETrack = new NLETrack();
                    nLETrack.setExtra("__DEFAULT__", "__DEFAULT__");
                    String[] strArr3 = c1dou.LJ;
                    if (strArr3 != null) {
                        int length2 = strArr3.length;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < length2) {
                            String str3 = strArr3[i5];
                            int i7 = i6 + 1;
                            NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
                            NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
                            NLEResourceAV nLEResourceAV = new NLEResourceAV();
                            nLEResourceAV.setResourceType(NLEResType.AUDIO);
                            nLEResourceAV.setResourceFile(str3);
                            nLESegmentAudio.setAVFile(nLEResourceAV);
                            int[] iArr3 = c1dou.LJI;
                            if (iArr3 != null) {
                                j = 1000;
                                nLESegmentAudio.setTimeClipStart(((long) iArr3[i6]) * 1000);
                            } else {
                                j = 1000;
                            }
                            int[] iArr4 = c1dou.LJII;
                            if (iArr4 != null) {
                                nLESegmentAudio.setTimeClipEnd(((long) iArr4[i6]) * j);
                            }
                            nLETrackSlot2.setMainSegment(nLESegmentAudio);
                            nLETrack.addSlot(nLETrackSlot2);
                            i5++;
                            i6 = i7;
                        }
                    }
                } else {
                    nLETrack = null;
                }
                model.addTrack(nLETrack2);
                if (nLETrack != null) {
                    model.addTrack(nLETrack);
                }
                nLEEditor.commit();
                return;
            }
            return;
        }
        if (abstractC574600MgE instanceof C574520Mg6) {
            C574520Mg6 c574520Mg6 = (C574520Mg6) abstractC574600MgE;
            NLEModel model2 = nLEEditor.getModel();
            String[] strArr4 = c574520Mg6.LIZ;
            EnumC1464490oDH enumC1464490oDH2 = c574520Mg6.LIZIZ;
            Iterator<NLETrack> it2 = model2.getTracks().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                NLETrack next = it2.next();
                NLETrack nLETrack3 = next;
                if (nLETrack3.getMainTrack() && Intrinsics.LJFF(nLETrack3.getExtra("__Algorithm__"), "__Algorithm__")) {
                    if (next != null) {
                        throw new RuntimeException("addAlgorithm failed");
                    }
                }
            }
            NLETrackAlgorithm nLETrackAlgorithm = new NLETrackAlgorithm();
            nLETrackAlgorithm.setExtra("__Algorithm__", "__Algorithm__");
            nLETrackAlgorithm.setMainTrack(true);
            int length3 = strArr4.length;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length3) {
                String str4 = strArr4[i8];
                int i10 = i9 + 1;
                NLETrackSlot nLETrackSlot3 = new NLETrackSlot();
                NLESegmentVideo nLESegmentVideo2 = new NLESegmentVideo();
                NLEResourceAV nLEResourceAV2 = new NLEResourceAV();
                nLEResourceAV2.setResourceFile(str4);
                nLETrackSlot3.setStartTime(0L);
                nLETrackSlot3.setEndTime(0L);
                nLESegmentVideo2.setAVFile(nLEResourceAV2);
                nLETrackSlot3.setStartTime(((long) i9) * 1000);
                nLETrackSlot3.setEndTime(((long) i10) * 1000);
                nLETrackSlot3.setMainSegment(nLESegmentVideo2);
                nLETrackAlgorithm.addSlot(nLETrackSlot3);
                int i11 = C1464290oCx.LIZ[enumC1464490oDH2.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 != 5) {
                                    f = -1.0f;
                                } else {
                                    f = 0.5625f;
                                }
                            } else {
                                f = 1.7777778f;
                            }
                        } else {
                            f = 0.75f;
                        }
                    } else {
                        f = 1.3333334f;
                    }
                } else {
                    f = 1.0f;
                }
                nLETrackAlgorithm.setVideoRatio(f);
                i8++;
                i9 = i10;
            }
            model2.addTrack(nLETrackAlgorithm);
            return;
        }
        if (!(abstractC574600MgE instanceof C571750Mbd) && !(abstractC574600MgE instanceof C578900MnA) && !(abstractC574600MgE instanceof C2255111DOj)) {
            if (!(abstractC574600MgE instanceof C2255091DOh)) {
                if (!(abstractC574600MgE instanceof C571680MbW) && (abstractC574600MgE instanceof C1DOW)) {
                    throw null;
                }
                return;
            }
            nLEEditor.getModel();
            throw new RuntimeException("addMV failed");
        }
    }
}
