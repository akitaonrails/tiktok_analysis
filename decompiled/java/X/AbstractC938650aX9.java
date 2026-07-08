package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSupportNewLayoutInFeedSetting;
import com.bytedance.android.livesdk.model.message.LinkMicFanTicketMethod;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aX9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC938650aX9 extends C938710aXF implements InterfaceC920850a4R {
    public final String LIZIZ;
    public C932420aN6 LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;
    public final C01GW LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;
    public LinkMicFanTicketMethod LJIILJJIL;
    public final C987070bnF LJIILL;

    public abstract String LJIIIZ();

    public abstract User LJIIJ();

    public final MutableLiveData<ImageModel> LJFF() {
        return (MutableLiveData) this.LJI.getValue();
    }

    public final MutableLiveData<C939680aYo> LJI() {
        return (MutableLiveData) this.LJFF.getValue();
    }

    public final MutableLiveData<Long> LJII() {
        return (MutableLiveData) this.LJII.getValue();
    }

    public final MutableLiveData<String> LJIIIIZZ() {
        return (MutableLiveData) this.LJIIIZ.getValue();
    }

    public final MutableLiveData<Integer> LJIIJJI() {
        return (MutableLiveData) this.LJIIJ.getValue();
    }

    public void LJIIL() {
        DataChannel dataChannel;
        InterfaceC922070a6P interfaceC922070a6P;
        InterfaceC922070a6P interfaceC922070a6P2;
        IMessageManager iMessageManager;
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class)) != null) {
            iMessageManager.addStickyMessageListener(C001A.LINK_MIC_FAN_TICKET_METHOD.getIntType(), this.LJIILL);
        }
        DataChannel dataChannel3 = this.LIZ;
        if (dataChannel3 != null && (interfaceC922070a6P2 = (InterfaceC922070a6P) C933980aPc.LJII(dataChannel3, InterfaceC922070a6P.class)) != null) {
            interfaceC922070a6P2.LJJI(this);
        }
        if (LinkMicSupportNewLayoutInFeedSetting.INSTANCE.getValue() && (dataChannel = this.LIZ) != null && (interfaceC922070a6P = (InterfaceC922070a6P) C933980aPc.LJII(dataChannel, InterfaceC922070a6P.class)) != null) {
            ((LiveData) this.LJIIIIZZ.getValue()).postValue(Boolean.valueOf(interfaceC922070a6P.LJIJ()));
        }
        LJII().observeForever((Observer) this.LJ.getValue());
    }

    public void LJIILIIL() {
        IMessageManager iMessageManager;
        InterfaceC922070a6P interfaceC922070a6P;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (interfaceC922070a6P = (InterfaceC922070a6P) C933980aPc.LJII(dataChannel, InterfaceC922070a6P.class)) != null) {
            interfaceC922070a6P.LJ(this);
        }
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener(this.LJIILL);
        }
        LJII().removeObserver((Observer) this.LJ.getValue());
        C932420aN6 c932420aN6 = this.LIZJ;
        if (c932420aN6 != null) {
            c932420aN6.dismiss();
        }
    }

    @Override // X.InterfaceC920850a4R
    public final void LIZJ(InterfaceC922070a6P interfaceC922070a6P) {
        LJIILJJIL(LJIIJJI(), Integer.valueOf(interfaceC922070a6P.LJIIJ(this.LIZIZ)));
    }

    public final void LJ(boolean z) {
        LJIILJJIL((MutableLiveData) this.LJIILIIL.getValue(), Boolean.valueOf(z));
    }

    public AbstractC938650aX9(DataChannel dataChannel, String str) {
        super(dataChannel);
        this.LIZIZ = str;
        this.LIZLLL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1058));
        this.LJ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1057));
        this.LJFF = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(416));
        this.LJI = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(415));
        this.LJII = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(417));
        this.LJIIIIZZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(421));
        this.LJIIIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(418));
        this.LJIIJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(423));
        this.LJIIJJI = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(420));
        this.LJIIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(422));
        this.LJIILIIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(419));
        this.LJIILL = new C987070bnF(this, 7);
    }

    public static void LJIILJJIL(MutableLiveData mutableLiveData, Object obj) {
        if (!Intrinsics.LJFF(mutableLiveData.getValue(), obj)) {
            mutableLiveData.setValue(obj);
        }
    }

    @Override // X.InterfaceC920850a4R
    public final void LIZ(InterfaceC922070a6P interfaceC922070a6P, String str) {
        if (Intrinsics.LJFF(str, this.LIZIZ)) {
            LJIILJJIL(LJIIJJI(), Integer.valueOf(interfaceC922070a6P.LJIIJ(str)));
        }
    }

    @Override // X.InterfaceC920850a4R
    public final void LIZIZ(InterfaceC922070a6P interfaceC922070a6P, String str) {
        if (Intrinsics.LJFF(str, this.LIZIZ)) {
            LJIILJJIL((MutableLiveData) this.LJIIL.getValue(), Integer.valueOf(interfaceC922070a6P.LJIIZILJ(str)));
        }
    }

    @Override // X.InterfaceC920850a4R
    public final void LIZLLL(InterfaceC922070a6P interfaceC922070a6P, String str) {
        if (Intrinsics.LJFF(str, this.LIZIZ)) {
            LJIILJJIL((MutableLiveData) this.LJIIJJI.getValue(), interfaceC922070a6P.LJII(str));
        }
    }

    public final void LJIILL(Context context, AbstractC939840aZ4 abstractC939840aZ4, C932100aMa c932100aMa) {
        User userLJIIJ;
        if (context == null || (userLJIIJ = LJIIJ()) == null) {
            return;
        }
        C932420aN6 c932420aN6 = new C932420aN6(context, (C938680aXC) this.LIZLLL.getValue(), userLJIIJ, this.LIZIZ, this.LIZ, (String) null, c932100aMa, 160);
        this.LIZJ = c932420aN6;
        c932420aN6.LJJLIIIJILLIZJL(abstractC939840aZ4);
    }
}
