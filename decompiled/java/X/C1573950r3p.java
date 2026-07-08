package X;

import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r3p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1573950r3p implements InterfaceC1891350zJl {
    public final CollectionDetailModel LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidContentCollectionItem(model=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", price=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", discountedPrice=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", singleVideoPrice=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isPriceLoading=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isAnchorSelected=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LL.collectionId);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1573950r3p) {
            C1573950r3p c1573950r3p = (C1573950r3p) interfaceC1891350zJl;
            CollectionDetailModel collectionDetailModel = c1573950r3p.LL;
            long j = collectionDetailModel.collectionId;
            CollectionDetailModel collectionDetailModel2 = this.LL;
            if (j != collectionDetailModel2.collectionId || collectionDetailModel.collectionRating != collectionDetailModel2.collectionRating || !Intrinsics.LJFF(collectionDetailModel.lastWatched, collectionDetailModel2.lastWatched) || c1573950r3p.LL.hasPurchasedCollection != this.LL.hasPurchasedCollection || !Intrinsics.LJFF(c1573950r3p.LLILLJJLI, this.LLILLJJLI) || c1573950r3p.LLIZ != this.LLIZ) {
                return false;
            }
            CollectionDetailModel collectionDetailModel3 = c1573950r3p.LL;
            boolean z = collectionDetailModel3.hasUserPartialPurchased;
            CollectionDetailModel collectionDetailModel4 = this.LL;
            if (z != collectionDetailModel4.hasUserPartialPurchased || collectionDetailModel3.numPurchasedVideos != collectionDetailModel4.numPurchasedVideos || collectionDetailModel3.hasVoucher != collectionDetailModel4.hasVoucher || collectionDetailModel3.isLimitedFree() != this.LL.isLimitedFree()) {
                return false;
            }
            return true;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1573950r3p) {
            if (((C1573950r3p) interfaceC1891350zJl).LL.collectionId == this.LL.collectionId) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1573950r3p) {
            if (((C1573950r3p) obj).LL.collectionId == this.LL.collectionId) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1573950r3p) {
            C1573950r3p c1573950r3p = (C1573950r3p) interfaceC1891350zJl;
            Intrinsics.LJFF(c1573950r3p.LLILLJJLI, this.LLILLJJLI);
            c1573950r3p.LL.isLimitedFree();
            this.LL.isLimitedFree();
            Intrinsics.LJFF(c1573950r3p.LL.lastWatched, this.LL.lastWatched);
            return new Object() { // from class: X.0r3q
            };
        }
        return null;
    }

    public /* synthetic */ C1573950r3p(CollectionDetailModel collectionDetailModel, String str, String str2, String str3, String str4, boolean z) {
        this(collectionDetailModel, str, str2, str3, str4, z, false);
    }

    public C1573950r3p(CollectionDetailModel collectionDetailModel, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.LL = collectionDetailModel;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = z;
        this.LLIZ = z2;
    }
}
