package X;

import com.bytedance.android.btm.api.BtmSDK;
import com.ss.android.ugc.aweme.legoImp.task.btm.UpdateBtmSettingsTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15WV, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.legoImp.task.btm.UpdateBtmSettingsTask$run$1", f = "UpdateBtmSettingsTask.kt", l = {32}, m = "invokeSuspend")
public final class C15WV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ UpdateBtmSettingsTask LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15WV(long j, UpdateBtmSettingsTask updateBtmSettingsTask, InterfaceC1364105Vn<? super C15WV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = updateBtmSettingsTask;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15WV(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UpdateBtmSettingsTask@dfab.run$1");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("UpdateBtmSettingsTask@dfab.run$1");
                return objLJFF;
            }
        }
        this.LLILLL.getClass();
        BtmSDK.updateSDKSetting(C15WW.LIZLLL.LIZ());
        BtmSDK.updateHybridPatternSetting(C15WX.LIZLLL.LIZ());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UpdateBtmSettingsTask@dfab.run$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
