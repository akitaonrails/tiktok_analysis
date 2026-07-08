package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sfx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C727310Sfx implements InterfaceC1891350zJl {
    public final Aweme LL;
    public final EnumC696090RSd LLILLJJLI;
    public final String LLILLL = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C727310Sfx)) {
            return false;
        }
        C727310Sfx c727310Sfx = (C727310Sfx) obj;
        return Intrinsics.LJFF(this.LL, c727310Sfx.LL) && this.LLILLJJLI == c727310Sfx.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c727310Sfx.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        EnumC696090RSd enumC696090RSd = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (enumC696090RSd == null ? 0 : enumC696090RSd.hashCode())) * 31;
        String str = this.LLILLL;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryGalleryCoverItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", publishStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C727310Sfx)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL, ((C727310Sfx) interfaceC1891350zJl).LL);
    }

    public C727310Sfx(Aweme aweme, EnumC696090RSd enumC696090RSd) {
        this.LL = aweme;
        this.LLILLJJLI = enumC696090RSd;
    }
}
