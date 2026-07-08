package X;

import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zoa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C911020Zoa implements InterfaceC911100Zoi, InterfaceC911160Zoo {
    public final C0IB0 LL;
    public final C0ZRS LLILLJJLI;
    public final C462620ICe LLILLL;
    public final List<C0YC6> LLILZ;
    public final boolean LLILZIL;
    public final int LLILZLL;
    public final String LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C911020Zoa)) {
            return false;
        }
        C911020Zoa c911020Zoa = (C911020Zoa) obj;
        return Intrinsics.LJFF(this.LL, c911020Zoa.LL) && Intrinsics.LJFF(this.LLILLJJLI, c911020Zoa.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c911020Zoa.LLILLL) && Intrinsics.LJFF(this.LLILZ, c911020Zoa.LLILZ) && this.LLILZIL == c911020Zoa.LLILZIL && this.LLILZLL == c911020Zoa.LLILZLL && Intrinsics.LJFF(this.LLIZ, c911020Zoa.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C0ZRS c0zrs = this.LLILLJJLI;
        return ((((((((((iHashCode + (c0zrs == null ? 0 : c0zrs.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoSwapAssemDataSend(skeletonLayoutData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", photoSwapPairedStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", backgroundConfig=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", attachments=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isRefreshing=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", msgStatus=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", uuid=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC911100Zoi
    public final PictureCardTemplate getContent() {
        return C911080Zog.LIZIZ(this);
    }

    @Override // X.InterfaceC911100Zoi
    public final C462620ICe LIZJ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC911100Zoi
    public final List<C0YC6> LJIILLIIL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC911100Zoi
    public final boolean LJJIIJZLJL() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC461380I7k
    public final C0IB0 LLILII() {
        return this.LL;
    }

    @Override // X.InterfaceC911160Zoo
    public final int getMsgStatus() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC911160Zoo
    public final String getUuid() {
        return this.LLIZ;
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
        if (!(interfaceC1891350zJl instanceof C911020Zoa) || interfaceC1891350zJl == null || (c461530I7zLIZ = C911080Zog.LIZ(this, interfaceC1891350zJl)) == null) {
            return null;
        }
        Object obj = c461530I7zLIZ.LIZIZ;
        if (!(obj instanceof C911140Zom) || (c911140Zom = (C911140Zom) obj) == null) {
            return null;
        }
        if (this.LLILZLL != ((C911020Zoa) interfaceC1891350zJl).LLILZLL) {
            return C461530I7z.LIZIZ(c461530I7zLIZ, null, C911140Zom.LIZ(c911140Zom, false, true, 3), 5);
        }
        return c461530I7zLIZ;
    }

    public C911020Zoa(C0IB0 c0ib0, C0ZRS c0zrs, C462620ICe c462620ICe, List<C0YC6> list, boolean z, int i, String str) {
        this.LL = c0ib0;
        this.LLILLJJLI = c0zrs;
        this.LLILLL = c462620ICe;
        this.LLILZ = list;
        this.LLILZIL = z;
        this.LLILZLL = i;
        this.LLIZ = str;
    }
}
