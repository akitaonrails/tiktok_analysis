package X;

import android.app.Activity;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0d5o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037020d5o implements InterfaceC1037120d5y {
    public View LIZ;
    public C1035680d3e LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public View LJ;
    public final /* synthetic */ C1037070d5t LJFF;

    @Override // X.InterfaceC1037120d5y
    public final String getTag() {
        return "IABPreWarm_createViewTask";
    }

    @Override // X.InterfaceC1037120d5y
    public final C0CFU getType() {
        return C0CFU.COMMON;
    }

    public C1037020d5o(C1037070d5t c1037070d5t) {
        this.LJFF = c1037070d5t;
    }

    @Override // X.InterfaceC1037120d5y
    public final EnumC1002230cBh LIZ(C1037110d5x c1037110d5x) {
        this.LJFF.getClass();
        if (C1037070d5t.LIZLLL() == null) {
            return EnumC1002230cBh.PENDING;
        }
        List listLJIIJJI = C1697810uHb.LJIIJJI(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
        if (!(listLJIIJJI instanceof Collection) || !listLJIIJJI.isEmpty()) {
            Iterator it2 = listLJIIJJI.iterator();
            while (it2.hasNext()) {
                if (it2.next() == null) {
                    return EnumC1002230cBh.READY;
                }
            }
        }
        return EnumC1002230cBh.DONE;
    }

    @Override // X.InterfaceC1037120d5y
    public final String LIZIZ(C1037110d5x c1037110d5x) {
        this.LJFF.getClass();
        Activity activityLIZLLL = C1037070d5t.LIZLLL();
        if (activityLIZLLL == null) {
            return "";
        }
        View viewLIZLLL = this.LIZ;
        if (viewLIZLLL == null) {
            viewLIZLLL = C20673215v0.LIZLLL(R.layout.li, activityLIZLLL, null, false);
        }
        this.LIZ = viewLIZLLL;
        C1035680d3e c1035680d3e = this.LIZIZ;
        if (c1035680d3e == null) {
            c1035680d3e = new C1035680d3e();
        }
        this.LIZIZ = c1035680d3e;
        View viewLIZLLL2 = this.LIZLLL;
        if (viewLIZLLL2 == null) {
            viewLIZLLL2 = C20673215v0.LIZLLL(R.layout.lv, activityLIZLLL, null, false);
        }
        this.LIZLLL = viewLIZLLL2;
        View viewLIZLLL3 = this.LIZJ;
        if (viewLIZLLL3 == null) {
            viewLIZLLL3 = C20673215v0.LIZLLL(R.layout.lu, activityLIZLLL, null, false);
        }
        this.LIZJ = viewLIZLLL3;
        View viewLIZLLL4 = this.LJ;
        if (viewLIZLLL4 == null) {
            viewLIZLLL4 = C20673215v0.LIZLLL(R.layout.f_e, activityLIZLLL, null, false);
        }
        this.LJ = viewLIZLLL4;
        return "IABPreWarm_createViewTask";
    }
}
