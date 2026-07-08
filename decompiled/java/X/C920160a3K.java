package X;

import Y.AfS151S0200000_15;
import Y.AfS184S0100000_15;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.api.ILayoutServerApi;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageParams;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS55S1300000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS80S1300000_15;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.PositionConfig;
import webcast.api.linkmic_multi_guest.LayoutUpdateParams;
import webcast.api.linkmic_multi_guest.SwitchSpotParams;

/* JADX INFO: renamed from: X.0a3K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920160a3K extends AbstractC920180a3M {
    public final C916520ZxS LIZIZ = new C916520ZxS();

    @Override // X.InterfaceC920200a3O
    public final void LJ(InterfaceC920110a3F interfaceC920110a3F) {
        EnlargeScreenManageParams enlargeScreenManageParams = new EnlargeScreenManageParams();
        C914970Zux.LIZ(enlargeScreenManageParams);
        enlargeScreenManageParams.scene = 9;
        C480460Ism.LIZ().getClass();
        this.LIZ.LIZ(((ILayoutServerApi) C480460Ism.LIZLLL(ILayoutServerApi.class)).zoom(enlargeScreenManageParams).LJIILIIL(new C0UO0()).LJJLL(new AfS184S0100000_15(interfaceC920110a3F, 131), new AfS151S0200000_15(this, interfaceC920110a3F, 36)));
    }

    @Override // X.InterfaceC920200a3O
    public final void LIZJ(PosIdentity posIdentity, PosIdentity posIdentity2, AwS559S0100000_15 awS559S0100000_15, AwS594S0100000_15 awS594S0100000_15) {
        long id;
        SwitchSpotParams switchSpotParams = new SwitchSpotParams();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        if (roomLJJLI != null) {
            id = roomLJJLI.getId();
        } else {
            id = 0;
        }
        switchSpotParams.roomId = id;
        switchSpotParams.channelId = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
        switchSpotParams.fromPos = posIdentity;
        switchSpotParams.toPos = posIdentity2;
        LJIILIIL(switchSpotParams, awS559S0100000_15, awS594S0100000_15);
    }

    @Override // X.InterfaceC920200a3O
    public final void LJFF(int i, int i2, Function1<? super LayoutState, Unit> function1, Function1<? super LinkCoreError, Unit> function12) {
        LayoutUpdateParams layoutUpdateParams = new LayoutUpdateParams();
        AbstractC920180a3M.LJIIIZ(layoutUpdateParams);
        PositionConfig positionConfig = new PositionConfig();
        positionConfig.maxPosition = i2;
        layoutUpdateParams.posConfig = positionConfig;
        layoutUpdateParams.layoutStyle = i;
        LJIIL(layoutUpdateParams, null, function1, function12);
    }

    @Override // X.InterfaceC920200a3O
    public final void LJII(int i, int i2, Function0<Unit> function0, Function1<? super LinkCoreError, Unit> function1) {
        LayoutUpdateParams layoutUpdateParams = new LayoutUpdateParams();
        AbstractC920180a3M.LJIIIZ(layoutUpdateParams);
        PositionConfig positionConfig = new PositionConfig();
        positionConfig.maxPosition = i2;
        layoutUpdateParams.posConfig = positionConfig;
        layoutUpdateParams.layoutStyle = i;
        LJIIL(layoutUpdateParams, function0, null, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC920200a3O
    public final void LJI(String str, boolean z, boolean z2, InterfaceC920110a3F interfaceC920110a3F, C334801Rq c334801Rq) {
        PosIdentity posIdentityLJIJ = C940770aaZ.LIZ().getDataSource().LJIJ(str);
        if (posIdentityLJIJ == null) {
            return;
        }
        EnlargeScreenManageParams enlargeScreenManageParams = new EnlargeScreenManageParams();
        C914970Zux.LIZ(enlargeScreenManageParams);
        enlargeScreenManageParams.operatedPosition = posIdentityLJIJ;
        enlargeScreenManageParams.linkmicId = str;
        enlargeScreenManageParams.guestUserId = C01HE.LJI(str);
        enlargeScreenManageParams.mgTraceInfo = C01IF.LIZ(c334801Rq);
        C920080a3C c920080a3CLJIIJ = AbstractC920180a3M.LJIIJ(interfaceC920110a3F, enlargeScreenManageParams);
        if (C500260Jjc.LJJIFFI(Boolean.valueOf(C940770aaZ.LIZ().getDataSource().LJIJJLI(str)))) {
            List<PosIdentity> listLJIIL = C940770aaZ.LIZ().getDataSource().LJIIL();
            if (listLJIIL.size() > 1) {
                if (interfaceC920110a3F != null) {
                    interfaceC920110a3F.LIZIZ(listLJIIL, new AwS55S1300000_15(enlargeScreenManageParams, this, str, c920080a3CLJIIJ, 3));
                    return;
                }
                return;
            } else {
                if (listLJIIL.size() == 1 && z2) {
                    enlargeScreenManageParams.replacedPos = C1697810uHb.LJIILJJIL(ListProtector.get(listLJIIL, 0));
                }
                enlargeScreenManageParams.scene = 7;
                LJIILJJIL(str, enlargeScreenManageParams, c920080a3CLJIIJ);
                return;
            }
        }
        C916520ZxS c916520ZxS = this.LIZIZ;
        AwS80S1300000_15 awS80S1300000_15 = new AwS80S1300000_15(enlargeScreenManageParams, this, str, c920080a3CLJIIJ, 4);
        c916520ZxS.getClass();
        C916520ZxS.LIZ(awS80S1300000_15);
    }
}
