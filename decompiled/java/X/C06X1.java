package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06X1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06X1 implements InterfaceC1891350zJl {
    public final int LL;
    public final boolean LLILLJJLI;
    public final ConvertStyleItem LLILLL;
    public final Function1<View, Unit> LLILZ;

    public C06X1() {
        this(0, false, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06X1)) {
            return false;
        }
        C06X1 c06x1 = (C06X1) obj;
        return this.LL == c06x1.LL && this.LLILLJJLI == c06x1.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c06x1.LLILLL) && Intrinsics.LJFF(this.LLILZ, c06x1.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iZ2 = ((this.LL * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        ConvertStyleItem convertStyleItem = this.LLILLL;
        int iHashCode = (iZ2 + (convertStyleItem == null ? 0 : convertStyleItem.hashCode())) * 31;
        Function1<View, Unit> function1 = this.LLILZ;
        return iHashCode + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAIImageConvertStyleItem(index=");
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
        String str;
        if (interfaceC1891350zJl instanceof C06X1) {
            C06X1 c06x1 = (C06X1) interfaceC1891350zJl;
            if (this.LL == c06x1.LL && this.LLILLJJLI == c06x1.LLILLJJLI) {
                ConvertStyleItem convertStyleItem = this.LLILLL;
                String str2 = null;
                if (convertStyleItem != null) {
                    str = convertStyleItem.imageStyle;
                } else {
                    str = null;
                }
                ConvertStyleItem convertStyleItem2 = c06x1.LLILLL;
                if (convertStyleItem2 != null) {
                    str2 = convertStyleItem2.imageStyle;
                }
                if (Intrinsics.LJFF(str, str2)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C06X1) {
            if (this.LL == ((C06X1) interfaceC1891350zJl).LL) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C06X1(int i, boolean z, ConvertStyleItem convertStyleItem, Function1<? super View, Unit> function1) {
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = convertStyleItem;
        this.LLILZ = function1;
    }
}
