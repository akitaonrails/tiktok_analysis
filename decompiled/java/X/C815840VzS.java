package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteManager;
import com.bytedance.router.util.Util;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortcut.ShortcutRouteAction;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0VzS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C815840VzS {
    public final C815900VzY LIZ;
    public final ShortcutInfo LIZIZ = null;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;

    public final int hashCode() {
        return ((String) this.LJ.getValue()).hashCode();
    }

    public C815840VzS(C815900VzY c815900VzY) {
        this.LIZ = c815900VzY;
        if (c815900VzY != null) {
            this.LIZJ = C452501pT.LIZIZ(new C815860VzU(this));
            this.LIZLLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 166));
            this.LJ = C452501pT.LIZIZ(new C815870VzV(this));
            return;
        }
        throw new IllegalArgumentException("shortcut == null && shortcutInfo == null");
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (Intrinsics.LJFF(C815840VzS.class, cls) && Intrinsics.LJFF(this.LJ.getValue(), ((C815840VzS) obj).LJ.getValue())) {
            return true;
        }
        return false;
    }

    public final ShortcutInfo LIZ(Context context, Integer num) {
        boolean z;
        Object c098200Yq;
        String str;
        String str2;
        C815900VzY c815900VzY = this.LIZ;
        if (c815900VzY != null) {
            ShortcutRouteAction.Companion.getClass();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage(context.getPackageName());
            List<String> list = c815900VzY.LIZLLL;
            if (list != null && !list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                str = "";
            } else {
                try {
                    c098200Yq = Uri.encode(new JSONArray((Collection) c815900VzY.LIZLLL).toString());
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = "";
                }
                str = (String) c098200Yq;
            }
            String str3 = c815900VzY.LJII;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = c815900VzY.LIZIZ;
            Uri.Builder builderAppendQueryParameter = UriProtector.parse(Util.completeUrl(RouteManager.getInstance().getRoutesConfig().getScheme(), "//shortcut/proxy")).buildUpon().appendQueryParameter("shortcutRouteUrl", str).appendQueryParameter("SHORTCUT_ROUTE_ACTION", str3).appendQueryParameter("SHORTCUT_SINGLE", "");
            if (c815900VzY.LJFF) {
                str2 = "SHORTCUT_NEED_LOGIN_YES";
            } else {
                str2 = "SHORTCUT_NEED_LOGIN_NO";
            }
            intent.setData(builderAppendQueryParameter.appendQueryParameter("SHORTCUT_NEED_LOGIN", str2).appendQueryParameter("SHORTCUT_ID", str4).build());
            String str5 = this.LIZ.LIZ;
            ShortcutInfo.Builder intent2 = new ShortcutInfo.Builder(context, this.LIZ.LIZIZ).setShortLabel(str5).setLongLabel(str5).setIcon(this.LIZ.LIZJ).setIntent(intent);
            if (num != null) {
                intent2.setRank(num.intValue());
            }
            return intent2.build();
        }
        ShortcutInfo shortcutInfo = this.LIZIZ;
        if (shortcutInfo == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        return shortcutInfo;
    }
}
