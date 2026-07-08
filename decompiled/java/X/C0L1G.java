package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoMemoryState;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0L1G, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L1G {
    public static final C0L1G LIZ = new C0L1G();

    public static boolean LIZ(ImageAlbumData imageAlbumData) {
        int iLJII;
        AICoverInfo aiCoverInfo;
        if (imageAlbumData == null) {
            return false;
        }
        C1446760nkg.LIZ.getClass();
        if (C1446760nkg.LIZJ() && (aiCoverInfo = imageAlbumData.getAiCoverInfo()) != null && aiCoverInfo.getAnyGenerating()) {
            C533730KwV.LIZ.getClass();
            iLJII = C533730KwV.LJII() - 1;
        } else {
            C533730KwV.LIZ.getClass();
            iLJII = C533730KwV.LJII();
        }
        if (imageAlbumData.getImageList().size() >= iLJII) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(Intent intent, VideoPublishEditModel videoPublishEditModel) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra == null) {
            return;
        }
        ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel.getImportInfoList();
        if (importInfoList != null) {
            int size = importInfoList.size();
            ArrayList<ImportVideoInfo> importInfoList2 = videoPublishEditModel.getImportInfoList();
            if (importInfoList2 != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(parcelableArrayListExtra, 10));
                int i = 0;
                for (Object obj : parcelableArrayListExtra) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        arrayList.add(C574070MfN.LIZJ((MediaModel) obj, i + size));
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                importInfoList2.addAll(arrayList);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    public static void LIZJ(Intent intent, VideoPublishEditModel videoPublishEditModel) {
        ?? arrayList;
        boolean z;
        Map<String, MediaModel> map;
        C1450080nq2 c1450080nq2 = C1450080nq2.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLivePhotoMapValue: start, PhotoModeSupportLivePhoto.enable=");
        sbLIZ.append(C295670BiP.LIZ());
        C201955140j.LIZLLL(c1450080nq2, "livephoto", C2188811AlT.LIZIZ(sbLIZ));
        if (!C295670BiP.LIZ()) {
            return;
        }
        Serializable serializableExtra = null;
        if (intent != null) {
            serializableExtra = intent.getSerializableExtra("key_choose_media_add_live_photo");
        }
        if (serializableExtra instanceof HashMap) {
            HashMap map2 = (HashMap) serializableExtra;
            int size = 0;
            boolean z2 = true;
            if (map2 != null && !map2.isEmpty()) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
                if (parcelableArrayListExtra != null) {
                    arrayList = new ArrayList();
                    for (Object obj : parcelableArrayListExtra) {
                        if (map2.containsKey(((MediaModel) obj).id)) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                C1450080nq2 c1450080nq22 = C1450080nq2.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateLivePhotoMapValue: newLivePhotos.size=");
                sbLIZ2.append(arrayList.size());
                sbLIZ2.append(", livePhotoMap.size=");
                sbLIZ2.append(map2.size());
                C201955140j.LIZLLL(c1450080nq22, "livephoto", C2188811AlT.LIZIZ(sbLIZ2));
                if (arrayList.isEmpty()) {
                    return;
                }
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        LivePhotoInfo livePhotoInfo = ((MediaModel) it2.next()).livePhotoInfo;
                        if (livePhotoInfo != null && livePhotoInfo.getHasUserClickedIcon()) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                LivePhotoModel livePhotoModel = videoPublishEditModel.creativeModel.livePhotoModel;
                if (livePhotoModel == null) {
                    C201955140j.LIZLLL(C1450080nq2.LIZIZ, "livephoto", "updateLivePhotoMapValueWithMemory: existingModel unexpectedly null, creating fallback");
                    livePhotoModel = new LivePhotoModel(LivePhotoPreviewMode.LIVE_PHOTO, new LivePhotoMemoryState(false, false, false, false), null, null, null, false, false, 0, 0L, 0, null, 2044, null);
                    videoPublishEditModel.creativeModel.livePhotoModel = livePhotoModel;
                }
                C1450080nq2 c1450080nq23 = C1450080nq2.LIZIZ;
                C201955140j.LIZLLL(c1450080nq23, "livephoto", "updateLivePhotoMapValueWithMemory: newSwitchedInAlbum=" + z + ", existingListSize=" + livePhotoModel.importedLivePhotoList.size());
                boolean z3 = livePhotoModel.memoryState.switchedInAlbum;
                if (z) {
                    C201955140j.LIZLLL(c1450080nq23, "livephoto", "updateLivePhotoMapValueWithMemory: keep album mode (user explicitly switched)");
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        LivePhotoInfo livePhotoInfo2 = ((MediaModel) it3.next()).livePhotoInfo;
                        if (livePhotoInfo2 != null) {
                            livePhotoInfo2.setLivePhotoPreviewMode("LIVE_PHOTO");
                        }
                    }
                    C201955140j.LIZLLL(C1450080nq2.LIZIZ, "livephoto", "updateLivePhotoMapValueWithMemory: reset new photos to LIVE_PHOTO");
                }
                LivePhotoMemoryState livePhotoMemoryState = livePhotoModel.memoryState;
                if (!z3 && !z) {
                    z2 = false;
                }
                livePhotoMemoryState.switchedInAlbum = z2;
                livePhotoMemoryState.memoryEnabled = false;
                List<? extends MediaModel> list = livePhotoModel.importedLivePhotoList;
                livePhotoModel.importedLivePhotoList = C13LP.LJLIL(arrayList, list);
                C1450080nq2 c1450080nq24 = C1450080nq2.LIZIZ;
                C201955140j.LIZLLL(c1450080nq24, "livephoto", "updateLivePhotoMapValueWithMemory: updated importedLivePhotoList, oldSize=" + list.size() + ", newSize=" + livePhotoModel.importedLivePhotoList.size());
                if (livePhotoModel.embeddedVideoMap.isEmpty()) {
                    livePhotoModel.embeddedVideoMap = new LinkedHashMap();
                }
                livePhotoModel.embeddedVideoMap.putAll(map2);
                StringBuilder sb = new StringBuilder("updateLivePhotoMapValueWithMemory: done, embeddedVideoMap.size=");
                LivePhotoModel livePhotoModel2 = videoPublishEditModel.creativeModel.livePhotoModel;
                if (livePhotoModel2 != null && (map = livePhotoModel2.embeddedVideoMap) != null) {
                    size = map.size();
                }
                sb.append(size);
                C201955140j.LIZLLL(c1450080nq24, "livephoto", sb.toString());
            }
        }
    }
}
