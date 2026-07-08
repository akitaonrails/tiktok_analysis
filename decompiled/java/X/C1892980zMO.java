package X;

import Y.ACListenerS130S0200000_28;
import Y.ACListenerS162S0100000_28;
import Y.AObserverS230S0100000_28;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.poi.thirdparty.provider.viewmodel.PoiThirdPartyViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zMO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1892980zMO extends AbstractC1893000zMQ {
    public static final /* synthetic */ int LLJI = 0;
    public final Context LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public SparkContext LLILZIL;
    public PoiThirdPartyViewModel LLILZLL;
    public TuxNavBar LLIZ;
    public final C1250250idj LLIZLLLIL = new C1250250idj();
    public EnumC1892960zMM LLJ;

    @Override // X.InterfaceC1892990zMP
    public final void LJIILL(int i) {
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJJJ(boolean z) {
    }

    @Override // X.InterfaceC1892990zMP
    public final void setBackClickListener(View.OnClickListener onClickListener) {
    }

    @Override // X.AbstractC1893000zMQ
    public final void LIZ(SparkContext sparkContext) {
        PoiThirdPartyViewModel poiThirdPartyViewModel;
        MutableLiveData mutableLiveData;
        this.LLILZIL = sparkContext;
        SparkActivity sparkActivityLIZ = C1893200zMk.LIZ(sparkContext);
        PoiThirdPartyViewModel poiThirdPartyViewModel2 = null;
        if ((sparkActivityLIZ instanceof C19EG) && sparkActivityLIZ != null) {
            poiThirdPartyViewModel2 = (PoiThirdPartyViewModel) ViewModelProviders.of(sparkActivityLIZ).get(PoiThirdPartyViewModel.class);
        }
        this.LLILZLL = poiThirdPartyViewModel2;
        SparkActivity sparkActivityLIZ2 = C1893200zMk.LIZ(sparkContext);
        if (sparkActivityLIZ2 != null && (poiThirdPartyViewModel = this.LLILZLL) != null && (mutableLiveData = poiThirdPartyViewModel.LLILLJJLI) != null) {
            mutableLiveData.observe(sparkActivityLIZ2, new AObserverS230S0100000_28(this, 0));
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final View LJFF(Context context) {
        String str;
        SparkActivity sparkActivityLIZ;
        LinearLayout linearLayout = new LinearLayout(this.LL);
        linearLayout.setOrientation(1);
        C786410Ut5.d6(linearLayout, new ViewGroup.LayoutParams(-1, -2));
        TuxNavBar tuxNavBar = new TuxNavBar(this.LL, null, 6);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_x_mark;
        Integer numValueOf = Integer.valueOf(R.attr.a1h);
        c419910GdJ.LJ = numValueOf;
        c1251150ifB.LIZLLL();
        c1251150ifB.LJ = c419910GdJ;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZIZ = "close_all_btn";
        c1251150ifB.LJI = true;
        c0om1.LJ(c1251150ifB);
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_ellipsis_horizontal;
        c419910GdJ2.LJ = numValueOf;
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LJ = c419910GdJ2;
        c1251150ifB2.LIZLLL = true;
        c1251150ifB2.LIZIZ = "more_btn";
        c1251150ifB2.LJI = false;
        c0om1.LIZIZ(c1251150ifB2);
        c0om1.LIZJ = this.LLIZLLLIL;
        tuxNavBar.setNavActions(c0om1);
        C786410Ut5.S6(tuxNavBar, new LinearLayout.LayoutParams(-1, -2));
        this.LLIZ = tuxNavBar;
        View view = new View(this.LL);
        C786410Ut5.W5(view, new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)))));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ng, this.LL);
        if (numLIZJ != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
        linearLayout.addView(this.LLIZ);
        linearLayout.addView(view);
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_enable_iab_banner", true) == 1 && (str = this.LLILLJJLI) != null && str.length() != 0) {
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(UriProtector.parse(this.LLILLJJLI).buildUpon().appendQueryParameter("mob_extra", this.LLILLL).toString());
            sparkContext.lifecycleOwner = C1893200zMk.LIZ(sparkContext);
            SparkActivity sparkActivityLIZ2 = C1893200zMk.LIZ(sparkContext);
            if (sparkActivityLIZ2 != null) {
                sparkContext.LJJ(Activity.class, sparkActivityLIZ2);
            }
            SparkContext sparkContext2 = this.LLILZIL;
            if (sparkContext2 != null && (sparkActivityLIZ = C1893200zMk.LIZ(sparkContext2)) != null) {
                C1541950qED.LIZJ.getClass();
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(sparkActivityLIZ, sparkContext).LIZ(false);
                C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, new LinearLayout.LayoutParams(-1, -2));
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ != null) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
                    linearLayout.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ);
                }
            }
        }
        return linearLayout;
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJIFFI(EnumC1067700dtI enumC1067700dtI) {
        View viewLJII;
        int i = C1892950zML.LIZ[enumC1067700dtI.ordinal()];
        View viewLJII2 = null;
        if (i != 1) {
            if (i != 2) {
                TuxNavBar tuxNavBar = this.LLIZ;
                if (tuxNavBar != null) {
                    viewLJII2 = tuxNavBar.LJII("more_btn");
                }
                C12ES.LJIILL(0, viewLJII2);
            } else {
                TuxNavBar tuxNavBar2 = this.LLIZ;
                if (tuxNavBar2 != null) {
                    viewLJII2 = tuxNavBar2.LJII("more_btn");
                }
                C12ES.LJIILL(0, viewLJII2);
            }
        } else {
            TuxNavBar tuxNavBar3 = this.LLIZ;
            if (tuxNavBar3 != null) {
                viewLJII2 = tuxNavBar3.LJII("more_btn");
            }
            C12ES.LJIILL(8, viewLJII2);
        }
        TuxNavBar tuxNavBar4 = this.LLIZ;
        if (tuxNavBar4 != null && (viewLJII = tuxNavBar4.LJII("more_btn")) != null) {
            C786410Ut5.I7(new ACListenerS162S0100000_28(this, 9), viewLJII);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJJI(int i) {
        TuxNavBar tuxNavBar = this.LLIZ;
        if (tuxNavBar != null) {
            tuxNavBar.setNavBackground(i);
        }
    }

    @Override // X.AbstractC1893000zMQ, X.InterfaceC1892990zMP
    public final void LJJLIIIJ(boolean z) {
        if (z) {
            C12ES.LJIILL(0, this.LLIZ);
        } else {
            C12ES.LJIILL(8, this.LLIZ);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void setCloseAllClickListener(View.OnClickListener onClickListener) {
        View viewLJII;
        TuxNavBar tuxNavBar = this.LLIZ;
        if (tuxNavBar != null && (viewLJII = tuxNavBar.LJII("close_all_btn")) != null) {
            C786410Ut5.I7(new ACListenerS130S0200000_28(this, onClickListener, 2), viewLJII);
        }
    }

    @Override // X.AbstractC1893000zMQ, X.InterfaceC1892990zMP
    public final void setSubTitle(String str) {
        Object obj;
        PoiThirdPartyViewModel poiThirdPartyViewModel = this.LLILZLL;
        if (poiThirdPartyViewModel != null) {
            poiThirdPartyViewModel.LLILLL.setValue(str);
        }
        C1250250idj c1250250idj = this.LLIZLLLIL;
        c1250250idj.LIZLLL = str;
        TuxNavBar tuxNavBar = this.LLIZ;
        if (tuxNavBar != null) {
            tuxNavBar.LJIJJ(c1250250idj);
        }
        try {
            String host = UriProtector.parse(str).getHost();
            String str2 = str;
            if (host != null) {
                str2 = host;
            }
            C189200o6.m2constructorimpl(str2);
            obj = str2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
        Object obj2 = obj;
        if (zM7isFailureimpl) {
            obj2 = null;
        }
        String str3 = (String) obj2;
        if (str3 == null) {
            str3 = "";
        }
        if (str3.length() > 0) {
            str3 = C20642515q3.LJI(2131847179) + str3;
        }
        TuxNavBar tuxNavBar2 = this.LLIZ;
        if (tuxNavBar2 != null) {
            C1250250idj c1250250idj2 = this.LLIZLLLIL;
            c1250250idj2.LIZLLL = str3;
            tuxNavBar2.LJIJJ(c1250250idj2);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void setTitle(String str) {
        C1892770zM3.LIZ.getClass();
        C1250250idj c1250250idj = this.LLIZLLLIL;
        c1250250idj.LIZJ = str;
        TuxNavBar tuxNavBar = this.LLIZ;
        if (tuxNavBar != null) {
            tuxNavBar.LJIJJ(c1250250idj);
        }
    }

    public C1892980zMO(Context context, String str, String str2, String str3) {
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }
}
