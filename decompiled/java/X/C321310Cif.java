package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentMixFeed;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cif, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321310Cif extends C321330Cih implements InterfaceC1891350zJl, C0DIA {
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
        return (obj instanceof C321310Cif) && Intrinsics.LJFF(this.LLILZLL, ((C321310Cif) obj).LLILZLL);
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
        sbLIZ.append("CommerceAgentDefaultAnswerItem(message=");
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

    @Override // X.C0DIA
    public final String getText() {
        return this.LLIZ;
    }

    public C321310Cif(C321490Cix c321490Cix) {
        String str;
        super(c321490Cix);
        this.LLILZLL = c321490Cix;
        this.LLIZ = C321320Cig.LIZ.getString(2131835748);
        CommerceAgentMixFeed commerceAgentMixFeed = this.LLILLL;
        if (commerceAgentMixFeed != null) {
            str = commerceAgentMixFeed.hint;
        } else {
            str = null;
        }
        this.LLIZLLLIL = str;
        this.LLJ = commerceAgentMixFeed != null ? commerceAgentMixFeed.hintInText : null;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C321310Cif) {
            if (areItemTheSame(interfaceC1891350zJl) && Intrinsics.LJFF(this.LLIZ, ((C321310Cif) interfaceC1891350zJl).LLIZ)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C321310Cif) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C321330Cih) interfaceC1891350zJl).LLILLJJLI);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
