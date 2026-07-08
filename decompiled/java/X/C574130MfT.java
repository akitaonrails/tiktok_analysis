package X;

import android.graphics.BitmapFactory;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MfT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574130MfT {
    public static C348390DlF LIZ(C1DOU c1dou, NLEEditor nLEEditor) {
        NLETrack next;
        VEUtils.VEAudioFileInfo audioFileInfo;
        int[] iArr;
        float f;
        NLEResType nLEResType;
        String str;
        boolean z;
        List<VEUtils.VEAudioFileInfo> audioFileInfoForAllTracks;
        boolean z2;
        long jLongValue;
        float fFloatValue;
        long jLongValue2;
        float fFloatValue2;
        String str2;
        ROTATE_DEGREE rotate_degree;
        nLEEditor.getModel().clearTrack();
        C348390DlF c348390DlF = new C348390DlF();
        NLETrack nLETrack = new NLETrack();
        nLETrack.setExtra("__DEFAULT__", "__DEFAULT__");
        nLETrack.setLayer(0);
        nLETrack.setMainTrack(true);
        String[] strArr = c1dou.LIZ;
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            int i2 = 0;
            long j = 0;
            while (i < length) {
                String str3 = strArr[i];
                int i3 = i2 + 1;
                String[] strArr2 = c1dou.LJ;
                if (strArr2 != null) {
                    str = strArr2[i2];
                } else {
                    str = null;
                }
                C574140MfU c574140MfU = new C574140MfU();
                if ((str == null || str.length() == 0) && (Intrinsics.LJFF(c1dou.LJFF, Boolean.FALSE) || (audioFileInfoForAllTracks = VEUtils.getAudioFileInfoForAllTracks(str3)) == null || audioFileInfoForAllTracks.isEmpty())) {
                    z = false;
                } else {
                    z = true;
                }
                c574140MfU.LJIIIIZZ = z;
                if (str != null && str.length() != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                c574140MfU.LJIIIZ = !z2;
                if (C2471909mP.LJJIII(str3, true, 4)) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(str3, options);
                    c574140MfU.LJII = NLEResType.IMAGE;
                    c574140MfU.LJIIJ = Integer.valueOf(options.outWidth);
                    c574140MfU.LJIIJJI = Integer.valueOf(options.outHeight);
                    c574140MfU.LJIIL = 3000L;
                    c574140MfU.LJIILIIL = str3;
                } else {
                    c574140MfU.LJII = NLEResType.VIDEO;
                    c574140MfU.LJIILIIL = str3;
                    VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str3);
                    if (videoFileInfo != null) {
                        c574140MfU.LJIIL = Long.valueOf(videoFileInfo.duration);
                        c574140MfU.LJIIJ = Integer.valueOf(videoFileInfo.width);
                        c574140MfU.LJIIJJI = Integer.valueOf(videoFileInfo.height);
                        c574140MfU.LIZIZ = 0L;
                        c574140MfU.LIZJ = Long.valueOf(videoFileInfo.duration);
                    }
                }
                if (c1dou.LIZIZ != null) {
                    c574140MfU.LIZIZ = Long.valueOf(r0[i2]);
                }
                if (c1dou.LIZJ != null) {
                    c574140MfU.LIZJ = Long.valueOf(r0[i2]);
                }
                c574140MfU.LIZLLL = j;
                Long l = c574140MfU.LIZJ;
                long jLongValue3 = -1;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = -1;
                }
                Long l2 = c574140MfU.LIZIZ;
                if (l2 != null) {
                    jLongValue3 = l2.longValue();
                }
                long jLongValue4 = jLongValue - jLongValue3;
                if (jLongValue4 <= 0) {
                    Long l3 = c574140MfU.LJIIL;
                    if (l3 != null) {
                        jLongValue4 = l3.longValue();
                    } else {
                        jLongValue4 = 0;
                    }
                }
                c574140MfU.LJIIL = Long.valueOf(jLongValue4);
                ROTATE_DEGREE[] rotate_degreeArr = c1dou.LJIIIZ;
                if (rotate_degreeArr != null && (rotate_degree = rotate_degreeArr[i2]) != null) {
                    c574140MfU.LJFF = Float.valueOf(C1776260wK8.LIZIZ(rotate_degree));
                }
                float[] fArr = c1dou.LJIIIIZZ;
                if (fArr != null) {
                    c574140MfU.LJI = Float.valueOf(fArr[i2]);
                }
                float f2 = jLongValue4;
                Float f3 = c574140MfU.LJI;
                if (f3 != null) {
                    fFloatValue = f3.floatValue();
                } else {
                    fFloatValue = 1.0f;
                }
                j += (long) (f2 / fFloatValue);
                Long l4 = c574140MfU.LJIIL;
                if (l4 != null) {
                    jLongValue2 = l4.longValue();
                } else {
                    jLongValue2 = 0;
                }
                float f4 = jLongValue2;
                Float f5 = c574140MfU.LJI;
                if (f5 != null) {
                    fFloatValue2 = f5.floatValue();
                } else {
                    fFloatValue2 = 1.0f;
                }
                c574140MfU.LJ = ((long) (f4 / fFloatValue2)) + c574140MfU.LIZLLL;
                String[] strArr3 = c1dou.LIZLLL;
                if (strArr3 != null && (str2 = strArr3[i2]) != null) {
                    c574140MfU.LJIILJJIL = str2;
                }
                c348390DlF.LIZ.add(c574140MfU);
                i++;
                i2 = i3;
            }
        }
        for (C574140MfU c574140MfU2 : new C348340DlA(c348390DlF).LIZIZ.LIZ) {
            NLETrackSlot nLETrackSlot = new NLETrackSlot();
            nLETrackSlot.setStartTime(c574140MfU2.LIZLLL * 1000);
            nLETrackSlot.setEndTime(c574140MfU2.LJ * 1000);
            Float f6 = c574140MfU2.LJFF;
            if (f6 != null) {
                nLETrackSlot.setRotation(f6.floatValue());
            }
            String str4 = c574140MfU2.LJIILJJIL;
            if (str4 != null) {
                NLESegmentTransition nLESegmentTransition = new NLESegmentTransition();
                NLEResourceNode nLEResourceNode = new NLEResourceNode();
                nLEResourceNode.setResourceFile(str4);
                nLESegmentTransition.setEffectSDKTransition(nLEResourceNode);
                nLETrackSlot.setEndTransition(nLESegmentTransition);
            }
            NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
            NLEResourceAV nLEResourceAV = new NLEResourceAV();
            if (c574140MfU2.LJIIJ != null) {
                nLEResourceAV.setWidth(r0.intValue());
            }
            if (c574140MfU2.LJIIJJI != null) {
                nLEResourceAV.setHeight(r0.intValue());
            }
            Long l5 = c574140MfU2.LJIIL;
            if (l5 != null) {
                nLEResourceAV.setDuration(l5.longValue() * 1000);
            }
            String str5 = c574140MfU2.LJIILIIL;
            if (str5 != null) {
                nLEResourceAV.setResourceFile(str5);
                if (C2286708xd.LJIILL(str5)) {
                    nLEResType = NLEResType.IMAGE;
                } else {
                    nLEResType = NLEResType.VIDEO;
                }
                nLEResourceAV.setResourceType(nLEResType);
            }
            nLEResourceAV.setHasAudio(c574140MfU2.LJIIIIZZ);
            if (nLEResourceAV.getHasAudio()) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            nLESegmentVideo.setVolume(f);
            nLESegmentVideo.setAVFile(nLEResourceAV);
            Float f7 = c574140MfU2.LJI;
            if (f7 != null) {
                nLESegmentVideo.setSpeed(f7.floatValue());
            }
            Long l6 = c574140MfU2.LIZIZ;
            if (l6 != null) {
                nLESegmentVideo.setTimeClipStart(l6.longValue() * 1000);
            }
            Long l7 = c574140MfU2.LIZJ;
            if (l7 != null) {
                nLESegmentVideo.setTimeClipEnd(l7.longValue() * 1000);
            }
            nLETrackSlot.setMainSegment(nLESegmentVideo);
            c574140MfU2.LIZ = nLETrackSlot.getName();
            nLETrackSlot.setExtra("has_origin_audio_slot", String.valueOf(c574140MfU2.LJIIIZ));
            nLETrack.addSlot(nLETrackSlot);
        }
        nLEEditor.getModel().addTrack(nLETrack);
        String[] strArr4 = c1dou.LJ;
        if (strArr4 != null) {
            int length2 = strArr4.length;
            int i4 = 0;
            int i5 = 0;
            long j2 = 0;
            while (i4 < length2) {
                String str6 = strArr4[i4];
                int i6 = i5 + 1;
                C347650Dk3 c347650Dk3 = new C347650Dk3(EnumC355960DxS.ORIGIN);
                c347650Dk3.LIZIZ = str6;
                if (VEUtils.getAudioFileInfo(str6) != null) {
                    c347650Dk3.LIZLLL = 0L;
                    c347650Dk3.LJ = r11.duration;
                }
                int[] iArr2 = c1dou.LJI;
                if (iArr2 != null) {
                    c347650Dk3.LIZLLL = iArr2[i5];
                }
                if (c1dou.LJII != null) {
                    c347650Dk3.LJ = r0[i5];
                }
                if ((iArr2 == null || C13LQ.LJJIIJ(i5, iArr2) == null || (iArr = c1dou.LJII) == null || C13LQ.LJJIIJ(i5, iArr) == null) && (audioFileInfo = VEUtils.getAudioFileInfo(str6)) != null) {
                    c347650Dk3.LIZLLL = 0L;
                    c347650Dk3.LJ = audioFileInfo.duration;
                }
                c347650Dk3.LJFF = j2;
                j2 += c347650Dk3.LJ - c347650Dk3.LIZLLL;
                new C347720DkA(c347650Dk3, false).LIZJ(nLEEditor);
                i4++;
                i5 = i6;
            }
        }
        Iterator<NLETrack> it2 = nLEEditor.getModel().getTracks().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(C348350DlB.LIZ(next), "ORIGIN")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack2 = next;
        if (nLETrack2 != null) {
            nLETrack2.setExtra("__DEFAULT__", "__DEFAULT__");
        }
        return c348390DlF;
    }
}
