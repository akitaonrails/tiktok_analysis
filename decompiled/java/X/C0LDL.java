package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LDL, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LDL extends C0LDO {
    public final String LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final String LJIIJ;
    public final boolean LJIIJJI;
    public final Function0<Unit> LJIIL;
    public final Function1<Float, Unit> LJIILIIL;
    public final Function2<Integer, String, Unit> LJIILJJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LDL)) {
            return false;
        }
        C0LDL c0ldl = (C0LDL) obj;
        return Intrinsics.LJFF(this.LJII, c0ldl.LJII) && this.LJIIIIZZ == c0ldl.LJIIIIZZ && this.LJIIIZ == c0ldl.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c0ldl.LJIIJ) && this.LJIIJJI == c0ldl.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c0ldl.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c0ldl.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c0ldl.LJIILJJIL);
    }

    public final int hashCode() {
        return (((((((((((((this.LJII.hashCode() * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31) + this.LJIIJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31) + this.LJIIL.hashCode()) * 31) + this.LJIILIIL.hashCode()) * 31) + this.LJIILJJIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Photo(outPhotoPath=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", outWidth=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", outHeight=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", externalSettingsJsonStr=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", containHdrSource=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", onCompileDone=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", onCompileProgress=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", onCompileError=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0LDO
    public final boolean LIZ() {
        return this.LJIIJJI;
    }

    @Override // X.C0LDO
    public final String LIZIZ() {
        return this.LJIIJ;
    }

    @Override // X.C0LDO
    public final int LIZJ() {
        return this.LJIIIZ;
    }

    @Override // X.C0LDO
    public final int LIZLLL() {
        return this.LJIIIIZZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0LDL(String str, int i, int i2, String str2, boolean z, Function0<Unit> function0, Function1<? super Float, Unit> function1, Function2<? super Integer, ? super String, Unit> function2) {
        super(i, i2, str2, z, function0, function1, function2);
        this.LJII = str;
        this.LJIIIIZZ = i;
        this.LJIIIZ = i2;
        this.LJIIJ = str2;
        this.LJIIJJI = z;
        this.LJIIL = function0;
        this.LJIILIIL = function1;
        this.LJIILJJIL = function2;
    }
}
