package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.ui.SearchMixLiveCardContentAssem;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655160Pms extends C09AY implements InterfaceC1631630sYr<Aweme, C654590Plx, EnterRoomConfig, String, Unit> {
    public final /* synthetic */ SearchMixLiveCardContentAssem LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C655160Pms(SearchMixLiveCardContentAssem searchMixLiveCardContentAssem, View view, Aweme aweme) {
        super(4);
        this.LL = searchMixLiveCardContentAssem;
        this.LLILLJJLI = view;
        this.LLILLL = aweme;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Aweme aweme, C654590Plx c654590Plx, EnterRoomConfig enterRoomConfig, String str) {
        String str2;
        C650430PfF c650430PfF;
        String str3;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        Aweme aweme2 = aweme;
        C654590Plx c654590Plx2 = c654590Plx;
        EnterRoomConfig enterRoomConfig2 = enterRoomConfig;
        String str4 = str;
        SearchMixLiveCardContentAssem searchMixLiveCardContentAssem = this.LL;
        View view = this.LLILLJJLI;
        final Aweme aweme3 = this.LLILLL;
        Context context = searchMixLiveCardContentAssem.getContext();
        if (context != null) {
            AwS589S0100000_10 awS589S0100000_10 = new AwS589S0100000_10(C1ER1.LIZIZ.LLLLJ(aweme2, c654590Plx2, enterRoomConfig2, str4, searchMixLiveCardContentAssem.LJJIJL(), context), 601);
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            PageFinder pageFinderVia = PageFinder.via(view);
            C212367188v c212367188v = BcmParams.Companion;
            Pair[] pairArr = new Pair[2];
            ISearchContextAbility iSearchContextAbilityTp = searchMixLiveCardContentAssem.tp();
            String str5 = "";
            if (iSearchContextAbilityTp == null || (c0pcyPh1 = iSearchContextAbilityTp.Ph1()) == null || (c0prc = (C0PRC) c0pcyPh1.LIZJ()) == null || (str2 = c0prc.LLILLL) == null) {
                str2 = "";
            }
            pairArr[0] = new Pair("search_id", str2);
            C655000Pmc c655000Pmc = searchMixLiveCardContentAssem.LLLF;
            if (c655000Pmc != null && (c650430PfF = c655000Pmc.LLILZ) != null && (str3 = c650430PfF.LIZIZ().get("search_result_id")) != null) {
                str5 = str3;
            }
            pairArr[1] = new Pair("search_result_id", str5);
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            c212367188v.getClass();
            String strCreateJumpSourceBtmToken = btmSDK.createJumpSourceBtmToken("c6710.d47166", pageFinderVia, C212367188v.LIZJ(mapLJIIIIZZ));
            enterRoomConfig2.mLogData.sourceBtmToken = strCreateJumpSourceBtmToken;
            C0Q3E.LIZJ(aweme2).fe(new C655220Pmy(awS589S0100000_10));
            SearchServiceCenter$NavigateAbility searchServiceCenter$NavigateAbility = (SearchServiceCenter$NavigateAbility) C1558520qew.LIZ(C1558520qew.LJIIL(searchMixLiveCardContentAssem), SearchServiceCenter$NavigateAbility.class, null);
            if (searchServiceCenter$NavigateAbility != null) {
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(searchMixLiveCardContentAssem);
                AwemeBizExtKt.setSourceBtmToken(aweme2, strCreateJumpSourceBtmToken);
                searchServiceCenter$NavigateAbility.GV0(interfaceC665370Q7zLJIIL, aweme2, new InterfaceC645880PVa(aweme3) { // from class: X.0PmP
                    public final C650430PfF LL;
                    public final boolean LLILLJJLI = true;

                    @Override // X.InterfaceC1891350zJl
                    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return null;
                    }

                    @Override // X.InterfaceC645880PVa
                    public final C650430PfF LLIZLLLIL() {
                        return this.LL;
                    }

                    @Override // X.InterfaceC645880PVa
                    public final boolean LLJJJIL() {
                        return this.LLILLJJLI;
                    }

                    {
                        this.LL = new C650430PfF(new AwS589S0100000_10(aweme3, 600));
                    }

                    @Override // X.InterfaceC1891350zJl
                    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return Intrinsics.LJFF(interfaceC1891350zJl, this);
                    }

                    @Override // X.InterfaceC1891350zJl
                    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return Intrinsics.LJFF(interfaceC1891350zJl, this);
                    }
                }, false, null, null);
            }
        }
        return Unit.LIZ;
    }
}
