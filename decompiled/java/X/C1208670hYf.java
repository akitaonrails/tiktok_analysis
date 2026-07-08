package X;

import Y.ARunnableS118S0100000_18;
import Y.ARunnableS37S0110000_18;
import androidx.fragment.app.Fragment;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tiktok.sdk.powerviewpager.FragmentPageSelectedManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.favorites.business.FavoritesFragmentV2;
import com.ss.android.ugc.aweme.favorites.business.music.raven.RavenMusicCollectionFragment;
import com.ss.android.ugc.aweme.favorites.profile.FavoriteSearchViewModel;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.PoiHeaderGalleryAssem;
import com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiRecommendDishesDetailFragment;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiPicture;
import com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailCommonHorizontalCardAssem;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiMapDetailResponse;
import com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeHorizontalCardAssem;
import com.ss.android.ugc.aweme.poi.quiz.assem.PoiQuizHorizontalCardAssem;
import com.ss.android.ugc.aweme.poi.reviews.landing.ui.PoiReviewsContainerAssem;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes.PoiDishesGalleryFragment;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hYf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208670hYf extends AbstractC712240Rwk {
    public final int $t;
    public Object l0;

    public static final void onPageScrolled$0(C1208670hYf c1208670hYf, int i, float f, int i2) {
    }

    public static final void onPageScrolled$1(C1208670hYf c1208670hYf, int i, float f, int i2) {
    }

    public static final void onPageScrolled$2(C1208670hYf c1208670hYf, int i, float f, int i2) {
    }

    public static final void onPageSelected$5(C1208670hYf c1208670hYf, int i) {
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                break;
            case 1:
            case 5:
            case 7:
            default:
                super.onPageScrollStateChanged(i);
                break;
            case 2:
                onPageScrollStateChanged$1(this, i);
                break;
            case 3:
                onPageScrollStateChanged$2(this, i);
                break;
            case 4:
                onPageScrollStateChanged$3(this, i);
                break;
            case 6:
                onPageScrollStateChanged$4(this, i);
                break;
            case 8:
                onPageScrollStateChanged$5(this, i);
                break;
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                break;
            case 6:
                onPageScrolled$1(this, i, f, i2);
                break;
            case 8:
                onPageScrolled$2(this, i, f, i2);
                break;
            default:
                super.onPageScrolled(i, f, i2);
                break;
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
            case 2:
            case 3:
            case 4:
            default:
                super.onPageSelected(i);
                break;
            case 5:
                onPageSelected$2(this, i);
                break;
            case 6:
                onPageSelected$3(this, i);
                break;
            case 7:
                onPageSelected$4(this, i);
                break;
            case 8:
                onPageSelected$5(this, i);
                break;
        }
    }

    public C1208670hYf(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$0(C1208670hYf c1208670hYf, int i) {
        if (i == 0) {
            ((PoiMapDetailCommonHorizontalCardAssem) c1208670hYf.l0).LLJJIJIIJIL = false;
        }
    }

    public static final void onPageScrollStateChanged$1(C1208670hYf c1208670hYf, int i) {
        ((PoiRecommendDishesDetailFragment) c1208670hYf.l0).LLJJJIL = true;
    }

    public static final void onPageScrollStateChanged$2(C1208670hYf c1208670hYf, int i) {
        PoiReviewsContainerAssem poiReviewsContainerAssem = (PoiReviewsContainerAssem) c1208670hYf.l0;
        ((LinkedList) poiReviewsContainerAssem.LLJJIJIIJIL).add(Integer.valueOf(i));
        if (((LinkedList) poiReviewsContainerAssem.LLJJIJIIJIL).size() > 3) {
            ((LinkedList) poiReviewsContainerAssem.LLJJIJIIJIL).remove();
        }
    }

    public static final void onPageScrollStateChanged$3(C1208670hYf c1208670hYf, int i) {
        ((PoiDishesGalleryFragment) c1208670hYf.l0).LLJJIJIIJIL = true;
    }

    public static final void onPageScrollStateChanged$4(C1208670hYf c1208670hYf, int i) {
        if (i == 0) {
            ((PoiQuizHorizontalCardAssem) c1208670hYf.l0).LLJJIJI = false;
        }
    }

    public static final void onPageScrollStateChanged$5(C1208670hYf c1208670hYf, int i) {
        if (i == 0) {
            ((PoiMapModeHorizontalCardAssem) c1208670hYf.l0).LLJJIJIL = false;
        }
    }

    public static final void onPageSelected$0(C1208670hYf c1208670hYf, int i) {
        String poiId;
        String str;
        Integer userCityStatus;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        PoiGeneralCard poiGeneralCard;
        PoiMapDetailCommonHorizontalCardAssem poiMapDetailCommonHorizontalCardAssem = (PoiMapDetailCommonHorizontalCardAssem) c1208670hYf.l0;
        poiMapDetailCommonHorizontalCardAssem.LLJJJJJIL = i;
        List<PoiGeneralCard> list = poiMapDetailCommonHorizontalCardAssem.LLJJIJIL;
        String strLIZ = null;
        if (list != null && (poiGeneralCard = (PoiGeneralCard) C13LP.LJJJLZIJ(i, list)) != null) {
            poiId = poiGeneralCard.getPoiId();
        } else {
            poiId = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("card_view onPageSelected, position is ");
        sbLIZ.append(i);
        sbLIZ.append(", poi_id:");
        sbLIZ.append(poiId);
        sbLIZ.append(", isProgrammaticScroll: ");
        sbLIZ.append(poiMapDetailCommonHorizontalCardAssem.LLJJIJIIJIL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!poiMapDetailCommonHorizontalCardAssem.LLJJIJIIJIL) {
            poiMapDetailCommonHorizontalCardAssem.ip().BQ2(poiId, true);
            C1175660ghQ c1175660ghQXQ2 = poiMapDetailCommonHorizontalCardAssem.ip().xQ2();
            if (c1175660ghQXQ2 != null) {
                str = c1175660ghQXQ2.localServiceKeyCategory;
            } else {
                str = null;
            }
            PoiMapDetailResponse poiMapDetailResponse = poiMapDetailCommonHorizontalCardAssem.ip().LLJILJILJ.LIZJ;
            if (poiMapDetailResponse != null) {
                userCityStatus = poiMapDetailResponse.getUserCityStatus();
            } else {
                userCityStatus = null;
            }
            String strWQ2 = poiMapDetailCommonHorizontalCardAssem.hp().wQ2();
            Fragment fragmentLJIIJ = C1189060h32.LJIIJ(poiMapDetailCommonHorizontalCardAssem);
            if (fragmentLJIIJ != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
            } else {
                interfaceC665370Q7zLJFF = null;
            }
            PageFinder pageFinderVia = PageFinder.via(C1189060h32.LJIIJ(poiMapDetailCommonHorizontalCardAssem));
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7zLJFF);
            if (str != null) {
                strLIZ = C1175600ghK.LIZ(str);
            }
            C1189060h32.LJJ("tab_code", strLIZ, linkedHashMap);
            C1189060h32.LJJ("map_mode_type", C1175600ghK.LJIIJ(userCityStatus), linkedHashMap);
            C1189060h32.LJJ("ttls_filter_type_list", strWQ2, linkedHashMap);
            C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
            c1185040gwY.getClass();
            C1185040gwY.LIZIZ("swipe_poi_card", linkedHashMap, c1185050gwZ);
        }
    }

    public static final void onPageSelected$1(C1208670hYf c1208670hYf, int i) {
        Fragment fragment;
        FragmentPageSelectedManager fragmentPageSelectedManager = ((ViewOnAttachStateChangeListenerC20631115oD) c1208670hYf.l0).getFragmentAdapter().LLJILLL;
        WeakReference<Fragment> weakReference = fragmentPageSelectedManager.LLILLJJLI.get(fragmentPageSelectedManager.LL.LLLJ(i));
        if (weakReference != null) {
            fragment = weakReference.get();
        } else {
            fragment = null;
        }
        fragmentPageSelectedManager.LIZ(i, fragment);
    }

    public static final void onPageSelected$2(C1208670hYf c1208670hYf, int i) {
        Integer numValueOf;
        String str;
        String str2;
        String string;
        String str3;
        List<PoiPicture> list;
        PoiPicture poiPicture;
        Integer num;
        PictureAlbum pictureAlbum;
        List<PoiPicture> list2;
        PoiPicture poiPicture2;
        List<PoiPicture> list3;
        PoiPicture poiPicture3;
        Integer num2;
        List<PoiPicture> list4;
        PoiPicture poiPicture4;
        List<PoiPicture> list5;
        PoiPicture poiPicture5;
        List<UrlModel> picturesByExperiment;
        PictureAlbum pictureAlbum2 = ((PoiHeaderGalleryAssem) c1208670hYf.l0).LLJJIJIL;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
        if (pictureAlbum2 != null && (picturesByExperiment = pictureAlbum2.getPicturesByExperiment()) != null) {
            numValueOf = Integer.valueOf(picturesByExperiment.size());
        } else {
            numValueOf = null;
        }
        if (C1175120ggY.LIZJ(numValueOf) > 1) {
            ((PoiHeaderGalleryAssem) c1208670hYf.l0).sp().LLILLL.setSelectedIndex(i);
        }
        ((PoiHeaderGalleryAssem) c1208670hYf.l0).zp(i + 1);
        ((PoiHeaderGalleryAssem) c1208670hYf.l0).yp();
        if (Intrinsics.LJFF(((LinkedHashMap) ((PoiHeaderGalleryAssem) c1208670hYf.l0).LLJJJJLIIL).get(Integer.valueOf(i)), Boolean.TRUE)) {
            PoiHeaderGalleryAssem poiHeaderGalleryAssem = (PoiHeaderGalleryAssem) c1208670hYf.l0;
            C337180DJs.LIZJ(poiHeaderGalleryAssem.sp().LLJ);
            C337180DJs.LIZJ(poiHeaderGalleryAssem.sp().LLIZLLLIL);
        } else {
            PoiHeaderGalleryAssem poiHeaderGalleryAssem2 = (PoiHeaderGalleryAssem) c1208670hYf.l0;
            C337180DJs.LIZ(poiHeaderGalleryAssem2.sp().LLJ);
            C337180DJs.LIZ(poiHeaderGalleryAssem2.sp().LLIZLLLIL);
        }
        C1187260h08 c1187260h08 = C1187260h08.LIZ;
        PictureAlbum pictureAlbum3 = ((PoiHeaderGalleryAssem) c1208670hYf.l0).LLJJIJIL;
        if (pictureAlbum3 != null && (list5 = pictureAlbum3.poiPictures) != null && (poiPicture5 = (PoiPicture) C13LP.LJJJLZIJ(i, list5)) != null) {
            str = poiPicture5.picId;
        } else {
            str = null;
        }
        Integer numValueOf2 = Integer.valueOf(i);
        PictureAlbum pictureAlbum4 = ((PoiHeaderGalleryAssem) c1208670hYf.l0).LLJJIJIL;
        if (pictureAlbum4 != null && (list4 = pictureAlbum4.poiPictures) != null && (poiPicture4 = (PoiPicture) C13LP.LJJJLZIJ(i, list4)) != null) {
            str2 = poiPicture4.picSource;
        } else {
            str2 = null;
        }
        PictureAlbum pictureAlbum5 = ((PoiHeaderGalleryAssem) c1208670hYf.l0).LLJJIJIL;
        if (pictureAlbum5 != null && (list3 = pictureAlbum5.poiPictures) != null && (poiPicture3 = (PoiPicture) C13LP.LJJJLZIJ(i, list3)) != null && (num2 = poiPicture3.entityType) != null) {
            string = num2.toString();
        } else {
            string = null;
        }
        PictureAlbum pictureAlbum6 = ((PoiHeaderGalleryAssem) c1208670hYf.l0).LLJJIJIL;
        if (pictureAlbum6 != null && (list = pictureAlbum6.poiPictures) != null && (poiPicture = (PoiPicture) C13LP.LJJJLZIJ(i, list)) != null && (num = poiPicture.entityType) != null && num.intValue() == 5 && (pictureAlbum = ((PoiHeaderGalleryAssem) c1208670hYf.l0).LLJJIJIL) != null && (list2 = pictureAlbum.poiPictures) != null && (poiPicture2 = (PoiPicture) C13LP.LJJJLZIJ(i, list2)) != null) {
            str3 = poiPicture2.entityId;
        } else {
            str3 = null;
        }
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ((PoiHeaderGalleryAssem) c1208670hYf.l0);
        if (fragmentLJIIJ != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
        }
        PageFinder pageFinderVia = PageFinder.via(C1189060h32.LJIIJ((PoiHeaderGalleryAssem) c1208670hYf.l0));
        c1187260h08.getClass();
        C1187260h08.LIZIZ(null, str, "240", numValueOf2, str2, string, null, str3, null, interfaceC665370Q7zLJFF, pageFinderVia);
    }

    public static final void onPageSelected$3(C1208670hYf c1208670hYf, int i) {
        ((PoiQuizHorizontalCardAssem) c1208670hYf.l0).LLJJIJIIJIL = false;
    }

    public static final void onPageSelected$4(C1208670hYf c1208670hYf, int i) {
        FavoriteSearchViewModel favoriteSearchViewModelRR;
        InterfaceC1206370hUx interfaceC1206370hUx;
        if (i >= 0) {
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = ((FavoritesFragmentV2) c1208670hYf.l0).LLJJJ;
            if (viewOnAttachStateChangeListenerC20631115oD == null) {
                viewOnAttachStateChangeListenerC20631115oD = null;
            }
            if (i < viewOnAttachStateChangeListenerC20631115oD.getFragmentItemOperator().getState().LJIIIIZZ()) {
                if (((FavoritesFragmentV2) c1208670hYf.l0).NR().LLILZ) {
                    RavenMusicCollectionFragment.LLLZL = true;
                } else {
                    RavenMusicCollectionFragment.LLLZL = false;
                }
                ((FavoritesFragmentV2) c1208670hYf.l0).LLJILJIL = i;
                if (C296270BjN.LIZ()) {
                    if (i == ((FavoritesFragmentV2) c1208670hYf.l0).NR().yQ2("video") && (favoriteSearchViewModelRR = ((FavoritesFragmentV2) c1208670hYf.l0).RR()) != null && (interfaceC1206370hUx = favoriteSearchViewModelRR.LLJJIJI) != null) {
                        interfaceC1206370hUx.LIZJ();
                    }
                    boolean z = !Intrinsics.LJFF(((FavoritesFragmentV2) c1208670hYf.l0).LLJJIJIIJIL, "click");
                    FavoritesFragmentV2 favoritesFragmentV2 = (FavoritesFragmentV2) c1208670hYf.l0;
                    LifecycleOwnerExtensionsKt.LIZ(favoritesFragmentV2, new ARunnableS37S0110000_18(favoritesFragmentV2, z, 2));
                }
                String str = ((FavoritesFragmentV2) c1208670hYf.l0).LLJJI;
                C1206450hV5.LIZJ = str;
                if (!Intrinsics.LJFF(str, "click") && !Intrinsics.LJFF(((FavoritesFragmentV2) c1208670hYf.l0).LLJJI, "landing")) {
                    ((FavoritesFragmentV2) c1208670hYf.l0).LLJJI = "slide";
                } else {
                    FavoritesFragmentV2 favoritesFragmentV22 = (FavoritesFragmentV2) c1208670hYf.l0;
                    LifecycleOwnerExtensionsKt.LIZ(favoritesFragmentV22, new ARunnableS118S0100000_18(favoritesFragmentV22, 72));
                }
            }
        }
    }
}
