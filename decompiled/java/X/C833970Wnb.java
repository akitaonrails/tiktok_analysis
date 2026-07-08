package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.common.Feature;

/* JADX INFO: renamed from: X.0Wnb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C833970Wnb extends AbstractC831380WjQ implements InterfaceC833980Wnc {
    public static final C832010WkR LIZ = new C832010WkR("Blockstore.API", new AbstractC831970WkN() { // from class: X.0WnS
        @Override // X.AbstractC831970WkN
        public final /* synthetic */ InterfaceC831160Wj4 buildClient(final Context context, final Looper looper, final C831470WjZ c831470WjZ, Object obj, final InterfaceC832280Wks interfaceC832280Wks, final InterfaceC832890Wlr interfaceC832890Wlr) {
            return new AbstractC832400Wl4(context, looper, interfaceC832280Wks, interfaceC832890Wlr, c831470WjZ) { // from class: X.0WnT
                @Override // X.AbstractC832390Wl3, X.InterfaceC831160Wj4
                public final int getMinApkVersion() {
                    return 17895000;
                }

                @Override // X.AbstractC832390Wl3
                public final String getServiceDescriptor() {
                    return "com.google.android.gms.auth.blockstore.internal.IBlockstoreService";
                }

                @Override // X.AbstractC832390Wl3
                public final String getStartServiceAction() {
                    return "com.google.android.gms.auth.blockstore.service.START";
                }

                @Override // X.AbstractC832390Wl3
                public final boolean getUseDynamicLookup() {
                    return true;
                }

                @Override // X.AbstractC832390Wl3
                public final boolean usesClientTelemetry() {
                    return true;
                }

                @Override // X.AbstractC832390Wl3
                public final Feature[] getApiFeatures() {
                    return C833990Wnd.LJ;
                }

                @Override // X.AbstractC832390Wl3
                public final /* synthetic */ IInterface createServiceInterface(final IBinder iBinder) {
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
                    if (iInterfaceQueryLocalInterface instanceof C834060Wnk) {
                        return iInterfaceQueryLocalInterface;
                    }
                    return new C834110Wnp(iBinder) { // from class: X.0Wnk
                    };
                }
            };
        }
    }, new C832160Wkg());

    @Override // X.InterfaceC833980Wnc
    public final AbstractC835450Wpz<Boolean> LIZ() {
        C832510WlF c832510WlF = new C832510WlF();
        c832510WlF.LIZJ = new Feature[]{C833990Wnd.LIZIZ};
        c832510WlF.LIZ = new InterfaceC831290WjH(this) { // from class: X.0Wnn
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC831290WjH
            public final void LIZ(InterfaceC831160Wj4 interfaceC831160Wj4, Object obj) {
                BinderC834170Wnv binderC834170Wnv = new BinderC834170Wnv((C835520Wq6) obj);
                C834110Wnp c834110Wnp = (C834110Wnp) ((AbstractC832390Wl3) interfaceC831160Wj4).getService();
                c834110Wnp.getClass();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
                parcelObtain.writeStrongBinder(binderC834170Wnv);
                c834110Wnp.LJJJZ(11, parcelObtain);
            }
        };
        c832510WlF.LIZIZ = false;
        c832510WlF.LIZLLL = 1651;
        return doRead(c832510WlF.LIZ());
    }

    public C833970Wnb(Context context) {
        super(context, (C832010WkR<C833100WmC>) LIZ, InterfaceC833080WmA.LJIIL, C831490Wjb.LIZJ);
    }

    @Override // X.InterfaceC833980Wnc
    public final AbstractC835450Wpz<RetrieveBytesResponse> LIZIZ(final RetrieveBytesRequest retrieveBytesRequest) {
        C832510WlF c832510WlF = new C832510WlF();
        c832510WlF.LIZJ = new Feature[]{C833990Wnd.LIZLLL};
        c832510WlF.LIZ = new InterfaceC831290WjH(this) { // from class: X.0Wnm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC831290WjH
            public final void LIZ(InterfaceC831160Wj4 interfaceC831160Wj4, Object obj) {
                RetrieveBytesRequest retrieveBytesRequest2 = retrieveBytesRequest;
                BinderC834180Wnw binderC834180Wnw = new BinderC834180Wnw((C835520Wq6) obj);
                C834110Wnp c834110Wnp = (C834110Wnp) ((AbstractC832390Wl3) interfaceC831160Wj4).getService();
                c834110Wnp.getClass();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
                parcelObtain.writeStrongBinder(binderC834180Wnw);
                if (retrieveBytesRequest2 == null) {
                    parcelObtain.writeInt(0);
                } else {
                    parcelObtain.writeInt(1);
                    retrieveBytesRequest2.writeToParcel(parcelObtain, 0);
                }
                c834110Wnp.LJJJZ(12, parcelObtain);
            }
        };
        c832510WlF.LIZIZ = false;
        c832510WlF.LIZLLL = 1668;
        return doRead(c832510WlF.LIZ());
    }

    @Override // X.InterfaceC833980Wnc
    public final AbstractC835450Wpz<Integer> LIZJ(final StoreBytesData storeBytesData) {
        C832510WlF c832510WlF = new C832510WlF();
        c832510WlF.LIZJ = new Feature[]{C833990Wnd.LIZ, C833990Wnd.LIZJ};
        c832510WlF.LIZ = new InterfaceC831290WjH(this) { // from class: X.0Wnl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC831290WjH
            public final void LIZ(InterfaceC831160Wj4 interfaceC831160Wj4, Object obj) {
                StoreBytesData storeBytesData2 = storeBytesData;
                BinderC834120Wnq binderC834120Wnq = new BinderC834120Wnq((C835520Wq6) obj);
                C834110Wnp c834110Wnp = (C834110Wnp) ((AbstractC832390Wl3) interfaceC831160Wj4).getService();
                c834110Wnp.getClass();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
                parcelObtain.writeStrongBinder(binderC834120Wnq);
                if (storeBytesData2 == null) {
                    parcelObtain.writeInt(0);
                } else {
                    parcelObtain.writeInt(1);
                    storeBytesData2.writeToParcel(parcelObtain, 0);
                }
                c834110Wnp.LJJJZ(10, parcelObtain);
            }
        };
        c832510WlF.LIZLLL = 1645;
        c832510WlF.LIZIZ = false;
        return doWrite(c832510WlF.LIZ());
    }
}
