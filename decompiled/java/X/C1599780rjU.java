package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rjU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599780rjU {
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public static final C1599780rjU LIZ = new C1599780rjU();
    public static final LinkedHashSet<String> LIZIZ = new LinkedHashSet<>();
    public static final HashSet<String> LIZJ = new HashSet<>();
    public static final List<Function0<Unit>> LJFF = new ArrayList();

    public final synchronized void LIZIZ() {
        if (LIZLLL) {
            return;
        }
        LIZLLL = true;
        LIZ();
    }

    public static void LIZ() {
        if (!LJ && LIZLLL) {
            LinkedHashSet<String> linkedHashSet = LIZIZ;
            if (!linkedHashSet.isEmpty() && LIZJ.containsAll(linkedHashSet)) {
                LJ = true;
                List<Function0<Unit>> list = LJFF;
                List listLLIIII = C13LP.LLIIII(list);
                ((ArrayList) list).clear();
                Iterator it2 = listLLIIII.iterator();
                while (it2.hasNext()) {
                    ((Function0) it2.next()).invoke();
                }
            }
        }
    }

    public final int LIZJ(String str) {
        return Intrinsics.LJFF(LJFF(str), "1") ? 1 : 0;
    }

    public final synchronized void LIZLLL(String str) {
        if (str != null) {
            if (str.length() != 0) {
                if (LIZLLL) {
                    return;
                }
                LIZIZ.add(str);
            }
        }
    }

    public final synchronized void LJ(String str) {
        if (str != null) {
            if (str.length() != 0) {
                if (!LIZIZ.contains(str)) {
                    return;
                }
                if (LIZJ.add(str)) {
                    LIZ();
                }
            }
        }
    }

    public final String LJFF(String str) {
        if (str != null && str.length() != 0) {
            synchronized (this) {
                try {
                    if (!LIZIZ.contains(str)) {
                        return CardStruct.IStatusCode.DEFAULT;
                    }
                    if (LIZJ.contains(str)) {
                        return CardStruct.IStatusCode.DEFAULT;
                    }
                    return "1";
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return CardStruct.IStatusCode.DEFAULT;
    }
}
