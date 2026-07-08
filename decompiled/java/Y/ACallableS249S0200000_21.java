package Y;

import X.AbstractC2126608Uu;
import X.C0O8X;
import X.C0XI4;
import X.C0XJW;
import X.C1017070cZd;
import X.C10EU;
import X.C1345110l6j;
import X.C1345910l81;
import X.C1345930l83;
import X.C1346040l8E;
import X.C1346060l8G;
import X.C1375890luN;
import X.C1375910luP;
import X.C1375970luV;
import X.C1393500mMm;
import X.C199499133x;
import X.C1C7U;
import X.C2188811AlT;
import X.C712520RxC;
import X.C737370SwB;
import X.C7740030o;
import X.C786410Ut5;
import X.InterfaceC1393560mMs;
import X.InterfaceC2661011f;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.comment.commentlist.api.CommentApi;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.comment.model.CommentPublishRequestModel;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class ACallableS249S0200000_21 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS249S0200000_21 aCallableS249S0200000_21) throws InterruptedException {
        C1346060l8G c1346060l8G = (C1346060l8G) aCallableS249S0200000_21.l0;
        Object[] objArr = (Object[]) aCallableS249S0200000_21.l1;
        c1346060l8G.getClass();
        C1C7U.LIZ("CommentDeleteModel@6450.sendRequest$1L");
        c1346060l8G.LLILLL = (String) objArr[0];
        if (objArr.length == 3) {
            int iIntValue = ((Integer) objArr[1]).intValue();
            int iIntValue2 = ((Integer) objArr[2]).intValue();
            try {
                BaseCommentResponse baseCommentResponse = ((CommentApi.RealApi) CommentApi.LIZ.create(CommentApi.RealApi.class)).LIZ((String) objArr[0], iIntValue, iIntValue2, 0).get();
                C1C7U.LIZIZ("CommentDeleteModel@6450.sendRequest$1L");
                return baseCommentResponse;
            } catch (ExecutionException e) {
                TryCatchGuardChecker.doCheck(e);
                throw AbstractC2126608Uu.getCompatibleException(e);
            }
        }
        int iIntValue3 = ((Integer) objArr[1]).intValue();
        String str = (String) objArr[0];
        InterfaceC2661011f interfaceC2661011f = CommentApi.LIZ;
        boolean zLJI = MethodIDManager.LJI(202152);
        try {
            BaseCommentResponse baseCommentResponse2 = ((CommentApi.RealApi) CommentApi.LIZ.create(CommentApi.RealApi.class)).LJFF(str, iIntValue3, 0).get();
            if (zLJI) {
                MethodIDManager.LJ();
            }
            C1C7U.LIZIZ("CommentDeleteModel@6450.sendRequest$1L");
            return baseCommentResponse2;
        } catch (ExecutionException e2) {
            TryCatchGuardChecker.doCheck(e2);
            RuntimeException compatibleException = AbstractC2126608Uu.getCompatibleException(e2);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            throw compatibleException;
        }
    }

    public static final Object call$1(ACallableS249S0200000_21 aCallableS249S0200000_21) throws InterruptedException {
        C1346040l8E c1346040l8E = (C1346040l8E) aCallableS249S0200000_21.l0;
        Object[] objArr = (Object[]) aCallableS249S0200000_21.l1;
        c1346040l8E.getClass();
        C1C7U.LIZ("CommentDiggModel@8cd2.sendRequest$1L");
        String str = (String) objArr[0];
        c1346040l8E.LLILLL = str;
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        c1346040l8E.LLILZ = str3;
        try {
            BaseCommentResponse baseCommentResponse = ((CommentApi.RealApi) CommentApi.LIZ.create(CommentApi.RealApi.class)).LIZJ(str, str2, str3, C737370SwB.LIZ((String) objArr[3])).get();
            C1C7U.LIZIZ("CommentDiggModel@8cd2.sendRequest$1L");
            return baseCommentResponse;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static final Object call$2(ACallableS249S0200000_21 aCallableS249S0200000_21) throws InterruptedException {
        String str;
        String json;
        String json2;
        String currentShownCount;
        String json3;
        CommentResponse commentResponseLJ;
        String json4;
        String json5;
        String currentShownCount2;
        String json6;
        Long creativeId;
        C1345930l83 c1345930l83 = (C1345930l83) aCallableS249S0200000_21.l0;
        Object[] objArr = (Object[]) aCallableS249S0200000_21.l1;
        c1345930l83.getClass();
        C1C7U.LIZ("CommentPublishModel@ce1e.sendRequest$1L");
        C1345910l81 c1345910l81 = (C1345910l81) objArr[0];
        if (c1345910l81.LJIIIIZZ != 0 && !C199499133x.LIZ(c1345910l81.LJII)) {
            str = "ttk_comment_gift_send_api_monitor";
        } else {
            str = "ttk_comment_publish_api_monitor";
        }
        C0O8X c0o8x = c1345930l83.LLILLJJLI;
        c0o8x.LIZLLL = str;
        c0o8x.LIZIZ(c1345910l81.LJIILL, "enter_from");
        String str2 = c1345910l81.LIZJ;
        if (str2 != null) {
            c1345930l83.LLILLJJLI.LIZJ(str2, "cid");
        }
        String str3 = c1345910l81.LIZ;
        if (str3 != null) {
            c1345930l83.LLILLJJLI.LIZJ(str3, "gid");
        }
        InterfaceC2661011f interfaceC2661011f = CommentApi.LIZ;
        boolean zLJI = MethodIDManager.LJI(202138);
        try {
            if (c1345910l81.LJIIIIZZ != 0 && !C199499133x.LIZ(c1345910l81.LJII)) {
                commentResponseLJ = CommentApi.LJ(c1345910l81);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            } else {
                Gson gson = C7740030o.LIZ().getGson();
                CommentPublishRequestModel commentPublishRequestModelLIZIZ = CommentApi.LIZIZ(c1345910l81);
                Aweme awemeEr = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Er(commentPublishRequestModelLIZIZ.getAid());
                if (awemeEr != null) {
                    if (awemeEr.getAwemeRawAd() != null && !C1017070cZd.LJLJJLL(awemeEr)) {
                        creativeId = awemeEr.getAwemeRawAd().getCreativeId();
                    } else {
                        creativeId = null;
                    }
                    commentPublishRequestModelLIZIZ.setCreativeId(creativeId);
                }
                String strJ3 = "";
                String json7 = "[]";
                if (c1345910l81.LJIIL == -1) {
                    CommentApi.RealApi realApi = (CommentApi.RealApi) CommentApi.LIZ.create(CommentApi.RealApi.class);
                    String aid = commentPublishRequestModelLIZIZ.getAid();
                    String text = commentPublishRequestModelLIZIZ.getText();
                    String replyId = commentPublishRequestModelLIZIZ.getReplyId();
                    if (commentPublishRequestModelLIZIZ.getTextExtraList() == null) {
                        json4 = "[]";
                    } else {
                        json4 = GsonProtectorUtils.toJson(gson, commentPublishRequestModelLIZIZ.getTextExtraList());
                    }
                    if (commentPublishRequestModelLIZIZ.getImageList() != null) {
                        json7 = GsonProtectorUtils.toJson(gson, commentPublishRequestModelLIZIZ.getImageList());
                    }
                    if (commentPublishRequestModelLIZIZ.getStickerInfo() == null) {
                        json5 = "";
                    } else {
                        json5 = GsonProtectorUtils.toJson(gson, commentPublishRequestModelLIZIZ.getStickerInfo());
                    }
                    int isSelfSee = commentPublishRequestModelLIZIZ.getIsSelfSee();
                    String replyToReplyId = commentPublishRequestModelLIZIZ.getReplyToReplyId();
                    int channelId = commentPublishRequestModelLIZIZ.getChannelId();
                    int actionType = commentPublishRequestModelLIZIZ.getActionType();
                    String adInfo = commentPublishRequestModelLIZIZ.getAdInfo();
                    int i = c1345910l81.LJIILJJIL;
                    if (commentPublishRequestModelLIZIZ.getCurrentShownCount() == null) {
                        currentShownCount2 = "";
                    } else {
                        currentShownCount2 = commentPublishRequestModelLIZIZ.getCurrentShownCount();
                    }
                    boolean z = c1345910l81.LJJI;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("if_copy_paste", z);
                        strJ3 = C786410Ut5.J3(jSONObject);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    Long creativeId2 = commentPublishRequestModelLIZIZ.getCreativeId();
                    String enterFrom = commentPublishRequestModelLIZIZ.getEnterFrom();
                    if (commentPublishRequestModelLIZIZ.getUserVoteInfo() != null) {
                        json6 = GsonProtectorUtils.toJson(gson, commentPublishRequestModelLIZIZ.getUserVoteInfo());
                    } else {
                        json6 = null;
                    }
                    commentResponseLJ = realApi.LJIIIIZZ(aid, text, replyId, json4, json7, json5, isSelfSee, replyToReplyId, channelId, actionType, adInfo, i, currentShownCount2, strJ3, creativeId2, enterFrom, json6).get();
                } else {
                    CommentApi.RealApi realApi2 = (CommentApi.RealApi) CommentApi.LIZ.create(CommentApi.RealApi.class);
                    String aid2 = commentPublishRequestModelLIZIZ.getAid();
                    String text2 = commentPublishRequestModelLIZIZ.getText();
                    String replyId2 = commentPublishRequestModelLIZIZ.getReplyId();
                    if (commentPublishRequestModelLIZIZ.getTextExtraList() == null) {
                        json = "[]";
                    } else {
                        json = GsonProtectorUtils.toJson(gson, commentPublishRequestModelLIZIZ.getTextExtraList());
                    }
                    if (commentPublishRequestModelLIZIZ.getImageList() != null) {
                        json7 = GsonProtectorUtils.toJson(gson, commentPublishRequestModelLIZIZ.getImageList());
                    }
                    if (commentPublishRequestModelLIZIZ.getStickerInfo() == null) {
                        json2 = "";
                    } else {
                        json2 = GsonProtectorUtils.toJson(gson, commentPublishRequestModelLIZIZ.getStickerInfo());
                    }
                    int isSelfSee2 = commentPublishRequestModelLIZIZ.getIsSelfSee();
                    String replyToReplyId2 = commentPublishRequestModelLIZIZ.getReplyToReplyId();
                    int channelId2 = commentPublishRequestModelLIZIZ.getChannelId();
                    int actionType2 = commentPublishRequestModelLIZIZ.getActionType();
                    String adInfo2 = commentPublishRequestModelLIZIZ.getAdInfo();
                    int i2 = c1345910l81.LJIILJJIL;
                    int i3 = c1345910l81.LJIIL;
                    if (commentPublishRequestModelLIZIZ.getCurrentShownCount() == null) {
                        currentShownCount = "";
                    } else {
                        currentShownCount = commentPublishRequestModelLIZIZ.getCurrentShownCount();
                    }
                    boolean z2 = c1345910l81.LJJI;
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("if_copy_paste", z2);
                        strJ3 = C786410Ut5.J3(jSONObject2);
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    Long creativeId3 = commentPublishRequestModelLIZIZ.getCreativeId();
                    String enterFrom2 = commentPublishRequestModelLIZIZ.getEnterFrom();
                    if (commentPublishRequestModelLIZIZ.getUserVoteInfo() != null) {
                        json3 = GsonProtectorUtils.toJson(gson, commentPublishRequestModelLIZIZ.getUserVoteInfo());
                    } else {
                        json3 = null;
                    }
                    commentResponseLJ = realApi2.LJI(aid2, text2, replyId2, json, json7, json2, isSelfSee2, replyToReplyId2, channelId2, actionType2, adInfo2, i2, i3, currentShownCount, strJ3, creativeId3, enterFrom2, json3).get();
                }
                commentResponseLJ.comment.setLabelInfo(commentResponseLJ.starFakeLabel);
                commentResponseLJ.comment.setFakeId(c1345910l81.LJI);
                commentResponseLJ.comment.setStoryEmojiComment(c1345910l81.LJIILIIL);
                commentResponseLJ.comment.setPublishScenario(c1345910l81.LJIILJJIL);
                commentResponseLJ.comment.setImageList(C1345110l6j.LIZIZ(c1345910l81.LJIIZILJ));
                commentResponseLJ.comment.setStickerStruct(c1345910l81.LJIJ);
                commentResponseLJ.comment.setIsCommentPostChecked(c1345910l81.LJIJJ);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            }
            C1C7U.LIZIZ("CommentPublishModel@ce1e.sendRequest$1L");
            return commentResponseLJ;
        } catch (ExecutionException e3) {
            TryCatchGuardChecker.doCheck(e3);
            RuntimeException compatibleException = AbstractC2126608Uu.getCompatibleException(e3);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            throw compatibleException;
        }
    }

    public static final Object call$3(ACallableS249S0200000_21 aCallableS249S0200000_21) {
        C1C7U.LIZ("TagMultiHandler@6c09.onBind$1$1");
        ((C1393500mMm) aCallableS249S0200000_21.l0).LIZIZ();
        Iterator<InterfaceC1393560mMs> it2 = ((C712520RxC) aCallableS249S0200000_21.l1).LJIILL().iterator();
        while (it2.hasNext()) {
            it2.next().onBind();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TagMultiHandler@6c09.onBind$1$1");
        return unit;
    }

    public static final Object call$4(ACallableS249S0200000_21 aCallableS249S0200000_21) {
        C1C7U.LIZ("TagMultiHandler@6c09.onUnBind$1$1");
        ((C1393500mMm) aCallableS249S0200000_21.l0).LIZIZ();
        Iterator<InterfaceC1393560mMs> it2 = ((C712520RxC) aCallableS249S0200000_21.l1).LJIILL().iterator();
        while (it2.hasNext()) {
            it2.next().LJJJJZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TagMultiHandler@6c09.onUnBind$1$1");
        return unit;
    }

    public static final Object call$5(ACallableS249S0200000_21 aCallableS249S0200000_21) {
        String strReplaceAll;
        Object objLIZLLL;
        C1C7U.LIZ("CopyAwemeAction@bfc7.execute$disposable$1");
        String str = ((BaseSharePackage) aCallableS249S0200000_21.l0).itemType;
        ShareInfo shareInfo = ((C1375970luV) aCallableS249S0200000_21.l1).LLILLL.getShareInfo();
        if (shareInfo == null) {
            objLIZLLL = "";
        } else {
            String shareUrl = shareInfo.getShareUrl();
            if (!TextUtils.isEmpty(shareUrl) && !shareUrl.contains("utm_source")) {
                C0XI4 c0xi4 = new C0XI4(shareUrl);
                c0xi4.LJ("utm_source", "copy_link");
                c0xi4.LJ("utm_campaign", "client_share");
                c0xi4.LJ("utm_medium", "android");
                c0xi4.LJ("app", "musically");
                c0xi4.LJ("iid", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId());
                c0xi4.LJ("ugbiz_name", C1375910luP.LIZIZ(str));
                String strLIZIZ = C0XJW.LIZIZ();
                if (!TextUtils.isEmpty(strLIZIZ)) {
                    c0xi4.LJ("ug_btm", strLIZIZ);
                }
                strReplaceAll = c0xi4.LJFF();
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("utm_source=");
                sbLIZ.append("copy_link");
                strReplaceAll = shareUrl.replaceAll("utm_source=\\w*_?\\w?", C2188811AlT.LIZIZ(sbLIZ));
            }
            shareInfo.setShareUrl(strReplaceAll);
            String shareUrl2 = shareInfo.getShareUrl();
            objLIZLLL = shareUrl2;
            if (!C10EU.LJIIIIZZ()) {
                C1375890luN.LIZ.getClass();
                objLIZLLL = C1375890luN.LJ(0, str, "copy_link", shareUrl2).LIZLLL();
            }
        }
        C1C7U.LIZIZ("CopyAwemeAction@bfc7.execute$disposable$1");
        return objLIZLLL;
    }

    public ACallableS249S0200000_21(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
