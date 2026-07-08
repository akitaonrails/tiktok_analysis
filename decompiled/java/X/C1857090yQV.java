package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yQV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857090yQV extends C1858660yT2 implements InterfaceC1891350zJl, InterfaceC1859540yUS {
    public final C326880Cre LLJJIJI;
    public final String LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final String LLJJJ;

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
        return (obj instanceof C1857090yQV) && Intrinsics.LJFF(this.LLJJIJI, ((C1857090yQV) obj).LLJJIJI);
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
        sbLIZ.append("TakoUserLandingItem(message=");
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

    @Override // X.InterfaceC1859540yUS
    public final String getText() {
        return this.LLJJIJIIJIL;
    }

    public C1857090yQV(C326880Cre c326880Cre) {
        String str;
        String str2;
        Map<String, String> map;
        super(c326880Cre);
        this.LLJJIJI = c326880Cre;
        TakoMixFeed takoMixFeed = this.LLILZLL;
        if (takoMixFeed != null && (map = takoMixFeed.msgExt) != null) {
            str = map.get("user_guide");
        } else {
            str = null;
        }
        this.LLJJIJIIJIL = str;
        TakoMixFeed takoMixFeed2 = this.LLILZLL;
        if (takoMixFeed2 != null) {
            str2 = takoMixFeed2.hint;
        } else {
            str2 = null;
        }
        this.LLJJIJIL = str2;
        this.LLJJJ = takoMixFeed2 != null ? takoMixFeed2.hintInText : null;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1857090yQV) {
            if (areItemTheSame(interfaceC1891350zJl) && Intrinsics.LJFF(this.LLJJIJIIJIL, ((C1857090yQV) interfaceC1891350zJl).LLJJIJIIJIL)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1857090yQV) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C1858660yT2) interfaceC1891350zJl).LLILLJJLI);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
