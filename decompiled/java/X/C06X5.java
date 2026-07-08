package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06X5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06X5 implements InterfaceC1891350zJl {
    public final int LL;
    public boolean LLILLJJLI;
    public final ConvertStyleItem LLILLL;
    public final Function0<Unit> LLILZ;

    public C06X5() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06X5)) {
            return false;
        }
        C06X5 c06x5 = (C06X5) obj;
        return this.LL == c06x5.LL && this.LLILLJJLI == c06x5.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c06x5.LLILLL) && Intrinsics.LJFF(this.LLILZ, c06x5.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iZ2 = ((this.LL * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        ConvertStyleItem convertStyleItem = this.LLILLL;
        int iHashCode = (iZ2 + (convertStyleItem == null ? 0 : convertStyleItem.hashCode())) * 31;
        Function0<Unit> function0 = this.LLILZ;
        return iHashCode + (function0 != null ? function0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoImageStyleItem(index=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", checked=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C06X1) {
            if (this.LLILLJJLI == ((C06X1) interfaceC1891350zJl).LLILLJJLI) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        if (interfaceC1891350zJl instanceof C06X1) {
            ConvertStyleItem convertStyleItem = this.LLILLL;
            String str2 = null;
            if (convertStyleItem != null) {
                str = convertStyleItem.imageStyle;
            } else {
                str = null;
            }
            ConvertStyleItem convertStyleItem2 = ((C06X1) interfaceC1891350zJl).LLILLL;
            if (convertStyleItem2 != null) {
                str2 = convertStyleItem2.imageStyle;
            }
            return Intrinsics.LJFF(str, str2);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public /* synthetic */ C06X5(ConvertStyleItem convertStyleItem, int i) {
        this(0, false, (i & 4) != 0 ? null : convertStyleItem, null);
    }

    public C06X5(int i, boolean z, ConvertStyleItem convertStyleItem, Function0<Unit> function0) {
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = convertStyleItem;
        this.LLILZ = function0;
    }
}
