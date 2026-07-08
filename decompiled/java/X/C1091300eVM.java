package X;

import Y.AfS186S0100000_17;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;

/* JADX INFO: renamed from: X.0eVM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091300eVM extends C0HWE<C1323050kX9<InterfaceC1327060kdc>> {
    public final /* synthetic */ View LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ InterfaceC1091290eVL LIZJ;

    @Override // X.C0HWE
    public final void LJ(InterfaceC1320200kSY<C1323050kX9<InterfaceC1327060kdc>> interfaceC1320200kSY) {
        InterfaceC1091290eVL interfaceC1091290eVL = this.LIZJ;
        if (interfaceC1091290eVL != null) {
            interfaceC1091290eVL.LIZ(new RuntimeException());
        }
    }

    @Override // X.C0HWE
    public final void LJFF(InterfaceC1320200kSY<C1323050kX9<InterfaceC1327060kdc>> interfaceC1320200kSY) {
        if (interfaceC1320200kSY != null && interfaceC1320200kSY.LIZ() && interfaceC1320200kSY.getResult() != null && interfaceC1320200kSY.getResult().get() != null) {
            C11NZ.LJJJJZ(interfaceC1320200kSY.getResult().get()).LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2<InterfaceC1327060kdc, Bitmap>() { // from class: X.0eVN
                @Override // X.InterfaceC1487280oo2
                public final Bitmap apply(InterfaceC1327060kdc interfaceC1327060kdc) {
                    return BitmapFactory.decodeStream(new C1325260kai(interfaceC1327060kdc));
                }
            }).LJIILIIL(new C0UO0()).LJJLL(new AfS186S0100000_17(this, 206), C0J1R.LIZ);
        }
    }

    public C1091300eVM(View view, boolean z, InterfaceC1091290eVL interfaceC1091290eVL) {
        this.LIZ = view;
        this.LIZIZ = z;
        this.LIZJ = interfaceC1091290eVL;
    }
}
