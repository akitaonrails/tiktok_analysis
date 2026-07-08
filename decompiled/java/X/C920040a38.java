package X;

import Y.AfS184S0100000_15;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageParams;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0a38, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920040a38 extends C919710a2b {
    public boolean LJIJJLI;

    @Override // X.C919710a2b, X.AbstractC919790a2j
    public final void LJJII(int i, InterfaceC937900aVw interfaceC937900aVw) {
    }

    @Override // X.AbstractC919790a2j
    public final boolean LJIIIZ() {
        return !LJIIIIZZ().isEmpty();
    }

    @Override // X.AbstractC919790a2j
    public final String LJJIJIL() {
        PosIdentity next;
        Iterator<PosIdentity> it2 = LJIIIIZZ().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.type == 1) {
                break;
            }
        }
        PosIdentity posIdentity = next;
        if (posIdentity != null) {
            return posIdentity.value;
        }
        return null;
    }

    @Override // X.AbstractC919790a2j
    public final Integer LJJIJL() {
        PosIdentity next;
        String str;
        InterfaceC954180awC interfaceC954180awCLLJLL;
        OnLineMicInfo onLineMicInfoLLII;
        MicPositionInfo micPositionInfo;
        Iterator<PosIdentity> it2 = LJIIIIZZ().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.type == 2) {
                break;
            }
        }
        PosIdentity posIdentity = next;
        if (posIdentity == null || (str = posIdentity.value) == null || (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) == null || (onLineMicInfoLLII = interfaceC954180awCLLJLL.LLII(str)) == null || (micPositionInfo = onLineMicInfoLLII.micPositionData) == null) {
            return null;
        }
        return Integer.valueOf(micPositionInfo.position);
    }

    public C920040a38(DataChannel dataChannel) {
        super(dataChannel);
    }

    @Override // X.C919710a2b, X.AbstractC919790a2j
    public final void LJIILL(int i) {
        if (C01HE.LJ() == C01FV.ANCHOR) {
            return;
        }
        if (i >= 3) {
            if (this.LJIJJLI) {
                return;
            }
            EnlargeScreenManageParams enlargeScreenManageParams = new EnlargeScreenManageParams();
            C914970Zux.LIZ(enlargeScreenManageParams);
            enlargeScreenManageParams.scene = 6;
            C480460Ism.LIZ().getClass();
            new C11NJ().LIZ(((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).zoom(enlargeScreenManageParams).LJIILIIL(new C0UO0()).LJJLL(new AfS184S0100000_15(this, 183), new C09JN() { // from class: X.0a3E
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("ZoomGuestModelV2@7431.onLinkMicStateChange$2");
                    C1C7U.LIZIZ("ZoomGuestModelV2@7431.onLinkMicStateChange$2");
                }
            }));
            return;
        }
        this.LJIJJLI = false;
    }
}
