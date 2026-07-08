package X;

import android.os.BaseBundle;
import android.os.Bundle;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MJl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C566430MJl {
    public final C566440MJm LIZ;
    public final C575860MiG LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public boolean LJ;
    public final C01GW LJFF;

    public final C566430MJl LIZIZ() {
        ((BaseBundle) this.LIZJ.getValue()).putBoolean("Key_enable_multi_select", true);
        return this;
    }

    public C566430MJl(C575860MiG c575860MiG) {
        String shootWay = c575860MiG.getShootWay();
        shootWay = shootWay == null ? "unknown" : shootWay;
        String enterFrom = c575860MiG.getEnterFrom();
        enterFrom = enterFrom == null ? "unknown" : enterFrom;
        String enterMethod = c575860MiG.getEnterMethod();
        this.LIZ = new C566440MJm(c575860MiG.getExtras(), shootWay, enterFrom, enterMethod != null ? enterMethod : "unknown");
        this.LIZJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 114));
        this.LIZLLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(69));
        this.LJFF = C452501pT.LIZ(EnumC452301pR.NONE, new AwS552S0100000_8(this, 115));
        this.LIZIZ = c575860MiG;
    }

    public final C566430MJl LIZ(EnumC538250L9b enumC538250L9b) {
        ((BaseBundle) this.LIZJ.getValue()).putInt("key_default_landing_tab", enumC538250L9b.getType());
        return this;
    }

    public final C566430MJl LIZLLL(Bundle bundle) {
        C786410Ut5.LJJIIJZLJL((Bundle) this.LIZJ.getValue(), bundle);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.app.Activity r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C566430MJl.LIZJ(android.app.Activity, boolean):void");
    }
}
