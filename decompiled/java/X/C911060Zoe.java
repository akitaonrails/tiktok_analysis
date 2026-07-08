package X;

import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zoe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C911060Zoe implements InterfaceC911100Zoi, InterfaceC1688506jL {
    public final C0IB0 LL;
    public final C462620ICe LLILLJJLI;
    public final List<C0YC6> LLILLL;
    public final boolean LLILZ;
    public final C0ZRT LLILZIL;
    public final boolean LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C911060Zoe)) {
            return false;
        }
        C911060Zoe c911060Zoe = (C911060Zoe) obj;
        return Intrinsics.LJFF(this.LL, c911060Zoe.LL) && Intrinsics.LJFF(this.LLILLJJLI, c911060Zoe.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c911060Zoe.LLILLL) && this.LLILZ == c911060Zoe.LLILZ && Intrinsics.LJFF(this.LLILZIL, c911060Zoe.LLILZIL) && this.LLILZLL == c911060Zoe.LLILZLL;
    }

    public final int hashCode() {
        return (((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PictureCardAssemDataReceive(skeletonLayoutData=");
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

    @Override // X.InterfaceC911100Zoi
    public final PictureCardTemplate getContent() {
        return C911080Zog.LIZIZ(this);
    }

    @Override // X.InterfaceC911100Zoi
    public final C462620ICe LIZJ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC911100Zoi
    public final List<C0YC6> LJIILLIIL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC911100Zoi
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
        if (!(interfaceC1891350zJl instanceof C911060Zoe) || interfaceC1891350zJl == null || (c461530I7zLIZ = C911080Zog.LIZ(this, interfaceC1891350zJl)) == null) {
            return null;
        }
        Object obj = c461530I7zLIZ.LIZIZ;
        if (!(obj instanceof C911140Zom) || (c911140Zom = (C911140Zom) obj) == null) {
            return null;
        }
        if (!c911140Zom.LIZ) {
            C911060Zoe c911060Zoe = (C911060Zoe) interfaceC1891350zJl;
            if (!Intrinsics.LJFF(this.LLILZIL, c911060Zoe.LLILZIL) || this.LLILZLL != c911060Zoe.LLILZLL) {
                return C461530I7z.LIZIZ(c461530I7zLIZ, null, C911140Zom.LIZ(c911140Zom, true, false, 6), 5);
            }
        }
        return c461530I7zLIZ;
    }

    public C911060Zoe(C0IB0 c0ib0, C462620ICe c462620ICe, List<C0YC6> list, boolean z, C0ZRT c0zrt, boolean z2) {
        this.LL = c0ib0;
        this.LLILLJJLI = c462620ICe;
        this.LLILLL = list;
        this.LLILZ = z;
        this.LLILZIL = c0zrt;
        this.LLILZLL = z2;
    }
}
