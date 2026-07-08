package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0C7I, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public abstract class C0C7I implements InterfaceC1499640p7y {
    @Override // X.InterfaceC1499640p7y
    public final HashSet<String> LJJ() {
        return new HashSet<>();
    }

    @Override // X.InterfaceC1499640p7y
    public final HashSet<String> LJJI() {
        HashSet<String> hashSet;
        try {
            String str = C2504509rf.LIZ;
            if (str != null && C2504509rf.LIZIZ == null) {
                C2504509rf.LIZIZ = new HashSet<>();
                C2504509rf.LIZIZ.addAll((ArrayList) C7740030o.LIZ().getGson().LJII(str, ArrayList.class));
            }
            hashSet = C2504509rf.LIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            hashSet = C2504509rf.LIZIZ;
        }
        return hashSet != null ? hashSet : new HashSet<>();
    }

    @Override // X.InterfaceC1499640p7y
    public final int LJJIFFI() {
        return 2;
    }
}
