package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.router.model.AnswerInnerAnchor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HeW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446140HeW {
    public final Message LIZ;
    public final AnswerInnerAnchor LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C446140HeW)) {
            return false;
        }
        C446140HeW c446140HeW = (C446140HeW) obj;
        return Intrinsics.LJFF(this.LIZ, c446140HeW.LIZ) && Intrinsics.LJFF(this.LIZIZ, c446140HeW.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingAnchor(answer=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", anchor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C446140HeW(Message message, AnswerInnerAnchor answerInnerAnchor) {
        this.LIZ = message;
        this.LIZIZ = answerInnerAnchor;
    }
}
