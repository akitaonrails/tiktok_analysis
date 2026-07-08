package Y;

import X.C0IOL;
import X.C0ISJ;
import X.C0SR4;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C465410IMx;
import com.bytedance.android.livesdk.chatroom.ui.extracard.LiveExtraCardFrequencyManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashSet;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS6S0301000_7 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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
        C0IOL c0iol = (C0IOL) this.l0;
        ((HashSet) c0iol.LLILLJJLI).remove((C465410IMx) this.l1);
        LiveExtraCardFrequencyManager.LIZLLL = null;
        if (((C0IOL) this.l0).size() < this.i3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchSpecialCard loadMore success but list still too short, listSize=");
            sbLIZ.append(((C0IOL) this.l0).size());
            sbLIZ.append(", targetIndex=");
            sbLIZ.append(this.i3);
            C20441214yg.LJIIIZ("LiveExtraCardFrequencyManager", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fetchSpecialCard retry insertRoom after loadMore, listSize=");
        sbLIZ2.append(((C0IOL) this.l0).size());
        sbLIZ2.append(", targetIndex=");
        sbLIZ2.append(this.i3);
        C20441214yg.LJIIIZ("LiveExtraCardFrequencyManager", C2188811AlT.LIZIZ(sbLIZ2));
        ((C0IOL) this.l0).LJJII(this.i3, (Room) this.l2);
    }

    public final void LIZ$1() {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("remove the next variant card asynchronously ");
            sbLIZ.append(this.i3);
            C20441214yg.LJIIIZ("DrawRoomListProvider", C2188811AlT.LIZIZ(sbLIZ));
            ((C0ISJ) this.l0).LLJILJIL.remove((Room) this.l1);
            ((C0ISJ) this.l0).LLJILJILJ.remove((EnterRoomConfig) this.l2);
            ((C0ISJ) this.l0).LLJJJ.remove(Long.valueOf(((Room) this.l1).getId()));
            ((C0ISJ) this.l0).LJIILJJIL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("DrawRoomListProvider", "remove the next variant card asynchronously error", e);
        }
    }

    public static final void run$0(ARunnableS6S0301000_7 aRunnableS6S0301000_7) {
        boolean zLIZ;
        C1C7U.LIZ("LiveExtraCardFrequencyManager@260.fetchSpecialCardFromServer$1$loadMoreCallback$1$onSuccess$1");
        try {
            aRunnableS6S0301000_7.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveExtraCardFrequencyManager@260.fetchSpecialCardFromServer$1$loadMoreCallback$1$onSuccess$1");
    }

    public static final void run$1(ARunnableS6S0301000_7 aRunnableS6S0301000_7) {
        boolean zLIZ;
        C1C7U.LIZ("DrawRoomListProvider@3742.removeNextVariantCard$1");
        try {
            aRunnableS6S0301000_7.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DrawRoomListProvider@3742.removeNextVariantCard$1");
    }

    public static final void run$2(ARunnableS6S0301000_7 aRunnableS6S0301000_7) {
        boolean zLIZ;
        C1C7U.LIZ("AbstractFeedAdapter@eb3.logImpression$1");
        try {
            ((C0SR4) aRunnableS6S0301000_7.l0).LJJLIIIJL(aRunnableS6S0301000_7.i3, (Aweme) aRunnableS6S0301000_7.l1, (User) aRunnableS6S0301000_7.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbstractFeedAdapter@eb3.logImpression$1");
    }

    public ARunnableS6S0301000_7(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.i3 = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
