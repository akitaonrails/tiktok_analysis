package X;

import android.content.Context;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestAllPanelFloatNickNameMinWidthSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS664S0100000_15;

/* JADX INFO: renamed from: X.0aaK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940620aaK extends AbstractC939840aZ4 {
    public final DataChannel LLIZLLLIL;
    public LiveIconView LLJ;
    public final C01GW LLJI;
    public InterfaceC940910aan LLJIJIL;
    public InterfaceC940910aan LLJILJIL;

    @Override // X.AbstractC939840aZ4
    public int getElementWidth() {
        return 0;
    }

    public final InterfaceC946970akZ getLetsDanceService() {
        return (InterfaceC946970akZ) this.LLJI.getValue();
    }

    @Override // X.AbstractC939840aZ4
    public C940610aaJ getPriority() {
        return new C940610aaJ(0, C439101nJ.LIZ(MultiGuestAllPanelFloatNickNameMinWidthSetting.INSTANCE.value()), 1);
    }

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutId() {
        return Integer.valueOf(R.layout.htj);
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C947590alZ c947590alZLJIILLIIL;
        C947420alI c947420alILJII;
        super.onAttachedToWindow();
        this.LLJ = (LiveIconView) findViewById(R.id.lsw);
        C1143680frq.LIZLLL(this.LLJ, "tiktok_live_interaction_normal_4", "lets_dance_ready_icon.png");
        InterfaceC940910aan interfaceC940910aan = this.LLJIJIL;
        if (interfaceC940910aan != null) {
            interfaceC940910aan.unsubscribe();
        }
        InterfaceC940910aan interfaceC940910aan2 = this.LLJILJIL;
        if (interfaceC940910aan2 != null) {
            interfaceC940910aan2.unsubscribe();
        }
        String linkMicId = getWindow().getLinkMicId();
        if (linkMicId != null) {
            InterfaceC946970akZ letsDanceService = getLetsDanceService();
            EnumC942260acy enumC942260acy = null;
            this.LLJIJIL = letsDanceService != null ? letsDanceService.LJIIJ(linkMicId, new AwS664S0100000_15(this, 19)) : null;
            InterfaceC946970akZ letsDanceService2 = getLetsDanceService();
            this.LLJILJIL = letsDanceService2 != null ? letsDanceService2.LIZ(new C940630aaL(this, linkMicId)) : null;
            InterfaceC946970akZ letsDanceService3 = getLetsDanceService();
            EnumC947440alK enumC947440alK = (letsDanceService3 == null || (c947420alILJII = letsDanceService3.LJII()) == null) ? null : c947420alILJII.LIZJ;
            InterfaceC946970akZ letsDanceService4 = getLetsDanceService();
            if (letsDanceService4 != null && (c947590alZLJIILLIIL = letsDanceService4.LJIILLIIL(linkMicId)) != null) {
                enumC942260acy = c947590alZLJIILLIIL.LIZJ;
            }
            LJIIIZ(enumC947440alK, enumC942260acy);
        }
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC940910aan interfaceC940910aan = this.LLJIJIL;
        if (interfaceC940910aan != null) {
            interfaceC940910aan.unsubscribe();
        }
        InterfaceC940910aan interfaceC940910aan2 = this.LLJILJIL;
        if (interfaceC940910aan2 != null) {
            interfaceC940910aan2.unsubscribe();
        }
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.LETS_DANCE_PLAYER_STATUS;
    }

    public final void LJIIIZ(EnumC947440alK enumC947440alK, EnumC942260acy enumC942260acy) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateUI, gamePhase = ");
        sbLIZ.append(enumC947440alK);
        sbLIZ.append(" playerStatus = ");
        sbLIZ.append(enumC942260acy);
        C20441214yg.LIZIZ("LetsDancePlayerStatusViewElement", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC947440alK == EnumC947440alK.PREPARING && enumC942260acy == EnumC942260acy.READY) {
            LiveIconView liveIconView = this.LLJ;
            if (liveIconView != null) {
                C12ES.LJIILL(0, liveIconView);
                return;
            }
            return;
        }
        LiveIconView liveIconView2 = this.LLJ;
        if (liveIconView2 == null) {
            return;
        }
        C439101nJ.LJI(liveIconView2);
    }

    public C940620aaK(Context context, C957020b0m c957020b0m, DataChannel dataChannel) {
        super(context, dataChannel, c957020b0m, null);
        this.LLIZLLLIL = dataChannel;
        this.LLJI = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(466));
    }
}
