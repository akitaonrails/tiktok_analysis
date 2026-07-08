package Y;

import X.AbstractC848400XPy;
import X.C013C;
import X.C0BM0;
import X.C0OM1;
import X.C0XQ7;
import X.C1169150gWv;
import X.C1169160gWw;
import X.C1169370gXH;
import X.C1171630gav;
import X.C1173300gdc;
import X.C1174830gg5;
import X.C1175120ggY;
import X.C1182380gsG;
import X.C1182410gsJ;
import X.C1184480gve;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1185490gxH;
import X.C1185600gxS;
import X.C1188440h22;
import X.C1189060h32;
import X.C1189290h3P;
import X.C1191160h6Q;
import X.C1191360h6k;
import X.C1191630h7B;
import X.C1191650h7D;
import X.C1191780h7Q;
import X.C1191930h7f;
import X.C1194000hB0;
import X.C1202300hOO;
import X.C123100dR;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1367960lha;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1391190mJ3;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1697810uHb;
import X.C18JG;
import X.C19EG;
import X.C20684815ws;
import X.C2188811AlT;
import X.C259800zU;
import X.C343970De7;
import X.C444920HcY;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC1189990h4X;
import X.EnumC1190240h4w;
import X.InterfaceC1169410gXL;
import X.InterfaceC1171610gat;
import X.InterfaceC1181010gq3;
import X.InterfaceC1191710h7J;
import X.InterfaceC1191840h7W;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionListChooseAssem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistActivityArg;
import com.ss.android.ugc.aweme.mix.profile.entry.PlayListNameCell;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.PoiDetailContentHeaderRegionalWithIntroAssemBase;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.reviews.HandleMoreButtonClickAbility;
import com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiMergedListItemReviewCell;
import com.ss.android.ugc.aweme.poi.recommendfeature.list.component.navbar.PoiRecommendFeatureNavBarAbout;
import com.ss.android.ugc.aweme.poi.recommendfeature.list.component.navbar.PoiRecommendFeatureNavBarAssem;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiDetailReviewListItemCellV0;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsListItemCell;
import com.ss.android.ugc.aweme.poi.reviews.landing.ui.PoiReviewsUserLevelSheetFragment;
import com.ss.android.ugc.aweme.poi.reviews.model.PoiReviewsMobParams;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes19.dex */
public class ACListenerS84S0300000_18 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onClick$11(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS84S0300000_18 aCListenerS84S0300000_18, View view) {
        String str;
        Integer num = ((CollectionDetail) aCListenerS84S0300000_18.l0).type;
        if (num != null && num.intValue() == 1 && ((str = ((CollectionDetail) aCListenerS84S0300000_18.l0).id) == null || str.length() == 0)) {
            ((InterfaceC1171610gat) ((CollectionListChooseAssem) aCListenerS84S0300000_18.l1).LLJ.getValue()).nh((CollectionDetail) aCListenerS84S0300000_18.l0);
        } else {
            ((InterfaceC1171610gat) ((CollectionListChooseAssem) aCListenerS84S0300000_18.l1).LLJ.getValue()).bs((CollectionDetail) aCListenerS84S0300000_18.l0);
        }
        Integer num2 = ((CollectionDetail) aCListenerS84S0300000_18.l0).type;
        if (num2 != null && num2.intValue() == 1 && ((CollectionListChooseAssem) aCListenerS84S0300000_18.l1).Go().LLILZ) {
            C1367960lha.LIZ.getClass();
            C1367960lha.LIZ().onWantToGoClick();
        }
        ((C1171630gav) aCListenerS84S0300000_18.l2).I5("click_favourite_collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.sheet.TuxSheet] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.widget.TextView] */
    public static final void onClick$1(ACListenerS84S0300000_18 aCListenerS84S0300000_18, View view) {
        Context context;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        int iLJJJ;
        final int iIntValue;
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiRecommendFeatureNavBarAssem) aCListenerS84S0300000_18.l0);
        c1185430gxB.getClass();
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7zLJIIL);
        C1189060h32.LJJ("ttls_btn_name", "about", linkedHashMap);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_poi_top_expand_btn_click", linkedHashMap, null);
        DialogFragment dialogFragment = (DialogFragment) ((C259800zU) aCListenerS84S0300000_18.l1).element;
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        PoiRecommendFeatureNavBarAssem poiRecommendFeatureNavBarAssem = (PoiRecommendFeatureNavBarAssem) aCListenerS84S0300000_18.l0;
        PoiRecommendFeatureNavBarAbout poiRecommendFeatureNavBarAbout = (PoiRecommendFeatureNavBarAbout) aCListenerS84S0300000_18.l2;
        TuxNavBar tuxNavBar = poiRecommendFeatureNavBarAssem.LLJJI;
        if (tuxNavBar != null && (context = tuxNavBar.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            ?? r1 = 0;
            r1 = 0;
            r1 = 0;
            r1 = 0;
            r1 = 0;
            r1 = 0;
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e70, null, false);
            ?? r9 = (TextView) viewTd.findViewById(R.id.ra8);
            if (r9 != 0) {
                String str = poiRecommendFeatureNavBarAbout.content;
                String str2 = "";
                ?? spannableString = str;
                if (str == null) {
                    spannableString = "";
                }
                String str3 = poiRecommendFeatureNavBarAbout.linkTextKey;
                String str4 = poiRecommendFeatureNavBarAbout.linkText;
                if (str4 == null) {
                    str4 = "";
                }
                final String str5 = poiRecommendFeatureNavBarAbout.linkUrl;
                if (str5 == null) {
                    str5 = "";
                }
                if (str3 != null && str3.length() != 0 && str4.length() != 0 && str5.length() != 0 && a0.LJJIIZI(spannableString, str3, false)) {
                    String strLJJIFFI = u.LJJIFFI(spannableString, str3, str4, false);
                    spannableString = new SpannableString(strLJJIFFI);
                    int length = 0;
                    while (length <= strLJJIFFI.length() && (iLJJJ = a0.LJJJ(strLJJIFFI, str4, length, r1, 4)) >= 0) {
                        length = str4.length() + iLJJJ;
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, context);
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        C786410Ut5.p2(spannableString, new ClickableSpan() { // from class: X.0392
                            @Override // android.text.style.ClickableSpan
                            public final void onClick(View view2) {
                                SmartRouter.buildRoute(view2.getContext(), str5).open();
                            }

                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                            public final void updateDrawState(TextPaint textPaint) {
                                super.updateDrawState(textPaint);
                                textPaint.setColor(iIntValue);
                                textPaint.setUnderlineText(false);
                            }
                        }, iLJJJ, length, 33);
                        C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), iLJJJ, length, 33);
                        C786410Ut5.p2(spannableString, new C444920HcY(42, false), iLJJJ, length, 33);
                        r1 = 0;
                    }
                }
                r9.setText(spannableString);
                r9.setMovementMethod(LinkMovementMethod.getInstance());
                r9.setHighlightColor(r1);
                C259800zU c259800zU = new C259800zU();
                C1390920mIc c1390920mIc = new C1390920mIc(r1, r1);
                C0OM1 c0om1 = new C0OM1();
                C1250250idj c1250250idj = new C1250250idj();
                String str6 = poiRecommendFeatureNavBarAbout.title;
                if (str6 != null) {
                    str2 = str6;
                }
                c1250250idj.LIZJ = str2;
                c0om1.LIZJ = c1250250idj;
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
                c1251150ifB.LIZJ(new AwS556S0100000_12(c259800zU, (C259800zU<TuxSheet>) 687));
                c0om1.LIZIZ(c1251150ifB);
                c0om1.LIZLLL = false;
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJIL = c0om1;
                tuxSheet.LLJJJ = null;
                tuxSheet.LLJJIII = viewTd;
                tuxSheet.LLJLL = true;
                c1390920mIc.LJIIIIZZ(0);
                c1390920mIc.LIZ(0.73f);
                ?? r12 = c1390920mIc.LIZ;
                r12.LLJLILLLLZIIL = false;
                c259800zU.element = r12;
                r12.show(supportFragmentManager, "PoiRecFeatureNavBarAboutSheet");
            }
        }
    }

    public static final void onClick$10(ACListenerS84S0300000_18 aCListenerS84S0300000_18, View view) {
        PoiReviewsApi.PoiReviewModel poiReviewModelLJIL;
        boolean zLJFF;
        String strLJJLIIIJJI;
        InterfaceC1191840h7W interfaceC1191840h7W = ((C1191630h7B) aCListenerS84S0300000_18.l0).LIZLLL;
        if (interfaceC1191840h7W != null && (poiReviewModelLJIL = interfaceC1191840h7W.LJIL()) != null && !((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1).isAnonymous()) {
            PoiReviewsApi.PoiReviewUserModel author = ((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1).getAuthor();
            if (author != null) {
                zLJFF = Intrinsics.LJFF(author.redirectReviewCenter, Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            String str = null;
            if (zLJFF) {
                C1191630h7B c1191630h7B = (C1191630h7B) aCListenerS84S0300000_18.l0;
                Context context = view.getContext();
                InterfaceC1191710h7J interfaceC1191710h7JLJIILIIL = ((C1191630h7B) aCListenerS84S0300000_18.l0).LJIILIIL();
                if (interfaceC1191710h7JLJIILIIL != null) {
                    strLJJLIIIJJI = interfaceC1191710h7JLJIILIIL.LJJLIIIJJI();
                } else {
                    strLJJLIIIJJI = null;
                }
                String poiId = poiReviewModelLJIL.getPoiId();
                PoiReviewsApi.PoiReviewUserModel author2 = poiReviewModelLJIL.getAuthor();
                if (author2 != null) {
                    str = author2.userId;
                }
                c1191630h7B.LJIILL("click_head", context, strLJJLIIIJJI, poiId, str, ((C1191650h7D) aCListenerS84S0300000_18.l2).getActiveAvatarView());
                return;
            }
            C1191630h7B c1191630h7B2 = (C1191630h7B) aCListenerS84S0300000_18.l0;
            PoiReviewsApi.PoiReviewUserModel author3 = poiReviewModelLJIL.getAuthor();
            if (author3 != null) {
                str = author3.userId;
            }
            c1191630h7B2.LJIILJJIL("click_review_name", str, view.getContext(), poiReviewModelLJIL.getReviewId(), (PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$11(ACListenerS84S0300000_18 aCListenerS84S0300000_18, View view) {
        C1185600gxS c1185600gxS;
        Boolean boolValueOf;
        String fromGroupId;
        String initialEnterFrom;
        String initialEnterMethod;
        String initialPoiFromGroupId;
        String initialPoiId;
        String enterFrom;
        String enterMethod;
        String groupId;
        String str;
        int iLongValue;
        Integer numValueOf;
        String str2;
        int value;
        String fromGroupId2;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        String str3;
        Long l;
        C1185490gxH c1185490gxH;
        C1185410gx9 c1185410gx9;
        C1185410gx9 c1185410gx92;
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ;
        C1173300gdc c1173300gdcQr0;
        PoiMergedListItemReviewCell poiMergedListItemReviewCell = (PoiMergedListItemReviewCell) aCListenerS84S0300000_18.l0;
        C1189290h3P c1189290h3P = (C1189290h3P) aCListenerS84S0300000_18.l1;
        boolean z = ((C013C) aCListenerS84S0300000_18.l2).element;
        Context context = poiMergedListItemReviewCell.getContext();
        if (context != null) {
            PoiListApi.PoiReviewCardModel poiReviewCardModel = c1189290h3P.LL;
            Fragment fragmentLJI = C724240Sb0.LJI(poiMergedListItemReviewCell);
            InterfaceC665370Q7z interfaceC665370Q7zLJFF2 = null;
            if (fragmentLJI != null && (interfaceC1181010gq3LIZ = C1174830gg5.LIZ(fragmentLJI)) != null && (c1173300gdcQr0 = interfaceC1181010gq3LIZ.qr0()) != null) {
                c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ;
            } else {
                c1185600gxS = null;
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//poi/review_list");
            String str4 = poiReviewCardModel.poiId;
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            smartRouteBuildRoute.withParam("poi_id", str4);
            String[] strArr = new String[1];
            String str6 = poiReviewCardModel.reviewId;
            if (str6 == null) {
                str6 = "";
            }
            strArr[0] = str6;
            smartRouteBuildRoute.withParamStringList("pin_reviews_ids", C1697810uHb.LJ(strArr));
            smartRouteBuildRoute.withParam("enter_from", "poi_detail");
            smartRouteBuildRoute.withParam("enter_method", "click_review");
            if (c1185600gxS != null) {
                boolValueOf = Boolean.valueOf(c1185600gxS.LIZJ);
            } else {
                boolValueOf = null;
            }
            smartRouteBuildRoute.withParam("poi_detail_in_sheet_mode", boolValueOf);
            C1185410gx9 c1185410gx9L5 = poiMergedListItemReviewCell.L5();
            if (c1185410gx9L5 == null || (fromGroupId = c1185410gx9L5.getFromGroupId()) == null) {
                fromGroupId = "";
            }
            smartRouteBuildRoute.withParam("from_group_id", fromGroupId);
            C1185410gx9 c1185410gx9L52 = poiMergedListItemReviewCell.L5();
            if (c1185410gx9L52 == null || (initialEnterFrom = c1185410gx9L52.getInitialEnterFrom()) == null) {
                initialEnterFrom = "";
            }
            smartRouteBuildRoute.withParam("initial_poi_enter_from", initialEnterFrom);
            C1185410gx9 c1185410gx9L53 = poiMergedListItemReviewCell.L5();
            if (c1185410gx9L53 == null || (initialEnterMethod = c1185410gx9L53.getInitialEnterMethod()) == null) {
                initialEnterMethod = "";
            }
            smartRouteBuildRoute.withParam("initial_poi_enter_method", initialEnterMethod);
            C1185410gx9 c1185410gx9L54 = poiMergedListItemReviewCell.L5();
            if (c1185410gx9L54 == null || (initialPoiFromGroupId = c1185410gx9L54.getInitialPoiFromGroupId()) == null) {
                initialPoiFromGroupId = "";
            }
            smartRouteBuildRoute.withParam("initial_poi_from_group_id", initialPoiFromGroupId);
            C1185410gx9 c1185410gx9L55 = poiMergedListItemReviewCell.L5();
            if (c1185410gx9L55 == null || (initialPoiId = c1185410gx9L55.getInitialPoiId()) == null) {
                initialPoiId = "";
            }
            smartRouteBuildRoute.withParam("initial_poi_id", initialPoiId);
            if (c1185600gxS != null && (c1185410gx92 = c1185600gxS.LJFF) != null) {
                enterFrom = c1185410gx92.getEnterFrom();
            } else {
                enterFrom = null;
            }
            smartRouteBuildRoute.withParam("poi_detail_enter_from", enterFrom);
            if (c1185600gxS != null && (c1185410gx9 = c1185600gxS.LJFF) != null) {
                enterMethod = c1185410gx9.getEnterMethod();
            } else {
                enterMethod = null;
            }
            smartRouteBuildRoute.withParam("poi_detail_enter_method", enterMethod);
            if (c1185600gxS != null && (c1185490gxH = c1185600gxS.LJI) != null) {
                groupId = c1185490gxH.getGroupId();
            } else {
                groupId = null;
            }
            smartRouteBuildRoute.withParam("poi_reviews_mob_params", new PoiReviewsMobParams(groupId));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("c6581.d36681_i");
            sbLIZ.append(poiMergedListItemReviewCell.I5(true));
            smartRouteBuildRoute.withParam("source_btm_token", C18JG.LIZ(C2188811AlT.LIZIZ(sbLIZ), PageFinder.via(poiMergedListItemReviewCell.itemView), null));
            Fragment fragmentLJIIJ = C1189060h32.LJIIJ(poiMergedListItemReviewCell);
            if (fragmentLJIIJ != null) {
                interfaceC665370Q7zLJFF2 = C1558360qeg.LJFF(fragmentLJIIJ, null);
            }
            PoiCommonMobParams poiCommonMobParamsLJ = C1182380gsG.LJ(interfaceC665370Q7zLJFF2);
            if (poiCommonMobParamsLJ != null) {
                smartRouteBuildRoute.withParam("poi_common_mob_params", poiCommonMobParamsLJ);
            }
            smartRouteBuildRoute.open();
            C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
            String str7 = poiReviewCardModel.reviewId;
            if (str7 == null) {
                str7 = "";
            }
            PoiReviewsApi.PoiReviewUserModel poiReviewUserModel = poiReviewCardModel.author;
            if (poiReviewUserModel == null || (str = poiReviewUserModel.userId) == null) {
                str = "";
            }
            String str8 = poiReviewCardModel.poiId;
            if (str8 == null) {
                str8 = "";
            }
            String str9 = c1189290h3P.LLILLL;
            if (str9 == null) {
                str9 = "";
            }
            float fLIZIZ = C1175120ggY.LIZIZ(Float.valueOf(PoiMergedListItemReviewCell.N5(poiReviewCardModel)));
            boolean zLIZ = C123100dR.LIZ(poiReviewCardModel.text);
            int iI5 = poiMergedListItemReviewCell.I5(false);
            PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModel = poiReviewCardModel.statistics;
            if (poiReviewStatisticsModel != null && (l = poiReviewStatisticsModel.likeCount) != null) {
                iLongValue = (int) l.longValue();
            } else {
                iLongValue = 0;
            }
            int iLIZJ = C1175120ggY.LIZJ(poiReviewCardModel.imageCount);
            String str10 = poiReviewCardModel.text;
            if (str10 != null) {
                numValueOf = Integer.valueOf(str10.length());
            } else {
                numValueOf = null;
            }
            int iLIZJ2 = C1175120ggY.LIZJ(numValueOf);
            PoiReviewsApi.PoiReviewUserModel poiReviewUserModel2 = poiReviewCardModel.author;
            if (poiReviewUserModel2 != null) {
                str2 = poiReviewUserModel2.reviewUserSource;
            } else {
                str2 = null;
            }
            Integer num = poiReviewCardModel.source;
            if (num != null) {
                value = num.intValue();
            } else {
                value = EnumC1190240h4w.PoiReviewSource_TikTok.getValue();
            }
            String str11 = c1189290h3P.LLILLJJLI;
            String str12 = poiReviewCardModel.textLang;
            C1185410gx9 c1185410gx9L56 = poiMergedListItemReviewCell.L5();
            if (c1185410gx9L56 != null) {
                fromGroupId2 = c1185410gx9L56.getFromGroupId();
            } else {
                fromGroupId2 = null;
            }
            Fragment fragmentLJIIJ2 = C1189060h32.LJIIJ(poiMergedListItemReviewCell);
            if (fragmentLJIIJ2 != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ2, null);
            } else {
                interfaceC665370Q7zLJFF = null;
            }
            PageFinder pageFinderVia = PageFinder.via(C1189060h32.LJIIJ(poiMergedListItemReviewCell));
            c1191160h6Q.getClass();
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7zLJFF);
            linkedHashMap.put("enter_from", "poi_detail");
            linkedHashMap.put("review_id", str7);
            linkedHashMap.put("author_id", str);
            linkedHashMap.put("poi_id", str8);
            C1189060h32.LIZ(str9, linkedHashMap);
            C1191160h6Q.LIZ(linkedHashMap);
            linkedHashMap.put("rating", String.valueOf(fLIZIZ));
            linkedHashMap.put("has_text", String.valueOf(zLIZ ? 1 : 0));
            linkedHashMap.put("order", String.valueOf(iI5));
            linkedHashMap.put("like_cnt", String.valueOf(iLongValue));
            linkedHashMap.put("image_cnt", String.valueOf(iLIZJ));
            linkedHashMap.put("char_len", String.valueOf(iLIZJ2));
            if (str2 == null) {
                str2 = "normal";
            }
            linkedHashMap.put("author_status", str2);
            linkedHashMap.put("source", String.valueOf(value));
            if (str11 == null) {
                str11 = "";
            }
            linkedHashMap.put("log_id", str11);
            if (str12 == null) {
                str12 = "";
            }
            linkedHashMap.put("review_lang", str12);
            if (z) {
                str3 = "translated";
            } else {
                str3 = "original";
            }
            linkedHashMap.put("translate_status", str3);
            if (fromGroupId2 != null) {
                str5 = fromGroupId2;
            }
            linkedHashMap.put("from_group_id", str5);
            C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
            c1185040gwY.getClass();
            C1185040gwY.LJFF("click_poi_review_item", linkedHashMap, c1185050gwZ);
        }
    }

    public static final void onClick$2(ACListenerS84S0300000_18 aCListenerS84S0300000_18, View view) {
        String fromGroupId;
        String collectInfo;
        C1188440h22 c1188440h22;
        C1202300hOO c1202300hOO = (C1202300hOO) aCListenerS84S0300000_18.l0;
        if (c1202300hOO.LLJZIJLIL && c1202300hOO.getCollapsed()) {
            C786410Ut5.LJLLLLLL(0, (View) aCListenerS84S0300000_18.l1);
            ((C1202300hOO) view).setExpanded$poi_release(true);
            PoiDetailContentHeaderRegionalWithIntroAssemBase poiDetailContentHeaderRegionalWithIntroAssemBase = (PoiDetailContentHeaderRegionalWithIntroAssemBase) aCListenerS84S0300000_18.l2;
            poiDetailContentHeaderRegionalWithIntroAssemBase.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("enter_from", "poi_detail");
            String str = poiDetailContentHeaderRegionalWithIntroAssemBase.Jo().LL;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("poi_id", str);
            C1184480gve c1184480gve = poiDetailContentHeaderRegionalWithIntroAssemBase.Jo().LLILLL;
            if (c1184480gve == null || (c1188440h22 = c1184480gve.LLILZLL) == null || (fromGroupId = c1188440h22.getFromGroupId()) == null) {
                fromGroupId = "";
            }
            linkedHashMap.put("from_group_id", fromGroupId);
            PoiListApi.PoiDetailResponse poiDetailResponse = poiDetailContentHeaderRegionalWithIntroAssemBase.Jo().LLILLJJLI;
            if (poiDetailResponse != null && (collectInfo = poiDetailResponse.getCollectInfo()) != null) {
                str2 = collectInfo;
            }
            C1189060h32.LIZ(str2, linkedHashMap);
            C20684815ws.LJIILLIIL("click_to_show_more_introduction", linkedHashMap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0165 A[PHI: r19 r20 r21 r22 r23 r24
      0x0165: PHI (r19v7 java.lang.String) = (r19v6 java.lang.String), (r19v13 java.lang.String) binds: [B:100:0x0162, B:62:0x00e9] A[DONT_GENERATE, DONT_INLINE]
      0x0165: PHI (r20v6 java.lang.String) = (r20v5 java.lang.String), (r20v12 java.lang.String) binds: [B:100:0x0162, B:62:0x00e9] A[DONT_GENERATE, DONT_INLINE]
      0x0165: PHI (r21v6 java.lang.String) = (r21v5 java.lang.String), (r21v12 java.lang.String) binds: [B:100:0x0162, B:62:0x00e9] A[DONT_GENERATE, DONT_INLINE]
      0x0165: PHI (r22v5 java.lang.String) = (r22v4 java.lang.String), (r22v11 java.lang.String) binds: [B:100:0x0162, B:62:0x00e9] A[DONT_GENERATE, DONT_INLINE]
      0x0165: PHI (r23v4 java.lang.String) = (r23v3 java.lang.String), (r23v10 java.lang.String) binds: [B:100:0x0162, B:62:0x00e9] A[DONT_GENERATE, DONT_INLINE]
      0x0165: PHI (r24v2 java.lang.String) = (r24v1 java.lang.String), (r24v8 java.lang.String) binds: [B:100:0x0162, B:62:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016a A[PHI: r16 r19 r20 r21 r22 r23 r24
      0x016a: PHI (r16v2 java.lang.String) = (r16v1 java.lang.String), (r16v6 java.lang.String) binds: [B:103:0x0167, B:65:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x016a: PHI (r19v8 java.lang.String) = (r19v7 java.lang.String), (r19v12 java.lang.String) binds: [B:103:0x0167, B:65:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x016a: PHI (r20v7 java.lang.String) = (r20v6 java.lang.String), (r20v11 java.lang.String) binds: [B:103:0x0167, B:65:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x016a: PHI (r21v7 java.lang.String) = (r21v6 java.lang.String), (r21v11 java.lang.String) binds: [B:103:0x0167, B:65:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x016a: PHI (r22v6 java.lang.String) = (r22v5 java.lang.String), (r22v10 java.lang.String) binds: [B:103:0x0167, B:65:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x016a: PHI (r23v5 java.lang.String) = (r23v4 java.lang.String), (r23v9 java.lang.String) binds: [B:103:0x0167, B:65:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x016a: PHI (r24v3 java.lang.String) = (r24v2 java.lang.String), (r24v7 java.lang.String) binds: [B:103:0x0167, B:65:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016f A[PHI: r16 r17 r19 r20 r21 r22 r23 r24
      0x016f: PHI (r16v3 java.lang.String) = (r16v2 java.lang.String), (r16v5 java.lang.String) binds: [B:106:0x016c, B:68:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r17v2 java.lang.String) = (r17v1 java.lang.String), (r17v4 java.lang.String) binds: [B:106:0x016c, B:68:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r19v9 java.lang.String) = (r19v8 java.lang.String), (r19v11 java.lang.String) binds: [B:106:0x016c, B:68:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r20v8 java.lang.String) = (r20v7 java.lang.String), (r20v10 java.lang.String) binds: [B:106:0x016c, B:68:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r21v8 java.lang.String) = (r21v7 java.lang.String), (r21v10 java.lang.String) binds: [B:106:0x016c, B:68:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r22v7 java.lang.String) = (r22v6 java.lang.String), (r22v9 java.lang.String) binds: [B:106:0x016c, B:68:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r23v6 java.lang.String) = (r23v5 java.lang.String), (r23v8 java.lang.String) binds: [B:106:0x016c, B:68:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r24v4 java.lang.String) = (r24v3 java.lang.String), (r24v6 java.lang.String) binds: [B:106:0x016c, B:68:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0149 A[PHI: r19
      0x0149: PHI (r19v2 java.lang.String) = (r19v1 java.lang.String), (r19v18 java.lang.String) binds: [B:85:0x0145, B:47:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014f A[PHI: r19 r20
      0x014f: PHI (r19v3 java.lang.String) = (r19v2 java.lang.String), (r19v17 java.lang.String) binds: [B:88:0x014b, B:50:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r20v2 java.lang.String) = (r20v1 java.lang.String), (r20v16 java.lang.String) binds: [B:88:0x014b, B:50:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0155 A[PHI: r19 r20 r21
      0x0155: PHI (r19v4 java.lang.String) = (r19v3 java.lang.String), (r19v16 java.lang.String) binds: [B:91:0x0151, B:53:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x0155: PHI (r20v3 java.lang.String) = (r20v2 java.lang.String), (r20v15 java.lang.String) binds: [B:91:0x0151, B:53:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x0155: PHI (r21v3 java.lang.String) = (r21v2 java.lang.String), (r21v15 java.lang.String) binds: [B:91:0x0151, B:53:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015b A[PHI: r19 r20 r21 r22
      0x015b: PHI (r19v5 java.lang.String) = (r19v4 java.lang.String), (r19v15 java.lang.String) binds: [B:94:0x0157, B:56:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r20v4 java.lang.String) = (r20v3 java.lang.String), (r20v14 java.lang.String) binds: [B:94:0x0157, B:56:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r21v4 java.lang.String) = (r21v3 java.lang.String), (r21v14 java.lang.String) binds: [B:94:0x0157, B:56:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r22v3 java.lang.String) = (r22v2 java.lang.String), (r22v13 java.lang.String) binds: [B:94:0x0157, B:56:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0160 A[PHI: r19 r20 r21 r22 r23
      0x0160: PHI (r19v6 java.lang.String) = (r19v5 java.lang.String), (r19v14 java.lang.String) binds: [B:97:0x015d, B:59:0x00e1] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r20v5 java.lang.String) = (r20v4 java.lang.String), (r20v13 java.lang.String) binds: [B:97:0x015d, B:59:0x00e1] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r21v5 java.lang.String) = (r21v4 java.lang.String), (r21v13 java.lang.String) binds: [B:97:0x015d, B:59:0x00e1] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r22v4 java.lang.String) = (r22v3 java.lang.String), (r22v12 java.lang.String) binds: [B:97:0x015d, B:59:0x00e1] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r23v3 java.lang.String) = (r23v2 java.lang.String), (r23v11 java.lang.String) binds: [B:97:0x015d, B:59:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$3(Y.ACListenerS84S0300000_18 r29, android.view.View r30) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS84S0300000_18.onClick$3(Y.ACListenerS84S0300000_18, android.view.View):void");
    }

    public static final void onClick$4(ACListenerS84S0300000_18 aCListenerS84S0300000_18, View view) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cell expanded: ");
        sbLIZ.append(((C1202300hOO) aCListenerS84S0300000_18.l0).LLJZIJLIL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1).getScene() == EnumC1189990h4X.POI_DETAIL_PAGE && C1191360h6k.LIZ()) {
            C1202300hOO c1202300hOO = (C1202300hOO) aCListenerS84S0300000_18.l0;
            String str = "";
            if (c1202300hOO.LLJZIJLIL) {
                HandleMoreButtonClickAbility handleMoreButtonClickAbility = (HandleMoreButtonClickAbility) C1558520qew.LIZ(C1558360qeg.LJ(c1202300hOO, null), HandleMoreButtonClickAbility.class, null);
                if (handleMoreButtonClickAbility != null) {
                    String reviewId = ((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1).getReviewId();
                    if (reviewId != null) {
                        str = reviewId;
                    }
                    handleMoreButtonClickAbility.sf0("click_more", str, null);
                }
                ((PoiDetailReviewListItemCellV0) aCListenerS84S0300000_18.l2).b6();
                ((PoiDetailReviewListItemCellV0) aCListenerS84S0300000_18.l2).T5();
                return;
            }
            HandleMoreButtonClickAbility handleMoreButtonClickAbility2 = (HandleMoreButtonClickAbility) C1558520qew.LIZ(C1558360qeg.LJ(c1202300hOO, null), HandleMoreButtonClickAbility.class, null);
            if (handleMoreButtonClickAbility2 == null) {
                return;
            }
            String reviewId2 = ((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1).getReviewId();
            if (reviewId2 != null) {
                str = reviewId2;
            }
            handleMoreButtonClickAbility2.sf0("click_text", str, null);
            return;
        }
        C1202300hOO c1202300hOO2 = (C1202300hOO) aCListenerS84S0300000_18.l0;
        if (!c1202300hOO2.LLJZIJLIL) {
            return;
        }
        if (!c1202300hOO2.getExpanded()) {
            ((PoiDetailReviewListItemCellV0) aCListenerS84S0300000_18.l2).b6();
        }
        ((PoiDetailReviewListItemCellV0) aCListenerS84S0300000_18.l2).T5();
        InterfaceC1191710h7J interfaceC1191710h7J = ((PoiDetailReviewListItemCellV0) aCListenerS84S0300000_18.l2).LL;
        if (interfaceC1191710h7J == null) {
            return;
        }
        interfaceC1191710h7J.UG1((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1);
    }

    public static final void onClick$5(ACListenerS84S0300000_18 aCListenerS84S0300000_18, View view) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cell expanded: ");
        sbLIZ.append(((C1202300hOO) aCListenerS84S0300000_18.l0).LLJZIJLIL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1).getScene() == EnumC1189990h4X.POI_DETAIL_PAGE && C1191360h6k.LIZ()) {
            C1202300hOO c1202300hOO = (C1202300hOO) aCListenerS84S0300000_18.l0;
            String str = "";
            if (c1202300hOO.LLJZIJLIL) {
                HandleMoreButtonClickAbility handleMoreButtonClickAbility = (HandleMoreButtonClickAbility) C1558520qew.LIZ(C1558360qeg.LJ(c1202300hOO, null), HandleMoreButtonClickAbility.class, null);
                if (handleMoreButtonClickAbility != null) {
                    String reviewId = ((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1).getReviewId();
                    if (reviewId != null) {
                        str = reviewId;
                    }
                    handleMoreButtonClickAbility.sf0("click_more", str, null);
                }
                ((PoiReviewsListItemCell) aCListenerS84S0300000_18.l2).e6();
                return;
            }
            HandleMoreButtonClickAbility handleMoreButtonClickAbility2 = (HandleMoreButtonClickAbility) C1558520qew.LIZ(C1558360qeg.LJ(c1202300hOO, null), HandleMoreButtonClickAbility.class, null);
            if (handleMoreButtonClickAbility2 == null) {
                return;
            }
            String reviewId2 = ((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1).getReviewId();
            if (reviewId2 != null) {
                str = reviewId2;
            }
            handleMoreButtonClickAbility2.sf0("click_text", str, null);
            return;
        }
        C1202300hOO c1202300hOO2 = (C1202300hOO) aCListenerS84S0300000_18.l0;
        if (!c1202300hOO2.LLJZIJLIL) {
            return;
        }
        if (!c1202300hOO2.getExpanded()) {
            ((PoiReviewsListItemCell) aCListenerS84S0300000_18.l2).e6();
        }
        ((PoiReviewsListItemCell) aCListenerS84S0300000_18.l2).T5().UG1((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1);
    }

    public static final void onClick$6(ACListenerS84S0300000_18 aCListenerS84S0300000_18, View view) {
        boolean z;
        int i;
        Integer num;
        Integer num2 = ((C1169370gXH) aCListenerS84S0300000_18.l0).LLILLJJLI;
        if (num2 != null && num2.intValue() == 0 && C0BM0.LIZ() && Intrinsics.LJFF(((C1169370gXH) aCListenerS84S0300000_18.l0).LLILZLL, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            C1169160gWw c1169160gWw = C1169160gWw.LIZ;
            String str = ((C1169370gXH) aCListenerS84S0300000_18.l0).LLILZ;
            c1169160gWw.getClass();
            C1169160gWw.LJIILLIIL(str, "playlist");
            C1169370gXH c1169370gXH = (C1169370gXH) aCListenerS84S0300000_18.l0;
            EditPlaylistActivityArg editPlaylistActivityArg = new EditPlaylistActivityArg("profile_playlist_entrance", "", c1169370gXH.LLILZ, c1169370gXH.LL, c1169370gXH.LLILLJJLI, null, c1169370gXH.LLILLL, c1169370gXH.LLILZLL, c1169370gXH.LLIZ, null, null);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((PlayListNameCell) aCListenerS84S0300000_18.l1).getContext(), "//playlist/edit");
            smartRouteBuildRoute.withNavArg(editPlaylistActivityArg);
            smartRouteBuildRoute.open();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C1169370gXH) aCListenerS84S0300000_18.l0).LLILZ);
        sbLIZ.append(System.currentTimeMillis());
        String strValueOf = String.valueOf(C2188811AlT.LIZIZ(sbLIZ).hashCode());
        IMixFeedService iMixFeedService = (IMixFeedService) ServiceManager.get().getService(IMixFeedService.class);
        Context context = ((PlayListNameCell) aCListenerS84S0300000_18.l1).itemView.getContext();
        C1169370gXH c1169370gXH2 = (C1169370gXH) aCListenerS84S0300000_18.l0;
        String str2 = c1169370gXH2.LLJ;
        String str3 = c1169370gXH2.LLILZ;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        String str5 = c1169370gXH2.LLILZLL;
        String str6 = c1169370gXH2.LLIZ;
        if (!c1169370gXH2.LLJI && (num = c1169370gXH2.LLILLJJLI) != null && num.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        iMixFeedService.LJIJ(context, "", null, "from_profile_mix_list", str2, str3, str5, str6, z, (C1169150gWv) aCListenerS84S0300000_18.l2, ((C1169370gXH) aCListenerS84S0300000_18.l0).LLIZLLLIL, null, strValueOf);
        C1169160gWw c1169160gWw2 = C1169160gWw.LIZ;
        C1169370gXH c1169370gXH3 = (C1169370gXH) aCListenerS84S0300000_18.l0;
        String str7 = c1169370gXH3.LLIZLLLIL;
        String str8 = c1169370gXH3.LLILZ;
        if (str8 == null) {
            str8 = "";
        }
        String str9 = c1169370gXH3.LLILZLL;
        String str10 = c1169370gXH3.LLJILJIL;
        if (str10 == null) {
            str10 = "";
        }
        String str11 = c1169370gXH3.LLJILJILJ;
        if (str11 == null) {
            str11 = "";
        }
        String str12 = c1169370gXH3.LLJIJIL;
        if (str12 == null) {
            str12 = "";
        }
        C1169160gWw.LJIILL(c1169160gWw2, str7, str8, str9, null, 0, c1169370gXH3.LLJ, str10, str11, str12, (C1169150gWv) aCListenerS84S0300000_18.l2, null, strValueOf, null, null, 13320);
        C1169370gXH c1169370gXH4 = (C1169370gXH) aCListenerS84S0300000_18.l0;
        String str13 = c1169370gXH4.LLIZLLLIL;
        String str14 = c1169370gXH4.LLILZ;
        if (str14 != null) {
            str4 = str14;
        }
        String str15 = c1169370gXH4.LLILZLL;
        String str16 = c1169370gXH4.LLJ;
        if (c1169370gXH4.LLJJ == 1) {
            i = 1;
        } else {
            i = 0;
        }
        Integer numValueOf = Integer.valueOf(i);
        c1169160gWw2.getClass();
        C1169160gWw.LJIIJJI(str13, str4, "", str15, null, str16, null, null, null, numValueOf);
        C1169370gXH c1169370gXH5 = (C1169370gXH) aCListenerS84S0300000_18.l0;
        InterfaceC1169410gXL interfaceC1169410gXL = c1169370gXH5.LLJJI;
        if (interfaceC1169410gXL == null) {
            return;
        }
        interfaceC1169410gXL.LIZ(Integer.valueOf(((PlayListNameCell) aCListenerS84S0300000_18.l1).getLayoutPosition()), c1169370gXH5.LLILZ, c1169370gXH5.LLILLL);
    }

    public static final void onClick$7(ACListenerS84S0300000_18 aCListenerS84S0300000_18, View view) {
        ((Function1) aCListenerS84S0300000_18.l0).invoke(Integer.valueOf(((C1194000hB0) aCListenerS84S0300000_18.l1).LIZ));
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((View) aCListenerS84S0300000_18.l2, C343970De7.LIZ);
    }

    public static final void onClick$8(ACListenerS84S0300000_18 aCListenerS84S0300000_18, View view) {
        String strO32;
        Context context;
        FragmentManager supportFragmentManager;
        String strLJJLIIIJJI;
        InterfaceC1191710h7J interfaceC1191710h7JLJIILIIL = ((C1191630h7B) aCListenerS84S0300000_18.l0).LJIILIIL();
        String str = null;
        if (interfaceC1191710h7JLJIILIIL != null) {
            strO32 = interfaceC1191710h7JLJIILIIL.o32();
        } else {
            strO32 = null;
        }
        if (Intrinsics.LJFF(strO32, "folding_panel")) {
            return;
        }
        if (((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1).getScene() == EnumC1189990h4X.POI_DETAIL_PAGE) {
            if (C1191930h7f.LIZ()) {
                return;
            }
            PoiReviewsApi.PoiReviewUserModel author = ((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1).getAuthor();
            if (author != null && Intrinsics.LJFF(author.redirectReviewCenter, Boolean.TRUE)) {
                C1191630h7B c1191630h7B = (C1191630h7B) aCListenerS84S0300000_18.l0;
                Context context2 = view.getContext();
                InterfaceC1191710h7J interfaceC1191710h7JLJIILIIL2 = ((C1191630h7B) aCListenerS84S0300000_18.l0).LJIILIIL();
                if (interfaceC1191710h7JLJIILIIL2 != null) {
                    strLJJLIIIJJI = interfaceC1191710h7JLJIILIIL2.LJJLIIIJJI();
                } else {
                    strLJJLIIIJJI = null;
                }
                String poiId = ((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1).getPoiId();
                PoiReviewsApi.PoiReviewUserModel author2 = ((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1).getAuthor();
                if (author2 != null) {
                    str = author2.userId;
                }
                c1191630h7B.LJIILL("click_level", context2, strLJJLIIIJJI, poiId, str, ((C1191650h7D) aCListenerS84S0300000_18.l2).getActiveAvatarView());
                return;
            }
            C1191630h7B c1191630h7B2 = (C1191630h7B) aCListenerS84S0300000_18.l0;
            PoiReviewsApi.PoiReviewUserModel author3 = ((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1).getAuthor();
            if (author3 != null) {
                str = author3.userId;
            }
            c1191630h7B2.LJIILJJIL("click_level", str, view.getContext(), ((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1).getReviewId(), (PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1);
            return;
        }
        View viewLJIIJJI = ((C1191630h7B) aCListenerS84S0300000_18.l0).LJIIJJI();
        if (viewLJIIJJI != null && (context = viewLJIIJJI.getContext()) != null) {
            PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1;
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                C1191780h7Q c1191780h7Q = PoiReviewsUserLevelSheetFragment.LLJJL;
                PoiReviewsApi.PoiReviewUserModel author4 = poiReviewModel.getAuthor();
                if (author4 != null) {
                    str = author4.userId;
                }
                String strValueOf = String.valueOf(str);
                String strValueOf2 = String.valueOf(poiReviewModel.getPoiId());
                String strValueOf3 = String.valueOf(poiReviewModel.getReviewId());
                c1191780h7Q.getClass();
                C1191780h7Q.LIZ(strValueOf, strValueOf2, strValueOf3).show(supportFragmentManager, "reviews_shee_tag");
            }
        }
    }

    public static final void onClick$9(ACListenerS84S0300000_18 aCListenerS84S0300000_18, View view) {
        PoiReviewsApi.PoiReviewModel poiReviewModelLJIL;
        String strLJJLIIIJJI;
        PoiReviewsApi.PoiUserReviewModel poiUserReviewModel;
        String strLJJLIIIJJI2;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        AbstractRefactorPoiReviewCell abstractRefactorPoiReviewCellLLLLLLIL;
        Fragment fragmentLJIIJ;
        InterfaceC1191840h7W interfaceC1191840h7W = ((C1191630h7B) aCListenerS84S0300000_18.l0).LIZLLL;
        if (interfaceC1191840h7W != null && (poiReviewModelLJIL = interfaceC1191840h7W.LJIL()) != null) {
            PoiReviewsApi.PoiReviewUserModel author = ((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1).getAuthor();
            String str = null;
            if (author != null && (poiUserReviewModel = author.userReviewProfileFrame) != null && poiUserReviewModel.badgeUrl != null) {
                C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
                InterfaceC1191710h7J interfaceC1191710h7JLJIILIIL = ((C1191630h7B) aCListenerS84S0300000_18.l0).LJIILIIL();
                if (interfaceC1191710h7JLJIILIIL != null) {
                    strLJJLIIIJJI2 = interfaceC1191710h7JLJIILIIL.LJJLIIIJJI();
                } else {
                    strLJJLIIIJJI2 = null;
                }
                String poiId = ((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1).getPoiId();
                String reviewId = ((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1).getReviewId();
                String str2 = ((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1).getAuthor().userId;
                Integer num = ((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1).getAuthor().userReviewProfileFrame.badgeLevel;
                InterfaceC1191840h7W interfaceC1191840h7W2 = ((C1191630h7B) aCListenerS84S0300000_18.l0).LIZLLL;
                if (interfaceC1191840h7W2 != null && (abstractRefactorPoiReviewCellLLLLLLIL = interfaceC1191840h7W2.LLLLLLIL()) != null && (fragmentLJIIJ = C1189060h32.LJIIJ(abstractRefactorPoiReviewCellLLLLLLIL)) != null) {
                    interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
                } else {
                    interfaceC665370Q7zLJFF = null;
                }
                PageFinder pageFinderLJIIL = ((C1191630h7B) aCListenerS84S0300000_18.l0).LJIIL();
                c1191160h6Q.getClass();
                C1191160h6Q.LJFF(pageFinderLJIIL, interfaceC665370Q7zLJFF, num, strLJJLIIIJJI2, poiId, reviewId, str2);
            }
            if (!((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1).isAnonymous()) {
                PoiReviewsApi.PoiReviewUserModel author2 = ((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1).getAuthor();
                if (author2 != null && Intrinsics.LJFF(author2.redirectReviewCenter, Boolean.TRUE)) {
                    C1191630h7B c1191630h7B = (C1191630h7B) aCListenerS84S0300000_18.l0;
                    Context context = view.getContext();
                    InterfaceC1191710h7J interfaceC1191710h7JLJIILIIL2 = ((C1191630h7B) aCListenerS84S0300000_18.l0).LJIILIIL();
                    if (interfaceC1191710h7JLJIILIIL2 != null) {
                        strLJJLIIIJJI = interfaceC1191710h7JLJIILIIL2.LJJLIIIJJI();
                    } else {
                        strLJJLIIIJJI = null;
                    }
                    String poiId2 = poiReviewModelLJIL.getPoiId();
                    PoiReviewsApi.PoiReviewUserModel author3 = poiReviewModelLJIL.getAuthor();
                    if (author3 != null) {
                        str = author3.userId;
                    }
                    c1191630h7B.LJIILL("click_head", context, strLJJLIIIJJI, poiId2, str, ((C1191650h7D) aCListenerS84S0300000_18.l2).getActiveAvatarView());
                    return;
                }
                if (((PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1).isAnonymous()) {
                    return;
                }
                C1191630h7B c1191630h7B2 = (C1191630h7B) aCListenerS84S0300000_18.l0;
                PoiReviewsApi.PoiReviewUserModel author4 = poiReviewModelLJIL.getAuthor();
                if (author4 != null) {
                    str = author4.userId;
                }
                c1191630h7B2.LJIILJJIL("click_review_head", str, view.getContext(), poiReviewModelLJIL.getReviewId(), (PoiReviewsApi.PoiReviewModel) aCListenerS84S0300000_18.l1);
            }
        }
    }

    public ACListenerS84S0300000_18(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
