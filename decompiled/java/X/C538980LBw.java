package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0LBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538980LBw extends C1619110sEf implements InterfaceC19330810jy {
    public final Function1<InnerPushMessage, Boolean> LL;
    public final Function1<InnerPushMessage, Boolean> LLILLJJLI;
    public final Function1<InnerPushMessage, Unit> LLILLL;
    public final Function1<InnerPushMessage, Unit> LLILZ;
    public final int[] LLILZIL;
    public InterfaceC539120LCk LLILZLL;

    public C538980LBw() {
        this(null, null, null, null);
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return this.LLILZIL;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LIZIZ(InnerPushMessage innerPushMessage) {
        Function1<InnerPushMessage, Unit> function1 = this.LLILLL;
        if (function1 != null) {
            function1.invoke(innerPushMessage);
        }
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        Function1<InnerPushMessage, Boolean> function1 = this.LLILLJJLI;
        if (function1 != null && function1.invoke(innerPushMessage).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        Function1<InnerPushMessage, Boolean> function1 = this.LL;
        if (function1 == null || !function1.invoke(innerPushMessage).booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        this.LLILZLL = c20663515tR;
        return null;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIL(int i, InnerPushMessage innerPushMessage) {
        Function1<InnerPushMessage, Unit> function1 = this.LLILZ;
        if (function1 != null) {
            function1.invoke(innerPushMessage);
        }
        InterfaceC539120LCk interfaceC539120LCk = this.LLILZLL;
        if (interfaceC539120LCk != null) {
            interfaceC539120LCk.LIZIZ("click", null, true);
        }
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIJ(InnerPushMessage innerPushMessage, boolean z, String str) {
        this.LLILZLL = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C538980LBw(Function1<? super InnerPushMessage, Boolean> function1, Function1<? super InnerPushMessage, Boolean> function12, Function1<? super InnerPushMessage, Unit> function13, Function1<? super InnerPushMessage, Unit> function14) {
        this.LL = function1;
        this.LLILLJJLI = function12;
        this.LLILLL = function13;
        this.LLILZ = function14;
        this.LLILZIL = new int[]{120};
    }
}
