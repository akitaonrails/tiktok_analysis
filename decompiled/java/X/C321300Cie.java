package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentMixFeed;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentSug;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceLynxCard;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321300Cie extends C321330Cih implements InterfaceC1891350zJl, C0DIA {
    public final C321490Cix LLILZLL;
    public final String LLIZ;
    public final CommerceLynxCard LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;

    @Override // X.C0DIA
    public final Map<String, Object> LJIIZILJ() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C321300Cie) && Intrinsics.LJFF(this.LLILZLL, ((C321300Cie) obj).LLILZLL);
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
        sbLIZ.append("CommerceAgentAnswerTextItem(message=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0DIA
    public final String LIZIZ() {
        return this.LLJ;
    }

    @Override // X.C0DIA
    public final String LJIJJLI() {
        return this.LLJI;
    }

    @Override // X.C0DIA
    public final String getText() {
        return this.LLIZ;
    }

    public C321300Cie(C321490Cix c321490Cix) {
        String str;
        CommerceLynxCard commerceLynxCard;
        String str2;
        String str3;
        CommerceAgentSug commerceAgentSug;
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
            commerceLynxCard = commerceAgentMixFeed.commerceLynxCard;
        } else {
            commerceLynxCard = null;
        }
        this.LLIZLLLIL = commerceLynxCard;
        if (commerceAgentMixFeed != null) {
            str2 = commerceAgentMixFeed.hint;
        } else {
            str2 = null;
        }
        this.LLJ = str2;
        if (commerceAgentMixFeed != null) {
            str3 = commerceAgentMixFeed.hintInText;
        } else {
            str3 = null;
        }
        this.LLJI = str3;
        if (commerceAgentMixFeed != null && (commerceAgentSug = commerceAgentMixFeed.sug) != null) {
            new C321450Cit(null, commerceAgentSug, c321490Cix.LIZJ, 1);
        } else {
            new C321450Cit(null, new CommerceAgentSug(false, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, 0L, null, 0L, null, false, false, null, 0, 0L, false, null, false, null, null, 1073741823, null), null, 5);
        }
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C321300Cie) {
            if (areItemTheSame(interfaceC1891350zJl)) {
                C321300Cie c321300Cie = (C321300Cie) interfaceC1891350zJl;
                if (Intrinsics.LJFF(this.LLIZ, c321300Cie.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c321300Cie.LLIZLLLIL) && Intrinsics.LJFF(this.LLILZLL.LIZJ.LJIILIIL, c321300Cie.LLILZLL.LIZJ.LJIILIIL)) {
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
        if (interfaceC1891350zJl instanceof C321330Cih) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C321330Cih) interfaceC1891350zJl).LLILLJJLI);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
