package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentMixFeed;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cj6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321580Cj6 extends C321590Cj7 implements InterfaceC1891350zJl, C0DIA {
    public final C321490Cix LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;

    @Override // X.C0DIA
    public final Map<String, Object> LJIIZILJ() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C321580Cj6) && Intrinsics.LJFF(this.LLILZLL, ((C321580Cj6) obj).LLILZLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceAgentSendTextItem(message=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0DIA
    public final String LIZIZ() {
        return this.LLIZLLLIL;
    }

    @Override // X.C0DIA
    public final String LJIJJLI() {
        return this.LLJ;
    }

    @Override // X.C321590Cj7, X.C0DIA
    public final String getText() {
        return this.LLIZ;
    }

    public C321580Cj6(C321490Cix c321490Cix) {
        String str;
        String str2;
        super(c321490Cix);
        this.LLILZLL = c321490Cix;
        CommerceAgentMixFeed commerceAgentMixFeed = this.LLILLL;
        if (commerceAgentMixFeed != null) {
            str = commerceAgentMixFeed.text;
        } else {
            str = null;
        }
        this.LLIZ = str;
        if (commerceAgentMixFeed != null) {
            str2 = commerceAgentMixFeed.hint;
        } else {
            str2 = null;
        }
        this.LLIZLLLIL = str2;
        this.LLJ = commerceAgentMixFeed != null ? commerceAgentMixFeed.hintInText : null;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C321580Cj6) {
            if (areItemTheSame(interfaceC1891350zJl)) {
                C321580Cj6 c321580Cj6 = (C321580Cj6) interfaceC1891350zJl;
                if (Intrinsics.LJFF(this.LLIZ, c321580Cj6.LLIZ) && this.LLILZIL == c321580Cj6.LLILZIL) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C321580Cj6) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C321590Cj7) interfaceC1891350zJl).LLILLJJLI);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
