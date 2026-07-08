package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R38, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R38 extends C1858660yT2 implements InterfaceC1859540yUS, InterfaceC1891350zJl {
    public final C326880Cre LLJJIJI;
    public final String LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public final Message LLJJJ;
    public final String LLJJJIL;
    public final String LLJJJJ;
    public final String LLJJJJJIL;

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
        if (!(obj instanceof C0R38)) {
            return false;
        }
        C0R38 c0r38 = (C0R38) obj;
        return Intrinsics.LJFF(this.LLJJIJI, c0r38.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c0r38.LLJJIJIIJIL) && this.LLJJIJIL == c0r38.LLJJIJIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LLJJIJI.hashCode() * 31) + this.LLJJIJIIJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJIJIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoWelcomeItem(serverMsg=");
        sbLIZ.append(this.LLJJIJI);
        sbLIZ.append(", welcomeText=");
        sbLIZ.append(this.LLJJIJIIJIL);
        sbLIZ.append(", isLast=");
        sbLIZ.append(this.LLJJIJIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1859540yUS
    public final String LIZIZ() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC1859540yUS
    public final String LJIJJLI() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1859540yUS
    public final String getText() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0R38) {
            if (areItemTheSame(interfaceC1891350zJl)) {
                C0R38 c0r38 = (C0R38) interfaceC1891350zJl;
                if (Intrinsics.LJFF(this.LLJJIJIIJIL, c0r38.LLJJIJIIJIL) && this.LLJJIJIL == c0r38.LLJJIJIL) {
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
        if (interfaceC1891350zJl instanceof C0R38) {
            return Intrinsics.LJFF(this.LLJJJ.uuid, ((C0R38) interfaceC1891350zJl).LLJJJ.uuid);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C0R38(C326880Cre c326880Cre, String str) {
        String str2;
        String str3;
        super(c326880Cre);
        this.LLJJIJI = c326880Cre;
        this.LLJJIJIIJIL = str;
        this.LLJJIJIL = true;
        this.LLJJJ = c326880Cre.LLILLL;
        TakoMixFeed takoMixFeed = this.LLILZLL;
        if (takoMixFeed != null) {
            str2 = takoMixFeed.text;
        } else {
            str2 = null;
        }
        this.LLJJJIL = str2;
        if (takoMixFeed != null) {
            str3 = takoMixFeed.hint;
        } else {
            str3 = null;
        }
        this.LLJJJJ = str3;
        this.LLJJJJJIL = takoMixFeed != null ? takoMixFeed.hintInText : null;
    }
}
