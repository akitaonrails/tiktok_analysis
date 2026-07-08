package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZZU, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZZU implements C0ZZX {
    public final C869590Y9l LIZ;
    public final EnumC901750ZZd LIZIZ;
    public final View LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZZU)) {
            return false;
        }
        C0ZZU c0zzu = (C0ZZU) obj;
        return Intrinsics.LJFF(this.LIZ, c0zzu.LIZ) && this.LIZIZ == c0zzu.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0zzu.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowClick(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clickSource=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", view=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0ZZX
    public final EnumC901750ZZd LIZ() {
        return this.LIZIZ;
    }

    @Override // X.C0ZZX
    public final C869590Y9l getMessage() {
        return this.LIZ;
    }

    public C0ZZU(C869590Y9l c869590Y9l, EnumC901750ZZd enumC901750ZZd, View view) {
        this.LIZ = c869590Y9l;
        this.LIZIZ = enumC901750ZZd;
        this.LIZJ = view;
    }
}
