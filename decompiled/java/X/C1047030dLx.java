package X;

import Y.ACListenerS119S0200000_16;
import Y.ACListenerS151S0100000_16;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0dLx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1047030dLx extends AbstractC1893000zMQ {
    public TuxNavBar LL;
    public View LLILLJJLI;
    public final String LLILLL = "back_btn";
    public final String LLILZ = "close_all_btn";
    public final String LLILZIL = "report_normal";
    public final String LLILZLL = "more";
    public final String LLIZ = "share";
    public SparkContext LLIZLLLIL;
    public C1250250idj LLJ;
    public C1047020dLw LLJI;

    @Override // X.InterfaceC1892990zMP
    public final void LJIILL(int i) {
    }

    @Override // X.AbstractC1893000zMQ, X.InterfaceC1163130gND
    public final void release() {
        C1047020dLw c1047020dLw = this.LLJI;
        if (c1047020dLw != null) {
            EventBus.LIZLLL().LJJI(c1047020dLw);
        }
        this.LLJI = null;
    }

    @Override // X.AbstractC1893000zMQ
    public final void LIZ(SparkContext sparkContext) {
        this.LLIZLLLIL = sparkContext;
    }

    @Override // X.InterfaceC1892990zMP
    public final View LJFF(Context context) {
        String str;
        int i;
        View viewSd = C786410Ut5.Sd(R.layout.f_k, C786410Ut5.ne(context), null);
        viewSd.setMinimumHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)));
        this.LL = (TuxNavBar) viewSd.findViewById(R.id.p15);
        this.LLILLJJLI = viewSd.findViewById(R.id.moq);
        SparkContext sparkContext = this.LLIZLLLIL;
        if (sparkContext == null || (str = sparkContext.containerId) == null) {
            str = "";
        }
        Map<String, String> mapLIZJ = C08RQ.LIZJ(str);
        View view = this.LLILLJJLI;
        if (view != null) {
            if (Intrinsics.LJFF(mapLIZJ.get("show_separate_line"), "1")) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZIZ = this.LLILLL;
        c0om1.LJ(c1251150ifB);
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_x_mark;
        c1251150ifB2.LIZIZ = this.LLILZ;
        c1251150ifB2.LJI = false;
        c0om1.LJ(c1251150ifB2);
        C1251150ifB c1251150ifB3 = new C1251150ifB();
        c1251150ifB3.LIZLLL();
        c1251150ifB3.LIZJ = R.raw.icon_flag;
        c1251150ifB3.LIZIZ = this.LLILZIL;
        c1251150ifB3.LJI = false;
        c0om1.LIZIZ(c1251150ifB3);
        C1251150ifB c1251150ifB4 = new C1251150ifB();
        c1251150ifB4.LIZLLL();
        c1251150ifB4.LIZJ = R.raw.icon_ellipsis_horizontal;
        c1251150ifB4.LIZIZ = this.LLILZLL;
        c1251150ifB4.LJI = false;
        c0om1.LIZIZ(c1251150ifB4);
        C1251150ifB c1251150ifB5 = new C1251150ifB();
        c1251150ifB5.LIZLLL();
        c1251150ifB5.LIZJ = R.raw.icon_arrow_turn_up_right;
        c1251150ifB5.LIZIZ = this.LLIZ;
        c1251150ifB5.LJI = false;
        c0om1.LIZIZ(c1251150ifB5);
        TuxNavBar tuxNavBar = this.LL;
        if (tuxNavBar != null) {
            tuxNavBar.setNavActions(c0om1);
        }
        return this.LL;
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJIFFI(EnumC1067700dtI enumC1067700dtI) {
        String str;
        Aweme awemeEr;
        boolean z;
        View viewLJII;
        View viewLJII2;
        View viewLJII3;
        int i = C1067660dtE.LIZ[enumC1067700dtI.ordinal()];
        boolean z2 = true;
        View viewLJII4 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        TuxNavBar tuxNavBar = this.LL;
                        if (tuxNavBar != null) {
                            viewLJII4 = tuxNavBar.LJII(this.LLILZIL);
                        }
                        C12ES.LJIILL(8, viewLJII4);
                        return;
                    }
                    TuxNavBar tuxNavBar2 = this.LL;
                    if (tuxNavBar2 != null) {
                        viewLJII4 = tuxNavBar2.LJII(this.LLILZLL);
                    }
                    C12ES.LJIILL(0, viewLJII4);
                    return;
                }
                TuxNavBar tuxNavBar3 = this.LL;
                if (tuxNavBar3 != null) {
                    viewLJII4 = tuxNavBar3.LJII(this.LLIZ);
                }
                C12ES.LJIILL(0, viewLJII4);
                TuxNavBar tuxNavBar4 = this.LL;
                if (tuxNavBar4 == null || (viewLJII3 = tuxNavBar4.LJII(this.LLIZ)) == null) {
                    return;
                }
                C786410Ut5.I7(new ACListenerS151S0100000_16(this, 193), viewLJII3);
                return;
            }
            SparkContext sparkContext = this.LLIZLLLIL;
            if (sparkContext == null || (str = sparkContext.containerId) == null) {
                str = "";
            }
            Map<String, String> mapLIZJ = C08RQ.LIZJ(str);
            String str2 = mapLIZJ.get("aweme_id");
            String str3 = mapLIZJ.get("legacy_report");
            String str4 = mapLIZJ.get("report_type");
            IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
            if (iAwemeService != null) {
                awemeEr = iAwemeService.Er(str2);
            } else {
                awemeEr = null;
            }
            if (Intrinsics.LJFF(mapLIZJ.get("show_report"), "1") && awemeEr != null) {
                z = true;
            } else {
                z = false;
            }
            if (!Intrinsics.LJFF(str3, "1")) {
                z2 = z;
            }
            if (!C123100dR.LIZ(str4) && z2) {
                TuxNavBar tuxNavBar5 = this.LL;
                if (tuxNavBar5 != null && (viewLJII2 = tuxNavBar5.LJII(this.LLILZIL)) != null) {
                    C786410Ut5.I7(new ACListenerS119S0200000_16(this, awemeEr, 45), viewLJII2);
                }
            } else {
                TuxNavBar tuxNavBar6 = this.LL;
                if (tuxNavBar6 != null && (viewLJII = tuxNavBar6.LJII(this.LLILZIL)) != null) {
                    C786410Ut5.I7(new ACListenerS151S0100000_16(this, 192), viewLJII);
                }
            }
            TuxNavBar tuxNavBar7 = this.LL;
            if (tuxNavBar7 != null) {
                viewLJII4 = tuxNavBar7.LJII(this.LLILZIL);
            }
            C12ES.LJIILL(0, viewLJII4);
            return;
        }
        TuxNavBar tuxNavBar8 = this.LL;
        if (tuxNavBar8 != null) {
            viewLJII4 = tuxNavBar8.LJII(this.LLILZIL);
        }
        C12ES.LJIILL(8, viewLJII4);
    }

    @Override // X.AbstractC1893000zMQ, X.InterfaceC1892990zMP
    public final void LJJII(boolean z) {
        View viewLJII = null;
        if (z) {
            TuxNavBar tuxNavBar = this.LL;
            if (tuxNavBar != null) {
                viewLJII = tuxNavBar.LJII(this.LLILLL);
            }
            C12ES.LJIILL(0, viewLJII);
            return;
        }
        TuxNavBar tuxNavBar2 = this.LL;
        if (tuxNavBar2 != null) {
            viewLJII = tuxNavBar2.LJII(this.LLILLL);
        }
        C12ES.LJIILL(8, viewLJII);
    }

    @Override // X.AbstractC1893000zMQ, X.InterfaceC1892990zMP
    public final void LJJIJLIJ(SpannableString spannableString) {
        if (this.LLJ == null) {
            this.LLJ = new C1250250idj();
        }
        C1250250idj c1250250idj = this.LLJ;
        if (c1250250idj != null) {
            c1250250idj.LIZLLL = spannableString;
            TuxNavBar tuxNavBar = this.LL;
            if (tuxNavBar != null) {
                tuxNavBar.LJIJJ(c1250250idj);
            }
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJJI(int i) {
        TuxNavBar tuxNavBar = this.LL;
        if (tuxNavBar != null) {
            tuxNavBar.setNavBackground(i);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJJJ(boolean z) {
        View viewLJII = null;
        if (z) {
            TuxNavBar tuxNavBar = this.LL;
            if (tuxNavBar != null) {
                viewLJII = tuxNavBar.LJII(this.LLILZ);
            }
            C12ES.LJIILL(0, viewLJII);
            return;
        }
        TuxNavBar tuxNavBar2 = this.LL;
        if (tuxNavBar2 != null) {
            viewLJII = tuxNavBar2.LJII(this.LLILZ);
        }
        C12ES.LJIILL(8, viewLJII);
    }

    @Override // X.AbstractC1893000zMQ, X.InterfaceC1892990zMP
    public final void LJJLIIIJ(boolean z) {
        if (z) {
            C12ES.LJIILL(0, this.LL);
        } else {
            C12ES.LJIILL(8, this.LL);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void setBackClickListener(View.OnClickListener onClickListener) {
        View viewLJII;
        TuxNavBar tuxNavBar = this.LL;
        if (tuxNavBar != null && (viewLJII = tuxNavBar.LJII(this.LLILLL)) != null) {
            C786410Ut5.I7(onClickListener, viewLJII);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void setCloseAllClickListener(View.OnClickListener onClickListener) {
        View viewLJII;
        TuxNavBar tuxNavBar = this.LL;
        if (tuxNavBar != null && (viewLJII = tuxNavBar.LJII(this.LLILZ)) != null) {
            C786410Ut5.I7(new ACListenerS119S0200000_16(onClickListener, this, 44), viewLJII);
        }
    }

    @Override // X.AbstractC1893000zMQ, X.InterfaceC1892990zMP
    public final void setSubTitle(String str) {
        if (this.LLJ == null) {
            this.LLJ = new C1250250idj();
        }
        C1250250idj c1250250idj = this.LLJ;
        if (c1250250idj != null) {
            c1250250idj.LIZLLL = str;
            TuxNavBar tuxNavBar = this.LL;
            if (tuxNavBar != null) {
                tuxNavBar.LJIJJ(c1250250idj);
            }
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void setTitle(String str) {
        if (this.LLJ == null) {
            this.LLJ = new C1250250idj();
        }
        C1250250idj c1250250idj = this.LLJ;
        if (c1250250idj != null) {
            c1250250idj.LIZJ = str;
            TuxNavBar tuxNavBar = this.LL;
            if (tuxNavBar != null) {
                tuxNavBar.LJIJJ(c1250250idj);
            }
        }
    }
}
