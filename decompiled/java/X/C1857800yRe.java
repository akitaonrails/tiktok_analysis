package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoInteractionConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoGenCard;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yRe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857800yRe extends C1858660yT2 implements InterfaceC1891350zJl, InterfaceC1859540yUS, InterfaceC1857870yRl, InterfaceC1004280cF0 {
    public final C326880Cre LLJJIJI;
    public final String LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final String LLJJJ;
    public final C326960Crm LLJJJIL;

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
        return (obj instanceof C1857800yRe) && Intrinsics.LJFF(this.LLJJIJI, ((C1857800yRe) obj).LLJJIJI);
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
        sbLIZ.append("TakoAnswerTextItem(message=");
        sbLIZ.append(this.LLJJIJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1004280cF0
    public final long LLILZ() {
        return this.LLJJIJI.LLILLL.serverTime;
    }

    @Override // X.InterfaceC1004280cF0
    public final String LLJILJILJ() {
        return this.LLJJIJI.LLILLL.uuid;
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

    @Override // X.InterfaceC1004280cF0
    public final TakoMixFeed LJJJJ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1859540yUS
    public final String getText() {
        return this.LLJJIJIIJIL;
    }

    public C1857800yRe(C326880Cre c326880Cre) {
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
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        List<TakoInteractionConfig> list;
        List<TakoInteractionConfig> list2;
        TakoVideoGenCard takoVideoGenCard;
        if (interfaceC1891350zJl instanceof C1857800yRe) {
            if (areItemTheSame(interfaceC1891350zJl)) {
                C1857800yRe c1857800yRe = (C1857800yRe) interfaceC1891350zJl;
                if (Intrinsics.LJFF(this.LLJJIJIIJIL, c1857800yRe.LLJJIJIIJIL)) {
                    TakoMixFeed takoMixFeed = this.LLILZLL;
                    TakoVideoGenCard takoVideoGenCard2 = null;
                    if (takoMixFeed != null) {
                        list = takoMixFeed.interactionStatus;
                    } else {
                        list = null;
                    }
                    TakoMixFeed takoMixFeed2 = c1857800yRe.LLILZLL;
                    if (takoMixFeed2 != null) {
                        list2 = takoMixFeed2.interactionStatus;
                    } else {
                        list2 = null;
                    }
                    if (Intrinsics.LJFF(list, list2)) {
                        TakoMixFeed takoMixFeed3 = this.LLILZLL;
                        if (takoMixFeed3 != null) {
                            takoVideoGenCard = takoMixFeed3.videoGenCard;
                        } else {
                            takoVideoGenCard = null;
                        }
                        TakoMixFeed takoMixFeed4 = c1857800yRe.LLILZLL;
                        if (takoMixFeed4 != null) {
                            takoVideoGenCard2 = takoMixFeed4.videoGenCard;
                        }
                        if (Intrinsics.LJFF(takoVideoGenCard, takoVideoGenCard2) && this.LLIZ == c1857800yRe.LLIZ) {
                            return true;
                        }
                        return false;
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
