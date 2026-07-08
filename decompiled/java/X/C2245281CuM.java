package X;

import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.CandidateAdData;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1CuM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2245281CuM {
    public long LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public final ConcurrentHashMap<String, CandidateAdData> LIZ = new ConcurrentHashMap<>();
    public final C2245631Cuv LJ = new C2245631Cuv();
    public String LJFF = "";
    public final C01GW LJI = C452501pT.LIZIZ(new C2245301CuO());

    public final synchronized void LIZ() {
        Iterator<CandidateAdData> it2 = this.LIZ.values().iterator();
        while (it2.hasNext()) {
            it2.next().setSource(EnumC220800tC.CACHE.ordinal());
        }
    }
}
