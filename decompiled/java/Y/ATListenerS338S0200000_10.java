package Y;

import X.C01GW;
import X.C054G;
import X.C0BRL;
import X.C0OBG;
import X.C0PCY;
import X.C0PEM;
import X.C0PM7;
import X.C0PRU;
import X.C0PUO;
import X.C0PV9;
import X.C0QBE;
import X.C0QQA;
import X.C1227904rF;
import X.C1507790pL7;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1DFK;
import X.C1ER1;
import X.C2097608Jq;
import X.C2296808zG;
import X.C23118094a;
import X.C23250099c;
import X.C238400w2;
import X.C2547009yW;
import X.C269160Agk;
import X.C650500PfM;
import X.C659430Ptl;
import X.C663990Q2r;
import X.C688190Qz3;
import X.C688380QzM;
import X.C688470QzV;
import X.C688480QzW;
import X.C786410Ut5;
import X.EnumC645610PTz;
import X.EnumC669620QOi;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchWord;
import com.ss.android.ugc.aweme.search.model.TabOrder;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoFeedbackAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchVisualPhotoFeedbackAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssem;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssemV2;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ATListenerS338S0200000_10 implements View.OnTouchListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            case BdTuring.TYPE_ECAF /* 9 */:
                return onTouch$9(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS338S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final boolean onTouch$0(ATListenerS338S0200000_10 aTListenerS338S0200000_10, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            ((View) aTListenerS338S0200000_10.l0).performClick();
            if (C0BRL.LIZ()) {
                SearchPhotoFeedbackAssem searchPhotoFeedbackAssem = (SearchPhotoFeedbackAssem) aTListenerS338S0200000_10.l1;
                C659430Ptl.LIZ(motionEvent, searchPhotoFeedbackAssem.LLJJJJLIIL, ((SearchPhotoViewModel) searchPhotoFeedbackAssem.LLJJJJ.getValue()).LL, ((SearchPhotoFeedbackAssem) aTListenerS338S0200000_10.l1).LLJJJJJIL);
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS338S0200000_10 aTListenerS338S0200000_10, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            ((View) aTListenerS338S0200000_10.l0).performClick();
            if (C0BRL.LIZ()) {
                SearchVisualPhotoFeedbackAssem searchVisualPhotoFeedbackAssem = (SearchVisualPhotoFeedbackAssem) aTListenerS338S0200000_10.l1;
                C659430Ptl.LIZ(motionEvent, searchVisualPhotoFeedbackAssem.LLJJJJLIIL, ((SearchPhotoViewModel) searchVisualPhotoFeedbackAssem.LLJJJJ.getValue()).LL, ((SearchVisualPhotoFeedbackAssem) aTListenerS338S0200000_10.l1).LLJJJJJIL);
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean onTouch$2(ATListenerS338S0200000_10 aTListenerS338S0200000_10, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 1) {
                ((SearchVideoHolder) aTListenerS338S0200000_10.l0).onClick((View) aTListenerS338S0200000_10.l1);
                if (C0BRL.LIZ()) {
                    ((SearchVideoHolder) aTListenerS338S0200000_10.l0).n4(motionEvent);
                    return false;
                }
                return false;
            }
            if (numValueOf.intValue() == 0) {
                ((SearchVideoHolder) aTListenerS338S0200000_10.l0).LLJJJJLIIL = System.currentTimeMillis();
                ((SearchVideoHolder) aTListenerS338S0200000_10.l0).k7(true);
                return false;
            }
            if (numValueOf.intValue() != 3) {
                return false;
            }
            C1ER1.LIZIZ.LLJJJJJIL(((SearchVideoHolder) aTListenerS338S0200000_10.l0).LLJJJJLIIL, "SearchVideoHolder", true);
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0347 A[PHI: r1
      0x0347: PHI (r1v9 X.0PRC) = (r1v8 X.0PRC), (r1v42 X.0PRC) binds: [B:184:0x0343, B:97:0x0193] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x037c A[PHI: r7
      0x037c: PHI (r7v1 X.0PRC) = (r7v0 X.0PRC), (r7v4 X.0PRC) binds: [B:203:0x0378, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$3(Y.ATListenerS338S0200000_10 r13, android.view.View r14, android.view.MotionEvent r15) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS338S0200000_10.onTouch$3(Y.ATListenerS338S0200000_10, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$4(ATListenerS338S0200000_10 aTListenerS338S0200000_10, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((C238400w2) aTListenerS338S0200000_10.l0).element = System.currentTimeMillis();
            C1ER1.LIZIZ.LLIIJI(((C0QQA) aTListenerS338S0200000_10.l1).getContext(), ((C0QQA) aTListenerS338S0200000_10.l1).getSearchParams());
        } else if (motionEvent.getAction() == 3) {
            C1ER1 c1er1 = C1ER1.LIZIZ;
            c1er1.LLJJJJJIL(((C238400w2) aTListenerS338S0200000_10.l0).element, "comment_related_search", true);
            c1er1.LLLJ("cancel", ((C0QQA) aTListenerS338S0200000_10.l1).LLJJIJIIJIL, "ACTION_CANCEL");
            return false;
        }
        return false;
    }

    public static final boolean onTouch$5(ATListenerS338S0200000_10 aTListenerS338S0200000_10, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == 1 && !C0OBG.LIZIZ((View) aTListenerS338S0200000_10.l0)) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - C0QBE.LIZ > 1200) {
                C0QBE.LIZ = jElapsedRealtime;
                Function1 function1 = (Function1) aTListenerS338S0200000_10.l1;
                if (function1 != null) {
                    function1.invoke((View) aTListenerS338S0200000_10.l0);
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$6(ATListenerS338S0200000_10 aTListenerS338S0200000_10, View view, MotionEvent motionEvent) throws JSONException {
        String str;
        String str2;
        EnumC669620QOi enumC669620QOi;
        ISearchContextAbility iSearchContextAbility;
        C0PCY<C0PM7> c0pcyAk0;
        C0PM7 c0pm7;
        C0PCY<C663990Q2r> c0pcyWw1;
        C663990Q2r c663990Q2r;
        C0PCY<C663990Q2r> c0pcyWw12;
        C663990Q2r c663990Q2r2;
        if (motionEvent.getActionMasked() == 1 && !C0OBG.LIZIZ(view)) {
            C0PV9 c0pv9 = (C0PV9) aTListenerS338S0200000_10.l0;
            EcClickSearchWord ecClickSearchWord = (EcClickSearchWord) aTListenerS338S0200000_10.l1;
            c0pv9.getClass();
            JSONObject jSONObjectPut = new JSONObject().put("enter_group_id", c0pv9.LLILLL).put("enter_product_id", c0pv9.LLILZ);
            C0PUO c0puo = C0PUO.LIZ;
            EnumC645610PTz enumC645610PTz = c0pv9.LLILZIL;
            c0puo.getClass();
            String strJ3 = C786410Ut5.J3(jSONObjectPut.put("card_type", C0PUO.LIZ(enumC645610PTz)).put("enter_group_type", C0PUO.LIZIZ(c0pv9.LLILZIL)));
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c0pv9.itemView.getContext(), "aweme://search/");
            smartRouteBuildRoute.withParam("keyword", ecClickSearchWord.word);
            smartRouteBuildRoute.withParam("enter_method", "ecom_click_search");
            ISearchContextAbility iSearchContextAbility2 = c0pv9.LLILZLL;
            Long lValueOf = null;
            if (iSearchContextAbility2 != null && (c0pcyWw12 = iSearchContextAbility2.Ww1()) != null && (c663990Q2r2 = (C663990Q2r) c0pcyWw12.LIZJ()) != null) {
                str = c663990Q2r2.LL;
            } else {
                str = null;
            }
            smartRouteBuildRoute.withParam("previous_page", str);
            ISearchContextAbility iSearchContextAbility3 = c0pv9.LLILZLL;
            if (iSearchContextAbility3 != null && (c0pcyWw1 = iSearchContextAbility3.Ww1()) != null && (c663990Q2r = (C663990Q2r) c0pcyWw1.LIZJ()) != null) {
                str2 = c663990Q2r.LL;
            } else {
                str2 = null;
            }
            smartRouteBuildRoute.withParam("enter_from", str2);
            ISearchContextAbility iSearchContextAbility4 = c0pv9.LLILZLL;
            if (iSearchContextAbility4 != null && (c0pcyAk0 = iSearchContextAbility4.ak0()) != null && (c0pm7 = (C0PM7) c0pcyAk0.LIZJ()) != null) {
                lValueOf = Long.valueOf(c0pm7.LL);
            }
            smartRouteBuildRoute.withParam("search_session_id", lValueOf);
            smartRouteBuildRoute.withParam("penetrate_info", ecClickSearchWord.penetrateInfo);
            smartRouteBuildRoute.withParam("trending_words_id", c0pv9.LLILLJJLI);
            if (((Boolean) C269160Agk.LIZ.getValue()).booleanValue() && ((iSearchContextAbility = c0pv9.LLILZLL) == null || !C650500PfM.LIZLLL(iSearchContextAbility))) {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                List listLJIILJJIL = C1697810uHb.LJIILJJIL(new TabOrder(EnumC669620QOi.SHOP.getTabName(), 1, 1));
                c1227904rF.getClass();
                smartRouteBuildRoute.withParam("tab_order_list", C1227904rF.LJI(listLJIILJJIL));
            }
            C01GW c01gw = C2547009yW.LIZ;
            if (Intrinsics.LJFF(c01gw.getValue(), "top")) {
                enumC669620QOi = EnumC669620QOi.TOP;
            } else {
                enumC669620QOi = EnumC669620QOi.SHOP;
            }
            EnumC669620QOi enumC669620QOi2 = EnumC669620QOi.SHOP;
            String str3 = "";
            if (enumC669620QOi == enumC669620QOi2) {
                smartRouteBuildRoute.withParam("ec_result_extra_log_params", strJ3);
                smartRouteBuildRoute.withParam("top_product_ids", ecClickSearchWord.productId);
            } else {
                smartRouteBuildRoute.withParam("extraLogParams", strJ3);
                Map[] mapArr = new Map[1];
                Pair[] pairArr = new Pair[3];
                pairArr[0] = new Pair("card_type", 10000);
                pairArr[1] = new Pair("position", 1);
                String str4 = ecClickSearchWord.productId;
                if (str4 == null) {
                    str4 = "";
                }
                pairArr[2] = new Pair("product_id", str4);
                mapArr[0] = C2097608Jq.LJIIJ(pairArr);
                smartRouteBuildRoute.withParam("intervene_cards", C1741890vQh.LJIIIIZZ(C1697810uHb.LJIILJJIL(mapArr)));
            }
            if (Intrinsics.LJFF(c01gw.getValue(), "top")) {
                enumC669620QOi2 = EnumC669620QOi.TOP;
            }
            smartRouteBuildRoute.withParam("target_tab", enumC669620QOi2.getTabName());
            smartRouteBuildRoute.open();
            int layoutPosition = c0pv9.getLayoutPosition();
            String str5 = ecClickSearchWord.word;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = ecClickSearchWord.groupId;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = ecClickSearchWord.imageUrl;
            if (str7 == null) {
                str7 = "";
            }
            String str8 = ecClickSearchWord.productId;
            if (str8 != null) {
                str3 = str8;
            }
            Map mapLIZ = C0PRU.LIZ(c0pv9.LLILLJJLI, c0pv9.LLILLL, c0pv9.LLILZ, c0pv9.LLILZIL, c0pv9.LLILZLL);
            mapLIZ.put("group_id", str6);
            mapLIZ.put("words_position", String.valueOf(layoutPosition));
            mapLIZ.put("words_content", str5);
            mapLIZ.put("picture_content", str7);
            mapLIZ.put("product_id", str3);
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZJ("trending_words_click", mapLIZ);
        }
        return false;
    }

    public static final boolean onTouch$7(ATListenerS338S0200000_10 aTListenerS338S0200000_10, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        boolean z;
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 0) {
                FeedSearchBottomBarAssemV2 feedSearchBottomBarAssemV2 = (FeedSearchBottomBarAssemV2) aTListenerS338S0200000_10.l0;
                C688480QzW c688480QzW = feedSearchBottomBarAssemV2.LLLILZJ;
                VideoItemParams videoItemParams = (VideoItemParams) aTListenerS338S0200000_10.l1;
                feedSearchBottomBarAssemV2.LLLIIIIL = true;
                feedSearchBottomBarAssemV2.LLLF = 0L;
                feedSearchBottomBarAssemV2.LLLIIL = System.currentTimeMillis();
                feedSearchBottomBarAssemV2.LLLIIIL = 0;
                feedSearchBottomBarAssemV2.LLLFFI = motionEvent.getRawX();
                feedSearchBottomBarAssemV2.LLLFZ = motionEvent.getRawY();
                feedSearchBottomBarAssemV2.LLLII = true;
                C1DFK c1dfkLIZ = C23118094a.LIZ();
                feedSearchBottomBarAssemV2.LLLIILIL = c1dfkLIZ;
                C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZ.plus(c1dfkLIZ));
                feedSearchBottomBarAssemV2.getClass();
                C23250099c.LIZLLL(c054gLIZ, null, null, new C688470QzV(feedSearchBottomBarAssemV2, c688480QzW, videoItemParams, null), 3);
            } else if (numValueOf.intValue() != 3 && numValueOf.intValue() != 1) {
                if (numValueOf.intValue() == 2) {
                    FeedSearchBottomBarAssemV2 feedSearchBottomBarAssemV22 = (FeedSearchBottomBarAssemV2) aTListenerS338S0200000_10.l0;
                    feedSearchBottomBarAssemV22.LLLIIIL++;
                    if (feedSearchBottomBarAssemV22.LLLIIIIL) {
                        feedSearchBottomBarAssemV22.LLLIIII = System.currentTimeMillis();
                        feedSearchBottomBarAssemV22.LLLIIIIL = false;
                    }
                    feedSearchBottomBarAssemV22.LLLFF = true;
                    float fAbs = Math.abs(feedSearchBottomBarAssemV22.LLLFFI - motionEvent.getRawX());
                    float fAbs2 = Math.abs(feedSearchBottomBarAssemV22.LLLFZ - motionEvent.getRawY());
                    float f = feedSearchBottomBarAssemV22.LLLI;
                    if ((fAbs > f && fAbs > fAbs2) || (fAbs2 > f && fAbs2 > fAbs)) {
                        feedSearchBottomBarAssemV22.LLLII = false;
                        return false;
                    }
                }
            } else {
                if (motionEvent.getAction() == 3) {
                    z = true;
                } else {
                    z = false;
                }
                C1ER1 c1er1 = C1ER1.LIZIZ;
                FeedSearchBottomBarAssemV2 feedSearchBottomBarAssemV23 = (FeedSearchBottomBarAssemV2) aTListenerS338S0200000_10.l0;
                c1er1.LJLI(feedSearchBottomBarAssemV23.LLLIIIL, "related_search_anchor_v2", z, feedSearchBottomBarAssemV23.LLLILZJ.LIZ, feedSearchBottomBarAssemV23.LLLF, feedSearchBottomBarAssemV23.LLLIIII - feedSearchBottomBarAssemV23.LLLIIL);
                ((FeedSearchBottomBarAssemV2) aTListenerS338S0200000_10.l0).LLLIILIL.LIZIZ(null);
                return false;
            }
        }
        return false;
    }

    public static final boolean onTouch$8(ATListenerS338S0200000_10 aTListenerS338S0200000_10, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        boolean z;
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 0) {
                FeedSearchBottomBarAssem feedSearchBottomBarAssem = (FeedSearchBottomBarAssem) aTListenerS338S0200000_10.l0;
                C688190Qz3 c688190Qz3 = feedSearchBottomBarAssem.LLLLIILL;
                VideoItemParams videoItemParams = (VideoItemParams) aTListenerS338S0200000_10.l1;
                feedSearchBottomBarAssem.LLLJ = true;
                feedSearchBottomBarAssem.LLLIIL = 0L;
                feedSearchBottomBarAssem.LLLJL = System.currentTimeMillis();
                feedSearchBottomBarAssem.LLLJIL = 0;
                feedSearchBottomBarAssem.LLLIL = motionEvent.getRawX();
                feedSearchBottomBarAssem.LLLILZ = motionEvent.getRawY();
                if (feedSearchBottomBarAssem.LLLLLIL) {
                    feedSearchBottomBarAssem.LLLLLJLJLL = Float.valueOf(motionEvent.getRawX());
                    feedSearchBottomBarAssem.LLLLLL = Float.valueOf(motionEvent.getY());
                }
                feedSearchBottomBarAssem.LLLILZLLLI = true;
                C1DFK c1dfkLIZ = C23118094a.LIZ();
                feedSearchBottomBarAssem.LLLL = c1dfkLIZ;
                C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZ.plus(c1dfkLIZ));
                feedSearchBottomBarAssem.getClass();
                C23250099c.LIZLLL(c054gLIZ, null, null, new C688380QzM(feedSearchBottomBarAssem, c688190Qz3, videoItemParams, null), 3);
            } else if (numValueOf.intValue() != 3 && numValueOf.intValue() != 1) {
                if (numValueOf.intValue() == 2) {
                    FeedSearchBottomBarAssem feedSearchBottomBarAssem2 = (FeedSearchBottomBarAssem) aTListenerS338S0200000_10.l0;
                    feedSearchBottomBarAssem2.LLLJIL++;
                    if (feedSearchBottomBarAssem2.LLLJ) {
                        feedSearchBottomBarAssem2.LLLIZZ = System.currentTimeMillis();
                        feedSearchBottomBarAssem2.LLLJ = false;
                    }
                    feedSearchBottomBarAssem2.LLLIILIL = true;
                    float fAbs = Math.abs(feedSearchBottomBarAssem2.LLLIL - motionEvent.getRawX());
                    float fAbs2 = Math.abs(feedSearchBottomBarAssem2.LLLILZ - motionEvent.getRawY());
                    float f = feedSearchBottomBarAssem2.LLLILZJ;
                    if ((fAbs > f && fAbs > fAbs2) || (fAbs2 > f && fAbs2 > fAbs)) {
                        feedSearchBottomBarAssem2.LLLILZLLLI = false;
                        return false;
                    }
                }
            } else {
                if (motionEvent.getAction() == 3) {
                    z = true;
                } else {
                    z = false;
                }
                FeedSearchBottomBarAssem feedSearchBottomBarAssem3 = (FeedSearchBottomBarAssem) aTListenerS338S0200000_10.l0;
                if (feedSearchBottomBarAssem3.LLLLLIL && !z) {
                    feedSearchBottomBarAssem3.LLLLLJLJLL = Float.valueOf(motionEvent.getRawX());
                    feedSearchBottomBarAssem3.LLLLLL = Float.valueOf(motionEvent.getY());
                }
                C1ER1 c1er1 = C1ER1.LIZIZ;
                FeedSearchBottomBarAssem feedSearchBottomBarAssem4 = (FeedSearchBottomBarAssem) aTListenerS338S0200000_10.l0;
                c1er1.LJLI(feedSearchBottomBarAssem4.LLLJIL, "related_search_anchor_v2", z, feedSearchBottomBarAssem4.LLLLIILL.LIZJ, feedSearchBottomBarAssem4.LLLIIL, feedSearchBottomBarAssem4.LLLIZZ - feedSearchBottomBarAssem4.LLLJL);
                ((FeedSearchBottomBarAssem) aTListenerS338S0200000_10.l0).LLLL.LIZIZ(null);
                return false;
            }
        }
        return false;
    }

    public static final boolean onTouch$9(ATListenerS338S0200000_10 aTListenerS338S0200000_10, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            ((SearchVideoHolder) aTListenerS338S0200000_10.l0).onClick((View) aTListenerS338S0200000_10.l1);
            ((SearchVideoHolder) aTListenerS338S0200000_10.l0).n4(motionEvent);
            return false;
        }
        return false;
    }
}
