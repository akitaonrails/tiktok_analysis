package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R31, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R31 extends C1858660yT2 implements InterfaceC1891350zJl, InterfaceC1859540yUS, InterfaceC689340R2e, InterfaceC689370R2h {
    public final C326880Cre LLJJIJI;
    public final boolean LLJJIJIIJIL;
    public final Integer LLJJIJIL;
    public final String LLJJJ;
    public final String LLJJJIL;
    public final String LLJJJJ;
    public final String LLJJJJJIL;
    public final TakoUserItem LLJJJJLIIL;

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
        if (!(obj instanceof C0R31)) {
            return false;
        }
        C0R31 c0r31 = (C0R31) obj;
        return Intrinsics.LJFF(this.LLJJIJI, c0r31.LLJJIJI) && this.LLJJIJIIJIL == c0r31.LLJJIJIIJIL && Intrinsics.LJFF(this.LLJJIJIL, c0r31.LLJJIJIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LLJJIJI.hashCode() * 31) + C786410Ut5.Z2(this.LLJJIJIIJIL)) * 31;
        Integer num = this.LLJJIJIL;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAnswerUserItem(message=");
        sbLIZ.append(this.LLJJIJI);
        sbLIZ.append(", listStyle=");
        sbLIZ.append(this.LLJJIJIIJIL);
        sbLIZ.append(", bindIndex=");
        sbLIZ.append(this.LLJJIJIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1859540yUS
    public final String LIZIZ() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC689340R2e
    public final String LJ() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1859540yUS
    public final String LJIJJLI() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC689340R2e
    public final Integer LJZL() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1859540yUS
    public final String getText() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC689340R2e
    public final TakoUserItem getUser() {
        return this.LLJJJJLIIL;
    }

    public C0R31(C326880Cre c326880Cre) {
        String str;
        String str2;
        String str3;
        List<TakoUserItem> list;
        super(c326880Cre);
        this.LLJJIJI = c326880Cre;
        this.LLJJIJIIJIL = false;
        TakoUserItem takoUserItem = null;
        this.LLJJIJIL = null;
        TakoMixFeed takoMixFeed = this.LLILZLL;
        if (takoMixFeed != null) {
            str = takoMixFeed.text;
        } else {
            str = null;
        }
        this.LLJJJ = str;
        if (takoMixFeed != null) {
            str2 = takoMixFeed.hint;
        } else {
            str2 = null;
        }
        this.LLJJJIL = str2;
        if (takoMixFeed != null) {
            str3 = takoMixFeed.hintInText;
        } else {
            str3 = null;
        }
        this.LLJJJJ = str3;
        this.LLJJJJJIL = c326880Cre.LLILLL.msgId;
        if (takoMixFeed != null && (list = takoMixFeed.userList) != null) {
            takoUserItem = (TakoUserItem) C13LP.LJJJLL(list);
        }
        this.LLJJJJLIIL = takoUserItem;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0R31) {
            if (areItemTheSame(interfaceC1891350zJl)) {
                C0R31 c0r31 = (C0R31) interfaceC1891350zJl;
                if (Intrinsics.LJFF(this.LLJJJ, c0r31.LLJJJ) && Intrinsics.LJFF(this.LLJJJJLIIL, c0r31.LLJJJJLIIL)) {
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
