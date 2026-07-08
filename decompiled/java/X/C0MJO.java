package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProSchemeModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MJO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MJO {
    public static final void LIZ(C0LAB c0lab, VideoPublishEditModelKt videoPublishEditModelKt) {
        EditorProSchemeModel editorProSchemeModel = videoPublishEditModelKt.getCreativeModel().editorProSchemeModel;
        if (C123100dR.LIZ(C537970L7z.LIZ(editorProSchemeModel))) {
            c0lab.LJ("ep_anchor_type", C537970L7z.LIZ(editorProSchemeModel));
        }
        if (!editorProSchemeModel.isDeepLink && !Intrinsics.LJFF("ep_deeplink", C1403540mcy.LJI(videoPublishEditModelKt, null))) {
            if (!c0lab.LIZ.containsKey("is_from_external_link")) {
                c0lab.LIZ(0, "is_from_external_link");
            }
        } else {
            String enterFrom = editorProSchemeModel.enterFrom;
            if (enterFrom == null) {
                enterFrom = videoPublishEditModelKt.getEnterFrom();
            }
            c0lab.LJ("external_link_source", enterFrom);
            c0lab.LIZ(1, "is_from_external_link");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.ss.android.ugc.aweme.creative.model.CreativeModel r9, X.C0LAB r10) {
        /*
            r8 = 0
            if (r9 == 0) goto L2f
            com.ss.android.ugc.aweme.creative.model.LandingModel r7 = r9.landingModel
            if (r7 == 0) goto L30
            java.lang.Boolean r6 = r7.isFromExternalLink
            java.lang.String r0 = r7.landingTab
        Lb:
            java.lang.String r1 = "editor_tab"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r5 = 1
            java.lang.String r4 = "external_link_source"
            r3 = 0
            java.lang.String r2 = "is_from_external_link"
            if (r0 == 0) goto L3a
            if (r6 == 0) goto L3a
            boolean r0 = r6.booleanValue()
            java.lang.String r1 = ""
            if (r0 == 0) goto L33
            r10.LIZ(r5, r2)
            java.lang.String r0 = r7.dataComeFrom
            if (r0 == 0) goto L2b
            r1 = r0
        L2b:
            r10.LJ(r4, r1)
            return
        L2f:
            r7 = r8
        L30:
            r6 = r8
            r0 = r8
            goto Lb
        L33:
            r10.LIZ(r3, r2)
            r10.LJ(r4, r1)
            return
        L3a:
            if (r7 == 0) goto L3e
            java.lang.String r8 = r7.landingTab
        L3e:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r8)
            if (r0 == 0) goto L55
            r10.LIZ(r5, r2)
            java.lang.String r1 = r7.dataComeFrom
            if (r1 == 0) goto L54
            int r0 = r1.length()
            if (r0 == 0) goto L54
            r10.LJ(r4, r1)
        L54:
            return
        L55:
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.LIZ
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto L54
            r10.LIZ(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MJO.LIZIZ(com.ss.android.ugc.aweme.creative.model.CreativeModel, X.0LAB):void");
    }
}
