package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0PJl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642870PJl extends AbstractC642900PJo {
    public C0N2P LJ;
    public boolean LJFF;
    public Long LJI;
    public Long LJII;

    public final void LIZLLL() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!this.LJFF) {
            linkedHashMap.put("inflow_loadmore_time", Integer.valueOf(LIZ()));
        }
        linkedHashMap.put("is_request_error", this.LIZJ);
        linkedHashMap.put("is_dual_prefetch", Boolean.valueOf(this.LJFF));
        Long l = this.LJI;
        Long l2 = this.LJII;
        if (l != null && l2 != null) {
            linkedHashMap.put("double_ball_show_time", Long.valueOf(l2.longValue() - l.longValue()));
        }
        C642910PJp c642910PJp = this.LIZLLL;
        if (c642910PJp == null) {
            c642910PJp = new C642910PJp();
        }
        c642910PJp.LIZ(linkedHashMap);
        c642910PJp.LJIILJJIL();
        LIZJ();
    }

    @Override // X.AbstractC642900PJo
    public final void LIZIZ() {
        super.LIZIZ();
        if (this.LJ == C0N2P.REQUEST_START) {
            LIZLLL();
        }
        this.LJ = C0N2P.REQUEST_END;
    }

    @Override // X.AbstractC642900PJo
    public final void LIZJ() {
        super.LIZJ();
        this.LJ = null;
        this.LJFF = false;
        this.LJI = null;
        this.LJII = null;
    }

    public final void LJ() {
        LIZJ();
        this.LIZ = Long.valueOf(SystemClock.elapsedRealtime());
        this.LJ = C0N2P.REQUEST_START;
    }
}
