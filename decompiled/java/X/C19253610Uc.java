package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10Uc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19253610Uc extends C09AY implements Function0<InterfaceC19283610cM> {
    public C19253610Uc() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC19283610cM invoke() {
        try {
            return (InterfaceC19283610cM) C100C.LIZ.LIZLLL().LIZJ(InterfaceC19283610cM.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
