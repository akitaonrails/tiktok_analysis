package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0d5N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1036750d5N {
    public static final C1036750d5N LIZ = new C1036750d5N();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(9));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(3));

    public static ViewGroup.LayoutParams LIZ(ViewGroup.LayoutParams layoutParams) {
        C19ME c19me;
        if (!((Boolean) LIZJ.getValue()).booleanValue()) {
            return layoutParams;
        }
        if (!(layoutParams instanceof C19ME) || (c19me = (C19ME) layoutParams) == null) {
            c19me = new C19ME(layoutParams);
        }
        ((ViewGroup.MarginLayoutParams) c19me).width = 0;
        ((ViewGroup.MarginLayoutParams) c19me).height = 0;
        c19me.startToStart = 0;
        c19me.endToEnd = 0;
        c19me.topToTop = 0;
        c19me.bottomToBottom = 0;
        return c19me;
    }
}
