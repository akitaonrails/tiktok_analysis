package X;

import X.AbstractC704860Rkq;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RlM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC705180RlM<T extends AbstractC704860Rkq<?>> extends AbstractC705030Rl7<T> {
    public final Function0<Unit> LJIILJJIL;

    public final void LJIJ(boolean z) {
        ViewGroup viewGroup;
        Function0<Unit> function0;
        if (z && (function0 = this.LJIILJJIL) != null) {
            function0.invoke();
        }
        View view = this.LJI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        if (C299640Boo.LIZ() && (viewGroup = this.LJFF) != null) {
            C786410Ut5.LJLZ(0, viewGroup);
        }
    }

    public AbstractC705180RlM(Context context, String str, String str2, String str3, ViewGroup viewGroup, View view, C704840Rko c704840Rko, Function0<Unit> function0) {
        super(context, str, str2, str3, viewGroup, view, c704840Rko);
        this.LJIILJJIL = function0;
    }
}
