package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BotMarketInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoLinkItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoLynx;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNimbleConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPassExt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSourceItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yTK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858840yTK extends C1858660yT2 implements C14NM, InterfaceC1857870yRl, C0H5X, InterfaceC1859540yUS, InterfaceC689490R2t, InterfaceC689400R2k, C0R3Y, InterfaceC21266318Kf {
    public final C326880Cre LLJJIJI;
    public final String LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final String LLJJJ;
    public final Map<String, Object> LLJJJIL;
    public final List<TakoVideoItem> LLJJJJ;
    public final List<TakoLinkItem> LLJJJJJIL;
    public final String LLJJJJLIIL;
    public final String LLJJL;
    public final long LLJJLIIIJLLLLLLLZ;
    public final long LLJL;
    public final C326960Crm LLJLIL;
    public final BotMarketInfo LLJLILLLLZIIL;
    public final String LLJLL;
    public final List<TakoSourceItem> LLJLLIL;
    public final String LLJLLL;
    public final String LLJZ;
    public final Map<String, Object> LLJZIJLIL;

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

    @Override // X.InterfaceC21266318Kf
    public final boolean LJJZZIII() {
        return false;
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
        return (obj instanceof C1858840yTK) && Intrinsics.LJFF(this.LLJJIJI, ((C1858840yTK) obj).LLJJIJI);
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
        sbLIZ.append("TakoAnswerFlexNimbleCardItem(message=");
        sbLIZ.append(this.LLJJIJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC689490R2t
    public final Function2<View, InterfaceC665370Q7z, Unit> LJJ() {
        return new AwS624S0100000_10(this, 97);
    }

    @Override // X.C14NM
    public final int getContentType() {
        String str;
        TakoNimbleConfig takoNimbleConfig;
        C20039913b3 c20039913b3 = C20039913b3.LIZ;
        TakoMixFeed takoMixFeedLJIIIZ = this.LLJJIJI.LLILLL.LJIIIZ();
        int i = takoMixFeedLJIIIZ != null ? takoMixFeedLJIIIZ.cardType : 0;
        TakoMixFeed takoMixFeedLJIIIZ2 = this.LLJJIJI.LLILLL.LJIIIZ();
        if (takoMixFeedLJIIIZ2 == null || (takoNimbleConfig = takoMixFeedLJIIIZ2.nimbleConfig) == null || (str = takoNimbleConfig.nimbleKey) == null) {
            str = "";
        }
        c20039913b3.getClass();
        return C20039913b3.LIZ(i, str);
    }

    @Override // X.InterfaceC1859540yUS
    public final String LIZIZ() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC21266318Kf, X.C14SX
    public final Map<String, Object> LJI() {
        return this.LLJZIJLIL;
    }

    @Override // X.InterfaceC1859540yUS
    public final String LJIJJLI() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1857870yRl
    public final C326960Crm LJIL() {
        return this.LLJLIL;
    }

    @Override // X.C0H5X
    public final String LJLIIIL() {
        return this.LLJLL;
    }

    @Override // X.C0H5X
    public final BotMarketInfo LJLLLL() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC689400R2k
    public final List<TakoLinkItem> LLFFF() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC689400R2k
    public final String LLFII() {
        return this.LLJJL;
    }

    @Override // X.C0R3Y
    public final List<TakoSourceItem> LLILZIL() {
        return this.LLJLLIL;
    }

    @Override // X.InterfaceC689400R2k
    public final long LLJJ() {
        return this.LLJL;
    }

    @Override // X.InterfaceC689400R2k
    public final long LLJJJJJIL() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC689400R2k
    public final String getMessageId() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC21266318Kf, X.C14SX
    public final String getRawData() {
        return this.LLJZ;
    }

    @Override // X.InterfaceC21266318Kf, X.C14SX
    public final String getSchema() {
        return this.LLJLLL;
    }

    @Override // X.InterfaceC1859540yUS
    public final String getText() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC689490R2t
    public final List<TakoVideoItem> getVideoList() {
        return this.LLJJJJ;
    }

    public C1858840yTK(C326880Cre c326880Cre) {
        String str;
        String str2;
        String str3;
        Map<String, ? extends Object> map;
        String str4;
        Map<String, ? extends Object> mapLJ;
        String str5;
        List<TakoVideoItem> list;
        List<TakoLinkItem> list2;
        C326960Crm c326960Crm;
        BotMarketInfo botMarketInfo;
        List<TakoSourceItem> list3;
        String str6;
        TakoPassExt takoPassExt;
        Map<String, String> map2;
        TakoLynx takoLynx;
        String str7;
        TakoLynx takoLynx2;
        String str8;
        TakoSug takoSug;
        super(c326880Cre);
        this.LLJJIJI = c326880Cre;
        TakoMixFeed takoMixFeed = this.LLILZLL;
        String str9 = null;
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
        Map<String, Object> mapLJIIIIZZ = c326880Cre.LLILLL.LJIIIIZZ();
        mapLJIIIIZZ = mapLJIIIIZZ == null ? C2097608Jq.LJ() : mapLJIIIIZZ;
        TakoMixFeed takoMixFeed2 = this.LLILZLL;
        if (takoMixFeed2 != null) {
            map = takoMixFeed2.LIZ;
        } else {
            map = null;
        }
        String str10 = "";
        if (map != null) {
            mapLJ = takoMixFeed2.LIZ;
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
        } else {
            if (takoMixFeed2 != null) {
                str4 = takoMixFeed2.nimbleDataStr;
            } else {
                str4 = null;
            }
            if (C123100dR.LIZ(str4)) {
                TakoMixFeed takoMixFeed3 = this.LLILZLL;
                mapLJ = C1905490zgZ.LIZ((takoMixFeed3 == null || (str5 = takoMixFeed3.nimbleDataStr) == null) ? "" : str5);
                TakoMixFeed takoMixFeed4 = this.LLILZLL;
                if (takoMixFeed4 != null) {
                    takoMixFeed4.LIZ = mapLJ;
                }
            } else {
                mapLJ = C2097608Jq.LJ();
            }
        }
        this.LLJJJIL = C2097608Jq.LJIIL(mapLJIIIIZZ, mapLJ);
        TakoMixFeed takoMixFeed5 = this.LLILZLL;
        if (takoMixFeed5 != null) {
            list = takoMixFeed5.videoList;
        } else {
            list = null;
        }
        this.LLJJJJ = list;
        if (takoMixFeed5 != null) {
            list2 = takoMixFeed5.linkList;
        } else {
            list2 = null;
        }
        this.LLJJJJJIL = list2;
        this.LLJJJJLIIL = this.LLILLJJLI;
        this.LLJJL = this.LLILLL;
        this.LLJJLIIIJLLLLLLLZ = this.LLILZ;
        this.LLJL = this.LLILZIL;
        if (takoMixFeed5 != null && (takoSug = takoMixFeed5.sug) != null) {
            c326960Crm = new C326960Crm(null, takoSug, c326880Cre.LLILLL, 1);
        } else {
            c326960Crm = new C326960Crm(null, new TakoSug(false, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, 0L, null, null, 0L, null, false, false, null, null, 0, 0L, false, null, false, false, false, false, false, null, null, -1, 31, null), null, 5);
        }
        this.LLJLIL = c326960Crm;
        TakoMixFeed takoMixFeed6 = this.LLILZLL;
        if (takoMixFeed6 != null) {
            botMarketInfo = takoMixFeed6.botMarketInfo;
        } else {
            botMarketInfo = null;
        }
        this.LLJLILLLLZIIL = botMarketInfo;
        String str11 = this.LLILLJJLI;
        this.LLJLL = str11;
        if (takoMixFeed6 != null) {
            list3 = takoMixFeed6.sources;
        } else {
            list3 = null;
        }
        this.LLJLLIL = list3;
        this.LLJLLL = (takoMixFeed6 == null || (takoLynx2 = takoMixFeed6.lynxData) == null || (str8 = takoLynx2.schema) == null) ? "" : str8;
        if (takoMixFeed6 != null && (takoLynx = takoMixFeed6.lynxData) != null && (str7 = takoLynx.rawData) != null) {
            str10 = str7;
        }
        this.LLJZ = str10;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("messageId", str11);
        pairArr[1] = new Pair("serverMessageId", c326880Cre.LLILLL.msgId);
        TakoMixFeed takoMixFeed7 = this.LLILZLL;
        if (takoMixFeed7 != null && (map2 = takoMixFeed7.msgExt) != null) {
            str6 = map2.get("log_id");
        } else {
            str6 = null;
        }
        pairArr[2] = new Pair("logId", str6);
        pairArr[3] = new Pair("actionItemId", Long.valueOf(this.LLILZ));
        pairArr[4] = new Pair("subProcessId", this.LLILLL);
        TakoMixFeed takoMixFeedLJIIIZ = c326880Cre.LLILLL.LJIIIZ();
        if (takoMixFeedLJIIIZ != null && (takoPassExt = takoMixFeedLJIIIZ.ext) != null) {
            str9 = takoPassExt.pluginType;
        }
        pairArr[5] = new Pair("pluginType", str9);
        pairArr[6] = new Pair("takoCellBubble", 1);
        this.LLJZIJLIL = C2097608Jq.LJIIJ(pairArr);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1858840yTK) {
            if (areItemTheSame(interfaceC1891350zJl) && Intrinsics.LJFF(this.LLJJIJIIJIL, ((C1858840yTK) interfaceC1891350zJl).LLJJIJIIJIL)) {
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
