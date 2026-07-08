package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0WJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821320WJu {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Map<String, String> LIZLLL;
    public final Map<String, String> LJ;
    public final List<String> LJFF;
    public final int LJI;
    public final int LJII;
    public final String LJIIIIZZ;
    public final int LJIIIZ;
    public final boolean LJIIJ;
    public final List<Integer> LJIIJJI;
    public final String LJIIL;
    public final C0WKO LJIILIIL;
    public final boolean LJIILJJIL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChannelInfo{channelId = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", deviceId = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", installId = ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fpid = ");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", aid = ");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", updateVersionCode = ");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", appKey = ");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", header = ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", extra = ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", urls = ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C821320WJu(int i, int i2, int i3, String str, int i4, String str2, String str3, List list, Map map, boolean z, List list2, String str4, C0WKO c0wko, C0WKN c0wkn) {
        HashMap map2 = new HashMap();
        this.LIZLLL = map2;
        HashMap map3 = new HashMap();
        this.LJ = map3;
        ArrayList arrayList = new ArrayList();
        this.LJFF = arrayList;
        this.LJIIJJI = new ArrayList();
        this.LIZ = i4;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LJIIIZ = i3;
        if (list != null) {
            arrayList.addAll(list);
        }
        if (map != null) {
            map2.putAll(map);
        }
        Map<String, String> map4 = c0wkn.LIZJ;
        if (map4 != null) {
            map3.putAll(map4);
        }
        int i5 = C821340WJw.LIZ;
        this.LJI = i;
        this.LJII = i2;
        this.LJIIIIZZ = str;
        this.LJIIJJI = list2;
        this.LJIIJ = z;
        this.LJIIL = str4;
        this.LJIILIIL = c0wko;
        if (TextUtils.isEmpty(str4)) {
            this.LJIIJ = false;
        }
        this.LJIILJJIL = false;
    }
}
