package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.15pr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20641315pr implements InterfaceC662540Pym {
    public static volatile C20641315pr LIZ;

    @Override // X.InterfaceC662540Pym
    public final String LIZ(Context context) {
        try {
            return context.getResources().getString(2131842717);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
