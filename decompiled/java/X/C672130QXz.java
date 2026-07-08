package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.zhiliaoapp.musically.R;
import g1c.AjS65S0100000_10;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QXz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672130QXz extends C0QXZ {
    public C1753460vjM LLJI;

    @Override // X.C0QY2
    public final void rj() {
        C2344009Gk c2344009GkLIZ = LIZ();
        String str = getEntranceModel().LJIILL;
        if (str == null) {
            str = getEntranceModel().LIZ;
        }
        c2344009GkLIZ.LJIIIIZZ("enter_from", str);
        c2344009GkLIZ.LJIIIIZZ("search_entrance", getEntranceModel().LJIILIIL);
        C1018703yb.LIZIZ("show_search", c2344009GkLIZ.LIZ);
    }

    public final C1753460vjM getCurrentSearchView() {
        return this.LLJI;
    }

    @Override // X.C0QXZ, X.C0QY2
    public EnumC671980QXk getEntranceViewType() {
        return EnumC671980QXk.SINGLE_SEARCH_BTN;
    }

    @Override // X.C0QXZ
    public final SmartRoute LIZIZ(Context context) {
        SmartRoute smartRouteLIZIZ = super.LIZIZ(context);
        if (smartRouteLIZIZ != null) {
            smartRouteLIZIZ.withParam("set_hint_by_sug_word", true);
            return smartRouteLIZIZ;
        }
        return null;
    }

    public final void setColor(int i) {
        C1753460vjM c1753460vjM = this.LLJI;
        if (c1753460vjM != null) {
            c1753460vjM.setTintColor(i);
        }
    }

    public final void setCurrentSearchView(C1753460vjM c1753460vjM) {
        this.LLJI = c1753460vjM;
    }

    @Override // X.C0QXZ
    public void setIconBackgroundAlpha(int i) {
        C1753460vjM c1753460vjM = this.LLJI;
        if (c1753460vjM != null) {
            c1753460vjM.setBackgroundAlpha(i);
        }
    }

    @Override // X.C0QXZ
    public void setIconTintColorRes(int i) {
        C1753460vjM c1753460vjM = this.LLJI;
        if (c1753460vjM != null) {
            c1753460vjM.setTintColorRes(i);
        }
    }

    public C672130QXz(Context context, C671890QXb c671890QXb, Function0 function0) {
        super(context, c671890QXb, function0);
        Context context2 = getContext();
        if (context2 != null) {
            C1753460vjM c1753460vjM = new C1753460vjM(context2, null, 6, 0);
            c1753460vjM.setIconRes(R.raw.icon_magnifying_glass);
            c1753460vjM.setTintColorRes(R.attr.ee);
            c1753460vjM.setBackgroundResource(R.drawable.b6s);
            c1753460vjM.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            c1753460vjM.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            c1753460vjM.setIconMargin(6);
            c1753460vjM.setBackgroundColor(0);
            c1753460vjM.setTintColorRes(R.attr.a1h);
            C0H9H.LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), c1753460vjM);
            this.LLJI = c1753460vjM;
            addView(c1753460vjM);
        }
        C786410Ut5.I7(new AjS65S0100000_10(this, 25), this);
    }
}
