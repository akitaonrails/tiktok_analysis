package X;

import android.text.TextUtils;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0ogQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482560ogQ implements InterfaceC1479620obg {
    public final /* synthetic */ List LIZ;
    public final /* synthetic */ List LIZIZ;
    public final /* synthetic */ C1484680ojq LIZJ;

    @Override // X.InterfaceC1479620obg
    public final /* synthetic */ void LIZ() {
    }

    @Override // X.InterfaceC1479620obg
    public final /* synthetic */ String LIZJ() {
        return null;
    }

    @Override // X.InterfaceC1479620obg
    public final /* synthetic */ InterfaceC1483230ohV LJIIIIZZ() {
        return null;
    }

    @Override // X.InterfaceC1479620obg
    public final /* synthetic */ void getAspectRatio() {
    }

    @Override // X.InterfaceC1479620obg
    public final /* synthetic */ void getVideoHeight() {
    }

    @Override // X.InterfaceC1479620obg
    public final /* synthetic */ void getVideoWidth() {
    }

    @Override // X.InterfaceC1479620obg
    public final InterfaceC691690RBf LIZIZ() {
        C1351990lHp c1351990lHp = this.LIZJ.LIZ.LIZLLL;
        if (c1351990lHp == null || TextUtils.isEmpty(c1351990lHp.LIZ)) {
            return null;
        }
        return new C1480030ocL(this);
    }

    @Override // X.InterfaceC1479620obg
    public final C1479570obb LIZLLL() {
        C1482570ogR c1482570ogR = this.LIZJ.LIZ.LJ;
        if (c1482570ogR == null) {
            return null;
        }
        return c1482570ogR.LIZIZ;
    }

    @Override // X.InterfaceC1479620obg
    public final HashMap<String, Object> LJ() {
        C1482570ogR c1482570ogR = this.LIZJ.LIZ.LJ;
        if (c1482570ogR == null) {
            return null;
        }
        return c1482570ogR.LIZIZ.LJFF;
    }

    @Override // X.InterfaceC1479620obg
    public final SimVideoUrlModel LJFF() {
        SimVideoUrlModel simVideoUrlModel = this.LIZJ.LIZ.LJI;
        if (simVideoUrlModel != null) {
            return simVideoUrlModel;
        }
        return null;
    }

    @Override // X.InterfaceC1479620obg
    public final List<InterfaceC1479740obs> LJII() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        return null;
    }

    @Override // X.InterfaceC1479620obg
    public final C1698870uJJ LJIIIZ() {
        C1698870uJJ c1698870uJJ = this.LIZJ.LIZ.LJFF;
        if (c1698870uJJ != null) {
            return c1698870uJJ;
        }
        return null;
    }

    @Override // X.InterfaceC1479620obg
    public final void LJIIJ() {
        C1482570ogR c1482570ogR = this.LIZJ.LIZ.LJ;
        if (c1482570ogR == null) {
            return;
        }
        c1482570ogR.LIZIZ.getClass();
    }

    @Override // X.InterfaceC1479620obg
    public final List<InterfaceC1479740obs> LJIIJJI() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC1479620obg
    public final long getDuration() {
        C1482570ogR c1482570ogR = this.LIZJ.LIZ.LJ;
        if (c1482570ogR != null) {
            return c1482570ogR.LIZJ;
        }
        return 0L;
    }

    @Override // X.InterfaceC1479620obg
    public final String getFormat() {
        C1482570ogR c1482570ogR = this.LIZJ.LIZ.LJ;
        if (c1482570ogR == null) {
            return null;
        }
        return c1482570ogR.LIZIZ.LJJIIZ;
    }

    @Override // X.InterfaceC1479620obg
    public final String getKey() {
        return this.LIZJ.LIZ.LIZ;
    }

    @Override // X.InterfaceC1479620obg
    public final String getMeta() {
        C1482570ogR c1482570ogR = this.LIZJ.LIZ.LJ;
        if (c1482570ogR != null) {
            return c1482570ogR.LIZLLL;
        }
        return null;
    }

    @Override // X.InterfaceC1479620obg
    public final String getRatio() {
        return this.LIZJ.LIZ.LIZIZ;
    }

    @Override // X.InterfaceC1479620obg
    public final C1479530obX getRequest() {
        this.LIZJ.LIZ.getClass();
        return null;
    }

    @Override // X.InterfaceC1479620obg
    public final void LJI() {
    }

    public C1482560ogQ(C1484680ojq c1484680ojq, List list, List list2) {
        this.LIZJ = c1484680ojq;
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
