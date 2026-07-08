package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: renamed from: X.0keY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1327640keY {
    public final ContentResolver LIZ;
    public final Resources LIZIZ;
    public final AssetManager LIZJ;
    public final InterfaceC1330410kj1 LIZLLL;
    public final InterfaceC1330200kig LJ;
    public final InterfaceC1330460kj6 LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ = false;
    public final InterfaceC1328030kfB LJIIIZ;
    public final InterfaceC1327440keE LJIIJ;
    public final C1326950kdR LJIIJJI;
    public final C1326950kdR LJIIL;
    public final Map<String, C1326950kdR> LJIILIIL;
    public final InterfaceC1325150kaX<InterfaceC1324680kZm, InterfaceC1327060kdc> LJIILJJIL;
    public final InterfaceC1325150kaX<InterfaceC1324680kZm, AbstractC1327750kej> LJIILL;
    public final InterfaceC1325150kaX<InterfaceC1324680kZm, Bitmap> LJIILLIIL;
    public final InterfaceC1325590kbF LJIIZILJ;
    public final AbstractC1301670jyf LJIJ;
    public final int LJIJI;
    public final int LJIJJ;
    public final boolean LJIJJLI;
    public final int LJIL;
    public final boolean LJJ;

    public final C1327980kf6 LIZ(InterfaceC1327390ke9<C1328480kfu> interfaceC1327390ke9, boolean z, InterfaceC1327160kdm interfaceC1327160kdm) {
        return new C1327980kf6(this.LJIIIZ.LIZ(), this.LJIIJ, interfaceC1327390ke9, z, interfaceC1327160kdm);
    }

    public C1327640keY(Context context, InterfaceC1330410kj1 interfaceC1330410kj1, InterfaceC1330200kig interfaceC1330200kig, InterfaceC1330460kj6 interfaceC1330460kj6, boolean z, boolean z2, InterfaceC1328030kfB interfaceC1328030kfB, InterfaceC1327440keE interfaceC1327440keE, C1325170kaZ c1325170kaZ, C1325170kaZ c1325170kaZ2, C1325170kaZ c1325170kaZ3, C1326950kdR c1326950kdR, C1326950kdR c1326950kdR2, C1333180knU c1333180knU, InterfaceC1325590kbF interfaceC1325590kbF, AbstractC1301670jyf abstractC1301670jyf, int i, int i2, boolean z3, int i3, boolean z4) {
        this.LIZ = C786410Ut5.N3(context).getContentResolver();
        this.LIZIZ = C786410Ut5.N3(context).getResources();
        this.LIZJ = C786410Ut5.N3(context).getAssets();
        this.LIZLLL = interfaceC1330410kj1;
        this.LJ = interfaceC1330200kig;
        this.LJFF = interfaceC1330460kj6;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIZ = interfaceC1328030kfB;
        this.LJIIJ = interfaceC1327440keE;
        this.LJIILL = c1325170kaZ;
        this.LJIILLIIL = c1325170kaZ2;
        this.LJIILJJIL = c1325170kaZ3;
        this.LJIIJJI = c1326950kdR;
        this.LJIIL = c1326950kdR2;
        this.LJIILIIL = c1333180knU;
        this.LJIIZILJ = interfaceC1325590kbF;
        this.LJIJ = abstractC1301670jyf;
        this.LJIJI = i;
        this.LJIJJ = i2;
        this.LJIJJLI = z3;
        this.LJIL = i3;
        this.LJJ = z4;
    }
}
