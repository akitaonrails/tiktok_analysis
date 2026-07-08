package X;

import android.util.Log;

/* JADX INFO: renamed from: X.0tJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660830tJx extends AbstractC1660840tJy {
    public static final C1660830tJx LIZ = new C1660830tJx();

    public static final void LIZIZ(final InterfaceC2254081DKk interfaceC2254081DKk, final InterfaceC1660870tK1 interfaceC1660870tK1) {
        if (((Number) C0ABW.LIZ.getValue()).intValue() == 1) {
            AbstractC1660840tJy.LIZ(new InterfaceC1660860tK0() { // from class: X.0tJu
                @Override // X.InterfaceC1660860tK0
                public final void LIZ(Exception exc) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("aec model download fail:");
                    sbLIZ.append(Log.getStackTraceString(exc));
                    C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1660870tK1 interfaceC1660870tK12 = interfaceC1660870tK1;
                    if (interfaceC1660870tK12 != null) {
                        interfaceC1660870tK12.LIZIZ(false, null, -1, exc);
                    }
                }

                @Override // X.InterfaceC1660860tK0
                public final void onSuccess(String str) {
                    C201955140j.LIZ("aec model download success");
                    boolean z = false;
                    if (C2354709Kn.LIZIZ(str)) {
                        boolean zN4 = interfaceC2254081DKk.N4(str);
                        InterfaceC1660870tK1 interfaceC1660870tK12 = interfaceC1660870tK1;
                        if (interfaceC1660870tK12 != null) {
                            interfaceC1660870tK12.LIZIZ(true, str, 0, null);
                        }
                        z = zN4;
                    } else {
                        InterfaceC1660870tK1 interfaceC1660870tK13 = interfaceC1660870tK1;
                        if (interfaceC1660870tK13 != null) {
                            interfaceC1660870tK13.LIZIZ(false, str, -1, null);
                        }
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("aec model download success status:");
                    sbLIZ.append(z);
                    C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1660870tK1 interfaceC1660870tK14 = interfaceC1660870tK1;
                    if (interfaceC1660870tK14 != null) {
                        interfaceC1660870tK14.LIZ(z);
                    }
                }
            });
        } else {
            C201955140j.LIZ("disable aec");
        }
    }
}
