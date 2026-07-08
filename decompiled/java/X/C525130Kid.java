package X;

import com.ss.android.ugc.aweme.creative.model.AutoPickModel;

/* JADX INFO: renamed from: X.0Kid, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525130Kid {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0011 A[PHI: r1
      0x0011: PHI (r1v10 java.lang.String) = (r1v0 java.lang.String), (r1v11 java.lang.String) binds: [B:7:0x0009, B:9:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000b A[PHI: r1
      0x000b: PHI (r1v11 java.lang.String) = (r1v0 java.lang.String), (r1v12 java.lang.String) binds: [B:7:0x0009, B:5:0x0006] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(java.lang.String r5, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6, java.lang.String r7) {
        /*
            java.lang.String r4 = ""
            if (r6 == 0) goto L8
            java.lang.String r1 = r6.shootWay
            if (r1 != 0) goto Lb
        L8:
            r1 = r4
            if (r6 == 0) goto L11
        Lb:
            java.lang.String r0 = r6.getCreationId()
            if (r0 != 0) goto L12
        L11:
            r0 = r4
        L12:
            X.0LAB r3 = X.C534690Ky3.LIZ(r1, r6, r0)
            java.lang.String r0 = "enter_from"
            r3.LJ(r0, r5)
            int r0 = r7.length()
            if (r0 <= 0) goto L26
            java.lang.String r0 = "pick_id"
            r3.LJ(r0, r7)
        L26:
            if (r6 == 0) goto L5a
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r6.creativeModel
            if (r0 == 0) goto L5a
            com.ss.android.ugc.aweme.creative.model.AutoPickModel r2 = r0.autoPickModel
            if (r2 == 0) goto L5a
            boolean r1 = r2.isFirstTry
            java.lang.String r0 = "is_first_try"
            r3.LIZ(r1, r0)
            boolean r1 = r2.isRepick
            java.lang.String r0 = "is_repick"
            r3.LIZ(r1, r0)
            java.lang.String r1 = "pick_type"
            java.lang.String r0 = r2.pickType
            r3.LJ(r1, r0)
            java.lang.String r0 = r2.themeName
            if (r0 == 0) goto L4a
            r4 = r0
        L4a:
            java.lang.String r0 = "pick_theme"
            r3.LJ(r0, r4)
            java.util.List<com.ss.android.ugc.aweme.creative.model.AutoPickMediaModel> r0 = r2.mediaList
            int r1 = r0.size()
            java.lang.String r0 = "pick_material_cnt"
            r3.LIZ(r1, r0)
        L5a:
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.LIZ
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[emit] enter_from="
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = " creation_id="
            r2.append(r0)
            r1 = 0
            if (r6 == 0) goto L98
            java.lang.String r0 = r6.getCreationId()
        L74:
            r2.append(r0)
            java.lang.String r0 = " shoot_way="
            r2.append(r0)
            if (r6 == 0) goto L80
            java.lang.String r1 = r6.shootWay
        L80:
            r2.append(r1)
            java.lang.String r0 = " params="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r2)
            java.lang.String r0 = "ttcrt_click_ai_autocut"
            X.C201955140j.LIZIZ(r0, r1)
            X.C20684815ws.LJIILLIIL(r0, r3)
            return
        L98:
            r0 = r1
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C525130Kid.LIZIZ(java.lang.String, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.lang.String):void");
    }

    public static final void LIZ(C0LAB c0lab, AutoPickModel autoPickModel, String str, int i) {
        String str2 = autoPickModel.pickId;
        if (str2.length() > 0) {
            c0lab.LJ("pick_id", str2);
        }
        c0lab.LJ("aipick_enter_from", str);
        c0lab.LIZ(autoPickModel.isFirstTry ? 1 : 0, "is_first_try");
        c0lab.LIZ(autoPickModel.isRepick ? 1 : 0, "is_repick");
        c0lab.LJ("pick_type", autoPickModel.pickType);
        String str3 = autoPickModel.themeName;
        if (str3 == null) {
            str3 = "";
        }
        c0lab.LJ("pick_theme", str3);
        c0lab.LIZ(i, "pick_material_cnt");
    }
}
