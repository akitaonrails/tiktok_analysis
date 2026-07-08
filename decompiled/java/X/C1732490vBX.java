package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vBX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.SeaLiveEffectBillboardDisplayHelper$handleBanner$1", f = "SeaLiveEffectBillboardDisplayHelper.kt", l = {290, 296}, m = "invokeSuspend")
public final class C1732490vBX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ InterfaceC1732650vBn LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1732490vBX(boolean z, String str, String str2, String str3, String str4, String str5, InterfaceC1732650vBn interfaceC1732650vBn, String str6, InterfaceC1364105Vn<? super C1732490vBX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = interfaceC1732650vBn;
        this.LLJ = str6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1732490vBX(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaLiveEffectBillboardDisplayHelper@d078.handleBanner$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI) {
                C1732390vBN c1732390vBN = C1732390vBN.LIZ;
                SeaLiveEffectRootData seaLiveEffectRootData = new SeaLiveEffectRootData(this.LLILLL, this.LLILZ, (Map) null, this.LLILZIL, this.LLILZLL, 36);
                String str = this.LLIZ;
                InterfaceC1732650vBn interfaceC1732650vBn = this.LLIZLLLIL;
                String str2 = this.LLJ;
                this.LL = 1;
                if (c1732390vBN.LJ(seaLiveEffectRootData, str, interfaceC1732650vBn, str2, this) == objLJFF) {
                    C1C7U.LIZIZ("SeaLiveEffectBillboardDisplayHelper@d078.handleBanner$1");
                    return objLJFF;
                }
            } else {
                C1732390vBN c1732390vBN2 = C1732390vBN.LIZ;
                SeaLiveEffectRootData seaLiveEffectRootData2 = new SeaLiveEffectRootData(this.LLILLL, this.LLILZ, (Map) null, this.LLILZIL, this.LLILZLL, 36);
                InterfaceC1732650vBn interfaceC1732650vBn2 = this.LLIZLLLIL;
                this.LL = 2;
                if (c1732390vBN2.LIZIZ(seaLiveEffectRootData2, interfaceC1732650vBn2, this) == objLJFF) {
                    C1C7U.LIZIZ("SeaLiveEffectBillboardDisplayHelper@d078.handleBanner$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaLiveEffectBillboardDisplayHelper@d078.handleBanner$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
