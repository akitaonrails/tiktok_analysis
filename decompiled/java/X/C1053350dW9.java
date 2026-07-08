package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.history.AdWebHistoryFragment;
import com.ss.android.ugc.aweme.history.model.AdWebHistoryAdInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS382S0200000_16;
import njp.a;

/* JADX INFO: renamed from: X.0dW9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.history.AdWebHistoryFragment$logOnItemClickNormal$1", f = "AdWebHistoryFragment.kt", l = {}, m = "invokeSuspend")
public final class C1053350dW9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1053410dWF LL;
    public final /* synthetic */ AdWebHistoryFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1053350dW9(AdWebHistoryFragment adWebHistoryFragment, C1053410dWF c1053410dWF, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1053410dWF;
        this.LLILLJJLI = adWebHistoryFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1053350dW9(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("AdWebHistoryFragment@bd5c.logOnItemClickNormal$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            AdWebHistoryAdInfo adWebHistoryAdInfo = this.LL.LJFF;
            if (adWebHistoryAdInfo != null) {
                str = adWebHistoryAdInfo.rawAdData;
            } else {
                str = null;
            }
            c1227904rF.getClass();
            new C1053380dWC(this.LL).logAd(C1053360dWA.LIZ, (AwemeRawAd) C1227904rF.LIZIZ(str, AwemeRawAd.class), new AwS382S0200000_16(this.LLILLJJLI, this.LL, 96));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdWebHistoryFragment@bd5c.logOnItemClickNormal$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
