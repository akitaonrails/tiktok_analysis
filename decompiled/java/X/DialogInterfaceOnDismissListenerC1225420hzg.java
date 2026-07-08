package X;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.saas.host.api.views.IMStyleViewBridgeApi;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS211S0300000_2;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0hzg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class DialogInterfaceOnDismissListenerC1225420hzg extends AbstractC1225780i0G implements DialogInterface.OnDismissListener {
    public final Context LLILLL;
    public final String LLILZ;
    public final Function1<List<C1224840hyk>, Unit> LLILZIL;
    public final C01GW LLILZLL;
    public final String LLIZ;
    public final C1224440hy6 LLIZLLLIL;
    public final C1225930i0V LLJ;
    public final C1225860i0O<C1225430hzh> LLJI;
    public final C1224340hxw LLJIJIL;
    public final C1224580hyK LLJILJIL;
    public final C1224860hym LLJILJILJ;
    public final C1223940hxI LLJILLL;

    @Override // X.AbstractC1225780i0G
    public final Map<String, Object> LIZLLL() {
        return null;
    }

    @Override // X.AbstractC1225780i0G
    public final InterfaceC1225830i0L LJIIIIZZ() {
        return null;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224580hyK LIZ() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final Context LIZIZ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224340hxw LIZJ() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224860hym LJ() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1225780i0G
    public final AbstractC1225870i0P LJFF() {
        return this.LLJ;
    }

    @Override // X.AbstractC1225780i0G
    public final C1223940hxI LJI() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1225780i0G
    public final C1225860i0O<C1225430hzh> LJII() {
        return this.LLJI;
    }

    @Override // X.AbstractC1225780i0G
    public final C1224440hy6 LJIIIZ() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC1225780i0G
    public final String LJIIJ() {
        return this.LLIZ;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.LLILZIL.invoke(C13BV.INSTANCE);
    }

    public DialogInterfaceOnDismissListenerC1225420hzg(int i, Context context, String str, AwS211S0300000_2 awS211S0300000_2, boolean z) {
        Class<? extends PowerLoadingCell> clsLIZIZ;
        EnumC1224390hy1 enumC1224390hy1;
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = awS211S0300000_2;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3419));
        this.LLILZLL = c01gwLIZIZ;
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
        C1225430hzh c1225430hzh = new C1225430hzh(c20603715jn, z);
        this.LLIZ = "SelectConversationTemplate";
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJLILLLLZIIL = false;
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLL = true;
        tuxSheet.LLILLL = false;
        c1390920mIc.LJI(48);
        c1390920mIc.LIZ.LLILLJJLI = this;
        this.LLIZLLLIL = new C1224440hy6(false, null, c1390920mIc, null, EnumC1222430hur.NONE, "", "", false, false, false, null, 1920);
        this.LLJ = new C1225930i0V(EnumC1226540i1U.TAB_KEY_SELECT_CONVERSATION, null, c1225430hzh, 30);
        this.LLJI = new C1225860i0O<>(new C1223610hwl(false, false), c1225430hzh);
        if (i == 1) {
            enumC1224390hy1 = EnumC1224390hy1.SINGLE;
        } else {
            enumC1224390hy1 = EnumC1224390hy1.MULTIPLE;
        }
        this.LLJIJIL = new C1224340hxw(enumC1224390hy1, i, false, false);
        this.LLJILJIL = new C1224580hyK(EnumC1224720hyY.ONE_BUTTON, true, true, "", new C1224590hyL(EnumC1227730i3P.MAIN, false, (String) c01gwLIZIZ.getValue(), true, false), new C1224590hyL(EnumC1227730i3P.SECONDARY, false, (String) c01gwLIZIZ.getValue(), false, false));
        this.LLJILJILJ = new C1224860hym(context.getString(2131821870), false, Collections.singleton(EnumC1224880hyo.END), false);
        this.LLJILLL = new C1223940hxI(true, false, null);
    }
}
