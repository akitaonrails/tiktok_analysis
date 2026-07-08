package X;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CRI, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.settingsrequest.serverpush.PushSettingsManager$syncPUshSettingData$1", f = "PushSettingsManager.kt", l = {113}, m = "invokeSuspend")
public final class C0CRI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C10FJ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CRI(C10FJ c10fj, InterfaceC1364105Vn<? super C0CRI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c10fj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CRI(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PushSettingsManager@de9b.syncPUshSettingData$1");
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
            long millis = TimeUnit.SECONDS.toMillis(1L);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(millis, this) == objLJFF) {
                C1C7U.LIZIZ("PushSettingsManager@de9b.syncPUshSettingData$1");
                return objLJFF;
            }
        }
        C10FG c10fg = C10FG.LIZ;
        C10FJ c10fj = this.LLILLJJLI;
        c10fg.getClass();
        C10FG.LIZLLL(c10fj, true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PushSettingsManager@de9b.syncPUshSettingData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
