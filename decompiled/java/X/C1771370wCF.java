package X;

import android.text.TextUtils;
import com.google.gson.n;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0wCF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallRepository$request$2$4", f = "ShopMallRepository.kt", l = {283}, m = "invokeSuspend")
public final class C1771370wCF extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1771590wCb LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C259800zU<Map<String, Object>> LLILZ;
    public final /* synthetic */ C1771500wCS LLILZIL;
    public final /* synthetic */ InterfaceC1773310wFN LLILZLL;
    public final /* synthetic */ EnumC1771830wCz LLIZ;
    public final /* synthetic */ C1773140wF6 LLIZLLLIL;
    public final /* synthetic */ n LLJ;
    public final /* synthetic */ C094D<AbstractC1771170wBv> LLJI;
    public final /* synthetic */ Function1<AbstractC1771170wBv, Unit> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1771370wCF(C1771590wCb c1771590wCb, boolean z, C259800zU<Map<String, Object>> c259800zU, C1771500wCS c1771500wCS, InterfaceC1773310wFN interfaceC1773310wFN, EnumC1771830wCz enumC1771830wCz, C1773140wF6 c1773140wF6, n nVar, C094D<? super AbstractC1771170wBv> c094d, Function1<? super AbstractC1771170wBv, Unit> function1, InterfaceC1364105Vn<? super C1771370wCF> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1771590wCb;
        this.LLILLL = z;
        this.LLILZ = c259800zU;
        this.LLILZIL = c1771500wCS;
        this.LLILZLL = interfaceC1773310wFN;
        this.LLIZ = enumC1771830wCz;
        this.LLIZLLLIL = c1773140wF6;
        this.LLJ = nVar;
        this.LLJI = c094d;
        this.LLJIJIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1771370wCF(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopMallRepository@92e8.request$2$4");
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
            Map<String, ? extends Object> map = this.LLILLJJLI.LJII;
            if (map != null) {
                n nVar = this.LLJ;
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && value != null) {
                        nVar.LJJIFFI(key, C678560QjW.LJ(value));
                    }
                }
            }
            if (this.LLILLL) {
                C606430NqT c606430NqT = C606430NqT.LIZ;
                Map<String, Object> map2 = this.LLILZ.element;
                C1771590wCb c1771590wCb = this.LLILLJJLI;
                Map<String, ? extends Object> map3 = c1771590wCb.LJII;
                c606430NqT.getClass();
                C606430NqT.LIZIZ(map2, map3, c1771590wCb);
            }
            C1771500wCS c1771500wCS = this.LLILZIL;
            InterfaceC1773310wFN interfaceC1773310wFN = this.LLILZLL;
            EnumC1771830wCz enumC1771830wCz = this.LLIZ;
            C1771590wCb c1771590wCb2 = this.LLILLJJLI;
            C1773140wF6 c1773140wF6 = this.LLIZLLLIL;
            n nVar2 = this.LLJ;
            C094D<AbstractC1771170wBv> c094d = this.LLJI;
            Function1<AbstractC1771170wBv, Unit> function1 = this.LLJIJIL;
            this.LL = 1;
            if (c1771500wCS.LJIIJJI(interfaceC1773310wFN, enumC1771830wCz, c1771590wCb2, c1773140wF6, nVar2, c094d, function1, this) == objLJFF) {
                C1C7U.LIZIZ("ShopMallRepository@92e8.request$2$4");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMallRepository@92e8.request$2$4");
        return unit;
    }
}
