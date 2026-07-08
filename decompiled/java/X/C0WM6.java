package X;

import android.content.Context;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0WM6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WM6 implements C0WM5, C0WM8 {
    public static final C0WM6 LIZ = new C0WM6();

    @Override // X.C0WM5
    public final void LIZ(C0WN8 c0wn8) {
        List<C0WM5> listLIZ = C04TG.LIZ().LIZ(c0wn8);
        if (listLIZ != null) {
            Iterator<C0WM5> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(c0wn8);
            }
        }
    }

    @Override // X.C0WM5
    public final void LIZIZ(C0WN8 c0wn8) {
        List<C0WM5> listLIZ = C04TG.LIZ().LIZ(c0wn8);
        if (listLIZ != null) {
            Iterator<C0WM5> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(c0wn8);
            }
        }
    }

    @Override // X.C0WM8
    public final void LJI(C0WMF c0wmf, BaseGovernanceModel baseGovernanceModel) {
        List<C0WM8> listLIZIZ = C04TG.LIZ().LIZIZ(c0wmf);
        if (listLIZIZ != null) {
            Iterator<C0WM8> it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LJI(c0wmf, baseGovernanceModel);
            }
        }
    }

    @Override // X.C0WM5
    public final void LJFF(C0WN8 c0wn8, List<C0WMF> list, C0WMD c0wmd) {
        List<C0WM5> listLIZ = C04TG.LIZ().LIZ(c0wn8);
        if (listLIZ != null) {
            Iterator<C0WM5> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LJFF(c0wn8, list, c0wmd);
            }
        }
    }

    @Override // X.C0WM5
    public final void LIZLLL(C0WN8 c0wn8, C0WMF c0wmf, C0WMD c0wmd, C0WM1 c0wm1) {
        List<C0WM5> listLIZ = C04TG.LIZ().LIZ(c0wn8);
        if (listLIZ != null) {
            Iterator<C0WM5> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZLLL(c0wn8, c0wmf, c0wmd, c0wm1);
            }
        }
    }

    @Override // X.C0WM8
    public final void LJ(Context context, C0WMF c0wmf, BaseGovernanceModel baseGovernanceModel, C0WMD c0wmd) {
        List<C0WM8> listLIZIZ = C04TG.LIZ().LIZIZ(c0wmf);
        if (listLIZIZ != null) {
            Iterator<C0WM8> it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LJ(context, c0wmf, baseGovernanceModel, c0wmd);
            }
        }
    }

    @Override // X.C0WM8
    public final void LIZJ(Context context, C0WMF c0wmf, BaseGovernanceModel baseGovernanceModel, C0WMD c0wmd, C0WM1 c0wm1) {
        List<C0WM8> listLIZIZ = C04TG.LIZ().LIZIZ(c0wmf);
        if (listLIZIZ != null) {
            Iterator<C0WM8> it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZJ(context, c0wmf, baseGovernanceModel, c0wmd, c0wm1);
            }
        }
    }
}
