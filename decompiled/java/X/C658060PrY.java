package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PrY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C658060PrY implements InterfaceC658090Prb {
    public final Aweme LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final EnumC656150PoT LLILZIL = EnumC656150PoT.AUTHOR_DIGG;
    public final boolean LLILZLL = true;

    @Override // X.InterfaceC1015900cXk
    public final void LIZIZ(Float f) {
    }

    @Override // X.InterfaceC1015900cXk
    public final void LJI(Float f) {
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIILIIL() {
        return null;
    }

    @Override // X.InterfaceC657240PqE
    public final Integer LJJII() {
        return null;
    }

    @Override // X.InterfaceC657240PqE
    public final boolean LJJJJZ() {
        return false;
    }

    @Override // X.InterfaceC657240PqE
    public final Integer LJLILLLLZI() {
        return null;
    }

    @Override // X.InterfaceC657240PqE
    public final C658800Psk LJLJJLL() {
        return null;
    }

    @Override // X.InterfaceC657240PqE
    public final boolean LLFZ() {
        return false;
    }

    @Override // X.InterfaceC657240PqE
    public final String LLII() {
        return null;
    }

    @Override // X.InterfaceC657240PqE
    public final Integer LLJLL() {
        return null;
    }

    @Override // X.InterfaceC664660Q5g
    public final C664650Q5f LLJLLIL() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C658060PrY)) {
            return false;
        }
        C658060PrY c658060PrY = (C658060PrY) obj;
        return Intrinsics.LJFF(this.LL, c658060PrY.LL) && Intrinsics.LJFF(this.LLILLJJLI, c658060PrY.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c658060PrY.LLILLL) && this.LLILZ == c658060PrY.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC684960Qtq
    public final Integer getDisplayLine() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchSinglePhotoDocRenderData(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", snippet=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isPage=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIIIIZZ() {
        return Float.valueOf(4.0f);
    }

    @Override // X.InterfaceC657240PqE
    public final InterfaceC655790Pnt getTag() {
        return new C656060PoK();
    }

    @Override // X.InterfaceC684960Qtq
    public final boolean LJ() {
        return C684950Qtp.LIZIZ(this);
    }

    @Override // X.InterfaceC684960Qtq
    public final C1263404wy LJJIIJ() {
        return C684950Qtp.LIZ();
    }

    @Override // X.InterfaceC684960Qtq
    public final boolean LIZLLL() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC658090Prb
    public final boolean LJIIIZ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC657240PqE
    public final EnumC656150PoT LJJIIZI() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC657240PqE
    public final EnumC657230PqD LJJJJL() {
        return EnumC657230PqD.ONE_LINE;
    }

    @Override // X.InterfaceC657240PqE, X.InterfaceC655730Pnn
    public final InterfaceC655080Pmk getAnchorType() {
        return C655090Pml.LIZ;
    }

    @Override // X.InterfaceC435460H5s
    public final Aweme getAweme() {
        return this.LL;
    }

    @Override // X.InterfaceC684960Qtq
    public final String getContent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC657240PqE
    public final EnumC657200PqA getRatio() {
        return EnumC657200PqA.AUTO;
    }

    @Override // X.InterfaceC684960Qtq
    public final String getSnippet() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LIZ(int i) {
        if (i <= 2) {
            return Float.valueOf(0.0f);
        }
        return null;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C655770Pnr.LIZ(this, interfaceC1891350zJl);
    }

    public C658060PrY(Aweme aweme, String str, String str2, boolean z) {
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
        C1839007Ie.LIZ();
    }
}
