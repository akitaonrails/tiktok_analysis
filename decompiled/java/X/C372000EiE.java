package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EiE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C372000EiE implements InterfaceC365900EWe {
    public static final /* synthetic */ int LIZJ = 0;
    public final C554970Lpf LIZ;
    public Map<SingleImageData, Integer> LIZIZ;

    @Override // X.InterfaceC365900EWe
    public final int LIZIZ() {
        return 11;
    }

    @Override // X.InterfaceC365900EWe
    public final int getPriority() {
        return 1100;
    }

    @Override // X.InterfaceC365900EWe
    public final C554970Lpf getParams() {
        return this.LIZ;
    }

    public C372000EiE(C554970Lpf c554970Lpf) {
        this.LIZ = c554970Lpf;
    }

    @Override // X.InterfaceC365900EWe
    public final Object LIZJ(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        Map<SingleImageData, Integer> needCompileImages;
        ImageAlbumData imageAlbumData;
        ImageAlbumData imageAlbumData2 = this.LIZ.LJ.LJJJJIZL.imageAlbumData;
        if (imageAlbumData2 != null) {
            needCompileImages = imageAlbumData2.getNeedCompileImages();
        } else {
            needCompileImages = null;
        }
        this.LIZIZ = needCompileImages;
        boolean z = false;
        if ((needCompileImages == null || needCompileImages.isEmpty()) && ((imageAlbumData = this.LIZ.LJ.LJJJJIZL.imageAlbumData) == null || !Intrinsics.LJFF(imageAlbumData.getImageUiBusinessData().getHasNLEEdit(), Boolean.TRUE))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC365900EWe
    public final Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return true;
    }

    @Override // X.InterfaceC365900EWe
    public final Map<C0FAO, List<String>> LJ(AwemeDraft awemeDraft) {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC365900EWe
    public final Object LJFF(InterfaceC1364105Vn<? super List<DraftFileRestoreResult>> interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C0M7M.LIZ("DraftImageModeRestoreHandler ; restore start ...");
        ImageAlbumData imageAlbumData = this.LIZ.LJ.LJJJJIZL.imageAlbumData;
        if (imageAlbumData != null && Intrinsics.LJFF(imageAlbumData.getImageUiBusinessData().getHasNLEEdit(), Boolean.TRUE)) {
            C365980EWm.LIZ(this.LIZ.LJ);
        }
        Map<SingleImageData, Integer> map = this.LIZIZ;
        if (map != null && !map.isEmpty()) {
            FetchResourcesListener fetchResourcesListener = new FetchResourcesListener() { // from class: X.0EiF
                @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
                public final void onSuccess() {
                    int version = C372020EiG.LIZ() ? this.LIZ.LJ.LIZIZ().getVersion() : this.LIZ.LJ.LIZIZ().getVersion() + 1;
                    C372000EiE c372000EiE = this;
                    Map<SingleImageData, Integer> map2 = c372000EiE.LIZIZ;
                    AwemeDraft awemeDraft = c372000EiE.LIZ.LJ;
                    ImageAlbumData imageAlbumData2 = awemeDraft.LJJJJIZL.imageAlbumData;
                    CreativeInfo creativeInfoLIZIZ = awemeDraft.LIZIZ();
                    CreativeInfo creativeInfoCopy = creativeInfoLIZIZ.copy(creativeInfoLIZIZ.creationId, version, creativeInfoLIZIZ.sessionId);
                    C372000EiE c372000EiE2 = this;
                    C574070MfN.LIZ(creativeInfoCopy, c372000EiE2.LIZ.LJ.LIZ, imageAlbumData2, map2, new AwS406S0200000_5((InterfaceC20236714Gf) c2252611DEt, (InterfaceC20236714Gf<? super List<DraftFileRestoreResult>>) c372000EiE2, (C372000EiE) 140));
                }

                @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
                public final void onFailed(Exception exc) {
                    InterfaceC20236714Gf<List<DraftFileRestoreResult>> interfaceC20236714Gf = c2252611DEt;
                    List listSingletonList = Collections.singletonList(this.LJI(null, false, new DraftFileRestoreException(-3000, exc, "ImageMode")));
                    C189200o6.m2constructorimpl(listSingletonList);
                    interfaceC20236714Gf.resumeWith(listSingletonList);
                }
            };
            ImageAlbumData imageAlbumData2 = this.LIZ.LJ.LJJJJIZL.imageAlbumData;
            if (imageAlbumData2 != null && imageAlbumData2.getAutoEnhanceOn() && !C1661710tLN.LIZ("lens_hdr")) {
                DownloadableModelSupport.getInstance().fetchResourcesWithModelNames(0, new String[]{"lens_hdr"}, fetchResourcesListener);
            } else {
                fetchResourcesListener.onSuccess();
            }
        } else {
            List listSingletonList = Collections.singletonList(LJI(null, false, new DraftFileRestoreException(0, null, "Unknown")));
            C189200o6.m2constructorimpl(listSingletonList);
            c2252611DEt.resumeWith(listSingletonList);
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    @Override // X.InterfaceC365900EWe
    public final DraftFileRestoreResult LJI(Integer num, boolean z, DraftFileRestoreException draftFileRestoreException) {
        return C365890EWd.LIZ(this, num, z, draftFileRestoreException);
    }
}
