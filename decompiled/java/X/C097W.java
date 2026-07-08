package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.097W, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.EffectLoadingManager$special$$inlined$flatMapLatest$1", f = "EffectLoadingComponent.kt", l = {193}, m = "invokeSuspend")
public final class C097W extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super Boolean>, C097X, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C097W(InterfaceC1364105Vn interfaceC1364105Vn, long j) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = j;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super Boolean> interfaceC346701Wf, C097X c097x, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C097W c097w = new C097W(interfaceC1364105Vn, this.LLILZ);
        c097w.LLILLJJLI = interfaceC346701Wf;
        c097w.LLILLL = c097x;
        return c097w.invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa c095d;
        C1C7U.LIZ("EffectLoadingManager@bb2d.special$$inlined$flatMapLatest$1");
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
            InterfaceC346701Wf interfaceC346701Wf = this.LLILLJJLI;
            Object obj2 = this.LLILLL;
            if (Intrinsics.LJFF(obj2, C097Y.LIZ)) {
                c095d = new C516501zn(false, 1);
            } else if (Intrinsics.LJFF(obj2, C097Z.LIZ)) {
                c095d = new C095D(new C097V(this.LLILZ, null));
            } else {
                throw new C1954807lC();
            }
            this.LL = 1;
            if (C09IC.LJIILLIIL(this, c095d, interfaceC346701Wf) == objLJFF) {
                C1C7U.LIZIZ("EffectLoadingManager@bb2d.special$$inlined$flatMapLatest$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectLoadingManager@bb2d.special$$inlined$flatMapLatest$1");
        return unit;
    }
}
