package X;

import com.ss.android.ugc.aweme.im.chatlist.api.adapter.vo.rightview.VORightOperationType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z8F, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z8F implements VORightOperationType {
    public final boolean LL;
    public final AbstractC884010Ym7 LLILLJJLI;

    public final C0Z8F copy(boolean z, AbstractC884010Ym7 abstractC884010Ym7) {
        return new C0Z8F(z, abstractC884010Ym7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Z8F)) {
            return false;
        }
        C0Z8F c0z8f = (C0Z8F) obj;
        return this.LL == c0z8f.LL && Intrinsics.LJFF(this.LLILLJJLI, c0z8f.LLILLJJLI);
    }

    public int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        AbstractC884010Ym7 abstractC884010Ym7 = this.LLILLJJLI;
        return iZ2 + (abstractC884010Ym7 == null ? 0 : abstractC884010Ym7.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VORightMentionType(isDowngraded=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", state=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final AbstractC884010Ym7 getState() {
        return this.LLILLJJLI;
    }

    public final boolean isDowngraded() {
        return this.LL;
    }

    public C0Z8F(boolean z, AbstractC884010Ym7 abstractC884010Ym7) {
        this.LL = z;
        this.LLILLJJLI = abstractC884010Ym7;
    }
}
