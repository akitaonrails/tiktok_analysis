package X;

import com.ss.android.ugc.aweme.search.pages.result.common.reflist.search.model.RefSource;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QpP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C682210QpP implements InterfaceC0148002o {
    public final String LL;
    public final C682250QpT LLILLJJLI;
    public final C682270QpV LLILLL;
    public final C291001Au<C0H47> LLILZ;
    public final C665660Q9c LLILZIL;
    public final EnumC682220QpQ LLILZLL;
    public final C291001Au<List<Object>> LLIZ;
    public final C291001Au<List<RefSource>> LLIZLLLIL;

    public C682210QpP() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C682210QpP)) {
            return false;
        }
        C682210QpP c682210QpP = (C682210QpP) obj;
        return Intrinsics.LJFF(this.LL, c682210QpP.LL) && Intrinsics.LJFF(this.LLILLJJLI, c682210QpP.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c682210QpP.LLILLL) && Intrinsics.LJFF(this.LLILZ, c682210QpP.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c682210QpP.LLILZIL) && this.LLILZLL == c682210QpP.LLILZLL && Intrinsics.LJFF(this.LLIZ, c682210QpP.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c682210QpP.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C682250QpT c682250QpT = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c682250QpT == null ? 0 : c682250QpT.hashCode())) * 31;
        C682270QpV c682270QpV = this.LLILLL;
        int iHashCode3 = (((iHashCode2 + (c682270QpV == null ? 0 : c682270QpV.hashCode())) * 31) + this.LLILZ.hashCode()) * 31;
        C665660Q9c c665660Q9c = this.LLILZIL;
        return ((((((iHashCode3 + (c665660Q9c != null ? c665660Q9c.hashCode() : 0)) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchTextLandingPageContentState(text=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", labelModel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", interactionModel=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", rsModel=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", networkStatus=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", uiStatus=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", webDocList=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", refSourceList=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C682210QpP(int i) {
        this("", null, null, new C291001Au(null), null, EnumC682220QpQ.UN_DEFINE, new C291001Au(null), new C291001Au(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C682210QpP(String str, C682250QpT c682250QpT, C682270QpV c682270QpV, C291001Au<C0H47> c291001Au, C665660Q9c c665660Q9c, EnumC682220QpQ enumC682220QpQ, C291001Au<? extends List<Object>> c291001Au2, C291001Au<? extends List<RefSource>> c291001Au3) {
        this.LL = str;
        this.LLILLJJLI = c682250QpT;
        this.LLILLL = c682270QpV;
        this.LLILZ = c291001Au;
        this.LLILZIL = c665660Q9c;
        this.LLILZLL = enumC682220QpQ;
        this.LLIZ = c291001Au2;
        this.LLIZLLLIL = c291001Au3;
    }

    public static C682210QpP LIZ(C682210QpP c682210QpP, C682250QpT c682250QpT, C682270QpV c682270QpV, C291001Au c291001Au, EnumC682220QpQ enumC682220QpQ, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        String str;
        C291001Au c291001Au4 = c291001Au3;
        C291001Au c291001Au5 = c291001Au;
        C291001Au c291001Au6 = c291001Au2;
        C682270QpV c682270QpV2 = c682270QpV;
        EnumC682220QpQ enumC682220QpQ2 = enumC682220QpQ;
        C682250QpT c682250QpT2 = c682250QpT;
        C665660Q9c c665660Q9c = null;
        if ((i & 1) != 0) {
            str = c682210QpP.LL;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            c682250QpT2 = c682210QpP.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c682270QpV2 = c682210QpP.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au5 = c682210QpP.LLILZ;
        }
        if ((i & 16) != 0) {
            c665660Q9c = c682210QpP.LLILZIL;
        }
        if ((i & 32) != 0) {
            enumC682220QpQ2 = c682210QpP.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au6 = c682210QpP.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au4 = c682210QpP.LLIZLLLIL;
        }
        c682210QpP.getClass();
        return new C682210QpP(str, c682250QpT2, c682270QpV2, c291001Au5, c665660Q9c, enumC682220QpQ2, c291001Au6, c291001Au4);
    }
}
