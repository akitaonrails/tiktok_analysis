package X;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;

/* JADX INFO: renamed from: X.142T, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C142T extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OCA+HELIOSJCYgOywjJ2EDJzIpOx82OiglOjw6JysKOy40JSAiPQ==";
    public final C1119470fEn<C142Z> LL = new C1119470fEn<>();
    public final C1119470fEn<C142Z> LLILLJJLI = new C1119470fEn<>();

    public static Intent LIZIZ(Context context) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("package:");
        sbLIZ.append(context.getPackageName());
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
    }

    public static boolean LIZLLL(Context context, Intent intent) {
        ActivityInfo activityInfo;
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null || activityInfo.name.toLowerCase(Locale.ROOT).contains("resolver")) {
            return false;
        }
        String str = resolveInfoResolveActivity.activityInfo.permission;
        if (!TextUtils.isEmpty(str) && context.checkCallingOrSelfPermission(str) != 0) {
            return false;
        }
        return true;
    }

    public final void LIZJ(C142Z c142z, int i) throws Throwable {
        try {
            Activity activity = c142z.LIZ;
            if (LIZLLL(activity, LIZIZ(activity))) {
                LIZ(this, LIZIZ(c142z.LIZ), i);
                this.LLILLJJLI.LJFF(i, c142z);
                return;
            }
            try {
                LIZ(this, new Intent("android.settings.APPLICATION_SETTINGS"), i);
                this.LLILLJJLI.LJFF(i, c142z);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("PermissionFragment", "go to origin setting error");
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            try {
                LIZ(this, new Intent("android.settings.APPLICATION_SETTINGS"), i);
                this.LLILLJJLI.LJFF(i, c142z);
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                C20441214yg.LJ("PermissionFragment", "go to origin setting error");
            }
            C20441214yg.LJ("PermissionFragment", "go to app info error");
        }
    }

    public static void LIZ(C142T c142t, Intent intent, int i) throws Throwable {
        Fragment fragment;
        int iIntValue = i;
        Intent intent2 = intent;
        C1701330uNH.LIZ(intent2, c142t);
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+y92BEuFsO5ZlNzd66qSlz9tD+a+T3sEZ6SUUba7UeTBwQ==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2, Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11085, "com/bytedance/android/livesdk/permission/PowerPermissionFragment", "startActivityForResult", c142t, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11085, "com/bytedance/android/livesdk/permission/PowerPermissionFragment", "startActivityForResult", null, objArr, c142t, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                fragment = (Fragment) obj;
            } else {
                fragment = c142t;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            fragment = c142t;
        }
        fragment.startActivityForResult(intent2, iIntValue);
        c0wst.LIZ(11085, "com/bytedance/android/livesdk/permission/PowerPermissionFragment", "startActivityForResult", null, objArr, fragment, c0wzw, true);
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C142Z c142zLIZLLL = this.LLILLJJLI.LIZLLL(i);
        this.LLILLJJLI.LJI(i);
        if (c142zLIZLLL != null && C202002142e.LIZJ(getActivity(), c142zLIZLLL.LIZJ)) {
            c142zLIZLLL.LIZIZ(true);
        }
    }
}
