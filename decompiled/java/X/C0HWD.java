package X;

import com.ss.android.ugc.profile.business.ur.platform.AccountModifyUserNameProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HWD, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.platform.AccountModifyUserNameProtocol$showTTChangeUsernameBubble$1$1$2", f = "AccountModifyUserNameProtocol.kt", l = {}, m = "invokeSuspend")
public final class C0HWD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AccountModifyUserNameProtocol LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HWD(AccountModifyUserNameProtocol accountModifyUserNameProtocol, InterfaceC1364105Vn<? super C0HWD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = accountModifyUserNameProtocol;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HWD(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AccountModifyUserNameProtocol@dd9d.showTTChangeUsernameBubble$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0P0T c0p0t = this.LL.LLJJJJJIL;
        if (c0p0t != null) {
            c0p0t.show();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AccountModifyUserNameProtocol@dd9d.showTTChangeUsernameBubble$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
