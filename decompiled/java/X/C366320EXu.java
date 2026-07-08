package X;

import androidx.lifecycle.LiveData;

/* JADX INFO: renamed from: X.0EXu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366320EXu {
    public final InterfaceC1446740nke LIZ;

    public final C348100Dkm LIZ() {
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1446740nke interfaceC1446740nke = this.LIZ;
        InterfaceC1452170ntP value = (interfaceC1446740nke == null || (liveDataG = interfaceC1446740nke.g()) == null) ? null : liveDataG.getValue();
        if (value instanceof C1463670oBx) {
            return ((C1463670oBx) value).LIZLLL();
        }
        return null;
    }

    public C366320EXu(InterfaceC1446740nke interfaceC1446740nke) {
        this.LIZ = interfaceC1446740nke;
    }
}
