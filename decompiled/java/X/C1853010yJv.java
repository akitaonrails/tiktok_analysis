package X;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1853010yJv implements InterfaceC111300bX, Serializable {
    public static final int $stable = 8;
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final Map<String, String> LLJ;
    public final String LLJI;
    public final String LLJIJIL;

    public final C1853010yJv copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, String> map, String str9, String str10) {
        return new C1853010yJv(str, str2, str3, str4, str5, str6, str7, str8, map, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1853010yJv)) {
            return false;
        }
        C1853010yJv c1853010yJv = (C1853010yJv) obj;
        return Intrinsics.LJFF(this.LL, c1853010yJv.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1853010yJv.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1853010yJv.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1853010yJv.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1853010yJv.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1853010yJv.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1853010yJv.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1853010yJv.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1853010yJv.LLJ) && Intrinsics.LJFF(this.LLJI, c1853010yJv.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1853010yJv.LLJIJIL);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31;
        Map<String, String> map = this.LLJ;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.LLJI;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLJIJIL;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "MobParams(enterFrom=" + this.LL + ", enterMethod=" + this.LLILLJJLI + ", groupId=" + this.LLILLL + ", templateType=" + this.LLILZ + ", pageSource=" + this.LLILZIL + ", mode=" + this.LLILZLL + ", modeSource=" + this.LLIZ + ", templateInfo=" + this.LLIZLLLIL + ", commonMobParams=" + this.LLJ + ", isCameraShow=" + this.LLJI + ", isCover=" + this.LLJIJIL + ')';
    }

    public final Map<String, String> getCommonMobParams() {
        return this.LLJ;
    }

    public final String getEnterFrom() {
        return this.LL;
    }

    public final String getEnterMethod() {
        return this.LLILLJJLI;
    }

    public final String getGroupId() {
        return this.LLILLL;
    }

    public final String getMode() {
        return this.LLILZLL;
    }

    public final String getModeSource() {
        return this.LLIZ;
    }

    public final String getPageSource() {
        return this.LLILZIL;
    }

    public final String getTemplateInfo() {
        return this.LLIZLLLIL;
    }

    public final String getTemplateType() {
        return this.LLILZ;
    }

    public final String isCameraShow() {
        return this.LLJI;
    }

    public final String isCover() {
        return this.LLJIJIL;
    }

    public C1853010yJv(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, String> map, String str9, String str10) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = str7;
        this.LLIZLLLIL = str8;
        this.LLJ = map;
        this.LLJI = str9;
        this.LLJIJIL = str10;
    }
}
