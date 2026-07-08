package X;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0y9c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846620y9c {
    public static final String LIZ(Object obj) {
        String resourceEntryName;
        Application application;
        Resources resources;
        String strLIZ = C1504880pGQ.LIZ(obj, true);
        if (obj instanceof View) {
            int id = ((View) obj).getId();
            String str = "";
            if (id != -1) {
                try {
                    application = C1847960yBm.LJI;
                } catch (Resources.NotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    resourceEntryName = "Not_Found";
                }
                if (application != null && (resources = application.getResources()) != null) {
                    resourceEntryName = resources.getResourceEntryName(id);
                    if (resourceEntryName != null) {
                        str = resourceEntryName;
                    }
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ);
            sbLIZ.append(':');
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return strLIZ;
    }

    public static final C1847740yBQ LIZIZ(Object obj) {
        View viewLIZLLL = LIZLLL(obj);
        if (viewLIZLLL != null) {
            Object tag = viewLIZLLL.getTag(R.id.ph_);
            if (tag instanceof C1847740yBQ) {
                return (C1847740yBQ) tag;
            }
        }
        return null;
    }

    public static final C1847740yBQ LIZJ(Object obj) {
        C1847740yBQ c1847740yBQ;
        View viewLIZLLL = LIZLLL(obj);
        if (viewLIZLLL != null) {
            Object tag = viewLIZLLL.getTag(R.id.ph_);
            if ((tag instanceof C1847740yBQ) && (c1847740yBQ = (C1847740yBQ) tag) != null) {
                if (!c1847740yBQ.LIZ) {
                    return c1847740yBQ;
                }
                C1847740yBQ c1847740yBQLIZ = c1847740yBQ.LIZ();
                View viewLIZLLL2 = LIZLLL(obj);
                if (viewLIZLLL2 != null) {
                    viewLIZLLL2.setTag(R.id.ph_, c1847740yBQLIZ);
                }
                return c1847740yBQLIZ;
            }
        }
        return null;
    }

    public static final View LIZLLL(Object obj) {
        if (obj instanceof Activity) {
            Window window = ((Activity) obj).getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView();
        }
        if (obj instanceof Fragment) {
            return ((Fragment) obj).getView();
        }
        if (obj instanceof Dialog) {
            Window window2 = ((Dialog) obj).getWindow();
            if (window2 == null) {
                return null;
            }
            return window2.getDecorView();
        }
        if (!(obj instanceof View)) {
            return null;
        }
        return (View) obj;
    }

    public static final String LJ(View view) {
        String resourceName;
        Application application;
        Resources resources;
        if (view == null) {
            return "null";
        }
        int id = view.getId();
        String str = "";
        if (id != -1) {
            try {
                application = C1847960yBm.LJI;
            } catch (Resources.NotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                resourceName = "Not_Found";
            }
            if (application != null && (resources = application.getResources()) != null) {
                resourceName = resources.getResourceName(id);
                if (resourceName != null) {
                    str = resourceName;
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(view.getClass().getSimpleName());
        sbLIZ.append(':');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
