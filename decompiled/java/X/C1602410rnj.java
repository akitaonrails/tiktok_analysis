package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.live.FeedLiveStatusManagerComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rnj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602410rnj extends C09AY implements Function0<C1602310rnZ> {
    public final /* synthetic */ FeedLiveStatusManagerComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1602410rnj(FeedLiveStatusManagerComponent feedLiveStatusManagerComponent) {
        super(0);
        this.LL = feedLiveStatusManagerComponent;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0qoL] */
    @Override // kotlin.jvm.functions.Function0
    public final C1602310rnZ invoke() {
        final FeedLiveStatusManagerComponent feedLiveStatusManagerComponent = this.LL;
        return new C1602310rnZ(new InterfaceC1602390rnh() { // from class: X.0qoL
            @Override // X.InterfaceC1602390rnh
            public final int LJLLJ() {
                return feedLiveStatusManagerComponent.LJLLJ();
            }

            @Override // X.InterfaceC1602390rnh
            public final List<Aweme> LLILIL() {
                return feedLiveStatusManagerComponent.getAwemeList();
            }

            @Override // X.InterfaceC1602390rnh
            public final Aweme LLILLIZIL() {
                IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) feedLiveStatusManagerComponent.LLJI.getValue();
                if (iViewPagerComponentAbility != null) {
                    return iViewPagerComponentAbility.LJIIIIZZ();
                }
                return null;
            }

            @Override // X.InterfaceC1602390rnh
            public final Integer LLILLJJLI() {
                IViewPagerAbility iViewPagerAbility = (IViewPagerAbility) feedLiveStatusManagerComponent.LLJI.getValue();
                if (iViewPagerAbility != null) {
                    return Integer.valueOf(iViewPagerAbility.LLLIIIL());
                }
                return null;
            }

            @Override // X.InterfaceC1602390rnh
            public final boolean LLILLL() {
                return ((InterfaceC1564100qnw) feedLiveStatusManagerComponent.LLJJJJ.getValue()).isInit();
            }

            @Override // X.InterfaceC1602390rnh
            public final boolean LIZ(JSONObject jSONObject) {
                return feedLiveStatusManagerComponent.uo("live_card_hot_refresh_remove_key", jSONObject);
            }

            @Override // X.InterfaceC1602390rnh
            public final void LLILZ(int i, Aweme aweme) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(aweme);
                IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) feedLiveStatusManagerComponent.LLIZLLLIL.getValue();
                if (iFeedPanelPlatformAbility != null) {
                    iFeedPanelPlatformAbility.tJ2(i, "live_card_update_insert", arrayList);
                }
            }

            @Override // X.InterfaceC1602390rnh
            public final long LLILZLL(long j, boolean z) {
                return feedLiveStatusManagerComponent.lo(j, z);
            }

            @Override // X.InterfaceC1602390rnh
            public final void LLIZ(JSONObject jSONObject, Function2 function2) {
                ((InterfaceC1564100qnw) feedLiveStatusManagerComponent.LLJJJJ.getValue()).onEvent("live_card_hot_refresh_remove_key", jSONObject, function2);
            }

            @Override // X.InterfaceC1602390rnh
            public final boolean LLILZIL(int i, Aweme aweme, String str) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(aweme);
                IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) feedLiveStatusManagerComponent.LLIZLLLIL.getValue();
                if (iFeedPanelPlatformAbility != null) {
                    return iFeedPanelPlatformAbility.PW(i, i + 1, str, arrayList);
                }
                return false;
            }
        }, feedLiveStatusManagerComponent.ko(), ((Boolean) this.LL.LLJILLL.getValue()).booleanValue(), ((Boolean) this.LL.LLJJI.getValue()).booleanValue(), this.LL.mo(), this.LL.oo());
    }
}
