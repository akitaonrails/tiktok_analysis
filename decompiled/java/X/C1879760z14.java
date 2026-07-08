package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameFeedMixedDetailPageHalfFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0z14, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1879760z14 extends C09AY implements Function1<C1881590z41, Unit> {
    public final /* synthetic */ AbstractC1177930gl5 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1879760z14(C1050980dSK c1050980dSK, String str, boolean z) {
        super(1);
        this.LL = c1050980dSK;
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1881590z41 c1881590z41) {
        String simpleName;
        GameFeedMixedDetailPageHalfFragment gameFeedMixedDetailPageHalfFragment;
        GameFeedMixedDetailPageHalfFragment gameFeedMixedDetailPageHalfFragment2;
        GameFeedMixedDetailPageHalfFragment gameFeedMixedDetailPageHalfFragment3;
        C1881590z41 c1881590z412 = c1881590z41;
        AbstractC1177930gl5 abstractC1177930gl5 = this.LL;
        c1881590z412.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setExternalBottomSheetCallback callback=");
        sbLIZ.append(abstractC1177930gl5);
        C20441214yg.LIZIZ("GameDetailMixPageHost", C2188811AlT.LIZIZ(sbLIZ));
        GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment = c1881590z412.LLJJIJIL;
        String simpleName2 = null;
        if ((gameDetailMixPageBaseFragment instanceof GameFeedMixedDetailPageHalfFragment) && (gameFeedMixedDetailPageHalfFragment3 = (GameFeedMixedDetailPageHalfFragment) gameDetailMixPageBaseFragment) != null) {
            gameFeedMixedDetailPageHalfFragment3.LLLLII = abstractC1177930gl5;
        }
        String str = this.LLILLJJLI;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setBcLabelText='");
        sbLIZ2.append(str);
        sbLIZ2.append("', fragment=");
        GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment2 = c1881590z412.LLJJIJIL;
        if (gameDetailMixPageBaseFragment2 != null) {
            simpleName = gameDetailMixPageBaseFragment2.getClass().getSimpleName();
        } else {
            simpleName = null;
        }
        sbLIZ2.append(simpleName);
        C20441214yg.LIZIZ("GameDetailMixPageHost", C2188811AlT.LIZIZ(sbLIZ2));
        GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment3 = c1881590z412.LLJJIJIL;
        if ((gameDetailMixPageBaseFragment3 instanceof GameFeedMixedDetailPageHalfFragment) && (gameFeedMixedDetailPageHalfFragment2 = (GameFeedMixedDetailPageHalfFragment) gameDetailMixPageBaseFragment3) != null) {
            gameFeedMixedDetailPageHalfFragment2.LLLJL = str;
        }
        boolean z = this.LLILLL;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("setBcLabelShow='");
        sbLIZ3.append(z);
        sbLIZ3.append("', fragment=");
        GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment4 = c1881590z412.LLJJIJIL;
        if (gameDetailMixPageBaseFragment4 != null) {
            simpleName2 = gameDetailMixPageBaseFragment4.getClass().getSimpleName();
        }
        sbLIZ3.append(simpleName2);
        C20441214yg.LIZIZ("GameDetailMixPageHost", C2188811AlT.LIZIZ(sbLIZ3));
        GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment5 = c1881590z412.LLJJIJIL;
        if ((gameDetailMixPageBaseFragment5 instanceof GameFeedMixedDetailPageHalfFragment) && (gameFeedMixedDetailPageHalfFragment = (GameFeedMixedDetailPageHalfFragment) gameDetailMixPageBaseFragment5) != null) {
            gameFeedMixedDetailPageHalfFragment.LLLL = z;
        }
        return Unit.LIZ;
    }
}
