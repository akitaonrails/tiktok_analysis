package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0EsV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378370EsV {
    public static final C378370EsV LIZ = new C378370EsV();

    public static void LIZLLL(AbstractC383190F0r abstractC383190F0r, int i) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("senerio", "create_video");
        c2344009Gk.LJIIIIZZ("action", abstractC383190F0r.LIZ);
        c2344009Gk.LIZJ(i, "ref_image_num");
        C20684815ws.LJIILLIIL("ai_create_prompt_guide", c2344009Gk.LIZ);
    }

    public static void LJIIIIZZ(AbstractC359300E6u abstractC359300E6u, C0F04 c0f04) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_source", String.valueOf(abstractC359300E6u));
        c2344009Gk.LJIIIIZZ("click_button_name", c0f04.LIZ);
        C20684815ws.LJIILLIIL("click_text_to_image_panel", c2344009Gk.LIZ);
    }

    public static void LJIIIZ(AbstractC359300E6u abstractC359300E6u, C0F04 c0f04) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_source", String.valueOf(abstractC359300E6u));
        c2344009Gk.LJIIIIZZ("click_button_name", c0f04.LIZ);
        C20684815ws.LJIILLIIL("click_text_to_video_panel", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014 A[PHI: r1
      0x0014: PHI (r1v3 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:7:0x000b, B:9:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0017 A[PHI: r1 r2
      0x0017: PHI (r1v1 java.lang.String) = (r1v3 java.lang.String), (r1v4 java.lang.String) binds: [B:11:0x0015, B:9:0x0012] A[DONT_GENERATE, DONT_INLINE]
      0x0017: PHI (r2v0 java.lang.String) = (r2v2 java.lang.String), (r2v3 java.lang.String) binds: [B:11:0x0015, B:9:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000d A[PHI: r1
      0x000d: PHI (r1v4 java.lang.String) = (r1v0 java.lang.String), (r1v5 java.lang.String) binds: [B:7:0x000b, B:5:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8, X.AbstractC359300E6u r9, X.AbstractC359260E6q r10) {
        /*
            java.lang.String r3 = ""
            if (r8 == 0) goto La
            java.lang.String r1 = r8.getCreationId()
            if (r1 != 0) goto Ld
        La:
            r1 = r3
            if (r8 == 0) goto L14
        Ld:
            r0 = 0
            java.lang.String r2 = X.C1403540mcy.LJI(r8, r0)
            if (r2 != 0) goto L17
        L14:
            r2 = r3
            if (r8 == 0) goto L1b
        L17:
            java.lang.String r3 = X.C1428470nHB.LJIILIIL(r8)
        L1b:
            X.0EsX r4 = X.C378390EsX.LIZIZ
            r6 = 0
            X.0E6w r8 = X.EnumC359320E6w.AI_CREATE
            r7 = r10
            r5 = r9
            LJ(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378370EsV.LJII(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0E6u, X.0E6q):void");
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, AbstractC359300E6u abstractC359300E6u, AbstractC359260E6q abstractC359260E6q, boolean z, EnumC359320E6w enumC359320E6w) {
        C378400EsY c378400EsY = C378400EsY.LIZIZ;
        String creationId = videoPublishEditModel.getCreationId();
        String str = "";
        if (creationId == null) {
            creationId = "";
        }
        String strLJI = C1403540mcy.LJI(videoPublishEditModel, null);
        if (strLJI != null) {
            str = strLJI;
        }
        LIZJ(creationId, str, C1428470nHB.LJIILIIL(videoPublishEditModel), c378400EsY, abstractC359300E6u, z, abstractC359260E6q, enumC359320E6w);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014 A[PHI: r1
      0x0014: PHI (r1v3 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:7:0x000b, B:9:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0017 A[PHI: r1 r2
      0x0017: PHI (r1v1 java.lang.String) = (r1v3 java.lang.String), (r1v4 java.lang.String) binds: [B:11:0x0015, B:9:0x0012] A[DONT_GENERATE, DONT_INLINE]
      0x0017: PHI (r2v0 java.lang.String) = (r2v2 java.lang.String), (r2v3 java.lang.String) binds: [B:11:0x0015, B:9:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000d A[PHI: r1
      0x000d: PHI (r1v4 java.lang.String) = (r1v0 java.lang.String), (r1v5 java.lang.String) binds: [B:7:0x000b, B:5:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8, X.AbstractC359300E6u r9, X.AbstractC359260E6q r10, boolean r11, X.EnumC359320E6w r12) {
        /*
            java.lang.String r3 = ""
            if (r8 == 0) goto La
            java.lang.String r1 = r8.getCreationId()
            if (r1 != 0) goto Ld
        La:
            r1 = r3
            if (r8 == 0) goto L14
        Ld:
            r0 = 0
            java.lang.String r2 = X.C1403540mcy.LJI(r8, r0)
            if (r2 != 0) goto L17
        L14:
            r2 = r3
            if (r8 == 0) goto L1b
        L17:
            java.lang.String r3 = X.C1428470nHB.LJIILIIL(r8)
        L1b:
            X.0EsY r4 = X.C378400EsY.LIZIZ
            r8 = r12
            r6 = r11
            r7 = r10
            r5 = r9
            LJ(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378370EsV.LJFF(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0E6u, X.0E6q, boolean, X.0E6w):void");
    }

    public static void LIZJ(String str, String str2, String str3, AbstractC378380EsW abstractC378380EsW, AbstractC359300E6u abstractC359300E6u, boolean z, AbstractC359260E6q abstractC359260E6q, EnumC359320E6w enumC359320E6w) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", str);
        c2344009Gk.LJIIIIZZ("shoot_way", str2);
        c2344009Gk.LJIIIIZZ("content_source", str3);
        c2344009Gk.LJIIIIZZ("enter_from", abstractC378380EsW.LIZ);
        c2344009Gk.LJIIIIZZ("click_from", abstractC359300E6u.LIZ);
        c2344009Gk.LJIIIIZZ("button_name", abstractC359260E6q.LIZ);
        c2344009Gk.LJIIIIZZ("is_from_pip", String.valueOf(z));
        c2344009Gk.LJIIIIZZ("scenerio", enumC359320E6w.getScenerio());
        C20684815ws.LJIILLIIL("ai_create_entrance_show", c2344009Gk.LIZ);
    }

    public static void LJ(String str, String str2, String str3, AbstractC378380EsW abstractC378380EsW, AbstractC359300E6u abstractC359300E6u, boolean z, AbstractC359260E6q abstractC359260E6q, EnumC359320E6w enumC359320E6w) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", str);
        c2344009Gk.LJIIIIZZ("shoot_way", str2);
        c2344009Gk.LJIIIIZZ("content_source", str3);
        c2344009Gk.LJIIIIZZ("enter_from", abstractC378380EsW.LIZ);
        c2344009Gk.LJIIIIZZ("click_from", abstractC359300E6u.LIZ);
        c2344009Gk.LJIIIIZZ("button_name", abstractC359260E6q.LIZ);
        c2344009Gk.LJIIIIZZ("is_from_pip", String.valueOf(z));
        c2344009Gk.LJIIIIZZ("scenerio", enumC359320E6w.getScenerio());
        C20684815ws.LJIILLIIL("click_ai_create_button", c2344009Gk.LIZ);
    }

    public static void LIZ(String str, int i, int i2, int i3, String str2, boolean z, Integer num, String str3, long j, long j2) {
        String string;
        if (!((Boolean) C284580BDk.LIZ.getValue()).booleanValue()) {
            return;
        }
        int i4 = !z ? 1 : 0;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("task_type", str);
        c2344009Gk.LJIIIIZZ("ref_image_num", String.valueOf(i));
        c2344009Gk.LJIIIIZZ("quota_total", String.valueOf(i2));
        c2344009Gk.LJIIIIZZ("quota_remain", String.valueOf(i3));
        str2.toString();
        c2344009Gk.LJIIIIZZ("model_req_key", str2);
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i4));
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        c2344009Gk.LJIIIIZZ("error_code", string);
        c2344009Gk.LJIIIIZZ("error_domain", str3);
        c2344009Gk.LJIIIIZZ("duration_total", String.valueOf(j));
        c2344009Gk.LJIIIIZZ("duration_upload", String.valueOf(j2));
        C20684815ws.LJIILLIIL("generate_ai_create", c2344009Gk.LIZ);
    }
}
