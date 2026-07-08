package X;

import com.bytedance.android.livesdk.api.BroadcastRoomApiKt;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.AutoShareToBulletinBoardSheet;
import com.bytedance.android.livesdk.dataChannel.LiveAutoShareBBSwitchEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.AnchorSwitchUpdateRequest;
import tikcast.api.anchor.AnchorSwitchUpdateResponse;
import webcast.data.AutoShareLiveCardToBulletinBoard;

/* JADX INFO: renamed from: X.0Tgp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.setting.AutoShareToBulletinBoardSheet$onViewCreated$1$1", f = "AutoShareToBulletinBoardSheet.kt", l = {88, 109}, m = "invokeSuspend")
public final class C753330Tgp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ AutoShareToBulletinBoardSheet LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C753330Tgp(AutoShareToBulletinBoardSheet autoShareToBulletinBoardSheet, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = autoShareToBulletinBoardSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C753330Tgp(this.LLILLL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        AnchorSwitchUpdateResponse anchorSwitchUpdateResponse;
        String str;
        Long lLJFF;
        String str2;
        C1C7U.LIZ("AutoShareToBulletinBoardSheet@4f2b.onViewCreated$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z2 = false;
        int i2 = 1;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AutoShareToBulletinBoardSheet@4f2b.onViewCreated$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
            BroadcastRoomApiKt broadcastRoomApiKtLIZIZ = C01QD.LIZ().LIZIZ();
            AnchorSwitchUpdateRequest anchorSwitchUpdateRequest = new AnchorSwitchUpdateRequest();
            boolean z3 = this.LLILLJJLI;
            anchorSwitchUpdateRequest.switchType = 1;
            if (!z3) {
                z = true;
            } else {
                z = false;
            }
            anchorSwitchUpdateRequest.switchValue = z;
            this.LL = 1;
            obj = broadcastRoomApiKtLIZIZ.updateAutoshareToBBStatus(anchorSwitchUpdateRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AutoShareToBulletinBoardSheet@4f2b.onViewCreated$1$1");
                return objLJFF;
            }
        }
        C470590Icr c470590Icr = (C470590Icr) obj;
        if (c470590Icr != null) {
            anchorSwitchUpdateResponse = (AnchorSwitchUpdateResponse) c470590Icr.data;
        } else {
            anchorSwitchUpdateResponse = null;
        }
        if (anchorSwitchUpdateResponse != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("api success: ");
            if (!this.LLILLJJLI) {
                z2 = true;
            }
            sbLIZ.append(z2);
            C20441214yg.LIZIZ("shareBB", C2188811AlT.LIZIZ(sbLIZ));
            DataChannel dataChannelLJ = C475510Ikn.LJ(this.LLILLL);
            if (dataChannelLJ != null) {
                dataChannelLJ.LC0(LiveAutoShareBBSwitchEvent.class, Boolean.valueOf(!this.LLILLJJLI));
            }
            AutoShareLiveCardToBulletinBoard autoShareLiveCardToBulletinBoard = C0UF5.LJFF;
            if (autoShareLiveCardToBulletinBoard != null) {
                if (this.LLILLJJLI) {
                    i2 = 2;
                }
                autoShareLiveCardToBulletinBoard.switchStatus = i2;
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_bbautoshare_switch_click");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this.LLILLL));
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this.LLILLL);
        if (dataChannelLJ2 == null || (str = (String) dataChannelLJ2.gg0(C0UNN.class)) == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "enter_from");
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(C475510Ikn.LJ(this.LLILLL));
        if (roomLJJLIIIIJ != null) {
            lLJFF = C2286608xc.LJFF(roomLJJLIIIIJ.getId());
        } else {
            lLJFF = null;
        }
        c474500IjALIZ.LJJII(lLJFF, "room_id");
        c474500IjALIZ.LJJII("live_room", "switch_type");
        if (!this.LLILLJJLI) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        c474500IjALIZ.LJJII(str2, "action_type");
        c474500IjALIZ.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C753320Tgo c753320Tgo = new C753320Tgo(this.LLILLL, null, this.LLILLJJLI);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c753320Tgo) == objLJFF) {
            C1C7U.LIZIZ("AutoShareToBulletinBoardSheet@4f2b.onViewCreated$1$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AutoShareToBulletinBoardSheet@4f2b.onViewCreated$1$1");
        return unit2;
    }
}
