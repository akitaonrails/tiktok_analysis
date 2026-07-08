package X;

import android.content.Context;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EVx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365830EVx {
    public static final C01GW<C365830EVx> LIZLLL = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS191S0000000_5.get$arr$(311));
    public Context LIZ;
    public C365820EVw LIZIZ;
    public volatile boolean LIZJ;

    public final C365820EVw LIZ() {
        C365820EVw c365820EVw = this.LIZIZ;
        if (c365820EVw != null) {
            return c365820EVw;
        }
        return null;
    }

    public final void LIZIZ(C365820EVw c365820EVw) {
        if (this.LIZJ) {
            C355090Dw3.LIZJ("EditorSDK redundant initV2");
            return;
        }
        if (c365820EVw.LIZ != null) {
            this.LIZIZ = c365820EVw;
            Context context = c365820EVw.LIZIZ;
            this.LIZ = context;
            Context context2 = null;
            if (context == null) {
                context = null;
            }
            C372670EjJ.LIZ = LIZ().LIZIZ;
            C351620DqS.LIZ = C786410Ut5.N3(context);
            if (C1906007dK.LIZ == -1) {
                if (Intrinsics.LJFF("tiktok", "aweme")) {
                    C1906007dK.LIZ(0);
                } else {
                    C1906007dK.LIZ(1);
                }
            }
            C01GW<C365840EVy> c01gw = C365840EVy.LIZIZ;
            C365840EVy c365840EVyLIZ = C351010DpT.LIZ();
            Context context3 = this.LIZ;
            if (context3 != null) {
                context2 = context3;
            }
            c365840EVyLIZ.LIZ = C786410Ut5.N3(context2);
            InterfaceC357880E1i interfaceC357880E1i = c365820EVw.LIZJ;
            if (interfaceC357880E1i != null) {
                interfaceC357880E1i.LIZ(C0E5G.LIZ);
            }
            InterfaceC365850EVz interfaceC365850EVz = c365820EVw.LIZLLL;
            if (interfaceC365850EVz != null) {
                interfaceC365850EVz.LIZ();
            }
            this.LIZJ = true;
            return;
        }
        throw new IllegalStateException("resourceProvider is required.");
    }
}
