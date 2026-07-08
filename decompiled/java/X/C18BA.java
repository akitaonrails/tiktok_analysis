package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;

/* JADX INFO: renamed from: X.18BA, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18BA {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(PageFinder pageFinder) {
        if (pageFinder == null) {
            return "PageFinder(null)";
        }
        StringBuilder sb = new StringBuilder("PageFinder(");
        Object obj = pageFinder.page;
        if (obj != null) {
            String name = obj.getClass().getName();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("page: ");
            sbLIZ.append(name);
            sbLIZ.append(", ");
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        View view = pageFinder.view;
        if (view != null) {
            String name2 = view.getClass().getName();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("(attached=");
            sbLIZ2.append(view.isAttachedToWindow());
            sbLIZ2.append(')');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("view: ");
            sbLIZ3.append(name2);
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(", ");
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        }
        Fragment fragment = pageFinder.fragment;
        if (fragment != null) {
            String name3 = fragment.getClass().getName();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("fragment: ");
            sbLIZ4.append(name3);
            sbLIZ4.append(", ");
            sb.append(C2188811AlT.LIZIZ(sbLIZ4));
        }
        String str = pageFinder.btmPageId;
        if (str != null && str.length() != 0) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("btmPageId: ");
            sbLIZ5.append(pageFinder.btmPageId);
            sbLIZ5.append(", ");
            sb.append(C2188811AlT.LIZIZ(sbLIZ5));
        }
        sb.append(")");
        return sb.toString();
    }

    public static String LIZIZ(PageFinder pageFinder) {
        String canonicalName;
        String canonicalName2;
        String str;
        String canonicalName3;
        String str2 = "null";
        if (pageFinder == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("page: ");
        Object obj = pageFinder.page;
        if (obj == null || (canonicalName = obj.getClass().getCanonicalName()) == null) {
            canonicalName = "null";
        }
        View view = pageFinder.view;
        if (view == null || (canonicalName2 = view.getClass().getCanonicalName()) == null) {
            canonicalName2 = "null";
        }
        Fragment fragment = pageFinder.fragment;
        if (fragment != null && (canonicalName3 = fragment.getClass().getCanonicalName()) != null) {
            str2 = canonicalName3;
        }
        sb.append(canonicalName);
        sb.append(", view: ");
        sb.append(canonicalName2);
        sb.append(", fragment: ");
        sb.append(str2);
        String str3 = pageFinder.btmPageId;
        if (str3 != null) {
            if (str3.length() == 0) {
                str = "empty";
            } else {
                str = "true";
            }
        } else {
            str = "false";
        }
        sb.append(", has_page_id: ");
        sb.append(str);
        return sb.toString();
    }
}
