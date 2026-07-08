package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockElement;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockFormat;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zuy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1914420zuy {
    public abstract C197039127h LIZ(UniversalPopupBlockElement universalPopupBlockElement, String str, Context context, InterfaceC1914580zvE interfaceC1914580zvE, int i);

    public abstract TuxTextView LIZIZ(UniversalPopupBlockElement universalPopupBlockElement, Context context, InterfaceC1914580zvE interfaceC1914580zvE);

    public abstract TuxIconView LIZLLL(UniversalPopupBlockElement universalPopupBlockElement, Context context, String str);

    public abstract TuxTextView LJFF(UniversalPopupBlockElement universalPopupBlockElement, Context context, InterfaceC1914580zvE interfaceC1914580zvE);

    public abstract Integer LJI(String str);

    public static View LIZJ(Context context) {
        int iIntValue;
        View view = new View(context);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        view.setBackground(new ColorDrawable(iIntValue));
        C786410Ut5.W5(view, new ViewGroup.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))));
        return view;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, java.util.ArrayList] */
    public static void LJII(Context context, UniversalPopupBlockFormat universalPopupBlockFormat, ConstraintLayout constraintLayout) {
        Drawable.ConstantState constantState;
        Drawable drawableNewDrawable;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (universalPopupBlockFormat == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        Drawable drawableMutate = null;
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(universalPopupBlockFormat.marginLeft))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(universalPopupBlockFormat.marginTop))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(universalPopupBlockFormat.marginRight))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(universalPopupBlockFormat.marginBottom))));
        }
        constraintLayout.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(universalPopupBlockFormat.paddingLeft))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(universalPopupBlockFormat.paddingTop))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(universalPopupBlockFormat.paddingRight))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(universalPopupBlockFormat.paddingBottom))));
        if (universalPopupBlockFormat.cornerRadius != -1) {
            Drawable drawableLIZIZ = C800330VaR.LIZIZ(context, R.drawable.fi6);
            if (drawableLIZIZ != null && (constantState = drawableLIZIZ.getConstantState()) != null && (drawableNewDrawable = constantState.newDrawable()) != null) {
                drawableMutate = drawableNewDrawable.mutate();
            }
            if (drawableMutate instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawableMutate;
                String str = universalPopupBlockFormat.cornerPosition;
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(universalPopupBlockFormat.cornerRadius)));
                C259800zU c259800zU = new C259800zU();
                ?? arrayList = new ArrayList(8);
                int i = 0;
                do {
                    arrayList.add(Float.valueOf(0.0f));
                    i++;
                } while (i < 8);
                c259800zU.element = arrayList;
                for (String str2 : a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) {
                    switch (str2.hashCode()) {
                        case -1699597560:
                            if (str2.equals("bottom_right")) {
                                float f = iLIZIZ;
                                ListProtector.set((List) c259800zU.element, 4, Float.valueOf(f));
                                ListProtector.set((List) c259800zU.element, 5, Float.valueOf(f));
                            }
                            break;
                        case -966253391:
                            if (str2.equals("top_left")) {
                                float f2 = iLIZIZ;
                                ListProtector.set((List) c259800zU.element, 0, Float.valueOf(f2));
                                ListProtector.set((List) c259800zU.element, 1, Float.valueOf(f2));
                            }
                            break;
                        case -609197669:
                            if (str2.equals("bottom_left")) {
                                float f3 = iLIZIZ;
                                ListProtector.set((List) c259800zU.element, 6, Float.valueOf(f3));
                                ListProtector.set((List) c259800zU.element, 7, Float.valueOf(f3));
                            }
                            break;
                        case 96673:
                            if (str2.equals("all")) {
                                ?? arrayList2 = new ArrayList(8);
                                int i2 = 0;
                                do {
                                    arrayList2.add(Float.valueOf(iLIZIZ));
                                    i2++;
                                } while (i2 < 8);
                                c259800zU.element = arrayList2;
                            }
                            break;
                        case 116576946:
                            if (str2.equals("top_right")) {
                                float f4 = iLIZIZ;
                                ListProtector.set((List) c259800zU.element, 2, Float.valueOf(f4));
                                ListProtector.set((List) c259800zU.element, 3, Float.valueOf(f4));
                            }
                            break;
                    }
                }
                gradientDrawable.setCornerRadii(C13LP.LLI((Collection) c259800zU.element));
                constraintLayout.setBackground(drawableMutate);
            }
        }
    }

    public static ImageView LJ(UniversalPopupBlockElement universalPopupBlockElement, UniversalPopupBlockFormat universalPopupBlockFormat, Context context, String str) {
        boolean z;
        Pair<Integer, Integer> pair;
        C1914490zv5 c1914490zv5;
        String str2;
        String str3;
        String str4 = universalPopupBlockElement.iconUrl;
        if (str4 != null && str4.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        ImageView imageView = new ImageView(context);
        Map<String, Pair<Integer, Integer>> map = C756010Tl9.LIZ.get(universalPopupBlockElement.iconStyle);
        if (map == null || (pair = map.get(str)) == null) {
            return null;
        }
        if (universalPopupBlockFormat != null) {
            c1914490zv5 = new C1914490zv5(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(universalPopupBlockFormat.paddingLeft))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(universalPopupBlockFormat.paddingTop))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(universalPopupBlockFormat.paddingRight))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(universalPopupBlockFormat.paddingBottom))));
        } else {
            Map<String, C1914490zv5> map2 = C756010Tl9.LIZIZ.get(universalPopupBlockElement.iconStyle);
            if (map2 == null || (c1914490zv5 = map2.get(str)) == null) {
                c1914490zv5 = new C1914490zv5(0, 0, 0, 0);
            }
        }
        if (C10UZ.LIZLLL(context) && (str3 = universalPopupBlockElement.iconUrlDark) != null && !a0.LJJJIL(str3)) {
            str2 = universalPopupBlockElement.iconUrlDark;
        } else {
            str2 = universalPopupBlockElement.iconUrl;
        }
        Uri uri = UriProtector.parse(str2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(pair.getFirst().intValue(), pair.getSecond().intValue());
        imageView.setPadding(c1914490zv5.LIZ, c1914490zv5.LIZIZ, c1914490zv5.LIZJ, c1914490zv5.LIZLLL);
        C786410Ut5.c6(imageView, layoutParams);
        C1324840ka2.LIZJ(imageView, uri.toString(), InterfaceC1320380kSq.LJFF);
        return imageView;
    }
}
