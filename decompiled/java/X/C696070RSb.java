package X;

import com.ss.android.ugc.aweme.feed.AIGCInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RSb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.photodownload.DownloadPhotoGlobal$onShareSuccess$4$2", f = "DownloadPhotoGlobal.kt", l = {}, m = "invokeSuspend")
public final class C696070RSb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C696070RSb(InterfaceC1364105Vn<? super C696070RSb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C696070RSb(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int aIGCLabelType;
        AIGCInfo aIGCInfo;
        C1C7U.LIZ("DownloadPhotoGlobal@bbdf.onShareSuccess$4$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IAVPublishService iAVPublishServicePublishService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
        C1376010luZ c1376010luZ = C1376010luZ.LIZ;
        c1376010luZ.getClass();
        Aweme aweme = C1376010luZ.LJI;
        List<String> listLLIIII = C13LP.LLIIII(C1376010luZ.LJIILJJIL);
        c1376010luZ.getClass();
        Aweme aweme2 = C1376010luZ.LJI;
        if (aweme2 != null && (aIGCInfo = aweme2.aigcInfo) != null) {
            aIGCLabelType = aIGCInfo.getAIGCLabelType();
        } else {
            aIGCLabelType = 0;
        }
        iAVPublishServicePublishService.readImageAndAddAIGCWatermarkIfNeed(aweme, listLLIIII, aIGCLabelType);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DownloadPhotoGlobal@bbdf.onShareSuccess$4$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C696070RSb(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
