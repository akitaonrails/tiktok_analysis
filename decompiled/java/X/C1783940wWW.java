package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wWW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageChunkProxy$processChunksWithCoroutine$1", f = "MessageChunkProxy.kt", l = {507}, m = "invokeSuspend")
public final class C1783940wWW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ List<C1785080wYM> LLILZ;
    public final /* synthetic */ C1785070wYL LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783940wWW(List<C1785080wYM> list, C1785070wYL c1785070wYL, InterfaceC1364105Vn<? super C1783940wWW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = list;
        this.LLILZIL = c1785070wYL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1783940wWW(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterator<C1785080wYM> it2;
        int i;
        C1C7U.LIZ("MessageChunkProxy@dc87.processChunksWithCoroutine$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILLL;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.LLILLJJLI;
                it2 = (Iterator) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            it2 = this.LLILZ.iterator();
            i = 0;
        }
        while (it2.hasNext()) {
            int i3 = i + 1;
            C1785080wYM next = it2.next();
            int i4 = next.LIZ.event;
            if (i4 != 4) {
                if (i4 != 5) {
                    this.LLILZIL.LJIIJ(next, "processChunksWithCoroutine else");
                } else {
                    this.LLILZIL.LJIIJ(next, "processChunksWithCoroutine completed");
                    this.LLILZIL.LJIIIIZZ();
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MessageChunkProxy@dc87.processChunksWithCoroutine$1");
                    return unit;
                }
            } else {
                this.LLILZIL.LJIIJ(next, "processChunksWithCoroutine patch");
            }
            if (i < this.LLILZ.size() - 1) {
                long j = this.LLILZIL.LJIIIIZZ;
                this.LL = it2;
                this.LLILLJJLI = i3;
                this.LLILLL = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("MessageChunkProxy@dc87.processChunksWithCoroutine$1");
                    return objLJFF;
                }
            }
            i = i3;
        }
        this.LLILZIL.LJIIIIZZ();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MessageChunkProxy@dc87.processChunksWithCoroutine$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
