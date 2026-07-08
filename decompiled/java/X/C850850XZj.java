package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XZj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C850850XZj extends C0XT7<C850860XZk> {
    public final boolean LJIIJ;
    public final int LJIIJJI;
    public final C850860XZk LJIIL;
    public final JSONObject LJIILIIL;
    public final String LJIILJJIL;
    public final C0XO2 LJIILL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C850850XZj)) {
            return false;
        }
        C850850XZj c850850XZj = (C850850XZj) obj;
        return this.LJIIJ == c850850XZj.LJIIJ && this.LJIIJJI == c850850XZj.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c850850XZj.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c850850XZj.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c850850XZj.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c850850XZj.LJIILL);
    }

    public final int hashCode() {
        int iZ2 = ((((((C786410Ut5.Z2(this.LJIIJ) * 31) + this.LJIIJJI) * 31) + this.LJIIL.hashCode()) * 31) + this.LJIILIIL.hashCode()) * 31;
        String str = this.LJIILJJIL;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        C0XO2 c0xo2 = this.LJIILL;
        return iHashCode + (c0xo2 != null ? c0xo2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ForceResetPasswordResponse(success=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", api=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", queryObj=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", rawData=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", mErrorCaptcha=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", userInfo=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C850850XZj(boolean z, int i, C850860XZk c850860XZk, JSONObject jSONObject, String str, C0XO3 c0xo3) {
        super(z, i, c850860XZk);
        this.LJIIJ = z;
        this.LJIIJJI = i;
        this.LJIIL = c850860XZk;
        this.LJIILIIL = jSONObject;
        this.LJIILJJIL = str;
        this.LJIILL = c0xo3;
    }
}
