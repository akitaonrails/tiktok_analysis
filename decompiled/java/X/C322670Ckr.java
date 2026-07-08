package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ckr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C322670Ckr implements InterfaceC1891350zJl, InterfaceC321360Cik {
    public final Message LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C322670Ckr)) {
            return false;
        }
        C322670Ckr c322670Ckr = (C322670Ckr) obj;
        return Intrinsics.LJFF(this.LL, c322670Ckr.LL) && this.LLILLJJLI == c322670Ckr.LLILLJJLI && this.LLILLL == c322670Ckr.LLILLL;
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
        sbLIZ.append("CommerceAgentAnswerRetryItem(message=");
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
        if (interfaceC1891350zJl instanceof C322670Ckr) {
            if (areItemTheSame(interfaceC1891350zJl)) {
                C322670Ckr c322670Ckr = (C322670Ckr) interfaceC1891350zJl;
                if (this.LLILLJJLI == c322670Ckr.LLILLJJLI && this.LLILLL == c322670Ckr.LLILLL) {
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
        if (interfaceC1891350zJl instanceof C322670Ckr) {
            Message message = this.LL;
            String str2 = null;
            if (message != null) {
                str = message.uuid;
            } else {
                str = null;
            }
            Message message2 = ((C322670Ckr) interfaceC1891350zJl).LL;
            if (message2 != null) {
                str2 = message2.uuid;
            }
            return Intrinsics.LJFF(str, str2);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C322670Ckr(Message message, int i, int i2) {
        this.LL = message;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }
}
