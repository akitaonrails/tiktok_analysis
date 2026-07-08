package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tablet.api.IDeviceCapability;
import com.ss.android.ugc.aweme.tablet.foldable.FoldableServiceImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX INFO: renamed from: X.15i7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20593315i7 implements InterfaceC487320J9e {
    public static final C20593315i7 LIZ = new C20593315i7();

    @Override // X.InterfaceC487320J9e
    public final void LIZ() {
        C15O7.LIZJ(new Callable() { // from class: X.15iA
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("TabletLifecycleProxy@43e3.onSettingsSyncFinished$1");
                C20593815iC.LIZIZ.LIZIZ(C19252910Tv.LIZIZ.LIZLLL().LIZ().LIZ());
                C20593315i7.LIZ.getClass();
                C20593115i5.LIZ.getClass();
                Npth.addTag("is_pad", C20593115i5.LJIILIIL() ? "1" : CardStruct.IStatusCode.DEFAULT);
                C1867470yhF c1867470yhF = C1867470yhF.LIZ;
                C20595015iO.LIZ.getClass();
                boolean zLJFF = C20595015iO.LJFF();
                c1867470yhF.getClass();
                Integer numValueOf = Integer.valueOf(zLJFF ? 1 : 0);
                Map<String, Integer> map = C1867470yhF.LIZIZ;
                map.put("is_samsung_fold", numValueOf);
                map.put("comment_split", Integer.valueOf(C1616660sAi.LIZ(null, null) ? 1 : 0));
                if (C20593115i5.LJIILIIL()) {
                    for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("group", (String) entry.getKey());
                        c2344009Gk.LIZJ(((Number) entry.getValue()).intValue(), "value");
                        C20684815ws.LJIILLIIL("tablet_hero_feature_swith", c2344009Gk.LIZ);
                    }
                }
                C20593715iB c20593715iB = C20593715iB.LIZIZ;
                C20594815iM.LIZ.getClass();
                c20593715iB.LIZIZ(C20594815iM.LIZ() ? 1 : 2);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TabletLifecycleProxy@43e3.onSettingsSyncFinished$1");
                return unit;
            }
        });
    }

    @Override // X.InterfaceC487320J9e
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        boolean zLIZ = false;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("pad_fallback_framework_enable", false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        if (zLIZ) {
            C785480Ura c785480Ura = C785480Ura.LIZ;
            activity.getApplication();
            if (!C785480Ura.LIZIZ) {
                synchronized (c785480Ura) {
                    try {
                        if (!C785480Ura.LIZIZ) {
                            C785480Ura.LIZIZ = true;
                            C20593515i9.LIZ = AFwS189S0000000_3.get$arr$(13);
                            ((ArrayList) C785480Ura.LIZLLL).add(C1906580ziK.LIZJ().LJIIIZ().LJLLLLLL(new C09JN() { // from class: X.0W9X
                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    C1C7U.LIZ("PadFallbackInstaller@165c.install$1$2");
                                    Activity activityLIZIZ = ((C813430VvZ) obj).LIZ.LIZIZ();
                                    if ((activityLIZIZ instanceof Activity) && activityLIZIZ != null) {
                                        C785480Ura.LJ(activityLIZIZ);
                                    }
                                    C1C7U.LIZIZ("PadFallbackInstaller@165c.install$1$2");
                                }
                            }));
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            }
            if (C785480Ura.LIZIZ) {
                C785480Ura.LJ(activity);
            }
        }
        if (!C20529082l.LIZ) {
            C20529082l.LIZ = true;
            C20593415i8.LIZ.getClass();
            C15O7.LIZJ(new CallableC20593015i4(activity));
            Bundle bundle2 = new Bundle();
            C20593115i5.LIZ.getClass();
            bundle2.putInt("is_foldable", C20593115i5.LJIIIIZZ(activity) ? 1 : 0);
            bundle2.putInt("is_flip", C20593115i5.LJII(activity) ? 1 : 0);
            bundle2.putInt("is_pad", C20593115i5.LJIILIIL() ? 1 : 0);
            C20593215i6.LIZ(bundle2, activity, null);
            AppLog.setCustomerHeader(bundle2);
            ((InterfaceC20528082k) C20529082l.LIZIZ.getValue()).LIZJ(activity, bundle);
            AbstractC1906590ziL abstractC1906590ziLLIZJ = C1906580ziK.LIZJ();
            abstractC1906590ziLLIZJ.LJIILJJIL().LJLLLLLL(new C09JN() { // from class: X.082i
                @Override // X.C09JN
                public final void accept(Object obj) {
                    Activity activityLIZ;
                    C1C7U.LIZ("ActivityLifecycleProxy@957c.registerRootPageEvents$1");
                    AbstractC1387200mCc abstractC1387200mCc = (AbstractC1387200mCc) obj;
                    Activity activityLIZIZ = abstractC1387200mCc.LIZIZ();
                    if (activityLIZIZ != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                        ((InterfaceC20528082k) C20529082l.LIZIZ.getValue()).LIZ(activityLIZ);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[SAF-Merge] no activity found for ");
                        sbLIZ.append(abstractC1387200mCc);
                        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    C1C7U.LIZIZ("ActivityLifecycleProxy@957c.registerRootPageEvents$1");
                }
            });
            abstractC1906590ziLLIZJ.LJI().LJLLLLLL(new C09JN() { // from class: X.082j
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("ActivityLifecycleProxy@957c.registerRootPageEvents$2");
                    AbstractC1387200mCc abstractC1387200mCc = (AbstractC1387200mCc) obj;
                    Activity activityLIZIZ = abstractC1387200mCc.LIZIZ();
                    if (activityLIZIZ != null && C1388190mED.LIZ(activityLIZIZ) != null) {
                        ((InterfaceC20528082k) C20529082l.LIZIZ.getValue()).LIZIZ();
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[SAF-Merge] no activity found for ");
                        sbLIZ.append(abstractC1387200mCc);
                        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    C1C7U.LIZIZ("ActivityLifecycleProxy@957c.registerRootPageEvents$2");
                }
            });
        }
    }

    @Override // X.InterfaceC487320J9e
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C20593415i8.LIZ.getClass();
        C15O7.LIZJ(new CallableC20593015i4(activity));
        C01GW<IDeviceCapability> c01gw = FoldableServiceImpl.LIZIZ;
        IDeviceCapability value = c01gw.getValue();
        EnumC1779870wPx enumC1779870wPx = null;
        if (value != null && value.k(null)) {
            IDeviceCapability value2 = c01gw.getValue();
            if (value2 != null) {
                int iH = value2.h();
                if (iH != 0) {
                    if (iH != 1) {
                        enumC1779870wPx = EnumC1779870wPx.UNKNOWN;
                    } else {
                        enumC1779870wPx = EnumC1779870wPx.UNFOLDED;
                    }
                } else {
                    enumC1779870wPx = EnumC1779870wPx.FOLDED;
                }
            }
            EnumC1779870wPx enumC1779870wPx2 = FoldableServiceImpl.LIZJ;
            FoldableServiceImpl.LIZJ = enumC1779870wPx;
            if (enumC1779870wPx != null && enumC1779870wPx != enumC1779870wPx2) {
                CopyOnWriteArrayList<WeakReference<InterfaceC1779880wPy>> copyOnWriteArrayList = FoldableServiceImpl.LIZ;
                C19719612Di.LJJIIJ(copyOnWriteArrayList, AFwS245S0000000_12.get$arr$(89), true);
                Iterator<WeakReference<InterfaceC1779880wPy>> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    InterfaceC1779880wPy interfaceC1779880wPy = it2.next().get();
                    if (interfaceC1779880wPy != null) {
                        interfaceC1779880wPy.LIZ();
                    }
                }
            }
        }
        ((InterfaceC20528082k) C20529082l.LIZIZ.getValue()).onConfigurationChanged(activity, configuration);
    }
}
