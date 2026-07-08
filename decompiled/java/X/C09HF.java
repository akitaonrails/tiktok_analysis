package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09HF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09HF implements Serializable {
    public final String LL;
    public final ArrayList<C09HE> LLILLJJLI;
    public static final C09HG Companion = new Object() { // from class: X.09HG
    };
    public static final int $stable = 8;

    public final C09HF copy(String str, ArrayList<C09HE> arrayList) {
        return new C09HF(str, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C09HF)) {
            return false;
        }
        C09HF c09hf = (C09HF) obj;
        return Intrinsics.LJFF(this.LL, c09hf.LL) && Intrinsics.LJFF(this.LLILLJJLI, c09hf.LLILLJJLI);
    }

    public int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HistoryRecordDailyModel(dayDescription=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", historyRecords=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX INFO: renamed from: deepCopy, reason: merged with bridge method [inline-methods] */
    public C09HF m21deepCopy() {
        String str = this.LL;
        ArrayList<C09HE> arrayList = this.LLILLJJLI;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator<C09HE> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().m20deepCopy());
        }
        return new C09HF(str, new ArrayList(arrayList2));
    }

    public final String getDayDescription() {
        return this.LL;
    }

    public final ArrayList<C09HE> getHistoryRecords() {
        return this.LLILLJJLI;
    }

    public final int isSameAs(C09HF c09hf) {
        String str;
        String imageUrl;
        String str2 = this.LL;
        if (c09hf != null) {
            str = c09hf.LL;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str2, str)) {
            return 2;
        }
        if (this.LLILLJJLI.size() != c09hf.LLILLJJLI.size()) {
            return 1;
        }
        Iterator<C09HE> it2 = this.LLILLJJLI.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                int i3 = i2 + 1;
                String imageUrl2 = it2.next().getImageUrl();
                C09HE c09he = (C09HE) C13LP.LJJJLZIJ(i2, c09hf.LLILLJJLI);
                if (c09he != null) {
                    imageUrl = c09he.getImageUrl();
                } else {
                    imageUrl = null;
                }
                if (!Intrinsics.LJFF(imageUrl2, imageUrl)) {
                    break;
                }
                i2 = i3;
            } else {
                i = 1;
                break;
            }
        }
        return i ^ 1;
    }

    public C09HF(String str, ArrayList<C09HE> arrayList) {
        this.LL = str;
        this.LLILLJJLI = arrayList;
    }
}
