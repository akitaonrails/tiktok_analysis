package X;

import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import com.ss.android.ugc.feed.platform.ab.NarrowScreenOptConfig;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;

/* JADX INFO: renamed from: X.0RJf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693770RJf {
    public static int LIZ() {
        return ConstraintSizeVM.LLILZ.getValue().intValue();
    }

    public static int LIZIZ() {
        return ConstraintSizeVM.LLILLJJLI.getValue().intValue();
    }

    public static int LIZLLL() {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
        if (C300980Bqy.LIZ()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        }
        return C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LJ(iLIZIZ);
    }

    public static int LIZJ() {
        int iLIZIZ = (!C07HF.LIZ() || C693570RIl.LIZ()) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)) : 0;
        if (C693570RIl.LIZJ(C1DDC.LLILZLL.LJFF)) {
            NarrowScreenOptConfig narrowScreenOptConfig = (NarrowScreenOptConfig) C693570RIl.LIZIZ.getValue();
            if (narrowScreenOptConfig == null) {
                narrowScreenOptConfig = C693570RIl.LIZJ;
            }
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(narrowScreenOptConfig.interactPaddingDp)));
        }
        return C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LJJIII(iLIZIZ);
    }

    public static boolean LJ() {
        return C0HCN.LIZJ() || LowScreenOptimizeAB.LIZ();
    }
}
