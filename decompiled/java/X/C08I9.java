package X;

import Y.ARunnableS103S0100000_3;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.08I9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08I9 {
    public final Lock LIZ;
    public final Lock LIZIZ;
    public final C2093308Hz LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;

    public final List<C1849600yEQ> LIZIZ() {
        try {
            this.LIZIZ.lock();
            ArrayList arrayList = new ArrayList(this.LIZJ.values());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("snapshot: ");
            sbLIZ.append(arrayList);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LIZIZ.unlock();
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZIZ.unlock();
            throw th;
        }
    }

    public static String LIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("digg_record");
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C08I9(int i) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.LIZ = reentrantReadWriteLock.writeLock();
        this.LIZIZ = reentrantReadWriteLock.readLock();
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C08IC());
        this.LIZLLL = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new C08IB());
        this.LJ = c01gwLIZIZ2;
        String string = ((Keva) c01gwLIZIZ.getValue()).getString(LIZ(), "");
        this.LIZJ = new C2093308Hz(i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cacheStr: ");
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!TextUtils.isEmpty(string)) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) ((Gson) c01gwLIZIZ2.getValue()).LJIIIIZZ(string, new TypeToken<LinkedHashMap<String, C1849600yEQ>>() { // from class: X.08IA
                }.getType());
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("cache: ");
                sbLIZ2.append(linkedHashMap);
                C2188811AlT.LIZIZ(sbLIZ2);
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    this.LIZJ.put(entry.getKey(), entry.getValue());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("parse cacheStr err: ");
                sbLIZ3.append(e);
                C2188811AlT.LIZIZ(sbLIZ3);
                C823050WQl.LIZIZ().submit(new ARunnableS103S0100000_3(this, 122));
            }
        }
    }
}
