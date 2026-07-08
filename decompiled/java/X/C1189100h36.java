package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.PoiSubTag;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0h36, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189100h36 {
    public static final int LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));

    public static final int LIZ(Context context) {
        if (context == null) {
            return 0;
        }
        int iLIZIZ = C497820Jfg.LIZIZ(context);
        C01GW<Integer> c01gw = ConstraintSizeVM.LL;
        return (iLIZIZ - C693770RJf.LIZLLL()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
    }

    public static final boolean LIZIZ(List<PoiSubTag> list) {
        if (list != null) {
            Iterator<PoiSubTag> it2 = list.iterator();
            while (it2.hasNext()) {
                Integer num = it2.next().type;
                if (num == null || num.intValue() != 6) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final int LIZJ(View view) {
        Number numberValueOf;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i2 = 0;
        if (view == null || view.getVisibility() != 0) {
            return 0;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            numberValueOf = Float.valueOf(textView.getPaint().measureText(textView.getText().toString()));
        } else {
            numberValueOf = Integer.valueOf(view.getLayoutParams().width);
        }
        int iIntValue = numberValueOf.intValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i = marginLayoutParams2.leftMargin;
        } else {
            i = 0;
        }
        int i3 = iIntValue + i;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i2 = marginLayoutParams.rightMargin;
        }
        return i3 + i2;
    }

    public static final void LIZLLL(final TuxTextView tuxTextView, final TuxTextView tuxTextView2, final ViewGroup viewGroup, final boolean z, int i, final int i2, final Function1<? super Integer, Unit> function1) {
        final int i3 = i;
        if (tuxTextView == null || tuxTextView2 == null) {
            return;
        }
        final int iMeasureText = (int) tuxTextView.getPaint().measureText(tuxTextView.getText().toString());
        final int iMeasureText2 = (int) tuxTextView2.getPaint().measureText(tuxTextView2.getText().toString());
        if (tuxTextView2.getVisibility() != 0) {
            i3 = 0;
        }
        HandlerHook.viewPost(tuxTextView, new Runnable() { // from class: X.0DH9
            public final void LIZ() {
                int width = ((View) tuxTextView.getParent()).getWidth();
                if (width <= 0) {
                    Function1<Integer, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(0);
                        return;
                    }
                    return;
                }
                final C118300cf c118300cf = new C118300cf();
                c118300cf.element = iMeasureText;
                final C118300cf c118300cf2 = new C118300cf();
                int i4 = iMeasureText2;
                c118300cf2.element = i4;
                int i5 = iMeasureText;
                int i6 = i3;
                int i7 = i2;
                if (i5 + i4 + i6 + i7 > width) {
                    if (z) {
                        c118300cf.element = Math.min(Math.max(((width - i6) - i7) - i4, C1189100h36.LIZ), iMeasureText);
                        TuxTextView tuxTextView3 = tuxTextView;
                        ViewGroup.LayoutParams layoutParams = tuxTextView3.getLayoutParams();
                        layoutParams.width = c118300cf.element;
                        C786410Ut5.R6(tuxTextView3, layoutParams);
                        c118300cf2.element = ((width - i2) - i3) - c118300cf.element;
                        TuxTextView tuxTextView4 = tuxTextView2;
                        ViewGroup.LayoutParams layoutParams2 = tuxTextView4.getLayoutParams();
                        layoutParams2.width = c118300cf2.element;
                        C786410Ut5.R6(tuxTextView4, layoutParams2);
                    } else {
                        c118300cf2.element = Math.min(Math.max(((width - i7) - i6) - i5, C1189100h36.LIZ), iMeasureText2);
                        TuxTextView tuxTextView5 = tuxTextView2;
                        ViewGroup.LayoutParams layoutParams3 = tuxTextView5.getLayoutParams();
                        layoutParams3.width = c118300cf2.element;
                        C786410Ut5.R6(tuxTextView5, layoutParams3);
                        c118300cf.element = ((width - i2) - i3) - c118300cf2.element;
                        TuxTextView tuxTextView6 = tuxTextView;
                        ViewGroup.LayoutParams layoutParams4 = tuxTextView6.getLayoutParams();
                        layoutParams4.width = c118300cf.element;
                        C786410Ut5.R6(tuxTextView6, layoutParams4);
                    }
                }
                ViewGroup viewGroup2 = viewGroup;
                if (viewGroup2 != null) {
                    final Function1<Integer, Unit> function13 = function1;
                    final int i8 = i3;
                    final int i9 = i2;
                    HandlerHook.viewPost(viewGroup2, new Runnable() { // from class: X.0C9r
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("PoiAnchorUtilsKt@6241.layoutTextLine$1$5");
                            try {
                                Function1<Integer, Unit> function14 = function13;
                                if (function14 != null) {
                                    function14.invoke(Integer.valueOf(c118300cf.element + c118300cf2.element + i8 + i9));
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("PoiAnchorUtilsKt@6241.layoutTextLine$1$5");
                        }
                    });
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PoiAnchorUtilsKt@6241.layoutTextLine$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PoiAnchorUtilsKt@6241.layoutTextLine$1");
            }
        });
    }
}
