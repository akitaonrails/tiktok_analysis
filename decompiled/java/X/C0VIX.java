package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: X.0VIX, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VIX implements InterfaceC2287108xh<List<C0VIZ>, List<C0VIW>> {
    @Override // X.InterfaceC2287108xh
    public final List<C0VIW> apply(List<C0VIZ> list) {
        List<C0VIZ> list2 = list;
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list2.size());
        Iterator<C0VIZ> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
            final C795380VIa c795380VIa = C795380VIa.LIZIZ;
            final UUID uuidFromString = UUID.fromString(null);
            arrayList.add(new Object(uuidFromString, c795380VIa) { // from class: X.0VIW
                public final UUID LIZ;
                public final C795380VIa LJ;
                public final C0VIP LIZIZ = null;
                public final C795380VIa LIZJ = null;
                public final Set<String> LIZLLL = new HashSet((Collection) null);
                public final int LJFF = 0;

                public final int hashCode() {
                    return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF;
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("WorkInfo{mId='");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append('\'');
                    sbLIZ.append(", mState=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", mOutputData=");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(", mTags=");
                    sbLIZ.append(this.LIZLLL);
                    sbLIZ.append(", mProgress=");
                    sbLIZ.append(this.LJ);
                    sbLIZ.append('}');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || C0VIW.class != obj.getClass()) {
                        return false;
                    }
                    C0VIW c0viw = (C0VIW) obj;
                    if (this.LJFF != c0viw.LJFF || !this.LIZ.equals(c0viw.LIZ) || this.LIZIZ != c0viw.LIZIZ || !this.LIZJ.equals(c0viw.LIZJ) || !this.LIZLLL.equals(c0viw.LIZLLL)) {
                        return false;
                    }
                    return this.LJ.equals(c0viw.LJ);
                }

                {
                    this.LIZ = uuidFromString;
                    this.LJ = c795380VIa;
                }
            });
        }
        return arrayList;
    }
}
