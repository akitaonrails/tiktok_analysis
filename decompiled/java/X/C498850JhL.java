package X;

import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JhL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.interaction.ToolbarInteractionFeatureBehavior$showDelayedPlaybookGuidance$1", f = "ToolbarInteractionFeatureBehavior.kt", l = {515}, m = "invokeSuspend")
public final class C498850JhL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1103130eoR LLILLJJLI;
    public final /* synthetic */ C0UXA LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C498850JhL(InterfaceC1103130eoR interfaceC1103130eoR, C0UXA c0uxa, InterfaceC1364105Vn<? super C498850JhL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1103130eoR;
        this.LLILLL = c0uxa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C498850JhL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ToolbarInteractionFeatureBehavior@e81e.showDelayedPlaybookGuidance$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(120000L, this) == objLJFF) {
                C1C7U.LIZIZ("ToolbarInteractionFeatureBehavior@e81e.showDelayedPlaybookGuidance$1");
                return objLJFF;
            }
        }
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        C785220UrA c785220UrA = new C785220UrA(this.LLILLJJLI.LJ());
        c785220UrA.LIZ(R.attr.e66);
        c785220UrA.LIZLLL(2131855995);
        c785220UrA.LJIIIIZZ = 10000L;
        c785220UrA.LJIIIZ = true;
        c785220UrA.LJIILL = new InterfaceC254600ye() { // from class: X.0JhM
            @Override // X.InterfaceC254600ye
            public final void onShow() {
                C0KPJ.Se.LJFF(Boolean.TRUE);
            }
        };
        c1113800f5e.LJ(new C1119590fEz(c785220UrA), EnumC1120860fH2.ANCHOR_PLAYBOOK_SETTING, this.LLILLL.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ToolbarInteractionFeatureBehavior@e81e.showDelayedPlaybookGuidance$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
