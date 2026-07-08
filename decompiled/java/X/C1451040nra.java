package X;

import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.creative.model.InfoStickerInfo;
import com.ss.android.ugc.aweme.creative.model.NLETemplateData;
import com.ss.android.ugc.aweme.creative.model.SingleTemplateData;
import com.ss.android.ugc.aweme.creative.model.TextStickerInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1451040nra {
    public static final C1451040nra LIZ = new C1451040nra();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        NLETemplateData nLETemplateData;
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        List<InfoStickerInfo> list;
        ImageStickerInfo stickerInfo;
        List<StickerItemModel> stickers;
        List<TextStickerInfo> list2;
        List<TextStickerData> listLJFF;
        String textStr;
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        boolean z = false;
        if (imageAlbumData == null || (nLETemplateData = videoPublishEditModel.creativeModel.photoModeTemplateData.originTemplateData) == null) {
            return false;
        }
        int iMax = Math.max(imageAlbumData.getImageList().size(), nLETemplateData.templateDataList.size());
        int i = 0;
        while (i < iMax) {
            SingleImageData singleImageData = (SingleImageData) C13LP.LJJJLZIJ(i, imageAlbumData.getImageList());
            SingleTemplateData singleTemplateData = (SingleTemplateData) C13LP.LJJJLZIJ(i, nLETemplateData.templateDataList);
            if (singleImageData != null && (listLJFF = C0F7U.LJFF(singleImageData, C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel))) != null) {
                arrayList = new ArrayList();
                for (TextStickerData textStickerData : listLJFF) {
                    if (C1451030nrZ.LJI(textStickerData.getX() / imageAlbumData.getSurfaceData().getSurfaceViewWidth(), C1451030nrZ.LIZLLL(textStickerData, singleImageData.getImageRatio(), imageAlbumData.getSurfaceData())) && (textStr = textStickerData.getTextStr()) != null) {
                        arrayList.add(textStr);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            if (singleTemplateData != null && (list2 = singleTemplateData.textStickerList) != null) {
                arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<TextStickerInfo> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().textStr);
                }
            } else {
                arrayList2 = C13BV.INSTANCE;
            }
            if (!LIZIZ(arrayList, arrayList2)) {
                return true;
            }
            if (singleImageData != null && (stickerInfo = singleImageData.getStickerInfo()) != null && (stickers = stickerInfo.getStickers()) != null) {
                ArrayList arrayList5 = new ArrayList();
                for (StickerItemModel stickerItemModel : stickers) {
                    StickerItemModel stickerItemModel2 = stickerItemModel;
                    if (stickerItemModel2.isNormalInfoSticker() && stickerItemModel2.stickerId != null && C1451030nrZ.LJI(stickerItemModel2.currentOffsetX, C1451030nrZ.LIZJ(stickerItemModel2.currentOffsetY, singleImageData.getImageRatio(), imageAlbumData.getSurfaceData()))) {
                        arrayList5.add(stickerItemModel);
                    }
                }
                arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((StickerItemModel) it3.next()).stickerId);
                }
            } else {
                arrayList3 = C13BV.INSTANCE;
            }
            if (singleTemplateData != null && (list = singleTemplateData.infoStickerList) != null) {
                arrayList4 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<InfoStickerInfo> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(it4.next().effectId);
                }
            } else {
                arrayList4 = C13BV.INSTANCE;
            }
            if (!LIZIZ(arrayList3, arrayList4)) {
                return true;
            }
            i++;
            z = false;
        }
        return z;
    }

    public static final boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        AVMusic aVMusicExtractAVMusic;
        LIZ.getClass();
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData == null || !C0C64.LJIILLIIL().LJIIIZ(31744, "enable_ugc_photo_template_upload", true, false) || ((!C1451030nrZ.LJFF(imageAlbumData) && !C1451030nrZ.LJ(imageAlbumData)) || (((aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel)) != null && ((((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJ() && !aVMusicExtractAVMusic.isCommerceMusic()) || aVMusicExtractAVMusic.isLocalMusic())) || !videoPublishEditModel.hasMusic() || videoPublishEditModel.getMusicVolume() <= 0.0f || ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isAccuratePrivateAccount() || videoPublishEditModel.isPrivate() != 0 || !C376930EqB.LIZ() || !C1428470nHB.LJJZZI(videoPublishEditModel) || videoPublishEditModel.isEnterFromLinkShare()))) {
            return false;
        }
        if (!videoPublishEditModel.creativeModel.photoModeTemplateData.isTemplateFromAnchor || !LIZLLL(videoPublishEditModel) || LIZ(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        ImageAlbumData imageAlbumData;
        String musicId;
        String str;
        boolean z;
        boolean z2;
        List<SingleTemplateData> list;
        List<SingleTemplateData> list2;
        if (videoPublishEditModel.creativeModel.photoModeTemplateData.isTemplateFromAnchor && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (musicId = videoPublishEditModel.getMusicId()) != null && musicId.length() != 0) {
            String musicId2 = videoPublishEditModel.getMusicId();
            NLETemplateData nLETemplateData = videoPublishEditModel.creativeModel.photoModeTemplateData.originTemplateData;
            if (nLETemplateData != null) {
                str = nLETemplateData.musicId;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(musicId2, str)) {
                NLETemplateData nLETemplateData2 = videoPublishEditModel.creativeModel.photoModeTemplateData.originTemplateData;
                if (nLETemplateData2 != null && (list2 = nLETemplateData2.templateDataList) != null && !list2.isEmpty()) {
                    Iterator<SingleTemplateData> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (!it2.next().textStickerList.isEmpty()) {
                            z = true;
                            if (!C1451030nrZ.LJFF(imageAlbumData)) {
                                return false;
                            }
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                NLETemplateData nLETemplateData3 = videoPublishEditModel.creativeModel.photoModeTemplateData.originTemplateData;
                if (nLETemplateData3 != null && (list = nLETemplateData3.templateDataList) != null && !list.isEmpty()) {
                    Iterator<SingleTemplateData> it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (!it3.next().infoStickerList.isEmpty()) {
                            z2 = true;
                            break;
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (!z && z2 && !C1451030nrZ.LJ(imageAlbumData)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean LIZIZ(final List list, final List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        return Intrinsics.LJFF(C08SO.LIZ(new C08SN<String, String>() { // from class: X.0nrq
            @Override // X.C08SN
            public final Iterator<String> LIZ() {
                return list.iterator();
            }

            @Override // X.C08SN
            public final String LIZIZ(String str) {
                return str;
            }
        }), C08SO.LIZ(new C08SN<String, String>() { // from class: X.0nrr
            @Override // X.C08SN
            public final Iterator<String> LIZ() {
                return list2.iterator();
            }

            @Override // X.C08SN
            public final String LIZIZ(String str) {
                return str;
            }
        }));
    }
}
