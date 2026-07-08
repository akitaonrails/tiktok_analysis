package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D3O, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D3O implements Serializable {
    public final String shopId;
    public final String shopLogo;
    public final String shopName;
    public final boolean showShopButton;

    public final C0D3O copy(String str, String str2, String str3, boolean z) {
        return new C0D3O(str, str2, str3, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D3O)) {
            return false;
        }
        C0D3O c0d3o = (C0D3O) obj;
        return Intrinsics.LJFF(this.shopId, c0d3o.shopId) && Intrinsics.LJFF(this.shopName, c0d3o.shopName) && Intrinsics.LJFF(this.shopLogo, c0d3o.shopLogo) && this.showShopButton == c0d3o.showShopButton;
    }

    public int hashCode() {
        return (((((this.shopId.hashCode() * 31) + this.shopName.hashCode()) * 31) + this.shopLogo.hashCode()) * 31) + C786410Ut5.Z2(this.showShopButton);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpShopHeaderState(shopId=");
        sbLIZ.append(this.shopId);
        sbLIZ.append(", shopName=");
        sbLIZ.append(this.shopName);
        sbLIZ.append(", shopLogo=");
        sbLIZ.append(this.shopLogo);
        sbLIZ.append(", showShopButton=");
        sbLIZ.append(this.showShopButton);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D3O(String str, String str2, String str3, boolean z) {
        this.shopId = str;
        this.shopName = str2;
        this.shopLogo = str3;
        this.showShopButton = z;
    }
}
