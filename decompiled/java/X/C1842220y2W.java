package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.settings.MinisTtmgConfigSettings;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0y2W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1842220y2W {
    public static final Object LIZ = new Object();
    public static final C13E8<C1877107Wv> LIZIZ = new C13E8<>();
    public static C2195181Avk LIZJ;

    public static String LIZIZ(String str) {
        ArrayList arrayList;
        MinisTtmgConfigSettings.MinisTtmgConfigModel minisTtmgConfigModelLIZ = MinisTtmgConfigSettings.LIZ();
        if (!minisTtmgConfigModelLIZ.enableGetMinisFragmentBurstReport) {
            return null;
        }
        long j = minisTtmgConfigModelLIZ.getMinisFragmentBurstWindowMs;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (LIZ) {
            try {
                LIZ(jCurrentTimeMillis, j);
                C13E8<C1877107Wv> c13e8 = LIZIZ;
                ArrayList arrayList2 = new ArrayList();
                for (C1877107Wv c1877107Wv : c13e8) {
                    if (Intrinsics.LJFF(c1877107Wv.LIZ, str)) {
                        arrayList2.add(c1877107Wv);
                    }
                }
                if (arrayList2.size() >= 2) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((C1877107Wv) it2.next()).LIZJ);
                    }
                } else {
                    arrayList = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (arrayList == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            jSONArray.put(it3.next());
        }
        String string = jSONArray.toString();
        int i = C2187451AjH.LIZ;
        arrayList.size();
        return string;
    }

    public static void LIZJ(SchemaParserData schemaParserData) {
        MinisTtmgConfigSettings.MinisTtmgConfigModel minisTtmgConfigModelLIZ = MinisTtmgConfigSettings.LIZ();
        if (!minisTtmgConfigModelLIZ.enableGetMinisFragmentBurstReport) {
            return;
        }
        long j = minisTtmgConfigModelLIZ.getMinisFragmentBurstWindowMs;
        int iLJ = C13LZ.LJ(minisTtmgConfigModelLIZ.getMinisFragmentBurstStackFrames, 1, 40);
        long jCurrentTimeMillis = System.currentTimeMillis();
        StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(C786410Ut5.u3());
        String str = schemaParserData.clientKey;
        int length = stackTrace.length;
        if (4 <= length) {
            length = 4;
        }
        int i = iLJ + length;
        int length2 = stackTrace.length;
        if (i > length2) {
            i = length2;
        }
        C1877107Wv c1877107Wv = new C1877107Wv(str, jCurrentTimeMillis, C13LP.LJJLIIIJ(C13LZ.LJIILJJIL(length, i), "<-", null, null, 0, null, new C5183020f(stackTrace, 332), 30));
        synchronized (LIZ) {
            try {
                LIZ(jCurrentTimeMillis, j);
                while (true) {
                    C13E8<C1877107Wv> c13e8 = LIZIZ;
                    if (c13e8.size() >= 20) {
                        c13e8.removeFirst();
                    } else {
                        c13e8.addLast(c1877107Wv);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZ(long j, long j2) {
        while (true) {
            C13E8<C1877107Wv> c13e8 = LIZIZ;
            if ((!c13e8.isEmpty()) && j - c13e8.first().LIZIZ > j2) {
                c13e8.removeFirst();
            } else {
                return;
            }
        }
    }
}
