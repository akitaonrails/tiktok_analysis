package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;

/* JADX INFO: renamed from: X.1BSU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BSU extends C1B9K implements C1BS1 {
    @Override // X.C1BS1
    public final void LJIIZILJ() {
        LLLIIL(8, LLILLIZIL());
    }

    @Override // X.C1BS1
    public final float LJJIIJZLJL() {
        Parcel parcelLJJJZ = LJJJZ(2, LLILLIZIL());
        float f = parcelLJJJZ.readFloat();
        parcelLJJJZ.recycle();
        return f;
    }

    @Override // X.C1BS1
    public final C1BSP LJJIIZI() {
        C1BSP c2205131BSd;
        Parcel parcelLJJJZ = LJJJZ(25, LLILLIZIL());
        IBinder strongBinder = parcelLJJJZ.readStrongBinder();
        if (strongBinder == null) {
            c2205131BSd = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            c2205131BSd = iInterfaceQueryLocalInterface instanceof C1BSP ? (C1BSP) iInterfaceQueryLocalInterface : new C2205131BSd(strongBinder);
        }
        parcelLJJJZ.recycle();
        return c2205131BSd;
    }

    @Override // X.C1BS1
    public final boolean X0() {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        parcelLLILLIZIL.writeInt(0);
        Parcel parcelLJJJZ = LJJJZ(20, parcelLLILLIZIL);
        boolean z = parcelLJJJZ.readInt() != 0;
        parcelLJJJZ.recycle();
        return z;
    }

    @Override // X.C1BS1
    public final void clear() {
        LLLIIL(14, LLILLIZIL());
    }

    @Override // X.C1BS1
    public final CameraPosition getCameraPosition() {
        Parcel parcelLJJJZ = LJJJZ(1, LLILLIZIL());
        CameraPosition cameraPosition = (CameraPosition) C837530WtL.LIZ(parcelLJJJZ, CameraPosition.CREATOR);
        parcelLJJJZ.recycle();
        return cameraPosition;
    }

    @Override // X.C1BS1
    public final C1BSA k0() {
        C1BSA c2205101BSa;
        Parcel parcelLJJJZ = LJJJZ(26, LLILLIZIL());
        IBinder strongBinder = parcelLJJJZ.readStrongBinder();
        if (strongBinder == null) {
            c2205101BSa = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            c2205101BSa = iInterfaceQueryLocalInterface instanceof C1BSA ? (C1BSA) iInterfaceQueryLocalInterface : new C2205101BSa(strongBinder);
        }
        parcelLJJJZ.recycle();
        return c2205101BSa;
    }

    public C1BSU(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // X.C1BS1
    public final void B0(C1BSR c1bsr) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, c1bsr);
        LLLIIL(33, parcelLLILLIZIL);
    }

    @Override // X.C1BS1
    public final void D(BinderC2205161BSg binderC2205161BSg) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, binderC2205161BSg);
        LLLIIL(28, parcelLLILLIZIL);
    }

    @Override // X.C1BS1
    public final void D0(BinderC2205301BSu binderC2205301BSu) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, binderC2205301BSu);
        LLLIIL(30, parcelLLILLIZIL);
    }

    @Override // X.C1BS1
    public final void LJZ(BinderC2205281BSs binderC2205281BSs) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, binderC2205281BSs);
        LLLIIL(32, parcelLLILLIZIL);
    }

    @Override // X.C1BS1
    public final void LLILL(C1BSG c1bsg) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, c1bsg);
        LLLIIL(42, parcelLLILLIZIL);
    }

    @Override // X.C1BS1
    public final boolean LLILLL(MapStyleOptions mapStyleOptions) {
        boolean z;
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZJ(parcelLLILLIZIL, mapStyleOptions);
        Parcel parcelLJJJZ = LJJJZ(91, parcelLLILLIZIL);
        if (parcelLJJJZ.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        parcelLJJJZ.recycle();
        return z;
    }

    @Override // X.C1BS1
    public final void LLLFF(boolean z) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        parcelLLILLIZIL.writeInt(z ? 1 : 0);
        LLLIIL(41, parcelLLILLIZIL);
    }

    @Override // X.C1BS1
    public final void LLLIZZ(boolean z) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        parcelLLILLIZIL.writeInt(z ? 1 : 0);
        LLLIIL(22, parcelLLILLIZIL);
    }

    @Override // X.C1BS1
    public final void LLLLLLLZIL(InterfaceC820590WGz interfaceC820590WGz) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, interfaceC820590WGz);
        LLLIIL(4, parcelLLILLIZIL);
    }

    @Override // X.C1BS1
    public final void LLLLLZ(BinderC2205141BSe binderC2205141BSe) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, binderC2205141BSe);
        LLLIIL(31, parcelLLILLIZIL);
    }

    @Override // X.C1BS1
    public final C1BSF LLLLZLLIL(CircleOptions circleOptions) {
        C1BSF c2205111BSb;
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZJ(parcelLLILLIZIL, circleOptions);
        Parcel parcelLJJJZ = LJJJZ(35, parcelLLILLIZIL);
        IBinder strongBinder = parcelLJJJZ.readStrongBinder();
        if (strongBinder == null) {
            c2205111BSb = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            if (iInterfaceQueryLocalInterface instanceof C1BSF) {
                c2205111BSb = (C1BSF) iInterfaceQueryLocalInterface;
            } else {
                c2205111BSb = new C2205111BSb(strongBinder);
            }
        }
        parcelLJJJZ.recycle();
        return c2205111BSb;
    }

    @Override // X.C1BS1
    public final InterfaceC2205261BSq LLZIL(MarkerOptions markerOptions) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZJ(parcelLLILLIZIL, markerOptions);
        Parcel parcelLJJJZ = LJJJZ(11, parcelLLILLIZIL);
        InterfaceC2205261BSq interfaceC2205261BSqLLILLIZIL = AbstractBinderC2205241BSo.LLILLIZIL(parcelLJJJZ.readStrongBinder());
        parcelLJJJZ.recycle();
        return interfaceC2205261BSqLLILLIZIL;
    }

    @Override // X.C1BS1
    public final void P0(C1BSK c1bsk) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, c1bsk);
        LLLIIL(99, parcelLLILLIZIL);
    }

    @Override // X.C1BS1
    public final void T(BinderC2205291BSt binderC2205291BSt) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, binderC2205291BSt);
        LLLIIL(84, parcelLLILLIZIL);
    }

    @Override // X.C1BS1
    public final void b(C1BSS c1bss) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, c1bss);
        LLLIIL(96, parcelLLILLIZIL);
    }

    @Override // X.C1BS1
    public final void c1(C1BSI c1bsi) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, c1bsi);
        LLLIIL(97, parcelLLILLIZIL);
    }

    @Override // X.C1BS1
    public final void N0(InterfaceC820590WGz interfaceC820590WGz, BinderC2205001BRq binderC2205001BRq) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, interfaceC820590WGz);
        C837530WtL.LIZLLL(parcelLLILLIZIL, binderC2205001BRq);
        LLLIIL(6, parcelLLILLIZIL);
    }

    @Override // X.C1BS1
    public final void c0(BinderC838750WvJ binderC838750WvJ, C0WH6 c0wh6) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, binderC838750WvJ);
        C837530WtL.LIZLLL(parcelLLILLIZIL, c0wh6);
        LLLIIL(38, parcelLLILLIZIL);
    }

    @Override // X.C1BS1
    public final void V0(InterfaceC820590WGz interfaceC820590WGz, int i, BinderC2205001BRq binderC2205001BRq) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, interfaceC820590WGz);
        parcelLLILLIZIL.writeInt(i);
        C837530WtL.LIZLLL(parcelLLILLIZIL, binderC2205001BRq);
        LLLIIL(7, parcelLLILLIZIL);
    }

    @Override // X.C1BS1
    public final void G(int i, int i2, int i3, int i4) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        parcelLLILLIZIL.writeInt(i);
        parcelLLILLIZIL.writeInt(i2);
        parcelLLILLIZIL.writeInt(i3);
        parcelLLILLIZIL.writeInt(i4);
        LLLIIL(39, parcelLLILLIZIL);
    }
}
