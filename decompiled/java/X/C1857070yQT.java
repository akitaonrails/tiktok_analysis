package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yQT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857070yQT implements InterfaceC1891350zJl, InterfaceC689540R2y {
    public final Message LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1857070yQT)) {
            return false;
        }
        C1857070yQT c1857070yQT = (C1857070yQT) obj;
        return Intrinsics.LJFF(this.LL, c1857070yQT.LL) && this.LLILLJJLI == c1857070yQT.LLILLJJLI && this.LLILLL == c1857070yQT.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        Message message = this.LL;
        return ((((message == null ? 0 : message.hashCode()) * 31) + this.LLILLJJLI) * 31) + this.LLILLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAnswerRetryItem(message=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", plainTextResourceId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", interactiveTextResourceId=");
        sbLIZ.append(this.LLILLL);
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

    public C1857070yQT(Message message, int i, int i2) {
        this.LL = message;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }
}
