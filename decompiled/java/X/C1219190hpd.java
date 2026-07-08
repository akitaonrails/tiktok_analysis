package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hpd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1219190hpd implements InterfaceC19256710Vh {
    public final /* synthetic */ C101N LIZ;

    public C1219190hpd(C101N c101n) {
        this.LIZ = c101n;
    }

    @Override // X.InterfaceC19256710Vh
    public final void LIZ(String str, boolean z) {
        String str2;
        if (!z) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LIZ.LIZ);
            c1389890mGx.LJIIIZ(2131848597);
            c1389890mGx.LJIIJJI();
            return;
        }
        C101N c101n = this.LIZ;
        C1219200hpe c1219200hpe = c101n.LIZJ;
        if (c1219200hpe != null) {
            str2 = c1219200hpe.LIZ;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, "chat")) {
            C1219200hpe c1219200hpe2 = c101n.LIZJ;
            if (c1219200hpe2.LIZIZ == 7000 && c1219200hpe2.LIZJ == 2) {
                C1440005kM.LIZ(new IEvent() { // from class: X.0Z6E
                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent post() {
                        C1440005kM.LIZ(this);
                        return this;
                    }

                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent postSticky() {
                        C1440005kM.LIZIZ(this);
                        return this;
                    }
                });
                return;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1219180hpc(this.LIZ, null), 3);
    }
}
