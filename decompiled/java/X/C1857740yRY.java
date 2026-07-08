package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoClientExt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yRY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857740yRY extends C1858660yT2 implements InterfaceC1891350zJl, InterfaceC1859540yUS, InterfaceC1845490y7n {
    public final C326880Cre LLJJIJI;
    public final String LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final String LLJJJ;
    public final List<BaseImage> LLJJJIL;
    public final boolean LLJJJJ;

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
        return (obj instanceof C1857740yRY) && Intrinsics.LJFF(this.LLJJIJI, ((C1857740yRY) obj).LLJJIJI);
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
        sbLIZ.append("TakoAnswerShortcutItem(message=");
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

    @Override // X.InterfaceC1845490y7n
    public final boolean LJJJLIIL() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC1845490y7n
    public final List<BaseImage> LLJJJJLIIL() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1859540yUS
    public final String getText() {
        return this.LLJJIJIIJIL;
    }

    public C1857740yRY(C326880Cre c326880Cre) {
        String str;
        String str2;
        String str3;
        TakoClientExt takoClientExt;
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
        this.LLJJJIL = takoMixFeed != null ? takoMixFeed.images : null;
        boolean z = false;
        if (takoMixFeed != null && (takoClientExt = takoMixFeed.clientExt) != null && takoClientExt.shortcutInteractionEanble) {
            z = true;
        }
        this.LLJJJJ = z;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1857740yRY) {
            if (areItemTheSame(interfaceC1891350zJl)) {
                C1857740yRY c1857740yRY = (C1857740yRY) interfaceC1891350zJl;
                if (Intrinsics.LJFF(this.LLJJIJIIJIL, c1857740yRY.LLJJIJIIJIL) && this.LLJJJJ == c1857740yRY.LLJJJJ) {
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
        if (interfaceC1891350zJl instanceof C1858660yT2) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C1858660yT2) interfaceC1891350zJl).LLILLJJLI);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
