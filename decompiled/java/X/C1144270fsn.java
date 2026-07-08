package X;

import Y.AcS497S0100000_17;
import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.wallet.IWalletCenter;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0fsn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1144270fsn implements InterfaceC1150010g23 {
    public static final /* synthetic */ int LJII = 0;
    public final Context LIZ;
    public final C1144350fsv LIZIZ;
    public final InterfaceC1149850g1n LIZJ;
    public final C01GW LIZLLL;
    public final int LJ;
    public final long LJFF;
    public LiveDialog LJI;

    public String LIZJ() {
        return "daily_ug_consume_task";
    }

    @Override // X.InterfaceC1150010g23
    public final void LJ() {
    }

    @Override // X.InterfaceC1150010g23
    public final void LJIIL() {
    }

    public final C494730Jah LIZIZ() {
        C494720Jag c494720Jag = new C494720Jag();
        C755620TkW c755620TkW = new C755620TkW();
        c755620TkW.LIZ = C497740JfY.LJIJI(2131851987);
        c755620TkW.LIZJ = new AcS497S0100000_17(this, 12);
        c494720Jag.LIZ(new C0TZ2(c755620TkW));
        C755630TkX c755630TkX = new C755630TkX();
        c755630TkX.LIZ = C497740JfY.LJIJI(2131851985);
        c755630TkX.LIZJ = new AcS497S0100000_17(this, 13);
        c494720Jag.LIZ(new C0TZ3(c755630TkX));
        c494720Jag.LIZIZ = 1;
        return new C494730Jah(c494720Jag);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee  */
    @Override // X.InterfaceC1150010g23
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean show() {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1144270fsn.show():boolean");
    }

    public C1144270fsn(Context context, C1144350fsv c1144350fsv, InterfaceC1149850g1n interfaceC1149850g1n) {
        this.LIZ = context;
        this.LIZIZ = c1144350fsv;
        this.LIZJ = interfaceC1149850g1n;
        C01GW c01gwLIZ = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(151));
        this.LIZLLL = c01gwLIZ;
        this.LJ = 1;
        this.LJFF = ((long) c1144350fsv.LIZIZ) - ((IWalletCenter) c01gwLIZ.getValue()).No0();
    }
}
