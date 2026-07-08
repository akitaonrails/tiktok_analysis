package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.159s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204746159s implements InterfaceC20477315At {
    public final C15AO LIZ;
    public final User LIZIZ;
    public boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C204746159s)) {
            return false;
        }
        C204746159s c204746159s = (C204746159s) obj;
        return Intrinsics.LJFF(this.LIZ, c204746159s.LIZ) && Intrinsics.LJFF(this.LIZIZ, c204746159s.LIZIZ) && this.LIZJ == c204746159s.LIZJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        User user = this.LIZIZ;
        return ((iHashCode + (user == null ? 0 : user.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LottieGeniusConfig(lottieInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", linkedUser=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", detached=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC20477315At
    public final InterfaceC20477315At LIZJ() {
        return new C204746159s(this.LIZ.LIZIZ(), this.LIZIZ, this.LIZJ);
    }

    @Override // X.InterfaceC20477315At
    public final boolean LIZ() {
        return this.LIZJ;
    }

    public /* synthetic */ C204746159s(C15AO c15ao) {
        this(c15ao, null, false);
    }

    @Override // X.InterfaceC20477315At
    public final void LIZIZ(boolean z) {
        this.LIZJ = z;
    }

    public C204746159s(C15AO c15ao, User user, boolean z) {
        this.LIZ = c15ao;
        this.LIZIZ = user;
        this.LIZJ = z;
    }
}
