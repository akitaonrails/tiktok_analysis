package X;

import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.QuickLiveVideoTemplate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zoc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C911040Zoc implements InterfaceC911110Zoj, InterfaceC1688506jL {
    public final C0IB0 LL;
    public final C462620ICe LLILLJJLI;
    public final List<C0YC6> LLILLL;
    public final boolean LLILZ = false;
    public final C0ZRT LLILZIL;
    public final boolean LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C911040Zoc)) {
            return false;
        }
        C911040Zoc c911040Zoc = (C911040Zoc) obj;
        return Intrinsics.LJFF(this.LL, c911040Zoc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c911040Zoc.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c911040Zoc.LLILLL) && this.LLILZ == c911040Zoc.LLILZ && Intrinsics.LJFF(this.LLILZIL, c911040Zoc.LLILZIL) && this.LLILZLL == c911040Zoc.LLILZLL;
    }

    public final int hashCode() {
        return (((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickLiveVideoAssemDataReceive(skeletonLayoutData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", backgroundConfig=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", attachments=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isRefreshing=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", nudeFilterDiff=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", showMediaMask=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC911110Zoj
    public final QuickLiveVideoTemplate getContent() {
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(C0I6Y.LIZ(this), BaseTemplate.class);
        if (baseTemplateLIZ instanceof QuickLiveVideoTemplate) {
            return (QuickLiveVideoTemplate) baseTemplateLIZ;
        }
        return null;
    }

    @Override // X.InterfaceC911110Zoj
    public final C462620ICe LIZJ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC911110Zoj
    public final List<C0YC6> LJIILLIIL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC911110Zoj
    public final boolean LJJIIJZLJL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC461380I7k
    public final C0IB0 LLILII() {
        return this.LL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C461450I7r.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        C461530I7z c461530I7zLIZ;
        C911140Zom c911140Zom;
        if (!(interfaceC1891350zJl instanceof C911040Zoc) || interfaceC1891350zJl == null || (c461530I7zLIZ = C911090Zoh.LIZ(this, interfaceC1891350zJl)) == null) {
            return null;
        }
        Object obj = c461530I7zLIZ.LIZIZ;
        if (!(obj instanceof C911140Zom) || (c911140Zom = (C911140Zom) obj) == null) {
            return null;
        }
        if (!c911140Zom.LIZ) {
            C911040Zoc c911040Zoc = (C911040Zoc) interfaceC1891350zJl;
            if (!Intrinsics.LJFF(this.LLILZIL, c911040Zoc.LLILZIL) || this.LLILZLL != c911040Zoc.LLILZLL) {
                return C461530I7z.LIZIZ(c461530I7zLIZ, null, C911140Zom.LIZ(c911140Zom, true, false, 6), 5);
            }
        }
        return c461530I7zLIZ;
    }

    public C911040Zoc(C0IB0 c0ib0, C462620ICe c462620ICe, List list, C0ZRT c0zrt, boolean z) {
        this.LL = c0ib0;
        this.LLILLJJLI = c462620ICe;
        this.LLILLL = list;
        this.LLILZIL = c0zrt;
        this.LLILZLL = z;
    }
}
