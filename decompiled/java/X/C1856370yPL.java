package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoQuestionnaire;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yPL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856370yPL implements InterfaceC1891350zJl {
    public final String LL;
    public final TakoQuestionnaire LLILLJJLI;
    public final Message LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1856370yPL)) {
            return false;
        }
        C1856370yPL c1856370yPL = (C1856370yPL) obj;
        return Intrinsics.LJFF(this.LL, c1856370yPL.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1856370yPL.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1856370yPL.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        TakoQuestionnaire takoQuestionnaire = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (takoQuestionnaire == null ? 0 : takoQuestionnaire.hashCode())) * 31;
        Message message = this.LLILLL;
        return iHashCode2 + (message != null ? message.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoQuestionnaireItem(uuid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", questionnaire=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1856370yPL() {
        this("", null, null);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        Integer numValueOf;
        Integer numValueOf2;
        String str;
        String str2;
        Integer numValueOf3;
        if (interfaceC1891350zJl instanceof C1856370yPL) {
            TakoQuestionnaire takoQuestionnaire = this.LLILLJJLI;
            Integer numValueOf4 = null;
            if (takoQuestionnaire != null) {
                numValueOf = Integer.valueOf(takoQuestionnaire.id);
            } else {
                numValueOf = null;
            }
            C1856370yPL c1856370yPL = (C1856370yPL) interfaceC1891350zJl;
            TakoQuestionnaire takoQuestionnaire2 = c1856370yPL.LLILLJJLI;
            if (takoQuestionnaire2 != null) {
                numValueOf2 = Integer.valueOf(takoQuestionnaire2.id);
            } else {
                numValueOf2 = null;
            }
            if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
                TakoQuestionnaire takoQuestionnaire3 = this.LLILLJJLI;
                if (takoQuestionnaire3 != null) {
                    str = takoQuestionnaire3.title;
                } else {
                    str = null;
                }
                TakoQuestionnaire takoQuestionnaire4 = c1856370yPL.LLILLJJLI;
                if (takoQuestionnaire4 != null) {
                    str2 = takoQuestionnaire4.title;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str, str2)) {
                    TakoQuestionnaire takoQuestionnaire5 = this.LLILLJJLI;
                    if (takoQuestionnaire5 != null) {
                        numValueOf3 = Integer.valueOf(takoQuestionnaire5.type);
                    } else {
                        numValueOf3 = null;
                    }
                    TakoQuestionnaire takoQuestionnaire6 = c1856370yPL.LLILLJJLI;
                    if (takoQuestionnaire6 != null) {
                        numValueOf4 = Integer.valueOf(takoQuestionnaire6.type);
                    }
                    if (Intrinsics.LJFF(numValueOf3, numValueOf4)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1856370yPL) {
            return Intrinsics.LJFF(this.LL, ((C1856370yPL) interfaceC1891350zJl).LL);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1856370yPL(String str, TakoQuestionnaire takoQuestionnaire, Message message) {
        this.LL = str;
        this.LLILLJJLI = takoQuestionnaire;
        this.LLILLL = message;
    }
}
