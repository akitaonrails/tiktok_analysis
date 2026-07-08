package Y;

import X.C0ISY;
import X.C2188811AlT;
import X.C469740IbU;
import X.C481820Iuy;
import X.C481840Iv0;
import X.C481860Iv2;
import X.C482300Ivk;
import android.view.View;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import webcast.api.feed.ToplivePageItem;

/* JADX INFO: loaded from: classes8.dex */
public class ACListenerS9S1201000_7 implements View.OnClickListener {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS9S1201000_7 aCListenerS9S1201000_7, View view) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C0ISY c0isy = LiveFeedDraw.Companion;
        String str = ((ToplivePageItem) aCListenerS9S1201000_7.l1).enterMethod;
        c0isy.getClass();
        sbLIZ.append(C0ISY.LIZLLL("live_merge", str).param);
        sbLIZ.append("_refresh");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ToplivePageItem toplivePageItem = (ToplivePageItem) aCListenerS9S1201000_7.l1;
        C469740IbU.LIZIZ(strLIZIZ, toplivePageItem, toplivePageItem.enterMethod);
        C481820Iuy c481820Iuy = C481820Iuy.LIZ;
        C482300Ivk.LIZ.getClass();
        ToplivePageItem toplivePageItem2 = C482300Ivk.LIZLLL;
        ToplivePageItem toplivePageItem3 = ((C481860Iv2) aCListenerS9S1201000_7.l2).LLILLL;
        int i = aCListenerS9S1201000_7.i3;
        String str2 = aCListenerS9S1201000_7.s0;
        c481820Iuy.getClass();
        C481820Iuy.LIZJ(toplivePageItem2, toplivePageItem3, "discovery", i, str2);
    }

    public static final void onClick$1(ACListenerS9S1201000_7 aCListenerS9S1201000_7, View view) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C0ISY c0isy = LiveFeedDraw.Companion;
        String str = ((ToplivePageItem) aCListenerS9S1201000_7.l1).enterMethod;
        c0isy.getClass();
        sbLIZ.append(C0ISY.LIZLLL("live_merge", str).param);
        sbLIZ.append("_refresh");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ToplivePageItem toplivePageItem = (ToplivePageItem) aCListenerS9S1201000_7.l1;
        C469740IbU.LIZIZ(strLIZIZ, toplivePageItem, toplivePageItem.enterMethod);
        C481820Iuy c481820Iuy = C481820Iuy.LIZ;
        C482300Ivk.LIZ.getClass();
        ToplivePageItem toplivePageItem2 = C482300Ivk.LIZLLL;
        ToplivePageItem toplivePageItem3 = ((C481840Iv0) aCListenerS9S1201000_7.l2).LLILLL;
        int i = aCListenerS9S1201000_7.i3;
        String str2 = aCListenerS9S1201000_7.s0;
        c481820Iuy.getClass();
        C481820Iuy.LIZJ(toplivePageItem2, toplivePageItem3, "discovery", i, str2);
    }

    public ACListenerS9S1201000_7(Object obj, Object obj2, int i, String str, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.l2 = obj2;
        this.i3 = i;
        this.s0 = str;
    }
}
