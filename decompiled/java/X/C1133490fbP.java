package X;

import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0fbP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133490fbP {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(287));

    public final AbstractC1133500fbQ LIZIZ() {
        return (AbstractC1133500fbQ) this.LIZ.getValue();
    }

    public final int LIZJ() {
        return LIZIZ().LIZIZ().size();
    }

    public final String toString() {
        return LIZIZ().toString();
    }

    public final Set<GiftMessage> LIZ(int i) {
        HashSet hashSet = new HashSet();
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                try {
                    hashSet.add(LIZIZ().LIZLLL(true));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                }
                i = i2;
            } else {
                return hashSet;
            }
        }
    }
}
