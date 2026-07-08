package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BotMarketInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ImageAction;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoLinkItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPassExt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoProductInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yTJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858830yTJ extends C1858660yT2 implements C14NM, InterfaceC1859540yUS, InterfaceC689400R2k, InterfaceC689340R2e, InterfaceC689490R2t, InterfaceC1857900yRo, InterfaceC1857890yRn, InterfaceC1856750yPx, InterfaceC21266318Kf, C0H5X {
    public final C326880Cre LLJJIJI;
    public final boolean LLJJIJIIJIL;
    public final Integer LLJJIJIL;
    public final String LLJJJ;
    public final String LLJJJIL;
    public final String LLJJJJ;
    public final String LLJJJJJIL;
    public final TakoUserItem LLJJJJLIIL;
    public final List<TakoVideoItem> LLJJL;
    public final List<TakoUserItem> LLJJLIIIJLLLLLLLZ;
    public final TakoProductInfo LLJL;
    public final String LLJLIL;
    public final boolean LLJLILLLLZIIL;
    public final boolean LLJLL;
    public final List<TakoLinkItem> LLJLLIL;
    public final String LLJLLL;
    public final String LLJZ;
    public final long LLJZIJLIL;
    public final long LLL;
    public final String LLLF;
    public final List<BaseImage> LLLFF;
    public final boolean LLLFFI;
    public final boolean LLLFZ;
    public final float LLLI;
    public final int LLLII;
    public final long LLLIIII;
    public final String LLLIIIIL;
    public final String LLLIIIL;
    public final Map<String, Object> LLLIIL;
    public final boolean LLLIILIL;
    public final BotMarketInfo LLLIL;
    public final String LLLILZ;

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

    @Override // X.InterfaceC1857890yRn
    public final Integer LJJJ() {
        return null;
    }

    @Override // X.InterfaceC689490R2t
    public final C1861010yWp LJJLIIIJ() {
        return null;
    }

    @Override // X.InterfaceC1857900yRo
    public final Integer LJLZ() {
        return null;
    }

    @Override // X.InterfaceC1856750yPx
    public final List<ImageAction> LJZ() {
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
        if (!(obj instanceof C1858830yTJ)) {
            return false;
        }
        C1858830yTJ c1858830yTJ = (C1858830yTJ) obj;
        return Intrinsics.LJFF(this.LLJJIJI, c1858830yTJ.LLJJIJI) && this.LLJJIJIIJIL == c1858830yTJ.LLJJIJIIJIL && Intrinsics.LJFF(this.LLJJIJIL, c1858830yTJ.LLJJIJIL);
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
        int iHashCode = ((this.LLJJIJI.hashCode() * 31) + C786410Ut5.Z2(this.LLJJIJIIJIL)) * 31;
        Integer num = this.LLJJIJIL;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAnswerNimbleCardItem(message=");
        sbLIZ.append(this.LLJJIJI);
        sbLIZ.append(", listStyle=");
        sbLIZ.append(this.LLJJIJIIJIL);
        sbLIZ.append(", bindIndex=");
        sbLIZ.append(this.LLJJIJIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC689490R2t
    public final Function2<View, InterfaceC665370Q7z, Unit> LJJ() {
        return new AwS641S0100000_27(this, 7);
    }

    @Override // X.InterfaceC1856750yPx
    public final List<String> LLJJL() {
        return C1855920yOc.LIZ(this.LLJJIJI.LLILLL);
    }

    @Override // X.C14NM
    public final int getContentType() {
        String str;
        TakoPassExt takoPassExt;
        C20039913b3 c20039913b3 = C20039913b3.LIZ;
        TakoMixFeed takoMixFeedLJIIIZ = this.LLJJIJI.LLILLL.LJIIIZ();
        int i = takoMixFeedLJIIIZ != null ? takoMixFeedLJIIIZ.cardType : 0;
        TakoMixFeed takoMixFeedLJIIIZ2 = this.LLJJIJI.LLILLL.LJIIIZ();
        if (takoMixFeedLJIIIZ2 == null || (takoPassExt = takoMixFeedLJIIIZ2.ext) == null || (str = takoPassExt.pluginType) == null) {
            str = "";
        }
        c20039913b3.getClass();
        return C20039913b3.LIZ(i, str);
    }

    @Override // X.InterfaceC1859540yUS
    public final String LIZIZ() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC689340R2e
    public final String LJ() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC21266318Kf, X.C14SX
    public final Map<String, Object> LJI() {
        return this.LLLIIL;
    }

    @Override // X.InterfaceC1859540yUS
    public final String LJIJJLI() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC1856750yPx
    public final String LJJIJLIJ() {
        return this.LLLF;
    }

    @Override // X.InterfaceC1857890yRn
    public final List<TakoUserItem> LJJJJI() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC1856750yPx
    public final float LJJJJLI() {
        return this.LLLI;
    }

    @Override // X.InterfaceC1856750yPx
    public final int LJJJLZIJ() {
        return this.LLLII;
    }

    @Override // X.InterfaceC1857900yRo
    public final String LJJL() {
        return this.LLJLIL;
    }

    @Override // X.InterfaceC1857900yRo
    public final boolean LJJLJ() {
        return this.LLJLL;
    }

    @Override // X.InterfaceC21266318Kf
    public final boolean LJJZZIII() {
        return this.LLLIILIL;
    }

    @Override // X.C0H5X
    public final String LJLIIIL() {
        return this.LLLILZ;
    }

    @Override // X.InterfaceC1856750yPx
    public final boolean LJLL() {
        return this.LLLFFI;
    }

    @Override // X.C0H5X
    public final BotMarketInfo LJLLLL() {
        return this.LLLIL;
    }

    @Override // X.InterfaceC689340R2e
    public final Integer LJZL() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1856750yPx
    public final boolean LL() {
        return this.LLLFZ;
    }

    @Override // X.InterfaceC689400R2k
    public final List<TakoLinkItem> LLFFF() {
        return this.LLJLLIL;
    }

    @Override // X.InterfaceC689400R2k
    public final String LLFII() {
        return this.LLJZ;
    }

    @Override // X.InterfaceC1856750yPx
    public final long LLIZ() {
        return this.LLLIIII;
    }

    @Override // X.InterfaceC689400R2k
    public final long LLJJ() {
        return this.LLL;
    }

    @Override // X.InterfaceC689400R2k
    public final long LLJJJJJIL() {
        return this.LLJZIJLIL;
    }

    @Override // X.InterfaceC1857900yRo
    public final boolean LLJL() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC1856750yPx
    public final List<BaseImage> getImageData() {
        return this.LLLFF;
    }

    @Override // X.InterfaceC689400R2k
    public final String getMessageId() {
        return this.LLJLLL;
    }

    @Override // X.InterfaceC1857900yRo
    public final TakoProductInfo getProductInfo() {
        return this.LLJL;
    }

    @Override // X.InterfaceC21266318Kf, X.C14SX
    public final String getRawData() {
        return this.LLLIIIL;
    }

    @Override // X.InterfaceC21266318Kf, X.C14SX
    public final String getSchema() {
        return this.LLLIIIIL;
    }

    @Override // X.InterfaceC1859540yUS
    public final String getText() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC689340R2e
    public final TakoUserItem getUser() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC689490R2t
    public final List<TakoVideoItem> getVideoList() {
        return this.LLJJL;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1858830yTJ(X.C326880Cre r11) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1858830yTJ.<init>(X.0Cre):void");
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1858830yTJ) {
            if (areItemTheSame(interfaceC1891350zJl)) {
                C1858830yTJ c1858830yTJ = (C1858830yTJ) interfaceC1891350zJl;
                if (Intrinsics.LJFF(this.LLJJJ, c1858830yTJ.LLJJJ) && Intrinsics.LJFF(this.LLJJJJLIIL, c1858830yTJ.LLJJJJLIIL)) {
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
