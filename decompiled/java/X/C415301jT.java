package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.01jT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.EffectBarWidgetComponent$observeEffectSelectStateToShowBottomWidget$1$invokeSuspend$$inlined$combine$1$3", f = "EffectBarWidgetComponent.kt", l = {238}, m = "invokeSuspend")
public final class C415301jT extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super Boolean>, Boolean[], InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;

    public C415301jT(InterfaceC1364105Vn interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super Boolean> interfaceC346701Wf, Boolean[] boolArr, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C415301jT c415301jT = new C415301jT(interfaceC1364105Vn);
        c415301jT.LLILLJJLI = interfaceC346701Wf;
        c415301jT.LLILLL = boolArr;
        return c415301jT.invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectBarWidgetComponent@c8e.observeEffectSelectStateToShowBottomWidget$1$invokeSuspend$$inlined$combine$1$3");
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
            Object[] objArr = (Object[]) this.LLILLL;
            boolean z = false;
            boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
            boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
            boolean zBooleanValue3 = ((Boolean) objArr[2]).booleanValue();
            boolean zBooleanValue4 = ((Boolean) objArr[3]).booleanValue();
            boolean zBooleanValue5 = ((Boolean) objArr[4]).booleanValue();
            boolean zBooleanValue6 = ((Boolean) objArr[5]).booleanValue();
            boolean zBooleanValue7 = ((Boolean) objArr[6]).booleanValue();
            if (((zBooleanValue && (((zBooleanValue4 && zBooleanValue3) || zBooleanValue6) && zBooleanValue2)) || (zBooleanValue5 && (zBooleanValue4 || zBooleanValue6))) && zBooleanValue7) {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            this.LL = 1;
            if (interfaceC346701Wf.emit(boolValueOf, this) == objLJFF) {
                C1C7U.LIZIZ("EffectBarWidgetComponent@c8e.observeEffectSelectStateToShowBottomWidget$1$invokeSuspend$$inlined$combine$1$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectBarWidgetComponent@c8e.observeEffectSelectStateToShowBottomWidget$1$invokeSuspend$$inlined$combine$1$3");
        return unit;
    }
}
