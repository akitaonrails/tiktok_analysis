package X;

import android.util.LruCache;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.ibe.CommerceIBEService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS130S1100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dlY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1062900dlY {
    public final ConcurrentHashMap<String, List<C1062850dlT>> LIZ = new ConcurrentHashMap<>();
    public final LruCache<String, Boolean> LIZIZ = new LruCache<>(20);

    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZJ(String str) throws AbstractC1062910dlZ {
        Object next;
        C1062850dlT c1062850dlT;
        List listLIZ = LIZ(str, this.LIZ);
        if (listLIZ.isEmpty()) {
            try {
                if (!CommerceIBEService.LJFF().LIZJ(str)) {
                    throw new AbstractC1062910dlZ() { // from class: X.0dle
                    };
                }
            } catch (C1062980dlg e) {
                TryCatchGuardChecker.doCheck(e);
            }
            throw new AbstractC1062910dlZ() { // from class: X.0dla
            };
        }
        synchronized (listLIZ) {
            try {
                Iterator it2 = listLIZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((C1062850dlT) next).LJFF == EnumC1062840dlS.LLILLL) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                c1062850dlT = (C1062850dlT) next;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c1062850dlT == null) {
            int iOrdinal = ((C1062850dlT) C13LP.LJJJJZI(listLIZ)).LJFF.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 3) {
                        throw new AbstractC1062910dlZ() { // from class: X.0dlf
                        };
                    }
                    throw new AbstractC1062910dlZ() { // from class: X.0dlb
                    };
                }
                throw new AbstractC1062910dlZ() { // from class: X.0dld
                };
            }
            throw new AbstractC1062910dlZ() { // from class: X.0dlc
            };
        }
        return c1062850dlT.LIZ;
    }

    public static List LIZ(String str, ConcurrentHashMap concurrentHashMap) {
        Object objPutIfAbsent;
        Object arrayList = concurrentHashMap.get(str);
        if (arrayList == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (arrayList = new ArrayList()))) != null) {
            arrayList = objPutIfAbsent;
        }
        return (List) arrayList;
    }

    public final void LIZIZ(String str, String str2) {
        String str3;
        if (str == null) {
            return;
        }
        for (List<C1062850dlT> list : this.LIZ.values()) {
            synchronized (list) {
                try {
                    for (C1062850dlT c1062850dlT : list) {
                        SparkContext sparkContext = c1062850dlT.LIZ.getSparkContext();
                        if (sparkContext != null) {
                            str3 = sparkContext.containerId;
                        } else {
                            str3 = null;
                        }
                        if (Intrinsics.LJFF(str3, str)) {
                            list.remove(c1062850dlT);
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(c1062850dlT.LIZ);
                            C1057930ddX c1057930ddX = c1062850dlT.LIZIZ;
                            C1063030dll.LIZ.getClass();
                            c1057930ddX.log(C1063030dll.LJ, new AwS130S1100000_16(str2, c1062850dlT, 16));
                            Function0<Unit> function0 = c1062850dlT.LIZLLL;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            return;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
