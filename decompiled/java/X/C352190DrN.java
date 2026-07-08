package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.VEUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DrN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C352190DrN {
    public static final C352190DrN LIZ = new C352190DrN();

    public static boolean LIZJ(NLESegmentVideo nLESegmentVideo) {
        Boolean boolValueOf;
        boolean z;
        NLEResourceNode resource = nLESegmentVideo.getResource();
        if (resource != null) {
            if (resource.getDuration() != 0 && nLESegmentVideo.getDuration() != nLESegmentVideo.getTimeClipEnd() - nLESegmentVideo.getTimeClipStart()) {
                z = false;
            } else {
                z = true;
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        return Intrinsics.LJFF(boolValueOf, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.bytedance.ies.nle.editor_jni.NLEModel r6, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7, X.InterfaceC1364105Vn r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C352090DrD
            if (r0 == 0) goto L35
            r4 = r8
            X.0DrD r4 = (X.C352090DrD) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L35
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L3b
            X.C155000ia.LIZIZ(r1)
        L22:
            return r1
        L23:
            X.C155000ia.LIZIZ(r1)
            X.0DrP r1 = new X.0DrP
            r0 = 0
            r1.<init>(r6, r7, r0)
            r4.LLILLL = r2
            java.lang.Object r1 = X.C2296808zG.LJ(r1, r4)
            if (r1 != r3) goto L22
            return r3
        L35:
            X.0DrD r4 = new X.0DrD
            r4.<init>(r5, r8)
            goto L12
        L3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C352190DrN.LIZIZ(com.bytedance.ies.nle.editor_jni.NLEModel, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.05Vn):java.lang.Object");
    }

    public static String LIZ(long j, long j2, String str, String str2) {
        if (j >= 0 && j2 >= 0 && j < j2) {
            long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
            long j4 = j / j3;
            long j5 = j2 / j3;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append('_');
            sbLIZ.append(j4);
            sbLIZ.append('-');
            sbLIZ.append(j5);
            sbLIZ.append(".wav");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
            EnumC20227914Cv enumC20227914Cv = EnumC20227914Cv.AUDIO_COPYRIGHT_DETECT;
            C0VSJ c0vsjLJIIIZ = pathService.LJIIIZ(enumC20227914Cv, strLIZIZ, false);
            if (c0vsjLJIIIZ.exists()) {
                return c0vsjLJIIIZ.getPath();
            }
            String path = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIIZ(enumC20227914Cv, strLIZIZ, true).getPath();
            if (VEUtils.detachAudioFromVideos(path, new String[]{str}, new long[]{j4}, new long[]{j5}, -1L, -1L, new float[]{1.0f}, 1, 131072, 8000, VEUtils.CompatibleMode.Skip_invalid) != 0) {
                return "";
            }
            return path;
        }
        return str;
    }
}
