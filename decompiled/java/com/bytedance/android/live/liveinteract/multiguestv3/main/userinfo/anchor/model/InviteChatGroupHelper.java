package com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.model;

import X.C09JN;
import X.C0UO0;
import X.C11NJ;
import X.C480460Ism;
import X.C516201zk;
import X.C948450amx;
import X.InterfaceC948500an2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multilive.model.ChatGroupInviteParams;
import com.bytedance.android.live.liveinteract.multilive.model.ChatGroupInviteResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "INVITE_CHAT_GROUP_HELPER")
public final class InviteChatGroupHelper {
    public final DataChannel LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public boolean LJFF;
    public boolean LJI;
    public int LJIIIIZZ;
    public final C11NJ LIZLLL = new C11NJ();
    public final HashSet<Long> LJ = new HashSet<>();
    public boolean LJII = true;

    public InviteChatGroupHelper(long j, DataChannel dataChannel, String str) {
        this.LIZ = dataChannel;
        this.LIZIZ = j;
        this.LIZJ = str;
        C948450amx.LIZIZ.LJFF(this, "INVITE_CHAT_GROUP_HELPER");
    }

    public final void LIZ(final long j, final Function1 function1, final boolean z) {
        ChatGroupInviteParams chatGroupInviteParams = new ChatGroupInviteParams();
        chatGroupInviteParams.roomId = this.LIZIZ;
        try {
            chatGroupInviteParams.channelId = CastLongProtector.parseLong(this.LIZJ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        chatGroupInviteParams.chatGroupId = j;
        chatGroupInviteParams.scene = z ? 1 : 0;
        chatGroupInviteParams.source = 1;
        C480460Ism.LIZ().getClass();
        this.LIZLLL.LIZ(((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).inviteChatGroup(chatGroupInviteParams).LJFF(new C0UO0()).LJJIIZ(new C09JN() { // from class: X.01HH
            @Override // X.C09JN
            public final void accept(Object obj) {
                Map map;
                InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
                C1C7U.LIZ("InviteChatGroupHelper@70d7.inviteOrCancelChatGroup$disposable$1");
                if (((ChatGroupInviteResponse.ResponseData) ((BaseResponse) obj).data).result == 0) {
                    if (z) {
                        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                        if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null) {
                            interfaceC937900aVwLLIIJLIL.LLIFFJFJJ(C925150aBN.LIZLLL());
                        }
                        DataChannel dataChannel = this.LIZ;
                        if (dataChannel == null || (map = (Map) dataChannel.gg0(C749460Taa.class)) == null) {
                            map = new HashMap();
                        }
                        map.put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
                        DataChannel dataChannel2 = this.LIZ;
                        if (dataChannel2 != null) {
                            dataChannel2.SX0(C749460Taa.class, map);
                        }
                    }
                    Function1<Boolean, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(Boolean.TRUE);
                    }
                }
                C1C7U.LIZIZ("InviteChatGroupHelper@70d7.inviteOrCancelChatGroup$disposable$1");
            }
        }, new C516201zk(function1, 361)));
    }
}
