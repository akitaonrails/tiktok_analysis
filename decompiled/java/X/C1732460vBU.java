package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS1S2301000_26;
import kotlin.jvm.internal.AwS22S1201000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vBU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.SeaLiveEffectBillboardDisplayHelper$cancelBillboard$1", f = "SeaLiveEffectBillboardDisplayHelper.kt", l = {162}, m = "invokeSuspend")
public final class C1732460vBU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SeaLiveEffectRootData LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ InterfaceC1732650vBn LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1732460vBU(SeaLiveEffectRootData seaLiveEffectRootData, String str, int i, String str2, InterfaceC1732650vBn interfaceC1732650vBn, InterfaceC1364105Vn<? super C1732460vBU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = seaLiveEffectRootData;
        this.LLILZ = str;
        this.LLILZIL = i;
        this.LLILZLL = str2;
        this.LLIZ = interfaceC1732650vBn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1732460vBU c1732460vBU = new C1732460vBU(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1732460vBU.LLILLJJLI = obj;
        return c1732460vBU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaLiveEffectBillboardDisplayHelper@d078.cancelBillboard$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1732390vBN c1732390vBN = C1732390vBN.LIZ;
            SeaLiveEffectRootData seaLiveEffectRootData = this.LLILLL;
            AwS1S2301000_26 awS1S2301000_26 = new AwS1S2301000_26(seaLiveEffectRootData, interfaceC497601wk, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, 0);
            AwS22S1201000_26 awS22S1201000_26 = new AwS22S1201000_26(interfaceC497601wk, this.LLILZ, this.LLILZIL, this.LLIZ, 1);
            this.LL = 1;
            if (c1732390vBN.LIZLLL(seaLiveEffectRootData, awS1S2301000_26, awS22S1201000_26, this) == objLJFF) {
                C1C7U.LIZIZ("SeaLiveEffectBillboardDisplayHelper@d078.cancelBillboard$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaLiveEffectBillboardDisplayHelper@d078.cancelBillboard$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
