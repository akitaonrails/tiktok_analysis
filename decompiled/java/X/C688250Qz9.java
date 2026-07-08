package X;

import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.search.PromotionInfo;
import com.ss.android.ugc.aweme.feed.model.search.WordStruct;
import com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssemTrigger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qz9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssemTrigger$searchMobShow$lambda$2$$inlined$runTaskAsync$1", f = "FeedSearchBottomBarAssem.kt", l = {2194}, m = "invokeSuspend")
public final class C688250Qz9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C688270QzB LLILLL;
    public final /* synthetic */ VideoItemParams LLILZ;
    public final /* synthetic */ C688190Qz3 LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ Integer LLIZLLLIL;
    public final /* synthetic */ VideoItemParams LLJ;
    public final /* synthetic */ FeedSearchBottomBarAssemTrigger LLJI;
    public final /* synthetic */ C0QFY LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C688250Qz9(InterfaceC1364105Vn interfaceC1364105Vn, C688270QzB c688270QzB, VideoItemParams videoItemParams, C688190Qz3 c688190Qz3, String str, int i, Integer num, VideoItemParams videoItemParams2, FeedSearchBottomBarAssemTrigger feedSearchBottomBarAssemTrigger, C0QFY c0qfy, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c688270QzB;
        this.LLILZ = videoItemParams;
        this.LLILZIL = c688190Qz3;
        this.LLILZLL = str;
        this.LLIZ = i;
        this.LLIZLLLIL = num;
        this.LLJ = videoItemParams2;
        this.LLJI = feedSearchBottomBarAssemTrigger;
        this.LLJIJIL = c0qfy;
        this.LLJILJIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C688250Qz9 c688250Qz9 = new C688250Qz9(interfaceC1364105Vn, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL);
        c688250Qz9.LLILLJJLI = obj;
        return c688250Qz9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        String tabName;
        boolean zIsEnableAdStarHub;
        Boolean boolIL0;
        Boolean boolZm0;
        String wordsLabel;
        String str;
        String str2;
        String code;
        String qrecJsonInfo;
        String wordsLabel2;
        String str3;
        Word wordRecord;
        Word wordRecord2;
        C688270QzB c688270QzB;
        EnumC688310QzF enumC688310QzF;
        C688270QzB c688270QzB2;
        Word wordRecord3;
        C2189821An6 c2189821An6;
        Object objLJI = obj;
        C1C7U.LIZ("FeedSearchBottomBarAssemTrigger@8d3a.searchMobShow$lambda$2$$inlined$runTaskAsync$1");
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
            C688260QzA c688260QzA = new C688260QzA(this.LLJI, null);
            this.LL = 1;
            objLJI = C23250099c.LJI(this, abstractC2238408pq, c688260QzA);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("FeedSearchBottomBarAssemTrigger@8d3a.searchMobShow$lambda$2$$inlined$runTaskAsync$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) objLJI).booleanValue();
        C688270QzB c688270QzB3 = this.LLILLL;
        if (c688270QzB3 != null && c688270QzB3.LIZ) {
            z = true;
        } else {
            z = false;
        }
        C1ER1 c1er1 = C1ER1.LIZIZ;
        Aweme aweme = this.LLILZ.getAweme();
        String str4 = this.LLILZ.mEventType;
        C688190Qz3 c688190Qz3 = this.LLILZIL;
        String str5 = c688190Qz3.LIZLLL;
        String str6 = c688190Qz3.LIZJ;
        BaseFeedPageParams baseFeedPageParams = this.LLILZ.baseFeedPageParams;
        String str7 = "";
        if (baseFeedPageParams == null || (c2189821An6 = baseFeedPageParams.param) == null || (tabName = c2189821An6.getTabName()) == null) {
            tabName = "";
        }
        String groupId = this.LLILZ.getAweme().getGroupId();
        if (groupId == null) {
            groupId = "";
        }
        String str8 = this.LLILZLL;
        C688190Qz3 c688190Qz32 = this.LLILZIL;
        PromotionInfo promotionInfo = c688190Qz32.LJFF;
        String str9 = c688190Qz32.LJII;
        String strLIZLLL = C1200530hLX.LIZLLL(Boolean.valueOf(c688190Qz32.LIZJ()));
        if (strLIZLLL == null) {
            strLIZLLL = CardStruct.IStatusCode.DEFAULT;
        }
        C688190Qz3 c688190Qz33 = this.LLILZIL;
        String str10 = c688190Qz33.LJIIIIZZ;
        String str11 = c688190Qz33.LJ;
        String str12 = c688190Qz33.LJIIIZ;
        Integer numLJ = C2286608xc.LJ(this.LLILZ.mPageType);
        String strValueOf = String.valueOf(this.LLILZIL.LIZ.size());
        String strValueOf2 = String.valueOf(this.LLIZ);
        Integer num = this.LLIZLLLIL;
        AwemeCommerceStruct commerceVideoAuthInfo = this.LLJ.getAweme().getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo != null) {
            zIsEnableAdStarHub = commerceVideoAuthInfo.isEnableAdStarHub();
        } else {
            zIsEnableAdStarHub = false;
        }
        Boolean boolValueOf = Boolean.valueOf(zIsEnableAdStarHub);
        FeedBarSearchAbility feedBarSearchAbilityZp = this.LLJI.zp();
        if (feedBarSearchAbilityZp != null) {
            boolIL0 = feedBarSearchAbilityZp.iL0();
        } else {
            boolIL0 = null;
        }
        FeedBarSearchAbility feedBarSearchAbilityZp2 = this.LLJI.zp();
        if (feedBarSearchAbilityZp2 != null) {
            boolZm0 = feedBarSearchAbilityZp2.zm0();
        } else {
            boolZm0 = null;
        }
        WordStruct wordStruct = this.LLILZIL.LIZIZ;
        if (wordStruct != null && (wordRecord3 = wordStruct.getWordRecord()) != null) {
            wordsLabel = wordRecord3.getWordsLabel();
        } else {
            wordsLabel = null;
        }
        if (z && (c688270QzB2 = this.LLILLL) != null) {
            str = c688270QzB2.LIZJ;
        } else {
            str = null;
        }
        C688270QzB c688270QzB4 = this.LLILLL;
        if (c688270QzB4 != null) {
            str2 = c688270QzB4.LIZIZ;
        } else {
            str2 = null;
        }
        Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
        if (!z && (c688270QzB = this.LLILLL) != null && (enumC688310QzF = c688270QzB.LJ) != null) {
            code = enumC688310QzF.getCode();
        } else {
            code = null;
        }
        C0QFY c0qfy = this.LLJIJIL;
        WordStruct wordStruct2 = this.LLILZIL.LIZIZ;
        if (wordStruct2 != null && (wordRecord2 = wordStruct2.getWordRecord()) != null) {
            qrecJsonInfo = wordRecord2.getQrecJsonInfo();
        } else {
            qrecJsonInfo = null;
        }
        c1er1.LLLLLLZ(aweme, str4, str5, str6, tabName, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, groupId, str8, promotionInfo, str9, strLIZLLL, str10, str11, str12, numLJ, strValueOf, strValueOf2, num, boolValueOf, boolIL0, boolZm0, wordsLabel, str, str2, boolValueOf2, code, c0qfy, qrecJsonInfo, "related_search_anchor_v2");
        if (this.LLJ.getAweme().isAd()) {
            new C1D2A().LIZIZ(this.LLJ.getAweme(), EnumC673040Qac.FEED_BOTTOM_BAR, this.LLILZIL.LIZJ);
        }
        if (this.LLJILJIL) {
            C688290QzD c688290QzD = C688290QzD.LIZ;
            String str13 = this.LLILZIL.LIZJ;
            String str14 = this.LLILZ.mEventType;
            String strT = c1er1.t(this.LLJ.getAweme(), C2286608xc.LJ(this.LLILZ.mPageType));
            String str15 = this.LLILZIL.LIZLLL;
            String groupId2 = this.LLJ.getAweme().getGroupId();
            if (groupId2 != null) {
                str7 = groupId2;
            }
            String str16 = ((C0PM7) C0Q3E.LJI().uF().LIZJ()).LLILLL;
            WordStruct wordStruct3 = this.LLILZIL.LIZIZ;
            if (wordStruct3 != null && (wordRecord = wordStruct3.getWordRecord()) != null) {
                wordsLabel2 = wordRecord.getWordsLabel();
            } else {
                wordsLabel2 = null;
            }
            C688270QzB c688270QzB5 = this.LLILLL;
            if (c688270QzB5 != null && c688270QzB5.LIZ) {
                str3 = c688270QzB5.LIZJ;
            } else {
                str3 = null;
            }
            Boolean boolValueOf3 = Boolean.valueOf(zBooleanValue);
            c688290QzD.getClass();
            C688290QzD.LJIIJ(str13, str14, boolValueOf3, strT, str15, str7, str16, wordsLabel2, str3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedSearchBottomBarAssemTrigger@8d3a.searchMobShow$lambda$2$$inlined$runTaskAsync$1");
        return unit;
    }
}
