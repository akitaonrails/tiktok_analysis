package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.minis.api.revisitedu.IMinisRevisitMissionService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wzj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1802050wzj {
    public final ViewGroup LIZ;
    public final IMinisRevisitMissionService LIZIZ;
    public final InterfaceC1799880wwE LIZJ;
    public final C1800000wwQ LIZLLL;
    public C0F4A LJ;
    public int LJFF;
    public boolean LJI;

    public final void LIZ() {
        this.LJFF++;
        this.LJI = false;
        C0F4A c0f4a = this.LJ;
        if (c0f4a != null) {
            c0f4a.LLIZ++;
            c0f4a.LLJJIJI = false;
            c0f4a.LLJJIJIIJIL = false;
            c0f4a.LLJJIJIL = false;
            c0f4a.animate().cancel();
            C786410Ut5.W1(c0f4a, 8);
        }
    }

    public final boolean LIZIZ(int i) {
        ViewParent parent;
        if (i == this.LJFF) {
            C0F4A c0f4a = this.LJ;
            if (c0f4a != null) {
                parent = c0f4a.getParent();
            } else {
                parent = null;
            }
            if (Intrinsics.LJFF(parent, this.LIZ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1802050wzj(ViewGroup viewGroup, IMinisRevisitMissionService iMinisRevisitMissionService) {
        C1395750mQP c1395750mQP = new C1395750mQP();
        C1800000wwQ c1800000wwQ = new C1800000wwQ();
        this.LIZ = viewGroup;
        this.LIZIZ = iMinisRevisitMissionService;
        this.LIZJ = c1395750mQP;
        this.LIZLLL = c1800000wwQ;
    }
}
