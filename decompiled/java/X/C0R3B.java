package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoLinkItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R3B, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R3B extends C1858660yT2 implements InterfaceC1891350zJl, InterfaceC1859540yUS, InterfaceC689400R2k, InterfaceC689490R2t {
    public final C326880Cre LLJJIJI;
    public final String LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final long LLJJJ;
    public final long LLJJJIL;
    public final String LLJJJJ;
    public final String LLJJJJJIL;
    public final String LLJJJJLIIL;
    public final List<TakoLinkItem> LLJJL;
    public final List<TakoVideoItem> LLJJLIIIJLLLLLLLZ;

    @Override // X.InterfaceC689490R2t
    public final String LJIIIIZZ() {
        return null;
    }

    @Override // X.InterfaceC689490R2t
    public final boolean LJIILIIL() {
        return true;
    }

    @Override // X.InterfaceC1859540yUS
    public final Map<String, TakoPlaceholderSource> LJIIZILJ() {
        return null;
    }

    @Override // X.InterfaceC689490R2t
    public final C689590R3d LJJIJL() {
        return null;
    }

    @Override // X.InterfaceC689490R2t
    public final C1861010yWp LJJLIIIJ() {
        return null;
    }

    @Override // X.InterfaceC1859540yUS
    public final boolean LLIIJI() {
        return false;
    }

    @Override // X.InterfaceC689490R2t
    public final Integer LLJI() {
        return null;
    }

    @Override // X.InterfaceC689490R2t
    public final boolean LLJZIJLIL() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0R3B) && Intrinsics.LJFF(this.LLJJIJI, ((C0R3B) obj).LLJJIJI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC689490R2t
    public final Message getMsg() {
        return null;
    }

    public final int hashCode() {
        return this.LLJJIJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAnswerBingItem(message=");
        sbLIZ.append(this.LLJJIJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC689490R2t
    public final Function2<View, InterfaceC665370Q7z, Unit> LJJ() {
        return AFwS293S0000000_10.get$arr$(56);
    }

    @Override // X.InterfaceC1859540yUS
    public final String LIZIZ() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1859540yUS
    public final String LJIJJLI() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC689400R2k
    public final List<TakoLinkItem> LLFFF() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC689400R2k
    public final String LLFII() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC689400R2k
    public final long LLJJ() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC689400R2k
    public final long LLJJJJJIL() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC689400R2k
    public final String getMessageId() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC1859540yUS
    public final String getText() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC689490R2t
    public final List<TakoVideoItem> getVideoList() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public C0R3B(C326880Cre c326880Cre) {
        String str;
        String str2;
        String str3;
        List<TakoLinkItem> list;
        super(c326880Cre);
        this.LLJJIJI = c326880Cre;
        this.LLJJIJIIJIL = this.LLILLJJLI;
        this.LLJJIJIL = this.LLILLL;
        this.LLJJJ = this.LLILZ;
        this.LLJJJIL = this.LLILZIL;
        TakoMixFeed takoMixFeed = this.LLILZLL;
        if (takoMixFeed != null) {
            str = takoMixFeed.text;
        } else {
            str = null;
        }
        this.LLJJJJ = str;
        if (takoMixFeed != null) {
            str2 = takoMixFeed.hint;
        } else {
            str2 = null;
        }
        this.LLJJJJJIL = str2;
        if (takoMixFeed != null) {
            str3 = takoMixFeed.hintInText;
        } else {
            str3 = null;
        }
        this.LLJJJJLIIL = str3;
        if (takoMixFeed != null) {
            list = takoMixFeed.linkList;
        } else {
            list = null;
        }
        this.LLJJL = list;
        this.LLJJLIIIJLLLLLLLZ = takoMixFeed != null ? takoMixFeed.videoList : null;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0R3B) {
            if (areItemTheSame(interfaceC1891350zJl)) {
                C0R3B c0r3b = (C0R3B) interfaceC1891350zJl;
                if (Intrinsics.LJFF(this.LLJJJJ, c0r3b.LLJJJJ) && Intrinsics.LJFF(this.LLJJL, c0r3b.LLJJL)) {
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
