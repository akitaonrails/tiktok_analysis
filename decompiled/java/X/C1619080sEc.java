package X;

import com.ss.android.ugc.aweme.notice.api.bean.EntranceKey;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0sEc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1619080sEc implements IEvent {
    public final Map<Integer, Integer> LIZ;
    public final Map<EntranceKey, Integer> LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public int LJ;

    public final boolean LIZJ() {
        if (this.LIZ.containsKey(29999) || this.LIZ.containsKey(19999) || this.LIZ.containsKey(30000)) {
            return true;
        }
        Map<EntranceKey, Integer> map = this.LIZIZ;
        int i = C1904270zeb.LIZ;
        return map.containsKey(C1904270zeb.LJIIIIZZ) || this.LIZIZ.containsKey(C1904270zeb.LJFF) || this.LIZIZ.containsKey(C1904270zeb.LJI);
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final IEvent post() {
        if (this.LIZ.isEmpty() && this.LIZIZ.isEmpty()) {
            return this;
        }
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final IEvent postSticky() {
        if (this.LIZ.isEmpty() && this.LIZIZ.isEmpty()) {
            return this;
        }
        C1440005kM.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.LIZJ);
        for (Map.Entry<Integer, Integer> entry : this.LIZ.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            sb.append(" ");
            sb.append(iIntValue);
            sb.append(",");
            sb.append(iIntValue2);
        }
        sb.append(" entrance ");
        for (Map.Entry<EntranceKey, Integer> entry2 : this.LIZIZ.entrySet()) {
            EntranceKey key = entry2.getKey();
            int iIntValue3 = entry2.getValue().intValue();
            sb.append(" ");
            sb.append(key.entranceId);
            sb.append(":");
            sb.append(key.entranceKey);
            sb.append(",");
            sb.append(iIntValue3);
        }
        return sb.toString();
    }

    public C1619080sEc(int i) {
        this.LIZ = new LinkedHashMap();
        this.LIZIZ = new LinkedHashMap();
        this.LJ = -1;
        this.LIZJ = i;
        this.LIZLLL = 100;
    }

    public final boolean LIZ(int i) {
        return this.LIZ.containsKey(Integer.valueOf(i));
    }

    public final int LIZIZ(int i) {
        Integer num = this.LIZ.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public C1619080sEc(int i, int i2) {
        this.LIZ = new LinkedHashMap();
        this.LIZIZ = new LinkedHashMap();
        this.LJ = -1;
        this.LIZJ = 2;
        this.LIZLLL = i;
    }

    public final void LIZLLL(int i, int i2) {
        this.LIZ.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final void LJ(EntranceKey entranceKey, int i) {
        this.LIZIZ.put(entranceKey, Integer.valueOf(i));
    }
}
