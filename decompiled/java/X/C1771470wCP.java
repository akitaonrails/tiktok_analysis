package X;

import Y.ARunnableS81S0200000_12;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wCP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallRepository$requestChunk$1$2", f = "ShopMallRepository.kt", l = {}, m = "invokeSuspend")
public final class C1771470wCP extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super C1771660wCi>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<AbstractC1771170wBv> LL;
    public final /* synthetic */ C1771500wCS LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C1771590wCb LLILZ;
    public final /* synthetic */ InterfaceC1773310wFN LLILZIL;
    public final /* synthetic */ C259800zU<Integer> LLILZLL;
    public final /* synthetic */ C259800zU<String> LLIZ;
    public final /* synthetic */ C013C LLIZLLLIL;
    public final /* synthetic */ C259800zU<String> LLJ;
    public final /* synthetic */ Function1<AbstractC1771170wBv, Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1771470wCP(C259800zU<AbstractC1771170wBv> c259800zU, C1771500wCS c1771500wCS, long j, C1771590wCb c1771590wCb, InterfaceC1773310wFN interfaceC1773310wFN, C259800zU<Integer> c259800zU2, C259800zU<String> c259800zU3, C013C c013c, C259800zU<String> c259800zU4, Function1<? super AbstractC1771170wBv, Unit> function1, InterfaceC1364105Vn<? super C1771470wCP> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = c1771500wCS;
        this.LLILLL = j;
        this.LLILZ = c1771590wCb;
        this.LLILZIL = interfaceC1773310wFN;
        this.LLILZLL = c259800zU2;
        this.LLIZ = c259800zU3;
        this.LLIZLLLIL = c013c;
        this.LLJ = c259800zU4;
        this.LLJI = function1;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super C1771660wCi> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1771470wCP(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1771480wCQ c1771480wCQ;
        C1C7U.LIZ("ShopMallRepository@92e8.requestChunk$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1771170wBv abstractC1771170wBv = this.LL.element;
        int iIntValue = 0;
        if ((abstractC1771170wBv instanceof C1771480wCQ) && (c1771480wCQ = (C1771480wCQ) abstractC1771170wBv) != null && c1771480wCQ.LIZIZ == null) {
            Boolean.valueOf(C786410Ut5.LJJZZIII(this.LLILLJJLI.LIZJ, new ARunnableS81S0200000_12(c1771480wCQ, this.LLJI, 51)));
        }
        C1771500wCS c1771500wCS = this.LLILLJJLI;
        long j = this.LLILLL;
        C1771590wCb c1771590wCb = this.LLILZ;
        InterfaceC1773310wFN interfaceC1773310wFN = this.LLILZIL;
        Integer num = this.LLILZLL.element;
        if (num != null) {
            iIntValue = num.intValue();
        }
        String str = this.LLIZ.element;
        AbstractC1771170wBv abstractC1771170wBv2 = this.LL.element;
        c1771500wCS.getClass();
        C1771500wCS.LJIJ(j, c1771590wCb, interfaceC1773310wFN, iIntValue, str, abstractC1771170wBv2);
        C1771500wCS c1771500wCS2 = this.LLILLJJLI;
        C1771590wCb c1771590wCb2 = this.LLILZ;
        boolean z = this.LLIZLLLIL.element;
        String str2 = this.LLJ.element;
        c1771500wCS2.getClass();
        C1771500wCS.LJIIZILJ(c1771590wCb2, str2, z);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMallRepository@92e8.requestChunk$1$2");
        return unit;
    }
}
