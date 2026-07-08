package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsServiceBioRevampOptSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.assem.PcsServiceBioContentAssemV2;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.viewmodel.PcsServiceBioVMV2;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.api.sub.SMBPreviewResponse;

/* JADX INFO: renamed from: X.0xWk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822520xWk extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsServiceBioContentAssemV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1822520xWk(PcsServiceBioContentAssemV2 pcsServiceBioContentAssemV2) {
        super(0);
        this.LL = pcsServiceBioContentAssemV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1156490gCV c1156490gCV;
        C1158720gG6 c1158720gG6;
        SMBPreviewResponse.ResponseData responseData;
        String str;
        Integer num;
        C1156490gCV c1156490gCV2;
        C1156490gCV c1156490gCV3;
        C1158720gG6 c1158720gG62;
        PcsServiceBioVMV2 pcsServiceBioVMV2Lp = this.LL.lp();
        if (!pcsServiceBioVMV2Lp.LLILZIL) {
            AbstractC521460Kci abstractC521460Kci = pcsServiceBioVMV2Lp.getState().LL;
            Long l = null;
            if ((abstractC521460Kci instanceof C1156490gCV) && (c1156490gCV = (C1156490gCV) abstractC521460Kci) != null && (c1158720gG6 = c1156490gCV.LIZ) != null && (responseData = c1158720gG6.LIZ) != null) {
                pcsServiceBioVMV2Lp.LLILZIL = true;
                AbstractC521460Kci abstractC521460Kci2 = pcsServiceBioVMV2Lp.getState().LL;
                boolean z = ((!(abstractC521460Kci2 instanceof C1156490gCV) || (c1156490gCV3 = (C1156490gCV) abstractC521460Kci2) == null || (c1158720gG62 = c1156490gCV3.LIZ) == null) ? null : c1158720gG62.LIZIZ) == EnumC1154670g9Z.CACHE;
                AbstractC521460Kci abstractC521460Kci3 = pcsServiceBioVMV2Lp.getState().LL;
                if ((abstractC521460Kci3 instanceof C1156490gCV) && (c1156490gCV2 = (C1156490gCV) abstractC521460Kci3) != null) {
                    l = c1156490gCV2.LIZIZ;
                }
                C1822330xWR c1822330xWRVQ2 = pcsServiceBioVMV2Lp.vQ2();
                int iIntValue = (c1822330xWRVQ2 == null || (num = c1822330xWRVQ2.LLJJL) == null) ? -1 : num.intValue();
                InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
                if (interfaceC517590KRpLIZJ != null) {
                    Pair[] pairArr = new Pair[1];
                    pairArr[0] = new Pair("is_cache", z ? "1" : CardStruct.IStatusCode.DEFAULT);
                    Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                    if (l != null) {
                        mapLJIIJ.put("api_request_duration", l.toString());
                    }
                    interfaceC517590KRpLIZJ.LJI(new C0KBP(iIntValue, mapLJIIJ));
                }
                C1822330xWR c1822330xWRVQ22 = pcsServiceBioVMV2Lp.vQ2();
                if (c1822330xWRVQ22 == null || !c1822330xWRVQ22.LLILZ) {
                    C1822730xX5.LIZIZ(new C1822950xXR("show", null, null, null, null, null, null, pcsServiceBioVMV2Lp.vQ2(), 126));
                    C1103300eoi c1103300eoi = C1103300eoi.LIZLLL;
                    int size = responseData.courseList.size();
                    c1103300eoi.LIZLLL(1, "smb_viewer_service_bio_open_count");
                    c1103300eoi.LJI("smb_viewer_service_bio_course_count", Integer.valueOf(size));
                    Map<String, Object> map = C1338270kvh.LIZ;
                } else {
                    C1822330xWR c1822330xWRVQ23 = pcsServiceBioVMV2Lp.vQ2();
                    if (c1822330xWRVQ23 == null || (str = c1822330xWRVQ23.LLJ) == null) {
                        str = "";
                    }
                    C1822730xX5.LIZJ(pcsServiceBioVMV2Lp.vQ2(), str, false);
                }
            }
        }
        if (LivePcsServiceBioRevampOptSetting.INSTANCE.enableOpeningAnimationOpt()) {
            this.LL.op();
        }
        return Unit.LIZ;
    }
}
