package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallPageDTO;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wCE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel$loadMixChunkData$1$collectChunk$1$3$onNext$4", f = "ShopMallMixViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1771360wCE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ ShopMallMixViewModel LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C259800zU<C1494600ozq<?>> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ C1771590wCb LLIZ;
    public final /* synthetic */ C1515870pY9<ECMixMallPageDTO> LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ JSONObject LLJILJIL;
    public final /* synthetic */ List<C080U> LLJILJILJ;
    public final /* synthetic */ n LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1771360wCE(boolean z, ShopMallMixViewModel shopMallMixViewModel, boolean z2, C259800zU<C1494600ozq<?>> c259800zU, boolean z3, C1771590wCb c1771590wCb, C1515870pY9<ECMixMallPageDTO> c1515870pY9, long j, long j2, boolean z4, JSONObject jSONObject, List<C080U> list, n nVar, InterfaceC1364105Vn<? super C1771360wCE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = shopMallMixViewModel;
        this.LLILZ = z2;
        this.LLILZIL = c259800zU;
        this.LLILZLL = z3;
        this.LLIZ = c1771590wCb;
        this.LLIZLLLIL = c1515870pY9;
        this.LLJ = j;
        this.LLJI = j2;
        this.LLJIJIL = z4;
        this.LLJILJIL = jSONObject;
        this.LLJILJILJ = list;
        this.LLJILLL = nVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1771360wCE c1771360wCE = new C1771360wCE(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
        c1771360wCE.LL = obj;
        return c1771360wCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0223 A[Catch: all -> 0x022a, TRY_LEAVE, TryCatch #3 {all -> 0x022a, blocks: (B:97:0x01f8, B:99:0x01fe, B:100:0x0206, B:102:0x0223, B:101:0x021d), top: B:182:0x01f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0316 A[Catch: all -> 0x035c, TryCatch #5 {all -> 0x035c, blocks: (B:144:0x02db, B:146:0x02e9, B:148:0x02f2, B:150:0x0300, B:152:0x0306, B:153:0x0310, B:155:0x0316, B:161:0x032a, B:163:0x0338, B:165:0x033f, B:169:0x034e, B:170:0x0353, B:171:0x0358), top: B:186:0x02db }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0195  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1771360wCE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
