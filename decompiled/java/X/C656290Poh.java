package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.nimblecard.model.Template;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Poh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656290Poh implements InterfaceC435460H5s, InterfaceC657240PqE, C14NM {
    public final Aweme LL;
    public final Template LLILLJJLI;
    public final boolean LLILLL;
    public final EnumC656150PoT LLILZ = EnumC656150PoT.DIGG;

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
        if (!(obj instanceof C656290Poh)) {
            return false;
        }
        C656290Poh c656290Poh = (C656290Poh) obj;
        return Intrinsics.LJFF(this.LL, c656290Poh.LL) && Intrinsics.LJFF(this.LLILLJJLI, c656290Poh.LLILLJJLI) && this.LLILLL == c656290Poh.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Template template = this.LLILLJJLI;
        return ((iHashCode + (template == null ? 0 : template.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchNimbleDocItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", template=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isPage=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C14NM
    public final int getContentType() {
        return (AwemeExtKt.isPhotoMode(this.LL) ? 102 : 101) + 50000;
    }

    @Override // X.InterfaceC657240PqE
    public final InterfaceC655790Pnt getTag() {
        return AwemeExtKt.isPhotoMode(this.LL) ? new C656260Poe(EnumC656280Pog.PHOTO) : new C656060PoK();
    }

    @Override // X.InterfaceC657240PqE
    public final EnumC656150PoT LJJIIZI() {
        return this.LLILZ;
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

    @Override // X.InterfaceC657240PqE
    public final EnumC657200PqA getRatio() {
        return EnumC657200PqA.AUTO;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C655770Pnr.LIZ(this, interfaceC1891350zJl);
    }

    public C656290Poh(Aweme aweme, Template template, boolean z) {
        this.LL = aweme;
        this.LLILLJJLI = template;
        this.LLILLL = z;
    }
}
