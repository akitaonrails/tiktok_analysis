package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ese, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.effects.transition.ui.AITransitionTabContentScene$fetchPrompts$1", f = "AITransitionTabContentScene.kt", l = {326}, m = "invokeSuspend")
public final class C378460Ese extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C378420Esa LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C378460Ese(C378420Esa c378420Esa, InterfaceC1364105Vn<? super C378460Ese> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c378420Esa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C378460Ese(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C382090EyV c382090EyV;
        C378710Et3 c378710Et3;
        C1C7U.LIZ("AITransitionTabContentScene@2f55.fetchPrompts$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        C378700Et2 c378700Et2 = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ICreationAsyncTaskManager iCreationAsyncTaskManager = (ICreationAsyncTaskManager) this.LLILLJJLI.LLLI.getValue();
            if (iCreationAsyncTaskManager != null) {
                this.LL = 1;
                obj = iCreationAsyncTaskManager.LJJIIJZLJL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AITransitionTabContentScene@2f55.fetchPrompts$1");
                    return objLJFF;
                }
            } else {
                c382090EyV = null;
                C563650M8t c563650M8t = C563650M8t.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PromptEditPanelUISlotComponent fetchPrompts ");
                sbLIZ.append(c382090EyV);
                C201955140j.LIZJ(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
                C378420Esa c378420Esa = this.LLILLJJLI;
                if (c382090EyV != null && (c378710Et3 = c382090EyV.LIZIZ) != null) {
                    c378700Et2 = new C378700Et2(c378710Et3.LIZ, c378710Et3.LIZIZ, c378710Et3.LIZJ);
                }
                c378420Esa.LLLII = c378700Et2;
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AITransitionTabContentScene@2f55.fetchPrompts$1");
                return unit;
            }
        }
        c382090EyV = (C382090EyV) obj;
        C563650M8t c563650M8t2 = C563650M8t.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("PromptEditPanelUISlotComponent fetchPrompts ");
        sbLIZ2.append(c382090EyV);
        C201955140j.LIZJ(c563650M8t2, C2188811AlT.LIZIZ(sbLIZ2));
        C378420Esa c378420Esa2 = this.LLILLJJLI;
        if (c382090EyV != null) {
            c378700Et2 = new C378700Et2(c378710Et3.LIZ, c378710Et3.LIZIZ, c378710Et3.LIZJ);
        }
        c378420Esa2.LLLII = c378700Et2;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AITransitionTabContentScene@2f55.fetchPrompts$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
