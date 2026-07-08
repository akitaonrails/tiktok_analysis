package X;

import com.bytedance.helios.network.NetworkComponent;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.q;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0X00, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X00 {
    public static final p LIZ = new p();

    public static final k LIZ(int i, k kVar) {
        if (i >= 16) {
            return new q("pns-null");
        }
        kVar.getClass();
        if (kVar instanceof h) {
            h hVar = new h();
            n nVar = new n();
            for (k kVar2 : kVar.LJIIL()) {
                kVar2.getClass();
                if (kVar2 instanceof n) {
                    Iterator<T> it2 = kVar2.LJIILIIL().entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        nVar.LJJIFFI((String) entry.getKey(), LIZ(i + 1, (k) entry.getValue()));
                    }
                }
            }
            hVar.LJJIFFI(nVar);
            return hVar;
        }
        if (kVar instanceof n) {
            n nVar2 = new n();
            Iterator<T> it3 = kVar.LJIILIIL().entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it3.next();
                nVar2.LJJIFFI((String) entry2.getKey(), LIZ(i + 1, (k) entry2.getValue()));
            }
            return nVar2;
        }
        if (!NetworkComponent.INSTANCE.isOfflineEnv()) {
            return new q("pns-null");
        }
        return kVar;
    }
}
