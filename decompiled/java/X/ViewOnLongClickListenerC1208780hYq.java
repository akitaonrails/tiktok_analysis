package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAwemePictureInfo;
import com.ss.android.ugc.aweme.poi.PoiDataButtonGroup;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.albummix.feed.PoiPhotoTextRootAssem;
import com.ss.android.ugc.aweme.poi.detail.container.model.ClickEvent;
import com.ss.android.ugc.aweme.poi.detail.container.model.DynamicIcon;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiButton;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiDetailReviewListItemCell;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiDetailReviewListItemCellV0;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsFoldedReviewCell;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsListItemCell;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.RefactorTTReviewCell;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.vendor.RefactorTabelogReviewCell;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.vendor.RefactorTripAdvisorReviewCell;
import com.ss.android.ugc.aweme.poi.reviews.tab.adapter.PoiCommentReviewListItemCell;
import com.ss.android.ugc.aweme.poi.reviews.tab.viewmodel.PoiCommentReviewListVM;
import com.ss.android.ugc.aweme.repostfeed.ui.RepostEmptyPageAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.nearby.feedcard.NearbyFeedCellAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hYq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class ViewOnLongClickListenerC1208780hYq implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            case 4:
                return onLongClick$4(this, view);
            case 5:
                return onLongClick$5(this, view);
            case 6:
                return onLongClick$6(this, view);
            case 7:
                return onLongClick$7(this, view);
            case 8:
                return onLongClick$8(this, view);
            case BdTuring.TYPE_ECAF /* 9 */:
                return onLongClick$9(this, view);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return onLongClick$10(this, view);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return onLongClick$11(this, view);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return onLongClick$12(this, view);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return onLongClick$13(this, view);
            case 14:
                return onLongClick$14(this, view);
            case 15:
                return onLongClick$15(this, view);
            case 16:
                return onLongClick$16(this, view);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return onLongClick$17(this, view);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return onLongClick$18(this, view);
            case 19:
                return onLongClick$19(this, view);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return onLongClick$20(this, view);
            case 21:
                return onLongClick$21(this, view);
            case 22:
                return onLongClick$22(this, view);
            case 23:
                return onLongClick$23(this, view);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return onLongClick$24(this, view);
            case 25:
                return onLongClick$25(this, view);
            case 26:
                return onLongClick$26(this, view);
            case 27:
                return onLongClick$27(this, view);
            case 28:
                return onLongClick$28(this, view);
            case 29:
                return onLongClick$29(this, view);
            case 30:
                return onLongClick$30(this, view);
            case 31:
                return onLongClick$31(this, view);
            case 32:
                return onLongClick$32(this, view);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return onLongClick$33(this, view);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return onLongClick$34(this, view);
            default:
                return false;
        }
    }

    public ViewOnLongClickListenerC1208780hYq(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((PoiDetailReviewListItemCell) viewOnLongClickListenerC1208780hYq.l0).a6();
        return true;
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((PoiDetailReviewListItemCell) viewOnLongClickListenerC1208780hYq.l0).a6();
        return true;
    }

    public static final boolean onLongClick$10(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((PoiReviewsFoldedReviewCell) viewOnLongClickListenerC1208780hYq.l0).V5();
        return true;
    }

    public static final boolean onLongClick$11(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((PoiReviewsListItemCell) viewOnLongClickListenerC1208780hYq.l0).c6();
        return true;
    }

    public static final boolean onLongClick$12(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((PoiReviewsListItemCell) viewOnLongClickListenerC1208780hYq.l0).c6();
        return true;
    }

    public static final boolean onLongClick$13(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((PoiReviewsListItemCell) viewOnLongClickListenerC1208780hYq.l0).c6();
        return true;
    }

    public static final boolean onLongClick$14(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((RefactorTTReviewCell) viewOnLongClickListenerC1208780hYq.l0).U5().LIZLLL();
        return true;
    }

    public static final boolean onLongClick$15(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((RefactorTTReviewCell) viewOnLongClickListenerC1208780hYq.l0).U5().LIZLLL();
        return true;
    }

    public static final boolean onLongClick$16(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((RefactorTTReviewCell) viewOnLongClickListenerC1208780hYq.l0).U5().LIZLLL();
        return true;
    }

    public static final boolean onLongClick$17(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((C1192050h7r) ((RefactorTabelogReviewCell) viewOnLongClickListenerC1208780hYq.l0).LLJILJIL.getValue()).LIZLLL();
        return true;
    }

    public static final boolean onLongClick$18(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((C1192050h7r) ((RefactorTripAdvisorReviewCell) viewOnLongClickListenerC1208780hYq.l0).LLJIJIL.getValue()).LIZLLL();
        return true;
    }

    public static final boolean onLongClick$19(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        C19EG c19egLIZIZ;
        Context context = ((RepostEmptyPageAssem) viewOnLongClickListenerC1208780hYq.l0).getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            C621180OYa.LIZ.LJJIJLIJ(c19egLIZIZ, "REPOST_FEED");
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$2(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((PoiDetailReviewListItemCell) viewOnLongClickListenerC1208780hYq.l0).a6();
        return true;
    }

    public static final boolean onLongClick$20(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((NearbyFeedCellAssem) viewOnLongClickListenerC1208780hYq.l0).yp();
        return true;
    }

    public static final boolean onLongClick$21(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((NearbyFeedCellAssem) viewOnLongClickListenerC1208780hYq.l0).yp();
        return true;
    }

    public static final boolean onLongClick$22(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((NearbyFeedCellAssem) viewOnLongClickListenerC1208780hYq.l0).yp();
        return true;
    }

    public static final boolean onLongClick$23(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((PoiReviewsFoldedReviewCell) viewOnLongClickListenerC1208780hYq.l0).V5();
        return true;
    }

    public static final boolean onLongClick$24(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((PoiReviewsFoldedReviewCell) viewOnLongClickListenerC1208780hYq.l0).V5();
        return true;
    }

    public static final boolean onLongClick$25(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((PoiDetailReviewListItemCellV0) viewOnLongClickListenerC1208780hYq.l0).U5();
        return true;
    }

    public static final boolean onLongClick$26(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((PoiDetailReviewListItemCellV0) viewOnLongClickListenerC1208780hYq.l0).U5();
        return true;
    }

    public static final boolean onLongClick$27(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((PoiReviewsListItemCell) viewOnLongClickListenerC1208780hYq.l0).c6();
        return true;
    }

    public static final boolean onLongClick$28(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((PoiReviewsListItemCell) viewOnLongClickListenerC1208780hYq.l0).c6();
        return true;
    }

    public static final boolean onLongClick$29(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        return ((C1191660h7E) viewOnLongClickListenerC1208780hYq.l0).LIZIZ.invoke().booleanValue();
    }

    public static final boolean onLongClick$3(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((PoiDetailReviewListItemCell) viewOnLongClickListenerC1208780hYq.l0).a6();
        return true;
    }

    public static final boolean onLongClick$30(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        return ((C1191640h7C) viewOnLongClickListenerC1208780hYq.l0).LJ.invoke().booleanValue();
    }

    public static final boolean onLongClick$31(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        return ((C1191640h7C) viewOnLongClickListenerC1208780hYq.l0).LJ.invoke().booleanValue();
    }

    public static final boolean onLongClick$32(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        return ((C1191640h7C) viewOnLongClickListenerC1208780hYq.l0).LJ.invoke().booleanValue();
    }

    public static final boolean onLongClick$33(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        List<n> list;
        PoiAwemePictureInfo poiAwemePictureInfo;
        boolean z;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        String str;
        PoiDataStruct poiDataStruct;
        PoiAwemePictureInfo poiAwemePictureInfo2;
        DynamicIcon dynamicIcon;
        Integer dynamicIcon2;
        String str2;
        PoiDataStruct poiDataStruct2;
        PoiAwemePictureInfo poiAwemePictureInfo3;
        PoiDataStruct poiDataStruct3;
        PoiDataStruct poiDataStruct4;
        PoiDataButtonGroup poiDataButtonGroup;
        Aweme aweme = ((PoiPhotoTextRootAssem) viewOnLongClickListenerC1208780hYq.l0).LLJZ;
        Integer num = null;
        if (aweme != null && (poiDataStruct4 = aweme.getPoiDataStruct()) != null && (poiDataButtonGroup = poiDataStruct4.buttonGroup) != null) {
            list = poiDataButtonGroup.buttonList;
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        ((PoiPhotoTextRootAssem) viewOnLongClickListenerC1208780hYq.l0).getClass();
        ArrayList<PoiButton> arrayList = new ArrayList();
        Iterator<n> it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                Object objFromJson = GsonProtectorUtils.fromJson(C2365509Or.LIZ(), it2.next(), C2371409Qy.LIZJ(C13LE.LJII(PoiButton.class)));
                if ((objFromJson instanceof PoiButton) && objFromJson != null) {
                    arrayList.add(objFromJson);
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        Aweme aweme2 = ((PoiPhotoTextRootAssem) viewOnLongClickListenerC1208780hYq.l0).LLJZ;
        if (aweme2 != null && (poiDataStruct3 = aweme2.getPoiDataStruct()) != null) {
            poiAwemePictureInfo = poiDataStruct3.poiAwemePictureInfo;
        } else {
            poiAwemePictureInfo = null;
        }
        if (!arrayList.isEmpty()) {
            loop1: for (PoiButton poiButton : arrayList) {
                Integer num2 = poiButton.buttonType;
                if (num2 == null || num2.intValue() != 3) {
                    List<ClickEvent> list2 = poiButton.clickEvent;
                    if (list2 != null && !list2.isEmpty()) {
                        Iterator<ClickEvent> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            if (Intrinsics.LJFF(it3.next().actionType, "report")) {
                            }
                        }
                    }
                }
                z = true;
            }
            z = false;
        } else {
            z = false;
        }
        if (C1185000gwU.LIZ() && poiAwemePictureInfo != null && Intrinsics.LJFF(poiAwemePictureInfo.canReport, Boolean.TRUE) && z) {
            PoiPhotoTextRootAssem poiPhotoTextRootAssem = (PoiPhotoTextRootAssem) viewOnLongClickListenerC1208780hYq.l0;
            poiPhotoTextRootAssem.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (PoiButton poiButton2 : arrayList) {
                String str3 = poiButton2.buttonName;
                if (str3 != null && str3.length() != 0 && (dynamicIcon = poiButton2.icon) != null && (dynamicIcon2 = dynamicIcon.parseDynamicIcon(poiPhotoTextRootAssem.LJJIJL().getContext(), num)) != null) {
                    int iIntValue = dynamicIcon2.intValue();
                    C1187270h09 c1187270h09 = C1187270h09.LIZ;
                    String strMobBtnName = poiButton2.mobBtnName();
                    PageFinder pageFinder = poiPhotoTextRootAssem.LLL;
                    String str4 = poiPhotoTextRootAssem.LLLF;
                    Aweme aweme3 = poiPhotoTextRootAssem.LLJZ;
                    if (aweme3 != null && (poiDataStruct2 = aweme3.getPoiDataStruct()) != null && (poiAwemePictureInfo3 = poiDataStruct2.poiAwemePictureInfo) != null) {
                        str2 = poiAwemePictureInfo3.picId;
                    } else {
                        str2 = null;
                    }
                    c1187270h09.getClass();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    C1189060h32.LJJIFFI(c2344009Gk, "ttls_btn_name", strMobBtnName);
                    C1189060h32.LJJIFFI(c2344009Gk, "current_page", str4);
                    C1189060h32.LJJIFFI(c2344009Gk, "pic_id", str2);
                    if (pageFinder != null) {
                        C721200SQs.LIZ(pageFinder, c2344009Gk, "ttls_poi_top_expand_btn_show");
                    }
                    C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                    Map<String, String> map = c2344009Gk.LIZ;
                    C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
                    c1185040gwY.getClass();
                    C1185040gwY.LJFF("ttls_poi_top_expand_btn_show", map, c1185050gwZ);
                    C1247530iZL c1247530iZL = new C1247530iZL();
                    c1247530iZL.LIZ = poiButton2.buttonName;
                    c1247530iZL.LIZJ = 0;
                    c1247530iZL.LIZJ(iIntValue);
                    c1247530iZL.LIZ(new AwS384S0200000_18(poiPhotoTextRootAssem, poiButton2, 251));
                    arrayList2.add(c1247530iZL);
                }
                num = null;
            }
            if (arrayList2.isEmpty()) {
                return true;
            }
            Activity activityLIZ = C1388190mED.LIZ(poiPhotoTextRootAssem.LJJIJL().getContext());
            if (!(activityLIZ instanceof C19EG) || (c19eg = (C19EG) activityLIZ) == null || (supportFragmentManager = c19eg.getSupportFragmentManager()) == null) {
                return true;
            }
            C1390850mIV c1390850mIV = new C1390850mIV();
            c1390850mIV.LJFF(arrayList2);
            c1390850mIV.LIZ.LLJJJ = 1;
            c1390850mIV.LIZJ().show(supportFragmentManager, "poi_photo_text_long_press_menu");
            C1187270h09 c1187270h092 = C1187270h09.LIZ;
            PageFinder pageFinder2 = poiPhotoTextRootAssem.LLL;
            String str5 = poiPhotoTextRootAssem.LLLF;
            Aweme aweme4 = poiPhotoTextRootAssem.LLJZ;
            if (aweme4 != null && (poiDataStruct = aweme4.getPoiDataStruct()) != null && (poiAwemePictureInfo2 = poiDataStruct.poiAwemePictureInfo) != null) {
                str = poiAwemePictureInfo2.picId;
            } else {
                str = null;
            }
            c1187270h092.getClass();
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            C1189060h32.LJJIFFI(c2344009Gk2, "current_page", str5);
            C1189060h32.LJJIFFI(c2344009Gk2, "pic_id", str);
            if (pageFinder2 != null) {
                C721200SQs.LIZ(pageFinder2, c2344009Gk2, "ttls_poi_top_expand_panel_show");
            }
            C1185040gwY c1185040gwY2 = C1185040gwY.LIZ;
            Map<String, String> map2 = c2344009Gk2.LIZ;
            C1185050gwZ c1185050gwZ2 = new C1185050gwZ(pageFinder2);
            c1185040gwY2.getClass();
            C1185040gwY.LJFF("ttls_poi_top_expand_panel_show", map2, c1185050gwZ2);
            return true;
        }
        return false;
    }

    public static final boolean onLongClick$34(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        FragmentManager fragmentManager;
        PoiReviewsApi.PoiReviewModel item;
        C1247510iZJ c1247510iZJ;
        PoiCommentReviewListItemCell poiCommentReviewListItemCell = (PoiCommentReviewListItemCell) viewOnLongClickListenerC1208780hYq.l0;
        PoiCommentReviewListVM poiCommentReviewListVM = poiCommentReviewListItemCell.LL;
        if (poiCommentReviewListVM != null) {
            poiCommentReviewListVM.LLJILJIL = true;
        }
        Fragment fragmentLIZ = C946803n0.LIZ(poiCommentReviewListItemCell.itemView);
        if (fragmentLIZ != null && (fragmentManager = fragmentLIZ.getFragmentManager()) != null && (item = poiCommentReviewListItemCell.getItem()) != null) {
            C1390850mIV c1390850mIV = new C1390850mIV();
            if (!item.getWantTranslate()) {
                c1247510iZJ = new C1247510iZJ();
                c1247510iZJ.LIZIZ(2131850744);
                c1247510iZJ.LIZ(new AwS384S0200000_18(item, poiCommentReviewListItemCell, 271));
            } else {
                c1247510iZJ = new C1247510iZJ();
                c1247510iZJ.LIZIZ(R.string.suj);
                c1247510iZJ.LIZ(new AwS384S0200000_18(item, poiCommentReviewListItemCell, 272));
            }
            C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
            c1247510iZJ2.LIZIZ(2131836352);
            c1247510iZJ2.LIZ(new AwS384S0200000_18(item, poiCommentReviewListItemCell, 270));
            C1247510iZJ c1247510iZJ3 = new C1247510iZJ();
            c1247510iZJ3.LIZIZ(2131836352);
            c1247510iZJ3.LIZ(new AwS384S0200000_18(item, poiCommentReviewListItemCell, 269));
            if (!C1190820h5s.LJFF(item) && C848230XPh.LL.LJI()) {
                c1390850mIV.LIZIZ(c1247510iZJ, c1247510iZJ2);
            } else if (C1190820h5s.LJII(item) && C848230XPh.LL.LJI() && C1191150h6P.LIZ()) {
                c1390850mIV.LIZIZ(c1247510iZJ, c1247510iZJ3);
            } else {
                c1390850mIV.LIZIZ(c1247510iZJ);
            }
            c1390850mIV.LIZLLL(R.string.f1_);
            c1390850mIV.LIZJ().show(fragmentManager, "PoiReviewMenuPanel");
        }
        return true;
    }

    public static final boolean onLongClick$4(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((PoiDetailReviewListItemCell) viewOnLongClickListenerC1208780hYq.l0).a6();
        return true;
    }

    public static final boolean onLongClick$5(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((PoiDetailReviewListItemCellV0) viewOnLongClickListenerC1208780hYq.l0).U5();
        return true;
    }

    public static final boolean onLongClick$6(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((PoiDetailReviewListItemCellV0) viewOnLongClickListenerC1208780hYq.l0).U5();
        return true;
    }

    public static final boolean onLongClick$7(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((PoiDetailReviewListItemCellV0) viewOnLongClickListenerC1208780hYq.l0).U5();
        return true;
    }

    public static final boolean onLongClick$8(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((PoiReviewsFoldedReviewCell) viewOnLongClickListenerC1208780hYq.l0).V5();
        return true;
    }

    public static final boolean onLongClick$9(ViewOnLongClickListenerC1208780hYq viewOnLongClickListenerC1208780hYq, View view) {
        ((PoiReviewsFoldedReviewCell) viewOnLongClickListenerC1208780hYq.l0).V5();
        return true;
    }
}
