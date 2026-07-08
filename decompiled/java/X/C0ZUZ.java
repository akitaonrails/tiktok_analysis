package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZUZ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZUZ {
    public final boolean LIZ;
    public final UrlModel LIZIZ;
    public final InterfaceC460300I3g LIZJ;
    public final InterfaceC460300I3g LIZLLL;
    public final boolean LJ;
    public final InterfaceC460300I3g LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZUZ)) {
            return false;
        }
        C0ZUZ c0zuz = (C0ZUZ) obj;
        return this.LIZ == c0zuz.LIZ && Intrinsics.LJFF(this.LIZIZ, c0zuz.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0zuz.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0zuz.LIZLLL) && this.LJ == c0zuz.LJ && Intrinsics.LJFF(this.LJFF, c0zuz.LJFF);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        UrlModel urlModel = this.LIZIZ;
        return ((((((((iZ2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode();
    }

    public C0ZUZ(boolean z, UrlModel urlModel, InterfaceC460300I3g interfaceC460300I3g, InterfaceC460300I3g interfaceC460300I3g2, boolean z2, C1258904wF c1258904wF) {
        this.LIZ = z;
        this.LIZIZ = urlModel;
        this.LIZJ = interfaceC460300I3g;
        this.LIZLLL = interfaceC460300I3g2;
        this.LJ = z2;
        this.LJFF = c1258904wF;
    }
}
