package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS584S0100000_5;
import njp.a;

/* JADX INFO: renamed from: X.0EzM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.base.preview.EPAIGCPreviewComponent$updateShotImage$2", f = "EPAIGCPreviewComponent.kt", l = {335}, m = "invokeSuspend")
public final class C382620EzM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C382590EzJ LLILLJJLI;
    public final /* synthetic */ C379170Etn LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C382620EzM(C382590EzJ c382590EzJ, C379170Etn c379170Etn, InterfaceC1364105Vn<? super C382620EzM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c382590EzJ;
        this.LLILLL = c379170Etn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C382620EzM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("EPAIGCPreviewComponent@8b66.updateShotImage$2");
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
            C382590EzJ c382590EzJ = this.LLILLJJLI;
            C379170Etn c379170Etn = this.LLILLL;
            this.LL = 1;
            obj = c382590EzJ.C5(c379170Etn, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EPAIGCPreviewComponent@8b66.updateShotImage$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI.i3(new AwS584S0100000_5((C379170Etn) obj, 268));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EPAIGCPreviewComponent@8b66.updateShotImage$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
