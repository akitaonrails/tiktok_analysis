package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RUk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.photodownload.DownloadPhotoGlobal$onShareSuccess$4$3", f = "DownloadPhotoGlobal.kt", l = {}, m = "invokeSuspend")
public final class C696680RUk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IAVPublishService LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C696680RUk(IAVPublishService iAVPublishService, InterfaceC1364105Vn<? super C696680RUk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iAVPublishService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C696680RUk(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        String aIGCAddAIPortraitWatermarkForSingleImage;
        InterfaceC707110RoT interfaceC707110RoTLIZIZ;
        C1C7U.LIZ("DownloadPhotoGlobal@bbdf.onShareSuccess$4$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<String> listLLIIII = C13LP.LLIIII(C1376010luZ.LJIILJJIL);
        IAVPublishService iAVPublishService = this.LL;
        for (String str : listLLIIII) {
            Integer num = (Integer) ((HashMap) C1376010luZ.LJIILLIIL).get(((HashMap) C1376010luZ.LJIIZILJ).get(str));
            boolean z = false;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            IAIPortraitFeatureService.LIZ.getClass();
            IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
            if (iAIPortraitFeatureServiceLIZ != null && (interfaceC707110RoTLIZIZ = iAIPortraitFeatureServiceLIZ.LIZIZ()) != null) {
                C1376010luZ.LIZ.getClass();
                if (interfaceC707110RoTLIZIZ.LIZLLL(iIntValue, C1376010luZ.LJI)) {
                    z = true;
                }
            }
            C1376010luZ.LIZ.getClass();
            if (iAVPublishService.addAiChatWatermarkWhenDownload(C1376010luZ.LJI, iIntValue)) {
                IWaterMarkService iWaterMarkService = (IWaterMarkService) PluggableExtentionKt.pluggableSpi$default(IWaterMarkService.class, false, false, false, 14, null);
                if (iWaterMarkService != null) {
                    iWaterMarkService.addAiChatWaterMarkToImage(str, str);
                }
            } else if (z) {
                IWaterMarkService iWaterMarkService2 = (IWaterMarkService) PluggableExtentionKt.pluggableSpi$default(IWaterMarkService.class, false, false, false, 14, null);
                if (iWaterMarkService2 == null || (aIGCAddAIPortraitWatermarkForSingleImage = iWaterMarkService2.readAIGCAddAIPortraitWatermarkForSingleImage(str, str)) == null) {
                    aIGCAddAIPortraitWatermarkForSingleImage = str;
                }
                C1376010luZ.LJII(str, aIGCAddAIPortraitWatermarkForSingleImage);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DownloadPhotoGlobal@bbdf.onShareSuccess$4$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
