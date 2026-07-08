package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uNd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701550uNd {
    public final Function1<Context, String> LIZ;
    public final Function1<Context, String> LIZIZ;
    public final Function1<Context, Unit> LIZJ;
    public final Function1<Context, Unit> LIZLLL;
    public final Function1<Context, Unit> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1701550uNd)) {
            return false;
        }
        C1701550uNd c1701550uNd = (C1701550uNd) obj;
        return Intrinsics.LJFF(this.LIZ, c1701550uNd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1701550uNd.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1701550uNd.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1701550uNd.LIZLLL) && Intrinsics.LJFF(this.LJ, c1701550uNd.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyBannerModel(msg=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", linkText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onClickLink=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onClickClose=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onShow=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1701550uNd(Function1<? super Context, String> function1, Function1<? super Context, String> function12, Function1<? super Context, Unit> function13, Function1<? super Context, Unit> function14, Function1<? super Context, Unit> function15) {
        this.LIZ = function1;
        this.LIZIZ = function12;
        this.LIZJ = function13;
        this.LIZLLL = function14;
        this.LJ = function15;
    }
}
