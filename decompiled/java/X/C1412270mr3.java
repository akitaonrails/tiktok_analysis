package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import com.ss.android.ugc.effectmanager.effect.model.CategoryInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS261S0000000_22;

/* JADX INFO: renamed from: X.0mr3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412270mr3 {
    public static final C1412270mr3 LIZ = new C1412270mr3();

    public static String LJFF(int i) {
        for (AssetType assetType : AssetType.values()) {
            if (assetType.getValue() == i) {
                return assetType.name().toLowerCase(Locale.ROOT);
            }
        }
        return "";
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        String asset_id;
        int i = 0;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "tt_photo_template_enable_show_entrance", true, false)) {
            return;
        }
        List<Pair<PhotoTemplateAsset, Boolean>> listLJJIZ = C1428520nHG.LJJIZ(videoPublishEditModel);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJIZ, 10));
        ArrayList arrayList2 = (ArrayList) listLJJIZ;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Pair) it2.next()).getFirst());
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            Asset asset = ((PhotoTemplateAsset) obj).getAsset();
            if (asset == null || (asset_id = asset.getAsset_id()) == null) {
                asset_id = "";
            }
            if (hashSet.add(asset_id)) {
                arrayList3.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (((Boolean) ((Pair) it3.next()).getSecond()).booleanValue()) {
                        i = 1;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        c0lab.LIZ(!arrayList3.isEmpty() ? 1 : 0, "is_with_photo_template");
        c0lab.LJ("photo_template_id_list", C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(329), 30));
        c0lab.LJ("photo_template_category_list", C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(330), 30));
        c0lab.LIZ(i, "is_photo_template_edited");
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        int size;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        c0lab.LJ("shoot_enter_from", C1428470nHB.LJJIIJ(videoPublishEditModel, false));
        c0lab.LIZ(0, "is_photo_editor");
        if (C1428470nHB.LJJZZI(videoPublishEditModel) && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 1;
        }
        c0lab.LIZ(size, "pic_cnt");
    }

    public static void LIZJ(C0LAB c0lab, PhotoTemplateAsset photoTemplateAsset, CategoryInfo categoryInfo) {
        String category_key;
        String asset_id;
        Asset asset;
        String strLJFF;
        Asset asset2;
        String str = "None";
        if (categoryInfo == null || (category_key = categoryInfo.getCategory_key()) == null) {
            category_key = "None";
        }
        c0lab.LJ("template_tab", category_key);
        if (photoTemplateAsset == null || (asset2 = photoTemplateAsset.getAsset()) == null || (asset_id = asset2.getAsset_id()) == null) {
            asset_id = "None";
        }
        c0lab.LJ("photo_template_id", asset_id);
        if (photoTemplateAsset != null && (asset = photoTemplateAsset.getAsset()) != null && (strLJFF = LJFF(asset.getAsset_type())) != null) {
            str = strLJFF;
        }
        c0lab.LJ("photo_template_category", str);
    }

    public static void LIZLLL(VideoPublishEditModel videoPublishEditModel, EnumC1288170jct enumC1288170jct, int i, String str, long j, PhotoTemplateAsset photoTemplateAsset, CategoryInfo categoryInfo, boolean z) {
        int size;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(enumC1288170jct.getValue(), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(i, "error_code");
        c0lab.LJ("error_msg", str);
        c0lab.LIZIZ(j, "duration");
        c0lab.LIZ(z ? 1 : 0, "use_cache");
        LIZJ(c0lab, photoTemplateAsset, categoryInfo);
        if (C1428470nHB.LJJZZI(videoPublishEditModel) && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 1;
        }
        c0lab.LIZ(size, "pic_cnt");
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("photo_template_performance", c0lab.LIZ);
    }
}
