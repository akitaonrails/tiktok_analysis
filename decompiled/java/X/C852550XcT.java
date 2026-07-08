package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.model.SafeEnvData;
import com.ss.android.ugc.aweme.account.model.SafeEnvV2Response;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment$performIDVCheck$1$1$1", f = "BaseUpdatePasswordFragment.kt", l = {}, m = "invokeSuspend")
public final class C852550XcT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SafeEnvV2Response LL;
    public final /* synthetic */ BaseUpdatePasswordFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C852550XcT(SafeEnvV2Response safeEnvV2Response, BaseUpdatePasswordFragment baseUpdatePasswordFragment, InterfaceC1364105Vn<? super C852550XcT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = safeEnvV2Response;
        this.LLILLJJLI = baseUpdatePasswordFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C852550XcT(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C19EG activity;
        C1C7U.LIZ("BaseUpdatePasswordFragment@1cae.performIDVCheck$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SafeEnvData safeEnvData = this.LL.data;
        if (safeEnvData != null) {
            BaseUpdatePasswordFragment baseUpdatePasswordFragment = this.LLILLJJLI;
            if (safeEnvData.errorCode == 2135 && (activity = baseUpdatePasswordFragment.getActivity()) != null) {
                activity.finish();
            }
            Bundle arguments = baseUpdatePasswordFragment.getArguments();
            if (arguments != null) {
                C786410Ut5.LJJJI("passport_ticket", safeEnvData.passportTicket, arguments);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseUpdatePasswordFragment@1cae.performIDVCheck$1$1$1");
        return unit;
    }
}
