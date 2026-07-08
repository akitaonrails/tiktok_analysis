package X;

import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: X.08Ni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2107208Ni {
    public static <S> void LIZ(Class<S> cls, ServiceLoader<S> serviceLoader) {
        try {
            C844470XAv.LIZ.getClass();
            if ((C08Q0.LIZIZ(C844470XAv.LIZ(), 0, "memory_biz_exception_type") & 2) == 2) {
                ArrayList arrayList = new ArrayList();
                String name = cls.getName();
                Iterator<S> it2 = serviceLoader.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getClass().getName());
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ServiceLoader name:");
                sbLIZ.append(name);
                sbLIZ.append(" impl:");
                sbLIZ.append(arrayList);
                Npth.reportBizException("LegacyServiceLoader", new Throwable(C2188811AlT.LIZIZ(sbLIZ)), name, Collections.emptyMap());
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
