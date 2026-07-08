package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: renamed from: X.0PrR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C657990PrR {
    public static final C19EG LIZ(View view) {
        Object next;
        Iterator it2 = C09R4.LJ(AFwS241S0000000_10.get$arr$(601), view.getContext()).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof Activity) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (C19EG) next;
    }

    public static final int LIZIZ(View view) {
        int marginStart;
        int marginEnd = 0;
        if (view == null) {
            return 0;
        }
        int measuredWidth = view.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        } else {
            marginStart = 0;
        }
        int i = measuredWidth + marginStart;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
        }
        return marginEnd + i;
    }

    public static final void LIZJ(View view, Function1<? super ViewGroup.LayoutParams, Unit> function1) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        function1.invoke(layoutParams);
        if (view.isLaidOut()) {
            C786410Ut5.W5(view, layoutParams);
        }
    }
}
