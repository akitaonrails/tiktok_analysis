package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSourceItem;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R3X, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R3X extends C1858660yT2 implements InterfaceC1891350zJl, InterfaceC1859540yUS, C0R3Y {
    public final C326880Cre LLJJIJI;
    public final String LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final String LLJJJ;
    public final Map<String, TakoPlaceholderSource> LLJJJIL;
    public final List<TakoSourceItem> LLJJJJ;

    @Override // X.InterfaceC1859540yUS
    public final boolean LLIIJI() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0R3X) && Intrinsics.LJFF(this.LLJJIJI, ((C0R3X) obj).LLJJIJI);
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
        sbLIZ.append("TakoAnswerMixItem(message=");
        sbLIZ.append(this.LLJJIJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1859540yUS
    public final String LIZIZ() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1859540yUS
    public final Map<String, TakoPlaceholderSource> LJIIZILJ() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1859540yUS
    public final String LJIJJLI() {
        return this.LLJJJ;
    }

    @Override // X.C0R3Y
    public final List<TakoSourceItem> LLILZIL() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC1859540yUS
    public final String getText() {
        return this.LLJJIJIIJIL;
    }

    public C0R3X(C326880Cre c326880Cre) {
        String str;
        String str2;
        String str3;
        Map<String, TakoPlaceholderSource> map;
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
        if (takoMixFeed != null) {
            map = takoMixFeed.placeholderSources;
        } else {
            map = null;
        }
        this.LLJJJIL = map;
        this.LLJJJJ = takoMixFeed != null ? takoMixFeed.sources : null;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0R3X) {
            if (areItemTheSame(interfaceC1891350zJl)) {
                C0R3X c0r3x = (C0R3X) interfaceC1891350zJl;
                if (Intrinsics.LJFF(this.LLJJIJIIJIL, c0r3x.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJ, c0r3x.LLJJ) && Intrinsics.LJFF(this.LLJILJIL, c0r3x.LLJILJIL)) {
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
