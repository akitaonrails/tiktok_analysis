package X;

import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;

/* JADX INFO: renamed from: X.0cwz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1031550cwz {
    public EnumC1031640cx8 LIZ = EnumC1031640cx8.CLOSE;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public InterfaceC1031540cwy LJFF;
    public Fragment LJI;
    public float LJII;
    public float LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;

    public final C16BC<?> LIZIZ() {
        Fragment fragment = this.LJI;
        if (fragment == null) {
            return null;
        }
        String str = TuxSheet._pnsPageId;
        return C1391190mJ3.LJIIIZ(fragment);
    }

    public final boolean LIZ(MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        boolean z = false;
        if (numValueOf != null) {
            if (numValueOf.intValue() == 0) {
                this.LJII = motionEvent.getX();
                this.LJIIIIZZ = motionEvent.getY();
                this.LJIIIZ = false;
            } else if (numValueOf != null && (numValueOf.intValue() == 1 || numValueOf.intValue() == 3)) {
                float fAbs = Math.abs(motionEvent.getX() - this.LJII);
                float fAbs2 = Math.abs(motionEvent.getY() - this.LJIIIIZZ);
                if (fAbs > 5.0f || fAbs2 > 5.0f) {
                    z = true;
                }
                this.LJIIIZ = true;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkIfOnlyScrolling, deltaX: ");
                sbLIZ.append(fAbs);
                sbLIZ.append(", deltaY: ");
                sbLIZ.append(fAbs2);
                C2188811AlT.LIZIZ(sbLIZ);
                C989530brD.LIZ();
                return z;
            }
        }
        return false;
    }

    public final void LIZJ(InterfaceC1031540cwy interfaceC1031540cwy) {
        if (this.LIZJ) {
            return;
        }
        if (interfaceC1031540cwy != null) {
            Object hostModel = interfaceC1031540cwy.getHostModel();
            if (hostModel != null) {
                interfaceC1031540cwy.trackEvent(new C1031310cwb("direct_openpage_ad", "show", "page", interfaceC1031540cwy.getCustomAdExtraDataParams()), hostModel);
            }
            interfaceC1031540cwy.onRewardAdShow(null);
        }
        this.LIZJ = true;
    }

    public final void LIZLLL(boolean z) {
        if (!this.LJIIIZ) {
            return;
        }
        if (((Boolean) C277640AuQ.LIZ.getValue()).booleanValue()) {
            if (!z) {
                C1031670cxB.LIZ(this.LJFF, false);
            }
        } else {
            C1031670cxB.LIZ(this.LJFF, z);
        }
        this.LIZIZ = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportRealtimeClick, isScrolling: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C989530brD.LIZ();
    }
}
