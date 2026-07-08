package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0fUl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129370fUl {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final long LJFF;

    public C1129370fUl() {
        this(false, false, 0, 0, null, 0L, 63);
    }

    public final Map<String, String> LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("container_gift_cnt", String.valueOf(this.LIZJ));
        linkedHashMap.put("secondary_gift_position", String.valueOf(this.LIZLLL));
        linkedHashMap.put("is_in_container", this.LIZIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("is_series_gift", this.LIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
        if (this.LIZIZ) {
            linkedHashMap.put("container_gift_id", String.valueOf(this.LJFF));
        }
        return linkedHashMap;
    }

    public C1129370fUl(boolean z, boolean z2, int i, int i2, String str, long j, int i3) {
        z = (i3 & 1) != 0 ? false : z;
        z2 = (i3 & 2) != 0 ? false : z2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        str = (i3 & 16) != 0 ? "" : str;
        j = (i3 & 32) != 0 ? 0L : j;
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = str;
        this.LJFF = j;
    }
}
