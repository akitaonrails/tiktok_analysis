package X;

import com.bytedance.android.livesdk.chatroom.api.SimplePinCardInfo;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.moderator.PcsServiceBioModeratorDialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.PcsServiceBioFragmentV2;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.api.sub.SMBPreviewResponse;
import webcast.api.sub.SMBServicePinInfo;

/* JADX INFO: renamed from: X.0JLB, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JLB extends C09AY implements Function2<C03H5, C0JLF, Unit> {
    public final /* synthetic */ IPcsLoadingAbility LL;
    public final /* synthetic */ PcsServiceBioModeratorDialog LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JLB(IPcsLoadingAbility iPcsLoadingAbility, PcsServiceBioModeratorDialog pcsServiceBioModeratorDialog) {
        super(2);
        this.LL = iPcsLoadingAbility;
        this.LLILLJJLI = pcsServiceBioModeratorDialog;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, C0JLF c0jlf) {
        IPcsLoadingAbility iPcsLoadingAbility;
        String str;
        String str2;
        String str3;
        List<SimplePinCardInfo> list;
        C0JLF c0jlf2 = c0jlf;
        if (c0jlf2 instanceof C0JLE) {
            IPcsLoadingAbility iPcsLoadingAbility2 = this.LL;
            if (iPcsLoadingAbility2 != null) {
                iPcsLoadingAbility2.LJLJLJ();
            }
        } else if (c0jlf2 instanceof C0JLD) {
            IPcsLoadingAbility iPcsLoadingAbility3 = this.LL;
            if (iPcsLoadingAbility3 != null) {
                iPcsLoadingAbility3.LJJJJL();
            }
            PcsServiceBioModeratorDialog pcsServiceBioModeratorDialog = this.LLILLJJLI;
            SMBPreviewResponse.ResponseData responseData = ((C0JLD) c0jlf2).LIZ;
            pcsServiceBioModeratorDialog.getClass();
            SMBServicePinInfo sMBServicePinInfo = responseData.smbServicePinInfo;
            if (sMBServicePinInfo != null && (list = sMBServicePinInfo.pinCardList) != null && C500260Jjc.LJJIJIIJI(list)) {
                C723850SaN.LIZ(pcsServiceBioModeratorDialog, false, null, new C1149404ea(pcsServiceBioModeratorDialog), 3);
            } else {
                C0JJO c0jjoXf = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf();
                C0JLC c0jlc = pcsServiceBioModeratorDialog.LLJZ;
                if (c0jlc != null) {
                    str = c0jlc.LIZ;
                } else {
                    str = null;
                }
                String str4 = "";
                if (str == null) {
                    str = "";
                }
                if (c0jlc == null || (str2 = c0jlc.LIZIZ) == null) {
                    str2 = "";
                }
                if (c0jlc != null && (str3 = c0jlc.LIZLLL) != null) {
                    str4 = str3;
                }
                PcsServiceBioFragmentV2 pcsServiceBioFragmentV2LJIILL = c0jjoXf.LJIILL(new C521380Kca(str, str2, false, str4), C2097608Jq.LJ());
                if (pcsServiceBioFragmentV2LJIILL != null) {
                    C19EH c19ehLJIIJ = pcsServiceBioModeratorDialog.getChildFragmentManager().LJIIJ();
                    c19ehLJIIJ.LJIJ(R.id.utv, pcsServiceBioFragmentV2LJIILL, null);
                    c19ehLJIIJ.LJIIL();
                }
            }
        } else if ((c0jlf2 instanceof C0JLM) && (iPcsLoadingAbility = this.LL) != null) {
            iPcsLoadingAbility.Ly2(C1734970vFX.LIZ(new C0JL9(this.LLILLJJLI)), null, null);
        }
        return Unit.LIZ;
    }
}
