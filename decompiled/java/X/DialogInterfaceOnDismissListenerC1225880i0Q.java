package X;

import Y.AObjectS126S0000000_28;
import Y.AObjectS164S0000000_28;
import Y.AObjectS362S0100000_19;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.ss.android.ugc.aweme.im.saas.host.api.views.IMStyleViewBridgeApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0i0Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class DialogInterfaceOnDismissListenerC1225880i0Q extends AbstractC1225780i0G implements DialogInterface.OnDismissListener {
    public final Context LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final C1915907ev LLIZ;
    public final boolean LLIZLLLIL;
    public final Function1<C1915907ev, Unit> LLJ;
    public final Function1<String, Unit> LLJI;
    public final Function2<String, String, Unit> LLJIJIL;
    public final Function1<Boolean, Unit> LLJILJIL;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3403));
    public final C1225890i0R LLJILLL;
    public final String LLJJ;
    public final C1224440hy6 LLJJI;
    public final C1225940i0W LLJJIII;
    public final C1225860i0O<C1225890i0R> LLJJIJI;
    public final C1224340hxw LLJJIJIIJIL;
    public final C1224580hyK LLJJIJIL;
    public final C1224860hym LLJJJ;
    public final C1223940hxI LLJJJIL;

    @Override // X.AbstractC1225780i0G
    public final Map<String, Object> LIZLLL() {
        return null;
    }

    @Override // X.AbstractC1225780i0G
    public final InterfaceC1225830i0L LJIIIIZZ() {
        return null;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
    }

    @Override // X.AbstractC1225780i0G
    public final C1224580hyK LIZ() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final Context LIZIZ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224340hxw LIZJ() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224860hym LJ() {
        return this.LLJJJ;
    }

    @Override // X.AbstractC1225780i0G
    public final AbstractC1225870i0P LJFF() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1225780i0G
    public final C1223940hxI LJI() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1225860i0O<C1225890i0R> LJII() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224440hy6 LJIIIZ() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1225780i0G
    public final String LJIIJ() {
        return this.LLJJ;
    }

    public DialogInterfaceOnDismissListenerC1225880i0Q(Context context, int i, int i2, int i3, C1915907ev c1915907ev, boolean z, AObjectS362S0100000_19 aObjectS362S0100000_19, AObjectS126S0000000_28 aObjectS126S0000000_28, AObjectS164S0000000_28 aObjectS164S0000000_28, AObjectS362S0100000_19 aObjectS362S0100000_192) {
        Class<? extends PowerLoadingCell> clsLIZIZ;
        String strLJ;
        EnumC1224720hyY enumC1224720hyY;
        List<Long> list;
        List<Long> list2;
        List<Long> list3;
        List<Long> list4;
        this.LLILLL = context;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = i3;
        this.LLIZ = c1915907ev;
        this.LLIZLLLIL = z;
        this.LLJ = aObjectS362S0100000_19;
        this.LLJI = aObjectS126S0000000_28;
        this.LLJIJIL = aObjectS164S0000000_28;
        this.LLJILJIL = aObjectS362S0100000_192;
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZ = 2;
        IMStyleViewBridgeApi.LIZ.getClass();
        IMStyleViewBridgeApi iMStyleViewBridgeApiLIZ = C1227300i2i.LIZ();
        if (iMStyleViewBridgeApiLIZ != null) {
            clsLIZIZ = iMStyleViewBridgeApiLIZ.LIZIZ();
        } else {
            clsLIZIZ = null;
        }
        c20603715jn.LIZLLL = clsLIZIZ;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (c1915907ev != null && (list4 = c1915907ev.LIZIZ) != null) {
            Iterator<Long> it2 = list4.iterator();
            while (it2.hasNext()) {
                linkedHashSet.add(String.valueOf(it2.next().longValue()));
            }
        }
        C1915907ev c1915907ev2 = this.LLIZ;
        if (c1915907ev2 != null && (list3 = c1915907ev2.LIZJ) != null) {
            Iterator<Long> it3 = list3.iterator();
            while (it3.hasNext()) {
                linkedHashSet.add(String.valueOf(it3.next().longValue()));
            }
        }
        C1225890i0R c1225890i0R = new C1225890i0R(c20603715jn, linkedHashSet);
        this.LLJILLL = c1225890i0R;
        this.LLJJ = "live_visible_scope";
        this.LLJJI = new C1224440hy6(false, null, null, null, EnumC1222430hur.TOP, "", "", false, false, false, null, 1920);
        ArrayList arrayList = new ArrayList();
        if (!this.LLIZLLLIL) {
            arrayList.add(new C1225950i0X(new C1224570hyJ(this.LLILLL.getString(2131856070), EnumC1226540i1U.TAB_KEY_ALL_FOR_LIVE.getValue()), c1225890i0R));
        }
        C1224570hyJ c1224570hyJ = new C1224570hyJ(this.LLILLL.getString(2131856082), EnumC1226540i1U.TAB_KEY_FRIENDS_FOR_LIVE.getValue());
        C20603715jn c20603715jnLIZIZ = C1226680i1i.LIZIZ();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        C1915907ev c1915907ev3 = this.LLIZ;
        if (c1915907ev3 != null && (list2 = c1915907ev3.LIZIZ) != null) {
            Iterator<Long> it4 = list2.iterator();
            while (it4.hasNext()) {
                linkedHashSet2.add(String.valueOf(it4.next().longValue()));
            }
        }
        arrayList.add(new C1225950i0X(c1224570hyJ, new C1225910i0T(c20603715jnLIZIZ, linkedHashSet2), C13BV.INSTANCE));
        if (!this.LLIZLLLIL) {
            C1224570hyJ c1224570hyJ2 = new C1224570hyJ(this.LLILLL.getString(2131856071), EnumC1226540i1U.TAB_KEY_GROUPS_FOR_LIVE.getValue());
            C20603715jn c20603715jnLIZIZ2 = C1226680i1i.LIZIZ();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            C1915907ev c1915907ev4 = this.LLIZ;
            if (c1915907ev4 != null && (list = c1915907ev4.LIZJ) != null) {
                Iterator<Long> it5 = list.iterator();
                while (it5.hasNext()) {
                    linkedHashSet3.add(String.valueOf(it5.next().longValue()));
                }
            }
            arrayList.add(new C1225950i0X(c1224570hyJ2, new C1225920i0U(c20603715jnLIZIZ2, linkedHashSet3)));
        }
        this.LLJJIII = new C1225940i0W(arrayList);
        this.LLJJIJI = new C1225860i0O<>(new C1223610hwl(false, false), this.LLJILLL);
        this.LLJJIJIIJIL = new C1224340hxw(EnumC1224390hy1.MULTIPLE, Integer.MAX_VALUE, false, false);
        int i4 = this.LLILZLL;
        if (i4 > 0) {
            strLJ = C20642515q3.LJ(2131755977, i4, Integer.valueOf(i4));
        } else {
            strLJ = "";
        }
        C1224590hyL c1224590hyL = new C1224590hyL(EnumC1227730i3P.MAIN, false, (String) this.LLJILJILJ.getValue(), true, false);
        C1224590hyL c1224590hyL2 = new C1224590hyL(EnumC1227730i3P.SECONDARY, false, (String) this.LLJILJILJ.getValue(), false, false);
        if (this.LLILZLL > 0) {
            enumC1224720hyY = EnumC1224720hyY.POLICY;
        } else {
            enumC1224720hyY = EnumC1224720hyY.ONE_BUTTON;
        }
        this.LLJJIJIL = new C1224580hyK(enumC1224720hyY, true, true, strLJ, c1224590hyL, c1224590hyL2);
        this.LLJJJ = new C1224860hym(this.LLILLL.getString(2131856073), false, Collections.singleton(EnumC1224880hyo.END), false);
        this.LLJJJIL = new C1223940hxI(true, false, null);
    }
}
