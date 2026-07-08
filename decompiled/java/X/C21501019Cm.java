package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IComplianceFeatureService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.zhiliaoapp.musically.R;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS185S0101000_32;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.19Cm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21501019Cm extends C09AY implements Function0<List<? extends C19D2>> {
    public C21501019Cm() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends C19D2> invoke() {
        new Object() { // from class: X.19Cr
        }.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C1697810uHb.LJIIJJI(new C21500419Cg(), new C19D2() { // from class: X.19Ci
            public final C19DL LLILLL = new C19DL(new C21500719Cj(this));

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIIJ(BaseActivity baseActivity) {
                this.LLILLL.LIZIZ(baseActivity);
            }

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIJIL(BaseActivity baseActivity) {
                this.LLILLL.LIZJ(baseActivity);
            }

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIIJZLJL(BaseActivity baseActivity, boolean z) {
                this.LLILLL.getClass();
                C19DL.LIZLLL(baseActivity, z);
            }
        }, new C19D2() { // from class: X.0WiS
            public static int LLILZLL;
            public String LLILLL;
            public C2419509dx LLILZ;
            public int LLILZIL;

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJJI(BaseActivity baseActivity) {
                InterfaceC827920Wdq interfaceC827920WdqLIZ = C827900Wdo.LIZ();
                if (interfaceC827920WdqLIZ != null) {
                    interfaceC827920WdqLIZ.onActivityPaused(baseActivity);
                }
                C2214201BlK.LJI(null);
            }

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIIJ(BaseActivity baseActivity) {
                InterfaceC827920Wdq interfaceC827920WdqLIZ = C827900Wdo.LIZ();
                if (interfaceC827920WdqLIZ != null) {
                    interfaceC827920WdqLIZ.onActivityResumed(baseActivity);
                }
            }

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIIZ(BaseActivity baseActivity) {
                C06W3 next;
                View viewFindViewById;
                ViewGroup viewGroup;
                FrameLayout frameLayout;
                Iterator<C06W3> it2 = LJIIZILJ().LIZ().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next instanceof C1268304xl) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (!(next instanceof C1268304xl)) {
                    next = null;
                }
                C1268304xl c1268304xl = (C1268304xl) next;
                if ((c1268304xl != null && c1268304xl.LIZIZ) || (viewFindViewById = baseActivity.findViewById(R.id.a1p)) == null) {
                    return;
                }
                ViewParent parent = viewFindViewById.getParent();
                if ((parent instanceof FrameLayout) && (viewGroup = (ViewGroup) parent) != null) {
                    View viewFindViewById2 = baseActivity.findViewById(android.R.id.content);
                    if ((viewFindViewById2 instanceof FrameLayout) && (frameLayout = (FrameLayout) viewFindViewById2) != null && frameLayout.getChildCount() == 1) {
                        View childAt = frameLayout.getChildAt(0);
                        C786410Ut5.LJJJJIZL(frameLayout);
                        viewGroup.addView(childAt);
                        viewFindViewById2.setId(-1);
                        viewGroup.setId(android.R.id.content);
                    }
                }
            }

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIJ(BaseActivity baseActivity) {
                InterfaceC827910Wdp interfaceC827910Wdp;
                if (this.LLILZIL == 0 && (interfaceC827910Wdp = C827900Wdo.LIZIZ) != null) {
                    interfaceC827910Wdp.LIZ();
                }
                this.LLILZIL++;
            }

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIJIIJI(BaseActivity baseActivity) {
                C2214201BlK.LJI(baseActivity);
            }

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIJIL(BaseActivity baseActivity) {
                InterfaceC827910Wdp interfaceC827910Wdp;
                int i = this.LLILZIL - 1;
                this.LLILZIL = i;
                if (i == 0 && (interfaceC827910Wdp = C827900Wdo.LIZIZ) != null) {
                    interfaceC827910Wdp.LIZ();
                }
            }

            @Override // X.C19D2, X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIJLIJ(BaseActivity baseActivity) {
                this.LLILLJJLI = null;
                C2419509dx c2419509dx = this.LLILZ;
                if (c2419509dx != null) {
                    LocalBroadcastManager.LIZ(baseActivity).LIZLLL(c2419509dx);
                }
            }

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIL(Bundle bundle) {
                C786410Ut5.LJJJI("abs_Activity_Key", this.LLILLL, bundle);
                bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
            }

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void onRestoreInstanceState(Bundle bundle) {
                if (bundle.containsKey("abs_Activity_Key")) {
                    this.LLILLL = bundle.getString("abs_Activity_Key");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [X.09dx, android.content.BroadcastReceiver] */
            @Override // X.C19D2, X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIIZI(final BaseActivity baseActivity, Bundle bundle) {
                String strLIZIZ;
                C06W3 next;
                super.LJJIIZI(baseActivity, bundle);
                this.LLILZIL = 0;
                if (bundle != null && bundle.containsKey("abs_Activity_Key")) {
                    strLIZIZ = bundle.getString("abs_Activity_Key");
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C830780WiS.class.getCanonicalName());
                    sbLIZ.append('@');
                    int i = LLILZLL;
                    LLILZLL = i + 1;
                    sbLIZ.append(i);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                this.LLILLL = strLIZIZ;
                Iterator<C06W3> it2 = LJIIZILJ().LIZ().iterator();
                do {
                    next = null;
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        next = it2.next();
                    }
                } while (!(next instanceof C1268304xl));
                boolean z = next instanceof C1268304xl;
                ?? r3 = new BroadcastReceiver() { // from class: X.09dx
                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(Context context, Intent intent) {
                        if (!C2214201BlK.LJIIJJI && intent != null) {
                            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                                C2188191AkT.LIZIZ();
                            }
                        }
                        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                            if (!baseActivity.isFinishing()) {
                                getClass();
                            }
                        } else {
                            C2408409cA.LIZ();
                            if (baseActivity.isFinishing()) {
                                return;
                            }
                            getClass();
                        }
                    }
                };
                this.LLILZ = r3;
                LocalBroadcastManager.LIZ(baseActivity).LIZIZ(r3, new IntentFilter("com.ss.android.common.app.action.exit_app"));
            }
        }, new C19D2() { // from class: X.19Cn
            public final C01GW LLILLL = C452501pT.LIZIZ(new C21501319Cp(this));

            @Override // X.C19D2, X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIJLIJ(BaseActivity baseActivity) {
                this.LLILLJJLI = null;
                EventBus eventBusLIZLLL = EventBus.LIZLLL();
                if (((Boolean) this.LLILLL.getValue()).booleanValue() && eventBusLIZLLL.LJIIJ(baseActivity)) {
                    eventBusLIZLLL.LJJI(baseActivity);
                }
            }

            @Override // X.C19D2, X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIIZI(BaseActivity baseActivity, Bundle bundle) {
                super.LJJIIZI(baseActivity, bundle);
                EventBus eventBusLIZLLL = EventBus.LIZLLL();
                if (!eventBusLIZLLL.LJIIJ(baseActivity) && ((Boolean) this.LLILLL.getValue()).booleanValue()) {
                    eventBusLIZLLL.LJIJJ(baseActivity);
                }
            }
        }, new C21502119Cx(), new C19D2() { // from class: X.19Co
            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void onActivityResult(int i, int i2, Intent intent) {
                List<C06W3> listLIZ = LJIIZILJ().LIZ();
                ArrayList arrayList2 = new ArrayList();
                for (C06W3 c06w3 : listLIZ) {
                    if (c06w3 instanceof C0OMU) {
                        arrayList2.add(c06w3);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((C0OMU) it2.next()).LIZ.onActivityResult(i, i2, intent);
                }
            }
        }, new C19D2() { // from class: X.19Ck
            public volatile boolean LLILLL;

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void finish() {
                BaseActivity baseActivity;
                WeakReference<BaseActivity> weakReference = this.LLILLJJLI;
                if (weakReference == null || (baseActivity = weakReference.get()) == null) {
                    return;
                }
                C1254880ilC c1254880ilC = C1254880ilC.LIZ;
                int iLJIJ = LJIJ();
                c1254880ilC.getClass();
                C1254880ilC.LIZ(baseActivity, false, iLJIJ);
            }

            public final int LJIJ() {
                C06W3 next;
                BaseActivity baseActivity;
                Integer num;
                Iterator<C06W3> it2 = LJIIZILJ().LIZ().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (next instanceof C06W5) {
                        break;
                    }
                }
                if (!(next instanceof C06W5)) {
                    next = null;
                }
                C06W5 c06w5 = (C06W5) next;
                if (c06w5 != null) {
                    return c06w5.LIZ;
                }
                WeakReference<BaseActivity> weakReference = this.LLILLJJLI;
                if (weakReference == null || (baseActivity = weakReference.get()) == null || (num = (Integer) C1563370qml.LIZ(baseActivity, EnumC682280QpW.GET_INTENT, new C21500919Cl(baseActivity))) == null) {
                    return -1;
                }
                return num.intValue();
            }

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIIJ(BaseActivity baseActivity) {
                BaseActivity baseActivity2;
                if (!this.LLILLL) {
                    WeakReference<BaseActivity> weakReference = this.LLILLJJLI;
                    if (weakReference != null && (baseActivity2 = weakReference.get()) != null) {
                        C1254880ilC c1254880ilC = C1254880ilC.LIZ;
                        int iLJIJ = LJIJ();
                        c1254880ilC.getClass();
                        C1254880ilC.LIZ(baseActivity2, true, iLJIJ);
                    }
                    this.LLILLL = true;
                }
            }
        }, new C19D2() { // from class: X.0mJJ
            public boolean LLILLL;

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIIJZLJL(BaseActivity baseActivity, boolean z) {
                if (this.LLILLL != z) {
                    if (z) {
                        C1378370lyN.LIZ.getClass();
                        C1378370lyN.LIZIZ(baseActivity);
                    } else {
                        C1378370lyN.LIZ.getClass();
                        C1378370lyN.LIZ();
                    }
                    this.LLILLL = z;
                }
            }
        }, new C19D2() { // from class: X.19DI
            public final <T> T LJIJ(T t, Function2<? super C1254970ilL, ? super T, ? extends T> function2) {
                List<C06W3> listLIZ = LJIIZILJ().LIZ();
                ArrayList arrayList2 = new ArrayList();
                for (C06W3 c06w3 : listLIZ) {
                    if (c06w3 instanceof C1254970ilL) {
                        arrayList2.add(c06w3);
                    }
                }
                Iterator it2 = C13LP.LJLJJLL(arrayList2).iterator();
                while (it2.hasNext()) {
                    t = function2.invoke(it2.next(), t);
                }
                return t;
            }

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                Boolean bool = (Boolean) LJIJ(Boolean.FALSE, new AwS185S0101000_32(i, keyEvent, 1));
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            }

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void u1(int i, Intent intent) {
                LJIJ(null, new AwS185S0101000_32(i, intent, 0));
            }
        }, new C19D2() { // from class: X.0sAk
            public final ConcurrentHashMap<Integer, InterfaceC20660615sy> LLILLL = new ConcurrentHashMap<>();

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[PHI: r3
              0x001a: PHI (r3v2 X.15ms) = (r3v5 X.15ms), (r3v6 X.15ms) binds: [B:22:0x0034, B:11:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static boolean LJIJ(com.bytedance.ies.foundation.activity.BaseActivity r3) {
                /*
                    boolean r0 = r3 instanceof X.InterfaceC1616690sAl
                    r2 = 1
                    if (r0 == 0) goto Lb
                    X.0sAl r3 = (X.InterfaceC1616690sAl) r3
                    r3.LJJJJZI()
                    return r2
                Lb:
                    boolean r0 = X.C294780Bgy.LIZ()
                    r1 = 0
                    if (r0 == 0) goto L28
                    boolean r0 = r3 instanceof X.InterfaceC214897198d
                    if (r0 == 0) goto L1e
                    X.15ms r3 = (X.InterfaceC20622815ms) r3
                    if (r3 == 0) goto L1e
                L1a:
                    X.198H r1 = X.C20629915o1.LIZLLL(r3)
                L1e:
                    boolean r0 = r1 instanceof X.InterfaceC1616690sAl
                    if (r0 == 0) goto L37
                    X.0sAl r1 = (X.InterfaceC1616690sAl) r1
                    r1.LJJJJZI()
                    return r2
                L28:
                    boolean r0 = r3 instanceof X.InterfaceC214897198d
                    if (r0 == 0) goto L1e
                    X.198d r3 = (X.InterfaceC214897198d) r3
                    if (r3 == 0) goto L1e
                    boolean r0 = r3.getEnableSAF()
                    if (r0 == 0) goto L1e
                    goto L1a
                L37:
                    r2 = 0
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1616680sAk.LJIJ(com.bytedance.ies.foundation.activity.BaseActivity):boolean");
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIFFI(BaseActivity baseActivity) {
                InterfaceC20660615sy interfaceC20660615sy;
                String name;
                if (LJIJ(baseActivity)) {
                    return;
                }
                String strLIZIZ = null;
                if (baseActivity instanceof InterfaceC20660615sy) {
                    interfaceC20660615sy = (InterfaceC20660615sy) baseActivity;
                } else if (this.LLILLL.containsKey(Integer.valueOf(baseActivity.hashCode()))) {
                    interfaceC20660615sy = this.LLILLL.get(Integer.valueOf(baseActivity.hashCode()));
                } else {
                    interfaceC20660615sy = null;
                }
                String strValueOf = String.valueOf(baseActivity.hashCode());
                C2211621BhA.LIZ.getClass();
                C2211641BhC c2211641BhCLJFF = C2211621BhA.LJFF(strValueOf);
                if (c2211641BhCLJFF != null) {
                    strLIZIZ = c2211641BhCLJFF.LIZIZ();
                }
                if (strLIZIZ != null && strLIZIZ.length() != 0) {
                    name = strLIZIZ.substring(1);
                } else {
                    name = baseActivity.getClass().getName();
                }
                if (interfaceC20660615sy != null) {
                    ISpecActService.LIZ.getClass();
                    ISpecActService iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
                    if (iSpecActService != null) {
                        iSpecActService.LJJJI(interfaceC20660615sy, name, LSPassThroughRecordSizeConfig.DEFAULT, false);
                    }
                }
            }

            @Override // X.C19D2, X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIJLIJ(BaseActivity baseActivity) {
                this.LLILLJJLI = null;
                if (this.LLILLL.containsKey(Integer.valueOf(baseActivity.hashCode()))) {
                    this.LLILLL.remove(Integer.valueOf(baseActivity.hashCode()));
                }
            }

            @Override // X.C19D2, X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIIZI(BaseActivity baseActivity, Bundle bundle) {
                super.LJJIIZI(baseActivity, bundle);
                if (!LJIJ(baseActivity) && !(baseActivity instanceof InterfaceC20658015sY) && !this.LLILLL.contains(Integer.valueOf(baseActivity.hashCode()))) {
                    this.LLILLL.put(Integer.valueOf(baseActivity.hashCode()), new InterfaceC20660615sy(new WeakReference(baseActivity)) { // from class: X.0Ou8
                        public final WeakReference<C19EG> LL;

                        @Override // X.InterfaceC20658015sY
                        public final String getSceneId() {
                            return "dynamic_popup";
                        }

                        @Override // X.InterfaceC20660615sy
                        public final boolean t2() {
                            return true;
                        }

                        @Override // X.InterfaceC20658015sY
                        public final boolean Xu() {
                            Lifecycle lifecycle;
                            Lifecycle.State currentState;
                            C19EG c19eg = this.LL.get();
                            return (c19eg == null || (lifecycle = SAFExtensionKt.LJJIFFI(c19eg).getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.CREATED)) ? false : true;
                        }

                        @Override // X.InterfaceC20658015sY
                        public final C688120Qyw i2() {
                            C19EG c19eg = this.LL.get();
                            if (c19eg == null) {
                                return null;
                            }
                            return new C688120Qyw(c19eg, SAFExtensionKt.LJJIFFI(c19eg), null);
                        }

                        {
                            this.LL = weakReference;
                        }
                    });
                }
            }
        }, new C19D2() { // from class: X.0uHP
            public final Keva LLILLL = Keva.getRepo("a11y_setting");

            @Override // X.C19D2, X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIIZI(BaseActivity baseActivity, Bundle bundle) {
                super.LJJIIZI(baseActivity, bundle);
                if (this.LLILLL.getBoolean("high_contrast_enabled", false)) {
                    baseActivity.setTheme(R.style.a9w);
                }
            }

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJJJJ(BaseActivity baseActivity, Bundle bundle) {
                if (!this.LLILLL.contains("high_contrast_enabled") && baseActivity != null) {
                    try {
                        if (Settings.Secure.getInt(baseActivity.getContentResolver(), "high_text_contrast_enabled", 0) != 0) {
                            this.LLILLL.storeBoolean("high_contrast_enabled", true);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }, new C19D2() { // from class: X.0uHO
            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJJJJ(BaseActivity baseActivity, Bundle bundle) {
                C1301040jxe.LIZ(baseActivity, Settings.Secure.getInt(baseActivity.getContentResolver(), "font_weight_adjustment", 0), false);
            }
        }, new C19D2() { // from class: X.0K8d
            public final String LLILLL = "androidx.lifecycle.BundlableSavedStateRegistry.key";

            public final void LJIJ(Bundle bundle) {
                Set<String> setKeySet;
                Bundle bundle2;
                if (Build.VERSION.SDK_INT == 29 && bundle != null && ((Boolean) C258930ACt.LIZ.getValue()).booleanValue()) {
                    PrintStream printStream = System.err;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("bundle's classloader:");
                    sbLIZ.append(bundle.getClassLoader());
                    sbLIZ.append(",now set it to ");
                    sbLIZ.append(C512530K8d.class.getClassLoader());
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                    bundle.setClassLoader(C512530K8d.class.getClassLoader());
                    Bundle bundle3 = bundle.getBundle(this.LLILLL);
                    if (bundle3 != null && (setKeySet = bundle3.keySet()) != null) {
                        Iterator<T> it2 = setKeySet.iterator();
                        while (it2.hasNext()) {
                            Object obj = null;
                            try {
                                obj = bundle3.get((String) it2.next());
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            } catch (OutOfMemoryError e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                            if ((obj instanceof Bundle) && (bundle2 = (Bundle) obj) != null) {
                                bundle2.setClassLoader(C512530K8d.class.getClassLoader());
                            }
                        }
                    }
                }
            }

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJJII(Bundle bundle) {
                LJIJ(bundle);
            }

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJJJJ(BaseActivity baseActivity, Bundle bundle) {
                LJIJ(bundle);
            }
        }));
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "gray_mode", true, false)) {
            arrayList.add(new C19D2() { // from class: X.12Gr
                @Override // X.C19D2, X.C19DE, X.InterfaceC21503119Dh
                public final void LJJIIZI(BaseActivity baseActivity, Bundle bundle) {
                    super.LJJIIZI(baseActivity, bundle);
                    Paint paint = new Paint();
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(0.0f);
                    paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    baseActivity.getWindow().getDecorView().setLayerType(2, paint);
                }
            });
        }
        arrayList.add(new C19D2() { // from class: X.0uHN
            public static void LJIJ(BaseActivity baseActivity) {
                Resources resources = baseActivity.getResources();
                List<Resources> listLJIILJJIL = C1697810uHb.LJIILJJIL(Resources.getSystem());
                Context applicationContext = baseActivity.getApplicationContext();
                if (C2409809cO.LIZIZ) {
                    if (applicationContext == null) {
                        applicationContext = C2409809cO.LIZ;
                        if (applicationContext != null) {
                        }
                    }
                    listLJIILJJIL.add(applicationContext.getResources());
                } else if (applicationContext != null) {
                    listLJIILJJIL.add(applicationContext.getResources());
                }
                for (Resources resources2 : listLJIILJJIL) {
                    resources2.getDisplayMetrics().density = resources.getDisplayMetrics().density;
                    resources2.getDisplayMetrics().scaledDensity = resources.getDisplayMetrics().scaledDensity;
                    resources2.getDisplayMetrics().densityDpi = resources.getDisplayMetrics().densityDpi;
                    resources2.getConfiguration().screenWidthDp = resources.getConfiguration().screenWidthDp;
                    resources2.getConfiguration().screenHeightDp = resources.getConfiguration().screenHeightDp;
                    resources2.getConfiguration().smallestScreenWidthDp = resources.getConfiguration().smallestScreenWidthDp;
                    resources2.getConfiguration().densityDpi = resources.getConfiguration().densityDpi;
                    resources2.updateConfiguration(resources2.getConfiguration(), resources2.getDisplayMetrics());
                }
                C1309830kBp.LJJIFFI = Float.valueOf(resources.getDisplayMetrics().density);
            }

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIIJ(BaseActivity baseActivity) {
                LJIJ(baseActivity);
            }

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJJJ(BaseActivity baseActivity, Configuration configuration) {
                if (((Boolean) C264930AZv.LIZ.getValue()).booleanValue()) {
                    C1697630uHJ.LJ(baseActivity);
                }
            }

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJJJJ(BaseActivity baseActivity, Bundle bundle) {
                LJIJ(baseActivity);
            }
        });
        IComplianceFeatureService iComplianceFeatureService = (IComplianceFeatureService) PluggableExtentionKt.pluggableSpi$default(IComplianceFeatureService.class, false, false, false, 14, null);
        if (iComplianceFeatureService != null && iComplianceFeatureService.LIZIZ()) {
            arrayList.add(new C21500119Cd());
        }
        arrayList.add(new C19DU());
        return arrayList;
    }
}
