package X;

import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import java.util.Collection;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.09ak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2399609ak {
    public static final Boolean LIZ(n nVar, String str) {
        q qVarLJJIJIIJI = nVar.LJJIJIIJI(str);
        if (qVarLJJIJIIJI != null) {
            return Boolean.valueOf(qVarLJJIJIIJI.LJ());
        }
        return null;
    }

    public static final Integer LIZIZ(n nVar, String str) {
        q qVarLJJIJIIJI = nVar.LJJIJIIJI(str);
        if (qVarLJJIJIIJI != null) {
            return Integer.valueOf(qVarLJJIJIIJI.LJIIJJI());
        }
        return null;
    }

    public static final String LIZJ(n nVar, String str) {
        q qVarLJJIJIIJI;
        if (nVar != null && (qVarLJJIJIIJI = nVar.LJJIJIIJI(str)) != null) {
            return qVarLJJIJIIJI.LJIL();
        }
        return null;
    }

    public static final void LIZLLL(n nVar, Object obj, String str) {
        String string;
        if (obj != null && (string = obj.toString()) != null && !a0.LJJJIL(string)) {
            nVar.LJJIIJ(str, string);
        }
    }

    public static final void LJ(n nVar, String str, k kVar) {
        if (kVar != null) {
            nVar.LJJIFFI(str, kVar);
        }
    }

    public static final void LJFF(n nVar, String str, Number number) {
        if (number != null) {
            nVar.LJJIII(number, str);
        }
    }

    public static final void LJI(n nVar, String str, Collection<?> collection) {
        if (collection != null && !collection.isEmpty()) {
            h hVar = new h();
            for (Object obj : collection) {
                if (obj instanceof String) {
                    hVar.LJJIFFI(new q((String) obj));
                } else if (obj instanceof k) {
                    hVar.LJJIFFI((k) obj);
                }
            }
            if (hVar.size() > 0) {
                nVar.LJJIFFI(str, hVar);
            }
        }
    }

    public static final void LJII(n nVar, String str, int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            h hVar = new h();
            for (int i : iArr) {
                hVar.LJJII(Integer.valueOf(i));
            }
            nVar.LJJIFFI(str, hVar);
        }
    }

    public static final void LJIIIIZZ(n nVar, String str, Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            h hVar = new h();
            for (Object obj : objArr) {
                if (obj instanceof String) {
                    hVar.LJJIFFI(new q((String) obj));
                } else if (obj instanceof k) {
                    hVar.LJJIFFI((k) obj);
                }
            }
            if (hVar.size() > 0) {
                nVar.LJJIFFI(str, hVar);
            }
        }
    }
}
