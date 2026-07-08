package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.graphics.PointF;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.EfficiencyComponents;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS81S0100100_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cYM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1016280cYM implements InterfaceC1007910cKr {
    public final Aweme LIZ;
    public ViewGroup LIZIZ;
    public Context LIZJ;
    public final C01GW LIZLLL;
    public SparkContext LJ;
    public InterfaceC1016290cYN LJFF;
    public InterfaceC1016300cYO LJI;
    public C1009340cNA LJII;
    public IAnoleManager LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;

    public C1016280cYM() {
        this(null);
    }

    @Override // X.InterfaceC1007910cKr
    public final void LJJLIIJ() {
    }

    @Override // X.InterfaceC1007910cKr
    public final long LJJLIL() {
        return 0L;
    }

    @Override // X.InterfaceC1007910cKr
    public final int LLJILLL() {
        return 0;
    }

    @Override // X.InterfaceC1007910cKr
    public final void LLJJIII(String str, View.OnLayoutChangeListener onLayoutChangeListener) {
    }

    @Override // X.InterfaceC1007910cKr
    public final C1014410cVL LLJJIJI(String str) {
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final C1014390cVJ LLJJIJIIJIL() {
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final void P() {
    }

    @Override // X.InterfaceC1007910cKr
    public final void U2() {
    }

    @Override // X.InterfaceC1007910cKr
    public final JSONObject V2() {
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final void X2(String str, ViewOnLayoutChangeListenerC1014330cVD viewOnLayoutChangeListenerC1014330cVD) {
    }

    @Override // X.InterfaceC1007910cKr
    public final HashMap<String, Object> Z2() {
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final boolean a3(String str, Runnable runnable, int i) {
        return true;
    }

    @Override // X.InterfaceC1007910cKr
    public final ViewGroup b3() {
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final boolean d3() {
        return true;
    }

    @Override // X.InterfaceC1007910cKr
    public final boolean e3() {
        return false;
    }

    @Override // X.InterfaceC1007910cKr
    public final void f3(long j, String str, String str2, AwS81S0100100_16 awS81S0100100_16) {
    }

    @Override // X.InterfaceC1007910cKr
    public final void g3(int i) {
    }

    @Override // X.InterfaceC1007910cKr
    public final boolean h3(String str, InterfaceC1007930cKt interfaceC1007930cKt, AnoleComponentAppearModel anoleComponentAppearModel) {
        return true;
    }

    @Override // X.InterfaceC1007910cKr
    public final Integer i3() {
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final void o0() {
    }

    @Override // X.InterfaceC1007910cKr
    public final void pauseVideo() {
    }

    @Override // X.InterfaceC1007910cKr
    public final long r1() {
        return 0L;
    }

    @Override // X.InterfaceC1007910cKr
    public final C1014390cVJ Y2() {
        if (this.LIZIZ != null) {
            return new C1014390cVJ(new C1009390cNF(r6.getWidth(), r6.getHeight()), new PointF(r6.getWidth() / 2, r6.getHeight() / 2));
        }
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final C1008080cL8 c3() {
        Aweme aweme;
        Context context = this.LIZJ;
        if (context == null || (aweme = this.LIZ) == null) {
            return null;
        }
        return ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJIIZI(context, aweme, C1014230cV3.LIZ("iab_efficiency"));
    }

    public final void LIZLLL() {
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("ai_banner_post_show_enable_setting", true)) {
            LJFF();
        } else {
            SettingsManager.LIZLLL().getClass();
            C786410Ut5.LJLIIL(SettingsManager.LJFF("ai_banner_post_show_time_setting", 500L), new BPEAHandler(Looper.getMainLooper()), new ARunnableS116S0100000_16(this, 252));
        }
    }

    public final void LJFF() {
        ViewGroup viewGroup;
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("ai_banner_show_enable_setting", true) || this.LJIIIZ || (viewGroup = this.LIZIZ) == null || !viewGroup.isAttachedToWindow()) {
            return;
        }
        if (C255750A0n.LIZ()) {
            SparkContext sparkContext = this.LJ;
            InterfaceC1016290cYN interfaceC1016290cYN = sparkContext != null ? (InterfaceC1016290cYN) sparkContext.LJFF(InterfaceC1016290cYN.class) : null;
            this.LJFF = interfaceC1016290cYN;
            if (interfaceC1016290cYN != null) {
                interfaceC1016290cYN.LIZIZ();
                return;
            }
            return;
        }
        SparkContext sparkContext2 = this.LJ;
        InterfaceC1016300cYO interfaceC1016300cYO = sparkContext2 != null ? (InterfaceC1016300cYO) sparkContext2.LJFF(InterfaceC1016300cYO.class) : null;
        this.LJI = interfaceC1016300cYO;
        if (interfaceC1016300cYO != null) {
            interfaceC1016300cYO.LIZIZ();
        }
    }

    public C1016280cYM(Aweme aweme) {
        this.LIZ = aweme;
        this.LIZLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(525));
    }

    public static void LJ(C1016280cYM c1016280cYM) {
        boolean z;
        Boolean boolValueOf;
        Integer numValueOf;
        c1016280cYM.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show enter: hadMount=");
        sbLIZ.append(c1016280cYM.LJIIIZ);
        sbLIZ.append(" hasManager=");
        if (c1016280cYM.LJIIIIZZ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" containerAttached=");
        ViewGroup viewGroup = c1016280cYM.LIZIZ;
        if (viewGroup != null) {
            boolValueOf = Boolean.valueOf(viewGroup.isAttachedToWindow());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(" containerVisibility=");
        ViewGroup viewGroup2 = c1016280cYM.LIZIZ;
        if (viewGroup2 != null) {
            numValueOf = Integer.valueOf(viewGroup2.getVisibility());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!c1016280cYM.LJIIIZ) {
            IAnoleManager iAnoleManager = c1016280cYM.LJIIIIZZ;
            if (iAnoleManager != null) {
                iAnoleManager.mount(c1016280cYM.LIZIZ, "tt_iab_bottom_navigation_bar", null);
            }
            IAnoleManager iAnoleManager2 = c1016280cYM.LJIIIIZZ;
            if (iAnoleManager2 != null) {
                iAnoleManager2.LIZJ();
            }
            IAnoleManager iAnoleManager3 = c1016280cYM.LJIIIIZZ;
            if (iAnoleManager3 != null) {
                iAnoleManager3.LJIJI("tt_iab_bottom_navigation_bar");
            }
            c1016280cYM.LJIIIZ = true;
        }
    }

    public final boolean LIZ(View view) throws JSONException {
        String creativeIdStr;
        AwemeRawAd awemeRawAd;
        if (view == null) {
            return false;
        }
        if (view instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
            if (view.getLayoutParams().height == 0) {
                InterfaceC1016290cYN interfaceC1016290cYN = this.LJFF;
                if (interfaceC1016290cYN != null) {
                    interfaceC1016290cYN.LIZJ();
                }
                JSONObject jSONObject = new JSONObject();
                Aweme aweme = this.LIZ;
                if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                    creativeIdStr = awemeRawAd.getCreativeIdStr();
                } else {
                    creativeIdStr = null;
                }
                jSONObject.put("cid", creativeIdStr);
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C323501Nh(jSONObject, null), 2);
            }
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (LIZ(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C1035880d3y r10) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1016280cYM.LIZJ(X.0d3y):void");
    }

    @Override // X.InterfaceC1007910cKr
    public final C1009390cNF W2(String str) {
        return C1008220cLM.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1007910cKr
    public final void LIZIZ(AbstractC991850bux abstractC991850bux, InterfaceC1007930cKt interfaceC1007930cKt) {
        C1035880d3y c1035880d3y;
        EfficiencyComponents efficiencyComponents;
        Integer num;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleEvent ");
        sbLIZ.append(abstractC991850bux);
        C2188811AlT.LIZIZ(sbLIZ);
        if (abstractC991850bux instanceof C989580brI) {
            T t = ((C989580brI) abstractC991850bux).LIZ;
            if (t instanceof C1009000cMc) {
                C1009000cMc c1009000cMc = (C1009000cMc) t;
                if (Intrinsics.LJFF(c1009000cMc.LIZJ, "close")) {
                    if (C255750A0n.LIZ()) {
                        InterfaceC1016290cYN interfaceC1016290cYN = this.LJFF;
                        if (interfaceC1016290cYN != null) {
                            interfaceC1016290cYN.LIZ();
                            return;
                        }
                        return;
                    }
                    InterfaceC1016300cYO interfaceC1016300cYO = this.LJI;
                    if (interfaceC1016300cYO == null) {
                        return;
                    }
                    interfaceC1016300cYO.LIZ();
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("unHandle Anole common JSB payload=");
                sbLIZ2.append(c1009000cMc);
                C2188811AlT.LIZIZ(sbLIZ2);
                return;
            }
            return;
        }
        if (!(abstractC991850bux instanceof C991870buz)) {
            return;
        }
        try {
            SparkContext sparkContext = this.LJ;
            if (sparkContext == null || (c1035880d3y = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class)) == null || (efficiencyComponents = c1035880d3y.getEfficiencyComponents()) == null || (num = efficiencyComponents.componentType) == null || num.intValue() != 1 || !C255750A0n.LIZ()) {
                return;
            }
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("ai_banner_show_check_setting", true)) {
                return;
            }
            LIZ(this.LIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }
}
