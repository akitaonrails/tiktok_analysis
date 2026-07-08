package X;

import com.bytedance.android.livesdk.impl.revenue.playcondition.TreasureBoxFinishedOneCondition;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.redenvelope.RedEnvelopMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* JADX INFO: renamed from: X.16HP, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HP implements OnMessageListener {
    public final int $t;
    public Object l0;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        switch (this.$t) {
            case 0:
                onMessage$0(this, iMessage);
                break;
            case 1:
                onMessage$1(this, iMessage);
                break;
        }
    }

    public C16HP(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onMessage$0(C16HP c16hp, IMessage iMessage) {
        if ((iMessage instanceof RedEnvelopMessage) && ((RedEnvelopMessage) iMessage).display == 2) {
            ((TreasureBoxFinishedOneCondition) c16hp.l0).LJIIIZ("onMsg");
            InterfaceC946300ajU interfaceC946300ajU = ((TreasureBoxFinishedOneCondition) c16hp.l0).LJ;
            if (interfaceC946300ajU != null) {
                interfaceC946300ajU.LIZ(true, false);
            }
        }
    }

    public static final void onMessage$1(C16HP c16hp, IMessage iMessage) {
        C159M c159m;
        C159M c159m2;
        if (iMessage == null) {
            return;
        }
        C15FV c15fv = (C15FV) c16hp.l0;
        if (c15fv.LLILZ == null || !(iMessage instanceof LinkMicBattleArmiesMessage) || !c15fv.LJFF() || (c159m = ((C15FV) c16hp.l0).LLJI) != (c159m2 = C159M.TASK_IN_PROCESS)) {
            return;
        }
        if (c159m == c159m2 || c159m == C159M.TASK_SUCCEED) {
            LinkMicBattleArmiesMessage linkMicBattleArmiesMessage = (LinkMicBattleArmiesMessage) iMessage;
            C20441214yg.LIZIZ("BattleTaskPresenterTag", linkMicBattleArmiesMessage.toString());
            long j = linkMicBattleArmiesMessage.giftId;
            C15FV c15fv2 = (C15FV) c16hp.l0;
            long j2 = c15fv2.LLLIIIL;
            if (j2 != 0 && j2 == j) {
                c15fv2.LLLIILIL += (long) c15fv2.LLLIIL;
            }
        }
    }
}
