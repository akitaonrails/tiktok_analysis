package X;

import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZW7, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZW7 extends AbstractC345490DgZ {
    public final long LL;
    public final long LLILLJJLI;
    public final int LLILLL;
    public final long LLILZ;
    public final String LLILZIL;
    public final C0ZW2<UrlModel> LLILZLL;
    public final C1622006Ws<Function1<View, Unit>> LLIZ;
    public final boolean LLIZLLLIL;
    public final C0ZSW LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZW7)) {
            return false;
        }
        C0ZW7 c0zw7 = (C0ZW7) obj;
        return this.LL == c0zw7.LL && this.LLILLJJLI == c0zw7.LLILLJJLI && this.LLILLL == c0zw7.LLILLL && this.LLILZ == c0zw7.LLILZ && Intrinsics.LJFF(this.LLILZIL, c0zw7.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0zw7.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0zw7.LLIZ) && this.LLIZLLLIL == c0zw7.LLIZLLLIL && this.LLJ == c0zw7.LLJ;
    }

    public final int hashCode() {
        int iY2 = ((((((C786410Ut5.Y2(this.LL) * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + this.LLILLL) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31;
        String str = this.LLILZIL;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        C0ZW2<UrlModel> c0zw2 = this.LLILZLL;
        int iHashCode2 = (iHashCode + (c0zw2 == null ? 0 : c0zw2.hashCode())) * 31;
        this.LLIZ.getClass();
        return (((iHashCode2 * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + this.LLJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DetailGridMediaCellItem(msgId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", msgIndex=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", msgType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", cover=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", onMediaItemClick=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", showTimestamp=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", shouldMask=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC345490DgZ, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C0ZW7) && ((C0ZW7) interfaceC1891350zJl).LL == this.LL) {
            return true;
        }
        return false;
    }

    public C0ZW7(long j, long j2, int i, long j3, String str, C0ZW2<UrlModel> c0zw2, C1622006Ws<Function1<View, Unit>> c1622006Ws, boolean z, C0ZSW c0zsw) {
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = i;
        this.LLILZ = j3;
        this.LLILZIL = str;
        this.LLILZLL = c0zw2;
        this.LLIZ = c1622006Ws;
        this.LLIZLLLIL = z;
        this.LLJ = c0zsw;
    }
}
