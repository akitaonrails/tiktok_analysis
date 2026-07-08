package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0Cpp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325750Cpp {
    public static final void LIZ(AbstractC325730Cpn abstractC325730Cpn, C325780Cps c325780Cps) {
        Context contextLIZ;
        if (abstractC325730Cpn instanceof C325740Cpo) {
            C325740Cpo c325740Cpo = (C325740Cpo) abstractC325730Cpn;
            C1483340ohg.LJJ(c325740Cpo.LIZIZ, c325740Cpo.LIZ, c325780Cps.LJFF.getValue());
            return;
        }
        if (abstractC325730Cpn instanceof C325710Cpl) {
            C0N44 c0n44 = C0N44.LIZ;
            Aweme aweme = ((C325710Cpl) abstractC325730Cpn).LIZ;
            c0n44.getClass();
            C0N44.LIZIZ(aweme);
            return;
        }
        if (abstractC325730Cpn instanceof C325720Cpm) {
            C325720Cpm c325720Cpm = (C325720Cpm) abstractC325730Cpn;
            C442540HWy c442540HWy = C442540HWy.LIZ;
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ == null || (contextLIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null) {
                C844470XAv.LIZ.getClass();
                contextLIZ = C844470XAv.LIZ();
            }
            Aweme aweme2 = c325720Cpm.LIZ;
            c442540HWy.getClass();
            C442540HWy.LIZIZ(contextLIZ, aweme2);
            return;
        }
        if (abstractC325730Cpn instanceof C325760Cpq) {
            C325760Cpq c325760Cpq = (C325760Cpq) abstractC325730Cpn;
            String str = c325760Cpq.LIZIZ;
            if (str == null) {
                str = c325780Cps.LJ;
            }
            C0DK3.LIZ(c325760Cpq.LIZ, str, c325760Cpq.LIZJ, c325760Cpq.LIZLLL);
            return;
        }
        if (abstractC325730Cpn instanceof C223200ta) {
            abstractC325730Cpn.getClass();
            C0DK3.LIZ(null, null, EnumC325870Cq1.DOWNLOAD_ASYNC, null);
            return;
        }
        throw new C1954807lC();
    }
}
