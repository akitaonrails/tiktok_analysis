package X;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YQe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873940YQe extends C0YB2 {
    public final C873950YQf LIZ;
    public final int LIZIZ;
    public final C873960YQg LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C873940YQe)) {
            return false;
        }
        C873940YQe c873940YQe = (C873940YQe) obj;
        return Intrinsics.LJFF(this.LIZ, c873940YQe.LIZ) && this.LIZIZ == c873940YQe.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConvKvTableQueryInfo(info=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", orderPriority=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0YB2
    public final String LIZ() {
        String strLIZIZ = "";
        for (String str : this.LIZJ.LIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("kv_");
            sbLIZ.append(str);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" left join ");
            sbLIZ2.append("conversation_kv");
            sbLIZ2.append(" as ");
            sbLIZ2.append(strLIZIZ2);
            sbLIZ2.append(" on conversation_list.");
            sbLIZ2.append(EnumC869310Y8j.COLUMN_ID.key);
            sbLIZ2.append(" = ");
            sbLIZ2.append(strLIZIZ2);
            sbLIZ2.append('.');
            sbLIZ2.append(C0YAW.COLUMN_CONV_ID.getKey());
            sbLIZ2.append(" and (");
            sbLIZ2.append(strLIZIZ2);
            sbLIZ2.append('.');
            C0YAW c0yaw = C0YAW.COLUMN_KEY;
            sbLIZ2.append(c0yaw.getKey());
            sbLIZ2.append("='");
            sbLIZ2.append(str);
            sbLIZ2.append("'  or ");
            sbLIZ2.append(strLIZIZ2);
            sbLIZ2.append('.');
            sbLIZ2.append(c0yaw.getKey());
            sbLIZ2.append(" is null) ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        return strLIZIZ;
    }

    @Override // X.C0YB2
    public final String LIZJ() {
        List<C869450Y8x> list;
        String strLJJLIIIJ;
        List<C869450Y8x> list2 = this.LIZ.LIZIZ;
        return (list2 == null || !(list2.isEmpty() ^ true) || (list = this.LIZ.LIZIZ) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS248S0000000_14.get$arr$(400), 31)) == null) ? "" : strLJJLIIIJ;
    }

    @Override // X.C0YB2
    public final String LIZLLL() {
        Set<String> set = this.LIZJ.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (String str : set) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("kv_");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append('.');
            sbLIZ2.append(C0YAW.COLUMN_VALUE.getKey());
            sbLIZ2.append(" as ");
            sbLIZ2.append(str);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
        }
        return C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, null, 63);
    }

    @Override // X.C0YB2
    public final String LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append(this.LIZJ.LIZ);
        sbLIZ.append(' ');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0YB2
    public final int LIZIZ() {
        return this.LIZIZ;
    }

    public static C873960YQg LJFF(AbstractC874080YQs abstractC874080YQs) {
        String str;
        String strLIZIZ;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (abstractC874080YQs instanceof AbstractC873990YQj) {
            if (abstractC874080YQs instanceof C873980YQi) {
                C873980YQi c873980YQi = (C873980YQi) abstractC874080YQs;
                linkedHashSet.add(c873980YQi.LIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("kv_");
                sbLIZ.append(c873980YQi.LIZ);
                sbLIZ.append('.');
                sbLIZ.append(C0YAW.COLUMN_VALUE.getKey());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (c873980YQi.LIZIZ != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("CAST (");
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append(" as ");
                    sbLIZ2.append(c873980YQi.LIZIZ);
                    sbLIZ2.append(')');
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    if (strLIZIZ2 != null) {
                        strLIZIZ = strLIZIZ2;
                    }
                }
            } else if (abstractC874080YQs instanceof C874000YQk) {
                strLIZIZ = ((C874000YQk) abstractC874080YQs).LIZ;
            } else {
                throw new C1954807lC();
            }
        } else if (abstractC874080YQs instanceof C873970YQh) {
            C873970YQh c873970YQh = (C873970YQh) abstractC874080YQs;
            C873960YQg c873960YQgLJFF = LJFF(c873970YQh.LIZ);
            C873960YQg c873960YQgLJFF2 = LJFF(c873970YQh.LIZJ);
            linkedHashSet.addAll(c873960YQgLJFF.LIZIZ);
            linkedHashSet.addAll(c873960YQgLJFF2.LIZIZ);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append('(');
            sbLIZ3.append(c873960YQgLJFF.LIZ);
            sbLIZ3.append(' ');
            AbstractC874090YQt abstractC874090YQt = c873970YQh.LIZIZ;
            if (Intrinsics.LJFF(abstractC874090YQt, C874020YQm.LIZ)) {
                str = "and";
            } else if (Intrinsics.LJFF(abstractC874090YQt, C874030YQn.LIZ)) {
                str = "=";
            } else if (Intrinsics.LJFF(abstractC874090YQt, new AbstractC874090YQt() { // from class: X.0YQl
            })) {
                str = "!=";
            } else if (Intrinsics.LJFF(abstractC874090YQt, C874050YQp.LIZ)) {
                str = "is";
            } else if (Intrinsics.LJFF(abstractC874090YQt, C874070YQr.LIZ)) {
                str = "or";
            } else if (Intrinsics.LJFF(abstractC874090YQt, C874040YQo.LIZ)) {
                str = ">";
            } else if (Intrinsics.LJFF(abstractC874090YQt, C874060YQq.LIZ)) {
                str = "<";
            } else {
                throw new C1954807lC();
            }
            sbLIZ3.append(str);
            sbLIZ3.append(' ');
            sbLIZ3.append(c873960YQgLJFF2.LIZ);
            sbLIZ3.append(')');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        } else {
            throw new C1954807lC();
        }
        return new C873960YQg(strLIZIZ, linkedHashSet);
    }

    public C873940YQe(C873950YQf c873950YQf, int i) {
        this.LIZ = c873950YQf;
        this.LIZIZ = i;
        this.LIZJ = LJFF(c873950YQf.LIZ);
    }
}
