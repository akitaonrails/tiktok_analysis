package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14MK, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14MK<R> implements Comparable<C14MK<R>> {
    public static String LLJILJILJ = "";
    public final String LL;
    public final EnumC19356010o2 LLILLJJLI;
    public final String LLILLL;
    public final EnumC1487630oob LLILZ;
    public final String LLILZIL;
    public final int LLILZLL;
    public final boolean LLIZ;
    public final R LLIZLLLIL;
    public EnumC1006910cJF LLJ;
    public String LLJI;
    public int LLJIJIL;
    public final Map<C14MQ<?>, Class<?>> LLJILJIL;

    public C14MK() {
        throw null;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31;
        R r = this.LLIZLLLIL;
        return ((((((((iHashCode + (r == null ? 0 : r.hashCode())) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL) * 31) + this.LLJILJIL.hashCode();
    }

    public final String toString() {
        return "DynamicResourceStrategy(key=" + this.LL + ", type=" + this.LLILLJJLI + ", cdnUrl=" + this.LLILLL + ", priority=" + this.LLILZ + ", hash=" + this.LLILZIL + ", size=" + this.LLILZLL + ", enable=" + this.LLIZ + ", fallback=" + this.LLIZLLLIL + ", status=" + this.LLJ + ", localPath=" + this.LLJI + ", failureCount=" + this.LLJIJIL + ", callbacks=" + this.LLJILJIL + ')';
    }

    public final boolean LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJFF());
        sbLIZ.append('/');
        sbLIZ.append(LJI());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (strLIZIZ.length() > 0 && new C0VSJ(strLIZIZ).exists()) {
            this.LLJI = strLIZIZ;
            this.LLJ = EnumC1006910cJF.SUCCESS;
            return true;
        }
        this.LLJI = "";
        if (this.LLJ == EnumC1006910cJF.SUCCESS) {
            this.LLJ = EnumC1006910cJF.IDLE;
        }
        return false;
    }

    public final String LJFF() {
        C08ON.LIZ();
        String str = LLJILJILJ;
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LLJILJILJ);
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILZIL);
        int i = C19356110o3.LIZ[this.LLILLJJLI.ordinal()];
        sbLIZ.append(i != 1 ? i != 2 ? i != 3 ? "" : ".json" : ".mp4" : ".mp3");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C14MK c14mk = (C14MK) obj;
        int i = this.LLJIJIL;
        int i2 = c14mk.LLJIJIL;
        if (i >= i2) {
            if (i <= i2) {
                if (this.LLILZ.getValue() <= c14mk.LLILZ.getValue()) {
                    if (this.LLILZ.getValue() == c14mk.LLILZ.getValue() && this.LLILZLL > c14mk.LLILZLL) {
                        return 1;
                    }
                    if (this.LLILZ.getValue() == c14mk.LLILZ.getValue() && this.LLILZLL == c14mk.LLILZLL) {
                        return 0;
                    }
                    return -1;
                }
                return 1;
            }
            return -1;
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14MK)) {
            C14MK c14mk = (C14MK) obj;
            if (Intrinsics.LJFF(this.LL, c14mk.LL) && Intrinsics.LJFF(this.LLILZIL, c14mk.LLILZIL)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14MK(String str, EnumC19356010o2 enumC19356010o2, String str2, EnumC1487630oob enumC1487630oob, String str3, int i, boolean z, Object obj) {
        EnumC1006910cJF enumC1006910cJF = EnumC1006910cJF.IDLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LL = str;
        this.LLILLJJLI = enumC19356010o2;
        this.LLILLL = str2;
        this.LLILZ = enumC1487630oob;
        this.LLILZIL = str3;
        this.LLILZLL = i;
        this.LLIZ = z;
        this.LLIZLLLIL = obj;
        this.LLJ = enumC1006910cJF;
        this.LLJI = "";
        this.LLJIJIL = 0;
        this.LLJILJIL = linkedHashMap;
    }
}
