package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0fof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141710fof implements InterfaceC1142480fpu {
    public final Long LIZ;
    public final Map<String, String> LIZIZ;

    @Override // X.InterfaceC1142480fpu
    public final void LIZIZ(float f, float f2, float f3, float f4) {
    }

    @Override // X.InterfaceC1142480fpu
    public final void LJII() {
    }

    @Override // X.InterfaceC1142480fpu
    public final void onStart() {
    }

    @Override // X.InterfaceC1142480fpu
    public final void onStop() {
        LIZ(null);
    }

    @Override // X.InterfaceC1142480fpu
    public final void LIZ(C1141460foG c1141460foG) {
        long jLongValue;
        C0N7I c0n7i = C0N7I.PLAYCONTROLLER_END;
        Long l = this.LIZ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C1141740foi.LIZ(c0n7i, jLongValue, this.LIZIZ);
    }

    @Override // X.InterfaceC1142480fpu
    public final void LIZJ(C1141050fnb c1141050fnb) {
        LIZ(null);
    }

    public C1141710fof(Long l, Map<String, String> map) {
        this.LIZ = l;
        this.LIZIZ = map;
    }
}
