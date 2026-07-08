package X;

import com.ss.android.ugc.aweme.ecommerce.service.AddressChangeResult;
import com.ss.android.ugc.aweme.ecommerce.service.AddressSelectResult;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAddressSelectCallback;

/* JADX INFO: renamed from: X.03sN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C980103sN implements IECommerceAddressSelectCallback {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ C333540D5s LIZIZ;
    public final /* synthetic */ InterfaceC980203sO LIZJ;

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAddressSelectCallback
    public final void onAddressChanged(AddressChangeResult addressChangeResult) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(".onAddressChanged.raw=");
        this.LIZIZ.getClass();
        sbLIZ.append(C333540D5s.LIZLLL(addressChangeResult));
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZJ.LIZ(addressChangeResult.eventType, addressChangeResult.addressId);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAddressSelectCallback
    public final void onSelected(AddressSelectResult addressSelectResult) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(".onSelected.raw=");
        this.LIZIZ.getClass();
        sbLIZ.append(C333540D5s.LIZLLL(addressSelectResult));
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZJ.LIZIZ(C334940DBc.LIZ(addressSelectResult.address));
    }

    public C980103sN(String str, C333540D5s c333540D5s, InterfaceC980203sO interfaceC980203sO) {
        this.LIZ = str;
        this.LIZIZ = c333540D5s;
        this.LIZJ = interfaceC980203sO;
    }
}
