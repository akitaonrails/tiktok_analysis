package Y;

import X.AbstractC1375550ltp;
import X.AbstractC19483511Kn;
import X.C090S;
import X.C11NZ;
import X.C1375890luN;
import X.C1383870m7F;
import X.C20684815ws;
import X.C259800zU;
import X.C7740030o;
import X.EnumC1997007s0;
import X.InterfaceC1254030ijp;
import X.InterfaceC1369790lkX;
import X.InterfaceC1487280oo2;
import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.repo.DanmakuApi;
import com.ss.android.ugc.aweme.repo.DanmakuDeleteResponse;
import com.ss.android.ugc.aweme.share.model.ShortenModel;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class AkS327S0200000_21 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object, java.lang.String] */
    public static final Object apply$0(AkS327S0200000_21 akS327S0200000_21, Object obj) {
        ShortenModel shortenModel = (ShortenModel) obj;
        C1375890luN c1375890luN = C1375890luN.LIZ;
        C1375890luN.LIZJ = System.currentTimeMillis();
        ((C259800zU) akS327S0200000_21.l0).element = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), shortenModel);
        C259800zU c259800zU = (C259800zU) akS327S0200000_21.l1;
        ?? r0 = shortenModel.shortenUrl;
        c259800zU.element = r0;
        return r0;
    }

    public static final Object apply$1(AkS327S0200000_21 akS327S0200000_21, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        BaseResponse baseResponse = (BaseResponse) obj;
        C090S c090s = C090S.LIZ;
        UpvotePublishMobParam upvotePublishMobParam = (UpvotePublishMobParam) akS327S0200000_21.l0;
        c090s.getClass();
        Pair[] pairArr = new Pair[14];
        String str14 = null;
        if (upvotePublishMobParam != null) {
            str = upvotePublishMobParam.enterFrom;
        } else {
            str = null;
        }
        pairArr[0] = new Pair(str, "enter_from");
        if (upvotePublishMobParam != null) {
            str2 = upvotePublishMobParam.enterMethod;
        } else {
            str2 = null;
        }
        pairArr[1] = new Pair(str2, "enter_method");
        if (upvotePublishMobParam != null) {
            str3 = upvotePublishMobParam.groupId;
        } else {
            str3 = null;
        }
        pairArr[2] = new Pair(str3, "group_id");
        if (upvotePublishMobParam != null) {
            str4 = upvotePublishMobParam.authorId;
        } else {
            str4 = null;
        }
        pairArr[3] = new Pair(str4, "author_id");
        if (upvotePublishMobParam != null) {
            str5 = upvotePublishMobParam.followStatus;
        } else {
            str5 = null;
        }
        pairArr[4] = new Pair(str5, "follow_status");
        if (upvotePublishMobParam != null) {
            str6 = upvotePublishMobParam.isFirst;
        } else {
            str6 = null;
        }
        pairArr[5] = new Pair(str6, "is_first");
        if (upvotePublishMobParam != null) {
            str7 = upvotePublishMobParam.isRecommend;
        } else {
            str7 = null;
        }
        pairArr[6] = new Pair(str7, "is_recommend");
        if (upvotePublishMobParam != null) {
            str8 = upvotePublishMobParam.recommendCount;
        } else {
            str8 = null;
        }
        pairArr[7] = new Pair(str8, "recommend_cnt");
        if (upvotePublishMobParam != null) {
            str9 = upvotePublishMobParam.panelSource;
        } else {
            str9 = null;
        }
        pairArr[8] = new Pair(str9, "panel_source");
        if (upvotePublishMobParam != null) {
            str10 = upvotePublishMobParam.searchKeyword;
        } else {
            str10 = null;
        }
        pairArr[9] = new Pair(str10, "search_keyword");
        if (upvotePublishMobParam != null) {
            str11 = upvotePublishMobParam.searchType;
        } else {
            str11 = null;
        }
        pairArr[10] = new Pair(str11, "search_type");
        if (upvotePublishMobParam != null) {
            str12 = upvotePublishMobParam.searchId;
        } else {
            str12 = null;
        }
        pairArr[11] = new Pair(str12, "search_id");
        if (upvotePublishMobParam != null) {
            str13 = upvotePublishMobParam.searchResultId;
        } else {
            str13 = null;
        }
        pairArr[12] = new Pair(str13, "search_result_id");
        if (upvotePublishMobParam != null) {
            str14 = upvotePublishMobParam.fromPage;
        }
        pairArr[13] = new Pair(str14, "from_page");
        C20684815ws.LJIJI("recommend_success", pairArr);
        UpvotePublishVM upvotePublishVM = (UpvotePublishVM) akS327S0200000_21.l1;
        upvotePublishVM.LL.LIZ();
        upvotePublishVM.LL.LIZLLL(baseResponse);
        upvotePublishVM.LL.LJFF();
        return baseResponse;
    }

    public static final Object apply$2(AkS327S0200000_21 akS327S0200000_21, Object obj) {
        final AbstractC1375550ltp abstractC1375550ltp = (AbstractC1375550ltp) obj;
        final InterfaceC1369790lkX interfaceC1369790lkX = (InterfaceC1369790lkX) akS327S0200000_21.l0;
        final Context context = (Context) akS327S0200000_21.l1;
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lmW
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(C11KY c11ky) {
                c11ky.onSuccess(Boolean.valueOf(interfaceC1369790lkX.LJJIIJ(abstractC1375550ltp, context, null)));
            }
        });
    }

    public static final Object apply$3(AkS327S0200000_21 akS327S0200000_21, Object obj) {
        final AbstractC1375550ltp abstractC1375550ltp = (AbstractC1375550ltp) obj;
        final InterfaceC1369790lkX interfaceC1369790lkX = (InterfaceC1369790lkX) akS327S0200000_21.l0;
        final Context context = (Context) akS327S0200000_21.l1;
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lmX
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(C11KY c11ky) {
                c11ky.onSuccess(Boolean.valueOf(interfaceC1369790lkX.LJJIIJ(abstractC1375550ltp, context, null)));
            }
        });
    }

    public static final Object apply$4(AkS327S0200000_21 akS327S0200000_21, Object obj) {
        String str = (String) obj;
        if (!Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            DanmakuApi danmakuApi = ((C1383870m7F) akS327S0200000_21.l0).LIZIZ;
            int value = ((EnumC1997007s0) akS327S0200000_21.l1).getValue();
            danmakuApi.getClass();
            return DanmakuApi.LIZIZ.deleteDanmaku(str, value);
        }
        DanmakuDeleteResponse danmakuDeleteResponse = new DanmakuDeleteResponse();
        danmakuDeleteResponse.status_code = 1;
        return C11NZ.LJJJJZ(danmakuDeleteResponse);
    }

    public AkS327S0200000_21(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
