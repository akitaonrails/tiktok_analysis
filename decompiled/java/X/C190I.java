package X;

import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.190I, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C190I implements InterfaceC214754192q {
    public final int LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final List<User> LIZLLL;
    public final C861820XrQ LJ;

    @Override // X.InterfaceC214754192q
    public final int LIZIZ() {
        return Integer.MAX_VALUE;
    }

    @Override // X.InterfaceC214754192q
    public final AbstractC861810XrP LIZJ() {
        return null;
    }

    @Override // X.InterfaceC214754192q
    public final boolean LJ() {
        return false;
    }

    @Override // X.InterfaceC214754192q
    public final Drawable LJFF() {
        return null;
    }

    @Override // X.InterfaceC214754192q
    public final Boolean LJI() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C190I)) {
            return false;
        }
        C190I c190i = (C190I) obj;
        return this.LIZ == c190i.LIZ && this.LIZIZ == c190i.LIZIZ && this.LIZJ == c190i.LIZJ && Intrinsics.LJFF(this.LIZLLL, c190i.LIZLLL);
    }

    @Override // X.InterfaceC214754192q
    public final CharSequence getLabel() {
        return null;
    }

    @Override // X.InterfaceC214754192q
    public final int getVisibility() {
        return 0;
    }

    public final int hashCode() {
        int iZ2 = ((((this.LIZ * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        List<User> list = this.LIZLLL;
        return iZ2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollabPublishOptionState(titleRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iconRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isEnabled=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", collaborators=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC214754192q
    public final Integer LIZ() {
        return Integer.valueOf(this.LIZIZ);
    }

    @Override // X.InterfaceC214754192q
    public final AbstractC861810XrP LIZLLL() {
        return this.LJ;
    }

    @Override // X.InterfaceC214754192q
    public final boolean isEnabled() {
        return this.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C190I(int i, int i2, boolean z, List<? extends User> list) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = z;
        this.LIZLLL = list;
        this.LJ = new C861820XrQ(i);
    }

    public static C190I LJII(C190I c190i, boolean z, List list, int i) {
        int i2;
        int i3 = 0;
        if ((i & 1) != 0) {
            i2 = c190i.LIZ;
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            i3 = c190i.LIZIZ;
        }
        if ((i & 4) != 0) {
            z = c190i.LIZJ;
        }
        if ((i & 8) != 0) {
            list = c190i.LIZLLL;
        }
        c190i.getClass();
        return new C190I(i2, i3, z, list);
    }
}
