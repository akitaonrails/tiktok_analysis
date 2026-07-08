package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.015K, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C015K extends C015J {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final String LJI;
    public final int LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public C015L LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C015K)) {
            return false;
        }
        C015K c015k = (C015K) obj;
        return Intrinsics.LJFF(this.LIZ, c015k.LIZ) && Intrinsics.LJFF(this.LIZIZ, c015k.LIZIZ) && this.LIZJ == c015k.LIZJ && this.LIZLLL == c015k.LIZLLL && this.LJ == c015k.LJ && Intrinsics.LJFF(this.LJFF, c015k.LJFF) && Intrinsics.LJFF(this.LJI, c015k.LJI) && this.LJII == c015k.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c015k.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c015k.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c015k.LJIIJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII) * 31;
        String str = this.LJIIIIZZ;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode();
    }

    public final String toString() {
        return "GenerateUsage(engineName=" + this.LIZ + ", modelName=" + this.LIZIZ + ", firstTokenTime=" + this.LIZJ + ", latency=" + this.LIZLLL + ", success=" + this.LJ + ", decodingSpeed=" + this.LJFF + ", prefillSpeed=" + this.LJI + ", tokens=" + this.LJII + ", message=" + this.LJIIIIZZ + ", loraName=" + this.LJIIIZ + ", sdkVersion=" + this.LJIIJ + ')';
    }

    public final Pair<String, Map<String, String>> LIZ(Map<String, String> map) {
        Map<String, String> mapLJ;
        Pair[] pairArr = new Pair[10];
        pairArr[0] = new Pair("engine", this.LIZ);
        pairArr[1] = new Pair("model", this.LIZIZ);
        pairArr[2] = new Pair("first_token", String.valueOf(this.LIZJ));
        pairArr[3] = new Pair("success", String.valueOf(this.LJ));
        pairArr[4] = new Pair("decoding_speed", this.LJFF);
        pairArr[5] = new Pair("prefill_speed", this.LJI);
        pairArr[6] = new Pair("sdk_version", this.LJIIJ);
        pairArr[7] = new Pair("active_lora_name", this.LJIIIZ);
        pairArr[8] = new Pair("token", String.valueOf(this.LJII));
        String str = this.LJIIIIZZ;
        if (str == null) {
            str = "";
        }
        pairArr[9] = new Pair("message", str);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        if (map == null) {
            map = C2097608Jq.LJ();
        }
        Map mapLJIIL = C2097608Jq.LJIIL(mapLJIIIIZZ, map);
        C015L c015l = this.LJIIJJI;
        if (c015l == null || (mapLJ = c015l.LIZ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        return new Pair<>("device_llm_forward_metric", C2097608Jq.LJIIL(mapLJIIL, mapLJ));
    }

    public C015K(String str, String str2, long j, long j2, boolean z, String str3, String str4, int i, String str5, String str6, String str7) {
        super(0);
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = z;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = i;
        this.LJIIIIZZ = str5;
        this.LJIIIZ = str6;
        this.LJIIJ = str7;
    }
}
