package X;

import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01iP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.envelope.presenter.RedEnvelopePresenter$handleEvent$3", f = "RedEnvelopePresenter.kt", l = {278}, m = "invokeSuspend")
public final class C408701iP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C408701iP(InterfaceC1364105Vn<? super C408701iP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C408701iP(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IWalletCenter iWalletCenterWalletCenter;
        C1C7U.LIZ("RedEnvelopePresenter@3e12.handleEvent$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("RedEnvelopePresenter@3e12.handleEvent$3");
                return objLJFF;
            }
        }
        IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
        if (iWalletService != null && (iWalletCenterWalletCenter = iWalletService.walletCenter()) != null) {
            iWalletCenterWalletCenter.Ri2(EnumC1805420x5A.RED_ENVELOPE_MSG);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RedEnvelopePresenter@3e12.handleEvent$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C408701iP(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
