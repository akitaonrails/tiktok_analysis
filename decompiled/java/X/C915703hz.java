package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: X.03hz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C915703hz extends AbstractC916103i3 {
    public Map<String, ArrayList<String>> LJFF;

    public C915703hz() {
    }

    public C915703hz(String str) {
        super(str);
        try {
            this.LJFF = C116700cP.LIZ(this.LIZ.optJSONObject("card_bin_list"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
