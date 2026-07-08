package X;

import com.ss.android.ugc.aweme.compliance.api.model.DoNotDisturbSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15Xb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.timelock.ProtectionRepoKeva$3", f = "ProtectionRepoKeva.kt", l = {61}, m = "invokeSuspend")
public final class C20535315Xb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C15XY LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20535315Xb(C15XY c15xy, InterfaceC1364105Vn<? super C20535315Xb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c15xy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20535315Xb(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C20308414dG c20308414dGLJI;
        C1C7U.LIZ("ProtectionRepoKeva@3944.<init>$3");
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
            if (c15xy != null && (c20308414dGLJI = c15xy.LJI(C15Y5.SYSTEM_MUTE_SETTINGS, DoNotDisturbSettings.class)) != null) {
                InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.15Xc
                    @Override // X.InterfaceC346701Wf
                    public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                        C20536115Xj.LIZ.getClass();
                        C20536115Xj.LJIILIIL((DoNotDisturbSettings) obj2);
                        return Unit.LIZ;
                    }
                };
                this.LL = 1;
                if (c20308414dGLJI.collect(interfaceC346701Wf, this) == objLJFF) {
                    C1C7U.LIZIZ("ProtectionRepoKeva@3944.<init>$3");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProtectionRepoKeva@3944.<init>$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
