package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D3a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332840D3a implements Serializable {
    public final String buyNowButtonBgColor;
    public final String buyNowButtonLabel;
    public final String buyNowButtonTextColor;
    public final int buyNowButtonTextType;
    public final AbstractC332990D3p buyNowUiState;
    public final String disclaimerText;
    public final boolean showDisclaimerInfoIcon;
    public final boolean showVisitWebsiteButton;
    public final boolean visible;

    public C332840D3a() {
        this(true, false, null, 0, null, null, null, true, C333010D3r.INSTANCE);
    }

    public final C332840D3a copy(boolean z, boolean z2, String str, int i, String str2, String str3, String str4, boolean z3, AbstractC332990D3p abstractC332990D3p) {
        return new C332840D3a(z, z2, str, i, str2, str3, str4, z3, abstractC332990D3p);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C332840D3a)) {
            return false;
        }
        C332840D3a c332840D3a = (C332840D3a) obj;
        return this.visible == c332840D3a.visible && this.showVisitWebsiteButton == c332840D3a.showVisitWebsiteButton && Intrinsics.LJFF(this.buyNowButtonLabel, c332840D3a.buyNowButtonLabel) && this.buyNowButtonTextType == c332840D3a.buyNowButtonTextType && Intrinsics.LJFF(this.buyNowButtonBgColor, c332840D3a.buyNowButtonBgColor) && Intrinsics.LJFF(this.buyNowButtonTextColor, c332840D3a.buyNowButtonTextColor) && Intrinsics.LJFF(this.disclaimerText, c332840D3a.disclaimerText) && this.showDisclaimerInfoIcon == c332840D3a.showDisclaimerInfoIcon && Intrinsics.LJFF(this.buyNowUiState, c332840D3a.buyNowUiState);
    }

    public int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.visible) * 31) + C786410Ut5.Z2(this.showVisitWebsiteButton)) * 31;
        String str = this.buyNowButtonLabel;
        int iHashCode = (((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + this.buyNowButtonTextType) * 31;
        String str2 = this.buyNowButtonBgColor;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buyNowButtonTextColor;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.disclaimerText;
        return ((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.showDisclaimerInfoIcon)) * 31) + this.buyNowUiState.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpBottomBarState(visible=");
        sbLIZ.append(this.visible);
        sbLIZ.append(", showVisitWebsiteButton=");
        sbLIZ.append(this.showVisitWebsiteButton);
        sbLIZ.append(", buyNowButtonLabel=");
        sbLIZ.append(this.buyNowButtonLabel);
        sbLIZ.append(", buyNowButtonTextType=");
        sbLIZ.append(this.buyNowButtonTextType);
        sbLIZ.append(", buyNowButtonBgColor=");
        sbLIZ.append(this.buyNowButtonBgColor);
        sbLIZ.append(", buyNowButtonTextColor=");
        sbLIZ.append(this.buyNowButtonTextColor);
        sbLIZ.append(", disclaimerText=");
        sbLIZ.append(this.disclaimerText);
        sbLIZ.append(", showDisclaimerInfoIcon=");
        sbLIZ.append(this.showDisclaimerInfoIcon);
        sbLIZ.append(", buyNowUiState=");
        sbLIZ.append(this.buyNowUiState);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C332840D3a(boolean z, boolean z2, String str, int i, String str2, String str3, String str4, boolean z3, AbstractC332990D3p abstractC332990D3p) {
        this.visible = z;
        this.showVisitWebsiteButton = z2;
        this.buyNowButtonLabel = str;
        this.buyNowButtonTextType = i;
        this.buyNowButtonBgColor = str2;
        this.buyNowButtonTextColor = str3;
        this.disclaimerText = str4;
        this.showDisclaimerInfoIcon = z3;
        this.buyNowUiState = abstractC332990D3p;
    }
}
