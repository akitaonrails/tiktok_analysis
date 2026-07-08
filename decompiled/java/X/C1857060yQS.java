package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yQS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857060yQS implements InterfaceC1891350zJl, InterfaceC689540R2y {
    public final Message LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final Function0<Unit> LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1857060yQS)) {
            return false;
        }
        C1857060yQS c1857060yQS = (C1857060yQS) obj;
        return Intrinsics.LJFF(this.LL, c1857060yQS.LL) && this.LLILLJJLI == c1857060yQS.LLILLJJLI && this.LLILLL == c1857060yQS.LLILLL && Intrinsics.LJFF(this.LLILZ, c1857060yQS.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        Message message = this.LL;
        int iHashCode = (((((message == null ? 0 : message.hashCode()) * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31;
        Function0<Unit> function0 = this.LLILZ;
        return iHashCode + (function0 != null ? function0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAnswerBubbleRetryItem(message=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", plainTextResourceId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", interactiveTextResourceId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", retryCallback=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1857070yQT) {
            if (areItemTheSame(interfaceC1891350zJl)) {
                C1857070yQT c1857070yQT = (C1857070yQT) interfaceC1891350zJl;
                if (this.LLILLJJLI == c1857070yQT.LLILLJJLI && this.LLILLL == c1857070yQT.LLILLL) {
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
        String str;
        if (interfaceC1891350zJl instanceof C1857070yQT) {
            Message message = this.LL;
            String str2 = null;
            if (message != null) {
                str = message.uuid;
            } else {
                str = null;
            }
            Message message2 = ((C1857070yQT) interfaceC1891350zJl).LL;
            if (message2 != null) {
                str2 = message2.uuid;
            }
            return Intrinsics.LJFF(str, str2);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1857060yQS(Message message, int i, int i2, Function0<Unit> function0) {
        this.LL = message;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = function0;
    }
}
