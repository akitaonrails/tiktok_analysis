package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0C7J, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C7J implements InterfaceC1499640p7y {
    public static final C0C7J LIZ = new C0C7J();
    public static int LIZIZ = 2;

    @Override // X.InterfaceC1499640p7y
    public final HashSet<String> LJJ() {
        return new HashSet<>();
    }

    @Override // X.InterfaceC1499640p7y
    public final HashSet<String> LJJI() {
        HashSet<String> hashSet;
        try {
            String str = C2504309rd.LIZ;
            if (str != null && C2504309rd.LIZIZ == null) {
                C2504309rd.LIZIZ = new HashSet<>();
                C2504309rd.LIZIZ.addAll((ArrayList) C7740030o.LIZ().getGson().LJII(str, ArrayList.class));
            }
            hashSet = C2504309rd.LIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            hashSet = C2504309rd.LIZIZ;
        }
        return hashSet != null ? hashSet : new HashSet<>();
    }

    @Override // X.InterfaceC1499640p7y
    public final int LJIL() {
        return LIZIZ;
    }

    @Override // X.InterfaceC1499640p7y
    public final int LJJIFFI() {
        return 2;
    }
}
