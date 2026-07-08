package X;

import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiLiveUserMediaEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.mask.PauseBizElementVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0acc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942040acc extends AbstractC939360aYI {
    public final ViewGroup LLILZ;
    public final ViewGroup LLILZIL;
    public final DataChannel LLILZLL;
    public final InterfaceC923120a86 LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public int LLJI;
    public final C054G LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;

    public final Map<String, C942410adD> LJJI() {
        return (Map) this.LLIZLLLIL.getValue();
    }

    public final void LJJ() {
        Iterator<Map.Entry<String, C942410adD>> it2 = LJJI().entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().LIZLLL(false);
        }
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void onDetach() {
        super.onDetach();
        try {
            IMessageManager iMessageManager = (IMessageManager) this.LLILZLL.gg0(C776250Uch.class);
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener((OnIMMessageListener) this.LLJILJILJ.getValue());
            }
            IMessageManager iMessageManager2 = (IMessageManager) this.LLJILLL.getValue();
            if (iMessageManager2 != null) {
                iMessageManager2.removeMessageListener((OnIMMessageListener) this.LLJILJILJ.getValue());
            }
            this.LLILZLL.zQ2(this);
            InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC302401Fe != null) {
                interfaceC302401Fe.LJJIIJ((C01YD) this.LLJILJIL.getValue());
            }
            C2296808zG.LIZJ(((C942440adG) this.LLJ.getValue()).LIZ, null);
            Iterator<Map.Entry<String, C942410adD>> it2 = LJJI().entrySet().iterator();
            while (it2.hasNext()) {
                C942410adD value = it2.next().getValue();
                value.LIZLLL(false);
                C2296808zG.LIZJ(value.LJII, null);
            }
            C2296808zG.LIZJ(this.LLJIJIL, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("removeMessageListener fail, ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("MultiGuestMicSeatEmojiPlugin", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void LJI() {
        LJJ();
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void LJIJ(InterfaceC940060aZQ interfaceC940060aZQ) {
        super.onDetach();
        if (!C950220apo.LJI() && !C950220apo.LJIJI()) {
            IMessageManager iMessageManager = (IMessageManager) this.LLJILLL.getValue();
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(C001A.STAGE_REACTION_MESSAGE.getIntType(), (OnIMMessageListener) this.LLJILJILJ.getValue());
            }
        } else {
            IMessageManager iMessageManager2 = (IMessageManager) this.LLILZLL.gg0(C776250Uch.class);
            if (iMessageManager2 != null) {
                iMessageManager2.addMessageListener(C001A.STAGE_REACTION_MESSAGE.getIntType(), (OnIMMessageListener) this.LLJILJILJ.getValue());
            }
        }
        DataChannel dataChannel = this.LLILZLL;
        dataChannel.CQ2(MultiGuestLayoutRenderV2.RoleChannel.class, this, new AwS594S0100000_15(this, 1052));
        dataChannel.CQ2(MultiLiveUserMediaEvent.class, this, new AwS594S0100000_15(this, 1053));
        dataChannel.CQ2(PauseBizElementVisibilityChannel.class, this, new AwS594S0100000_15(this, 1054));
        InterfaceC921620a5g interfaceC921620a5g = (InterfaceC921620a5g) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (interfaceC921620a5g != null) {
            interfaceC921620a5g.LJJIJIL((C01YD) this.LLJILJIL.getValue());
        }
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void LJIL(C942080acg c942080acg) {
        if (this.LLJI != C940770aaZ.LIZ().getDataSource().getPanelLayoutType()) {
            C20441214yg.LJIIIZ("MultiGuestMicSeatEmojiPlugin", "onLayoutPipelineEndSuccess, clearEmojisInLayoutContainer");
            LJJ();
        } else {
            C20441214yg.LJIIIZ("MultiGuestMicSeatEmojiPlugin", "onLayoutPipelineEndSuccess, checkPositionHasChangedAndClearEmojiView");
            Iterator<Map.Entry<String, C942410adD>> it2 = LJJI().entrySet().iterator();
            while (it2.hasNext()) {
                C942410adD value = it2.next().getValue();
                C054G c054g = value.LJII;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c054g, C2107308Nj.LIZ, null, new C942050acd(value, null), 2);
            }
        }
        this.LLJI = C940770aaZ.LIZ().getDataSource().getPanelLayoutType();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C942040acc(ViewGroup viewGroup, ViewGroup viewGroup2, DataChannel dataChannel) {
        InterfaceC923120a86 interfaceC923120a86LIZ = C940770aaZ.LIZ();
        super(interfaceC923120a86LIZ);
        this.LLILZ = viewGroup;
        this.LLILZIL = viewGroup2;
        this.LLILZLL = dataChannel;
        this.LLIZ = interfaceC923120a86LIZ;
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(425));
        this.LLJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(426));
        this.LLJI = 1;
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJIJIL = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
        this.LLJILJIL = C452501pT.LIZIZ(new C5182020e(this, 563));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1061));
        this.LLJILLL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(427));
    }
}
