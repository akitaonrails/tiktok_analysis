package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0lHX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351810lHX {
    public static final /* synthetic */ int LIZLLL = 0;
    public final InterfaceC1351830lHZ LIZ;
    public boolean LIZIZ;
    public final C1554320qYA LIZJ = new C1554320qYA(this, 1);

    public final void LIZ() {
        if (this.LIZIZ) {
            try {
                C786410Ut5.LJJIFFI(C1383370m6R.LIZ, this.LIZJ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Error unregistering headset receiver: ");
                sbLIZ.append(e.getMessage());
                C1344030l4z.LIZ("HeadsetReceiverHelper", C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LIZIZ = false;
        }
    }

    public C1351810lHX(InterfaceC1351830lHZ interfaceC1351830lHZ) {
        this.LIZ = interfaceC1351830lHZ;
    }
}
