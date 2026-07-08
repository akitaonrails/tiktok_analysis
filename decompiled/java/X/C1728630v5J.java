package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v5J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.utils.SeaLiveBillboardImageEffectHelper$cancelEffect$lastUseEffectRecord$1", f = "SeaLiveBillboardImageEffectHelper.kt", l = {}, m = "invokeSuspend")
public final class C1728630v5J extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1729160v6A>, Object> {
    public final /* synthetic */ C1728650v5L LL;
    public final /* synthetic */ SeaLiveEffectRootData LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728630v5J(C1728650v5L c1728650v5L, SeaLiveEffectRootData seaLiveEffectRootData, InterfaceC1364105Vn<? super C1728630v5J> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1728650v5L;
        this.LLILLJJLI = seaLiveEffectRootData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728630v5J(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("SeaLiveBillboardImageEffectHelper@6ebc.cancelEffect$lastUseEffectRecord$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1729160v6A c1729160v6ALJLZ = null;
        try {
            SeaLiveEffectRootData seaLiveEffectRootData = this.LLILLJJLI;
            if (seaLiveEffectRootData != null) {
                str = seaLiveEffectRootData.authorId;
            } else {
                str = null;
            }
            c1729160v6ALJLZ = C1728670v5N.LJLZ(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1C7U.LIZIZ("SeaLiveBillboardImageEffectHelper@6ebc.cancelEffect$lastUseEffectRecord$1");
        return c1729160v6ALJLZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1729160v6A> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
