package X;

import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinReplyBizContent;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS123S0101000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: renamed from: X.0b3B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958510b3B extends AbstractC959270b4P implements InterfaceC959260b4O {
    @Override // X.InterfaceC959260b4O
    public final void LJIIIIZZ(C954640aww c954640aww, AwS559S0100000_15 awS559S0100000_15, AwS559S0100000_15 awS559S0100000_152) {
    }

    @Override // X.InterfaceC960070b5h
    public final Set LJIIIZ() {
        return C13LQ.LJLIIL(new EnumC958900b3o[]{EnumC958900b3o.WAITED, EnumC958900b3o.PREPARED});
    }

    public C958510b3B(InterfaceC959730b59 interfaceC959730b59) {
        super(interfaceC959730b59);
    }

    @Override // X.InterfaceC959260b4O
    public final void LJ(C954640aww c954640aww, final AwS559S0100000_15 awS559S0100000_15, final AwS559S0100000_15 awS559S0100000_152) {
        int i;
        String str;
        JoinGroupMessageExtra joinGroupMessageExtra;
        if (c954640aww.LIZLLL <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("quickPairReply failed, channelId is invalid, inner channelId = ");
            sbLIZ.append(c954640aww.LIZLLL);
            C20441214yg.LJ("QuickPairReceivedCoordinator", C2188811AlT.LIZIZ(sbLIZ));
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
        int i2 = c954640aww.LIZ;
        long j3 = c954640aww.LIZLLL;
        long j4 = c954640aww.LJ;
        String str2 = c954640aww.LJFF;
        ArrayList arrayList = new ArrayList();
        arrayList.add("reply_quick_pair");
        C945210ahj c945210ahj = new C945210ahj(i2, j, j2, j3, j4, str2, 1, (Map) null, mHJoinReplyBizContent, arrayList, 256);
        InterfaceC950010apT<C920610a43> interfaceC950010apT = new InterfaceC950010apT<C920610a43>() { // from class: X.0b3D
            @Override // X.InterfaceC950010apT
            public final void LIZ(C920640a46 c920640a46) {
                this.LIZ.LIZ.c0().LJIILLIIL = j2;
                Function0<Unit> function0 = awS559S0100000_15;
                if (function0 != null) {
                    function0.invoke();
                }
            }

            @Override // X.InterfaceC950010apT
            public final void LIZIZ(C952350atF c952350atF, Throwable th) {
                String message;
                Function0<Unit> function0 = awS559S0100000_152;
                if (function0 != null) {
                    function0.invoke();
                }
                if (th != null) {
                    C501540Jlg.LJ(C497740JfY.LJII(), th);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("quickPairReply failed, error = ");
                sbLIZ2.append(c952350atF);
                sbLIZ2.append(", throwable.message=");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ2.append(message);
                C20441214yg.LJ("QuickPairReceivedCoordinator", C2188811AlT.LIZIZ(sbLIZ2));
            }
        };
        InterfaceC954910axN.LIZ.getClass();
        C958790b3d.LIZ("QuickPairReceivedCoordinator", "quick_cohost").LJIILLIIL("quickPairReply", new AwS123S0101000_15(i2, c954640aww, 3));
        if (i2 == 1) {
            C915980Zwa.LJII().LJLIL(c945210ahj, interfaceC950010apT);
        } else {
            C915980Zwa.LJII().LLILZIL(c945210ahj, interfaceC950010apT, C915260ZvQ.LIZ);
        }
    }
}
