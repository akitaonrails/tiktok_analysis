package X;

import com.ss.android.ugc.aweme.ug.spi.IPraiseDialogDiff;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;

/* JADX INFO: renamed from: X.0zmk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909320zmk {
    public static final C1909320zmk LIZ = new C1909320zmk();
    public static final C1909300zmi LIZIZ;

    static {
        EnumC1909250zmd enumC1909250zmd = EnumC1909250zmd.ACTIVATION;
        LIZIZ = new C1909300zmi(enumC1909250zmd);
        IPraiseDialogDiff.LIZ.getClass();
        if (C1909260zme.LIZ().getConfig().LJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(enumC1909250zmd);
            sbLIZ.append(": start play time saving timer");
            C1909270zmf.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            new PthreadTimer("PlayTimeTriggerHelper").schedule(new C785870UsD(2), 0L, 120000L);
        }
    }
}
