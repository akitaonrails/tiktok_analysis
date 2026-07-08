package Y;

import X.C0CNO;
import X.C1388190mED;
import X.C1389890mGx;
import X.C139800g8;
import X.C1575290r5z;
import X.C1575900r6y;
import X.C1575960r74;
import X.C1602550rnx;
import X.C197039127h;
import X.C19EG;
import X.C1C7U;
import X.C2097608Jq;
import X.C638790P3t;
import X.C638810P3v;
import X.C724240Sb0;
import X.EnumC1575330r63;
import X.EnumC638800P3u;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ab.FeedRegisterFrontierConfig;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3DetailBridgeAssem;
import com.ss.android.ugc.aweme.vibefeed.feed.component.InvitePanelAssem;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedInviteParam;
import com.ss.android.ugc.feed.platform.panel.live.FeedLiveStatusManagerComponent;

/* JADX INFO: loaded from: classes25.dex */
public class ARunnableS24S0210000_24 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        View view;
        FriendsV3DetailBridgeAssem friendsV3DetailBridgeAssem = (FriendsV3DetailBridgeAssem) this.l0;
        View view2 = (View) this.l1;
        boolean z = this.z2;
        if (view2 == null) {
            friendsV3DetailBridgeAssem.getClass();
            return;
        }
        RecyclerView recyclerView = (RecyclerView) friendsV3DetailBridgeAssem.LLJJJ.getValue();
        if (recyclerView == null || (view = (View) friendsV3DetailBridgeAssem.LLJJJJ.getValue()) == null) {
            return;
        }
        int measuredHeight = view.getMeasuredHeight();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        int i2 = i + measuredHeight;
        int i3 = (measuredHeight / 2) + i;
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        int i4 = iArr2[1];
        int measuredHeight2 = view2.getMeasuredHeight() + i4;
        int measuredHeight3 = (view2.getMeasuredHeight() / 2) + i4;
        if (!z || i4 <= i || measuredHeight2 >= i2) {
            recyclerView.nestedScrollBy(0, !((Boolean) C139800g8.LIZ.getValue()).booleanValue() ? measuredHeight3 - i3 : i4 < i ? i4 - i : measuredHeight2 > i2 ? measuredHeight2 - i2 : 0);
        }
    }

    public final void LIZ$1() {
        C19EG c19egLIZIZ;
        ((C197039127h) this.l0).setLoading(false);
        if (!this.z2) {
            Context context = ((C1575900r6y) this.l1).getContext();
            if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
                return;
            }
            C197039127h c197039127h = (C197039127h) this.l0;
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
            c1389890mGx.LJIIJ("accept failed");
            c1389890mGx.LJIIJJI();
            c197039127h.setClickable(true);
            return;
        }
        Context context2 = ((C1575900r6y) this.l1).getContext();
        if (context2 != null) {
            C1575900r6y c1575900r6y = (C1575900r6y) this.l1;
            C638790P3t.LIZ(context2, new C638810P3v(c1575900r6y.LLILLL.getMutualFeedScene(), EnumC638800P3u.CHAT_INVITE_CARD.getValue(), null, c1575900r6y.LLILLL.getToUserId(), "", c1575900r6y.LLILLL.getConversationId(), C2097608Jq.LJ(), 132));
        }
        C1575290r5z c1575290r5z = C1575290r5z.LIZ;
        C1575900r6y c1575900r6y2 = (C1575900r6y) this.l1;
        VibeFeedInviteParam vibeFeedInviteParam = c1575900r6y2.LLILLL;
        EnumC1575330r63 enumC1575330r63 = c1575900r6y2.LLILZIL;
        c1575290r5z.getClass();
        C1575290r5z.LIZ(vibeFeedInviteParam, enumC1575330r63, true);
    }

    public final void LIZ$2() {
        Context context;
        C19EG c19egLIZIZ;
        ((C197039127h) this.l0).setLoading(false);
        if (this.z2) {
            Fragment fragmentLJI = C724240Sb0.LJI((InvitePanelAssem) this.l1);
            if (fragmentLJI == null || !fragmentLJI.isVisible()) {
                return;
            }
            ((InvitePanelAssem) this.l1).ip(true);
            return;
        }
        C1575960r74.LL.getClass();
        if (!C1575960r74.LIZLLL() || (context = ((InvitePanelAssem) this.l1).getContext()) == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
        c1389890mGx.LJIIJ("accept failed");
        c1389890mGx.LJIIJJI();
    }

    public static final void run$0(ARunnableS24S0210000_24 aRunnableS24S0210000_24) {
        boolean zLIZ;
        C1C7U.LIZ("FriendsV3DetailBridgeAssem@a28a.navigateToDetail$2");
        try {
            aRunnableS24S0210000_24.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FriendsV3DetailBridgeAssem@a28a.navigateToDetail$2");
    }

    public static final void run$1(ARunnableS24S0210000_24 aRunnableS24S0210000_24) {
        boolean zLIZ;
        C1C7U.LIZ("FeedLiveStatusManagerComponent@e134.onParentViewCreated$3");
        try {
            FeedRegisterFrontierConfig feedRegisterFrontierConfig = (FeedRegisterFrontierConfig) aRunnableS24S0210000_24.l0;
            C0CNO.LIZLLL(feedRegisterFrontierConfig.delayTime, new C1602550rnx(feedRegisterFrontierConfig, (FeedLiveStatusManagerComponent) aRunnableS24S0210000_24.l1, aRunnableS24S0210000_24.z2));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedLiveStatusManagerComponent@e134.onParentViewCreated$3");
    }

    public static final void run$2(ARunnableS24S0210000_24 aRunnableS24S0210000_24) {
        boolean zLIZ;
        C1C7U.LIZ("VibeEntranceInviteCell@4a6.accept$1$1");
        try {
            aRunnableS24S0210000_24.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VibeEntranceInviteCell@4a6.accept$1$1");
    }

    public static final void run$3(ARunnableS24S0210000_24 aRunnableS24S0210000_24) {
        boolean zLIZ;
        C1C7U.LIZ("InvitePanelAssem@da9e.accept$1$1");
        try {
            aRunnableS24S0210000_24.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InvitePanelAssem@da9e.accept$1$1");
    }

    public ARunnableS24S0210000_24(Object obj, boolean z, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z2 = z;
        this.l1 = obj2;
    }
}
