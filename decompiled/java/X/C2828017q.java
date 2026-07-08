package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.017q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2828017q {
    public static InterfaceC657010Ppr LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.017p] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0Ppr] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.017n] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.017v] */
    public static InterfaceC657010Ppr LIZ() {
        EnumC2829017r next;
        ?? c2825017n;
        InterfaceC657010Ppr interfaceC657010Ppr = LIZ;
        if (interfaceC657010Ppr != null) {
            return interfaceC657010Ppr;
        }
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_viewed_item_greyed_out_optimization", true);
        EnumC2829017r.Companion.getClass();
        Iterator<EnumC2829017r> it2 = EnumC2829017r.getEntries().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.getValue() == iLJIJ) {
                break;
            }
        }
        EnumC2829017r enumC2829017r = next;
        if (enumC2829017r == null) {
            enumC2829017r = EnumC2829017r.OFF;
        }
        int i = C2830017s.LIZ[enumC2829017r.ordinal()];
        if (i == 1) {
            c2825017n = new InterfaceC657010Ppr() { // from class: X.017p
                public final HashMap<String, HashSet<String>> LIZ = new HashMap<>();
                public HashSet<String> LIZIZ = new HashSet<>();

                @Override // X.InterfaceC657010Ppr
                public final void LIZ(String str) {
                    HashSet<String> hashSet = this.LIZ.get(str);
                    if (hashSet == null) {
                        hashSet = new HashSet<>();
                    }
                    this.LIZIZ = hashSet;
                    this.LIZ.put(str, hashSet);
                }

                @Override // X.InterfaceC657010Ppr
                public final void LIZIZ(String str) {
                    this.LIZIZ.add(str);
                }

                @Override // X.InterfaceC657010Ppr
                public final boolean LIZJ(String str) {
                    return this.LIZIZ.contains(str);
                }
            };
        } else if (i == 2) {
            c2825017n = new C2825017n();
            if (c2825017n.LIZ == null) {
                c2825017n.LIZ = KevaImpl.getRepo("search_visited_items", 0);
            }
            Keva keva = c2825017n.LIZ;
            if (keva == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            Map<String, ?> all = keva.getAll();
            HashSet<String> hashSet = new HashSet();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((CharSequence) value, new String[]{"_"}, 0, 6);
                    if (listLJJLIIIJILLIZJL.size() == 2) {
                        Object objLJJJJZI = C13LP.LJJJJZI(listLJJLIIIJILLIZJL);
                        Long lLJIILIIL = C2095008Iq.LJIILIIL((String) C13LP.LJJLIIIJJI(listLJJLIIIJILLIZJL));
                        if (lLJIILIIL != null) {
                            lLJIILIIL.longValue();
                            c2825017n.LIZIZ.put(key, new Pair<>(objLJJJJZI, lLJIILIIL));
                            if (System.currentTimeMillis() - lLJIILIIL.longValue() > 86400000) {
                                hashSet.add(key);
                            }
                        }
                    }
                }
            }
            for (String str : hashSet) {
                Keva keva2 = c2825017n.LIZ;
                if (keva2 != null) {
                    keva2.erase(str);
                }
            }
        } else {
            if (i != 3) {
                throw new C1954807lC();
            }
            c2825017n = new InterfaceC657010Ppr() { // from class: X.017v
                @Override // X.InterfaceC657010Ppr
                public final void LIZ(String str2) {
                }

                @Override // X.InterfaceC657010Ppr
                public final void LIZIZ(String str2) {
                }

                @Override // X.InterfaceC657010Ppr
                public final boolean LIZJ(String str2) {
                    return false;
                }
            };
        }
        LIZ = c2825017n;
        return c2825017n;
    }
}
