package X;

import X.C10PO;
import X.C1911410zq7;
import X.EnumC1153980g8S;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.NewUserJourneyContainerActivity;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.ss.android.ugc.aweme.journey.com.ss.android.ugc.aweme.NewUserJourneyFragment;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10PR, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10PR implements C10PV {
    public final C19EG LL;
    public final SAFTikTokFragment LLILLJJLI;
    public final C10PZ LLILLL;
    public final Function2<Fragment, Boolean, Unit> LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 838));

    public final Intent LIZIZ() {
        return ((C10PW) this.LLILZIL.getValue()).LLILZIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [X.10PS, android.app.Application$ActivityLifecycleCallbacks] */
    public final void LIZJ() {
        Lifecycle lifecycle;
        InterfaceC19236310Nl interfaceC19236310Nl;
        C10PW c10pw = (C10PW) this.LLILZIL.getValue();
        c10pw.getClass();
        C10PO.LIZ.getClass();
        C1912470zrp c1912470zrpLIZ = C10PO.LIZ();
        if (c1912470zrpLIZ != null && (interfaceC19236310Nl = (InterfaceC19236310Nl) c1912470zrpLIZ.LIZIZ(InterfaceC19236310Nl.class)) != null) {
            interfaceC19236310Nl.XB2(((ISettingService) ServiceManager.get().getService(ISettingService.class)).getCurrentI18nItem(c10pw.LL));
        }
        final C10PX c10px = new C10PX(c10pw);
        C1911410zq7.LIZ("NUJCenter", "start...");
        C10R5 c10r5 = C10R5.LJIIIIZZ;
        final C10PI c10piLIZ = C10P8.LIZ(C10RS.LIZ().LIZJ() == 1 ? EnumC1153980g8S.NUJ_SCENE_NEW_USER_CONFIG : EnumC1153980g8S.NUJ_SCENE_DEFAULT, c10px);
        C10P6 c10p6 = new C10P6(c10piLIZ, C10P8.LIZ(EnumC1153980g8S.NUJ_SCENE_NEW_USER_CONFIG, c10px));
        C10PO.LIZIZ = c10p6;
        C10PH c10ph = new C10PH() { // from class: X.10Pi
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(626));
            public final List<String> LIZIZ = new ArrayList();

            @Override // X.C10PH
            public final void LIZ(C10P6 c10p62, C10NW c10nw) {
                String str;
                IPluginService.PluginData next;
                IPluginService.PluginData next2;
                String str2;
                if (!C1697810uHb.LJIIJJI(C10NW.JOURNEY_SLOGAN_ID, C10NW.JOURNEY_SERVER_DELAY_ID, C10NW.JOURNEY_SMART_LOCK_ID).contains(c10nw)) {
                    C1911410zq7.LIZ("PersonalizedNUJ", "only expose in slogan、server delay、smart lock node");
                    return;
                }
                this.LIZ.getValue().getClass();
                Iterator<IPluginService.PluginData> it2 = ((IPluginService) ServiceManager.get().getService(IPluginService.class)).getCurrentPluginListPluginData().iterator();
                while (true) {
                    str = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.id == EnumC19241510Pl.PERSONALIZED_NUJ_V2_DATA.getValue()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                IPluginService.PluginData pluginData = next;
                if (pluginData == null || !Intrinsics.LJFF(pluginData.showConfig.shouldShow, Boolean.TRUE)) {
                    C1911410zq7.LIZLLL("PersonalNUJData", "getNUJV2Plugin but nujV2Plugin is null");
                    pluginData = null;
                }
                this.LIZ.getValue().getClass();
                Iterator<IPluginService.PluginData> it3 = ((IPluginService) ServiceManager.get().getService(IPluginService.class)).getCurrentPluginListPluginData().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (next2.id == EnumC19241510Pl.NON_FORCED_REGION_QUICK_LOGIN.getValue()) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                IPluginService.PluginData pluginData2 = next2;
                if (pluginData2 == null || !Intrinsics.LJFF(pluginData2.showConfig.shouldShow, Boolean.TRUE)) {
                    C1911410zq7.LIZLLL("PersonalNUJData", "getNoneForceLoginQuickLoginPlugin but noneForceLoginQuickLoginPlugin is null");
                    pluginData2 = null;
                }
                if (pluginData != null) {
                    str2 = pluginData.abExposeVid;
                } else {
                    str2 = null;
                }
                if (pluginData2 != null) {
                    str = pluginData2.abExposeVid;
                }
                ArrayList arrayList = new ArrayList();
                if (str2 != null && str2.length() != 0 && !((ArrayList) this.LIZIZ).contains(str2)) {
                    arrayList.add(str2);
                }
                if (str != null && str.length() != 0 && !((ArrayList) this.LIZIZ).contains(str)) {
                    arrayList.add(str);
                }
                ((ArrayList) this.LIZIZ).addAll(arrayList);
                String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                if (strLJJLIIIJ.length() > 0) {
                    C0C5P.LIZJ().getClass();
                    C0C5P.LIZ(strLJJLIIIJ);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("intercept componentType:");
                sbLIZ.append(c10nw);
                sbLIZ.append(",vids:");
                sbLIZ.append(strLJJLIIIJ);
                C1911410zq7.LIZ("PersonalizedNUJ", C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        C10P4 c10p4 = c10p6.LIZIZ;
        c10p4.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addInterceptor interceptor:");
        sbLIZ.append("exposure_vid");
        C1911410zq7.LIZ("NUJFlowEngineV2", C2188811AlT.LIZIZ(sbLIZ));
        ((CopyOnWriteArrayList) c10p4.LJ.getValue()).add(c10ph);
        C10P9 c10p9 = (C10P9) c10piLIZ.LIZ.LIZIZ(C10PL.class);
        if (c10p9 != null) {
            c10p6.LIZIZ(c10p9);
        }
        c10p6.LIZIZ(new C10P9() { // from class: X.10PQ
            @Override // X.C10P9
            public final void Is1(C10P7<?> c10p7, C19240810Pe c19240810Pe) {
            }

            @Override // X.C10P9
            public final void S62() {
            }

            @Override // X.C10P9
            public final void VT1(C10P7<?> c10p7) {
            }

            @Override // X.C10P9
            public final void onStart() {
            }

            @Override // X.C10P9
            public final void onComplete() {
                c10px.LIZLLL().run();
                C10PO c10po = C10PO.LIZ;
                EnumC1153980g8S enumC1153980g8SType = c10piLIZ.type();
                c10po.getClass();
                C10PO.LIZIZ(enumC1153980g8SType);
                C2211631BhB.LJIILL("b5106", null);
                C2211631BhB.LIZIZ = true;
                C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0yB2
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("NUJCenter@1811.realStart$2$onComplete$1");
                        try {
                            C307150C2f.LIZ = 0;
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("NUJCenter@1811.realStart$2$onComplete$1");
                    }
                });
                C10PO.LIZJ = 3;
                C0CR3.LIZ.getClass();
                C0CR3.LIZJ = 3;
                C313570CQx.LIZ.getClass();
                C313570CQx.LIZJ = 3;
            }
        });
        C19EG c19eg = c10pw.LL;
        if ((c19eg instanceof NewUserJourneyActivity) || (c19eg instanceof NewUserJourneyContainerActivity)) {
            c19eg.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.refactor.framework.NUJCenter$realStart$3
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestroy();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestroy() {
                    C1911410zq7.LIZ("NUJCenter", "host destroy");
                    C10PO c10po = C10PO.LIZ;
                    EnumC1153980g8S enumC1153980g8SType = c10piLIZ.type();
                    c10po.getClass();
                    C10PO.LIZIZ(enumC1153980g8SType);
                }
            });
        } else {
            SAFTikTokFragment sAFTikTokFragment = c10pw.LLILLJJLI;
            if (sAFTikTokFragment != null && (lifecycle = sAFTikTokFragment.getLifecycle()) != null) {
                lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.refactor.framework.NUJCenter$realStart$4
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            onDestroy();
                        }
                    }

                    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                    public final void onDestroy() {
                        C1911410zq7.LIZ("NUJCenter", "host destroy");
                        C10PO c10po = C10PO.LIZ;
                        EnumC1153980g8S enumC1153980g8SType = c10piLIZ.type();
                        c10po.getClass();
                        C10PO.LIZIZ(enumC1153980g8SType);
                    }
                });
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("realStart ");
        sbLIZ2.append(c10piLIZ.type());
        sbLIZ2.append(" flow");
        C1911410zq7.LIZ("NUJCenter", C2188811AlT.LIZIZ(sbLIZ2));
        C10MP.LIZ.getClass();
        C10MP.LJ = Keva.getRepo("nuj_extend").getInt("nuj_times", 0) + 1;
        Keva.getRepo("nuj_extend").storeInt("nuj_times", C10MP.LJ);
        if (C1514430pVp.LIZLLL().booleanValue()) {
            try {
                SettingsManager.LIZLLL().getClass();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (SettingsManager.LIZ("new_user_activity_monitor_enable", true)) {
                AtomicBoolean atomicBoolean = C10PT.LIZIZ;
                if (atomicBoolean.compareAndSet(false, true)) {
                    final Application applicationLIZ = C1BWL.LIZ();
                    if (applicationLIZ == 0) {
                        atomicBoolean.set(false);
                    } else {
                        ?? r0 = new Application.ActivityLifecycleCallbacks() { // from class: X.10PS
                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityDestroyed(Activity activity) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityPaused(Activity activity) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityResumed(Activity activity) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityStarted(Activity activity) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityStopped(Activity activity) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityCreated(Activity activity, Bundle bundle) {
                                C10PS c10ps;
                                C10PT c10pt = C10PT.LIZ;
                                Application application = applicationLIZ;
                                c10pt.getClass();
                                String name = activity.getClass().getName();
                                if (name.length() != 0) {
                                    Set<String> set = C10PT.LIZJ;
                                    if (set.add(name)) {
                                        C2344009Gk c2344009Gk = new C2344009Gk();
                                        c2344009Gk.LJIIIIZZ("type", "new_user_activity_monitor");
                                        c2344009Gk.LJIIIIZZ("sub_type", name);
                                        C20684815ws.LJIILLIIL("intention_detection_flag", c2344009Gk.LIZ);
                                        if (set.size() >= 5 && (c10ps = C10PT.LIZLLL) != null) {
                                            C10PT.LIZLLL = null;
                                            application.unregisterActivityLifecycleCallbacks(c10ps);
                                        }
                                    }
                                }
                            }
                        };
                        C10PT.LIZLLL = r0;
                        applicationLIZ.registerActivityLifecycleCallbacks(r0);
                    }
                }
            }
        }
        if (C1514430pVp.LIZLLL().booleanValue()) {
            C10P4 c10p42 = c10p6.LIZIZ;
            C10OL c10ol = C10OL.LIZ;
            C10PP c10pp = c10p6.LIZ;
            c10ol.getClass();
            c10p42.LJFF = C10OL.LIZ(c10pp, false);
        } else {
            C10P4 c10p43 = c10p6.LIZIZ;
            C10MP c10mp = C10MP.LIZ;
            C1912470zrp c1912470zrpContext = c10p6.LIZ.context();
            c10mp.getClass();
            c10p43.LJFF = C10MP.LIZIZ(c1912470zrpContext, true);
        }
        C10P4 c10p44 = c10p6.LIZIZ;
        c10p44.getClass();
        C1911410zq7.LIZ("NUJFlowEngineV2", "start...");
        C19240010Ow c19240010Ow = C19240010Ow.LIZ;
        C10OL.LIZ.getClass();
        long j = C10OL.LIZIZ;
        c19240010Ow.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "config_id");
        C19240010Ow.LIZJ("config_scene_start", c2344009Gk.LIZ);
        c10p44.LIZIZ = -1;
        c10p44.LIZJ = false;
        c10p44.LIZ();
        C10PO.LIZJ = 2;
        C0CR3.LIZ.getClass();
        C0CR3.LIZJ = 2;
        C313570CQx.LIZ.getClass();
        C313570CQx.LIZJ = 2;
        C1844207Ke.LIZ = true;
        C10PO.LIZ.getClass();
        C10P6 c10p62 = C10PO.LIZIZ;
        if (c10p62 != null) {
            c10p62.LIZIZ(c10pw);
        }
    }

    @Override // X.C10PV
    public final void LIZLLL() {
        AFwS271S0000000_28.get$arr$(363).invoke(this.LLILZIL.getValue());
    }

    @Override // X.C10PV
    public final void LIZ(Intent intent) {
        new AwS607S0100000_28(intent, 266).invoke(this.LLILZIL.getValue());
    }

    @Override // X.C10PV
    public void onEvent(IEvent iEvent) {
        new AwS607S0100000_28(iEvent, 265).invoke(this.LLILZIL.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C10PV
    public final void onActivityResult(int i, int i2, Intent intent) {
        new C10PU(i, i2, intent).invoke(this.LLILZIL.getValue());
    }

    public C10PR(C19EG c19eg, NewUserJourneyFragment newUserJourneyFragment, C10PZ c10pz, Function2 function2) {
        this.LL = c19eg;
        this.LLILLJJLI = newUserJourneyFragment;
        this.LLILLL = c10pz;
        this.LLILZ = function2;
    }
}
