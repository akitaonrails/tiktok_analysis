package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.18uM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21433618uM {
    public final Map<String, AbstractC21434218uS> LIZ = new HashMap(2);
    public final Set<String> LIZIZ = new HashSet();
    public final Set<String> LIZJ = new HashSet();
    public boolean LIZLLL;

    public final void LIZ(AbstractC21434218uS abstractC21434218uS) {
        for (String str : abstractC21434218uS.LIZJ()) {
            if (!((HashMap) this.LIZ).containsKey(str)) {
                ((HashMap) this.LIZ).put(str, abstractC21434218uS);
            }
        }
    }
}
