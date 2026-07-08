package X;

import Y.ARunnableS34S0110000_15;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInvite4004049FixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInviteMockSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0bXz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C977610bXz extends AbstractC742600TBa<InterfaceC977860bYO> {
    public final MutableLiveData<Boolean> LJIIIZ;
    public final MutableLiveData LJIIJ;
    public final MutableLiveData<Boolean> LJIIJJI;
    public final MutableLiveData LJIIL;
    public final MutableLiveData<Map<Long, GiftGalleryBadgeInfo>> LJIILIIL;
    public long LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;

    public C977610bXz() {
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(bool);
        this.LJIIIZ = mutableLiveData;
        this.LJIIJ = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(bool);
        this.LJIIJJI = mutableLiveData2;
        this.LJIIL = mutableLiveData2;
        this.LJIILIIL = new MutableLiveData<>();
    }

    @Override // X.AbstractC742600TBa, X.InterfaceC969510bKv
    public final void onCleared() {
        super.onCleared();
        MutableLiveData<Boolean> mutableLiveData = this.LJIIIZ;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.LJIIJJI.setValue(bool);
        this.LJIILL = false;
        this.LJIILLIIL = false;
        this.LJIILJJIL = 0L;
    }

    public final void LIZJ(EnumC976510bWD enumC976510bWD) {
        this.LJIIJJI.setValue(Boolean.TRUE);
        InterfaceC977860bYO interfaceC977860bYO = (InterfaceC977860bYO) this.LIZIZ;
        if (interfaceC977860bYO != null) {
            interfaceC977860bYO.LIZJ(this.LJIILJJIL, enumC976510bWD);
        }
    }

    public final void LIZLLL(boolean z) {
        if (LiveMatchInvite4004049FixSetting.INSTANCE.isEnable()) {
            if (this.LJIILL) {
                C20441214yg.LJIIL("IndividualMatchInviterViewModel", "sendInvite blocked: invite already in flight");
                C974540bT2.LIZ.LL("invite_in_flight");
                C974540bT2.LJJLIIIJILLIZJL(EnumC977680bY6.INVITE_IN_FLIGHT, 0, z, EnumC919170a1j.MATCH_TYPE_INDIVIDUAL, 6);
                return;
            } else if (this.LJIILJJIL != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sendInvite blocked: active battleId=");
                sbLIZ.append(this.LJIILJJIL);
                C20441214yg.LJIIL("IndividualMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
                C974540bT2.LIZ.LL("active_battle_id");
                C974540bT2.LJJLIIIJILLIZJL(EnumC977680bY6.ACTIVE_BATTLE_ID, 0, z, EnumC919170a1j.MATCH_TYPE_INDIVIDUAL, 6);
                return;
            }
        }
        this.LJIILL = true;
        this.LJIIJJI.setValue(Boolean.TRUE);
        this.LJIIIZ.setValue(Boolean.FALSE);
        this.LJ.setValue(new HashMap());
        List<C954460awe> listLJJLI = C915980Zwa.LJII().LJJLI();
        this.LIZJ.setValue(listLJJLI);
        InterfaceC977860bYO interfaceC977860bYO = (InterfaceC977860bYO) this.LIZIZ;
        if (interfaceC977860bYO != null) {
            interfaceC977860bYO.LJIILJJIL(listLJJLI, z);
        }
        if (LiveMatchInviteMockSetting.INSTANCE.isDuplicateInviteEnabled() && !this.LJIILLIIL) {
            this.LJIILLIIL = true;
            C20441214yg.LJIIL("IndividualMatchInviterViewModel", "MOCK: scheduling duplicate sendInvite to test VM-level guard");
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS34S0110000_15(this, z, 0));
        }
    }
}
