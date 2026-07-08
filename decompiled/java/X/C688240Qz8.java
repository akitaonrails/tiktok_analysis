package X;

import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.search.PromotionInfo;
import com.ss.android.ugc.aweme.feed.model.search.WordStruct;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qz8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssem$searchMobShow$lambda$40$$inlined$runTaskAsync$1", f = "FeedSearchBottomBarAssem.kt", l = {2194}, m = "invokeSuspend")
public final class C688240Qz8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ VideoItemParams LLILLL;
    public final /* synthetic */ C688190Qz3 LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ FeedSearchBottomBarAssem LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C688240Qz8(InterfaceC1364105Vn interfaceC1364105Vn, VideoItemParams videoItemParams, C688190Qz3 c688190Qz3, String str, FeedSearchBottomBarAssem feedSearchBottomBarAssem) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = videoItemParams;
        this.LLILZ = c688190Qz3;
        this.LLILZIL = str;
        this.LLILZLL = feedSearchBottomBarAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C688240Qz8 c688240Qz8 = new C688240Qz8(interfaceC1364105Vn, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        c688240Qz8.LLILLJJLI = obj;
        return c688240Qz8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String tabName;
        boolean zIsEnableAdStarHub;
        String wordsLabel;
        String str;
        String qrecJsonInfo;
        Word wordRecord;
        Word wordRecord2;
        C2189821An6 c2189821An6;
        Object objLJI = obj;
        C1C7U.LIZ("FeedSearchBottomBarAssem@54f7.searchMobShow$lambda$40$$inlined$runTaskAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C0IQA c0iqa = new C0IQA(this.LLILZLL, null);
            this.LL = 1;
            objLJI = C23250099c.LJI(this, abstractC2238408pq, c0iqa);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("FeedSearchBottomBarAssem@54f7.searchMobShow$lambda$40$$inlined$runTaskAsync$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) objLJI).booleanValue();
        C1ER1 c1er1 = C1ER1.LIZIZ;
        Aweme aweme = this.LLILLL.getAweme();
        String str2 = this.LLILLL.mEventType;
        C688190Qz3 c688190Qz3 = this.LLILZ;
        String str3 = c688190Qz3.LIZLLL;
        String str4 = c688190Qz3.LIZJ;
        BaseFeedPageParams baseFeedPageParams = this.LLILLL.baseFeedPageParams;
        if (baseFeedPageParams == null || (c2189821An6 = baseFeedPageParams.param) == null || (tabName = c2189821An6.getTabName()) == null) {
            tabName = "";
        }
        String groupId = this.LLILLL.getAweme().getGroupId();
        if (groupId == null) {
            groupId = "";
        }
        String str5 = this.LLILZIL;
        C688190Qz3 c688190Qz32 = this.LLILZ;
        PromotionInfo promotionInfo = c688190Qz32.LJFF;
        String str6 = c688190Qz32.LJII;
        String strLIZLLL = C1200530hLX.LIZLLL(Boolean.valueOf(c688190Qz32.LIZJ()));
        if (strLIZLLL == null) {
            strLIZLLL = CardStruct.IStatusCode.DEFAULT;
        }
        C688190Qz3 c688190Qz33 = this.LLILZ;
        String str7 = c688190Qz33.LJIIIIZZ;
        String str8 = c688190Qz33.LJ;
        String str9 = this.LLILZLL.LLLLIILL.LJIIIZ;
        Integer numLJ = C2286608xc.LJ(this.LLILLL.mPageType);
        String strValueOf = String.valueOf(this.LLILZLL.LLLLIILL.LIZ.size());
        String strValueOf2 = String.valueOf(this.LLILZLL.Up().wQ2(this.LLILLL.getAweme().getAid()));
        Integer num = this.LLILZLL.LLLLLLJ;
        AwemeCommerceStruct commerceVideoAuthInfo = this.LLILLL.getAweme().getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo != null) {
            zIsEnableAdStarHub = commerceVideoAuthInfo.isEnableAdStarHub();
        } else {
            zIsEnableAdStarHub = false;
        }
        Boolean boolValueOf = Boolean.valueOf(zIsEnableAdStarHub);
        Boolean boolIL0 = this.LLILZLL.iL0();
        Boolean boolZm0 = this.LLILZLL.zm0();
        WordStruct wordStruct = this.LLILZLL.LLLLIILL.LIZIZ;
        if (wordStruct != null && (wordRecord2 = wordStruct.getWordRecord()) != null) {
            wordsLabel = wordRecord2.getWordsLabel();
        } else {
            wordsLabel = null;
        }
        C688270QzB c688270QzB = this.LLILZLL.LLLLZLLIL;
        if (c688270QzB.LIZ) {
            str = c688270QzB.LIZJ;
        } else {
            str = null;
        }
        String str10 = c688270QzB.LIZIZ;
        Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
        FeedSearchBottomBarAssem feedSearchBottomBarAssem = this.LLILZLL;
        C0QFY c0qfy = feedSearchBottomBarAssem.LLLLZLLLI;
        WordStruct wordStruct2 = feedSearchBottomBarAssem.LLLLIILL.LIZIZ;
        if (wordStruct2 != null && (wordRecord = wordStruct2.getWordRecord()) != null) {
            qrecJsonInfo = wordRecord.getQrecJsonInfo();
        } else {
            qrecJsonInfo = null;
        }
        c1er1.LLLLLLZ(aweme, str2, str3, str4, tabName, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, groupId, str5, promotionInfo, str6, strLIZLLL, str7, str8, str9, numLJ, strValueOf, strValueOf2, num, boolValueOf, boolIL0, boolZm0, wordsLabel, str, str10, boolValueOf2, null, c0qfy, qrecJsonInfo, "related_search_anchor_v2");
        if (this.LLILLL.getAweme().isAd()) {
            new C1D2A().LIZIZ(this.LLILLL.getAweme(), EnumC673040Qac.FEED_BOTTOM_BAR, this.LLILZLL.LLLLIILL.LIZJ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedSearchBottomBarAssem@54f7.searchMobShow$lambda$40$$inlined$runTaskAsync$1");
        return unit;
    }
}
