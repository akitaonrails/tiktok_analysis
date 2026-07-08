package X;

import Y.ARunnableS10S0201000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03xH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1010503xH {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, int i, Function0 function0) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        int i2;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.miw);
        View viewFindViewById4 = view.findViewById(R.id.cgi);
        if (viewFindViewById3 != null && viewFindViewById4 != null && viewFindViewById3.getVisibility() == 0 && viewFindViewById4.getVisibility() == 0) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width > 0 && height > 0) {
                if (viewFindViewById3.getBottom() > viewFindViewById4.getTop()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = C1697810uHb.LJIIJJI(Integer.valueOf(R.id.wlq), Integer.valueOf(R.id.y_p), Integer.valueOf(R.id.fqq), Integer.valueOf(R.id.miw), Integer.valueOf(R.id.ccq)).iterator();
                    while (it2.hasNext()) {
                        View viewFindViewById5 = view.findViewById(((Number) it2.next()).intValue());
                        if (viewFindViewById5 != null) {
                            arrayList.add(viewFindViewById5);
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.fqg);
                    if (viewGroup != null) {
                        int childCount = viewGroup.getChildCount();
                        for (int i3 = 0; i3 < childCount; i3++) {
                            View childAt = viewGroup.getChildAt(i3);
                            if (childAt != null && (viewFindViewById2 = childAt.findViewById(R.id.fox)) != null) {
                                arrayList.add(viewFindViewById2);
                            }
                        }
                    }
                    ArrayList<TuxIconView> arrayList2 = new ArrayList();
                    ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.fqg);
                    if (viewGroup2 != null) {
                        int childCount2 = viewGroup2.getChildCount();
                        for (int i4 = 0; i4 < childCount2; i4++) {
                            View childAt2 = viewGroup2.getChildAt(i4);
                            if (childAt2 != null && (viewFindViewById = childAt2.findViewById(R.id.fp_)) != null) {
                                arrayList2.add(viewFindViewById);
                            }
                        }
                    }
                    TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.title);
                    C197039127h c197039127h = (C197039127h) view.findViewById(R.id.eoq);
                    C197039127h c197039127h2 = (C197039127h) view.findViewById(R.id.ui7);
                    ImageView imageView = (ImageView) view.findViewById(R.id.jjh);
                    if (tuxTextView != null) {
                        tuxTextView.setTuxFont(23);
                    }
                    if (c197039127h != null) {
                        c197039127h.setButtonSize(1);
                    }
                    if (c197039127h2 != null) {
                        c197039127h2.setButtonSize(1);
                    }
                    if (imageView != null) {
                        imageView.setAdjustViewBounds(true);
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        if (layoutParams != null) {
                            i2 = layoutParams.width;
                        } else {
                            i2 = 0;
                        }
                        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.width = (int) (i2 * 0.73f);
                            layoutParams2.height = -2;
                        } else {
                            layoutParams2 = null;
                        }
                        C786410Ut5.c6(imageView, layoutParams2);
                        imageView.requestLayout();
                    }
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        ((TuxTextView) it3.next()).setTuxFont(81);
                    }
                    for (TuxIconView tuxIconView : arrayList2) {
                        tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                    }
                    Iterator it4 = C1697810uHb.LJIIJJI(Integer.valueOf(R.id.wlq), Integer.valueOf(R.id.y_p), Integer.valueOf(R.id.fqq)).iterator();
                    while (it4.hasNext()) {
                        View viewFindViewById6 = view.findViewById(((Number) it4.next()).intValue());
                        if (viewFindViewById6 != null) {
                            ViewGroup.LayoutParams layoutParams3 = viewFindViewById6.getLayoutParams();
                            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                                marginLayoutParams3.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                                C786410Ut5.W5(viewFindViewById6, marginLayoutParams3);
                            }
                        }
                    }
                    View viewFindViewById7 = view.findViewById(R.id.miw);
                    if (viewFindViewById7 != null) {
                        ViewGroup.LayoutParams layoutParams4 = viewFindViewById7.getLayoutParams();
                        if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                            marginLayoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                            C786410Ut5.W5(viewFindViewById7, marginLayoutParams2);
                        }
                    }
                    ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.fqg);
                    if (viewGroup3 != null) {
                        ViewGroup.LayoutParams layoutParams5 = viewGroup3.getLayoutParams();
                        if ((layoutParams5 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
                            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                            C786410Ut5.X5(marginLayoutParams, viewGroup3);
                        }
                    }
                    function0.invoke();
                    return;
                }
                return;
            }
            if (i < 5) {
                HandlerHook.viewPostDelay(view, new ARunnableS10S0201000_1(view, i, function0, 5), 50L);
            }
        }
    }
}
