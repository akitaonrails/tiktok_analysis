package X;

import Y.ARunnableS22S1200000_18;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseActivityAssem;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiRecommendDishesNoPicAssem;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiRecommendDishesVM;
import com.ss.android.ugc.aweme.poi.detail.dishes.gallery.PoiRecommendDishesGalleryAssem;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiDetailReviewListItemCell;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiDetailReviewListItemCellV0;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsFoldedReviewCell;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsListItemCell;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.RefactorTTReviewCell;
import com.ss.android.ugc.aweme.poi.reviews.tab.adapter.PoiCommentReviewListItemCell;
import com.ss.android.ugc.aweme.poi.reviews.tab.viewmodel.PoiCommentReviewListVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0hZ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208950hZ7 implements InterfaceC849390XTt {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void LIZIZ$0(C1208950hZ7 c1208950hZ7) {
    }

    public static final void LIZIZ$1(C1208950hZ7 c1208950hZ7) {
    }

    public static final void LIZIZ$10(C1208950hZ7 c1208950hZ7) {
    }

    public static final void LIZIZ$11(C1208950hZ7 c1208950hZ7) {
    }

    public static final void LIZIZ$12(C1208950hZ7 c1208950hZ7) {
    }

    public static final void LIZIZ$2(C1208950hZ7 c1208950hZ7) {
    }

    public static final void LIZIZ$3(C1208950hZ7 c1208950hZ7) {
    }

    public static final void LIZIZ$4(C1208950hZ7 c1208950hZ7) {
    }

    public static final void LIZIZ$5(C1208950hZ7 c1208950hZ7) {
    }

    public static final void LIZIZ$6(C1208950hZ7 c1208950hZ7) {
    }

    public static final void LIZIZ$7(C1208950hZ7 c1208950hZ7) {
    }

    public static final void LIZIZ$8(C1208950hZ7 c1208950hZ7) {
    }

    public static final void LIZIZ$9(C1208950hZ7 c1208950hZ7) {
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                break;
            case 1:
                LIZ$1(this);
                break;
            case 2:
                LIZ$2(this);
                break;
            case 3:
                LIZ$3(this);
                break;
            case 4:
                LIZ$4(this);
                break;
            case 5:
                LIZ$5(this);
                break;
            case 6:
                LIZ$6(this);
                break;
            case 7:
                LIZ$7(this);
                break;
            case 8:
                LIZ$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this);
                break;
        }
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            case 2:
                LIZIZ$2(this);
                break;
            case 3:
                LIZIZ$3(this);
                break;
            case 4:
                LIZIZ$4(this);
                break;
            case 5:
                LIZIZ$5(this);
                break;
            case 6:
                LIZIZ$6(this);
                break;
            case 7:
                LIZIZ$7(this);
                break;
            case 8:
                LIZIZ$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZIZ$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZIZ$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZIZ$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZIZ$12(this);
                break;
        }
    }

    public static final void LIZ$0(C1208950hZ7 c1208950hZ7) {
        Fragment fragment;
        View view;
        C1188640h2M c1188640h2MTp = ((PoiCollectStatusBaseActivityAssem) c1208950hZ7.l0).tp();
        String str = c1188640h2MTp.LIZ;
        if (str != null && (fragment = (Fragment) c1208950hZ7.l1) != null && (view = fragment.getView()) != null) {
            HandlerHook.viewPost(view, new ARunnableS22S1200000_18((PoiCollectStatusBaseActivityAssem) c1208950hZ7.l0, str, c1188640h2MTp, 3));
        }
    }

    public static final void LIZ$1(C1208950hZ7 c1208950hZ7) {
        View view;
        ContainerEventDispatcher$RefreshActionCallBackAbility containerEventDispatcher$RefreshActionCallBackAbility;
        C1184350gvR c1184350gvRSp = ((PoiCollectStatusBaseAssem) c1208950hZ7.l0).sp();
        String str = c1184350gvRSp.LIZ;
        if (str == null) {
            return;
        }
        Fragment fragmentLJI = C724240Sb0.LJI((PoiCollectStatusBaseAssem) c1208950hZ7.l0);
        if (fragmentLJI != null && (containerEventDispatcher$RefreshActionCallBackAbility = (ContainerEventDispatcher$RefreshActionCallBackAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ContainerEventDispatcher$RefreshActionCallBackAbility.class, null)) != null) {
            containerEventDispatcher$RefreshActionCallBackAbility.X0("favorite_login");
        }
        Fragment fragment = (Fragment) c1208950hZ7.l1;
        if (fragment != null && (view = fragment.getView()) != null) {
            HandlerHook.viewPost(view, new ARunnableS22S1200000_18((PoiCollectStatusBaseAssem) c1208950hZ7.l0, str, c1184350gvRSp, 4));
        }
    }

    public static final void LIZ$10(C1208950hZ7 c1208950hZ7) {
        boolean zBooleanValue;
        Boolean bool;
        InterfaceC1191710h7J interfaceC1191710h7JLIZLLL = ((C1191670h7F) c1208950hZ7.l0).LIZLLL();
        if (interfaceC1191710h7JLIZLLL != null) {
            PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) c1208950hZ7.l1;
            PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
            if (userStatus != null && (bool = userStatus.liked) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            interfaceC1191710h7JLIZLLL.CJ(poiReviewModel, zBooleanValue);
        }
    }

    public static final void LIZ$11(C1208950hZ7 c1208950hZ7) {
        boolean zBooleanValue;
        Boolean bool;
        InterfaceC1191710h7J interfaceC1191710h7J = ((RefactorTTReviewCell) c1208950hZ7.l0).LLILZLL;
        if (interfaceC1191710h7J != null) {
            PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) c1208950hZ7.l1;
            PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
            if (userStatus != null && (bool = userStatus.disliked) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            interfaceC1191710h7J.zd2(poiReviewModel, zBooleanValue);
        }
    }

    public static final void LIZ$12(C1208950hZ7 c1208950hZ7) {
        boolean zBooleanValue;
        Boolean bool;
        PoiCommentReviewListVM poiCommentReviewListVM = ((PoiCommentReviewListItemCell) c1208950hZ7.l0).LL;
        if (poiCommentReviewListVM != null) {
            PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) c1208950hZ7.l1;
            PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
            if (userStatus != null && (bool = userStatus.liked) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            poiCommentReviewListVM.CJ(poiReviewModel, zBooleanValue);
        }
    }

    public static final void LIZ$2(C1208950hZ7 c1208950hZ7) {
        PoiRecommendDishesNoPicAssem poiRecommendDishesNoPicAssem = (PoiRecommendDishesNoPicAssem) c1208950hZ7.l0;
        PoiDetailApi.RecommendedDish recommendedDish = (PoiDetailApi.RecommendedDish) c1208950hZ7.l1;
        poiRecommendDishesNoPicAssem.Ep().setState(new AwS597S0100000_18(recommendedDish, 703));
        PoiRecommendDishesVM poiRecommendDishesVMEp = poiRecommendDishesNoPicAssem.Ep();
        poiRecommendDishesVMEp.setState(new AwS384S0200000_18(recommendedDish, poiRecommendDishesVMEp, 185));
        poiRecommendDishesNoPicAssem.Ep().setState(AFwS256S0000000_18.get$arr$(859));
    }

    public static final void LIZ$3(C1208950hZ7 c1208950hZ7) {
        PoiRecommendDishesGalleryAssem poiRecommendDishesGalleryAssem = (PoiRecommendDishesGalleryAssem) c1208950hZ7.l0;
        PoiDetailApi.RecommendedDish recommendedDish = (PoiDetailApi.RecommendedDish) c1208950hZ7.l1;
        PoiRecommendDishesVM poiRecommendDishesVMSp = poiRecommendDishesGalleryAssem.sp();
        poiRecommendDishesVMSp.getClass();
        poiRecommendDishesVMSp.setState(new AwS597S0100000_18(recommendedDish, 703));
        PoiRecommendDishesVM poiRecommendDishesVMSp2 = poiRecommendDishesGalleryAssem.sp();
        poiRecommendDishesVMSp2.getClass();
        poiRecommendDishesVMSp2.setState(new AwS384S0200000_18(recommendedDish, poiRecommendDishesVMSp2, 185));
        PoiRecommendDishesVM poiRecommendDishesVMSp3 = poiRecommendDishesGalleryAssem.sp();
        poiRecommendDishesVMSp3.getClass();
        poiRecommendDishesVMSp3.setState(AFwS256S0000000_18.get$arr$(859));
    }

    public static final void LIZ$4(C1208950hZ7 c1208950hZ7) {
        boolean zBooleanValue;
        Boolean bool;
        InterfaceC1191710h7J interfaceC1191710h7J = ((PoiDetailReviewListItemCell) c1208950hZ7.l0).LL;
        if (interfaceC1191710h7J != null) {
            PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) c1208950hZ7.l1;
            PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
            if (userStatus != null && (bool = userStatus.disliked) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            interfaceC1191710h7J.zd2(poiReviewModel, zBooleanValue);
        }
    }

    public static final void LIZ$5(C1208950hZ7 c1208950hZ7) {
        boolean zBooleanValue;
        Boolean bool;
        InterfaceC1191710h7J interfaceC1191710h7J = ((PoiDetailReviewListItemCell) c1208950hZ7.l0).LL;
        if (interfaceC1191710h7J != null) {
            PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) c1208950hZ7.l1;
            PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
            if (userStatus != null && (bool = userStatus.liked) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            interfaceC1191710h7J.CJ(poiReviewModel, zBooleanValue);
        }
    }

    public static final void LIZ$6(C1208950hZ7 c1208950hZ7) {
        boolean zBooleanValue;
        Boolean bool;
        InterfaceC1191710h7J interfaceC1191710h7J = ((PoiDetailReviewListItemCellV0) c1208950hZ7.l0).LL;
        if (interfaceC1191710h7J != null) {
            PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) c1208950hZ7.l1;
            PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
            if (userStatus != null && (bool = userStatus.disliked) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            interfaceC1191710h7J.zd2(poiReviewModel, zBooleanValue);
        }
    }

    public static final void LIZ$7(C1208950hZ7 c1208950hZ7) {
        boolean zBooleanValue;
        Boolean bool;
        InterfaceC1191710h7J interfaceC1191710h7J = ((PoiDetailReviewListItemCellV0) c1208950hZ7.l0).LL;
        if (interfaceC1191710h7J != null) {
            PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) c1208950hZ7.l1;
            PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
            if (userStatus != null && (bool = userStatus.liked) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            interfaceC1191710h7J.CJ(poiReviewModel, zBooleanValue);
        }
    }

    public static final void LIZ$8(C1208950hZ7 c1208950hZ7) {
        boolean zBooleanValue;
        Boolean bool;
        PoiReviewsListViewModel poiReviewsListViewModelT5 = ((PoiReviewsListItemCell) c1208950hZ7.l0).T5();
        PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) c1208950hZ7.l1;
        PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
        if (userStatus != null && (bool = userStatus.liked) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        poiReviewsListViewModelT5.CJ(poiReviewModel, zBooleanValue);
    }

    public static final void LIZ$9(C1208950hZ7 c1208950hZ7) {
        boolean zBooleanValue;
        Boolean bool;
        InterfaceC1191710h7J interfaceC1191710h7J = ((PoiReviewsFoldedReviewCell) c1208950hZ7.l0).LL;
        if (interfaceC1191710h7J != null) {
            PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) c1208950hZ7.l1;
            PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
            if (userStatus != null && (bool = userStatus.liked) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            interfaceC1191710h7J.CJ(poiReviewModel, zBooleanValue);
        }
    }

    public C1208950hZ7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
