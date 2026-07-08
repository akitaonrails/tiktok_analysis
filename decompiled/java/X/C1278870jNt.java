package X;

import com.ss.pusher.core.params.PushBase;
import com.ss.pusher.core.statics.StaticsReport;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jNt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1278870jNt extends C1279020jO8 {
    public final StaticsReport LJIIIZ = new StaticsReport();
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public double LJIILIIL;
    public EnumC1278980jO4 LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public long LJIJI;
    public long LJIJJ;
    public long LJIJJLI;
    public JSONObject LJIL;

    public final boolean LIZ(C1277590jLp c1277590jLp, C1278910jNx c1278910jNx) {
        this.LJ = 0;
        this.LIZLLL = 0;
        this.LJII = 0.0d;
        this.LJI = 0.0d;
        this.LJFF = 0.0d;
        this.LIZJ = 0.0d;
        this.LIZ = 0.0d;
        this.LJIJ = 0;
        this.LJIIZILJ = 0;
        this.LJIILLIIL = 0;
        this.LJIILL = 0;
        this.LJIIL = 0;
        this.LJIIJJI = 0;
        this.LJIIJ = 0;
        this.LJIJJ = 0L;
        this.LJIJI = 0L;
        this.LJIJJLI = 0L;
        this.LJIILIIL = 0.0d;
        this.LJIILJJIL = EnumC1278980jO4.Unknown;
        boolean zLIZ = c1278910jNx.LJ().LIZ(this.LJIIIZ, this);
        StaticsReport staticsReport = this.LJIIIZ;
        staticsReport.getClass();
        this.LJIL = new JSONObject().put("anchor_effect_delay", staticsReport.getInt("estream_frame_delay")).put("anchor_encode_delay", staticsReport.getInt("estream_encode_delay")).put("anchor_push_delay", staticsReport.getInt("estream_push_delay")).put("anchor_total_delay", staticsReport.getInt("estream_total_delay"));
        PushBase pushBase = c1277590jLp.LJI.mPushBase;
        this.LIZLLL = pushBase.defaultBitrate;
        this.LJ = pushBase.maxBitrate;
        pushBase.LJJI.getTag();
        return zLIZ;
    }
}
