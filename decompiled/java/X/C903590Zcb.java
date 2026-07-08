package X;

import com.bytedance.assem.arch.view.UIContentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS450S0200000_14;

/* JADX INFO: renamed from: X.0Zcb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903590Zcb {
    public final Function1<UIContentAssem, Unit> LIZ;
    public final Function2<UIContentAssem, ViewOnAttachStateChangeListenerC20604515jv, Unit> LIZIZ;
    public final Function2<UIContentAssem, ViewOnAttachStateChangeListenerC20604515jv, Unit> LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C903590Zcb() {
        this(7, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
    }

    public final C903590Zcb LIZ(C903590Zcb c903590Zcb) {
        if (c903590Zcb == null) {
            return this;
        }
        Function1<UIContentAssem, Unit> awS380S0200000_14 = this.LIZ;
        Function2<UIContentAssem, ViewOnAttachStateChangeListenerC20604515jv, Unit> awS450S0200000_14 = this.LIZIZ;
        Function2<UIContentAssem, ViewOnAttachStateChangeListenerC20604515jv, Unit> awS450S0200000_142 = this.LIZJ;
        Function1<UIContentAssem, Unit> function1 = c903590Zcb.LIZ;
        Function2<UIContentAssem, ViewOnAttachStateChangeListenerC20604515jv, Unit> function2 = c903590Zcb.LIZIZ;
        Function2<UIContentAssem, ViewOnAttachStateChangeListenerC20604515jv, Unit> function22 = c903590Zcb.LIZJ;
        if (awS380S0200000_14 != null) {
            if (function1 != null) {
                awS380S0200000_14 = new AwS380S0200000_14(awS380S0200000_14, function1, (Function1<? super UIContentAssem, Unit>) 112);
            }
        } else {
            awS380S0200000_14 = function1;
        }
        if (awS450S0200000_14 != null) {
            if (function2 != null) {
                awS450S0200000_14 = new AwS450S0200000_14(awS450S0200000_14, function2, (Function2<? super UIContentAssem, ? super ViewOnAttachStateChangeListenerC20604515jv, Unit>) 22);
            }
        } else {
            awS450S0200000_14 = function2;
        }
        if (awS450S0200000_142 != null) {
            if (function22 != null) {
                awS450S0200000_142 = new AwS450S0200000_14(awS450S0200000_142, function22, (Function2<? super UIContentAssem, ? super ViewOnAttachStateChangeListenerC20604515jv, Unit>) 23);
            }
        } else {
            awS450S0200000_142 = function22;
        }
        return new C903590Zcb(awS380S0200000_14, awS450S0200000_14, awS450S0200000_142);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C903590Zcb(Function1<? super UIContentAssem, Unit> function1, Function2<? super UIContentAssem, ? super ViewOnAttachStateChangeListenerC20604515jv, Unit> function2, Function2<? super UIContentAssem, ? super ViewOnAttachStateChangeListenerC20604515jv, Unit> function22) {
        this.LIZ = function1;
        this.LIZIZ = function2;
        this.LIZJ = function22;
    }

    public /* synthetic */ C903590Zcb(int i, Function1 function1, Function2 function2, Function2 function22) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function2, (i & 4) != 0 ? null : function22);
    }
}
