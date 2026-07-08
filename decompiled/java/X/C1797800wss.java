package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0wss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1797800wss {
    public volatile C1796240wqM LIZ;
    public final Context LIZIZ;
    public volatile InterfaceC1796100wq8 LIZJ;
    public volatile boolean LIZLLL;
    public volatile boolean LJ;
    public volatile boolean LJFF;
    public volatile boolean LJI;
    public volatile boolean LJII;

    public /* synthetic */ C1797800wss(Context context) {
        this.LIZIZ = context;
    }

    public final boolean LIZJ() {
        try {
            Context context = this.LIZIZ;
            return C786410Ut5.V3(context.getPackageManager(), context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final C1BAY LIZ() {
        Context context = this.LIZIZ;
        if (context == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        if (this.LIZJ == null) {
            if (this.LIZLLL || this.LJ || this.LJFF || this.LJI) {
                return LIZJ() ? new C1BAP(context, this) : new C1BAY(context, this);
            }
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if (this.LIZ == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        getClass();
        if (this.LIZJ == null) {
            C1796240wqM c1796240wqM = this.LIZ;
            return LIZJ() ? new C1BAP(c1796240wqM, context, this) : new C1BAY(c1796240wqM, context, this);
        }
        C1796240wqM c1796240wqM2 = this.LIZ;
        InterfaceC1796100wq8 interfaceC1796100wq8 = this.LIZJ;
        return LIZJ() ? new C1BAP(c1796240wqM2, context, interfaceC1796100wq8, this) : new C1BAY(c1796240wqM2, context, interfaceC1796100wq8, this);
    }

    public final void LIZIZ() {
        C1797820wsu c1797820wsu = new C1797820wsu();
        c1797820wsu.LIZ = 1;
        int i = new C1797810wst(c1797820wsu).LIZ;
        if (i == 1) {
            this.LJ = true;
            return;
        }
        if (i == 2) {
            this.LJFF = true;
        } else if (i == 3) {
            this.LIZLLL = true;
        } else {
            if (i != 4) {
                throw new IllegalArgumentException("An invalid BillingProgram has been provided.");
            }
            this.LJI = true;
        }
    }
}
