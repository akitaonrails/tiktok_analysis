package com.bytedance.android.live.liveinteract.multiguestv3.main.ability.component.fanticket.sei;

import X.AbstractC922600a7G;
import X.C01GW;
import X.C01ZE;
import X.C2188811AlT;
import X.C305601Gk;
import X.C320901Mh;
import X.C452501pT;
import X.C941810acF;
import X.C941840acI;
import X.C948450amx;
import X.InterfaceC305701Gl;
import X.InterfaceC938070aWD;
import X.InterfaceC941880acM;
import X.InterfaceC948500an2;
import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "MULTI_GUEST_TICKET_SEI_WRITER")
public final class TicketWriterHelper implements InterfaceC938070aWD {
    public final DataChannel LIZ;
    public final C01GW LIZIZ;
    public InterfaceC305701Gl LIZJ;
    public FanTicketRoomNoticeContent LIZLLL;
    public final C01GW LJ;

    public TicketWriterHelper() {
        this(null);
    }

    public final void LIZJ() {
        C320901Mh.LIZ("TicketWriterHelper", "close");
        this.LIZJ = null;
        AbstractC922600a7G abstractC922600a7G = (AbstractC922600a7G) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (abstractC922600a7G != null) {
            abstractC922600a7G.LJJIIJ((C941810acF) this.LJ.getValue());
        }
        ((InterfaceC941880acM) this.LIZIZ.getValue()).clear();
        this.LIZLLL = null;
    }

    @Override // X.InterfaceC305301Gh
    public final void onDestroy() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroy curWriteScene:");
        InterfaceC305701Gl interfaceC305701Gl = this.LIZJ;
        sbLIZ.append(interfaceC305701Gl != null ? interfaceC305701Gl.getName() : null);
        C320901Mh.LIZ("TicketWriterHelper", C2188811AlT.LIZIZ(sbLIZ));
        LIZJ();
        if (C01ZE.LIZ()) {
            return;
        }
        C948450amx.LIZIZ.LJI("MULTI_GUEST_TICKET_SEI_WRITER");
    }

    public TicketWriterHelper(DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LIZIZ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 166));
        this.LJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 165));
        if (!C01ZE.LIZ()) {
            C948450amx.LIZIZ.LJFF(this, null);
        }
    }

    @Override // X.InterfaceC305301Gh
    public final void LIZ(C305601Gk c305601Gk) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStartScene scene:");
        sbLIZ.append(c305601Gk.LIZ);
        C320901Mh.LIZ("TicketWriterHelper", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZJ = c305601Gk;
        AbstractC922600a7G abstractC922600a7G = (AbstractC922600a7G) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (abstractC922600a7G != null) {
            abstractC922600a7G.LJJIJIL((C941810acF) this.LJ.getValue());
        }
        FanTicketRoomNoticeContent fanTicketRoomNoticeContent = this.LIZLLL;
        if (fanTicketRoomNoticeContent != null) {
            LIZLLL(fanTicketRoomNoticeContent);
        }
    }

    @Override // X.InterfaceC938070aWD
    public final void LIZIZ(FanTicketRoomNoticeContent fanTicketRoomNoticeContent) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receiverFanTicket fanTicketRoomNoticeContent:");
        sbLIZ.append(fanTicketRoomNoticeContent);
        C320901Mh.LIZ("TicketWriterHelper", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZLLL = fanTicketRoomNoticeContent;
        if (this.LIZJ != null) {
            LIZLLL(fanTicketRoomNoticeContent);
        }
    }

    public final void LIZLLL(FanTicketRoomNoticeContent fanTicketRoomNoticeContent) {
        InterfaceC305701Gl interfaceC305701Gl;
        this.LIZLLL = fanTicketRoomNoticeContent;
        if (fanTicketRoomNoticeContent != null && (interfaceC305701Gl = this.LIZJ) != null) {
            String name = interfaceC305701Gl.getName();
            int i = fanTicketRoomNoticeContent.scoreType;
            List<C941840acI> listLIZ = interfaceC305701Gl.LIZ(fanTicketRoomNoticeContent);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateFanTickets userFanTicket:");
            sbLIZ.append(listLIZ);
            C320901Mh.LIZ("TicketWriterHelper", C2188811AlT.LIZIZ(sbLIZ));
            if (listLIZ != null && !listLIZ.isEmpty()) {
                ((InterfaceC941880acM) this.LIZIZ.getValue()).LIZ(i, name, listLIZ);
            }
        }
    }

    @Override // X.InterfaceC305301Gh
    public final void LJIIJJI(String str) {
        String name;
        InterfaceC305701Gl interfaceC305701Gl = this.LIZJ;
        if (interfaceC305701Gl != null) {
            name = interfaceC305701Gl.getName();
        } else {
            name = null;
        }
        if (name != null && !Intrinsics.LJFF(name, str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("close return as scene ");
            sbLIZ.append(str);
            sbLIZ.append(" not match curWriteScene:");
            sbLIZ.append(name);
            C320901Mh.LIZ("TicketWriterHelper", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        LIZJ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("close scene:");
        sbLIZ2.append(str);
        sbLIZ2.append(" curWriteScene:");
        sbLIZ2.append(name);
        C320901Mh.LIZ("TicketWriterHelper", C2188811AlT.LIZIZ(sbLIZ2));
    }
}
