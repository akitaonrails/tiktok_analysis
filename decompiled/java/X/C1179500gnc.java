package X;

import com.ss.android.ugc.aweme.poi.quiz.data.PoiCardBottomBtnModel;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gnc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179500gnc implements InterfaceC1891350zJl {
    public final PoiQuizItem LL;
    public final PoiCardBottomBtnModel LLILLJJLI;
    public final EnumC1179510gnd LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1179500gnc)) {
            return false;
        }
        C1179500gnc c1179500gnc = (C1179500gnc) obj;
        return Intrinsics.LJFF(this.LL, c1179500gnc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1179500gnc.LLILLJJLI) && this.LLILLL == c1179500gnc.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        PoiQuizItem poiQuizItem = this.LL;
        int iHashCode = (poiQuizItem == null ? 0 : poiQuizItem.hashCode()) * 31;
        PoiCardBottomBtnModel poiCardBottomBtnModel = this.LLILLJJLI;
        return ((iHashCode + (poiCardBottomBtnModel != null ? poiCardBottomBtnModel.hashCode() : 0)) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiQuizHorizontalCardItemInfo(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", poiCardBottomBtnModel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", cardStatus=");
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
        C1179500gnc c1179500gnc;
        String str;
        PoiQuizItem poiQuizItem;
        String str2 = null;
        if (interfaceC1891350zJl instanceof C1179500gnc) {
            c1179500gnc = (C1179500gnc) interfaceC1891350zJl;
        } else {
            c1179500gnc = null;
        }
        PoiQuizItem poiQuizItem2 = this.LL;
        if (poiQuizItem2 != null && (str = poiQuizItem2.poiId) != null && C123100dR.LIZ(str)) {
            String str3 = this.LL.poiId;
            if (c1179500gnc != null && (poiQuizItem = c1179500gnc.LL) != null) {
                str2 = poiQuizItem.poiId;
            }
            if (Intrinsics.LJFF(str3, str2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1179500gnc(PoiQuizItem poiQuizItem, PoiCardBottomBtnModel poiCardBottomBtnModel, EnumC1179510gnd enumC1179510gnd) {
        this.LL = poiQuizItem;
        this.LLILLJJLI = poiCardBottomBtnModel;
        this.LLILLL = enumC1179510gnd;
    }
}
