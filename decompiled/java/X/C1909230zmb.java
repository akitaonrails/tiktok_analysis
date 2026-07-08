package X;

import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.ug.spi.IPraiseDialogDiff;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0zmb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909230zmb {
    public static final C1909230zmb LIZ = new C1909230zmb();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(781));

    public static boolean LIZ() {
        C1909300zmi c1909300zmi = new C1909300zmi(EnumC1909250zmd.LIKE);
        if (c1909300zmi.LJII == 0) {
            c1909300zmi.LIZIZ(System.currentTimeMillis());
        }
        return System.currentTimeMillis() - c1909300zmi.LJII >= TimeUnit.DAYS.toMillis(LIZJ().getConfig().LIZJ);
    }

    public static IPraiseDialogDiff LIZJ() {
        return (IPraiseDialogDiff) LIZIZ.getValue();
    }

    public static void LIZLLL(AbstractC1909290zmh abstractC1909290zmh) {
        LIZJ().LJ();
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "praise_dialog_opt_type", true) == 0) {
            PopupManager.LJIJI(new C1909390zmr(abstractC1909290zmh), true);
        } else {
            PopupManager.LJIJI(new C1909400zms(abstractC1909290zmh), true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r0.intValue() != 0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(android.content.Context r15, X.EnumC1909250zmd r16) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1909230zmb.LIZIZ(android.content.Context, X.0zmd):boolean");
    }
}
