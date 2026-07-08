package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0LBr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538930LBr implements InterfaceC19330810jy {
    public static final /* synthetic */ int LLILZIL = 0;
    public final Function1<InnerPushMessage, Boolean> LL;
    public final Function2<InterfaceC539120LCk, InnerPushMessage, C20663815tU> LLILLJJLI;
    public InterfaceC539120LCk LLILLL;
    public final int[] LLILZ;

    public C538930LBr() {
        this(null, null);
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
        return this.LLILZ;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        Function1<InnerPushMessage, Boolean> function1 = this.LL;
        if (function1 != null) {
            return function1.invoke(innerPushMessage).booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        return !C0LCK.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C538930LBr(Function1<? super InnerPushMessage, Boolean> function1, Function2<? super InterfaceC539120LCk, ? super InnerPushMessage, C20663815tU> function2) {
        this.LL = function1;
        this.LLILLJJLI = function2;
        this.LLILZ = new int[]{117, 2500};
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        Function2<InterfaceC539120LCk, InnerPushMessage, C20663815tU> function2;
        this.LLILLL = c20663515tR;
        if (innerPushMessage != null && (function2 = this.LLILLJJLI) != null) {
            return function2.invoke(c20663515tR, innerPushMessage);
        }
        return null;
    }
}
