package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03Cy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C806203Cy {
    public static final C806203Cy LIZ = new C806203Cy();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public static void LIZ(LinearLayout linearLayout, String str) {
        ?? arrayList;
        List listLJJLIIIJILLIZJL;
        Context context = linearLayout.getContext();
        if (str != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"#"}, 0, 6)) != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                arrayList2.add(a0.LJLIIIL((String) it2.next()).toString());
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        for (String str2 : arrayList) {
            LinearLayout linearLayout2 = new LinearLayout(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, 0);
            C786410Ut5.d6(linearLayout2, layoutParams);
            linearLayout2.setOrientation(0);
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            c419910GdJ.LIZ = R.raw.icon_ellipsis_single;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
            tuxIconView.setTuxIcon(c419910GdJ);
            C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setId(View.generateViewId());
            C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-1, -2));
            tuxTextView.setText(str2);
            tuxTextView.setTextColorRes(R.attr.a1j);
            tuxTextView.setTuxFont(41);
            linearLayout2.addView(tuxIconView);
            linearLayout2.addView(tuxTextView);
            linearLayout.addView(linearLayout2);
        }
    }
}
