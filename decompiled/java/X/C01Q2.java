package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Q2, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer$setGuardianSetting$1", f = "BasePreviewSettingMainFragmentSheetInitializer.kt", l = {3608}, m = "invokeSuspend")
public final class C01Q2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ BasePreviewSettingMainFragmentSheetInitializer LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01Q2(boolean z, BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer, InterfaceC1364105Vn<? super C01Q2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = basePreviewSettingMainFragmentSheetInitializer;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01Q2(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BasePreviewSettingMainFragmentSheetInitializer@5293.setGuardianSetting$1");
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
            C09AM c09am = C09AM.LL;
            C01Q1 c01q1 = new C01Q1(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c09am, c01q1) == objLJFF) {
                C1C7U.LIZIZ("BasePreviewSettingMainFragmentSheetInitializer@5293.setGuardianSetting$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BasePreviewSettingMainFragmentSheetInitializer@5293.setGuardianSetting$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
