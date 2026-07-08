package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.012V, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C012V implements C164B {
    public final HashMap<String, String> LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final Integer LJ;

    @Override // X.C164B
    public final String b5() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C012V)) {
            return false;
        }
        C012V c012v = (C012V) obj;
        return Intrinsics.LJFF(this.LIZ, c012v.LIZ) && Intrinsics.LJFF(this.LIZIZ, c012v.LIZIZ) && this.LIZJ == c012v.LIZJ && Intrinsics.LJFF(this.LIZLLL, c012v.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        String str = this.LIZLLL;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerTranslationCacheValue(translatedContent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetLang=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isPreload=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", variant=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C164B
    public final boolean a5() {
        return this.LIZJ;
    }

    @Override // X.C164B
    public final Integer c5() {
        return this.LJ;
    }

    @Override // X.C164B
    public final String getVariant() {
        return this.LIZLLL;
    }

    public C012V(String str, String str2, HashMap map, boolean z) {
        Object next;
        this.LIZ = map;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = str2;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((String) ((Map.Entry) it2.next()).getValue()).length()));
        }
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            next = null;
        } else {
            next = it3.next();
            while (it3.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() + ((Number) it3.next()).intValue());
            }
        }
        this.LJ = (Integer) next;
    }
}
