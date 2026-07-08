package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.RelationshipCelebrationTarget;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902410Zah {
    public final List<RelationshipCelebrationTarget> LIZ;
    public final Object LIZIZ = new Object();
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 3));
    public final Map<String, Boolean> LIZLLL = Collections.synchronizedMap(new LinkedHashMap());
    public final C01GW LJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 2));

    public final List<String> LIZIZ() {
        List<String> listLLIIII;
        synchronized (this.LIZIZ) {
            try {
                listLLIIII = C13LP.LLIIII((List) this.LJ.getValue());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return listLLIIII;
    }

    public C902410Zah(List<RelationshipCelebrationTarget> list) {
        this.LIZ = list;
    }

    public final RelationshipCelebrationTarget LIZ(String str) {
        C0Y8T c0y8tLJ;
        RelationshipCelebrationTarget relationshipCelebrationTarget;
        long jLJII = C0YNP.LJII(str);
        if (jLJII == -1 || (c0y8tLJ = C0YNP.LIZIZ(str).LJ()) == null || c0y8tLJ.getUnreadCount() != 0) {
            return null;
        }
        if (!Intrinsics.LJFF(this.LIZLLL.get(String.valueOf(jLJII)), Boolean.TRUE) && !C0BWZ.LIZ()) {
            return null;
        }
        synchronized (this.LIZIZ) {
            try {
                relationshipCelebrationTarget = (RelationshipCelebrationTarget) ((Map) this.LIZJ.getValue()).get(String.valueOf(jLJII));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return relationshipCelebrationTarget;
    }
}
