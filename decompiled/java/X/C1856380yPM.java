package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoQuestionnaire;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yPM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856380yPM implements InterfaceC1891350zJl {
    public final String LL;
    public final TakoQuestionnaire LLILLJJLI;
    public final Message LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1856380yPM)) {
            return false;
        }
        C1856380yPM c1856380yPM = (C1856380yPM) obj;
        return Intrinsics.LJFF(this.LL, c1856380yPM.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1856380yPM.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1856380yPM.LLILLL);
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
        sbLIZ.append("TakoMultiAnswerQuestionnaireItem(uuid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", questionnaire=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1856380yPM() {
        this("", null, null);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        if (interfaceC1891350zJl instanceof C1856380yPM) {
            TakoQuestionnaire takoQuestionnaire = this.LLILLJJLI;
            Integer numValueOf4 = null;
            if (takoQuestionnaire != null) {
                numValueOf = Integer.valueOf(takoQuestionnaire.id);
            } else {
                numValueOf = null;
            }
            C1856380yPM c1856380yPM = (C1856380yPM) interfaceC1891350zJl;
            TakoQuestionnaire takoQuestionnaire2 = c1856380yPM.LLILLJJLI;
            if (takoQuestionnaire2 != null) {
                numValueOf2 = Integer.valueOf(takoQuestionnaire2.id);
            } else {
                numValueOf2 = null;
            }
            if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
                TakoQuestionnaire takoQuestionnaire3 = this.LLILLJJLI;
                if (takoQuestionnaire3 != null) {
                    numValueOf3 = Integer.valueOf(takoQuestionnaire3.type);
                } else {
                    numValueOf3 = null;
                }
                TakoQuestionnaire takoQuestionnaire4 = c1856380yPM.LLILLJJLI;
                if (takoQuestionnaire4 != null) {
                    numValueOf4 = Integer.valueOf(takoQuestionnaire4.type);
                }
                if (Intrinsics.LJFF(numValueOf3, numValueOf4)) {
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
        if (interfaceC1891350zJl instanceof C1856380yPM) {
            return Intrinsics.LJFF(this.LL, ((C1856380yPM) interfaceC1891350zJl).LL);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1856380yPM(String str, TakoQuestionnaire takoQuestionnaire, Message message) {
        this.LL = str;
        this.LLILLJJLI = takoQuestionnaire;
        this.LLILLL = message;
    }
}
