package X;

import com.ss.android.medialib.presenter.IStickerRequestCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lnn.q;
import njp.a;

/* JADX INFO: renamed from: X.0MnD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineEffectHandler$resetEffect$1", f = "AIGCOfflineEffectHandler.kt", l = {1237}, m = "invokeSuspend")
public final class C578930MnD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C578910MnB LLILLJJLI;
    public final /* synthetic */ C1627370sRz LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C578930MnD(C578910MnB c578910MnB, C1627370sRz c1627370sRz, InterfaceC1364105Vn<? super C578930MnD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c578910MnB;
        this.LLILLL = c1627370sRz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C578930MnD(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCOfflineEffectHandler@7df1.resetEffect$1");
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
            final C578910MnB c578910MnB = this.LLILLJJLI;
            this.LL = 1;
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            InterfaceC1645720sva interfaceC1645720sva = c578910MnB.LLILZ;
            if (interfaceC1645720sva != null) {
                interfaceC1645720sva.setStickerRequestCallback(new IStickerRequestCallback() { // from class: X.0MnJ
                    @Override // com.ss.android.medialib.presenter.IStickerRequestCallback
                    public final void onStickerRequested(long j, boolean z) {
                        c578910MnB.LLILZ.setStickerRequestCallback(null);
                        Boolean boolValueOf = Boolean.valueOf(z);
                        InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = c23260099m;
                        C189200o6.m2constructorimpl(boolValueOf);
                        interfaceC1364105Vn.resumeWith(boolValueOf);
                    }
                });
            }
            q qVar = c578910MnB.LLIZ;
            if (qVar != null) {
                C1624010sMZ.LIZ(qVar);
            }
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIGCOfflineEffectHandler@7df1.resetEffect$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        this.LLILLJJLI.LJJJIL(this.LLILLL.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resetEffect completed with result: ");
        sbLIZ.append(zBooleanValue);
        C201955140j.LJIILL(C0LC1.LIZIZ, "aigc_offline_effect_handler", C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOfflineEffectHandler@7df1.resetEffect$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
