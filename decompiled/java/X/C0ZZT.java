package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZZT, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZZT implements C0ZZX {
    public final C869590Y9l LIZ;
    public final EnumC901750ZZd LIZIZ;
    public final View LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZZT)) {
            return false;
        }
        C0ZZT c0zzt = (C0ZZT) obj;
        return Intrinsics.LJFF(this.LIZ, c0zzt.LIZ) && this.LIZIZ == c0zzt.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0zzt.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0zzt.LIZLLL) && Intrinsics.LJFF(this.LJ, c0zzt.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        String str = this.LJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarClick(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clickSource=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", view=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", roomOwnerUid=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", roomSecOwnerId=");
        sbLIZ.append(this.LJ);
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

    public C0ZZT(C869590Y9l c869590Y9l, EnumC901750ZZd enumC901750ZZd, View view, String str, String str2) {
        this.LIZ = c869590Y9l;
        this.LIZIZ = enumC901750ZZd;
        this.LIZJ = view;
        this.LIZLLL = str;
        this.LJ = str2;
    }
}
