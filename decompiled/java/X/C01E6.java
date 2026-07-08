package X;

import tikcast.linkmic.common.LinkerMediaChangeOperator;
import webcast.data.multi_guest_play.CountdownContent;

/* JADX INFO: renamed from: X.01E6, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01E6 {
    public static final C01E5 LIZ(C01E5 c01e5, int i) {
        LinkerMediaChangeOperator linkerMediaChangeOperator;
        CountdownContent countdownContentLIZ = C00XQ.LIZ(c01e5.LIZ, i);
        LinkerMediaChangeOperator linkerMediaChangeOperator2 = c01e5.LIZJ;
        if (linkerMediaChangeOperator2 != null) {
            linkerMediaChangeOperator = new LinkerMediaChangeOperator();
            linkerMediaChangeOperator.nickName = linkerMediaChangeOperator2.nickName;
            linkerMediaChangeOperator.userId = linkerMediaChangeOperator2.userId;
            linkerMediaChangeOperator.operatorType = linkerMediaChangeOperator2.operatorType;
            linkerMediaChangeOperator.displayId = linkerMediaChangeOperator2.displayId;
        } else {
            linkerMediaChangeOperator = null;
        }
        return new C01E5(countdownContentLIZ, c01e5.LIZIZ, linkerMediaChangeOperator, 8);
    }
}
