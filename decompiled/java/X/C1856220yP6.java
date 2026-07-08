package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yP6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856220yP6 implements InterfaceC1891350zJl {
    public final InterfaceC665370Q7z LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Integer LLILZ;
    public final Integer LLILZIL;
    public final Message LLILZLL;
    public final String LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final Function0<Unit> LLJI;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1856220yP6() {
        Integer num = null;
        this(num, num, false, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1856220yP6)) {
            return false;
        }
        C1856220yP6 c1856220yP6 = (C1856220yP6) obj;
        return Intrinsics.LJFF(this.LL, c1856220yP6.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1856220yP6.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1856220yP6.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1856220yP6.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1856220yP6.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1856220yP6.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1856220yP6.LLIZ) && this.LLIZLLLIL == c1856220yP6.LLIZLLLIL && this.LLJ == c1856220yP6.LLJ && Intrinsics.LJFF(this.LLJI, c1856220yP6.LLJI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
        int iHashCode = (interfaceC665370Q7z == null ? 0 : interfaceC665370Q7z.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Message message = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (message == null ? 0 : message.hashCode())) * 31;
        String str3 = this.LLIZ;
        int iHashCode7 = (((((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ)) * 31;
        Function0<Unit> function0 = this.LLJI;
        return iHashCode7 + (function0 != null ? function0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoEntitySugCardItem(scope=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", entityWord=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sugContent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", sugIndex=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", sugCount=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", sugReplyMessage=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", sugReplyMessageId=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", isExplict=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", isLoading=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1856220yP6) {
            if (areItemTheSame(interfaceC1891350zJl) && Intrinsics.LJFF(this.LLILLL, ((C1856220yP6) interfaceC1891350zJl).LLILLL)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1856220yP6) {
            return Intrinsics.LJFF(this.LLILZ, ((C1856220yP6) interfaceC1891350zJl).LLILZ);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public /* synthetic */ C1856220yP6(Integer num, Integer num2, boolean z, int i) {
        this(null, null, null, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, null, null, false, (i & 256) != 0 ? true : z, null);
    }

    public C1856220yP6(InterfaceC665370Q7z interfaceC665370Q7z, String str, String str2, Integer num, Integer num2, Message message, String str3, boolean z, boolean z2, Function0<Unit> function0) {
        this.LL = interfaceC665370Q7z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = num;
        this.LLILZIL = num2;
        this.LLILZLL = message;
        this.LLIZ = str3;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
        this.LLJI = function0;
    }
}
