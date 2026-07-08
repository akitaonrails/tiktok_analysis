package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xQg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1818760xQg extends AbstractC2004407tC {
    public final EnumC2004207tA LL;
    public final Bitmap LLILLJJLI;
    public final LiveSubMediaModel LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1818760xQg)) {
            return false;
        }
        C1818760xQg c1818760xQg = (C1818760xQg) obj;
        return this.LL == c1818760xQg.LL && Intrinsics.LJFF(this.LLILLJJLI, c1818760xQg.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1818760xQg.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Bitmap bitmap = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        LiveSubMediaModel liveSubMediaModel = this.LLILLL;
        return iHashCode2 + (liveSubMediaModel != null ? liveSubMediaModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SceneryPictureCellData(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", bitmap=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", liveSubMediaModel=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC2004407tC, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1818760xQg) {
            C1818760xQg c1818760xQg = (C1818760xQg) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c1818760xQg.LLILLL, this.LLILLL) && Intrinsics.LJFF(c1818760xQg.LLILLJJLI, this.LLILLJJLI)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.AbstractC2004407tC, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1818760xQg) {
            if (((C1818760xQg) interfaceC1891350zJl).LL == this.LL) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.AbstractC2004407tC, X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1818760xQg) {
            return new C1818790xQj(!Intrinsics.LJFF(((C1818760xQg) interfaceC1891350zJl).LLILLJJLI, this.LLILLJJLI));
        }
        return null;
    }

    public C1818760xQg(EnumC2004207tA enumC2004207tA, Bitmap bitmap, LiveSubMediaModel liveSubMediaModel) {
        this.LL = enumC2004207tA;
        this.LLILLJJLI = bitmap;
        this.LLILLL = liveSubMediaModel;
    }
}
