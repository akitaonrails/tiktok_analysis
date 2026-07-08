package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0SNj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC1294060jmO
public final class C720330SNj {
    public static final Map<String, EnumC308670C8b> LIZ = new LinkedHashMap();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(250));

    public static int LIZ(Context context, CharSequence charSequence) {
        C01GW<Integer> c01gw = ConstraintSizeVM.LL;
        int iLIZLLL = C693770RJf.LIZLLL();
        int iLJIIJ = (C12ES.LJIIJ(context) - iLIZLLL) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
        C444830HcP c444830HcP = new C444830HcP();
        c444830HcP.LJIILL(iLJIIJ);
        c444830HcP.LJIILIIL(charSequence);
        c444830HcP.LJIILJJIL(C475630Ikz.LIZIZ(R.attr.a1h, context));
        c444830HcP.LJII(41);
        return c444830HcP.LIZIZ().getLineCount();
    }

    public static String LIZJ(Aweme aweme, C0S5R c0s5r, C0S5S c0s5s) {
        if ((c0s5r != null && c0s5r.LIZJ) || (c0s5s != null && c0s5s.LIZIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(aweme.getAid());
            sbLIZ.append(C161N.LIZIZ.LLIIZ());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return aweme.getAid();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0222 A[LOOP:1: B:98:0x021c->B:100:0x0222, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051 A[PHI: r7
      0x0051: PHI (r7v1 java.lang.String) = (r7v13 java.lang.String), (r7v14 java.lang.String) binds: [B:27:0x004f, B:23:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.EnumC308670C8b LIZIZ(android.content.Context r13, com.ss.android.ugc.aweme.feed.model.Aweme r14, X.C0S5R r15, X.C0S5S r16) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C720330SNj.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, X.0S5R, X.0S5S):X.0C8b");
    }
}
