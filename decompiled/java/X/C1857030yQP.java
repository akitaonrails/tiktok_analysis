package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoInteractionConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yQP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857030yQP extends C1858660yT2 implements InterfaceC1891350zJl, InterfaceC1859540yUS, InterfaceC1857870yRl, InterfaceC1857320yQs {
    public final C326880Cre LLJJIJI;
    public final String LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final String LLJJJ;
    public final C326960Crm LLJJJIL;
    public final String LLJJJJ;

    @Override // X.InterfaceC1859540yUS
    public final Map<String, TakoPlaceholderSource> LJIIZILJ() {
        return null;
    }

    @Override // X.InterfaceC1859540yUS
    public final boolean LLIIJI() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1857030yQP) && Intrinsics.LJFF(this.LLJJIJI, ((C1857030yQP) obj).LLJJIJI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LLJJIJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAnswerChatReplyItem(message=");
        sbLIZ.append(this.LLJJIJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1859540yUS
    public final String LIZIZ() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1859540yUS
    public final String LJIJJLI() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1857870yRl
    public final C326960Crm LJIL() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1857320yQs
    public final String LJJLIIIJJI() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC1859540yUS
    public final String getText() {
        return this.LLJJIJIIJIL;
    }

    public C1857030yQP(C326880Cre c326880Cre) {
        String str;
        String str2;
        String str3;
        C326960Crm c326960Crm;
        TakoSug takoSug;
        super(c326880Cre);
        this.LLJJIJI = c326880Cre;
        TakoMixFeed takoMixFeed = this.LLILZLL;
        if (takoMixFeed != null) {
            str = takoMixFeed.text;
        } else {
            str = null;
        }
        this.LLJJIJIIJIL = str;
        if (takoMixFeed != null) {
            str2 = takoMixFeed.hint;
        } else {
            str2 = null;
        }
        this.LLJJIJIL = str2;
        if (takoMixFeed != null) {
            str3 = takoMixFeed.hintInText;
        } else {
            str3 = null;
        }
        this.LLJJJ = str3;
        if (takoMixFeed != null && (takoSug = takoMixFeed.sug) != null) {
            c326960Crm = new C326960Crm(null, takoSug, c326880Cre.LLILLL, 1);
        } else {
            c326960Crm = new C326960Crm(null, new TakoSug(false, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, 0L, null, null, 0L, null, false, false, null, null, 0, 0L, false, null, false, false, false, false, false, null, null, -1, 31, null), null, 5);
        }
        this.LLJJJIL = c326960Crm;
        this.LLJJJJ = c326880Cre.LLILLL.replyUuid;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        List<TakoInteractionConfig> list;
        if (interfaceC1891350zJl instanceof C1857030yQP) {
            if (areItemTheSame(interfaceC1891350zJl)) {
                C1857030yQP c1857030yQP = (C1857030yQP) interfaceC1891350zJl;
                if (Intrinsics.LJFF(this.LLJJIJIIJIL, c1857030yQP.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJJJ, c1857030yQP.LLJJJJ)) {
                    TakoMixFeed takoMixFeed = this.LLILZLL;
                    List<TakoInteractionConfig> list2 = null;
                    if (takoMixFeed != null) {
                        list = takoMixFeed.interactionStatus;
                    } else {
                        list = null;
                    }
                    TakoMixFeed takoMixFeed2 = c1857030yQP.LLILZLL;
                    if (takoMixFeed2 != null) {
                        list2 = takoMixFeed2.interactionStatus;
                    }
                    if (Intrinsics.LJFF(list, list2)) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1858660yT2) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C1858660yT2) interfaceC1891350zJl).LLILLJJLI);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
