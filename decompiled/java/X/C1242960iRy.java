package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0iRy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1242960iRy {
    public static final C1242960iRy LIZ = new C1242960iRy();

    public static void LIZ(String str, boolean z, boolean z2) {
        String str2;
        String str3;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", "homepage_profile");
        if (z) {
            str2 = "username";
        } else {
            str2 = "nickname";
        }
        c0xgr.LIZLLL("banner_type", str2);
        c0xgr.LIZLLL("click", str);
        if (z2) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0xgr.LIZLLL("result", str3);
        C20684815ws.LJIILLIIL("update_username_banner_click", c0xgr.LIZ);
    }
}
