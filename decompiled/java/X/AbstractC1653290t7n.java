package X;

import Y.ARunnableS125S0100000_25;
import Y.ARunnableS27S0400000_19;
import a6n.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import bfk.b0;
import com.bytedance.als.h0;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastHostUseTTLHVE;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.google.gson.h;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.protection.TooltipProtectionSetting;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.gamora.celebration.PreloadConfig;
import com.ss.android.ugc.gamora.celebration.TabStyleConfig;
import com.ss.android.ugc.gamora.recorder.bottom.IBottomTabChangeService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS19S2300000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: renamed from: X.0t7n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1653290t7n {
    public static final /* synthetic */ int LJIIZILJ = 0;
    public final Object LIZ;
    public final boolean LIZIZ;
    public final InterfaceC497601wk LIZJ;
    public h0<C1647390syH> LJ;
    public C560530Lyd<String> LJFF;
    public C1653300t7o LJI;
    public TabHost LJII;
    public ShortVideoContext LJIIIIZZ;
    public InterfaceC1653420t80 LJIIIZ;
    public C1653330t7r LJIIL;
    public C1DFK LJIILIIL;
    public AnonymousClass0956 LJIILJJIL;
    public boolean LJIILLIIL;
    public final List<C1653090t7T> LIZLLL = new ArrayList();
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 524));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 521));
    public Boolean LJIILL = Boolean.FALSE;

    public void LJIIJ(AbstractC1653180t7c abstractC1653180t7c, AbstractC1653180t7c abstractC1653180t7c2) {
    }

    public final C1653330t7r LJFF() {
        List<C1653090t7T> list = this.LIZLLL;
        TabHost tabHost = this.LJII;
        if (tabHost == null) {
            tabHost = null;
        }
        C1653090t7T c1653090t7T = (C1653090t7T) C13LP.LJJJLZIJ(tabHost.getCurrentIndex(), list);
        if (c1653090t7T != null) {
            return c1653090t7T.LIZ;
        }
        return null;
    }

    public final String LJI() {
        String str;
        TabHost tabHost = this.LJII;
        if (tabHost == null) {
            return "";
        }
        Object objLIZ = tabHost.LIZ(tabHost.getCurrentIndex());
        return (!(objLIZ instanceof String) || (str = (String) objLIZ) == null) ? "" : str;
    }

    public final C1653620t8K LJII() {
        return (C1653620t8K) this.LJIIJJI.getValue();
    }

    public final void LJIILL() {
        b0 b0Var;
        C1653300t7o c1653300t7o = this.LJI;
        if (c1653300t7o == null) {
            c1653300t7o = null;
        }
        c1653300t7o.getClass();
        if (TooltipProtectionSetting.INSTANCE.isKillSwitchDisabled()) {
            if (c1653300t7o.LIZIZ()) {
                return;
            }
            final C1217020hm8 c1217020hm8 = new C1217020hm8(new WeakReference(c1653300t7o.LJ));
            b0 b0Var2 = c1653300t7o.LJ;
            final WeakReference weakReference = new WeakReference(b0Var2 != null ? b0Var2.getContext() : null);
            AbstractC1593880rZy abstractC1593880rZy = new AbstractC1593880rZy(c1217020hm8, weakReference) { // from class: X.0hlK
                public final C1217020hm8 LJ;
                public final WeakReference<Context> LJFF;

                @Override // X.InterfaceC1590940rVE
                public final boolean LIZIZ() {
                    return true;
                }

                @Override // X.InterfaceC1590940rVE
                public final void LIZ() {
                    C20684815ws.LJIILLIIL("tooltip_protection_check", LIZLLL("2001").LIZ);
                }

                @Override // X.InterfaceC1590940rVE
                public final void q0(Function0<Unit> function0) {
                    View view;
                    Context context;
                    WeakReference<View> weakReference2 = this.LJ.LIZ;
                    if (weakReference2 != null && (view = weakReference2.get()) != null && (context = this.LJFF.get()) != null) {
                        HandlerHook.viewPost(view, new ARunnableS27S0400000_19(this, context, view, function0, 4));
                    }
                }

                {
                    super(c1217020hm8, weakReference);
                    this.LJ = c1217020hm8;
                    this.LJFF = weakReference;
                }
            };
            if (abstractC1593880rZy.shouldShow()) {
                abstractC1593880rZy.q0(new AwS569S0100000_25(c1653300t7o, 302));
                return;
            }
            return;
        }
        if (c1653300t7o.LIZIZ() || c1653300t7o.LIZLLL != null || (b0Var = c1653300t7o.LJ) == null) {
            return;
        }
        C1653450t83 c1653450t83 = c1653300t7o.LIZJ;
        c1653450t83.getClass();
        String currentUserID = o.LJIIZILJ.getCurrentUserID();
        Keva keva = c1653450t83.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_live_tab_pop_up_show");
        sbLIZ.append(currentUserID);
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        C450720Hlu c450720Hlu = new C450720Hlu(b0Var.getContext());
        c450720Hlu.LJIIJ(2131836717);
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LJII = 3000L;
        c1391600mJi.LIZIZ = b0Var;
        c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
        c1653300t7o.LIZLLL = c450720Hlu.LIZIZ();
        HandlerHook.viewPostDelay(b0Var, new ARunnableS125S0100000_25(c1653300t7o, 36), 100L);
    }

    public final void LIZJ(boolean z) {
        TabHost tabHost = this.LJII;
        if (tabHost == null) {
            tabHost = null;
        }
        tabHost.setUISwitchEnabled(z);
    }

    public final C1653090t7T LIZLLL(String str) {
        C1653090t7T c1653090t7T = null;
        if (this.LJII == null || str == null) {
            return null;
        }
        Iterator<C1653090t7T> it2 = this.LIZLLL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C1653090t7T next = it2.next();
            if (Intrinsics.LJFF(next.LIZ.LIZIZ, str)) {
                c1653090t7T = next;
                break;
            }
        }
        return c1653090t7T;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [X.0t7x] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, X.0t7T] */
    public final void LJIIIIZZ(C1647390syH c1647390syH) {
        String str;
        String str2;
        String str3;
        AbstractC1653180t7c abstractC1653180t7c;
        C1653090t7T c1653090t7T;
        AbstractC1653180t7c abstractC1653180t7c2;
        Scene sceneLIZ;
        LifecycleCoroutineScope lifecycleScope;
        AbstractC1653180t7c abstractC1653180t7c3;
        AbstractC1653180t7c abstractC1653180t7c4;
        Boolean boolValueOf;
        C1646490swp c1646490swp = new C1646490swp(c1647390syH.LJII);
        Object obj = c1647390syH.LIZIZ;
        AbstractC1653180t7c abstractC1653180t7c5 = null;
        anonymousClass0956LIZLLL = null;
        anonymousClass0956LIZLLL = null;
        anonymousClass0956LIZLLL = null;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        c1646490swp.LJ = str;
        c1646490swp.LIZLLL = c1647390syH.LJ;
        List<C1653090t7T> list = this.LIZLLL;
        C259800zU c259800zU = new C259800zU();
        C259800zU c259800zU2 = new C259800zU();
        for (?? r8 : (ArrayList) list) {
            InterfaceC1653360t7u interfaceC1653360t7u = r8.LIZ.LJ;
            if (interfaceC1653360t7u != null) {
                Object obj2 = c1647390syH.LIZIZ;
                Object obj3 = c1647390syH.LIZ;
                C1653300t7o c1653300t7o = this.LJI;
                if (c1653300t7o == null) {
                    c1653300t7o = null;
                }
                interfaceC1653360t7u.onTabChanged(obj2, obj3, c1653300t7o);
            }
            C1653330t7r c1653330t7r = r8.LIZ;
            if (TextUtils.equals((CharSequence) c1647390syH.LIZ, c1653330t7r.LIZIZ) && c1647390syH.LIZJ != 6) {
                c259800zU.element = r8;
                C1653330t7r c1653330t7r2 = r8.LIZ;
                r8.LIZJ.setValue(Boolean.FALSE);
                InterfaceC1653360t7u interfaceC1653360t7u2 = c1653330t7r2.LJ;
                if (interfaceC1653360t7u2 != null) {
                    interfaceC1653360t7u2.onTabUnselected(c1653330t7r2, c1646490swp);
                }
            }
            if (TextUtils.equals((CharSequence) c1647390syH.LIZIZ, c1653330t7r.LIZIZ)) {
                c259800zU2.element = r8;
                C1653330t7r c1653330t7r3 = r8.LIZ;
                this.LJIIL = c1653330t7r3;
                r8.LIZJ.setValue(Boolean.TRUE);
                if (c1653330t7r3.LJ != null) {
                    if (Intrinsics.LJFF(c1653330t7r3.LIZIZ, "record_mode_mv")) {
                        c1646490swp.LIZIZ = false;
                    }
                    c1646490swp.LIZLLL = c1647390syH.LJ;
                    c1646490swp.LIZJ = c1647390syH;
                    c1653330t7r3.LJ.onTabSelected(c1653330t7r3, c1646490swp);
                }
            }
        }
        Object obj4 = c1647390syH.LIZ;
        if (obj4 instanceof String) {
            str2 = (String) obj4;
        } else {
            str2 = null;
        }
        Object obj5 = c1647390syH.LIZIZ;
        if (obj5 instanceof String) {
            str3 = (String) obj5;
        } else {
            str3 = null;
        }
        if (str2 != null) {
            C1653300t7o c1653300t7o2 = this.LJI;
            if (c1653300t7o2 == null) {
                c1653300t7o2 = null;
            }
            int iLIZJ = c1653300t7o2.LIZJ(str2);
            TabHost tabHost = this.LJII;
            if (tabHost == null) {
                tabHost = null;
            }
            b0 b0VarLJ = LJ(tabHost, iLIZJ);
            if (b0VarLJ != null) {
                LJII().getClass();
                C1653620t8K.LIZLLL(b0VarLJ, false);
            }
        }
        if (str3 != null) {
            C1653300t7o c1653300t7o3 = this.LJI;
            if (c1653300t7o3 == null) {
                c1653300t7o3 = null;
            }
            int iLIZJ2 = c1653300t7o3.LIZJ(str3);
            TabHost tabHost2 = this.LJII;
            if (tabHost2 == null) {
                tabHost2 = null;
            }
            b0 b0VarLJ2 = LJ(tabHost2, iLIZJ2);
            if (b0VarLJ2 != null) {
                LJII().getClass();
                C1653620t8K.LIZLLL(b0VarLJ2, true);
            }
        }
        if (LiveBroadcastHostUseTTLHVE.getEnable()) {
            C1653090t7T c1653090t7T2 = (C1653090t7T) c259800zU2.element;
            if (c1653090t7T2 != null) {
                abstractC1653180t7c4 = c1653090t7T2.LIZIZ;
            } else {
                abstractC1653180t7c4 = 0;
            }
            if (!Intrinsics.LJFF(this.LJIILL, Boolean.TRUE)) {
                if (abstractC1653180t7c4 != 0) {
                    boolValueOf = Boolean.valueOf(abstractC1653180t7c4.LLLLIILL(new InterfaceC1655140tAm() { // from class: X.0t7x
                        @Override // X.InterfaceC1655140tAm
                        public final void LIZ() {
                            this.LIZ.LJIILLIIL = true;
                        }

                        @Override // X.InterfaceC1655140tAm
                        public final void LIZIZ() {
                            AbstractC1653290t7n abstractC1653290t7n = this.LIZ;
                            abstractC1653290t7n.LJIILLIIL = false;
                            C1DFK c1dfk = abstractC1653290t7n.LJIILIIL;
                            if (c1dfk != null) {
                                c1dfk.LJFF();
                            }
                        }
                    }));
                } else {
                    boolValueOf = null;
                }
                this.LJIILL = boolValueOf;
            }
            C1DFK c1dfk = this.LJIILIIL;
            if (c1dfk != null) {
                c1dfk.LIZIZ(null);
            }
            this.LJIILIIL = null;
            AnonymousClass0956 anonymousClass0956 = this.LJIILJJIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LJIILJJIL = null;
        }
        if (LiveBroadcastHostUseTTLHVE.getEnable() && (((c1653090t7T = (C1653090t7T) c259800zU2.element) == null || (abstractC1653180t7c3 = c1653090t7T.LIZIZ) == null || !abstractC1653180t7c3.LLLLIIIILLL()) && this.LJIILLIIL)) {
            C1DFK c1dfkLIZ = C23118094a.LIZ();
            this.LJIILIIL = c1dfkLIZ;
            c1dfkLIZ.start();
            C1653090t7T c1653090t7T3 = (C1653090t7T) c259800zU.element;
            if (c1653090t7T3 != null && (abstractC1653180t7c2 = c1653090t7T3.LIZIZ) != null && (sceneLIZ = C565530MFz.LIZ(abstractC1653180t7c2)) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(sceneLIZ)) != null) {
                C1DFH c1dfh = C0PEM.LIZ;
                anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C592460NLo(this, c259800zU, c259800zU2, null), 2);
            }
            this.LJIILJJIL = anonymousClass0956LIZLLL;
            return;
        }
        C1653090t7T c1653090t7T4 = (C1653090t7T) c259800zU.element;
        if (c1653090t7T4 != null) {
            abstractC1653180t7c = c1653090t7T4.LIZIZ;
        } else {
            abstractC1653180t7c = null;
        }
        C1653090t7T c1653090t7T5 = (C1653090t7T) c259800zU2.element;
        if (c1653090t7T5 != null) {
            abstractC1653180t7c5 = c1653090t7T5.LIZIZ;
        }
        LJIIJ(abstractC1653180t7c, abstractC1653180t7c5);
    }

    public final void LJIIL(String str) {
        C1653300t7o c1653300t7o = this.LJI;
        TabHost tabHost = null;
        if (c1653300t7o == null) {
            c1653300t7o = null;
        }
        if (c1653300t7o.LIZIZ.getChildAt(c1653300t7o.LIZJ(str)) != null) {
            C0GUE c0gue = c1653300t7o.LIZIZ;
            int iLIZJ = c1653300t7o.LIZJ(str);
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c0gue, null);
            c0gue.removeViewAt(iLIZJ);
        }
        TabHost tabHost2 = this.LJII;
        if (tabHost2 != null) {
            tabHost = tabHost2;
        }
        tabHost.requestLayout();
    }

    public final void LJIILJJIL(C1653090t7T c1653090t7T) {
        C201955140j.LIZ("BottomTabPresenter dispatchEvent BottomTabIndexChangeEvent");
        String str = c1653090t7T.LIZ.LIZIZ;
        boolean z = this.LIZIZ;
        Object obj = this.LIZ;
        if (obj == null) {
            obj = str;
        }
        ShortVideoContext shortVideoContext = this.LJIIIIZZ;
        h0<C1647390syH> h0Var = null;
        if (shortVideoContext == null) {
            shortVideoContext = null;
        }
        C1647390syH c1647390syH = new C1647390syH(null, str, 0, false, !C1443960ngA.LJIIIZ(shortVideoContext), z, obj, true, false, 264);
        LJIIIIZZ(c1647390syH);
        h0<C1647390syH> h0Var2 = this.LJ;
        if (h0Var2 == null) {
            h0Var2 = null;
        }
        h0Var2.LJII(c1647390syH);
        IBottomTabChangeService iBottomTabChangeService = (IBottomTabChangeService) PluggableExtentionKt.pluggableSpi$default(IBottomTabChangeService.class, false, false, false, 14, null);
        if (iBottomTabChangeService != null) {
            h0<C1647390syH> h0Var3 = this.LJ;
            if (h0Var3 != null) {
                h0Var = h0Var3;
            }
            iBottomTabChangeService.LIZLLL(h0Var.LIZJ().LIZIZ);
        }
    }

    public static b0 LJ(TabHost tabHost, int i) {
        ViewGroup viewGroup = (ViewGroup) tabHost.findViewById(R.id.eqx);
        if (viewGroup == null) {
            return null;
        }
        View childAt = viewGroup.getChildAt(i);
        if (!(childAt instanceof b0)) {
            return null;
        }
        return (b0) childAt;
    }

    public final void LIZIZ(int i, C1653090t7T c1653090t7T) {
        C1653330t7r c1653330t7r = c1653090t7T.LIZ;
        CharSequence charSequence = c1653330t7r.LIZ;
        String str = c1653330t7r.LIZIZ;
        C1653300t7o c1653300t7o = this.LJI;
        TabHost tabHost = null;
        if (c1653300t7o == null) {
            c1653300t7o = null;
        }
        c1653300t7o.LIZ(i, charSequence, str, c1653330t7r.LJIIIZ, c1653330t7r.LJFF, false, null);
        TabHost tabHost2 = this.LJII;
        if (tabHost2 != null) {
            tabHost = tabHost2;
        }
        tabHost.requestLayout();
    }

    public final void LJIIJJI(ShortVideoContext shortVideoContext, TabHost tabHost) {
        PreloadConfig next;
        Bitmap bitmapDecodeFile;
        Object c098200Yq;
        ShortVideoContext shortVideoContext2 = shortVideoContext;
        TabHost tabHost2 = tabHost;
        this.LJIIIIZZ = shortVideoContext2;
        this.LJII = tabHost2;
        if (tabHost2 == null) {
            tabHost2 = null;
        }
        if (shortVideoContext2 == null) {
            shortVideoContext2 = null;
        }
        C1653300t7o c1653300t7o = new C1653300t7o(shortVideoContext2, tabHost2);
        List<C1653090t7T> list = this.LIZLLL;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (((C1653090t7T) obj).LIZ.LIZ.length() > 0) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C1653330t7r c1653330t7r = ((C1653090t7T) it2.next()).LIZ;
            c1653300t7o.LIZ(-1, c1653330t7r.LIZ, c1653330t7r.LIZIZ, c1653330t7r.LJIIIZ, c1653330t7r.LJFF, c1653330t7r.LJI, c1653330t7r.LJII);
        }
        this.LJI = c1653300t7o;
        Iterator it3 = ((ArrayList) this.LIZLLL).iterator();
        while (it3.hasNext()) {
            C1653330t7r c1653330t7r2 = ((C1653090t7T) it3.next()).LIZ;
            if (c1653330t7r2.LJIIIIZZ.isEmpty()) {
                InterfaceC1653360t7u interfaceC1653360t7u = c1653330t7r2.LJ;
                if (interfaceC1653360t7u != null) {
                    interfaceC1653360t7u.onCelebrationStyleApplied(null);
                }
            } else {
                Iterator<PreloadConfig> it4 = c1653330t7r2.LJIIIIZZ.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next = it4.next();
                        PreloadConfig preloadConfig = next;
                        if (preloadConfig.tab_style != null && preloadConfig.LIZ != null) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                PreloadConfig preloadConfig2 = next;
                if (preloadConfig2 != null) {
                    TabStyleConfig tabStyleConfig = preloadConfig2.tab_style;
                    String str = preloadConfig2.LIZ;
                    if (tabStyleConfig != null && str != null) {
                        C1653300t7o c1653300t7o2 = this.LJI;
                        if (c1653300t7o2 == null) {
                            c1653300t7o2 = null;
                        }
                        int iLIZJ = c1653300t7o2.LIZJ(c1653330t7r2.LIZIZ);
                        if (iLIZJ < 0) {
                            InterfaceC1653360t7u interfaceC1653360t7u2 = c1653330t7r2.LJ;
                            if (interfaceC1653360t7u2 != null) {
                                interfaceC1653360t7u2.onCelebrationStyleApplied(null);
                            }
                        } else {
                            TabHost tabHost3 = this.LJII;
                            if (tabHost3 == null) {
                                tabHost3 = null;
                            }
                            b0 b0VarLJ = LJ(tabHost3, iLIZJ);
                            if (b0VarLJ == null) {
                                InterfaceC1653360t7u interfaceC1653360t7u3 = c1653330t7r2.LJ;
                                if (interfaceC1653360t7u3 != null) {
                                    interfaceC1653360t7u3.onCelebrationStyleApplied(null);
                                }
                            } else {
                                String str2 = c1653330t7r2.LIZIZ;
                                InterfaceC1653360t7u interfaceC1653360t7u4 = c1653330t7r2.LJ;
                                String str3 = tabStyleConfig.gradient_color;
                                String str4 = tabStyleConfig.image;
                                String str5 = tabStyleConfig.lottie;
                                if (str3 != null && str3.length() != 0) {
                                    try {
                                        new p();
                                        n nVarLJIILIIL = p.LIZJ(str3).LJIILIIL();
                                        h hVarLJJIIZI = nVarLJIILIIL.LJJIIZI("colors");
                                        h hVarLJJIIZI2 = nVarLJIILIIL.LJJIIZI("stops");
                                        h hVarLJJIIZI3 = nVarLJIILIIL.LJJIIZI("direction");
                                        int size = hVarLJJIIZI.size();
                                        int[] iArr = new int[size];
                                        for (int i = 0; i < size; i++) {
                                            iArr[i] = Color.parseColor(hVarLJJIIZI.LJJIIJZLJL(i).LJIL());
                                        }
                                        int size2 = hVarLJJIIZI2.size();
                                        float[] fArr = new float[size2];
                                        for (int i2 = 0; i2 < size2; i2++) {
                                            fArr[i2] = hVarLJJIIZI2.LJJIIJZLJL(i2).LJIIJ();
                                        }
                                        int size3 = hVarLJJIIZI3.size();
                                        float[] fArr2 = new float[size3];
                                        for (int i3 = 0; i3 < size3; i3++) {
                                            fArr2[i3] = hVarLJJIIZI3.LJJIIJZLJL(i3).LJIIJ();
                                        }
                                        c098200Yq = new C1655280tB0(fArr, fArr2, iArr);
                                        C189200o6.m2constructorimpl(c098200Yq);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        c098200Yq = new C098200Yq(th);
                                        C189200o6.m2constructorimpl(c098200Yq);
                                    }
                                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                        c098200Yq = null;
                                    }
                                    C1655280tB0 c1655280tB0 = (C1655280tB0) c098200Yq;
                                    if (c1655280tB0 != null) {
                                        LJII().getClass();
                                        C1653620t8K.LIZIZ(b0VarLJ, c1655280tB0);
                                    }
                                    if (interfaceC1653360t7u4 != null) {
                                        interfaceC1653360t7u4.onCelebrationStyleApplied(str);
                                    }
                                } else if (str4 != null && str4.length() != 0) {
                                    LJII().getClass();
                                    TextView textView = b0VarLJ.getTextView();
                                    if (textView != null && (bitmapDecodeFile = BitmapFactory.decodeFile(str4)) != null) {
                                        if (textView.getWidth() > 0 && textView.getHeight() > 0) {
                                            C1653620t8K.LIZ(textView, bitmapDecodeFile);
                                        } else {
                                            C786410Ut5.x3(textView.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1698160uIA(textView, textView, bitmapDecodeFile, 2));
                                        }
                                    }
                                    if (interfaceC1653360t7u4 != null) {
                                        interfaceC1653360t7u4.onCelebrationStyleApplied(str);
                                    }
                                } else if (str5 != null && str5.length() != 0) {
                                    C1653620t8K c1653620t8KLJII = LJII();
                                    AwS19S2300000_25 awS19S2300000_25 = new AwS19S2300000_25(this, str2, b0VarLJ, interfaceC1653360t7u4, str, 0);
                                    c1653620t8KLJII.getClass();
                                    C1295960jpS lottieView = b0VarLJ.getLottieView();
                                    TextView textView2 = b0VarLJ.getTextView();
                                    if (lottieView != null) {
                                        C23250099c.LIZLLL(c1653620t8KLJII.LIZ, null, null, new C366670EZd(null, textView2, lottieView, str, awS19S2300000_25, str5, null), 3);
                                    }
                                }
                            }
                        }
                    }
                }
                InterfaceC1653360t7u interfaceC1653360t7u5 = c1653330t7r2.LJ;
                if (interfaceC1653360t7u5 != null) {
                    interfaceC1653360t7u5.onCelebrationStyleApplied(null);
                }
            }
        }
        TabHost tabHost4 = this.LJII;
        if (tabHost4 == null) {
            tabHost4 = null;
        }
        tabHost4.setOnIndexChangedListener(new InterfaceC1653420t80() { // from class: X.0t7p
            @Override // X.InterfaceC1653420t80
            public final void LIZ(int i4, int i5, Object obj2, boolean z, boolean z2) {
                Pair<? extends EnumC1653380t7w, ? extends C0P0T> pair;
                C1653370t7v c1653370t7v = (C1653370t7v) this.LIZ.LJIIJ.getValue();
                if (c1653370t7v != null && (pair = c1653370t7v.LIZIZ) != null) {
                    EnumC1653380t7w first = pair.getFirst();
                    C0P0T second = pair.getSecond();
                    if (first != EnumC1653380t7w.LIVE) {
                        second.dismiss();
                        c1653370t7v.LIZIZ = null;
                    }
                }
                TabHost tabHost5 = this.LIZ.LJII;
                if (tabHost5 == null) {
                    tabHost5 = null;
                }
                Object objLIZ = tabHost5.LIZ(i4);
                if (objLIZ == null) {
                    objLIZ = "";
                }
                AbstractC1653290t7n abstractC1653290t7n = this.LIZ;
                boolean z3 = abstractC1653290t7n.LIZIZ;
                Object obj3 = abstractC1653290t7n.LIZ;
                if (obj3 == null) {
                    obj3 = objLIZ;
                }
                C1647390syH c1647390syH = new C1647390syH(obj2, objLIZ, i5, false, z2, z3, obj3, z, false, 264);
                this.LIZ.LJIIIIZZ(c1647390syH);
                if (!Intrinsics.LJFF(objLIZ, "")) {
                    h0<C1647390syH> h0Var = this.LIZ.LJ;
                    if (h0Var == null) {
                        h0Var = null;
                    }
                    h0Var.LJII(c1647390syH);
                    InterfaceC1653420t80 interfaceC1653420t80 = this.LIZ.LJIIIZ;
                    if (interfaceC1653420t80 != null) {
                        interfaceC1653420t80.LIZ(i4, i5, obj2, z, z2);
                    }
                    IBottomTabChangeService iBottomTabChangeService = (IBottomTabChangeService) PluggableExtentionKt.pluggableSpi$default(IBottomTabChangeService.class, false, false, false, 14, null);
                    if (iBottomTabChangeService != null) {
                        h0<C1647390syH> h0Var2 = this.LIZ.LJ;
                        if (h0Var2 == null) {
                            h0Var2 = null;
                        }
                        iBottomTabChangeService.LIZLLL(h0Var2.LIZJ().LIZIZ);
                    }
                }
            }
        });
        TabHost tabHost5 = this.LJII;
        if (tabHost5 == null) {
            tabHost5 = null;
        }
        tabHost5.setSharedARTabChangeListener(new InterfaceC1653400t7y() { // from class: X.0t7t
            @Override // X.InterfaceC1653400t7y
            public final void LIZ(String str6) {
                if (!Intrinsics.LJFF(str6, "")) {
                    C560530Lyd<String> c560530Lyd = this.LIZ.LJFF;
                    if (c560530Lyd != null) {
                        c560530Lyd.LJIIJ(str6);
                    }
                    this.LIZ.getClass();
                }
            }
        });
        ShortVideoContext shortVideoContext3 = this.LJIIIIZZ;
        if (shortVideoContext3 == null) {
            shortVideoContext3 = null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = ((ArrayList) this.LIZLLL).iterator();
        while (it5.hasNext()) {
            arrayList2.add(((C1653090t7T) it5.next()).LIZ.LIZJ);
        }
        shortVideoContext3.getCreationId();
        arrayList2.toString();
    }

    public AbstractC1653290t7n(Object obj, boolean z, LifecycleCoroutineScope lifecycleCoroutineScope) {
        this.LIZ = obj;
        this.LIZIZ = z;
        this.LIZJ = lifecycleCoroutineScope;
    }

    public final C1653090t7T LIZ(a aVar, int i, InterfaceC1653190t7d interfaceC1653190t7d) {
        interfaceC1653190t7d.initialize(aVar);
        C1653330t7r c1653330t7rCreateBottomTabItem = interfaceC1653190t7d.createBottomTabItem(aVar);
        C1653090t7T c1653090t7T = new C1653090t7T(c1653330t7rCreateBottomTabItem, interfaceC1653190t7d.provideScene());
        ListProtector.add(this.LIZLLL, i, c1653090t7T);
        CharSequence charSequence = c1653330t7rCreateBottomTabItem.LIZ;
        String str = c1653330t7rCreateBottomTabItem.LIZIZ;
        C1653300t7o c1653300t7o = this.LJI;
        TabHost tabHost = null;
        if (c1653300t7o == null) {
            c1653300t7o = null;
        }
        c1653300t7o.LIZ(i, charSequence, str, interfaceC1653190t7d.enable(), c1653330t7rCreateBottomTabItem.LJFF, false, null);
        TabHost tabHost2 = this.LJII;
        if (tabHost2 != null) {
            tabHost = tabHost2;
        }
        tabHost.requestLayout();
        return c1653090t7T;
    }

    public final void LJIIIZ(a aVar, List<? extends InterfaceC1653190t7d> list, h0<C1647390syH> h0Var, C560530Lyd<String> c560530Lyd) {
        this.LJ = h0Var;
        this.LJFF = c560530Lyd;
        for (InterfaceC1653190t7d interfaceC1653190t7d : list) {
            interfaceC1653190t7d.initialize(aVar);
            ((ArrayList) this.LIZLLL).add(new C1653090t7T(interfaceC1653190t7d.createBottomTabItem(aVar), interfaceC1653190t7d.provideScene()));
        }
    }

    public final void LJIILIIL(String str, boolean z, int i, boolean z2) {
        C1653300t7o c1653300t7o = this.LJI;
        TabHost tabHost = null;
        if (c1653300t7o == null) {
            c1653300t7o = null;
        }
        int iLIZJ = c1653300t7o.LIZJ(str);
        if (iLIZJ >= 0) {
            if (z2) {
                TabHost tabHost2 = this.LJII;
                if (tabHost2 != null) {
                    tabHost = tabHost2;
                }
                tabHost.LJ(true, iLIZJ, i, z);
                return;
            }
            TabHost tabHost3 = this.LJII;
            if (tabHost3 != null) {
                tabHost = tabHost3;
            }
            tabHost.LJFF(true, iLIZJ, i, false, z);
        }
    }
}
