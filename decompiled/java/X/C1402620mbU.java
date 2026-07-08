package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mbU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402620mbU {
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098 A[EDGE_INSN: B:47:0x0098->B:37:0x0098 BREAK  A[LOOP:1: B:31:0x0085->B:49:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7, X.C0LAB r8) {
        /*
            java.lang.String r1 = r7.mShootWay
            java.lang.String r0 = "post_another"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 == 0) goto Lb0
            com.ss.android.ugc.aweme.creative.model.CreativeFlowData r0 = r7.getCreativeFlowData()
            java.util.HashMap r0 = r0.getExtraLogParams()
            java.lang.String r4 = "is_use_post_again_music"
            r3 = 0
            if (r0 == 0) goto Lb1
            java.lang.Object r2 = r0.get(r4)
            java.lang.String r2 = (java.lang.String) r2
        L1d:
            java.lang.String r1 = r7.getMusicId()
            r5 = 0
            if (r2 == 0) goto L31
            int r0 = r2.length()
            if (r0 == 0) goto L31
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r2)
            r8.LIZ(r0, r4)
        L31:
            com.ss.android.ugc.aweme.creative.model.CreativeFlowData r0 = r7.getCreativeFlowData()
            java.util.HashMap r0 = r0.getExtraLogParams()
            java.lang.String r6 = "is_use_post_again_effect"
            if (r0 == 0) goto L9b
            java.lang.Object r4 = r0.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L9b
            int r0 = r4.length()
            if (r0 == 0) goto L9b
            java.util.ArrayList r0 = r7.getFinalSegments()
            if (r0 == 0) goto L6e
            java.util.Iterator r2 = r0.iterator()
        L55:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension r0 = (com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension) r0
            java.lang.String r0 = r0.getStickerId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 == 0) goto L55
            if (r1 != 0) goto L97
        L6e:
            java.lang.String r2 = r7.getStickers()
            if (r2 == 0) goto L98
            java.lang.String r0 = ","
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 6
            java.util.List r0 = kotlin.text.a0.LJJLIIIJILLIZJL(r2, r1, r5, r0)
            if (r0 == 0) goto L98
            java.util.Iterator r2 = r0.iterator()
        L85:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r1 = r2.next()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r4)
            if (r0 == 0) goto L85
            if (r1 == 0) goto L98
        L97:
            r5 = 1
        L98:
            r8.LIZ(r5, r6)
        L9b:
            com.ss.android.ugc.aweme.creative.model.CreativeFlowData r0 = r7.getCreativeFlowData()
            java.util.HashMap r1 = r0.getExtraLogParams()
            java.lang.String r0 = "post_again_popup_type"
            if (r1 == 0) goto Lad
            java.lang.Object r3 = r1.get(r0)
            java.lang.String r3 = (java.lang.String) r3
        Lad:
            r8.LJ(r0, r3)
        Lb0:
            return
        Lb1:
            r2 = r3
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402620mbU.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0LAB):void");
    }

    public static final void LIZ(ShortVideoContext shortVideoContext, C0LAB c0lab, String str) {
        String str2;
        String str3;
        if (Intrinsics.LJFF("post_another", shortVideoContext.shootWay)) {
            HashMap<String, String> extraLogParams = shortVideoContext.creativeFlowData.getExtraLogParams();
            String str4 = null;
            if (extraLogParams != null) {
                str2 = extraLogParams.get("is_use_post_again_music");
            } else {
                str2 = null;
            }
            String musicId = shortVideoContext.getMusicId();
            if (str2 != null && str2.length() != 0) {
                c0lab.LIZ(Intrinsics.LJFF(musicId, str2) ? 1 : 0, "is_use_post_again_music");
            }
            HashMap<String, String> extraLogParams2 = shortVideoContext.creativeFlowData.getExtraLogParams();
            if (extraLogParams2 != null && (str3 = extraLogParams2.get("is_use_post_again_effect")) != null && str3.length() != 0) {
                c0lab.LIZ(Intrinsics.LJFF(str, str3) ? 1 : 0, "is_use_post_again_effect");
            }
            HashMap<String, String> extraLogParams3 = shortVideoContext.creativeFlowData.getExtraLogParams();
            if (extraLogParams3 != null) {
                str4 = extraLogParams3.get("post_again_popup_type");
            }
            c0lab.LJ("post_again_popup_type", str4);
        }
    }
}
