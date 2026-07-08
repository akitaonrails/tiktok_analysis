package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import g1c.AjS65S0100000_10;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QXc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671900QXc {
    public static final C671900QXc LIZ = new C671900QXc();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.0QY2, android.view.View] */
    public static C0QY2 LIZ(final Context context, final C671890QXb c671890QXb, final Function0 function0, C19ME c19me, final LifecycleOwner lifecycleOwner) {
        Long l;
        ?? c672680Qa2;
        Map<String, C0QYK<? extends Serializable>> map = C672180QYe.LIZ;
        switch (C671940QXg.LIZIZ[C672180QYe.LIZ(c671890QXb.LJII).ordinal()]) {
            case 1:
                c672680Qa2 = new C671920QXe(context, c671890QXb, function0);
                break;
            case 2:
                if (c671890QXb.LJJIIJ) {
                    c672680Qa2 = new C671930QXf(context, c671890QXb, function0, lifecycleOwner);
                } else {
                    c672680Qa2 = new C671880QXa(context, c671890QXb, function0, lifecycleOwner);
                }
                break;
            case 3:
                c672680Qa2 = new C671880QXa(context, c671890QXb, function0, lifecycleOwner) { // from class: X.0QXj
                    public final SmartRoute LLJILLL;

                    @Override // X.C671880QXa, X.C0QXZ, X.C0QY2
                    public final void Aj() {
                    }

                    @Override // X.C671880QXa
                    public final void LJI() {
                    }

                    @Override // X.C671880QXa, X.C0QY2
                    public final void rj() {
                    }

                    @Override // X.C671880QXa, X.C0QXZ, X.C0QY2
                    public EnumC671980QXk getEntranceViewType() {
                        return EnumC671980QXk.TO_SUG;
                    }

                    @Override // X.C0QXZ
                    public SmartRoute getSmartRoute() {
                        return this.LLJILLL;
                    }

                    @Override // X.C671880QXa, X.C0QXZ
                    public final SmartRoute LIZIZ(Context context2) {
                        SmartRoute smartRouteLIZIZ = super.LIZIZ(context2);
                        if (smartRouteLIZIZ != null) {
                            smartRouteLIZIZ.withParam("back_flag", "1");
                            smartRouteLIZIZ.withParam("search_hint_word", "");
                            smartRouteLIZIZ.withParam("last_search_position", EnumC669620QOi.SHOP.getTabName());
                            String str = getEntranceModel().LJIJI;
                            if (str != null) {
                                smartRouteLIZIZ.withParam("banner_voucher_type_ids", str);
                            }
                            smartRouteLIZIZ.withParam("sug_keyword", getEntranceModel().LJFF);
                            return smartRouteLIZIZ;
                        }
                        return null;
                    }

                    {
                        super(context, c671890QXb, function0, lifecycleOwner);
                        this.LLJILLL = SmartRouter.buildRoute(context, "//ec/search");
                    }
                };
                break;
            case 4:
                c672680Qa2 = new C671910QXd(context, c671890QXb, function0);
                break;
            case 5:
                c672680Qa2 = new C672130QXz(context, c671890QXb, function0);
                break;
            case 6:
                c672680Qa2 = new C0QXZ(context, c671890QXb, function0) { // from class: X.0QXy
                    public final SmartRoute LLJI;
                    public C1753460vjM LLJIJIL;

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
                        return this.LLJIJIL;
                    }

                    @Override // X.C0QXZ, X.C0QY2
                    public EnumC671980QXk getEntranceViewType() {
                        return EnumC671980QXk.ALIEN_SEARCH_BTN;
                    }

                    @Override // X.C0QXZ
                    public SmartRoute getSmartRoute() {
                        return this.LLJI;
                    }

                    @Override // X.C0QXZ
                    public final SmartRoute LIZIZ(Context context2) {
                        SmartRoute smartRouteLIZIZ = super.LIZIZ(context2);
                        if (smartRouteLIZIZ != null) {
                            smartRouteLIZIZ.withParam("set_hint_by_sug_word", true);
                            return smartRouteLIZIZ;
                        }
                        return null;
                    }

                    public final void setColor(int i) {
                        C1753460vjM c1753460vjM = this.LLJIJIL;
                        if (c1753460vjM != null) {
                            c1753460vjM.setTintColor(i);
                        }
                    }

                    public final void setCurrentSearchView(C1753460vjM c1753460vjM) {
                        this.LLJIJIL = c1753460vjM;
                    }

                    @Override // X.C0QXZ
                    public void setIconBackgroundAlpha(int i) {
                        C1753460vjM c1753460vjM = this.LLJIJIL;
                        if (c1753460vjM != null) {
                            c1753460vjM.setBackgroundAlpha(i);
                        }
                    }

                    @Override // X.C0QXZ
                    public void setIconTintColorRes(int i) {
                        C1753460vjM c1753460vjM = this.LLJIJIL;
                        if (c1753460vjM != null) {
                            c1753460vjM.setTintColorRes(i);
                        }
                    }

                    {
                        super(context, c671890QXb, function0);
                        this.LLJI = SmartRouter.buildRoute(context, "//ec/search");
                        Context context2 = getContext();
                        if (context2 != null) {
                            C1753460vjM c1753460vjM = new C1753460vjM(context2, null, 6, 0);
                            c1753460vjM.setIconRes(R.raw.icon_magnifying_glass);
                            c1753460vjM.setTintColorRes(R.attr.ee);
                            c1753460vjM.setBackgroundResource(R.drawable.b6r);
                            c1753460vjM.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                            c1753460vjM.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                            c1753460vjM.setIconMargin(6);
                            c1753460vjM.setBackgroundColor(0);
                            c1753460vjM.setTintColorRes(R.attr.a1h);
                            this.LLJIJIL = c1753460vjM;
                            addView(c1753460vjM);
                        }
                        C786410Ut5.I7(new AjS65S0100000_10(this, 24), this);
                    }
                };
                break;
            case 7:
                Aweme aweme = c671890QXb.LJJIJ;
                if (aweme != null && (l = c671890QXb.LJJIJIL) != null) {
                    long jLongValue = l.longValue();
                    String str = c671890QXb.LIZ;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    String str3 = c671890QXb.LJJIJIIJI;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    c672680Qa2 = new C672680Qa2(context, aweme, str, str2, c671890QXb.LJJIJIIJIL, jLongValue);
                    break;
                }
            default:
                c672680Qa2 = 0;
                break;
        }
        if (c19me != null && c672680Qa2 != 0) {
            C786410Ut5.W5(c672680Qa2, c19me);
        }
        return c672680Qa2;
    }
}
