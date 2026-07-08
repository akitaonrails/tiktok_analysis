package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LDM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LDM extends C0LDO {
    public final String LJII;
    public final String LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final String LJIIJJI;
    public final boolean LJIIL;
    public final Function0<Unit> LJIILIIL;
    public final Function1<Float, Unit> LJIILJJIL;
    public final Function2<Integer, String, Unit> LJIILL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LDM)) {
            return false;
        }
        C0LDM c0ldm = (C0LDM) obj;
        return Intrinsics.LJFF(this.LJII, c0ldm.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c0ldm.LJIIIIZZ) && this.LJIIIZ == c0ldm.LJIIIZ && this.LJIIJ == c0ldm.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c0ldm.LJIIJJI) && this.LJIIL == c0ldm.LJIIL && Intrinsics.LJFF(this.LJIILIIL, c0ldm.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c0ldm.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c0ldm.LJIILL);
    }

    public final int hashCode() {
        return (((((((((((((((this.LJII.hashCode() * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ) * 31) + this.LJIIJ) * 31) + this.LJIIJJI.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIL)) * 31) + this.LJIILIIL.hashCode()) * 31) + this.LJIILJJIL.hashCode()) * 31) + this.LJIILL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Video(outVideoPath=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", outAudioPath=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", outWidth=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", outHeight=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", externalSettingsJsonStr=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", containHdrSource=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", onCompileDone=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", onCompileProgress=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", onCompileError=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0LDO
    public final boolean LIZ() {
        return this.LJIIL;
    }

    @Override // X.C0LDO
    public final String LIZIZ() {
        return this.LJIIJJI;
    }

    @Override // X.C0LDO
    public final int LIZJ() {
        return this.LJIIJ;
    }

    @Override // X.C0LDO
    public final int LIZLLL() {
        return this.LJIIIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0LDM(String str, String str2, int i, int i2, String str3, boolean z, Function0<Unit> function0, Function1<? super Float, Unit> function1, Function2<? super Integer, ? super String, Unit> function2) {
        super(i, i2, str3, z, function0, function1, function2);
        this.LJII = str;
        this.LJIIIIZZ = str2;
        this.LJIIIZ = i;
        this.LJIIJ = i2;
        this.LJIIJJI = str3;
        this.LJIIL = z;
        this.LJIILIIL = function0;
        this.LJIILJJIL = function1;
        this.LJIILL = function2;
    }
}
