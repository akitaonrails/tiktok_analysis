package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rTv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1590130rTv {
    public final Function0<String> LIZ;
    public final Fragment LIZIZ;
    public final ScrollSwitchStateManager LIZJ;

    public final String LIZ(String str) {
        if (str == null) {
            return "";
        }
        if (TextUtils.equals(str, "HOME")) {
            String strInvoke = this.LIZ.invoke();
            if (strInvoke != null) {
                return strInvoke;
            }
            return "homepage_hot";
        }
        if (TextUtils.equals(str, "DISCOVER")) {
            return "discovery";
        }
        if (TextUtils.equals(str, "SERIES_DISCOVER")) {
            return "series_discover";
        }
        if (TextUtils.equals(str, "FRIENDS_TAB")) {
            return "homepage_friends";
        }
        if (TextUtils.equals(str, "NOTIFICATION")) {
            return "notification_page";
        }
        if (TextUtils.equals(str, "USER")) {
            C128Y c128yVQ2 = this.LIZJ.vQ2();
            if (c128yVQ2 instanceof InterfaceC1583930rJv) {
                return ((InterfaceC1583930rJv) c128yVQ2).getEnterFrom();
            }
            return "personal_homepage";
        }
        return "homepage_hot";
    }

    public C1590130rTv(C1590190rU1 c1590190rU1, Fragment fragment, ScrollSwitchStateManager scrollSwitchStateManager) {
        this.LIZ = c1590190rU1;
        this.LIZIZ = fragment;
        this.LIZJ = scrollSwitchStateManager;
    }
}
