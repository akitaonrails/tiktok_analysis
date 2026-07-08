package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0ekS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1100660ekS<T> implements InterfaceC1100540ekG {
    public final InterfaceC1100670ekT<T> LIZ;
    public boolean LIZIZ = true;

    public C1100660ekS(InterfaceC1100670ekT<T> interfaceC1100670ekT) {
        this.LIZ = interfaceC1100670ekT;
    }

    @Override // X.InterfaceC1100540ekG
    public void LIZ(C1100530ekF c1100530ekF, EnumC1100550ekH enumC1100550ekH) {
        if (c1100530ekF.LIZ == EnumC1100490ekB.END) {
            this.LIZIZ = false;
            C1100530ekF.LIZIZ("addObserver");
            ((ArrayList) c1100530ekF.LIZIZ).remove(this);
        }
    }
}
