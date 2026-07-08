package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uRq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.BillboardBannerEffectHelper$realDisplayBanner$imageFilepath$1", f = "BillboardBannerEffectHelper.kt", l = {97}, m = "invokeSuspend")
public final class C1704160uRq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1704160uRq(String str, InterfaceC1364105Vn<? super C1704160uRq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1704160uRq(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("BillboardBannerEffectHelper@f22d.realDisplayBanner$imageFilepath$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (C123100dR.LIZ(this.LLILLJJLI)) {
                String str2 = this.LLILLJJLI;
                this.LL = 1;
                obj = C1731360v9i.LIZIZ(str2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BillboardBannerEffectHelper@f22d.realDisplayBanner$imageFilepath$1");
                    return objLJFF;
                }
            }
            str = null;
            C1C7U.LIZIZ("BillboardBannerEffectHelper@f22d.realDisplayBanner$imageFilepath$1");
            return str;
        }
        str = (String) obj;
        C1C7U.LIZIZ("BillboardBannerEffectHelper@f22d.realDisplayBanner$imageFilepath$1");
        return str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
