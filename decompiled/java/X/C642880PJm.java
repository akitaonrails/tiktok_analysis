package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0PJm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642880PJm extends AbstractC642900PJo {
    public Long LJ;
    public Long LJFF;
    public C0PGB LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;

    public final void LIZLLL() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("inflow_loadmore_time", Integer.valueOf(LIZ()));
        linkedHashMap.put("is_request_error", this.LIZJ);
        Long l = this.LJ;
        Long l2 = this.LJFF;
        if (l != null && l2 != null) {
            linkedHashMap.put("outflow_data_render_time", Integer.valueOf((int) (l2.longValue() - l.longValue())));
            linkedHashMap.put("outflow_loadmore_has_singluar", Boolean.valueOf(this.LJIIIIZZ));
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
        if (this.LJI != C0PGB.INFLOW_REQUEST_START || this.LJII) {
            return;
        }
        this.LJI = C0PGB.INFLOW_REQUEST_END;
        LIZLLL();
    }

    @Override // X.AbstractC642900PJo
    public final void LIZJ() {
        super.LIZJ();
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = false;
        this.LJIIIIZZ = false;
    }

    public final void LJ() {
        LIZJ();
        this.LIZ = Long.valueOf(SystemClock.elapsedRealtime());
        this.LJI = C0PGB.INFLOW_REQUEST_START;
    }
}
