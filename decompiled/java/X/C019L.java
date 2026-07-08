package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.019L, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C019L implements InterfaceC1891350zJl {
    public final long LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final long LLILZ;
    public final Boolean LLILZIL;
    public final ImageModel LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C019L)) {
            return false;
        }
        C019L c019l = (C019L) obj;
        return this.LL == c019l.LL && this.LLILLJJLI == c019l.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c019l.LLILLL) && this.LLILZ == c019l.LLILZ && Intrinsics.LJFF(this.LLILZIL, c019l.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c019l.LLILZLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iY2 = ((((((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31;
        Boolean bool = this.LLILZIL;
        int iHashCode = (iY2 + (bool == null ? 0 : bool.hashCode())) * 31;
        ImageModel imageModel = this.LLILZLL;
        return iHashCode + (imageModel != null ? imageModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelRankingItem(userId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", displayName=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", points=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isPerforming=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", avatar=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C019L) && ((C019L) interfaceC1891350zJl).LL == this.LL) {
            return true;
        }
        return false;
    }

    public C019L(long j, int i, String str, long j2, Boolean bool, ImageModel imageModel) {
        this.LL = j;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = j2;
        this.LLILZIL = bool;
        this.LLILZLL = imageModel;
    }
}
