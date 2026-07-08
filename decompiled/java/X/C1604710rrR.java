package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0rrR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1604710rrR {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1480));
    public final ArrayList<Long> LJ = new ArrayList<>();

    public final void LIZJ() {
        long jLIZIZ = C1387310mCn.LIZJ().LIZ - C1387310mCn.LIZIZ(this.LIZIZ);
        ArrayList<Long> arrayList = this.LJ;
        ArrayList arrayList2 = new ArrayList();
        for (Long l : arrayList) {
            if (l.longValue() >= jLIZIZ) {
                arrayList2.add(l);
            }
        }
        this.LJ.clear();
        this.LJ.addAll(arrayList2);
    }

    public final Keva LIZLLL() {
        return (Keva) this.LIZLLL.getValue();
    }

    public final void LJ() {
        this.LJ.add(Long.valueOf(System.currentTimeMillis()));
        LIZJ();
        Keva kevaLIZLLL = LIZLLL();
        ArrayList<Long> arrayList = this.LJ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator<Long> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(String.valueOf(it2.next().longValue()));
        }
        kevaLIZLLL.storeStringArray("key_timestamp_records", (String[]) arrayList2.toArray(new String[0]));
    }

    public final boolean LIZ() {
        long j = LIZLLL().getLong("key_reject_timestamp", 0L);
        if (j <= 0) {
            return false;
        }
        return j >= C1387310mCn.LIZJ().LIZ - C1387310mCn.LIZIZ(3);
    }

    public final void LIZIZ() {
        LIZLLL().erase("key_reject_count");
        LIZLLL().erase("key_reject_timestamp");
    }

    public final boolean LJFF() {
        return LIZLLL().getInt("key_reject_count", 0) >= 3;
    }

    public final boolean LJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("name: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isReachedLimit: ");
        sbLIZ.append(this.LJ.size() >= this.LIZJ);
        sbLIZ.append(", size: ");
        sbLIZ.append(this.LJ.size());
        C2188811AlT.LIZIZ(sbLIZ);
        LIZJ();
        return this.LJ.size() >= this.LIZJ;
    }

    public final void LJII() {
        LIZLLL().storeInt("key_reject_count", LIZLLL().getInt("key_reject_count", 0) + 1);
        LIZLLL().storeLong("key_reject_timestamp", System.currentTimeMillis());
    }

    public C1604710rrR(String str, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        String[] stringArray = LIZLLL().getStringArray("key_timestamp_records", new String[0]);
        ArrayList arrayList = new ArrayList();
        if (stringArray != null && stringArray.length != 0) {
            for (String str2 : stringArray) {
                arrayList.add(Long.valueOf(CastLongProtector.parseLong(str2)));
            }
        }
        C08XD.LJIL(arrayList);
        this.LJ.addAll(arrayList);
    }
}
