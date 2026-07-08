package X;

/* JADX INFO: renamed from: X.0TEI, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TEI implements Runnable {
    public static final C0TEI LL = new C0TEI();

    public static void LIZ() {
        if (C0TEL.LJIIIIZZ.LJLZ() == EnumC743340TDw.CAST_STATE_RECONNECTING) {
            C0TEL.LJII.onNext(new C743220TDk(0, 0, ""));
        } else {
            C743540TEq.LJJIJ(C0TET.WIRED, "fail", C0TEL.LJFF, "", "timeout");
            C0TEL.LJII.onNext(new AbstractC743230TDl() { // from class: X.0TDs
                public final long LIZ = 20000;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C743300TDs) && this.LIZ == ((C743300TDs) obj).LIZ;
                }

                public final int hashCode() {
                    return C786410Ut5.Y2(this.LIZ);
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ConnectTimeoutError(expireDuration=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
            });
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("GamePhoneAsCameraWiredManager@8ecd.timeoutRunnable$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GamePhoneAsCameraWiredManager@8ecd.timeoutRunnable$1");
    }
}
