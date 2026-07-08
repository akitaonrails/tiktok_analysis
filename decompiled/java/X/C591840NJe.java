package X;

import android.text.TextUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NJe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.reactive.UserCanceledReactiveAccountImpl$handleReactiveClick$1$onError$1", f = "UserCanceledReactiveAccountImpl.kt", l = {}, m = "invokeSuspend")
public final class C591840NJe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Runnable LL;
    public final /* synthetic */ C0XYI LLILLJJLI;
    public final /* synthetic */ C0XYK LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C591840NJe(Runnable runnable, C0XYI c0xyi, C0XYK c0xyk, InterfaceC1364105Vn<? super C591840NJe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = runnable;
        this.LLILLJJLI = c0xyi;
        this.LLILLL = c0xyk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591840NJe(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserCanceledReactiveAccountImpl@11f3.handleReactiveClick$1$onError$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Runnable runnable = this.LL;
        if (runnable != null) {
            runnable.run();
        }
        C0XYI c0xyi = this.LLILLJJLI;
        C0XYK c0xyk = this.LLILLL;
        c0xyi.getClass();
        String strLIZ = C849760XVe.LIZ(c0xyk);
        if (!TextUtils.isEmpty(strLIZ) && strLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c0xyi.LIZ);
            c1389890mGx.LJIIJ(strLIZ);
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserCanceledReactiveAccountImpl@11f3.handleReactiveClick$1$onError$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
