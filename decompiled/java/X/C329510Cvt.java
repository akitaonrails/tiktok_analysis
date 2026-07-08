package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cvt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C329510Cvt implements InterfaceC1891350zJl {
    public final int LL;
    public final TakoVideoItem LLILLJJLI;
    public final String LLILLL;
    public final Function1<View, Unit> LLILZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C329510Cvt() {
        this(0, (TakoVideoItem) null, (String) (0 == true ? 1 : 0), 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C329510Cvt)) {
            return false;
        }
        C329510Cvt c329510Cvt = (C329510Cvt) obj;
        return this.LL == c329510Cvt.LL && Intrinsics.LJFF(this.LLILLJJLI, c329510Cvt.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c329510Cvt.LLILLL) && Intrinsics.LJFF(this.LLILZ, c329510Cvt.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int i = this.LL * 31;
        TakoVideoItem takoVideoItem = this.LLILLJJLI;
        int iHashCode = (i + (takoVideoItem == null ? 0 : takoVideoItem.hashCode())) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Function1<View, Unit> function1 = this.LLILZ;
        return iHashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoCommonVideoItem(index=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", videoItem=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", uuid=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C329510Cvt) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C329510Cvt) interfaceC1891350zJl).LLILLJJLI);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        if (interfaceC1891350zJl instanceof C329510Cvt) {
            C329510Cvt c329510Cvt = (C329510Cvt) interfaceC1891350zJl;
            if (this.LL == c329510Cvt.LL) {
                TakoVideoItem takoVideoItem = this.LLILLJJLI;
                String str2 = null;
                if (takoVideoItem != null) {
                    str = takoVideoItem.awemeId;
                } else {
                    str = null;
                }
                TakoVideoItem takoVideoItem2 = c329510Cvt.LLILLJJLI;
                if (takoVideoItem2 != null) {
                    str2 = takoVideoItem2.awemeId;
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

    public /* synthetic */ C329510Cvt(int i, TakoVideoItem takoVideoItem, String str, int i2) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : takoVideoItem, (i2 & 4) != 0 ? null : str, (Function1<? super View, Unit>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C329510Cvt(int i, TakoVideoItem takoVideoItem, String str, Function1<? super View, Unit> function1) {
        this.LL = i;
        this.LLILLJJLI = takoVideoItem;
        this.LLILLL = str;
        this.LLILZ = function1;
    }
}
