package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPassExt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoProductInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSearchInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSourceItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yTG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858800yTG extends C1858660yT2 implements InterfaceC1891350zJl, InterfaceC1859540yUS, InterfaceC689490R2t, InterfaceC1857900yRo, C0R3Y {
    public final C326880Cre LLJJIJI;
    public final String LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final String LLJJJ;
    public final List<TakoVideoItem> LLJJJIL;
    public final List<TakoSourceItem> LLJJJJ;
    public final TakoProductInfo LLJJJJJIL;
    public final String LLJJJJLIIL;
    public final boolean LLJJL;

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

    @Override // X.InterfaceC1857900yRo
    public final boolean LJJLJ() {
        return false;
    }

    @Override // X.InterfaceC1857900yRo
    public final Integer LJLZ() {
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
        return (obj instanceof C1858800yTG) && Intrinsics.LJFF(this.LLJJIJI, ((C1858800yTG) obj).LLJJIJI);
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
        sbLIZ.append("TakoAnswerReferenceItem(message=");
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
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1859540yUS
    public final String LJIJJLI() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1857900yRo
    public final String LJJL() {
        return this.LLJJJJLIIL;
    }

    @Override // X.C0R3Y
    public final List<TakoSourceItem> LLILZIL() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC1857900yRo
    public final boolean LLJL() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC1857900yRo
    public final TakoProductInfo getProductInfo() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1859540yUS
    public final String getText() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC689490R2t
    public final List<TakoVideoItem> getVideoList() {
        return this.LLJJJIL;
    }

    public C1858800yTG(C326880Cre c326880Cre) {
        String str;
        String str2;
        String str3;
        List<TakoVideoItem> list;
        List<TakoSourceItem> list2;
        TakoProductInfo takoProductInfo;
        TakoPassExt takoPassExt;
        TakoSearchInfo takoSearchInfo;
        super(c326880Cre);
        this.LLJJIJI = c326880Cre;
        TakoMixFeed takoMixFeed = this.LLILZLL;
        String str4 = null;
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
            list = takoMixFeed.videoList;
        } else {
            list = null;
        }
        this.LLJJJIL = list;
        if (takoMixFeed != null) {
            list2 = takoMixFeed.sources;
        } else {
            list2 = null;
        }
        this.LLJJJJ = list2;
        if (takoMixFeed != null) {
            takoProductInfo = takoMixFeed.products;
        } else {
            takoProductInfo = null;
        }
        this.LLJJJJJIL = takoProductInfo;
        if (takoMixFeed != null && (takoSearchInfo = takoMixFeed.searchInfo) != null) {
            str4 = takoSearchInfo.query;
        }
        this.LLJJJJLIIL = str4;
        boolean z = false;
        if (takoMixFeed != null && (takoPassExt = takoMixFeed.ext) != null && takoPassExt.isQuoteProduct == 1) {
            z = true;
        }
        this.LLJJL = z;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1858800yTG) {
            if (areItemTheSame(interfaceC1891350zJl)) {
                C1858800yTG c1858800yTG = (C1858800yTG) interfaceC1891350zJl;
                if (Intrinsics.LJFF(this.LLJJIJIIJIL, c1858800yTG.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJJJ, c1858800yTG.LLJJJJ) && Intrinsics.LJFF(this.LLJJ, c1858800yTG.LLJJ) && Intrinsics.LJFF(this.LLJILJIL, c1858800yTG.LLJILJIL)) {
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
