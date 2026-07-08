package X;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0WmM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C833200WmM extends AbstractC831380WjQ implements InterfaceC833320WmY {
    public final AbstractC835450Wpz<List<TokenInfo>> LIZLLL() {
        C832510WlF c832510WlF = new C832510WlF();
        c832510WlF.LIZ = new InterfaceC831290WjH(this) { // from class: X.0WmN
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC831290WjH
            public final void LIZ(InterfaceC831160Wj4 interfaceC831160Wj4, Object obj) {
                final C835520Wq6 c835520Wq6 = (C835520Wq6) obj;
                C833260WmS c833260WmS = (C833260WmS) ((AbstractC832390Wl3) interfaceC831160Wj4).getService();
                BinderC817800W6g binderC817800W6g = new BinderC817800W6g() { // from class: X.0Wld
                    @Override // X.BinderC817800W6g, X.InterfaceC817790W6f
                    public final void K(Status status, TokenInfo[] tokenInfoArr) {
                        C832640WlS.LIZIZ(status, AbstractC19966113Ad.zzh(tokenInfoArr), c835520Wq6);
                    }
                };
                Parcel parcelLJJJZ = c833260WmS.LJJJZ();
                parcelLJJJZ.writeStrongBinder(binderC817800W6g);
                c833260WmS.LLILLIZIL(74, parcelLJJJZ);
            }
        };
        c832510WlF.LIZJ = new Feature[]{C833310WmX.LIZ};
        c832510WlF.LIZLLL = 2163;
        return doRead(c832510WlF.LIZ());
    }

    public C833200WmM(Activity activity) {
        super(activity, (C832010WkR<C833100WmC>) AbstractC833270WmT.LIZ, InterfaceC833080WmA.LJIIL, C831490Wjb.LIZJ);
    }

    public C833200WmM(Context context) {
        super(context, (C832010WkR<C833100WmC>) AbstractC833270WmT.LIZ, InterfaceC833080WmA.LJIIL, C831490Wjb.LIZJ);
    }
}
