package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D3I, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D3I implements Serializable {
    public static final C0D3F Companion = new C0D3F();
    public final List<String> imageUrls;
    public final C0D3H presentation;
    public final String selectionFingerprint;
    public final EnumC332810D2x source;
    public final C0D3J status;
    public final C0D3G transitionPolicy;

    public final C0D3I copy(List<String> list, EnumC332810D2x enumC332810D2x, C0D3J c0d3j, C0D3H c0d3h, C0D3G c0d3g, String str) {
        return new C0D3I(list, enumC332810D2x, c0d3j, c0d3h, c0d3g, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D3I)) {
            return false;
        }
        C0D3I c0d3i = (C0D3I) obj;
        return Intrinsics.LJFF(this.imageUrls, c0d3i.imageUrls) && this.source == c0d3i.source && this.status == c0d3i.status && this.presentation == c0d3i.presentation && this.transitionPolicy == c0d3i.transitionPolicy && Intrinsics.LJFF(this.selectionFingerprint, c0d3i.selectionFingerprint);
    }

    public int hashCode() {
        return (((((((((this.imageUrls.hashCode() * 31) + this.source.hashCode()) * 31) + this.status.hashCode()) * 31) + this.presentation.hashCode()) * 31) + this.transitionPolicy.hashCode()) * 31) + this.selectionFingerprint.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpMediaState(imageUrls=");
        sbLIZ.append(this.imageUrls);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", presentation=");
        sbLIZ.append(this.presentation);
        sbLIZ.append(", transitionPolicy=");
        sbLIZ.append(this.transitionPolicy);
        sbLIZ.append(", selectionFingerprint=");
        sbLIZ.append(this.selectionFingerprint);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getShouldShowIndicator() {
        return this.presentation == C0D3H.CAROUSEL && this.imageUrls.size() > 1;
    }

    public final boolean isFinalNoImage() {
        return this.status == C0D3J.FINAL_NO_IMAGE;
    }

    public final boolean isLoadingPlaceholder() {
        return this.status == C0D3J.LOADING;
    }

    public final boolean isLocked() {
        return this.transitionPolicy == C0D3G.LOCKED;
    }

    public final boolean canAcceptCatalogEnrichment(String str) {
        C0D3J c0d3j = this.status;
        if ((c0d3j == C0D3J.READY || c0d3j == C0D3J.FINAL_NO_IMAGE) && !isLocked() && Intrinsics.LJFF(this.selectionFingerprint, str)) {
            return true;
        }
        return false;
    }

    public C0D3I(List<String> list, EnumC332810D2x enumC332810D2x, C0D3J c0d3j, C0D3H c0d3h, C0D3G c0d3g, String str) {
        this.imageUrls = list;
        this.source = enumC332810D2x;
        this.status = c0d3j;
        this.presentation = c0d3h;
        this.transitionPolicy = c0d3g;
        this.selectionFingerprint = str;
    }
}
