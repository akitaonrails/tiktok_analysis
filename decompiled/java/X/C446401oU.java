package X;

import com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01oU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.smoothhost.LiveMultiTabRootScene$onCreate$1", f = "LiveMultiTabRootScene.kt", l = {69}, m = "invokeSuspend")
public final class C446401oU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C446401oU(InterfaceC1364105Vn<? super C446401oU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C446401oU(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveMultiTabRootScene@ea63.onCreate$1");
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
            OpenLivePreparationTask openLivePreparationTask = OpenLivePreparationTask.LIZ;
            this.LL = 1;
            if (openLivePreparationTask.LIZ(this) == objLJFF) {
                C1C7U.LIZIZ("LiveMultiTabRootScene@ea63.onCreate$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveMultiTabRootScene@ea63.onCreate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C446401oU(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
