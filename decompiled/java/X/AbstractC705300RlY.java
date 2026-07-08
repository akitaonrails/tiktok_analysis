package X;

import X.AbstractC704860Rkq;
import Y.AAListenerS136S0300000_11;
import Y.AAListenerS322S0100000_11;
import Y.AAListenerS50S0210000_11;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RlY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC705300RlY<T extends AbstractC704860Rkq<?>> extends AbstractC705030Rl7<T> {
    public final Function0<Unit> LJIILJJIL;
    public String LJIILL;

    public final void LJIJ(ViewGroup viewGroup, float f, ViewGroup viewGroup2, boolean z, Function0<Unit> function0) {
        ValueAnimator valueAnimatorLIZ;
        if (Intrinsics.LJFF(this.LJIILL, "enter")) {
            function0.invoke();
            return;
        }
        if (C299640Boo.LIZ()) {
            this.LJIILL = "enter";
            if (z) {
                if (viewGroup != null) {
                    ValueAnimator valueAnimatorLIZ2 = C705520Rlu.LIZ(viewGroup, f);
                    valueAnimatorLIZ2.addListener(new AAListenerS322S0100000_11(function0, 32));
                    valueAnimatorLIZ2.start();
                    return;
                }
                return;
            }
            if (viewGroup != null) {
                C786410Ut5.LJLZ(0, viewGroup);
                C786410Ut5.bd(0.0f, viewGroup);
            }
            function0.invoke();
            return;
        }
        this.LJIILL = "enter";
        if (z) {
            if (viewGroup == null || (valueAnimatorLIZ = C705520Rlu.LIZ(viewGroup, f)) == null) {
                return;
            }
            valueAnimatorLIZ.addListener(new AAListenerS136S0300000_11(viewGroup2, viewGroup, function0, 6));
            valueAnimatorLIZ.start();
            return;
        }
        if (viewGroup != null) {
            C786410Ut5.bd(0.0f, viewGroup);
        }
        function0.invoke();
    }

    public final void LJIJI(ViewGroup viewGroup, float f, boolean z, Function0<Unit> function0, boolean z2) {
        Function0<Unit> function02;
        ValueAnimator valueAnimatorLIZIZ;
        if (!Intrinsics.LJFF(this.LJIILL, "enter")) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        this.LJIILL = "exit";
        if (z) {
            if (viewGroup != null && (valueAnimatorLIZIZ = C705520Rlu.LIZIZ(viewGroup, f)) != null) {
                valueAnimatorLIZIZ.addListener(new AAListenerS50S0210000_11(function0, z2, this, 1));
                valueAnimatorLIZIZ.start();
                return;
            }
            return;
        }
        if (function0 != null) {
            function0.invoke();
        }
        if (!z2 || (function02 = this.LJIILJJIL) == null) {
            return;
        }
        function02.invoke();
    }

    public AbstractC705300RlY(Context context, String str, String str2, String str3, ViewGroup viewGroup, View view, C704840Rko c704840Rko, Function0<Unit> function0) {
        super(context, str, str2, str3, viewGroup, view, c704840Rko);
        this.LJIILJJIL = function0;
        this.LJIILL = "";
    }
}
