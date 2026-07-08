package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.panel.LiveEnhanceDialogView$onDialogOpen$7$1", f = "LiveEnhanceDialogView.kt", l = {187}, m = "invokeSuspend")
public final class C761240Tta extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ViewOnLayoutChangeListenerC766940U6q LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C761240Tta(ViewOnLayoutChangeListenerC766940U6q viewOnLayoutChangeListenerC766940U6q, InterfaceC1364105Vn<? super C761240Tta> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = viewOnLayoutChangeListenerC766940U6q;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C761240Tta(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEnhanceDialogView@b7ae.onDialogOpen$7$1");
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
            C1DEK c1dek = this.LLILLJJLI.LLJILLL.LLILLJJLI;
            C403101hV c403101hV = C403101hV.LIZ;
            this.LL = 1;
            if (c1dek.LJIJI(c403101hV, this) == objLJFF) {
                C1C7U.LIZIZ("LiveEnhanceDialogView@b7ae.onDialogOpen$7$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveEnhanceDialogView@b7ae.onDialogOpen$7$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
