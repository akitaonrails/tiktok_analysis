package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.DisplayMetrics;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.subscribe.subonlyvideo.SubOnlyVideoOpenParams;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: renamed from: X.0K1Z, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K1Z {
    public static final C0K1Z LIZ = new C0K1Z();

    public static void LIZJ(SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment) {
        boolean z;
        C19EG activity = subscriptionPrivilegeDetailFragment.getActivity();
        if (activity != null) {
            C01GW c01gw = C511520K4g.LIZ;
            int i = Resources.getSystem().getDisplayMetrics().heightPixels;
            String str = "";
            String strOptString = C0K7G.LJIILL().optString("user_faq_category_popup", "");
            if (strOptString.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                try {
                    strOptString = UriProtector.parse(strOptString).buildUpon().appendQueryParameter("show_entrance", "privilege_page").build().toString();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                str = strOptString;
            }
            C0K54.LIZ().LJ(activity, UriProtector.parse(str).buildUpon().appendQueryParameter("height", String.valueOf(((int) (i * 0.7f)) / ((DisplayMetrics) C511520K4g.LIZ.getValue()).density)).build().toString(), C2097608Jq.LJ());
            C511970K5z c511970K5z = new C511970K5z("livesdk_subscribe_faq_entrance_click");
            C0K61.LIZ(c511970K5z, null);
            c511970K5z.LIZIZ("privilege_page", "show_entrance");
            c511970K5z.LIZLLL();
        }
    }

    public static int LIZLLL(String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public static String LJ(String str) {
        if (str.length() != 9) {
            return str;
        }
        try {
            String strSubstring = str.substring(7, 9);
            String strSubstring2 = str.substring(1, 7);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('#');
            sbLIZ.append(strSubstring);
            sbLIZ.append(strSubstring2);
            str = C2188811AlT.LIZIZ(sbLIZ);
            return str;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }

    public static void LIZIZ(Context context, Long l, String str, String str2) {
        Object c098200Yq;
        boolean z;
        if (l != null) {
            long jLongValue = l.longValue();
            if (str2 == null) {
                return;
            }
            C0K76.LIZ.getClass();
            try {
                C0K77 c0k77LIZ = C0K76.LIZ();
                if (c0k77LIZ == null) {
                    z = false;
                } else {
                    c0k77LIZ.LJIILIIL(context, str, jLongValue, str2);
                    z = true;
                }
                c098200Yq = Boolean.valueOf(z);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Boolean bool = Boolean.FALSE;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = bool;
            }
            if (((Boolean) c098200Yq).booleanValue()) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://aweme/detail/");
            sbLIZ.append(str);
            try {
                C189200o6.m2constructorimpl(Boolean.valueOf(C0K54.LIZ().LJ(context, UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)).buildUpon().appendQueryParameter("author_id", String.valueOf(jLongValue)).appendQueryParameter("sec_author_id", str2).appendQueryParameter("enter_from", "sub_privilege_page").build().toString(), C2097608Jq.LJ())));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
    }

    public static void LIZ(FragmentManager fragmentManager, User user, User user2, int i, Boolean bool, SubOnlyVideoOpenParams subOnlyVideoOpenParams, Function0 function0) {
        long id;
        String secUid;
        boolean z;
        Fragment fragment;
        C0K77 c0k77LIZ;
        if (user != null) {
            id = user.getId();
        } else if (user2 != null) {
            id = user2.getId();
        } else {
            id = 0;
        }
        if ((user == null || (secUid = user.getSecUid()) == null) && (user2 == null || (secUid = user2.getSecUid()) == null)) {
            secUid = "";
        }
        if (id > 0 && secUid.length() != 0) {
            if (user2 != null && user2.getId() == id) {
                z = true;
            } else {
                z = false;
            }
            C0K76 c0k76 = C0K76.LIZ;
            AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(305);
            c0k76.getClass();
            try {
                c0k77LIZ = C0K76.LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (c0k77LIZ != null) {
                fragment = c0k77LIZ.LJJIZ(z, id, secUid, bool, aFwS237S0000000_7, subOnlyVideoOpenParams, function0);
                if (fragment == null) {
                    fragment = new Fragment();
                }
            } else {
                fragment = new Fragment();
            }
            if (fragmentManager != null) {
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJI = fragment;
                tuxSheet.LLJJIJIIJIL = true;
                c1390920mIc.LJIIIIZZ(1);
                int iLIZIZ = C814420VxA.LIZIZ(i * 0.73f);
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLJJL = iLIZIZ;
                tuxSheet2.LLJLL = true;
                tuxSheet2.LLJLILLLLZIIL = false;
                tuxSheet2.show(fragmentManager, "SUB_VIDEO_CONTENT_LIST_TAG");
            }
        }
    }
}
