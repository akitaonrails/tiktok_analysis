package X;

import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yM7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854370yM7 implements InterfaceC1891350zJl {
    public final Integer LL;
    public final String LLILLJJLI;
    public final Integer LLILLL;
    public final String LLILZ;
    public final Function0<Unit> LLILZIL;
    public final int LLILZLL;
    public final String LLIZ;
    public final Integer LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1854370yM7)) {
            return false;
        }
        C1854370yM7 c1854370yM7 = (C1854370yM7) obj;
        return Intrinsics.LJFF(this.LL, c1854370yM7.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1854370yM7.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1854370yM7.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1854370yM7.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1854370yM7.LLILZIL) && this.LLILZLL == c1854370yM7.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1854370yM7.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1854370yM7.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1854370yM7.LLJ) && Intrinsics.LJFF(this.LLJI, c1854370yM7.LLJI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (((num == null ? 0 : num.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31;
        Integer num2 = this.LLILLL;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.LLILZ;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL) * 31) + this.LLIZ.hashCode()) * 31;
        Integer num3 = this.LLIZLLLIL;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.LLJ;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLJI;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoImageEditBottomInputPromptItem(sugIndex=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", promptId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sugSource=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", prompt=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", promptType=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", promptName=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", iconRes=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", avatarUrl=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1854370yM7) {
            C1854370yM7 c1854370yM7 = (C1854370yM7) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.LLIZ, c1854370yM7.LLIZ) && Intrinsics.LJFF(this.LLJ, c1854370yM7.LLJ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1854370yM7) && Intrinsics.LJFF(this.LLILLJJLI, ((C1854370yM7) interfaceC1891350zJl).LLILLJJLI)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1854370yM7(Integer num, Integer num2, String str, Function0 function0, int i, String str2, Integer num3, String str3, String str4, int i2) {
        String string;
        String str5 = str3;
        int i3 = i;
        String str6 = str;
        Integer num4 = num3;
        Integer num5 = num2;
        Integer num6 = (i2 & 1) != 0 ? null : num;
        if ((i2 & 2) != 0) {
            string = UUID.randomUUID().toString();
        } else {
            string = null;
        }
        this(num6, string, (i2 & 4) != 0 ? null : num5, (i2 & 8) != 0 ? null : str6, (Function0<Unit>) function0, (i2 & 32) != 0 ? 0 : i3, str2, (i2 & 128) != 0 ? null : num4, (i2 & 256) != 0 ? null : str5, (i2 & 512) == 0 ? str4 : null);
    }

    public C1854370yM7(Integer num, String str, Integer num2, String str2, Function0<Unit> function0, int i, String str3, Integer num3, String str4, String str5) {
        this.LL = num;
        this.LLILLJJLI = str;
        this.LLILLL = num2;
        this.LLILZ = str2;
        this.LLILZIL = function0;
        this.LLILZLL = i;
        this.LLIZ = str3;
        this.LLIZLLLIL = num3;
        this.LLJ = str4;
        this.LLJI = str5;
    }
}
