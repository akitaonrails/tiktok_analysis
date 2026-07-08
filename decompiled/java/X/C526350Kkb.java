package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kkb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.nextstep.AlbumNextStepComponent$dispatchNextStep$1", f = "AlbumNextStepComponent.kt", l = {126}, m = "invokeSuspend")
public final class C526350Kkb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C526120KkE LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526350Kkb(C526120KkE c526120KkE, InterfaceC1364105Vn<? super C526350Kkb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c526120KkE;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C526350Kkb(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AlbumNextStepComponent@657a.dispatchNextStep$1");
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
            C05YC<Object> c05yc = this.LLILLJJLI.LLIZLLLIL;
            C526440Kkk c526440Kkk = new Object() { // from class: X.0Kkk
                public final boolean equals(Object obj2) {
                    return this == obj2 || (obj2 instanceof C526440Kkk);
                }

                public final int hashCode() {
                    return -419036681;
                }

                public final String toString() {
                    return "Skip";
                }
            };
            this.LL = 1;
            if (c05yc.emit(c526440Kkk, this) == objLJFF) {
                C1C7U.LIZIZ("AlbumNextStepComponent@657a.dispatchNextStep$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AlbumNextStepComponent@657a.dispatchNextStep$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
