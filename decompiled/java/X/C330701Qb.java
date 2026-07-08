package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Qb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.asyncedit.AsyncTaskAnimUtils$showAnimationFlow$alphaFlow$1", f = "AsyncTaskAnimUtils.kt", l = {70, 71}, m = "invokeSuspend")
public final class C330701Qb extends C09AX implements Function2<InterfaceC346701Wf<? super Float>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa<Float> LLILLL;
    public final /* synthetic */ InterfaceC346201Wa<Float> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330701Qb(InterfaceC346201Wa<Float> interfaceC346201Wa, InterfaceC346201Wa<Float> interfaceC346201Wa2, InterfaceC1364105Vn<? super C330701Qb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC346201Wa;
        this.LLILZ = interfaceC346201Wa2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C330701Qb c330701Qb = new C330701Qb(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c330701Qb.LLILLJJLI = obj;
        return c330701Qb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        C1C7U.LIZ("AsyncTaskAnimUtils@8dc0.showAnimationFlow$alphaFlow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AsyncTaskAnimUtils@8dc0.showAnimationFlow$alphaFlow$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            InterfaceC346201Wa<Float> interfaceC346201Wa = this.LLILLL;
            this.LLILLJJLI = interfaceC346701Wf;
            this.LL = 1;
            if (C09IC.LJIILLIIL(this, interfaceC346201Wa, interfaceC346701Wf) == objLJFF) {
                C1C7U.LIZIZ("AsyncTaskAnimUtils@8dc0.showAnimationFlow$alphaFlow$1");
                return objLJFF;
            }
        }
        InterfaceC346201Wa<Float> interfaceC346201Wa2 = this.LLILZ;
        this.LLILLJJLI = null;
        this.LL = 2;
        if (C09IC.LJIILLIIL(this, interfaceC346201Wa2, interfaceC346701Wf) == objLJFF) {
            C1C7U.LIZIZ("AsyncTaskAnimUtils@8dc0.showAnimationFlow$alphaFlow$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AsyncTaskAnimUtils@8dc0.showAnimationFlow$alphaFlow$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super Float> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
