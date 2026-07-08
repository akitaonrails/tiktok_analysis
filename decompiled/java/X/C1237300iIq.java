package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.loginsetting.BoolData;

/* JADX INFO: renamed from: X.0iIq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237300iIq {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(String str, InterfaceC1236910iID interfaceC1236910iID) {
        if (TextUtils.isEmpty(str)) {
            interfaceC1236910iID.LIZ(false);
            return;
        }
        try {
            C15O7<BoolData> c15o7LIZIZ = C1238990iLZ.LIZIZ.LIZIZ(C08HN.LIZ(str), "1");
            if (c15o7LIZIZ != null) {
                c15o7LIZIZ.LIZLLL(new C1266160j3O(interfaceC1236910iID, 14));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        interfaceC1236910iID.LIZ(false);
    }
}
