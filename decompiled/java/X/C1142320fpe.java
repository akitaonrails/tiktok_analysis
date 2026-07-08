package X;

import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fpe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142320fpe implements InterfaceC1891350zJl {
    public final GiftColorInfo LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1142320fpe)) {
            return false;
        }
        C1142320fpe c1142320fpe = (C1142320fpe) obj;
        return Intrinsics.LJFF(this.LL, c1142320fpe.LL) && this.LLILLJJLI == c1142320fpe.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CountryItem(info=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1142320fpe) {
            C1142320fpe c1142320fpe = (C1142320fpe) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c1142320fpe.LL.colorId, this.LL.colorId) && c1142320fpe.LLILLJJLI == this.LLILLJJLI) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1142320fpe) && Intrinsics.LJFF(((C1142320fpe) interfaceC1891350zJl).LL.colorId, this.LL.colorId)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        if (interfaceC1891350zJl instanceof C1142320fpe) {
            C1142320fpe c1142320fpe = (C1142320fpe) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c1142320fpe.LL.colorId, this.LL.colorId) && (z = c1142320fpe.LLILLJJLI) != this.LLILLJJLI) {
                return new C1263704x1(z);
            }
            return null;
        }
        return null;
    }

    public C1142320fpe(GiftColorInfo giftColorInfo, boolean z) {
        this.LL = giftColorInfo;
        this.LLILLJJLI = z;
    }
}
