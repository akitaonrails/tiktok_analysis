package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoEnhancedItemInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R3A, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R3A extends C1858660yT2 implements InterfaceC1891350zJl, InterfaceC1859540yUS, InterfaceC689490R2t {
    public final String LLJJIJI;
    public final String LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final List<TakoVideoItem> LLJJJ;
    public final boolean LLJJJIL;
    public final boolean LLJJJJ;
    public final Message LLJJJJJIL;

    @Override // X.InterfaceC689490R2t
    public final String LJIIIIZZ() {
        return null;
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

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC689490R2t
    public final Function2<View, InterfaceC665370Q7z, Unit> LJJ() {
        return AFwS293S0000000_10.get$arr$(56);
    }

    @Override // X.InterfaceC1859540yUS
    public final String LIZIZ() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC689490R2t
    public final boolean LJIILIIL() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1859540yUS
    public final String LJIJJLI() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC689490R2t
    public final boolean LLJZIJLIL() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC689490R2t
    public final Message getMsg() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1859540yUS
    public final String getText() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC689490R2t
    public final List<TakoVideoItem> getVideoList() {
        return this.LLJJJ;
    }

    public C0R3A(C326880Cre c326880Cre) {
        String str;
        String str2;
        String str3;
        TakoEnhancedItemInfo takoEnhancedItemInfo;
        TakoEnhancedItemInfo takoEnhancedItemInfo2;
        super(c326880Cre);
        TakoMixFeed takoMixFeed = this.LLILZLL;
        List<TakoVideoItem> list = null;
        if (takoMixFeed != null) {
            str = takoMixFeed.text;
        } else {
            str = null;
        }
        this.LLJJIJI = str;
        if (takoMixFeed != null) {
            str2 = takoMixFeed.hint;
        } else {
            str2 = null;
        }
        this.LLJJIJIIJIL = str2;
        if (takoMixFeed != null) {
            str3 = takoMixFeed.hintInText;
        } else {
            str3 = null;
        }
        this.LLJJIJIL = str3;
        if (takoMixFeed != null && (takoEnhancedItemInfo2 = takoMixFeed.enhancedVideoItemInfo) != null) {
            list = takoEnhancedItemInfo2.videoList;
        }
        this.LLJJJ = list;
        this.LLJJJIL = true;
        this.LLJJJJ = (takoMixFeed == null || (takoEnhancedItemInfo = takoMixFeed.enhancedVideoItemInfo) == null || !takoEnhancedItemInfo.hasMore) ? false : true;
        this.LLJJJJJIL = c326880Cre.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0R3A) {
            C0R3A c0r3a = (C0R3A) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c0r3a.LLJJIJI, this.LLJJIJI) && Intrinsics.LJFF(c0r3a.LLJJJ, this.LLJJJ)) {
                return true;
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
