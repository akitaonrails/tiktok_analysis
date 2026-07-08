package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.calendlymeeting.PcsCalendlyBookingData;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.thirdpartylink.PcsThirdPartyLinkData;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeetingdmdialog.dialog.CalendlyMeetingDmDialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.dialog.PcsServicePlusOptinFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.PcsServiceBioFragmentV2;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.OneStopSheetFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.Map;
import webcast.api.sub.FormInfo;
import webcast.api.sub.SMBPreviewResponse;

/* JADX INFO: renamed from: X.0JJO, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public interface C0JJO {
    PcsServicePlusOptinFragment LIZ(PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams);

    void LIZIZ(C0JLC c0jlc);

    void LIZJ(String str, String str2, DataChannel dataChannel, Bundle bundle, C1814370xJb c1814370xJb);

    OneStopSheetFragment LIZLLL(Bundle bundle);

    void LJ(int i, DataChannel dataChannel);

    void LJFF(C521380Kca c521380Kca, Map<String, String> map, boolean z, boolean z2, SMBPreviewResponse.ResponseData responseData);

    void LJI(DataChannel dataChannel, int i);

    void LJII(long j, DataChannel dataChannel, String str);

    void LJIIIIZZ(Context context, FragmentManager fragmentManager, PcsCalendlyBookingData pcsCalendlyBookingData);

    CalendlyMeetingDmDialog LJIIIZ();

    void LJIIJ(C1822010xVv c1822010xVv);

    void LJIIJJI(String str, String str2, String str3, Map map, boolean z);

    Fragment LJIIL(PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams);

    void LJIILIIL(List<FormInfo> list);

    void LJIILJJIL(PcsThirdPartyLinkData pcsThirdPartyLinkData);

    PcsServiceBioFragmentV2 LJIILL(C521380Kca c521380Kca, Map map);

    void LJIILLIIL(String str, String str2, String str3, String str4, String str5, List<String> list, Map<String, String> map, Map<String, String> map2);

    C758450Tp5 LJIIZILJ();

    void LJIJ(Context context, PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams);
}
