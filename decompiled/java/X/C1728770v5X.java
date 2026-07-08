package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v5X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.utils.BillboardImageEffectHelper$cancelEffect$lastUseEffectRecord$1", f = "BillboardImageEffectHelper.kt", l = {}, m = "invokeSuspend")
public final class C1728770v5X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1729210v6F>, Object> {
    public final /* synthetic */ C1728760v5W LL;
    public final /* synthetic */ EffectRootData LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728770v5X(C1728760v5W c1728760v5W, EffectRootData effectRootData, InterfaceC1364105Vn<? super C1728770v5X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1728760v5W;
        this.LLILLJJLI = effectRootData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728770v5X(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("BillboardImageEffectHelper@3558.cancelEffect$lastUseEffectRecord$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1729210v6F c1729210v6FLJLZ = null;
        try {
            EffectRootData effectRootData = this.LLILLJJLI;
            if (effectRootData != null) {
                str = effectRootData.authorId;
            } else {
                str = null;
            }
            c1729210v6FLJLZ = C1728830v5d.LJLZ(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1C7U.LIZIZ("BillboardImageEffectHelper@3558.cancelEffect$lastUseEffectRecord$1");
        return c1729210v6FLJLZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1729210v6F> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
