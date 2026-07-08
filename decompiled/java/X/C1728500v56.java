package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v56, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.UseLiveEffectHelper$cancelEffect$lastUseEffectRecord$1", f = "UseLiveEffectHelper.kt", l = {}, m = "invokeSuspend")
public final class C1728500v56 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1729110v65>, Object> {
    public final /* synthetic */ C1728720v5S LL;
    public final /* synthetic */ RootData LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728500v56(C1728720v5S c1728720v5S, RootData rootData, InterfaceC1364105Vn<? super C1728500v56> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1728720v5S;
        this.LLILLJJLI = rootData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728500v56(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("UseLiveEffectHelper@a681.cancelEffect$lastUseEffectRecord$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1729110v65 c1729110v65LJLZ = null;
        try {
            RootData rootData = this.LLILLJJLI;
            if (rootData != null) {
                str = rootData.authorId;
            } else {
                str = null;
            }
            c1729110v65LJLZ = C1728940v5o.LJLZ(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1C7U.LIZIZ("UseLiveEffectHelper@a681.cancelEffect$lastUseEffectRecord$1");
        return c1729110v65LJLZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1729110v65> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
