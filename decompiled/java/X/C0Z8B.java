package X;

import com.ss.android.ugc.aweme.im.chatlist.api.adapter.vo.rightview.VORightOperationType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z8B, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z8B implements VORightOperationType {
    public final AbstractC884010Ym7 LL;

    public final C0Z8B copy(AbstractC884010Ym7 abstractC884010Ym7) {
        return new C0Z8B(abstractC884010Ym7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0Z8B) && Intrinsics.LJFF(this.LL, ((C0Z8B) obj).LL);
    }

    public int hashCode() {
        AbstractC884010Ym7 abstractC884010Ym7 = this.LL;
        if (abstractC884010Ym7 == null) {
            return 0;
        }
        return abstractC884010Ym7.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VORightUnreadType(state=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final AbstractC884010Ym7 getState() {
        return this.LL;
    }

    public C0Z8B(AbstractC884010Ym7 abstractC884010Ym7) {
        this.LL = abstractC884010Ym7;
    }
}
