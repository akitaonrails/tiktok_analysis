package X;

import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZoY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C911000ZoY implements InterfaceC910980ZoW, InterfaceC911160Zoo {
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
        if (!(obj instanceof C911000ZoY)) {
            return false;
        }
        C911000ZoY c911000ZoY = (C911000ZoY) obj;
        return Intrinsics.LJFF(this.LL, c911000ZoY.LL) && Intrinsics.LJFF(this.LLILLJJLI, c911000ZoY.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c911000ZoY.LLILLL) && this.LLILZ == c911000ZoY.LLILZ && this.LLILZIL == c911000ZoY.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c911000ZoY.LLILZLL);
    }

    public final int hashCode() {
        return (((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoCardAssemDataSend(skeletonLayoutData=");
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

    @Override // X.InterfaceC910980ZoW
    public final VideoCardTemplate getContent() {
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(C0I6Y.LIZ(this), BaseTemplate.class);
        if (baseTemplateLIZ instanceof VideoCardTemplate) {
            return (VideoCardTemplate) baseTemplateLIZ;
        }
        return null;
    }

    @Override // X.InterfaceC910980ZoW
    public final C462620ICe LIZJ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC910980ZoW
    public final List<C0YC6> LJIILLIIL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC910980ZoW
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
        C911000ZoY c911000ZoY;
        C461530I7z c461530I7zLIZ;
        C911140Zom c911140Zom;
        if (!(interfaceC1891350zJl instanceof C911000ZoY) || (c911000ZoY = (C911000ZoY) interfaceC1891350zJl) == null || (c461530I7zLIZ = C910990ZoX.LIZ(this, interfaceC1891350zJl)) == null) {
            return null;
        }
        Object obj = c461530I7zLIZ.LIZIZ;
        if (!(obj instanceof C911140Zom) || (c911140Zom = (C911140Zom) obj) == null) {
            return null;
        }
        if (this.LLILZIL != c911000ZoY.LLILZIL) {
            return C461530I7z.LIZIZ(c461530I7zLIZ, null, C911140Zom.LIZ(c911140Zom, false, true, 3), 5);
        }
        return c461530I7zLIZ;
    }

    public C911000ZoY(C0IB0 c0ib0, C462620ICe c462620ICe, List<C0YC6> list, boolean z, int i, String str) {
        this.LL = c0ib0;
        this.LLILLJJLI = c462620ICe;
        this.LLILLL = list;
        this.LLILZ = z;
        this.LLILZIL = i;
        this.LLILZLL = str;
    }
}
