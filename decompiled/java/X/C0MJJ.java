package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MJJ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MJJ {
    public static final C0MJJ LIZ = new C0MJJ();

    public static void LIZ(String str) {
        String value = C0L9N.AI_AVATAR_SHOOT_CONFIRM_PAGE.getValue();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(C0MJK.ACTION_TYPE.getValue(), str);
        C20684815ws.LJIILLIIL(value, c2344009Gk.LIZ);
    }

    public static void LIZJ(String str, String str2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("content_type", "photo");
        c0lab.LJ("enter_method", str);
        c0lab.LIZ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
        C1448620nng.LIZ(new C0MJL(c0lab));
        if (C298260Bma.LIZ()) {
            ((IRecordMobService) ServiceManager.get().getService(IRecordMobService.class)).LIZIZ(new C1449410nox("", "ai_avatar", str2, null, null, null, null, null, 248), c0lab, null);
            return;
        }
        c0lab.LJ("shoot_way", "ai_avatar");
        c0lab.LJ("enter_from", str2);
        C20684815ws.LJIILLIIL("shoot", c0lab.LIZ);
    }

    public static void LIZLLL(String str, String str2) {
        String value = C0L9N.UPLOAD_CONFIRM_POP_UP.getValue();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(C0MJK.ACTION_TYPE.getValue(), str);
        c2344009Gk.LJIIIIZZ(C0MJK.AIGC_TYPE.getValue(), str2);
        C20684815ws.LJIILLIIL(value, c2344009Gk.LIZ);
    }

    public static void LIZIZ(C2344009Gk c2344009Gk, String str, boolean z) {
        if (z) {
            c2344009Gk.LIZJ(1, "is_from_external_link");
        } else if (!((HashMap) c2344009Gk.LIZ).containsKey("is_from_external_link")) {
            c2344009Gk.LIZJ(0, "is_from_external_link");
        }
        c2344009Gk.LJFF("external_link_source", str);
    }

    public static void LJ(String str, String str2, String str3, boolean z) {
        String str4;
        String str5;
        String str6;
        String value = C0L9N.UPLOAD_CONTENT_NEXT.getValue();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("content_type", "photo");
        c2344009Gk.LJIIIIZZ("content_source", "upload");
        c2344009Gk.LJIIIIZZ("shoot_way", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LIZJ(-1, "source_is_hdr");
        LIZIZ(c2344009Gk, str3, z);
        String str7 = "1";
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_login", str4);
        if (C533930Kwp.LIZLLL("android.permission.CAMERA")) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("has_camera_permission", str5);
        if (C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("has_microphone_permission", str6);
        C523280Kfe c523280Kfe = C523280Kfe.LIZ;
        boolean zLJFF = Intrinsics.LJFF("upload", "upload");
        c523280Kfe.getClass();
        if (!C523280Kfe.LIZJ(zLJFF)) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_private_access", str7);
        c2344009Gk.LJIIIIZZ("has_upload_permission", C523280Kfe.LIZIZ());
        C20684815ws.LJIILLIIL(value, c2344009Gk.LIZ);
    }
}
