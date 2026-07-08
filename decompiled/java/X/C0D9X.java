package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D9X, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D9X {
    public final C2252321DDq LIZ;
    public final AnonymousClass0951 LIZIZ;
    public final C2252331DDr LIZJ;
    public final AnonymousClass0950 LIZLLL;
    public boolean LJ;

    public C0D9X() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C0DAR(0));
        this.LIZ = c2252321DDqLIZ;
        this.LIZIZ = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 5);
        this.LIZJ = c2252331DDrLIZIZ;
        this.LIZLLL = C09IC.LIZ(c2252331DDrLIZIZ);
    }

    public final void LIZ(CheckoutStoredUserAddress checkoutStoredUserAddress) {
        String str;
        C0DAS c0das;
        String str2;
        String str3;
        CheckoutStoredUserAddress checkoutStoredUserAddress2 = ((C0DAR) this.LIZ.getValue()).LIZIZ;
        C0DAS c0das2 = ((C0DAR) this.LIZ.getValue()).LIZ;
        String str4 = null;
        if (checkoutStoredUserAddress2 != null) {
            str = checkoutStoredUserAddress2.id;
        } else {
            str = null;
        }
        if (checkoutStoredUserAddress != null) {
            str4 = checkoutStoredUserAddress.id;
            c0das = C0DAS.READY;
        } else {
            c0das = C0DAS.EMPTY;
        }
        if (Intrinsics.LJFF(checkoutStoredUserAddress2, checkoutStoredUserAddress) && c0das2 == c0das) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("address.component.sync.skip phase=");
            sbLIZ.append(c0das);
            sbLIZ.append(" addressId=");
            if (str4 == null) {
                str4 = "";
            }
            sbLIZ.append(str4);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("address.component.sync previousPhase=");
        sbLIZ2.append(c0das2);
        sbLIZ2.append(" newPhase=");
        sbLIZ2.append(c0das);
        sbLIZ2.append(" previousAddressId=");
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        sbLIZ2.append(str2);
        sbLIZ2.append(" newAddressId=");
        if (str4 == null) {
            str3 = "";
        } else {
            str3 = str4;
        }
        sbLIZ2.append(str3);
        C2188811AlT.LIZIZ(sbLIZ2);
        this.LIZ.setValue(new C0DAR(c0das, checkoutStoredUserAddress));
        if (c0das2 != c0das || !Intrinsics.LJFF(str, str4) || !Intrinsics.LJFF(checkoutStoredUserAddress2, checkoutStoredUserAddress)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("address.component.event.addressChanged addressId=");
            if (str4 == null) {
                str4 = "";
            }
            sbLIZ3.append(str4);
            C2188811AlT.LIZIZ(sbLIZ3);
            this.LIZJ.LIZJ(new C0DA8(checkoutStoredUserAddress));
        }
    }
}
