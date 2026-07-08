package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.save.DecorationDoneButtonAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JGI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.save.DecorationDoneButtonAssem$observeBoardsState$1", f = "DecorationDoneButtonAssem.kt", l = {64}, m = "invokeSuspend")
public final class C0JGI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DecorationDoneButtonAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JGI(DecorationDoneButtonAssem decorationDoneButtonAssem, InterfaceC1364105Vn<? super C0JGI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = decorationDoneButtonAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JGI(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0951 anonymousClass0951LJIIL;
        C1C7U.LIZ("DecorationDoneButtonAssem@8a89.observeBoardsState$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC1814530xJr boardsDisplayStateManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getBoardsDisplayStateManager();
            if (boardsDisplayStateManager != null && (anonymousClass0951LJIIL = boardsDisplayStateManager.LJIIL()) != null) {
                final DecorationDoneButtonAssem decorationDoneButtonAssem = this.LLILLJJLI;
                InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0JJr
                    @Override // X.InterfaceC346701Wf
                    public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                        if (((AbstractC1700910uMb) obj2) instanceof InterfaceC490060JJs) {
                            decorationDoneButtonAssem.Ho(!((InterfaceC490060JJs) r3).LIZIZ().boardItemList.isEmpty());
                        }
                        return Unit.LIZ;
                    }
                };
                this.LL = 1;
                if (anonymousClass0951LJIIL.collect(interfaceC346701Wf, this) == objLJFF) {
                    C1C7U.LIZIZ("DecorationDoneButtonAssem@8a89.observeBoardsState$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("DecorationDoneButtonAssem@8a89.observeBoardsState$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
