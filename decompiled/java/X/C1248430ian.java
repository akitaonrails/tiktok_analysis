package X;

import com.ss.android.ugc.aweme.profile.model.SignatureExtraInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ian, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248430ian implements InterfaceC0148002o {
    public final String LL;
    public final List<SignatureExtraInfo> LLILLJJLI;
    public final List<SignatureExtraInfo> LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public EnumC1248480ias LLIZ;
    public final boolean LLIZLLLIL;

    public C1248430ian() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1248430ian)) {
            return false;
        }
        C1248430ian c1248430ian = (C1248430ian) obj;
        return Intrinsics.LJFF(this.LL, c1248430ian.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1248430ian.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1248430ian.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1248430ian.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1248430ian.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1248430ian.LLILZLL) && this.LLIZ == c1248430ian.LLIZ && this.LLIZLLLIL == c1248430ian.LLIZLLLIL;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        List<SignatureExtraInfo> list = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<SignatureExtraInfo> list2 = this.LLILLL;
        int iHashCode3 = (((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.LLILZ.hashCode()) * 31;
        String str = this.LLILZIL;
        return ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZLLLIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SignatureTranslationState(originalContent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", extraInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", translatedExtraInfo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", srcLang=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", translatedContent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", translatedLanguage=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", currentDisplayState=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", srcLangTranslatable=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1248430ian(int i) {
        C13BV c13bv = C13BV.INSTANCE;
        this("", c13bv, c13bv, "", null, "", EnumC1248480ias.ORIGINAL, true);
    }

    public C1248430ian(String str, List<SignatureExtraInfo> list, List<SignatureExtraInfo> list2, String str2, String str3, String str4, EnumC1248480ias enumC1248480ias, boolean z) {
        this.LL = str;
        this.LLILLJJLI = list;
        this.LLILLL = list2;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = enumC1248480ias;
        this.LLIZLLLIL = z;
    }

    public static C1248430ian LIZ(C1248430ian c1248430ian, String str, List list, List list2, String str2, String str3, String str4, EnumC1248480ias enumC1248480ias, boolean z, int i) {
        boolean z2 = z;
        EnumC1248480ias enumC1248480ias2 = enumC1248480ias;
        String str5 = str4;
        String str6 = str3;
        String str7 = str2;
        List list3 = list2;
        List list4 = list;
        String str8 = str;
        if ((i & 1) != 0) {
            str8 = c1248430ian.LL;
        }
        if ((i & 2) != 0) {
            list4 = c1248430ian.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            list3 = c1248430ian.LLILLL;
        }
        if ((i & 8) != 0) {
            str7 = c1248430ian.LLILZ;
        }
        if ((i & 16) != 0) {
            str6 = c1248430ian.LLILZIL;
        }
        if ((i & 32) != 0) {
            str5 = c1248430ian.LLILZLL;
        }
        if ((i & 64) != 0) {
            enumC1248480ias2 = c1248430ian.LLIZ;
        }
        if ((i & 128) != 0) {
            z2 = c1248430ian.LLIZLLLIL;
        }
        c1248430ian.getClass();
        return new C1248430ian(str8, list4, list3, str7, str6, str5, enumC1248480ias2, z2);
    }
}
