package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.12lX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19850112lX extends AbstractC19844412kc {
    public final int LL;
    public final C19861912nR LLILLJJLI;

    @Override // X.AbstractC19844412kc
    public final int LIZJ() {
        return this.LL;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{5, this.LLILLJJLI});
    }

    @Override // X.AbstractC19844412kc
    public final int zza() {
        return 5;
    }

    public final String toString() {
        if (this.LLILLJJLI.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC19851112lh it2 = this.LLILLJJLI.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(entry.getKey().toString().replace("\n", "\n  "), entry.getValue().toString().replace("\n", "\n  "));
        }
        C19850212lY c19850212lY = new C19850212lY();
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            C19850012lW.LIZ(sb, linkedHashMap.entrySet().iterator(), c19850212lY);
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError(e);
        }
    }

    public C19850112lX(C19861912nR c19861912nR) throws C19849512lR {
        c19861912nR.getClass();
        this.LLILLJJLI = c19861912nR;
        AbstractC19851112lh it2 = c19861912nR.entrySet().iterator();
        int i = 0;
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            int iLIZJ = ((AbstractC19844412kc) entry.getKey()).LIZJ();
            i = i < iLIZJ ? iLIZJ : i;
            int iLIZJ2 = ((AbstractC19844412kc) entry.getValue()).LIZJ();
            if (i < iLIZJ2) {
                i = iLIZJ2;
            }
        }
        int i2 = i + 1;
        this.LL = i2;
        if (i2 <= 4) {
        } else {
            throw new C19849512lR("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompareTo;
        AbstractC19844412kc abstractC19844412kc = (AbstractC19844412kc) obj;
        if (5 != abstractC19844412kc.zza()) {
            return 5 - abstractC19844412kc.zza();
        }
        C19850112lX c19850112lX = (C19850112lX) abstractC19844412kc;
        if (this.LLILLJJLI.size() != c19850112lX.LLILLJJLI.size()) {
            return this.LLILLJJLI.size() - c19850112lX.LLILLJJLI.size();
        }
        AbstractC19851112lh it2 = this.LLILLJJLI.entrySet().iterator();
        AbstractC19851112lh it3 = c19850112lX.LLILLJJLI.entrySet().iterator();
        do {
            if (!it2.hasNext() && !it3.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            Map.Entry entry2 = (Map.Entry) it3.next();
            int iCompareTo2 = ((AbstractC19844412kc) entry.getKey()).compareTo(entry2.getKey());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            iCompareTo = ((AbstractC19844412kc) entry.getValue()).compareTo(entry2.getValue());
        } while (iCompareTo == 0);
        return iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19850112lX.class != obj.getClass()) {
            return false;
        }
        return this.LLILLJJLI.equals(((C19850112lX) obj).LLILLJJLI);
    }
}
