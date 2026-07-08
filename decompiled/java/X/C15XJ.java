package X;

import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.compliance.api.model.ScreenTimeManagementDaySetting;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15XJ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.timelock.ProtectionRepoKeva$5", f = "ProtectionRepoKeva.kt", l = {76}, m = "invokeSuspend")
public final class C15XJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C15XY LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15XJ(C15XY c15xy, InterfaceC1364105Vn<? super C15XJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c15xy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15XJ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C20308414dG c20308414dGLIZIZ;
        C1C7U.LIZ("ProtectionRepoKeva@3944.<init>$5");
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
            C15XY c15xy = this.LLILLJJLI;
            if (c15xy != null && (c20308414dGLIZIZ = c15xy.LIZIZ(C15Y5.SCREEN_TIME_MANAGEMENT_WEEK_SETTINGS, new TypeToken<List<? extends ScreenTimeManagementDaySetting>>() { // from class: X.15XL
            }.getType())) != null) {
                InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.15XK
                    @Override // X.InterfaceC346701Wf
                    public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                        C20536115Xj.LIZ.getClass();
                        C20536115Xj.LJIIJ((List) obj2);
                        return Unit.LIZ;
                    }
                };
                this.LL = 1;
                if (c20308414dGLIZIZ.collect(interfaceC346701Wf, this) == objLJFF) {
                    C1C7U.LIZIZ("ProtectionRepoKeva@3944.<init>$5");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProtectionRepoKeva@3944.<init>$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
