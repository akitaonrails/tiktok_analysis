package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14Ug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20273214Ug extends AbstractC20273414Ui {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        InterfaceC20273114Uf interfaceC20273114Uf;
        InterfaceC20273314Uh interfaceC20273314Uh = (InterfaceC20273314Uh) xBaseParamModel;
        String sourceType = interfaceC20273314Uh.getSourceType();
        String cameraType = interfaceC20273314Uh.getCameraType();
        if (!interfaceC20273314Uh.getMediaTypes().isEmpty() && sourceType.length() != 0) {
            if (Intrinsics.LJFF(sourceType.toLowerCase(Locale.ROOT), "camera") && (cameraType == null || cameraType.length() == 0)) {
                C2382909Vj.LIZ(completionBlock, -3, "CameraType not provided with sourceType specified as camera in params", null, 4);
                return;
            }
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
                List<String> mediaTypes = interfaceC20273314Uh.getMediaTypes();
                String sourceType2 = interfaceC20273314Uh.getSourceType();
                int iIntValue = interfaceC20273314Uh.getMaxCount().intValue();
                boolean compressImage = interfaceC20273314Uh.getCompressImage();
                boolean saveToPhotoAlbum = interfaceC20273314Uh.getSaveToPhotoAlbum();
                String cameraType2 = interfaceC20273314Uh.getCameraType();
                if (cameraType2 == null) {
                    cameraType2 = "";
                }
                C14UW c14uw = new C14UW(iIntValue, sourceType2, compressImage, saveToPhotoAlbum, interfaceC20273314Uh.getCompressWidth().intValue(), mediaTypes, cameraType2, interfaceC20273314Uh.getCompressHeight().intValue(), interfaceC20273314Uh.getCompressQuality().intValue());
                c14uw.LJIIIZ = interfaceC20273314Uh.isNeedCut();
                c14uw.LJIIJJI = interfaceC20273314Uh.getCropRatioHeight().intValue();
                c14uw.LJIIJ = interfaceC20273314Uh.getCropRatioWidth().intValue();
                c14uw.LJIIL = interfaceC20273314Uh.getNeedBase64Data();
                c14uw.LJIILIIL = interfaceC20273314Uh.getCompressOption().intValue();
                c14uw.LJIILJJIL = interfaceC20273314Uh.getPermissionDenyAction().intValue();
                c14uw.LJIILL = interfaceC20273314Uh.isMultiSelect();
                c14uw.LJIILLIIL = interfaceC20273314Uh.getUseNewCompressSolution();
                C14UQ c14uq = new C14UQ(completionBlock);
                C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
                if (c1874950ytJ != null && (interfaceC20273114Uf = c1874950ytJ.LJIIJJI) != null) {
                    interfaceC20273114Uf.LIZ(context, c14uw, c14uq);
                    return;
                } else {
                    C2382909Vj.LIZ(completionBlock, 0, "hostMediaDepend is null", null, 4);
                    return;
                }
            }
            C2382909Vj.LIZ(completionBlock, 0, "Context not provided in host", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, -3, "Invalid params: mediaTypes or sourceType is empty", null, 4);
    }
}
