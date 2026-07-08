package X;

import android.view.View;
import android.view.ViewGroup;
import java.io.PrintStream;

/* JADX INFO: renamed from: X.0J3i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C485800J3i {
    public static void LIZ(ViewGroup viewGroup, StringBuilder sb) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                LIZ((ViewGroup) childAt, sb);
            }
            if (childAt != null) {
                if (!(childAt.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    PrintStream printStream = System.err;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("exception layout params, view:---->");
                    sbLIZ.append(childAt.toString());
                    sbLIZ.append(" layout param:");
                    sbLIZ.append(childAt.getLayoutParams().toString());
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                }
                sb.append("child view info:");
                sb.append(childAt.toString());
                sb.append(" layout params:");
                sb.append(childAt.getLayoutParams().toString());
                sb.append("\n");
            }
        }
    }
}
