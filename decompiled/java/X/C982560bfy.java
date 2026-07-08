package X;

import com.bytedance.android.live.liveinteract.competition.model.CompetitionABInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTask;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0bfy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982560bfy extends C983080bgo {
    public EnumC974260bSa LJ = EnumC974260bSa.NONE;
    public EnumC982500bfs LJFF = EnumC982500bfs.UNKNOWN;
    public List<C981870ber> LJI;
    public List<C982390bfh> LJII;
    public C981540beK LJIIIIZZ;
    public Map<Long, CompetitionABInfo> LJIIIZ;
    public BattleTask LJIIJ;

    public C982560bfy() {
        C13BV c13bv = C13BV.INSTANCE;
        this.LJI = c13bv;
        this.LJII = c13bv;
        C981540beK c981540beK = C981540beK.LJIIL;
        this.LJIIIIZZ = C981540beK.LJIIL;
        this.LJIIIZ = C2097608Jq.LJ();
        this.LJIIJ = new BattleTask();
    }
}
