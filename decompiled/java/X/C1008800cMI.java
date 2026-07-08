package X;

import com.ss.android.ugc.aweme.commercialize.model.router.AdUnifyJumpModel;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cMI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008800cMI {
    public static final void LIZ(C1008780cMG c1008780cMG) {
        InterfaceC1014270cV7 interfaceC1014270cV7 = c1008780cMG.LLILLL;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair(EnumC1005330cGh.ENTER_FROM.getRName(), 2);
        pairArr[1] = new Pair(EnumC1005330cGh.REFER.getRName(), "button");
        String rName = EnumC1005330cGh.TAG.getRName();
        String tag = c1008780cMG.LL.getTag();
        if (tag == null) {
            tag = "anole_ad";
        }
        pairArr[2] = new Pair(rName, tag);
        pairArr[3] = new Pair(EnumC1005330cGh.REPORT_CLICK.getRName(), Boolean.TRUE);
        interfaceC1014270cV7.LJIJ(new C991670buf(C2097608Jq.LJIIJ(pairArr)), c1008780cMG);
    }

    public static final void LIZIZ(C1008780cMG c1008780cMG, AdUnifyJumpModel adUnifyJumpModel) {
        c1008780cMG.LLILLL.LJIJ(new C989550brF(new C1009070cMj(adUnifyJumpModel, !Intrinsics.LJFF(c1008780cMG.LLILLJJLI.LJI, "others_homepage"), c1008780cMG.LL.getTag(), c1008780cMG.LL.getRefer())), c1008780cMG);
        C1008810cMJ c1008810cMJ = (C1008810cMJ) c1008780cMG.LLJLIL.getValue();
        c1008810cMJ.logAd((InterfaceC1023400cjq) c1008810cMJ.LJ.getValue());
    }
}
