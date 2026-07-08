package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bubble.record.BubbleRecord;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0whA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1790540whA extends C09AY implements Function0<Map<String, C1790530wh9>> {
    public C1790540whA() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, C1790530wh9> invoke() {
        Object c098200Yq;
        Keva keva = C1790560whC.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> allKey = C1790560whC.LIZIZ.getAllKey();
        if (allKey == null) {
            allKey = C08CX.INSTANCE;
        }
        for (String str : allKey) {
            if (str == null || str.length() == 0) {
                C1586120rNS.LIZ(C1586120rNS.LIZ, "BubbleStore", "init key is null or empty");
            } else {
                String string = C1790560whC.LIZIZ.getString(str, "");
                Keva keva2 = C1790560whC.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("_exit");
                long j = keva2.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
                try {
                    C1227904rF.LIZ.getClass();
                    c098200Yq = C1227904rF.LJFF(BubbleRecord[].class, string);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = new ArrayList();
                }
                linkedHashMap.put(str, new C1790530wh9(str, j, (List) c098200Yq));
                C1586120rNS c1586120rNS = C1586120rNS.LIZ;
                Objects.toString(linkedHashMap.get(str));
                c1586120rNS.getClass();
            }
        }
        C1586120rNS c1586120rNS2 = C1586120rNS.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("BubbleRecordRepository init[");
        sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sbLIZ2.append(']');
        C2188811AlT.LIZIZ(sbLIZ2);
        c1586120rNS2.getClass();
        return linkedHashMap;
    }
}
