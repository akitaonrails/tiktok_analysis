package X;

import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinReplyBizContent;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS559S0100000_15;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: renamed from: X.0b3C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958520b3C extends AbstractC959270b4P implements InterfaceC959260b4O {
    @Override // X.InterfaceC959260b4O
    public final void LJ(C954640aww c954640aww, AwS559S0100000_15 awS559S0100000_15, AwS559S0100000_15 awS559S0100000_152) {
    }

    @Override // X.InterfaceC960070b5h
    public final Set LJIIIZ() {
        return C13LQ.LJLIIL(new EnumC958900b3o[]{EnumC958900b3o.WAITED, EnumC958900b3o.PREPARED});
    }

    public C958520b3C(InterfaceC959730b59 interfaceC959730b59) {
        super(interfaceC959730b59);
    }

    @Override // X.InterfaceC959260b4O
    public final void LJIIIIZZ(C954640aww c954640aww, final AwS559S0100000_15 awS559S0100000_15, final AwS559S0100000_15 awS559S0100000_152) {
        int i;
        String str;
        JoinGroupMessageExtra joinGroupMessageExtra;
        if (c954640aww.LIZLLL <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("channelId is invalid, inner channelId = ");
            sbLIZ.append(c954640aww.LIZLLL);
            C20441214yg.LJ("TeamPairReceivedCoordinator", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("invalid channeldId=");
            sbLIZ2.append(c954640aww.LIZLLL);
            C766270U4b.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
            awS559S0100000_152.invoke();
            return;
        }
        long j = c954640aww.LIZJ;
        final long j2 = c954640aww.LIZIZ;
        MHJoinReplyBizContent mHJoinReplyBizContent = new MHJoinReplyBizContent(0, "", 0);
        MHJoinBizContent mHJoinBizContent = c954640aww.LJI;
        if (mHJoinBizContent != null && (joinGroupMessageExtra = mHJoinBizContent.bizExtra) != null) {
            i = (int) joinGroupMessageExtra.sourceType;
        } else {
            i = 0;
        }
        mHJoinReplyBizContent.sourceType = i;
        if (mHJoinBizContent == null || (str = mHJoinBizContent.LIZ) == null) {
            str = "";
        }
        mHJoinReplyBizContent.algoRequestId = str;
        long j3 = c954640aww.LIZLLL;
        ArrayList arrayList = new ArrayList();
        arrayList.add("reply_team_pair");
        C945210ahj c945210ahj = new C945210ahj(1, j, j2, j3, 0L, (String) null, 1, (Map) null, mHJoinReplyBizContent, arrayList, 304);
        C20441214yg.LIZIZ("TeamPairReceivedCoordinator", "Get invitation. Send agreement back");
        C915980Zwa.LJII().LJLIL(c945210ahj, new InterfaceC950010apT<C920610a43>() { // from class: X.0b3E
            @Override // X.InterfaceC950010apT
            public final void LIZ(C920640a46 c920640a46) {
                this.LIZ.LIZ.c0().LJIILLIIL = j2;
                awS559S0100000_15.invoke();
            }

            @Override // X.InterfaceC950010apT
            public final void LIZIZ(C952350atF c952350atF, Throwable th) {
                String message;
                awS559S0100000_152.invoke();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("error = ");
                sbLIZ3.append(c952350atF);
                sbLIZ3.append(", throwable.message=");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ3.append(message);
                C20441214yg.LJ("TeamPairReceivedCoordinator", C2188811AlT.LIZIZ(sbLIZ3));
            }
        });
    }
}
