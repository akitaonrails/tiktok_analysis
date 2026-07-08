package Y;

import X.C09JN;
import X.C1104600eqo;
import X.C1C7U;
import X.C497740JfY;
import X.C501470JlZ;
import X.C501520Jle;
import X.C501540Jlg;
import X.C752620Tfg;
import X.C756110TlJ;
import X.C756230TlV;
import X.C766270U4b;
import X.InterfaceC749850TbD;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.dataChannel.InitGoodyBagChannel;
import com.bytedance.android.livesdk.livesetting.ModeratorAddFailAppendToastSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksCountResponse;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.BALeadsGenCountResponse;
import java.lang.ref.WeakReference;
import webcast.api.goody_bag.GetRoomGoodyBagResponse;

/* JADX INFO: loaded from: classes13.dex */
public class AfS56S0110000_12 implements C09JN {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS56S0110000_12 afS56S0110000_12, Object obj) {
        C1C7U.LIZ("GoodyBagService@cede.getRoomGoodyBag$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        DataChannel dataChannel = (DataChannel) afS56S0110000_12.l0;
        if (dataChannel != null) {
            dataChannel.zW(InitGoodyBagChannel.class, baseResponse.data);
        }
        C1104600eqo.LJI(Integer.valueOf(baseResponse.statusCode), afS56S0110000_12.z1, (GetRoomGoodyBagResponse.ResponseData) baseResponse.data);
        C1C7U.LIZIZ("GoodyBagService@cede.getRoomGoodyBag$2");
    }

    public static final void accept$1(AfS56S0110000_12 afS56S0110000_12, Object obj) {
        C1C7U.LIZ("AdminManager@fd5f.updateAdmin$2");
        Throwable th = (Throwable) obj;
        if (ModeratorAddFailAppendToastSetting.INSTANCE.enable() && afS56S0110000_12.z1 && (th instanceof C501470JlZ) && ((C501520Jle) th).getErrorCode() == 59001) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131851140));
        } else {
            C501540Jlg.LIZLLL(C497740JfY.LJII(), th, 2131853482);
        }
        InterfaceC749850TbD interfaceC749850TbD = (InterfaceC749850TbD) ((WeakReference) afS56S0110000_12.l0).get();
        if (interfaceC749850TbD != null) {
            interfaceC749850TbD.Rk((Exception) th);
        }
        if (afS56S0110000_12.z1) {
            C752620Tfg.LIZ("ttlive_add_admin", th).LJIIIZ();
        } else {
            C752620Tfg.LIZ("ttlive_delete_admin", th).LJIIIZ();
        }
        C1C7U.LIZIZ("AdminManager@fd5f.updateAdmin$2");
    }

    public static final void accept$2(AfS56S0110000_12 afS56S0110000_12, Object obj) {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<String> mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3;
        C1C7U.LIZ("BALeadsGenBeforeLiveWidget@8d6a.updateIconAlertNum$1");
        BALeadsGenCountResponse bALeadsGenCountResponse = (BALeadsGenCountResponse) obj;
        if (bALeadsGenCountResponse.count >= 1) {
            C756110TlJ c756110TlJ = (C756110TlJ) afS56S0110000_12.l0;
            c756110TlJ.LLJ = true;
            IIconSlot.SlotViewModel slotViewModel = c756110TlJ.LLILZ;
            if (slotViewModel != null && (mutableLiveData3 = slotViewModel.LLIZ) != null) {
                mutableLiveData3.setValue(Boolean.FALSE);
            }
            IIconSlot.SlotViewModel slotViewModel2 = ((C756110TlJ) afS56S0110000_12.l0).LLILZ;
            if (slotViewModel2 != null && (mutableLiveData2 = slotViewModel2.LLILZLL) != null) {
                mutableLiveData2.setValue(String.valueOf(bALeadsGenCountResponse.count));
            }
        } else {
            C756110TlJ c756110TlJ2 = (C756110TlJ) afS56S0110000_12.l0;
            c756110TlJ2.LLJ = false;
            IIconSlot.SlotViewModel slotViewModel3 = c756110TlJ2.LLILZ;
            if (slotViewModel3 != null && (mutableLiveData = slotViewModel3.LLIZ) != null) {
                mutableLiveData.setValue(Boolean.valueOf(!afS56S0110000_12.z1));
            }
        }
        C1C7U.LIZIZ("BALeadsGenBeforeLiveWidget@8d6a.updateIconAlertNum$1");
    }

    public static final void accept$3(AfS56S0110000_12 afS56S0110000_12, Object obj) {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<String> mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3;
        C1C7U.LIZ("BusinessLinksBeforeLiveWidget@9196.updateIconAlertNum$1");
        BusinessLinksCountResponse businessLinksCountResponse = (BusinessLinksCountResponse) obj;
        if (businessLinksCountResponse.total >= 1) {
            IIconSlot.SlotViewModel slotViewModel = ((C756230TlV) afS56S0110000_12.l0).LLILZIL;
            if (slotViewModel != null && (mutableLiveData3 = slotViewModel.LLIZ) != null) {
                mutableLiveData3.setValue(Boolean.FALSE);
            }
            IIconSlot.SlotViewModel slotViewModel2 = ((C756230TlV) afS56S0110000_12.l0).LLILZIL;
            if (slotViewModel2 != null && (mutableLiveData2 = slotViewModel2.LLILZLL) != null) {
                mutableLiveData2.setValue(String.valueOf(businessLinksCountResponse.total));
            }
        } else {
            IIconSlot.SlotViewModel slotViewModel3 = ((C756230TlV) afS56S0110000_12.l0).LLILZIL;
            if (slotViewModel3 != null && (mutableLiveData = slotViewModel3.LLIZ) != null) {
                mutableLiveData.setValue(Boolean.valueOf(!afS56S0110000_12.z1));
            }
        }
        C1C7U.LIZIZ("BusinessLinksBeforeLiveWidget@9196.updateIconAlertNum$1");
    }

    public AfS56S0110000_12(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
