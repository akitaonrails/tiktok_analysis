package X;

import com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01oT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.smoothhost.LightRecordLivePreviewSceneServiceImpl$executeOpenLivePreparationTask$1", f = "LightRecordLivePreviewSceneServiceImpl.kt", l = {38}, m = "invokeSuspend")
public final class C446301oT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C446301oT(InterfaceC1364105Vn<? super C446301oT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C446301oT(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LightRecordLivePreviewSceneServiceImpl@1adc.executeOpenLivePreparationTask$1");
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
                C1C7U.LIZIZ("LightRecordLivePreviewSceneServiceImpl@1adc.executeOpenLivePreparationTask$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LightRecordLivePreviewSceneServiceImpl@1adc.executeOpenLivePreparationTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C446301oT(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
