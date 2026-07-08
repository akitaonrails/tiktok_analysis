package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01UC, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.iap.core.restore.action.ListenToUploadTokenFailAction$perform$3", f = "ListenToUploadTokenFailAction.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C01UC extends C09AX implements Function2<EnumC1787510wcH, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C01UC(InterfaceC1364105Vn<? super C01UC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01UC(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ListenToUploadTokenFailAction@4856.perform$3");
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
            if (AnonymousClass0958.LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL, this) == objLJFF) {
                C1C7U.LIZIZ("ListenToUploadTokenFailAction@4856.perform$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ListenToUploadTokenFailAction@4856.perform$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EnumC1787510wcH enumC1787510wcH, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C01UC(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
