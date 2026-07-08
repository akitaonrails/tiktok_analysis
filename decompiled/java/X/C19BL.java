package X;

import android.R;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.19BL, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19BL {
    public static Drawable LIZLLL(Context context) {
        if (!(context instanceof Activity)) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.windowBackground, typedValue, true);
            int i = typedValue.type;
            if (i >= 28 && i <= 31) {
                return new ColorDrawable(typedValue.data);
            }
            return context.getResources().getDrawable(typedValue.resourceId);
        }
        throw new IllegalArgumentException("Use Scene Context instead");
    }

    public static boolean LJ(Activity activity) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return false;
        }
        return true;
    }

    public static void LJFF(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            C786410Ut5.LJJJLZIJ(view, (ViewGroup) parent);
        }
    }

    public static String LIZIZ(Context context, int i) {
        try {
            return context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return String.valueOf(i);
        }
    }

    public static void LJI(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static void LIZ(FragmentManager fragmentManager, FragmentTransaction fragmentTransaction, boolean z) {
        if (Build.VERSION.SDK_INT >= 24) {
            if (z) {
                fragmentTransaction.commitNowAllowingStateLoss();
                return;
            } else {
                fragmentTransaction.commitAllowingStateLoss();
                return;
            }
        }
        fragmentTransaction.commitAllowingStateLoss();
        if (!z) {
            return;
        }
        fragmentManager.executePendingTransactions();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(Scene scene, StringBuilder sb, int i) {
        View view;
        String strLIZIZ;
        C128Y c128y = scene.mParentScene;
        String strReplace = new String(new char[i]).replace("\u0000", "    ");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strReplace);
        sbLIZ.append(e3.e);
        sbLIZ.append(scene.getClass().getSimpleName());
        sbLIZ.append("] ");
        sb2.append(C2188811AlT.LIZIZ(sbLIZ));
        if (c128y != null) {
            sb2.append(((C19BK) c128y).getSceneDebugInfo(scene));
        }
        if (scene.getApplicationContext() != null && (view = scene.mView) != null && view.getId() != -1 && (strLIZIZ = LIZIZ(scene.requireApplicationContext(), scene.mView.getId())) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("viewId: ");
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" ");
            sb2.append(C2188811AlT.LIZIZ(sbLIZ2));
        }
        sb2.append("\n");
        sb.append(sb2.toString());
        if (scene instanceof C19BK) {
            int i2 = i + 1;
            List<Scene> sceneList = ((C19BK) scene).getSceneList();
            for (int i3 = 0; i3 < sceneList.size(); i3++) {
                LIZJ((Scene) ListProtector.get(sceneList, i3), sb, i2);
            }
        }
    }
}
