package X;

import com.bytedance.android.starship.solaria.IStarshipSolaria;
import com.bytedance.android.starship.solaria.StarshipSolaria;

/* JADX INFO: renamed from: X.04WQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04WQ {
    public static final IStarshipSolaria LIZ;

    static {
        IStarshipSolaria iStarshipSolaria;
        Object objLIZ = C04TD.LIZ(IStarshipSolaria.class, false);
        if (objLIZ != null) {
            iStarshipSolaria = (IStarshipSolaria) objLIZ;
        } else {
            if (C04TD.LJI == null) {
                synchronized (IStarshipSolaria.class) {
                    if (C04TD.LJI == null) {
                        C04TD.LJI = new StarshipSolaria();
                    }
                }
            }
            iStarshipSolaria = C04TD.LJI;
        }
        LIZ = iStarshipSolaria;
    }
}
