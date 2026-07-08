package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0XQT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0XQT {
    public final Activity LIZ;
    public final String LIZIZ;
    public final Bundle LIZJ;
    public final C0XTR LIZLLL;
    public final C0TNI LJ;
    public final C0XQU LJFF;

    public C0XQT(C0XQS c0xqs) {
        this.LIZ = c0xqs.LIZ;
        String str = c0xqs.LIZIZ;
        this.LIZIZ = str;
        String str2 = c0xqs.LIZJ;
        Bundle bundle = c0xqs.LIZLLL;
        bundle = bundle == null ? new Bundle() : bundle;
        this.LIZJ = bundle;
        this.LIZLLL = c0xqs.LJ;
        this.LJ = c0xqs.LJI;
        this.LJFF = c0xqs.LJFF;
        String str3 = c0xqs.LJIIIZ;
        String str4 = c0xqs.LJIIJ;
        if (!TextUtils.isEmpty(str)) {
            C786410Ut5.LJJJI("enter_from", str, bundle);
        }
        if (!TextUtils.isEmpty(str2)) {
            C786410Ut5.LJJJI("enter_method", str2, bundle);
        }
        if (!TextUtils.isEmpty(str3)) {
            C786410Ut5.LJJJI("login_panel_dynamic_title_login", str3, bundle);
        }
        if (!TextUtils.isEmpty(str4)) {
            C786410Ut5.LJJJI("login_panel_dynamic_title_signup", str4, bundle);
        }
        bundle.putDouble("login_panel_max_height_ratio", c0xqs.LJII);
        bundle.putBoolean("login_panel_adjust_height_automatically", c0xqs.LJIIIIZZ);
    }
}
