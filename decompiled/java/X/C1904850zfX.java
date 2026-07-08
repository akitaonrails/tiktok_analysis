package X;

import Y.ACListenerS162S0100000_28;
import android.view.View;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zfX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("account_longpress_switch_tooltip")
public final class C1904850zfX extends C10GR {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final C19EG LL;
    public final View LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final EnumC1904890zfb LLILZIL;
    public C0P0T LLILZLL;
    public final int LLIZ = 7100;

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, final C20656615sK c20656615sK) {
        Pair pair;
        int i = C1904900zfc.LIZ[this.LLILZIL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                pair = new Pair(2131849406, Integer.valueOf(R.raw.icon_hand_double_click_fill));
            } else {
                throw new C1954807lC();
            }
        } else {
            pair = new Pair(2131849407, Integer.valueOf(R.raw.icon_hand_long_press_fill));
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        EnumC450670Hlp enumC450670Hlp = EnumC450670Hlp.SMALL;
        C450720Hlu c450720Hlu = new C450720Hlu(this.LL);
        View view = this.LLILLJJLI;
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZIZ = view;
        c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
        c450720Hlu.LLILZ = this.LL.getString(iIntValue);
        c450720Hlu.LLILZIL = iIntValue2;
        c450720Hlu.LLIZ = enumC450670Hlp;
        c450720Hlu.LLILLJJLI.LJIJJ = false;
        C1905770zh1.LIZJ(c450720Hlu, "account_longpress_switch_tooltip", true, new ACListenerS162S0100000_28(this, 34));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        C1391600mJi c1391600mJi2 = c450720Hlu.LLILLJJLI;
        c1391600mJi2.LJIIIIZZ = iLIZIZ;
        c1391600mJi2.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
        EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.PROFILE;
        C1905770zh1.LIZIZ(c450720Hlu, "account_longpress_switch_tooltip", enumC1584360rKc, new AwS572S0100000_28(this, 122));
        C1905770zh1.LIZ(c450720Hlu, "account_longpress_switch_tooltip", enumC1584360rKc, new AwS394S0200000_28(this, c20656615sK, 14));
        C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
        this.LLILZLL = c0p0tLIZIZ;
        C1904790zfR c1904790zfRLIZ = C1904960zfi.LIZ("account_longpress_switch_tooltip", enumC1584360rKc);
        c1904790zfRLIZ.LJ = Mp4ScreenVideoLoadTimeout.CONTROL;
        C1905750zgz.LIZIZ.LJFF(c1904790zfRLIZ.LIZ(c0p0tLIZIZ), new InterfaceC1906540ziG() { // from class: X.0zfY
            @Override // X.InterfaceC1906540ziG
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1906540ziG
            public final void onDismiss() {
            }

            @Override // X.InterfaceC1906540ziG
            public final void onShow() {
            }

            @Override // X.InterfaceC1906540ziG
            public final void LIZ(C1619160sEk c1619160sEk) {
                c20656615sK.LIZ();
            }
        });
    }

    public C1904850zfX(C19EG c19eg, View view, String str, String str2, EnumC1904890zfb enumC1904890zfb) {
        this.LL = c19eg;
        this.LLILLJJLI = view;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = enumC1904890zfb;
    }
}
