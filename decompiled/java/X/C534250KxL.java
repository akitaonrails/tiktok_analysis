package X;

import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KxL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C534250KxL {
    public static final C534250KxL LIZ = new C534250KxL();

    public static LivePhotoPreviewMode LIZIZ(boolean z) {
        LivePhotoPreviewMode livePhotoPreviewMode;
        if (z) {
            C523290Kff.LIZ.getClass();
            C578530MmZ.LIZ.getClass();
            if (!C578530MmZ.LIZ()) {
                livePhotoPreviewMode = LivePhotoPreviewMode.LIVE_PHOTO;
            } else {
                LivePhotoPreviewMode[] livePhotoPreviewModeArrValues = LivePhotoPreviewMode.values();
                int i = C523290Kff.LIZ().getInt("last_used_live_photo_preview_mode", 0);
                if (i >= 0 && i < livePhotoPreviewModeArrValues.length) {
                    livePhotoPreviewMode = livePhotoPreviewModeArrValues[i];
                } else {
                    livePhotoPreviewMode = LivePhotoPreviewMode.LIVE_PHOTO;
                }
            }
        } else {
            livePhotoPreviewMode = null;
        }
        C1450080nq2 c1450080nq2 = C1450080nq2.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getMemoryModeWithFallback: enableLiveVideoFallback=");
        sbLIZ.append(z);
        sbLIZ.append(", result=");
        sbLIZ.append(livePhotoPreviewMode);
        C201955140j.LIZLLL(c1450080nq2, "livephoto", C2188811AlT.LIZIZ(sbLIZ));
        return livePhotoPreviewMode;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel LIZ(java.util.List r18, X.C534260KxM r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C534250KxL.LIZ(java.util.List, X.0KxM, boolean):com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel");
    }

    public static C534260KxM LIZJ(List list, Function0 function0, boolean z) {
        boolean z2;
        boolean z3;
        LivePhotoPreviewMode livePhotoPreviewMode;
        C1450080nq2 c1450080nq2 = C1450080nq2.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processLivePhotoMemoryMode: liveMediasSize=");
        ArrayList arrayList = (ArrayList) list;
        sbLIZ.append(arrayList.size());
        C201955140j.LIZLLL(c1450080nq2, "livephoto", C2188811AlT.LIZIZ(sbLIZ));
        boolean z4 = true;
        boolean z5 = false;
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                LivePhotoInfo livePhotoInfo = ((MediaModel) it2.next()).livePhotoInfo;
                if (livePhotoInfo != null && livePhotoInfo.getHasUserClickedIcon()) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        if (z && !z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1450080nq2 c1450080nq22 = C1450080nq2.LIZIZ;
        C201955140j.LIZLLL(c1450080nq22, "livephoto", "processLivePhotoMemoryMode: hasClickedIcon=" + z2 + ", shouldApplyMemory=" + z3);
        if (z3) {
            livePhotoPreviewMode = (LivePhotoPreviewMode) function0.invoke();
            if (livePhotoPreviewMode == null) {
                z4 = false;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("processLivePhotoMemoryMode: applied memory mode=");
            sbLIZ2.append(livePhotoPreviewMode);
            C201955140j.LIZLLL(c1450080nq22, "livephoto", C2188811AlT.LIZIZ(sbLIZ2));
            z5 = z4;
        } else {
            C201955140j.LIZLLL(c1450080nq22, "livephoto", "processLivePhotoMemoryMode: skip memory, keep individual state");
            livePhotoPreviewMode = null;
        }
        C534260KxM c534260KxM = new C534260KxM(livePhotoPreviewMode, z2, z5, z3);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("processLivePhotoMemoryMode: result=");
        sbLIZ3.append(c534260KxM);
        C201955140j.LIZLLL(c1450080nq22, "livephoto", C2188811AlT.LIZIZ(sbLIZ3));
        return c534260KxM;
    }
}
