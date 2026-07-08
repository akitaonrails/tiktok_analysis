package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XX8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity$handleSuccess$2", f = "SignUpOrLoginActivity.kt", l = {}, m = "invokeSuspend")
public final class C0XX8 extends C09AX implements Function2<C0XVI, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SignUpOrLoginActivity LLILLJJLI;
    public final /* synthetic */ BaseAccountFlowFragment LLILLL;
    public final /* synthetic */ Bundle LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0XX8(SignUpOrLoginActivity signUpOrLoginActivity, BaseAccountFlowFragment baseAccountFlowFragment, Bundle bundle, InterfaceC1364105Vn<? super C0XX8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = signUpOrLoginActivity;
        this.LLILLL = baseAccountFlowFragment;
        this.LLILZ = bundle;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0XX8 c0xx8 = new C0XX8(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0xx8.LL = obj;
        return c0xx8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SignUpOrLoginActivity@7602.handleSuccess$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0XVC.LIZIZ("CustomizedHook", null, (C0XVI) this.LL);
        this.LLILLJJLI.LLLZIL(this.LLILLL, this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SignUpOrLoginActivity@7602.handleSuccess$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0XVI c0xvi, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0xvi, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
