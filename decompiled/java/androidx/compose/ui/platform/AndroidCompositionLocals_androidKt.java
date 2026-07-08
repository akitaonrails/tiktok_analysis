package androidx.compose.ui.platform;

import X.C13DN;
import X.C13DQ;
import X.C13DR;
import X.C13GF;
import X.C13ZT;
import X.C2188811AlT;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class AndroidCompositionLocals_androidKt {
    public static final C13DQ LIZ = C13ZT.LIZJ(AFwS219S0000000_30.get$arr$(18));
    public static final C13DR LIZIZ = new C13DR(AFwS219S0000000_30.get$arr$(19));
    public static final C13DR LIZJ = new C13DR(AFwS219S0000000_30.get$arr$(20));
    public static final C13DR LIZLLL = new C13DR(AFwS219S0000000_30.get$arr$(21));
    public static final C13DR LJ = new C13DR(AFwS219S0000000_30.get$arr$(22));
    public static final C13DR LJFF = new C13DR(AFwS219S0000000_30.get$arr$(23));

    public static final C13DQ LIZJ() {
        return LIZ;
    }

    public static final C13DR LIZLLL() {
        return LIZIZ;
    }

    public static final C13DN<LifecycleOwner> getLocalLifecycleOwner() {
        return C13GF.LIZ;
    }

    public static final void LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompositionLocal ");
        sbLIZ.append(str);
        sbLIZ.append(" not present");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(final androidx.compose.ui.platform.AndroidComposeView r13, kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r14, X.InterfaceC1680500tpg r15, int r16) {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.LIZ(androidx.compose.ui.platform.AndroidComposeView, kotlin.jvm.functions.Function2, X.0tpg, int):void");
    }
}
