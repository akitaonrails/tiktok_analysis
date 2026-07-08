package X;

import Y.AObjectS126S0000000_28;
import Y.AObjectS164S0000000_28;
import Y.AObjectS362S0100000_19;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.ss.android.ugc.aweme.im.saas.host.api.views.IMStyleViewBridgeApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0i0d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class DialogInterfaceOnDismissListenerC1226010i0d extends AbstractC1225780i0G implements DialogInterface.OnDismissListener {
    public final Context LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final List<User> LLIZLLLIL;
    public final List<User> LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final C1226060i0i LLJILJIL;
    public final Function1<C1226060i0i, Unit> LLJILJILJ;
    public final Function1<String, Unit> LLJILLL;
    public final Function2<String, String, Unit> LLJJ;
    public final Function1<Boolean, Unit> LLJJI;
    public final C1225370hzb LLJJIII;
    public final String LLJJIJI;
    public final C1224440hy6 LLJJIJIIJIL;
    public final C1225940i0W LLJJIJIL;
    public final C1225860i0O<C1225370hzb> LLJJJ;
    public final C1224340hxw LLJJJIL;
    public final C1224580hyK LLJJJJ;
    public final C1224860hym LLJJJJJIL;
    public final C1223940hxI LLJJJJLIIL;

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
        return this.LLJJJJ;
    }

    @Override // X.AbstractC1225780i0G
    public final Context LIZIZ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224340hxw LIZJ() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224860hym LJ() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final AbstractC1225870i0P LJFF() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1223940hxI LJI() {
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1225860i0O<C1225370hzb> LJII() {
        return this.LLJJJ;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224440hy6 LJIIIZ() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final String LJIIJ() {
        return this.LLJJIJI;
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [X.0hzb] */
    public DialogInterfaceOnDismissListenerC1226010i0d(Context context, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, int i, int i2, C1226060i0i c1226060i0i, AObjectS362S0100000_19 aObjectS362S0100000_19, AObjectS126S0000000_28 aObjectS126S0000000_28, AObjectS164S0000000_28 aObjectS164S0000000_28, AObjectS362S0100000_19 aObjectS362S0100000_192) {
        Class<? extends PowerLoadingCell> clsLIZIZ;
        List<User> list3;
        List<User> list4;
        this.LLILLL = context;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        this.LLIZLLLIL = list;
        this.LLJ = list2;
        this.LLJI = i;
        this.LLJIJIL = i2;
        this.LLJILJIL = c1226060i0i;
        this.LLJILJILJ = aObjectS362S0100000_19;
        this.LLJILLL = aObjectS126S0000000_28;
        this.LLJJ = aObjectS164S0000000_28;
        this.LLJJI = aObjectS362S0100000_192;
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
        if (c1226060i0i != null && (list4 = c1226060i0i.LIZ) != null) {
            Iterator<User> it2 = list4.iterator();
            while (it2.hasNext()) {
                linkedHashSet.add(it2.next().toString());
            }
        }
        this.LLJJIII = new C1223510hwb(c20603715jn, linkedHashSet) { // from class: X.0hzb
            public final C20603715jn LIZLLL;
            public final boolean LJ;
            public final boolean LJFF;
            public final Set<String> LJI;

            @Override // X.C1223510hwb
            public final boolean LIZ() {
                return this.LJ;
            }

            @Override // X.C1223510hwb
            public final C20603715jn LIZIZ() {
                return this.LIZLLL;
            }

            @Override // X.C1223510hwb
            public final boolean LIZJ() {
                return this.LJFF;
            }

            {
                super(c20603715jn, false, true);
                this.LIZLLL = c20603715jn;
                this.LJ = false;
                this.LJFF = true;
                this.LJI = linkedHashSet;
            }
        };
        this.LLJJIJI = "live_invite_guest_template";
        this.LLJJIJIIJIL = new C1224440hy6(false, null, null, null, EnumC1222430hur.TOP, "", "", false, false, false, null, 1920);
        ArrayList arrayList = new ArrayList();
        C1224570hyJ c1224570hyJ = new C1224570hyJ(this.LLILLL.getString(2131856082), EnumC1226540i1U.TAB_KEY_FRIENDS_FOR_PRE_LIVE.getValue());
        List<User> list5 = this.LLIZLLLIL;
        List<User> list6 = this.LLJ;
        String str7 = this.LLILZ;
        String str8 = this.LLILZIL;
        C20603715jn c20603715jnLIZIZ = C1226680i1i.LIZIZ();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        C1226060i0i c1226060i0i2 = this.LLJILJIL;
        if (c1226060i0i2 != null && (list3 = c1226060i0i2.LIZ) != null) {
            Iterator<User> it3 = list3.iterator();
            while (it3.hasNext()) {
                linkedHashSet2.add(String.valueOf(it3.next().getId()));
            }
        }
        arrayList.add(new C1225950i0X(c1224570hyJ, new C1226040i0g(list5, list6, str7, str8, c20603715jnLIZIZ, linkedHashSet2), C13BV.INSTANCE));
        this.LLJJIJIL = new C1225940i0W(arrayList);
        this.LLJJJ = new C1225860i0O<>(new C1223610hwl(false, false), this.LLJJIII);
        this.LLJJJIL = new C1224340hxw(EnumC1224390hy1.MULTIPLE, Integer.MAX_VALUE, false, true);
        EnumC1227730i3P enumC1227730i3P = EnumC1227730i3P.MAIN;
        String str9 = this.LLILZLL;
        this.LLJJJJ = new C1224580hyK(EnumC1224720hyY.POLICY, false, true, str4, new C1224590hyL(enumC1227730i3P, false, str9, true, false), new C1224590hyL(EnumC1227730i3P.SECONDARY, false, str9, false, false));
        this.LLJJJJJIL = new C1224860hym(str, false, Collections.singleton(EnumC1224880hyo.END), false);
        this.LLJJJJLIIL = new C1223940hxI(false, false, null);
    }
}
