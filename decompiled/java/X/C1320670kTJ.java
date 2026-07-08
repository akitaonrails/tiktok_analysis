package X;

import android.graphics.drawable.Animatable;

/* JADX INFO: renamed from: X.0kTJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1320670kTJ<INFO> implements InterfaceC1320650kTH<INFO> {
    public final InterfaceC1320650kTH<INFO>[] LIZ;

    public C1320670kTJ(InterfaceC1320650kTH<INFO>... interfaceC1320650kTHArr) {
        this.LIZ = interfaceC1320650kTHArr;
    }

    @Override // X.InterfaceC1320650kTH
    public final void LIZIZ(String str) {
        InterfaceC1320650kTH<INFO>[] interfaceC1320650kTHArr = this.LIZ;
        if (interfaceC1320650kTHArr != null) {
            for (InterfaceC1320650kTH<INFO> interfaceC1320650kTH : interfaceC1320650kTHArr) {
                if (interfaceC1320650kTH != null) {
                    interfaceC1320650kTH.LIZIZ(str);
                }
            }
        }
    }

    @Override // X.InterfaceC1320650kTH
    public final void LIZ(String str, Throwable th) {
        InterfaceC1320650kTH<INFO>[] interfaceC1320650kTHArr = this.LIZ;
        if (interfaceC1320650kTHArr != null) {
            for (InterfaceC1320650kTH<INFO> interfaceC1320650kTH : interfaceC1320650kTHArr) {
                if (interfaceC1320650kTH != null) {
                    interfaceC1320650kTH.LIZ(str, th);
                }
            }
        }
    }

    @Override // X.InterfaceC1320650kTH
    public final void LIZJ(Object obj, String str) {
        InterfaceC1320650kTH<INFO>[] interfaceC1320650kTHArr = this.LIZ;
        if (interfaceC1320650kTHArr != null) {
            for (InterfaceC1320650kTH<INFO> interfaceC1320650kTH : interfaceC1320650kTHArr) {
                if (interfaceC1320650kTH != null) {
                    interfaceC1320650kTH.LIZJ(obj, str);
                }
            }
        }
    }

    @Override // X.InterfaceC1320650kTH
    public final void LIZLLL(String str, Throwable th) {
        InterfaceC1320650kTH<INFO>[] interfaceC1320650kTHArr = this.LIZ;
        if (interfaceC1320650kTHArr != null) {
            for (InterfaceC1320650kTH<INFO> interfaceC1320650kTH : interfaceC1320650kTHArr) {
                if (interfaceC1320650kTH != null) {
                    interfaceC1320650kTH.LIZLLL(str, th);
                }
            }
        }
    }

    @Override // X.InterfaceC1320650kTH
    public final void LJFF(Object obj, String str) {
        InterfaceC1320650kTH<INFO>[] interfaceC1320650kTHArr = this.LIZ;
        if (interfaceC1320650kTHArr != null) {
            for (InterfaceC1320650kTH<INFO> interfaceC1320650kTH : interfaceC1320650kTHArr) {
                if (interfaceC1320650kTH != null) {
                    interfaceC1320650kTH.LJFF(obj, str);
                }
            }
        }
    }

    @Override // X.InterfaceC1320650kTH
    public final void LJ(String str, INFO info, Animatable animatable) {
        InterfaceC1320650kTH<INFO>[] interfaceC1320650kTHArr = this.LIZ;
        if (interfaceC1320650kTHArr != null) {
            for (InterfaceC1320650kTH<INFO> interfaceC1320650kTH : interfaceC1320650kTHArr) {
                if (interfaceC1320650kTH != null) {
                    interfaceC1320650kTH.LJ(str, info, animatable);
                }
            }
        }
    }
}
