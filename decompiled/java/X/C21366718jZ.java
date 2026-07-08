package X;

import com.ss.android.ugc.aweme.sticker.EffectSdkExtra;
import com.ss.android.vesdk.VEImageDetectUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.18jZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21366718jZ implements InterfaceC21360418iY {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(315));

    @Override // X.InterfaceC21360418iY
    public final void LIZIZ() {
        VEImageDetectUtils vEImageDetectUtils = ((C21367018jc) this.LIZ.getValue()).LIZ;
        if (vEImageDetectUtils != null) {
            vEImageDetectUtils.stopDetectImagesContentIfNeed();
        }
    }

    @Override // X.InterfaceC21360418iY
    public final void LIZ(String str, List list, EffectSdkExtra effectSdkExtra, final C21525019Ls c21525019Ls) {
        if (effectSdkExtra.getPl().getAlg().size() == 0) {
            return;
        }
        C21367018jc c21367018jc = (C21367018jc) this.LIZ.getValue();
        ArrayList<String> alg = effectSdkExtra.getPl().getAlg();
        VEImageDetectUtils.IDetectImageResultWithNumListener iDetectImageResultWithNumListener = new VEImageDetectUtils.IDetectImageResultWithNumListener() { // from class: X.18ja
            @Override // com.ss.android.vesdk.VEImageDetectUtils.IDetectImageResultWithNumListener
            public final void onDetectResult(String str2, String str3, String str4, int i) {
                c21525019Ls.invoke(str2, str3, str4, Integer.valueOf(i));
                VEImageDetectUtils vEImageDetectUtils = ((C21367018jc) this.LIZ.getValue()).LIZ;
                if (vEImageDetectUtils != null) {
                    vEImageDetectUtils.stopDetectImagesContentIfNeed();
                }
            }
        };
        synchronized (c21367018jc) {
            VEImageDetectUtils vEImageDetectUtils = new VEImageDetectUtils();
            vEImageDetectUtils.init();
            vEImageDetectUtils.setDetectImageContentWithNumListener(iDetectImageResultWithNumListener);
            vEImageDetectUtils.detectImagesContentWithSize(str, list, alg, 1280, 1280);
            vEImageDetectUtils.destroy();
            c21367018jc.LIZ = vEImageDetectUtils;
        }
    }
}
