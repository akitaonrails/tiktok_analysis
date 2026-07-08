package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r1x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1572790r1x implements InterfaceC1891350zJl {
    public final long LL;
    public final UrlModel LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final C1572800r1y LLILZIL;
    public final long LLILZLL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesProfileCellItem(collectionId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", collectionCover=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", epNum=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", showLastWatch=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", videoItem=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", firstUnlockVideoId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LL) + this.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uri;
        if (interfaceC1891350zJl instanceof C1572790r1x) {
            C1572790r1x c1572790r1x = (C1572790r1x) interfaceC1891350zJl;
            if (c1572790r1x.LLILLL == this.LLILLL && c1572790r1x.LL == this.LL) {
                UrlModel urlModel = c1572790r1x.LLILLJJLI;
                String uri2 = null;
                if (urlModel != null) {
                    uri = urlModel.getUri();
                } else {
                    uri = null;
                }
                UrlModel urlModel2 = this.LLILLJJLI;
                if (urlModel2 != null) {
                    uri2 = urlModel2.getUri();
                }
                if (Intrinsics.LJFF(uri, uri2) && c1572790r1x.LLILZ == this.LLILZ) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1572790r1x) {
            C1572790r1x c1572790r1x = (C1572790r1x) interfaceC1891350zJl;
            if (c1572790r1x.LL == this.LL && c1572790r1x.LLILLL == this.LLILLL) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1572790r1x) {
            C1572790r1x c1572790r1x = (C1572790r1x) obj;
            if (c1572790r1x.LL == this.LL && c1572790r1x.LLILLL == this.LLILLL) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    public C1572790r1x(long j, UrlModel urlModel, int i, boolean z, C1572800r1y c1572800r1y, long j2) {
        this.LL = j;
        this.LLILLJJLI = urlModel;
        this.LLILLL = i;
        this.LLILZ = z;
        this.LLILZIL = c1572800r1y;
        this.LLILZLL = j2;
    }
}
