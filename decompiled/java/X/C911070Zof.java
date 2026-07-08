package X;

import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C911070Zof implements InterfaceC911100Zoi, InterfaceC911160Zoo {
    public final C0IB0 LL;
    public final C462620ICe LLILLJJLI;
    public final List<C0YC6> LLILLL;
    public final boolean LLILZ;
    public final int LLILZIL;
    public final String LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C911070Zof)) {
            return false;
        }
        C911070Zof c911070Zof = (C911070Zof) obj;
        return Intrinsics.LJFF(this.LL, c911070Zof.LL) && Intrinsics.LJFF(this.LLILLJJLI, c911070Zof.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c911070Zof.LLILLL) && this.LLILZ == c911070Zof.LLILZ && this.LLILZIL == c911070Zof.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c911070Zof.LLILZLL);
    }

    public final int hashCode() {
        return (((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PictureCardAssemDataSend(skeletonLayoutData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", backgroundConfig=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", attachments=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isRefreshing=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", msgStatus=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", uuid=");
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

    @Override // X.InterfaceC911160Zoo
    public final int getMsgStatus() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC911160Zoo
    public final String getUuid() {
        return this.LLILZLL;
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
        if (!(interfaceC1891350zJl instanceof C911070Zof) || interfaceC1891350zJl == null || (c461530I7zLIZ = C911080Zog.LIZ(this, interfaceC1891350zJl)) == null) {
            return null;
        }
        Object obj = c461530I7zLIZ.LIZIZ;
        if (!(obj instanceof C911140Zom) || (c911140Zom = (C911140Zom) obj) == null) {
            return null;
        }
        if (this.LLILZIL != ((C911070Zof) interfaceC1891350zJl).LLILZIL) {
            return C461530I7z.LIZIZ(c461530I7zLIZ, null, C911140Zom.LIZ(c911140Zom, false, true, 3), 5);
        }
        return c461530I7zLIZ;
    }

    public C911070Zof(C0IB0 c0ib0, C462620ICe c462620ICe, List<C0YC6> list, boolean z, int i, String str) {
        this.LL = c0ib0;
        this.LLILLJJLI = c462620ICe;
        this.LLILLL = list;
        this.LLILZ = z;
        this.LLILZIL = i;
        this.LLILZLL = str;
    }
}
