package X;

import com.ss.ugc.effectplatform.model.net.ModfifyFavoriteResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13Op, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20003713Op extends C13OD<List<? extends String>, ModfifyFavoriteResponse> {
    public final C13RD LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<String> LIZLLL;
    public final boolean LJ;
    public final Map<String, String> LJFF;

    @Override // X.C13OD
    public final C0XSU buildRequest() {
        HashMap map = new HashMap();
        map.putAll(C13RE.LIZ(this.LIZ, true));
        String str = this.LIZIZ;
        if (str != null) {
            map.put("panel", str);
        }
        map.put("effect_ids", this.LIZLLL);
        map.put("type", Integer.valueOf(this.LJ ? 1 : 0));
        Map<String, String> map2 = this.LJFF;
        if (map2 != null) {
            map.putAll(map2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.LJJIIJZLJL);
        this.LIZ.getClass();
        sbLIZ.append("/effect/api");
        sbLIZ.append("/v3/effect/favorite");
        return new C0XSU(C2188811AlT.LIZIZ(sbLIZ), null, C0XSV.POST, map, "application/json", false, null, null, 970);
    }

    @Override // X.C13OD
    public final C13OE parseResponse(C13R7 c13r7, String str) {
        return (C13OE) c13r7.LIZ.convertJsonToObj(str, ModfifyFavoriteResponse.class);
    }

    @Override // X.C13OD
    public final void onSuccess(long j, long j2, long j3, C13OE c13oe) {
        runOnMainThread(new AwS574S0100000_30(this, 408));
    }

    public C20003713Op(C13RD c13rd, String str, String str2, List list, boolean z) {
        super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, str2, null);
        this.LIZ = c13rd;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = list;
        this.LJ = z;
        this.LJFF = null;
    }
}
