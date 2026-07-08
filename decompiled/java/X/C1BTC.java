package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: renamed from: X.1BTC, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BTC extends C1B9K implements C1BTO {
    @Override // X.C1BTO
    public final int LIZLLL() {
        Parcel parcelLJJJZ = LJJJZ(9, LLILLIZIL());
        int i = parcelLJJJZ.readInt();
        parcelLJJJZ.recycle();
        return i;
    }

    @Override // X.C1BTO
    public final InterfaceC2205031BRt LJ() {
        InterfaceC2205031BRt c2205191BSj;
        Parcel parcelLJJJZ = LJJJZ(4, LLILLIZIL());
        IBinder strongBinder = parcelLJJJZ.readStrongBinder();
        if (strongBinder == null) {
            c2205191BSj = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            c2205191BSj = iInterfaceQueryLocalInterface instanceof InterfaceC2205031BRt ? (InterfaceC2205031BRt) iInterfaceQueryLocalInterface : new C2205191BSj(strongBinder);
        }
        parcelLJJJZ.recycle();
        return c2205191BSj;
    }

    @Override // X.C1BTO
    public final C1BTA LJIILJJIL() {
        C1BTA c1bt9;
        Parcel parcelLJJJZ = LJJJZ(5, LLILLIZIL());
        IBinder strongBinder = parcelLJJJZ.readStrongBinder();
        if (strongBinder == null) {
            c1bt9 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            c1bt9 = iInterfaceQueryLocalInterface instanceof C1BTA ? (C1BTA) iInterfaceQueryLocalInterface : new C1BT9(strongBinder);
        }
        parcelLJJJZ.recycle();
        return c1bt9;
    }

    public C1BTC(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // X.C1BTO
    public final C1BTX p(C0WH6 c0wh6) {
        C1BTX c1btf;
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, c0wh6);
        Parcel parcelLJJJZ = LJJJZ(8, parcelLLILLIZIL);
        IBinder strongBinder = parcelLJJJZ.readStrongBinder();
        if (strongBinder == null) {
            c1btf = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            if (iInterfaceQueryLocalInterface instanceof C1BTX) {
                c1btf = (C1BTX) iInterfaceQueryLocalInterface;
            } else {
                c1btf = new C1BTF(strongBinder);
            }
        }
        parcelLJJJZ.recycle();
        return c1btf;
    }

    @Override // X.C1BTO
    public final C1BTW y(C0WH6 c0wh6) {
        C1BTW c1btd;
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, c0wh6);
        Parcel parcelLJJJZ = LJJJZ(2, parcelLLILLIZIL);
        IBinder strongBinder = parcelLJJJZ.readStrongBinder();
        if (strongBinder == null) {
            c1btd = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            if (iInterfaceQueryLocalInterface instanceof C1BTW) {
                c1btd = (C1BTW) iInterfaceQueryLocalInterface;
            } else {
                c1btd = new C1BTD(strongBinder);
            }
        }
        parcelLJJJZ.recycle();
        return c1btd;
    }

    @Override // X.C1BTO
    public final void LLJLL(C0WH6 c0wh6, int i) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, c0wh6);
        parcelLLILLIZIL.writeInt(i);
        LLLIIL(6, parcelLLILLIZIL);
    }

    @Override // X.C1BTO
    public final void LLJZ(C0WH6 c0wh6, int i) {
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, c0wh6);
        parcelLLILLIZIL.writeInt(i);
        LLLIIL(10, parcelLLILLIZIL);
    }

    @Override // X.C1BTO
    public final C1BTY a0(C0WH6 c0wh6, GoogleMapOptions googleMapOptions) {
        C1BTY c1bte;
        Parcel parcelLLILLIZIL = LLILLIZIL();
        C837530WtL.LIZLLL(parcelLLILLIZIL, c0wh6);
        C837530WtL.LIZJ(parcelLLILLIZIL, googleMapOptions);
        Parcel parcelLJJJZ = LJJJZ(3, parcelLLILLIZIL);
        IBinder strongBinder = parcelLJJJZ.readStrongBinder();
        if (strongBinder == null) {
            c1bte = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (iInterfaceQueryLocalInterface instanceof C1BTY) {
                c1bte = (C1BTY) iInterfaceQueryLocalInterface;
            } else {
                c1bte = new C1BTE(strongBinder);
            }
        }
        parcelLJJJZ.recycle();
        return c1bte;
    }
}
