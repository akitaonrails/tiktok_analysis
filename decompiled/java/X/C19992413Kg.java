package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: renamed from: X.13Kg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.collection.OrderedSetWrapper$iterator$1", f = "OrderedScatterSet.kt", l = {1454}, m = "invokeSuspend")
public final class C19992413Kg<E> extends C09AW implements Function2<AbstractC1421005hI<? super E>, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LLILLJJLI;
    public long[] LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C19992313Kf<E> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19992413Kg(C19992313Kf<E> c19992313Kf, InterfaceC1364105Vn<? super C19992413Kg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c19992313Kf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C19992413Kg c19992413Kg = new C19992413Kg(this.LLIZ, interfaceC1364105Vn);
        c19992413Kg.LLILZLL = obj;
        return c19992413Kg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1421005hI abstractC1421005hI;
        Object[] objArr;
        long[] jArr;
        int i;
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.LLILZ;
                jArr = this.LLILLL;
                objArr = (Object[]) this.LLILLJJLI;
                abstractC1421005hI = (AbstractC1421005hI) this.LLILZLL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            abstractC1421005hI = (AbstractC1421005hI) this.LLILZLL;
            AbstractC19992513Kh<E> abstractC19992513Kh = this.LLIZ.LL;
            objArr = abstractC19992513Kh.LIZIZ;
            jArr = abstractC19992513Kh.LIZJ;
            i = abstractC19992513Kh.LJ;
        }
        while (i != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj2 = objArr[i];
            this.LLILZLL = abstractC1421005hI;
            this.LLILLJJLI = objArr;
            this.LLILLL = jArr;
            this.LLILZ = i3;
            this.LLILZIL = 1;
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
