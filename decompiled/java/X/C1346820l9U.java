package X;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import java.util.List;

/* JADX INFO: renamed from: X.0l9U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346820l9U {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZ(boolean z, LinearLayout linearLayout, TuxIconView tuxIconView, TuxIconView tuxIconView2, View view, TuxIconView tuxIconView3) {
        List<String> list;
        if (z && (list = C1347860lBA.LIZJ) != null) {
            if (linearLayout != null) {
                C786410Ut5.LJJJJJL(linearLayout);
            }
            for (String str : list) {
                switch (str.hashCode()) {
                    case 3172656:
                        if (str.equals("gift") && tuxIconView3 != null && linearLayout != null) {
                            linearLayout.addView(tuxIconView3);
                        }
                        break;
                    case 96632902:
                        if (str.equals("emoji") && tuxIconView2 != null && linearLayout != null) {
                            linearLayout.addView(tuxIconView2);
                        }
                        break;
                    case 106642994:
                        if (str.equals("photo") && view != null && linearLayout != null) {
                            linearLayout.addView(view);
                        }
                        break;
                    case 950345194:
                        if (str.equals("mention") && tuxIconView != null && linearLayout != null) {
                            linearLayout.addView(tuxIconView);
                        }
                        break;
                }
            }
        }
    }
}
