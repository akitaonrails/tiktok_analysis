package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoDisclaimerInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yRV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857710yRV implements InterfaceC1891350zJl, InterfaceC1857720yRW {
    public final C326880Cre LL;
    public final String LLILLJJLI;
    public final TakoDisclaimerInfo LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1857710yRV) && Intrinsics.LJFF(this.LL, ((C1857710yRV) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAnswerImageDisclaimerItem(anchorMessage=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1857730yRX
    public final C326880Cre LLIIJLIL() {
        return this.LL;
    }

    @Override // X.InterfaceC1857720yRW
    public final TakoDisclaimerInfo LLJZ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1857720yRW
    public final String getMessageId() {
        return this.LLILLJJLI;
    }

    public C1857710yRV(C326880Cre c326880Cre) {
        TakoDisclaimerInfo takoDisclaimerInfo;
        this.LL = c326880Cre;
        Message message = c326880Cre.LLILLL;
        this.LLILLJJLI = message.uuid;
        TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
        if (takoMixFeedLJIIIZ != null) {
            takoDisclaimerInfo = takoMixFeedLJIIIZ.disclaimer;
        } else {
            takoDisclaimerInfo = null;
        }
        this.LLILLL = takoDisclaimerInfo;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1857710yRV) {
            if (areItemTheSame(interfaceC1891350zJl) && Intrinsics.LJFF(this.LLILLL, ((C1857710yRV) interfaceC1891350zJl).LLILLL)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof InterfaceC1857720yRW) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((InterfaceC1857720yRW) interfaceC1891350zJl).getMessageId());
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
