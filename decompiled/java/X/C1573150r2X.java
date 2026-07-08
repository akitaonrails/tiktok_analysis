package X;

import com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r2X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1573150r2X implements InterfaceC1891350zJl {
    public final ShortDramaOverview LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public final String LL = UUID.randomUUID().toString();
    public final boolean LLILZLL = false;
    public final String LLIZ = null;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesCenterItem(clientId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", model=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", itemIndex=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isSafe=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isForcedInsertion=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", forcedInsertionFrom=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        Long l = this.LLILLJJLI.collectionId;
        if (l != null) {
            return l.hashCode();
        }
        return 0;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1573150r2X) {
            C1573150r2X c1573150r2X = (C1573150r2X) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c1573150r2X.LL, this.LL) && Intrinsics.LJFF(c1573150r2X.LLILLJJLI.collectionId, this.LLILLJJLI.collectionId) && Intrinsics.LJFF(c1573150r2X.LLILLJJLI.title, this.LLILLJJLI.title) && Intrinsics.LJFF(c1573150r2X.LLILLJJLI.numWatched, this.LLILLJJLI.numWatched) && Intrinsics.LJFF(c1573150r2X.LLILLJJLI.numVideos, this.LLILLJJLI.numVideos) && Intrinsics.LJFF(c1573150r2X.LLILLJJLI.labelNew, this.LLILLJJLI.labelNew) && c1573150r2X.LLILLL == this.LLILLL && Intrinsics.LJFF(c1573150r2X.LLILLJJLI.labelHot, this.LLILLJJLI.labelHot) && c1573150r2X.LLILZLL == this.LLILZLL && Intrinsics.LJFF(c1573150r2X.LLIZ, this.LLIZ)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1573150r2X) {
            C1573150r2X c1573150r2X = (C1573150r2X) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c1573150r2X.LLILLJJLI.collectionId, this.LLILLJJLI.collectionId) && Intrinsics.LJFF(c1573150r2X.LL, this.LL)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1573150r2X) {
            C1573150r2X c1573150r2X = (C1573150r2X) obj;
            if (Intrinsics.LJFF(c1573150r2X.LLILLJJLI.collectionId, this.LLILLJJLI.collectionId) && Intrinsics.LJFF(c1573150r2X.LL, this.LL)) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    public C1573150r2X(ShortDramaOverview shortDramaOverview, int i, String str, boolean z) {
        this.LLILLJJLI = shortDramaOverview;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = z;
    }
}
