package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: renamed from: X.13Kl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", f = "OrderedScatterSet.kt", l = {1489}, m = "invokeSuspend")
public final class C19992913Kl<E> extends C09AW implements Function2<AbstractC1421005hI<? super E>, InterfaceC1364105Vn<? super Unit>, Object> {
    public C19993113Kn LLILLJJLI;
    public C19992813Kk LLILLL;
    public long[] LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C19992813Kk<E> LLIZLLLIL;
    public final /* synthetic */ C19993113Kn LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19992913Kl(C19992813Kk<E> c19992813Kk, C19993113Kn c19993113Kn, InterfaceC1364105Vn<? super C19992913Kl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = c19992813Kk;
        this.LLJ = c19993113Kn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C19992913Kl c19992913Kl = new C19992913Kl(this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c19992913Kl.LLIZ = obj;
        return c19992913Kl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1421005hI abstractC1421005hI;
        C19992813Kk<E> c19992813Kk;
        C19993113Kn c19993113Kn;
        long[] jArr;
        int i;
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILZLL;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.LLILZIL;
                jArr = this.LLILZ;
                c19992813Kk = this.LLILLL;
                c19993113Kn = this.LLILLJJLI;
                abstractC1421005hI = (AbstractC1421005hI) this.LLIZ;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            abstractC1421005hI = (AbstractC1421005hI) this.LLIZ;
            c19992813Kk = this.LLIZLLLIL;
            C19992713Kj<E> c19992713Kj = c19992813Kk.LLILLJJLI;
            c19993113Kn = this.LLJ;
            jArr = c19992713Kj.LIZJ;
            i = c19992713Kj.LJ;
        }
        while (i != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            c19993113Kn.LL = i;
            Object obj2 = c19992813Kk.LLILLJJLI.LIZIZ[i];
            this.LLIZ = abstractC1421005hI;
            this.LLILLJJLI = c19993113Kn;
            this.LLILLL = c19992813Kk;
            this.LLILZ = jArr;
            this.LLILZIL = i3;
            this.LLILZLL = 1;
            if (abstractC1421005hI.LIZ(obj2, this) == objLJFF) {
                return objLJFF;
            }
            i = i3;
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
