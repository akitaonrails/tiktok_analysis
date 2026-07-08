package Y;

import X.C01C1;
import X.C0VSW;
import X.C1086960eOM;
import X.C1111930f2d;
import X.C1C7U;
import X.EnumC964170bCJ;
import X.InterfaceC1112050f2p;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemExtraTimeCardSentEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSentExtraTimeCardEvent;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.viewmodel.MatchItemViewModel;
import com.bytedance.android.live.publicscreen.impl.PublicScreenService;
import com.bytedance.android.livesdk.interaction.custompoll.shorttouch.PollShortTouchHelper;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.HistoryInfo;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS15S0200100_17 implements Runnable {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        MatchItemViewModel matchItemViewModel = (MatchItemViewModel) this.l0;
        if (matchItemViewModel.LLIZ == EnumC964170bCJ.MATCH_START) {
            DataChannel dataChannel = matchItemViewModel.LLILZIL;
            if (dataChannel != null) {
                dataChannel.LC0(BattleItemExtraTimeCardSentEvent.class, new C0VSW((UUID) this.l1, this.j2));
            }
            DataChannel dataChannel2 = ((MatchItemViewModel) this.l0).LLILZIL;
            if (dataChannel2 != null) {
                dataChannel2.LC0(BattleSentExtraTimeCardEvent.class, Long.valueOf(this.j2));
            }
        }
    }

    public final void LIZ$1() {
        ((PublicScreenService) this.l0).LLIZLLLIL.put(this.j2, (HistoryInfo) this.l1);
        List<C1111930f2d<? extends InterfaceC1112050f2p>> list = ((PublicScreenService) this.l0).LLILLL.get(this.j2);
        if (list != null) {
            HistoryInfo historyInfo = (HistoryInfo) this.l1;
            Iterator<C1111930f2d<? extends InterfaceC1112050f2p>> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LLFF(historyInfo);
            }
        }
    }

    public final void LIZ$2() {
        C1086960eOM c1086960eOM = C1086960eOM.LL;
        PollMessage pollMessage = ((C01C1) this.l0).LJFF;
        Integer num = pollMessage != null ? pollMessage.pollKind : null;
        c1086960eOM.getClass();
        if (C1086960eOM.LJII(num)) {
            long j = this.j2;
            PollShortTouchHelper.LIZJ(j, (C01C1) this.l0, C1086960eOM.LLILLJJLI.get(j), C1086960eOM.LLIZLLLIL, new Runnable() { // from class: X.0eLo
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CustomPollManager@2501.enterInteractionRoom$1$1$1");
                    try {
                        C1086960eOM.LLIZLLLIL = true;
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CustomPollManager@2501.enterInteractionRoom$1$1$1");
                }
            });
        } else {
            Room room = (Room) this.l1;
            long j2 = this.j2;
            PollShortTouchHelper.LIZIZ(room, j2, (C01C1) this.l0, C1086960eOM.LLILLJJLI.get(j2));
        }
    }

    public static final void run$0(ARunnableS15S0200100_17 aRunnableS15S0200100_17) {
        boolean zLIZ;
        C1C7U.LIZ("MatchItemViewModel@5b2b.scheduleExtraTimeEvent$1");
        try {
            aRunnableS15S0200100_17.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MatchItemViewModel@5b2b.scheduleExtraTimeEvent$1");
    }

    public static final void run$1(ARunnableS15S0200100_17 aRunnableS15S0200100_17) {
        boolean zLIZ;
        C1C7U.LIZ("PublicScreenService@6d75.setHistoryCommentInfo$1");
        try {
            aRunnableS15S0200100_17.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PublicScreenService@6d75.setHistoryCommentInfo$1");
    }

    public static final void run$2(ARunnableS15S0200100_17 aRunnableS15S0200100_17) {
        boolean zLIZ;
        C1C7U.LIZ("CustomPollManager@2501.enterInteractionRoom$1$1");
        try {
            aRunnableS15S0200100_17.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CustomPollManager@2501.enterInteractionRoom$1$1");
    }

    public ARunnableS15S0200100_17(Object obj, Object obj2, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.j2 = j;
    }
}
