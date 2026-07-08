package X;

import android.content.Context;
import android.os.PowerManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cNP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1009490cNP {
    public Aweme LIZLLL;
    public Context LJ;
    public InterfaceC1009610cNb LJFF;
    public int LJI;
    public String LIZ = "initial";
    public String LIZIZ = "non_clicked";
    public String LIZJ = "close";
    public final C01GW LJII = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(458));

    public final boolean LIZ() {
        return Intrinsics.LJFF(this.LIZJ, "open");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r6 = this;
            X.0c8Y r5 = X.C988590bph.LIZ()
            if (r5 == 0) goto L32
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LIZLLL
            r4 = 0
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r0.getAwemeRawAd()
        Lf:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LIZLLL
            r2 = 0
            if (r0 == 0) goto L33
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L33
            boolean r0 = X.C1017180cZo.LJIILLIIL(r0)
            r1 = 1
            if (r0 != r1) goto L33
        L21:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LIZLLL
            if (r0 == 0) goto L2f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L2f
            java.lang.String r4 = X.C1017180cZo.LJII(r0, r2, r2)
        L2f:
            r5.LJIILJJIL(r3, r1, r4)
        L32:
            return
        L33:
            r1 = 0
            goto L21
        L35:
            r3 = r4
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1009490cNP.LIZLLL():void");
    }

    public final void LIZIZ(boolean z) {
        PowerManager powerManager;
        if (z && Intrinsics.LJFF(this.LIZJ, "open")) {
            new Object() { // from class: X.0cNn
            }.getClass();
            try {
                Object objH2 = C786410Ut5.H2(C20642515q3.LIZ(), "power");
                if ((objH2 instanceof PowerManager) && (powerManager = (PowerManager) objH2) != null) {
                    if (powerManager.isScreenOn()) {
                        this.LIZJ = "close";
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final void LIZJ(Context context) {
        String str;
        if (Intrinsics.LJFF(this.LIZIZ, "is_clicked")) {
            return;
        }
        this.LIZIZ = "is_clicked";
        if (Intrinsics.LJFF(this.LIZ, "is_auto_showed")) {
            str = "auto_show_feedplay";
        } else {
            str = "auto_show_feedfinish";
        }
        C1029590ctp.LIZLLL().LJJI(context, this.LIZLLL, null, str, "draw_ad");
    }

    public final void LJ(String str) {
        if (str == null) {
            str = "is_user_clicked";
        }
        this.LIZ = str;
    }
}
