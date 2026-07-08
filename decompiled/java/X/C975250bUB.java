package X;

import Y.AfS0S1301100_15;
import Y.AfS1S0110100_15;
import Y.AfS2S0201100_15;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTimeIncrementForBattleSetting;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0bUB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C975250bUB extends C0TW5 {
    public final LiveData<Boolean> LJIILIIL = Transformations.map(this.LJIIIIZZ, new AwS591S0100000_12(this, 51));
    public final MutableLiveData<Boolean> LJIILJJIL;
    public final MutableLiveData LJIILL;
    public final MutableLiveData<Boolean> LJIILLIIL;
    public final MutableLiveData LJIIZILJ;
    public final MutableLiveData<C974930bTf> LJIJ;
    public final MutableLiveData LJIJI;
    public boolean LJIJJ;

    public C975250bUB() {
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(bool);
        this.LJIILJJIL = mutableLiveData;
        this.LJIILL = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(bool);
        this.LJIILLIIL = mutableLiveData2;
        this.LJIIZILJ = mutableLiveData2;
        MutableLiveData<C974930bTf> mutableLiveData3 = new MutableLiveData<>();
        this.LJIJ = mutableLiveData3;
        this.LJIJI = mutableLiveData3;
    }

    @Override // X.C0TW5, X.InterfaceC969510bKv
    public final void onCleared() {
        super.onCleared();
        MutableLiveData<Boolean> mutableLiveData = this.LJIILJJIL;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.LJIILLIIL.setValue(bool);
        this.LJIJ.setValue(new C974930bTf(null, null, null, null));
        this.LJIJJ = false;
    }

    public final void LJIIJ(int i, long j, Long l, boolean z) {
        long channelId;
        this.LJIILJJIL.setValue(Boolean.TRUE);
        if (l != null) {
            channelId = l.longValue();
        } else {
            channelId = C915980Zwa.LJII().getChannelId();
        }
        if (channelId == 0) {
            C20441214yg.LJ("TeamMatchInviteeViewModel", "Accept api error channel id is empty");
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            C974540bT2.LJJIJLIJ(EnumC975260bUC.CHANNEL_ID_INVALID, z ? 1 : 0, j, i, EnumC919170a1j.MATCH_TYPE_2V2);
            return;
        }
        C974540bT2.LIZ.LJLLL(i, j, z);
        long value = LiveInteractBattleDurationSetting.INSTANCE.getValue();
        long value2 = value + LiveTimeIncrementForBattleSetting.INSTANCE.getValue();
        C480460Ism.LIZ().getClass();
        ((MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class)).acceptInvitePb(j, channelId, value, value2, i, this.LJIJJ ? 1 : 0).LJIILIIL(new C0UO0()).LJJLL(new AfS1S0110100_15(j, this, z, 0), new AfS1S0110100_15(j, this, z, 1));
    }

    public final void LJIIJJI(EnumC976390bW1 enumC976390bW1, long j, long j2, int i) {
        boolean z;
        int i2;
        int i3;
        this.LJIILLIIL.setValue(Boolean.TRUE);
        EnumC976390bW1.Companion.getClass();
        String strLIZ = C976430bW5.LIZ(enumC976390bW1);
        if (j2 == 0) {
            C20441214yg.LJ("TeamMatchInviteeViewModel", "Reject api error channel id is empty");
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            C974540bT2.LJLL(EnumC975270bUD.CHANNEL_ID_INVALID, i, j, strLIZ, EnumC919170a1j.MATCH_TYPE_2V2);
            return;
        }
        C974540bT2 c974540bT22 = C974540bT2.LIZ;
        if (enumC976390bW1 == EnumC976390bW1.HOSTS_LIST_CHANGED) {
            z = true;
        } else {
            z = false;
        }
        C974540bT2.LJLJLLL(i, j, strLIZ, z);
        EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
        if (enumC976390bW1 == EnumC976390bW1.DECLINE_BUTTON && this.LJIJJ) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestReject API. rejectReason=");
        sbLIZ.append(enumC976390bW1);
        sbLIZ.append(", doNotDisturb=");
        sbLIZ.append(this.LJIJJ);
        sbLIZ.append(", doNotDisturbForRequest=");
        sbLIZ.append(i2);
        C20441214yg.LIZIZ("TeamMatchInviteeViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C480460Ism.LIZ().getClass();
        MultiMatchApi multiMatchApi = (MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class);
        int i4 = C975280bUE.LIZ[enumC976390bW1.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new C1954807lC();
                }
                i3 = 0;
            } else {
                i3 = 1;
            }
        } else {
            i3 = 0;
        }
        multiMatchApi.reject(j2, j, i, i3, i2, 0L, null).LJIILIIL(new C0UO0()).LJJLL(new AfS0S1301100_15(i, j, strLIZ, enumC919170a1jXB0, this, enumC976390bW1, 0), new AfS2S0201100_15(i, j, this, enumC976390bW1, 0));
    }
}
