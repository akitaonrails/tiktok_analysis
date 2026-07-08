package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0w5A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766980w5A {
    public static final void LIZ(C18C6 c18c6) {
        try {
            if (((Boolean) C268450Afb.LIZ.getValue()).booleanValue()) {
                List<C1766940w56> list = c18c6.LIZ;
                ArrayList arrayList = new ArrayList();
                Iterator<C1766940w56> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C1766970w59.LIZ(it2.next()));
                }
                c18c6.LIZ = arrayList;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
