package X;

import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.08FT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08FT implements InterfaceC679950Qll {
    public final LinkedHashMap<String, String> LL;
    public final n LLILLJJLI;
    public final HashMap<String, Object> LLILLL;

    public final LinkedHashMap<String, String> LJ() {
        LinkedHashMap<String, String> linkedHashMap = this.LL;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            n nVar = this.LLILLJJLI;
            if (nVar != null) {
                for (String str : nVar.LJJIJIL()) {
                    linkedHashMap.put(str, nVar.LJJIIZ(str).toString());
                }
            }
        }
        return linkedHashMap;
    }

    public C08FT(boolean z) {
        LinkedHashMap<String, String> linkedHashMap;
        if (z) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new LinkedHashMap<>();
        }
        this.LL = linkedHashMap;
        this.LLILLJJLI = z ? new n() : null;
        this.LLILLL = new HashMap<>();
    }

    public final boolean LIZLLL(String str) {
        LinkedHashMap<String, String> linkedHashMap = this.LL;
        if (linkedHashMap != null && linkedHashMap.containsKey(str)) {
            return true;
        }
        n nVar = this.LLILLJJLI;
        if (nVar != null && nVar.LJJIJIIJIL(str)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC679950Qll
    public final String get(String str) {
        String str2;
        LinkedHashMap<String, String> linkedHashMap = this.LL;
        if (linkedHashMap == null || (str2 = linkedHashMap.get(str)) == null) {
            Object obj = this.LLILLL.get(str);
            if (obj != null) {
                return obj.toString();
            }
            return null;
        }
        return str2;
    }

    public final void LIZIZ(k kVar, String str, boolean z) {
        if (kVar instanceof q) {
            q qVarLJIILJJIL = kVar.LJIILJJIL();
            Object obj = qVarLJIILJJIL.LL;
            if (obj instanceof Number) {
                this.LLILLL.put(str, Double.valueOf(qVarLJIILJJIL.LJIJ().doubleValue()));
            } else if (obj instanceof Boolean) {
                this.LLILLL.put(str, Boolean.valueOf(qVarLJIILJJIL.LJ()));
            } else {
                this.LLILLL.put(str, qVarLJIILJJIL.LJIL());
            }
            if (z) {
                return;
            }
            LinkedHashMap<String, String> linkedHashMap = this.LL;
            if (linkedHashMap != null) {
                linkedHashMap.put(str, kVar.LJIL());
            }
            n nVar = this.LLILLJJLI;
            if (nVar != null) {
                nVar.LJJIFFI(str, kVar);
                return;
            }
            return;
        }
        String string = kVar.toString();
        this.LLILLL.put(str, string);
        if (z) {
            return;
        }
        LinkedHashMap<String, String> linkedHashMap2 = this.LL;
        if (linkedHashMap2 != null) {
            linkedHashMap2.put(str, string);
        }
        n nVar2 = this.LLILLJJLI;
        if (nVar2 != null) {
            nVar2.LJJIFFI(str, kVar);
        }
    }

    public final void LIZJ(String str, String str2, boolean z) {
        this.LLILLL.put(str, str2);
        if (z) {
            return;
        }
        LinkedHashMap<String, String> linkedHashMap = this.LL;
        if (linkedHashMap != null) {
            str2.toString();
            linkedHashMap.put(str, str2);
        }
        n nVar = this.LLILLJJLI;
        if (nVar != null) {
            nVar.LJJIFFI(str, new q(str2));
        }
    }
}
