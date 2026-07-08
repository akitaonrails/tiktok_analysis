package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gz3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186590gz3 implements InterfaceC1891350zJl {
    public final UrlModel LL;
    public final int LLILLJJLI;
    public final Integer LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1186590gz3)) {
            return false;
        }
        C1186590gz3 c1186590gz3 = (C1186590gz3) obj;
        return Intrinsics.LJFF(this.LL, c1186590gz3.LL) && this.LLILLJJLI == c1186590gz3.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1186590gz3.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        UrlModel urlModel = this.LL;
        int iHashCode = (((urlModel == null ? 0 : urlModel.hashCode()) * 31) + this.LLILLJJLI) * 31;
        Integer num = this.LLILLL;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAlbumMediumImageItem(imageUrl=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", imageSize=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1186590gz3(UrlModel urlModel, int i, Integer num) {
        this.LL = urlModel;
        this.LLILLJJLI = i;
        this.LLILLL = num;
    }
}
