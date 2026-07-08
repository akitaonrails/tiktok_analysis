package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAdjustInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.creative.model.edit.SingleAdjustInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.editSticker.model.CoverNewItem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import defpackage.Config;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AFwS288S0000000_5;
import kotlin.jvm.internal.AFwS306S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nIY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429320nIY {
    public static final IAVPublishService LIZ = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();

    public static final String LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        String coverPath;
        if (videoPublishEditModel == null) {
            return null;
        }
        if (!C493401w4.LIZ()) {
            return videoPublishEditModel.creativeModel.postPageModel.customCoverPath;
        }
        C0MH8 c0mh8 = C0MH8.LIZ;
        List listSingletonList = Collections.singletonList(4);
        c0mh8.getClass();
        CoverNewItem coverNewItemLJIIJJI = C0MH8.LJIIJJI(listSingletonList, videoPublishEditModel);
        if (coverNewItemLJIIJJI != null && (coverPath = coverNewItemLJIIJJI.getCoverPath()) != null && C2286708xd.LIZJ(coverPath)) {
            return coverPath;
        }
        return videoPublishEditModel.creativeModel.postPageModel.customCoverPath;
    }

    public static final boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        String strLIZIZ;
        if (videoPublishEditModel == null) {
            return false;
        }
        if ((C1428470nHB.LIZIZ(videoPublishEditModel) && videoPublishEditModel.isLivePhotoEdit() && videoPublishEditModel.getLivePhotoPreviewMode() == LivePhotoPreviewMode.STATIC) || (strLIZIZ = LIZIZ(videoPublishEditModel)) == null || !C2286708xd.LIZJ(strLIZIZ)) {
            return false;
        }
        C0VSJ c0vsj = new C0VSJ(strLIZIZ);
        if (!c0vsj.exists() || c0vsj.length() <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(NLETrackSlot nLETrackSlot) {
        Integer numLJIIJJI;
        String extra = nLETrackSlot.getExtra("is_aigc_content");
        if (extra != null && C123100dR.LIZ(extra) && (numLJIIJJI = C2095008Iq.LJIIJJI(extra)) != null && numLJIIJJI.intValue() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        boolean z;
        CreativeModel creativeModel;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null) {
            str = creativeModel.effectEntrancePosition;
        } else {
            str = null;
        }
        boolean zLJFF = Intrinsics.LJFF(str, "edit_page_panel");
        if (videoPublishEditModel != null && C1428470nHB.LJZ(videoPublishEditModel)) {
            z = true;
        } else {
            z = false;
        }
        if (zLJFF && z) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIIZZ(NLEModel nLEModel) {
        VecNLETrackSlotSPtr slots;
        Iterator it2 = ((ArrayList) C349080DmM.LJFF(nLEModel)).iterator();
        while (it2.hasNext()) {
            if (LIZLLL((NLETrackSlot) it2.next())) {
                return true;
            }
        }
        Iterator it3 = ((ArrayList) C349080DmM.LJI(nLEModel)).iterator();
        while (it3.hasNext()) {
            if (LIZLLL((NLETrackSlot) it3.next())) {
                return true;
            }
        }
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
            Iterator<NLETrackSlot> it4 = slots.iterator();
            while (it4.hasNext()) {
                if (LIZLLL(it4.next())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034 A[PHI: r1
      0x0034: PHI (r1v1 int) = (r1v0 int), (r1v17 int), (r1v17 int), (r1v17 int) binds: [B:22:0x0031, B:12:0x001c, B:14:0x0020, B:16:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJFF(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8, com.ss.android.ugc.aweme.shortvideo.model.PhotoEditContent r9) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1429320nIY.LJFF(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.shortvideo.model.PhotoEditContent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0076 A[LOOP:0: B:11:0x001b->B:37:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0049 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9) {
        /*
            boolean r0 = X.C568750MSj.LIZIZ(r8)
            r7 = 0
            if (r0 != 0) goto L8
            return r7
        L8:
            if (r9 == 0) goto L7c
            com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r0 = r9.getImageAlbumData()
            if (r0 == 0) goto L7c
            java.util.List r0 = r0.getImageList()
            if (r0 == 0) goto L7c
            java.util.Iterator r6 = r0.iterator()
            r5 = 0
        L1b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r4 = r6.next()
            int r3 = r5 + 1
            r2 = 0
            if (r5 < 0) goto L78
            com.ss.android.ugc.aweme.creative.model.edit.SingleImageData r4 = (com.ss.android.ugc.aweme.creative.model.edit.SingleImageData) r4
            r1 = 1
            if (r8 == 0) goto L68
            com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r0 = r8.getImageAlbumData()
            if (r0 == 0) goto L4a
            java.util.List r0 = r0.getImageList()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r5, r0)
            com.ss.android.ugc.aweme.creative.model.edit.SingleImageData r0 = (com.ss.android.ugc.aweme.creative.model.edit.SingleImageData) r0
            if (r0 == 0) goto L4a
            boolean r0 = LJII(r0, r4)
            if (r0 != r1) goto L4a
        L49:
            return r1
        L4a:
            com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r0 = r8.getImageAlbumData()
            if (r0 == 0) goto L68
            java.util.List r0 = r0.getImageList()
            if (r0 == 0) goto L68
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r5, r0)
            com.ss.android.ugc.aweme.creative.model.edit.SingleImageData r0 = (com.ss.android.ugc.aweme.creative.model.edit.SingleImageData) r0
            if (r0 == 0) goto L68
            com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo r0 = r0.getSrcImageInfo()
            if (r0 == 0) goto L68
            java.lang.String r2 = r0.getRemoteUri()
        L68:
            com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo r0 = r4.getSrcImageInfo()
            java.lang.String r0 = r0.getRemoteUri()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L49
            r5 = r3
            goto L1b
        L78:
            X.C1697810uHb.LJIJI()
            throw r2
        L7c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1429320nIY.LJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    public static final boolean LJII(SingleImageData singleImageData, SingleImageData singleImageData2) {
        Map<String, SingleAdjustInfo> adjustMap;
        Map<String, SingleAdjustInfo> adjustMap2;
        List textStickerModels;
        if (!Intrinsics.LJFF(singleImageData.getFilterInfo().getFilterId(), singleImageData2.getFilterInfo().getFilterId()) || !(!LIZ(singleImageData2.getStickerInfo().getStickers(), singleImageData.getStickerInfo().getStickers(), AFwS261S0000000_22.get$arr$(286), AFwS306S0000000_22.get$arr$(14))) || !Intrinsics.LJ(singleImageData.getEditImageInfo().getScaleAfterCrop(), singleImageData2.getEditImageInfo().getScaleAfterCrop())) {
            return true;
        }
        ImageAdjustInfo adjustInfo = singleImageData.getAdjustInfo();
        List textStickerModels2 = null;
        if (adjustInfo != null) {
            adjustMap = adjustInfo.getAdjustMap();
        } else {
            adjustMap = null;
        }
        ImageAdjustInfo adjustInfo2 = singleImageData2.getAdjustInfo();
        if (adjustInfo2 != null) {
            adjustMap2 = adjustInfo2.getAdjustMap();
        } else {
            adjustMap2 = null;
        }
        if (!Intrinsics.LJFF(adjustMap, adjustMap2)) {
            return true;
        }
        ImageStickerInfoNewEngine stickerInfoNewEngine = singleImageData2.getStickerInfoNewEngine();
        if (stickerInfoNewEngine != null) {
            textStickerModels = stickerInfoNewEngine.getTextStickerModels();
        } else {
            textStickerModels = null;
        }
        ImageStickerInfoNewEngine stickerInfoNewEngine2 = singleImageData.getStickerInfoNewEngine();
        if (stickerInfoNewEngine2 != null) {
            textStickerModels2 = stickerInfoNewEngine2.getTextStickerModels();
        }
        if (textStickerModels == null) {
            textStickerModels = C13BV.INSTANCE;
        }
        if (textStickerModels2 == null) {
            textStickerModels2 = C13BV.INSTANCE;
        }
        if (!(!LIZ(textStickerModels, textStickerModels2, AFwS261S0000000_22.get$arr$(287), AFwS288S0000000_5.get$arr$(12))) || singleImageData.getEditImageInfo().getRatioMode() != singleImageData2.getEditImageInfo().getRatioMode() || !Intrinsics.LJ(singleImageData.getEditImageInfo().getOffsetX(), singleImageData2.getEditImageInfo().getOffsetX()) || !Intrinsics.LJ(singleImageData.getEditImageInfo().getOffsetY(), singleImageData2.getEditImageInfo().getOffsetY())) {
            return true;
        }
        return false;
    }

    public static final <T> boolean LIZ(List<? extends T> list, List<? extends T> list2, Function1<? super T, String> function1, Function2<? super T, ? super T, Boolean> function2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return false;
        }
        if (list.size() != list2.size()) {
            return true;
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        int i = 16;
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (T t : list) {
            linkedHashMap.put(function1.invoke(t), t);
        }
        int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
        if (iLIZIZ2 >= 16) {
            i = iLIZIZ2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
        for (T t2 : list2) {
            linkedHashMap2.put(function1.invoke(t2), t2);
        }
        if (!Intrinsics.LJFF(linkedHashMap.keySet(), linkedHashMap2.keySet())) {
            return true;
        }
        for (Object obj : linkedHashMap.keySet()) {
            Config config = (Object) linkedHashMap.get(obj);
            Config config2 = (Object) linkedHashMap2.get(obj);
            if (config == null || config2 == null || !function2.invoke(config, config2).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
