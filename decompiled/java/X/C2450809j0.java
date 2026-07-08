package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.09j0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2450809j0 {
    public static String LIZ(View view) {
        if (view == null) {
            return "null";
        }
        if (view.getId() == -1) {
            return "no-id";
        }
        try {
            String resourceName = view.getResources().getResourceName(view.getId());
            int iIndexOf = resourceName.indexOf("id/");
            if (iIndexOf >= 0) {
                return resourceName.substring(iIndexOf + 3);
            }
            return resourceName;
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return "id-not-found";
        }
    }

    public static String LIZIZ(ViewGroup viewGroup) {
        StringBuilder sb = new StringBuilder(100);
        sb.append(LIZ(viewGroup));
        sb.append(e3.e);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            sb.append(LIZ(childAt));
            sb.append(e3.h);
            if (childAt == null) {
                sb.append("null");
            } else {
                sb.append(childAt.getClass().getSimpleName());
            }
            sb.append(")");
            if (i < childCount - 1) {
                sb.append(",");
            }
        }
        sb.append(e3.f);
        return sb.toString();
    }
}
