package com.bytedance.android.btm.impl;

import X.AnonymousClass1891;
import X.C01GW;
import X.C09R3;
import X.C0C42;
import X.C1206720hVW;
import X.C13LE;
import X.C1523880pl4;
import X.C1554660qYi;
import X.C1555750qaT;
import X.C1697810uHb;
import X.C1869060yjo;
import X.C1869070yjp;
import X.C1869080yjq;
import X.C1869090yjr;
import X.C1869110yjt;
import X.C1869120yju;
import X.C1869780yky;
import X.C1870130ylX;
import X.C1870200yle;
import X.C18A6;
import X.C18AB;
import X.C18B9;
import X.C18BA;
import X.C18BV;
import X.C18C3;
import X.C18C4;
import X.C18CB;
import X.C18CC;
import X.C18CD;
import X.C18CE;
import X.C18CJ;
import X.C18CK;
import X.C18CM;
import X.C18CR;
import X.C18CS;
import X.C18D5;
import X.C18D6;
import X.C18DI;
import X.C18E2;
import X.C18E3;
import X.C18E4;
import X.C18E5;
import X.C18E6;
import X.C18E9;
import X.C18EA;
import X.C18EB;
import X.C18EF;
import X.C18EI;
import X.C18EK;
import X.C18EN;
import X.C18EO;
import X.C18EP;
import X.C18EU;
import X.C18EV;
import X.C18EW;
import X.C18EY;
import X.C18F5;
import X.C18F6;
import X.C18FH;
import X.C18G1;
import X.C18G2;
import X.C18G7;
import X.C18GO;
import X.C18GU;
import X.C18GV;
import X.C18GZ;
import X.C18H4;
import X.C18HS;
import X.C18HU;
import X.C18I7;
import X.C18I8;
import X.C18I9;
import X.C18IA;
import X.C18IB;
import X.C18IG;
import X.C18IJ;
import X.C18IL;
import X.C18IP;
import X.C18IQ;
import X.C1971707nv;
import X.C19719512Dh;
import X.C1972007ny;
import X.C1C7U;
import X.C20146713sH;
import X.C20321214fK;
import X.C2097608Jq;
import X.C212369188x;
import X.C21241518Ar;
import X.C21244318Bt;
import X.C21244418Bu;
import X.C21244618Bw;
import X.C21246118Cl;
import X.C21246718Cr;
import X.C21246818Cs;
import X.C21246918Ct;
import X.C21247918Dd;
import X.C21248618Dk;
import X.C21248718Dl;
import X.C21249518Dt;
import X.C21250518Ed;
import X.C21250918Eh;
import X.C21257018Gq;
import X.C21258818Hi;
import X.C21258918Hj;
import X.C21259218Hm;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C259800zU;
import X.C452501pT;
import X.C589920NBu;
import X.C786410Ut5;
import X.C786530UtH;
import X.C789730UyR;
import X.EnumC20164613vA;
import X.EnumC21244218Bs;
import X.InterfaceC1549050qPf;
import X.InterfaceC20337014hs;
import X.InterfaceC21246518Cp;
import X.InterfaceC21252118Et;
import X.InterfaceC21252218Eu;
import X.InterfaceC21258218Hc;
import X.InterfaceC2217461Bqa;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.bcm.impl.model.BcmPageInfo;
import com.bytedance.android.btm.api.BtmPageLifecycle;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.PageProp;
import com.bytedance.android.btm.api.config.BtmEventConfigModel;
import com.bytedance.android.btm.api.model.BtmItemBuilder;
import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.btm.api.util.LazyKt;
import com.bytedance.android.btm.api.util.LazyNonNull;
import com.bytedance.android.btm.api.util.LazyNullable;
import com.bytedance.android.btm.impl.BtmServiceImpl;
import com.bytedance.android.btm.impl.ShowIdUpdateReason;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.android.btm.impl.page.model.PageInfoStack;
import com.bytedance.android.btm.impl.setting.AllowListItem;
import com.bytedance.android.btm.impl.setting.BtmSettingModel;
import com.bytedance.android.btm.impl.setting.BugfixModel;
import com.bytedance.android.btm.impl.setting.EntranceInfoParamsOfflineConfig;
import com.bytedance.android.btm.impl.setting.FeatureModel;
import com.bytedance.android.btm.impl.setting.SchemaRulesModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class BtmServiceImpl implements C18IQ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] $$delegatedProperties;
    public static final BtmServiceImpl INSTANCE;
    public static final String TAG_CLASS_PREFIX;
    public static final String TAG_INIT;
    public static final C01GW appLogOpt$delegate;
    public static final C01GW chainRecorder$delegate;
    public static int initPrerequisites;
    public static int initStatus;
    public static long initTime;
    public static final LazyNonNull launchId$delegate;
    public static Integer notInitOnLaunch;
    public static boolean openPerfOpt;
    public static final LazyNullable saveCacheCallback$delegate;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(BtmServiceImpl.class, "saveCacheCallback", "getSaveCacheCallback()Lcom/bytedance/android/btm/impl/SaveCacheCallback;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217371BqR c2217371BqR2 = new C2217371BqR(BtmServiceImpl.class, "launchId", "getLaunchId()Ljava/lang/String;", 0);
        c09r3.getClass();
        $$delegatedProperties = new InterfaceC2217461Bqa[]{c2217371BqR, c2217371BqR2};
        INSTANCE = new BtmServiceImpl();
        TAG_CLASS_PREFIX = "BtmServiceImpl_";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BtmServiceImpl_");
        sbLIZ.append("init");
        TAG_INIT = C2188811AlT.LIZIZ(sbLIZ);
        LazyKt lazyKt = LazyKt.INSTANCE;
        saveCacheCallback$delegate = lazyKt.lazyNullable(new C18AB());
        openPerfOpt = true;
        launchId$delegate = lazyKt.lazyNonNull(new C1870130ylX());
        chainRecorder$delegate = C452501pT.LIZIZ(new C18HU());
        appLogOpt$delegate = C452501pT.LIZIZ(new C18D6());
        initPrerequisites = 3;
    }

    public static /* synthetic */ void lambda$semisugar$init$lambda$2$0() {
        C1C7U.LIZ("BtmServiceImpl@4be5.init$1L");
        init$lambda$2();
        C1C7U.LIZIZ("BtmServiceImpl@4be5.init$1L");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138  */
    @Override // X.C18IQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init() {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.btm.impl.BtmServiceImpl.init():void");
    }

    @Override // X.C18IQ
    public void onRegisterHybridContainer(C1206720hVW c1206720hVW) {
    }

    private final C18DI getAppLogOpt() {
        return (C18DI) appLogOpt$delegate.getValue();
    }

    private final C21241518Ar getChainRecorder() {
        return (C21241518Ar) chainRecorder$delegate.getValue();
    }

    public static final void init$lambda$2() {
        if (C18IP.LIZ.LIZLLL()) {
            try {
                Class<?> cls = Class.forName("com.bytedance.android.btm.debugtool.base.DebugToolInitializer");
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                Method method = cls.getMethod("init", new Class[0]);
                method.setAccessible(true);
                method.invoke(objNewInstance, new Object[0]);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // X.C18IQ
    public boolean enableRouterMonitor() {
        BtmSettingModel btmSettingModel = C18CS.LIZ;
        return C18CS.LIZ.LIZJ().LJIIL().LJFF() == 1;
    }

    public C18DI getAppLog() {
        if (openPerfOpt) {
            return getAppLogOpt();
        }
        C18D5 c18d5 = C18D5.LIZ;
        if (C18D5.LIZLLL == null) {
            c18d5.LIZIZ();
        }
        return C18D5.LIZLLL;
    }

    public final C18DI getAppLogExp() {
        if (openPerfOpt) {
            return getAppLogOpt();
        }
        C18D5 c18d5 = C18D5.LIZ;
        if (C18D5.LIZLLL == null) {
            c18d5.LIZIZ();
        }
        return C18D5.LIZLLL;
    }

    public final InterfaceC21252218Eu getAppStatusObserver() {
        return openPerfOpt ? C20146713sH.LL : C18D5.LIZ();
    }

    public final C21241518Ar getChainRecorderExp() {
        if (openPerfOpt) {
            return getChainRecorder();
        }
        C18D5 c18d5 = C18D5.LIZ;
        if (C18D5.LIZJ == null) {
            c18d5.LIZIZ();
        }
        return C18D5.LIZJ;
    }

    public final long getInitTimeExp() {
        return openPerfOpt ? initTime : C18D5.LJFF;
    }

    @Override // X.C18IQ
    public Object getLastCreatePage() {
        Object obj;
        C589920NBu<Object> c589920NBu = C18CJ.LIZLLL;
        if (c589920NBu == null || (obj = c589920NBu.get()) == null) {
            return getCurrentResumedPage();
        }
        C18CK.LIZJ("getLastCreatePage", new C1869060yjo(obj), false);
        return obj;
    }

    public final String getLaunchId() {
        return (String) launchId$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final String getLaunchIdExp() {
        return openPerfOpt ? getLaunchId() : C18D5.LJ;
    }

    @Override // X.C18IQ
    public BtmPageLifecycle getPageLifecycle() {
        C18CK.LIZLLL("NA_getPageLifecycle", new C18H4());
        return new BtmPageLifecycle() { // from class: X.18ED
            @Override // com.bytedance.android.btm.api.BtmPageLifecycle
            public final void LIZJ(Object obj) {
                if (C18CS.LIZ.LJ() != 1) {
                    return;
                }
                if (obj == null) {
                    C18CK.LJFF("BtmManualLifecycleCallbackV2_onPageDestroy", new C18HP());
                    return;
                }
                C18CK.LJFF("BtmManualLifecycleCallbackV2_onPageDestroy", new C18HW(obj.getClass().getName()));
                String str = C18EO.LIZ;
                C18CK.LJI(C18EO.LIZLLL, new C18IC(obj.getClass().getName()));
                if (obj instanceof Activity) {
                    C18E4.LIZJ(obj);
                    return;
                }
                if (obj instanceof Fragment) {
                    C18EB.LJIIJ((Fragment) obj);
                    return;
                }
                if (obj instanceof Dialog) {
                    C21250918Eh c21250918Eh = C21250918Eh.LIZ;
                    C18E4.LIZJ(obj);
                } else {
                    if (!(obj instanceof View)) {
                        return;
                    }
                    C18FH c18fh = C18FH.LIZ;
                    C18E4.LIZJ(obj);
                }
            }

            @Override // com.bytedance.android.btm.api.BtmPageLifecycle
            public final BtmPageLifecycle.State LJI(Object obj) {
                if (C18CS.LIZ.LJ() != 1) {
                    return null;
                }
                if (obj == null) {
                    C18CK.LJFF("BtmManualLifecycleCallbackV2_getNativeState", new C21257918Gz());
                    return null;
                }
                C18CK.LJFF("BtmManualLifecycleCallbackV2_getNativeState", new C18HK(obj.getClass().getName()));
                C21248618Dk.LIZ.getClass();
                PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(obj);
                if (pageInfoStackLJIIIZ == null) {
                    return null;
                }
                return pageInfoStackLJIIIZ.getNativeState();
            }

            @Override // com.bytedance.android.btm.api.BtmPageLifecycle
            public final void LIZ(Object obj, boolean z) {
                int iIntValue;
                if (C18CS.LIZ.LJ() != 1) {
                    return;
                }
                BugfixModel bugfixModelLIZIZ = C18CS.LIZ.LIZIZ();
                bugfixModelLIZIZ.getClass();
                Object objLIZIZ = C1972007ny.LIZIZ(bugfixModelLIZIZ, "fix_disableUserVisibleHint", Integer.valueOf(bugfixModelLIZIZ.fixDisableUserVisibleHint));
                if (!(objLIZIZ instanceof Integer)) {
                    objLIZIZ = null;
                }
                Integer num = (Integer) objLIZIZ;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = bugfixModelLIZIZ.fixDisableUserVisibleHint;
                }
                bugfixModelLIZIZ.fixDisableUserVisibleHint = iIntValue;
                if (iIntValue == 1 && (obj instanceof InterfaceC21258318Hd) && Intrinsics.LJFF(((InterfaceC21258318Hd) obj).LIZ(), Boolean.TRUE)) {
                    C21248618Dk.LIZ.getClass();
                    PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(obj);
                    if (pageInfoStackLJIIIZ != null) {
                        pageInfoStackLJIIIZ.setUserVisibleHint(null);
                        return;
                    }
                    return;
                }
                C18CK.LJFF("BtmManualLifecycleCallbackV2_setUserVisibleHint", new C1869130yjv(obj.getClass().getName(), z));
                C21248618Dk.LIZ.getClass();
                PageInfoStack pageInfoStackLJIIIZ2 = C21248618Dk.LJIIIZ(obj);
                if (pageInfoStackLJIIIZ2 != null) {
                    pageInfoStackLJIIIZ2.setUserVisibleHint(Boolean.valueOf(z));
                }
            }

            @Override // com.bytedance.android.btm.api.BtmPageLifecycle
            public final void LIZIZ(Object obj, BtmPageLifecycle.State state) {
                if (C18CS.LIZ.LJ() != 1) {
                    return;
                }
                if (obj == null) {
                    C18CK.LJFF("BtmManualLifecycleCallbackV2_setNativeState", new C18H0());
                    return;
                }
                C18CK.LJFF("BtmManualLifecycleCallbackV2_setNativeState", new C18HL(obj.getClass().getName()));
                C21248618Dk.LIZ.getClass();
                PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(obj);
                if (pageInfoStackLJIIIZ != null) {
                    pageInfoStackLJIIIZ.setNativeState(state);
                }
            }

            @Override // com.bytedance.android.btm.api.BtmPageLifecycle
            public final void LIZLLL(Object obj, Boolean bool, C0PSL c0psl) {
                LJII(obj, bool, c0psl, false);
            }

            @Override // com.bytedance.android.btm.api.BtmPageLifecycle
            public final boolean LJ(Object obj, boolean z, C0PSL c0psl) {
                int iIntValue;
                if (C18CS.LIZ.LJ() != 1) {
                    return false;
                }
                String name = obj.getClass().getName();
                C18CK.LJIIL("BtmManualLifecycleCallbackV2_setUserVisibleHintCore", new C054500Hv(name, z));
                BugfixModel bugfixModelLIZIZ = C18CS.LIZ.LIZIZ();
                bugfixModelLIZIZ.getClass();
                Object objLIZIZ = C1972007ny.LIZIZ(bugfixModelLIZIZ, "fix_show_api", Integer.valueOf(bugfixModelLIZIZ.fixShowAPI));
                if (!(objLIZIZ instanceof Integer)) {
                    objLIZIZ = null;
                }
                Integer num = (Integer) objLIZIZ;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = bugfixModelLIZIZ.fixShowAPI;
                }
                bugfixModelLIZIZ.fixShowAPI = iIntValue;
                if (iIntValue == 1) {
                    if (z) {
                        LJII(obj, null, c0psl, true);
                    }
                } else if (z && BtmSDK.INSTANCE.getPageLifecycle().LJI(obj) == BtmPageLifecycle.State.RESUMED) {
                    if ((obj instanceof InterfaceC21258318Hd) && Intrinsics.LJFF(((InterfaceC21258318Hd) obj).LIZ(), Boolean.TRUE)) {
                        C18CK.LJIIL("BtmManualLifecycleCallbackV2_setUserVisibleHintCore", new C1155120gAI(name));
                        return true;
                    }
                    LJII(obj, null, c0psl, true);
                    return false;
                }
                return false;
            }

            @Override // com.bytedance.android.btm.api.BtmPageLifecycle
            public final void LJFF(Object obj, Boolean bool, C669610QOh c669610QOh) {
                boolean z;
                EnumC21251218Ek enumC21251218Ek;
                if (C18CS.LIZ.LJ() != 1) {
                    return;
                }
                if (obj == null) {
                    C18CK.LJFF("BtmManualLifecycleCallbackV2_onPageHide", new C1869170yjz());
                    return;
                }
                String name = obj.getClass().getName();
                if (c669610QOh != null) {
                    z = c669610QOh.LIZ;
                } else {
                    z = false;
                }
                C18CK.LJFF("BtmManualLifecycleCallbackV2_onPageHide", new C1869140yjw(name, z, bool));
                C21248618Dk.LIZ.getClass();
                PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(obj);
                if (pageInfoStackLJIIIZ == null) {
                    return;
                }
                pageInfoStackLJIIIZ.current().setReuse(z);
                if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    enumC21251218Ek = EnumC21251218Ek.ManualForward;
                } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
                    enumC21251218Ek = EnumC21251218Ek.ManualBack;
                } else {
                    enumC21251218Ek = EnumC21251218Ek.ManualNotSure;
                }
                C18EO.LIZIZ(obj, enumC21251218Ek);
            }

            public static void LJII(Object obj, Boolean bool, C0PSL c0psl, boolean z) {
                boolean z2;
                EnumC21250718Ef enumC21250718Ef;
                if (C18CS.LIZ.LJ() != 1) {
                    return;
                }
                if (obj == null) {
                    C18CK.LJFF("BtmManualLifecycleCallbackV2_onPageShow", new C1869180yk0());
                    return;
                }
                String name = obj.getClass().getName();
                if (c0psl != null) {
                    z2 = c0psl.LIZ;
                } else {
                    z2 = false;
                }
                C18CK.LJFF("BtmManualLifecycleCallbackV2_onPageShow", new C1869150yjx(z2, z, name, bool));
                C21248618Dk.LIZ.getClass();
                PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(obj);
                if (pageInfoStackLJIIIZ == null) {
                    return;
                }
                pageInfoStackLJIIIZ.current().updateShowIdIfNeed(ShowIdUpdateReason.ManualPageShow);
                pageInfoStackLJIIIZ.current().setReuse(z2);
                if (z) {
                    enumC21250718Ef = EnumC21250718Ef.UserVisibleHint;
                } else if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    enumC21250718Ef = EnumC21250718Ef.ManualForward;
                } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
                    enumC21250718Ef = EnumC21250718Ef.ManualBack;
                } else {
                    enumC21250718Ef = EnumC21250718Ef.ManualNotSure;
                }
                EnumC21251518En enumC21251518EnLIZJ = C18EO.LIZJ(obj, enumC21250718Ef);
                if (((C18CS.LIZ.LIZIZ().LJIIJJI() == 1 && enumC21251518EnLIZJ == EnumC21251518En.PageStateDuplicate) || (C18CS.LIZ.LIZIZ().LJIIJJI() == 2 && enumC21251518EnLIZJ != null)) && z2) {
                    pageInfoStackLJIIIZ.current().setReuse(false);
                    C18CK.LJFF("BtmManualLifecycleCallbackV2_onPageShow", new C1869160yjy());
                }
            }
        };
    }

    public final InterfaceC21246518Cp getSaveCacheCallback() {
        return (InterfaceC21246518Cp) saveCacheCallback$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public boolean judgeTopActivity() {
        BugfixModel bugfixModelLIZIZ = C18CS.LIZ.LIZIZ();
        bugfixModelLIZIZ.getClass();
        Object objLIZIZ = C1972007ny.LIZIZ(bugfixModelLIZIZ, "judge_top_activity", Integer.valueOf(bugfixModelLIZIZ.judgeTopActivity));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : bugfixModelLIZIZ.judgeTopActivity;
        bugfixModelLIZIZ.judgeTopActivity = iIntValue;
        return iIntValue == 1;
    }

    @Override // X.C18IQ
    public void onLowMemory() throws JSONException {
        if (C18CS.LIZ.LIZLLL().LJIILLIIL() != 1) {
            boolean zIsAppBackground = getAppStatusObserver().isAppBackground();
            C18CK.LIZJ("onLowMemory", new C1869780yky(zIsAppBackground), true);
            if (zIsAppBackground) {
                C21246118Cl.LIZIZ();
            }
        }
    }

    @Override // X.C18IQ
    public void preloadWhenInit() {
        if (C18CS.LIZ.LJ() != 1) {
            return;
        }
        C21250518Ed.LJ.getClass();
        C21250518Ed.LJIIJ();
        C21248618Dk c21248618Dk = C21248618Dk.LIZ;
        PageInfoStack.Companion.getClass();
        PageInfoStack pageInfoStackLIZIZ = C21248718Dl.LIZIZ(false);
        pageInfoStackLIZIZ.current();
        c21248618Dk.getClass();
        C21248618Dk.LJIJJ = pageInfoStackLIZIZ;
    }

    @Override // X.C18IQ
    public boolean removeBcmChainPageId() {
        BtmSettingModel btmSettingModel = C18CS.LIZ;
        return C18CS.LIZ.LIZJ().LJIIJ() == 1;
    }

    public boolean useV2Api() {
        BtmSettingModel btmSettingModel = C18CS.LIZ;
        return C18CS.LIZ.LIZJ().LJIIL().LIZIZ() == 1;
    }

    @Override // X.C18IQ
    public boolean useV2ApiMall() {
        BtmSettingModel btmSettingModel = C18CS.LIZ;
        return C18CS.LIZ.LIZJ().LJIIL().LIZJ() == 1;
    }

    @Override // X.C18IQ
    public Object getCurrentResumedPage() {
        C589920NBu<Object> c589920NBu;
        Object obj;
        Object objLIZ = C18CJ.LIZ();
        if (objLIZ != null) {
            C18CK.LIZJ("getCurrentResumedPage", new C1869070yjp(objLIZ), false);
            return objLIZ;
        }
        C21247918Dd c21247918Dd = C18E3.LJII;
        if (c21247918Dd != null && (c589920NBu = c21247918Dd.LIZ) != null && (obj = c589920NBu.get()) != null) {
            C21248618Dk.LIZ.getClass();
            if (C21248618Dk.LJIIIIZZ(obj) != null) {
                C18CK.LIZJ("getCurrentResumedPage", new C1869080yjq(obj), false);
                return obj;
            }
        }
        C18CK.LIZJ("getCurrentResumedPage", new C1869090yjr(), false);
        return null;
    }

    public Activity getTopActivity() {
        return getAppStatusObserver().getTopActivity();
    }

    public C18IL getActivityLifeCycleAopListener() {
        return C18E2.LL;
    }

    @Override // X.C18IQ
    public InterfaceC1549050qPf getHybridContainerLoadSchemaCallback() {
        return C18EU.LIZ;
    }

    @Override // X.C18HZ
    public int getInitPrerequisites() {
        return initPrerequisites;
    }

    @Override // X.C18HZ
    public int getInitStatus() {
        return initStatus;
    }

    public final long getInitTime() {
        return initTime;
    }

    @Override // X.C18IQ
    public C18IJ getLaunchApi() {
        return C21258918Hj.LIZ;
    }

    @Override // X.C18IQ
    public InterfaceC20337014hs getMonitor() {
        return C18CE.LIZ;
    }

    public final Integer getNotInitOnLaunch() {
        return notInitOnLaunch;
    }

    public final boolean getOpenPerfOpt() {
        return openPerfOpt;
    }

    @Override // X.C18IQ
    public C18A6 getThreadExecutor() {
        return C18GU.LIZ;
    }

    @Override // X.C18IQ
    public C786530UtH addBtmEventParam(C786530UtH c786530UtH) throws JSONException {
        if (C18CS.LIZ.LJ() != 1) {
            JSONObject jSONObject = c786530UtH.LIZLLL;
            if (jSONObject != null) {
                jSONObject.remove("btm_id");
            }
            return c786530UtH;
        }
        C21244418Bu c21244418Bu = C21244418Bu.LIZ;
        c21244418Bu.getClass();
        JSONObject jSONObject2 = c786530UtH.LIZLLL;
        if (jSONObject2 != null) {
            if (jSONObject2.has("btm_id")) {
                C21244418Bu.LIZ.LIZ(c786530UtH.LIZ(), jSONObject2);
            } else {
                if (!jSONObject2.has("btm") && !jSONObject2.has("btm_pre")) {
                    jSONObject2.has("btm_ppre");
                }
                c21244418Bu.LIZLLL(jSONObject2, c786530UtH.LIZ());
                return c786530UtH;
            }
        }
        return c786530UtH;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.18Hb] */
    @Override // X.C18IQ
    public void checkEventParam(final C786530UtH c786530UtH) {
        C18GO.LL.getClass();
        if (C18GO.LLILZ) {
            ?? r4 = new Object(c786530UtH) { // from class: X.18Hb
                {
                    c786530UtH.LIZ();
                }
            };
            try {
                ArrayList arrayList = new ArrayList();
                for (InterfaceC21258218Hc interfaceC21258218Hc : C18GO.LLILLJJLI) {
                    if (interfaceC21258218Hc.LIZ()) {
                        arrayList.add(interfaceC21258218Hc);
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (!((LinkedBlockingDeque) C18GO.LLILLL.getValue()).offer(new C21257018Gq(r4, arrayList))) {
                        C18CE.LIZ.LJFF(1499, "EventCheckerManager, Queue is full", null, null, false);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C18CE.LIZ.LJFF(1498, "EventCheckerManager#sendEvent", null, e, false);
            }
        }
    }

    @Override // X.C18IQ
    public JSONObject createBtmChain(C18EK c18ek) throws JSONException {
        String strLIZJ;
        C18CK.LIZLLL("NA_createBtmChain", new C1869110yjt(c18ek));
        if (C18CS.LIZ.LJ() != 1) {
            return new JSONObject();
        }
        C18CE.LIZJ(c18ek, "createBtmChain");
        JSONObject jSONObject = new JSONObject();
        C18CM.LIZ.getClass();
        int i = 0;
        if (c18ek.LIZ()) {
            strLIZJ = C18CM.LIZJ(c18ek, false, null, false);
        } else {
            strLIZJ = C18CM.LJ(c18ek).LIZ;
        }
        if (c18ek.LJII) {
            i = c18ek.LJIIIIZZ;
        }
        Map mapLIZIZ = C21244418Bu.LIZIZ(C21244418Bu.LIZ, strLIZJ, i, null, null, null, 28);
        if (!mapLIZIZ.isEmpty()) {
            for (Map.Entry entry : ((LinkedHashMap) mapLIZIZ).entrySet()) {
                jSONObject.putOpt((String) entry.getKey(), entry.getValue());
            }
        }
        return jSONObject;
    }

    @Override // X.C18IQ
    public String createBtmId(C18EK c18ek) {
        C18CK.LIZLLL("NA_createBtmId", new C1869120yju(c18ek));
        if (C18CS.LIZ.LJ() != 1) {
            return "";
        }
        if (c18ek.LIZ() && C18CS.LIZ.LIZJ().LJIIL().LJI() != 0 && C18CS.LIZ.LIZJ().LJIIL().LJI() != 2) {
            List<String> listLIZ = C18CS.LIZ.LIZJ().LJIIL().LIZ();
            if (!listLIZ.isEmpty()) {
                Regex regex = C18C3.LIZ;
                List listLJIIJJI = C1697810uHb.LJIIJJI(C18C3.LIZIZ(c18ek.LIZ), C18C3.LJII(c18ek.LIZ), c18ek.LIZ);
                Iterator<String> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    if (listLJIIJJI.contains(it2.next())) {
                        break;
                    }
                }
                C18CE.LIZ.LIZIZ(2310, "use old api", null, null, false, new C18CB(c18ek));
            } else {
                C18CE.LIZ.LIZIZ(2310, "use old api", null, null, false, new C18CB(c18ek));
            }
        }
        C18CM.LIZ.getClass();
        if (c18ek.LIZ()) {
            return C18CM.LIZJ(c18ek, false, null, false);
        }
        return C18CM.LJ(c18ek).LIZ;
    }

    @Override // X.C18IQ
    public boolean enableDeepLinkProcess(String str) {
        C21246718Cr.LIZ.getClass();
        if (str == null) {
            return false;
        }
        return C18CS.LIZ.LIZJ().LJIJ().LJI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C18IQ
    public C21246818Cs getBtmPageInfo(PageFinder pageFinder) {
        if (C18CS.LIZ.LJ() != 1) {
            return null;
        }
        C18B9 c18b9 = C18B9.LIZ;
        Object objLIZ = C18B9.LIZ(pageFinder);
        if (objLIZ == null) {
            objLIZ = C18CJ.LIZ();
        }
        C21248618Dk.LIZ.getClass();
        PageInfo pageInfoLJIIIIZZ = C21248618Dk.LJIIIIZZ(objLIZ);
        if (pageInfoLJIIIIZZ == null) {
            return null;
        }
        String pageShowId = pageInfoLJIIIIZZ.getPageShowId();
        String pageBtm = pageInfoLJIIIIZZ.getPageBtm();
        if (pageBtm == null) {
            pageBtm = "";
        }
        return new C21246818Cs(pageShowId, pageBtm, pageInfoLJIIIIZZ.getPageId(), pageInfoLJIIIIZZ.getInstanceId(), pageInfoLJIIIIZZ.getLastPageShowId(), 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 32736);
    }

    @Override // X.C18IQ
    public C21246818Cs getBtmPageInfoV2(PageFinder pageFinder) {
        String nodeId;
        String strLJIIL;
        String value;
        BcmPageInfo bcmPageInfo;
        Map<String, BcmParams> pageParams;
        BcmParams bcmParams = null;
        if (C18CS.LIZ.LJ() != 1) {
            return null;
        }
        C18B9 c18b9 = C18B9.LIZ;
        Object objLIZ = C18B9.LIZ(pageFinder);
        C21248618Dk.LIZ.getClass();
        PageInfo pageInfoLJIIIIZZ = C21248618Dk.LJIIIIZZ(objLIZ);
        if (pageInfoLJIIIIZZ == null) {
            return null;
        }
        InterfaceC21252118Et interfaceC21252118EtLIZ = C18EN.LIZ(objLIZ);
        String pageShowId = pageInfoLJIIIIZZ.getPageShowId();
        String pageBtm = pageInfoLJIIIIZZ.getPageBtm();
        if (pageBtm == null) {
            pageBtm = "";
        }
        String pageId = pageInfoLJIIIIZZ.getPageId();
        String instanceId = pageInfoLJIIIIZZ.getInstanceId();
        String lastPageShowId = pageInfoLJIIIIZZ.getLastPageShowId();
        int step = pageInfoLJIIIIZZ.getStep();
        if (interfaceC21252118EtLIZ != null) {
            nodeId = interfaceC21252118EtLIZ.getNodeId();
            strLJIIL = interfaceC21252118EtLIZ.LJIIL();
        } else {
            nodeId = null;
            strLJIIL = null;
        }
        String str = CardStruct.IStatusCode.DEFAULT;
        String str2 = null;
        EnumC21244218Bs recoveryFrom = pageInfoLJIIIIZZ.getRecoveryFrom();
        if (recoveryFrom != null) {
            value = recoveryFrom.getValue();
        } else {
            value = null;
        }
        if ((pageInfoLJIIIIZZ instanceof BcmPageInfo) && (bcmPageInfo = (BcmPageInfo) pageInfoLJIIIIZZ) != null && (pageParams = bcmPageInfo.getPageParams()) != null) {
            bcmParams = pageParams.get("ecom_entrance");
        }
        return new C21246818Cs(pageShowId, pageBtm, pageId, instanceId, lastPageShowId, step, nodeId, strLJIIL, str, str2, value, bcmParams, 16384);
    }

    @Override // X.C18IQ
    public String getPageId(PageFinder pageFinder) {
        String str;
        String pageId = null;
        if (C18CS.LIZ.LJ() != 1) {
            return null;
        }
        if (pageFinder != null && (str = pageFinder.btmPageId) != null) {
            return str;
        }
        C18B9 c18b9 = C18B9.LIZ;
        Object objLIZ = C18B9.LIZ(pageFinder);
        if (objLIZ == null) {
            C18CE.LIZ.LIZIZ(1115, "", null, null, false, new C18CD(pageFinder));
            return null;
        }
        C21248618Dk.LIZ.getClass();
        PageInfo pageInfoLJIIIIZZ = C21248618Dk.LJIIIIZZ(objLIZ);
        if (pageInfoLJIIIIZZ == null || (pageId = pageInfoLJIIIIZZ.getPageId()) == null) {
            C18CE.LJI(1115, pageInfoLJIIIIZZ, null, null, new C18CC(objLIZ.getClass().getCanonicalName(), pageFinder), null, 188);
        }
        return pageId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [T, X.18E9] */
    /* JADX WARN: Type inference failed for: r0v42, types: [T, X.18E9] */
    /* JADX WARN: Type inference failed for: r1v14, types: [T, X.18E9] */
    /* JADX WARN: Type inference failed for: r1v19, types: [T, X.18E9] */
    @Override // X.C18IQ
    public void onRegisterPage(C18EW c18ew) {
        String canonicalName;
        PageProp pageProp;
        BtmPageLifecycle.State nativeState;
        View decorView;
        String canonicalName2;
        if (C18CS.LIZ.LJ() != 1) {
            return;
        }
        Object obj = c18ew.LIZ.get();
        C18E9 c18e9 = null;
        if (obj != null) {
            canonicalName = obj.getClass().getCanonicalName();
        } else {
            canonicalName = null;
        }
        String str = "null";
        if (canonicalName == null) {
            canonicalName = "null";
        }
        C18CE c18ce = C18CE.LIZ;
        c18ce.LIZLLL(c18ew.LIZIZ, canonicalName);
        if (c18ew.LIZ.get() == null) {
            C18CK.LJFF("OnRegisterPageCallback_onRegisterPage", new C18I7());
        }
        Object obj2 = c18ew.LIZ.get();
        if (obj2 != null && (canonicalName2 = obj2.getClass().getCanonicalName()) != null) {
            str = canonicalName2;
        }
        Object obj3 = c18ew.LIZ.get();
        if (obj3 != null) {
            C18CK.LJFF("OnRegisterPageCallback_onRegisterPage", new C18I9(str));
            boolean z = obj3 instanceof Dialog;
            if (z) {
                Window window = ((Dialog) obj3).getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    C21248618Dk.LIZ.getClass();
                    C21248618Dk.LJIILLIIL.put(new C589920NBu<>(decorView), new C589920NBu<>(obj3));
                }
            } else if (obj3 instanceof View) {
                C21248618Dk.LIZ.getClass();
                ((ArrayList) C21248618Dk.LJIIZILJ).add(new C589920NBu(obj3));
            }
            C21248618Dk c21248618Dk = C21248618Dk.LIZ;
            Object obj4 = c18ew.LIZ.get();
            c21248618Dk.getClass();
            PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(obj4);
            if (pageInfoStackLJIIIZ != null && (nativeState = pageInfoStackLJIIIZ.getNativeState()) != null && nativeState != BtmPageLifecycle.State.INITIALIZED && nativeState != BtmPageLifecycle.State.CREATED) {
                c18ce.LIZIZ(2016, "", null, null, false, new C18GV(str, c18ew));
            }
            String str2 = C18EO.LIZ;
            PageProp pageProp2 = new PageProp(c18ew.LIZIZ, c18ew.LIZJ, c18ew.LIZLLL, c18ew.LJ, c18ew.LJFF, c18ew.LJI);
            C18CK.LJI(C18EO.LIZ, new C18IB(obj3.getClass().getName()));
            if (obj3 instanceof Activity) {
                C18EA.LJIIIIZZ((Activity) obj3, null, pageProp2);
            } else if (obj3 instanceof Fragment) {
                C18EB.LJIIIZ((Fragment) obj3, null, pageProp2);
            } else if (z) {
                C21250918Eh c21250918Eh = C21250918Eh.LIZ;
                Dialog dialog = (Dialog) obj3;
                String name = dialog.getClass().getName();
                c21248618Dk.getClass();
                PageInfoStack pageInfoStackLJIIIZ2 = C21248618Dk.LJIIIZ(dialog);
                if (pageInfoStackLJIIIZ2 != null) {
                    C18CK.LJI(C21250918Eh.LIZIZ, new C1554660qYi(name, pageInfoStackLJIIIZ2));
                } else {
                    C18CK.LJI(C21250918Eh.LIZIZ, new C18G1(name, pageProp2));
                    BufferBtm bufferBtmLIZJ = C18E3.LIZJ(dialog, pageProp2, false, null);
                    InterfaceC21252118Et.LJJLIIIJLLLLLLLZ.getClass();
                    C18EF c18ef = new C18EF(dialog);
                    c18ef.LLILZLL = true;
                    c18ef.LLIZ = false;
                    Activity activityLIZ = C789730UyR.LIZ(dialog);
                    if (activityLIZ != null) {
                        C259800zU c259800zU = new C259800zU();
                        ?? LIZIZ = C18EN.LIZIZ(activityLIZ);
                        c259800zU.element = LIZIZ;
                        if (LIZIZ == 0) {
                            ?? c18e92 = new C18E9(activityLIZ);
                            C18EF c18ef2 = c18e92.LLILLL;
                            c18ef2.LLILZLL = false;
                            c18ef2.LLIZ = false;
                            c259800zU.element = c18e92;
                            C18EN.LIZLLL(c18e92);
                        }
                        C18E9 c18e93 = (C18E9) c259800zU.element;
                        c18e93.LIZ(c18ef, c18e93.LLILLL);
                        C18CK.LJI(C21250918Eh.LIZJ, new C18F5(dialog.getClass().getName(), c259800zU));
                        c18e9 = (C18E9) c259800zU.element;
                    }
                    C18E4.LIZ(dialog, c18e9, bufferBtmLIZJ);
                }
            } else if (obj3 instanceof View) {
                C18FH c18fh = C18FH.LIZ;
                View view = (View) obj3;
                String name2 = view.getClass().getName();
                C18CK.LJI(C18FH.LIZIZ, new C18G2(name2, pageProp2));
                PageProp[] pagePropArr = {pageProp2, C18EY.LIZ(view)};
                int i = 0;
                while (true) {
                    pageProp = pagePropArr[i];
                    if (pageProp != null) {
                        break;
                    }
                    i++;
                    if (i >= 2) {
                        pageProp = null;
                        break;
                    }
                }
                C18CK.LJI(C18FH.LIZIZ, new C1555750qaT(pageProp, name2));
                BufferBtm bufferBtmLIZJ2 = C18E3.LIZJ(view, pageProp, false, null);
                InterfaceC21252118Et.LJJLIIIJLLLLLLLZ.getClass();
                C18EF c18ef3 = new C18EF(view);
                c18ef3.LLILZLL = true;
                c18ef3.LLIZ = false;
                Activity activityLIZIZ = C789730UyR.LIZIZ(view);
                if (activityLIZIZ != null) {
                    C259800zU c259800zU2 = new C259800zU();
                    ?? LIZIZ2 = C18EN.LIZIZ(activityLIZIZ);
                    c259800zU2.element = LIZIZ2;
                    if (LIZIZ2 == 0) {
                        ?? c18e94 = new C18E9(activityLIZIZ);
                        C18EF c18ef4 = c18e94.LLILLL;
                        c18ef4.LLILZLL = false;
                        c18ef4.LLIZ = false;
                        c259800zU2.element = c18e94;
                        C18EN.LIZLLL(c18e94);
                    }
                    C18E9 c18e95 = (C18E9) c259800zU2.element;
                    c18e95.LIZ(c18ef3, c18e95.LLILLL);
                    C18CK.LJI(C18FH.LIZJ, new C18F6(view.getClass().getName(), c259800zU2));
                    c18e9 = (C18E9) c259800zU2.element;
                }
                C18E4.LIZ(view, c18e9, bufferBtmLIZJ2);
            }
            C18EP.LIZIZ(obj3);
        }
    }

    @Override // X.C18IQ
    public void onUnregisterPage(C18EW c18ew) {
        if (C18CS.LIZ.LJ() != 1) {
            return;
        }
        if (c18ew.LIZ.get() == null) {
            C18CK.LJFF("OnRegisterPageCallback_onUnregisterPage", new C18I8());
        }
        String name = C18EW.class.getName();
        Object obj = c18ew.LIZ.get();
        if (obj != null) {
            C18CK.LJFF("OnRegisterPageCallback_onUnregisterPage", new C18IA(name));
            if (obj instanceof View) {
                C21248618Dk.LIZ.getClass();
                ((ArrayList) C21248618Dk.LJIIZILJ).remove(new C589920NBu(obj));
            }
            C21248618Dk.LIZ.getClass();
            C21248618Dk.LIZLLL.remove(new C589920NBu(obj));
        }
    }

    @Override // X.C18IQ
    public void processEventModel(C786530UtH c786530UtH) throws JSONException {
        JSONObject jSONObject;
        Object objOpt;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        String strOptString;
        Regex regex = C21258818Hi.LIZ;
        FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
        featureModelLIZJ.getClass();
        C1972007ny.LIZLLL(featureModelLIZJ.getLazyDataRootKey(), featureModelLIZJ.getLazyDataKey(), featureModelLIZJ.entranceInfoParamsOfflineConfig, "offline_entrance_info_config");
        EntranceInfoParamsOfflineConfig entranceInfoParamsOfflineConfig = featureModelLIZJ.entranceInfoParamsOfflineConfig;
        if (entranceInfoParamsOfflineConfig.LJ()) {
            List<AllowListItem> listLIZ = entranceInfoParamsOfflineConfig.LIZ();
            boolean z = false;
            if (!listLIZ.isEmpty()) {
                for (AllowListItem allowListItem : listLIZ) {
                    JSONObject jSONObject4 = c786530UtH.LIZLLL;
                    if (jSONObject4 != null) {
                        strOptString = jSONObject4.optString(allowListItem.LIZ());
                    } else {
                        strOptString = null;
                    }
                    if (!Intrinsics.LJFF(strOptString, allowListItem.LIZIZ())) {
                        return;
                    }
                }
            }
            JSONObject jSONObject5 = c786530UtH.LIZLLL;
            if (jSONObject5 == null || !jSONObject5.has("entrance_info")) {
                return;
            }
            if ((entranceInfoParamsOfflineConfig.LIZJ().isEmpty() && entranceInfoParamsOfflineConfig.LIZIZ().isEmpty() && !entranceInfoParamsOfflineConfig.LIZLLL()) || (jSONObject = c786530UtH.LIZLLL) == null || (objOpt = jSONObject.opt("entrance_info")) == null) {
                return;
            }
            if (!(objOpt instanceof String)) {
                if (!(objOpt instanceof JSONObject)) {
                    return;
                }
                jSONObject2 = (JSONObject) objOpt;
                z = true;
                if (jSONObject2 == null) {
                    return;
                }
            } else {
                try {
                    jSONObject2 = new JSONObject((String) objOpt);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            JSONObject jSONObject6 = new JSONObject();
            boolean zLIZLLL = entranceInfoParamsOfflineConfig.LIZLLL();
            final ArrayList arrayList = new ArrayList();
            List<String> listLIZIZ = entranceInfoParamsOfflineConfig.LIZIZ();
            List<String> listLIZJ = entranceInfoParamsOfflineConfig.LIZJ();
            if (!listLIZJ.isEmpty()) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (listLIZJ.contains(next) && (!zLIZLLL || !C21258818Hi.LIZ.matches(next))) {
                        jSONObject6.put(next, jSONObject2.opt(next));
                    } else {
                        arrayList.add(next);
                    }
                }
            } else if ((!listLIZIZ.isEmpty()) || zLIZLLL) {
                Iterator<String> itKeys2 = jSONObject2.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (listLIZIZ.contains(next2) || (zLIZLLL && C21258818Hi.LIZ.matches(next2))) {
                        arrayList.add(next2);
                    } else {
                        jSONObject6.put(next2, jSONObject2.opt(next2));
                    }
                }
            }
            if (z) {
                JSONObject jSONObject7 = c786530UtH.LIZLLL;
                if (jSONObject7 != null) {
                    jSONObject7.put("entrance_info", jSONObject6);
                }
            } else {
                String strJ3 = C786410Ut5.J3(jSONObject6);
                if (strJ3 != null && (jSONObject3 = c786530UtH.LIZLLL) != null) {
                    jSONObject3.put("entrance_info", strJ3);
                }
            }
            final String strLIZ = c786530UtH.LIZ();
            C786410Ut5.LJLIIL(3000L, (Handler) C20321214fK.LIZ.getValue(), new Runnable() { // from class: X.18D9
                @Override // java.lang.Runnable
                public final void run() {
                    final String str = strLIZ;
                    final List list = arrayList;
                    C1C7U.LIZ("EventOfflineHandler@d276.processEventModel$1L");
                    C18GU.LIZ.LIZIZ(new Runnable() { // from class: X.18D8
                        @Override // java.lang.Runnable
                        public final void run() throws JSONException {
                            String str2 = str;
                            List list2 = list;
                            C1C7U.LIZ("EventOfflineHandler@d276.processEventModel$lambda$4$1L");
                            JSONObject jSONObject8 = new JSONObject();
                            if (str2 == null) {
                                str2 = "";
                            }
                            jSONObject8.put("event", str2);
                            jSONObject8.put("filtered_keys", list2);
                            BtmServiceImpl.INSTANCE.getAppLogExp().onEventV3(new C1523880pl4("btm_filter_entrance_info", jSONObject8));
                            C1C7U.LIZIZ("EventOfflineHandler@d276.processEventModel$lambda$4$1L");
                        }
                    }, false);
                    C1C7U.LIZIZ("EventOfflineHandler@d276.processEventModel$1L");
                }
            });
        }
    }

    @Override // X.C18IQ
    public void registerBtmPageCallback(C18HS c18hs) {
        if (C18CS.LIZ.LJ() != 1) {
            return;
        }
        C18E3.LJII(c18hs);
    }

    @Override // X.C18IQ
    public void registerEventChecker(InterfaceC21258218Hc interfaceC21258218Hc) {
        C18GO.LL.getClass();
        if (!C18GO.LLILZ) {
            synchronized (C18GO.LLILZIL) {
                try {
                    if (!C18GO.LLILZ) {
                        C18GO.LLILLJJLI.add(interfaceC21258218Hc);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.C18IQ
    public boolean removeSourceBtmTokenInQueue(String str) {
        Iterator<BufferBtm> it2;
        BtmSettingModel btmSettingModel = C18CS.LIZ;
        if (C18CS.LIZ.LJ() != 1) {
            return false;
        }
        C18E5.LIZ.getClass();
        LinkedBlockingQueue<BufferBtm> linkedBlockingQueue = C18E5.LIZJ;
        if (linkedBlockingQueue != null && (it2 = linkedBlockingQueue.iterator()) != null) {
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getBtm(), str)) {
                    it2.remove();
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C18HZ
    public void setInitPrerequisites(int i) {
        initPrerequisites = i;
    }

    @Override // X.C18HZ
    public void setInitStatus(int i) {
        initStatus = i;
    }

    @Override // X.C18IQ
    public void setInitTag(String str) {
        C18CK.LIZ = str;
    }

    public final void setInitTime(long j) {
        initTime = j;
    }

    public final void setLaunchId(String str) {
        launchId$delegate.setValue(this, $$delegatedProperties[1], str);
    }

    public final void setNotInitOnLaunch(Integer num) {
        notInitOnLaunch = num;
    }

    public final void setOpenPerfOpt(boolean z) {
        openPerfOpt = z;
    }

    public final void setSaveCacheCallback(InterfaceC21246518Cp interfaceC21246518Cp) {
        saveCacheCallback$delegate.setValue(this, $$delegatedProperties[0], interfaceC21246518Cp);
    }

    @Override // X.C18IQ
    public void setStartNode(C21259218Hm c21259218Hm) {
        int iIntValue;
        if (C18CS.LIZ.LJ() != 1) {
            return;
        }
        FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
        featureModelLIZJ.getClass();
        Object objLIZIZ = C1972007ny.LIZIZ(featureModelLIZJ, "push_into_link", Integer.valueOf(featureModelLIZJ.enablePushLink));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = featureModelLIZJ.enablePushLink;
        }
        featureModelLIZJ.enablePushLink = iIntValue;
        if (iIntValue != 1) {
        } else {
            throw null;
        }
    }

    @Override // X.C18IQ
    public void unregisterBtmPageCallback(C18HS c18hs) {
        BtmSettingModel btmSettingModel = C18CS.LIZ;
        if (C18CS.LIZ.LJ() != 1) {
            return;
        }
        boolean z = C18E3.LIZ;
        Set<C18HS> set = C18E3.LJIIIIZZ;
        synchronized (set) {
            try {
                set.remove(c18hs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C18IQ
    public void updateHybridPatternSetting(String str) {
        C1971707nv.LJ(SchemaRulesModel.class, "btm_pattern_config", str);
    }

    @Override // X.C18IQ
    public void updateLibraConfig(BtmEventConfigModel btmEventConfigModel) {
        C21244618Bw.LIZIZ(btmEventConfigModel);
    }

    @Override // X.C18IQ
    public void updateSDKSetting(String str) {
        C1971707nv.LJ(BtmSettingModel.class, "btm_sdk_config", str);
    }

    @Override // X.C18IQ
    public C1523880pl4 addBtmEventParam(C1523880pl4 c1523880pl4) throws JSONException {
        BtmSettingModel btmSettingModel = C18CS.LIZ;
        if (C18CS.LIZ.LJ() != 1) {
            JSONObject jSONObject = c1523880pl4.LIZIZ;
            if (jSONObject != null) {
                jSONObject.remove("btm_id");
            }
            return c1523880pl4;
        }
        C21244418Bu.LIZ.getClass();
        JSONObject jSONObject2 = c1523880pl4.LIZIZ;
        if (jSONObject2 != null && jSONObject2.has("btm_id")) {
            C21244418Bu.LIZ.LIZ(c1523880pl4.LIZ, jSONObject2);
        }
        return c1523880pl4;
    }

    @Override // X.C18IQ
    public void onRegisterPage(C18GZ c18gz) {
        Class<?> cls;
        String canonicalName = c18gz.LIZIZ;
        if (canonicalName.length() == 0 && ((cls = c18gz.LIZ) == null || (canonicalName = cls.getCanonicalName()) == null)) {
            canonicalName = "null";
        }
        C18CE.LIZ.LIZLLL(c18gz.LIZJ, canonicalName);
    }

    @Override // X.C18IQ
    public boolean addBtmBySourceBtmToken(String str, BcmParams bcmParams) {
        BcmParams bcmParams2;
        Map<String, ? extends BcmParams> mapLIZJ;
        if (str.length() == 0 || bcmParams == null || bcmParams.isEmpty()) {
            return false;
        }
        if (!C18E5.LIZ.LIZLLL().containsKey(str) && !C18E5.LJIIIIZZ.containsKey(str)) {
            return false;
        }
        AnonymousClass1891 anonymousClass1891 = AnonymousClass1891.LIZ;
        C212369188x c212369188xLIZJ = AnonymousClass1891.LIZJ(str);
        if (c212369188xLIZJ == null) {
            c212369188xLIZJ = new C212369188x(null, null, null);
            AnonymousClass1891.LIZLLL(str, c212369188xLIZJ);
        }
        Map<String, ? extends BcmParams> map = c212369188xLIZJ.LIZIZ;
        if (map == null) {
            mapLIZJ = new LinkedHashMap();
        } else {
            bcmParams2 = map.get("ecom_entrance");
            if (bcmParams2 == null) {
                if (C19719512Dh.LJII(map)) {
                    mapLIZJ = C19719512Dh.LIZJ(map);
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(map);
                    mapLIZJ = linkedHashMap;
                }
            }
            bcmParams2.merge(bcmParams);
            return true;
        }
        c212369188xLIZJ.LIZIZ = mapLIZJ;
        bcmParams2 = new BcmParams();
        mapLIZJ.put("ecom_entrance", bcmParams2);
        bcmParams2.merge(bcmParams);
        return true;
    }

    @Override // X.C18IQ
    public String createJumpSourceBtmToken(C21244318Bt c21244318Bt, boolean z) {
        int iIntValue;
        if (C18CS.LIZ.LJ() != 1) {
            return null;
        }
        C18CK.LIZLLL("createJumpSourceBtmToken", new C18C4(c21244318Bt));
        if (c21244318Bt.LIZ.length() == 0) {
            BugfixModel bugfixModelLIZIZ = C18CS.LIZ.LIZIZ();
            bugfixModelLIZIZ.getClass();
            Object objLIZIZ = C1972007ny.LIZIZ(bugfixModelLIZIZ, "empty_btm_return", Integer.valueOf(bugfixModelLIZIZ.emptyBtmReturn));
            if (!(objLIZIZ instanceof Integer)) {
                objLIZIZ = null;
            }
            Integer num = (Integer) objLIZIZ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = bugfixModelLIZIZ.emptyBtmReturn;
            }
            bugfixModelLIZIZ.emptyBtmReturn = iIntValue;
            if (iIntValue == 1) {
                return null;
            }
        }
        BtmItemBuilder btmItemBuilder = new BtmItemBuilder(c21244318Bt.LIZ, null);
        btmItemBuilder.withPageFinder(c21244318Bt.LIZIZ);
        btmItemBuilder.setEnterPage(true);
        C18EK c18ekBuild = btmItemBuilder.build();
        C18CM c18cm = C18CM.LIZ;
        BcmParams bcmParams = c21244318Bt.LIZJ;
        c18cm.getClass();
        C18CE.LIZJ(c18ekBuild, "createBtmIdFromSourceBtmToken");
        String strLIZJ = C18CM.LIZJ(c18ekBuild, true, bcmParams, z);
        if (strLIZJ.length() == 0) {
            return null;
        }
        return strLIZJ;
    }

    @Override // X.C18IQ
    public void getPageBtmWithSchemaAsync(String str, C18IG c18ig) {
        C18EU.LIZ.LIZLLL(null, null, c18ig, str, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.C18IQ
    public void registerAndRunActivityCallbackIfNotInitOnLaunch(List<C18EW> list, boolean z) throws JSONException {
        if (C18CS.LIZ.LJ() != 1) {
            return;
        }
        notInitOnLaunch = 1;
        C18IP c18ip = C18IP.LIZ;
        Application applicationLIZIZ = c18ip.LIZIZ();
        if (applicationLIZIZ != null) {
            applicationLIZIZ.registerActivityLifecycleCallbacks(C20146713sH.LL);
        }
        Application applicationLIZIZ2 = c18ip.LIZIZ();
        if (applicationLIZIZ2 != null) {
            applicationLIZIZ2.registerActivityLifecycleCallbacks(C18E2.LL);
        }
        HashSet hashSet = new HashSet();
        for (C18EW c18ew : list) {
            Object obj = c18ew.LIZ.get();
            Activity activityLIZJ = C789730UyR.LIZJ(obj);
            if (activityLIZJ instanceof LifecycleOwner) {
                boolean zContains = hashSet.contains(activityLIZJ);
                if (!zContains && ((LifecycleOwner) activityLIZJ).getLifecycle().getCurrentState().compareTo(Lifecycle.State.CREATED) >= 0) {
                    C20146713sH.LL.onActivityCreated(activityLIZJ, null);
                    C18E2.LL.onActivityCreated(activityLIZJ, null);
                }
                BtmSDK.INSTANCE.getService().onRegisterPage(c18ew);
                if (!zContains) {
                    if (((LifecycleOwner) activityLIZJ).getLifecycle().getCurrentState().compareTo(Lifecycle.State.STARTED) >= 0) {
                        C20146713sH.LL.onActivityStarted(activityLIZJ);
                        C18E2.LL.onActivityStarted(activityLIZJ);
                    }
                    if (((LifecycleOwner) activityLIZJ).getLifecycle().getCurrentState().compareTo(Lifecycle.State.RESUMED) >= 0) {
                        C20146713sH.LL.onActivityResumed(activityLIZJ);
                        C18E2.LL.getClass();
                        C18E2.LIZ(activityLIZJ);
                        C18E2.LIZJ(activityLIZJ);
                    }
                }
                hashSet.add(activityLIZJ);
            }
            if ((obj instanceof Fragment) && z) {
                C18EI.LL.getClass();
                C18EI.LIZ((Fragment) obj, true);
            }
        }
    }

    @Override // X.C18IQ
    public void registerAndRunFirstActivityCallbackAfterInit(Activity activity, Bundle bundle) throws JSONException {
        BtmSettingModel btmSettingModel = C18CS.LIZ;
        if (C18CS.LIZ.LJ() != 1) {
            return;
        }
        C18IP c18ip = C18IP.LIZ;
        Application applicationLIZIZ = c18ip.LIZIZ();
        if (applicationLIZIZ != null) {
            applicationLIZIZ.registerActivityLifecycleCallbacks(C20146713sH.LL);
        }
        Application applicationLIZIZ2 = c18ip.LIZIZ();
        if (applicationLIZIZ2 != null) {
            applicationLIZIZ2.registerActivityLifecycleCallbacks(C18E2.LL);
        }
        C20146713sH.LL.onActivityCreated(activity, bundle);
        C18E2.LL.onActivityCreated(activity, bundle);
    }

    @Override // X.C18IQ
    public void updateBtmPage(Object obj, String str) {
        PageInfo pageInfoCurrent;
        PageProp pageProp;
        if (C18CS.LIZ.LJ() == 1 && C18CS.LIZ.LIZJ().LJIIL().LJ() == 1) {
            C21248618Dk c21248618Dk = C21248618Dk.LIZ;
            c21248618Dk.getClass();
            PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(obj);
            if (pageInfoStackLJIIIZ != null) {
                pageInfoCurrent = pageInfoStackLJIIIZ.current();
            } else {
                pageInfoCurrent = null;
            }
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = "";
            BufferBtm bufferBtmLIZIZ = C18E5.LIZ.LIZIZ(str, new C0C42(c259800zU));
            if (bufferBtmLIZIZ != null) {
                C21246918Ct.LIZ(pageInfoCurrent, str);
                String btm = bufferBtmLIZIZ.getBtm();
                int step = bufferBtmLIZIZ.getStep() + 1;
                String pageId = bufferBtmLIZIZ.getPageId();
                c21248618Dk.getClass();
                C21248618Dk.LJIILIIL(btm, false, true, pageId, step, obj);
                c21248618Dk.getClass();
                PageInfoStack pageInfoStackLJIIIZ2 = C21248618Dk.LJIIIZ(obj);
                if (pageInfoStackLJIIIZ2 != null && (pageProp = pageInfoStackLJIIIZ2.getPageProp()) != null) {
                    C21249518Dt.LIZIZ(obj, pageProp);
                    return;
                }
                return;
            }
            if (str == null || pageInfoCurrent == null) {
                return;
            }
            pageInfoCurrent.setUnknownSourceBtmToken(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    @Override // X.C18IQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String createExternalEvokeBtmToken(java.lang.String r15, java.lang.String r16, com.bytedance.android.bcm.api.model.BcmParams r17) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.btm.impl.BtmServiceImpl.createExternalEvokeBtmToken(java.lang.String, java.lang.String, com.bytedance.android.bcm.api.model.BcmParams):java.lang.String");
    }

    @Override // X.C18IQ
    public Map<String, Object> createReportParams(String str, PageFinder pageFinder, Set<? extends EnumC20164613vA> set) {
        int iIntValue;
        if (C18CS.LIZ.LJ() != 1) {
            Pair[] pairArr = new Pair[1];
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("sdk_init_prerequisites", C18G7.LIZ());
                jSONObject.put("sdk_init_result", C18G7.LIZIZ());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            pairArr[0] = new Pair("btm_debug_params", jSONObject);
            return C2097608Jq.LJIIJ(pairArr);
        }
        Object obj = null;
        BtmItemBuilder btmItemBuilder = new BtmItemBuilder(str, null);
        btmItemBuilder.withPageFinder(pageFinder);
        btmItemBuilder.setEnterPage(false);
        btmItemBuilder.setExtraParams(set);
        C18EK c18ekBuild = btmItemBuilder.build();
        C18CM.LIZ.getClass();
        C18CR c18crLJ = C18CM.LJ(c18ekBuild);
        Map<String, Object> mapLIZIZ = C21244418Bu.LIZIZ(C21244418Bu.LIZ, c18crLJ.LIZ, 0, null, c18crLJ.LIZJ, c18ekBuild.LJIIIZ, 6);
        JSONObject jSONObject2 = new JSONObject();
        if (mapLIZIZ.isEmpty()) {
            FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
            featureModelLIZJ.getClass();
            Object objLIZIZ = C1972007ny.LIZIZ(featureModelLIZJ, "add_debug_to_event", Integer.valueOf(featureModelLIZJ.addDebugToEvent));
            if (objLIZIZ instanceof Integer) {
                obj = objLIZIZ;
            }
            Integer num = (Integer) obj;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = featureModelLIZJ.addDebugToEvent;
            }
            featureModelLIZJ.addDebugToEvent = iIntValue;
            if (iIntValue == 1) {
                try {
                    jSONObject2.put("sdk_init_prerequisites", C18G7.LIZ());
                    jSONObject2.put("sdk_init_result", C18G7.LIZIZ());
                    jSONObject2.put("finder", C18BA.LIZ(c18ekBuild.LJ));
                    jSONObject2.put("page_class", c18crLJ.LIZLLL);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        }
        if (c18crLJ.LIZIZ) {
            try {
                jSONObject2.put("show_id_generate_by_empty_host", 1);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
        if (jSONObject2.length() > 0) {
            mapLIZIZ.put("btm_debug_params", jSONObject2);
        }
        return mapLIZIZ;
    }

    @Override // X.C18IQ
    public Map<String, Object> generateBtmEventParams(String str, int i, String str2) {
        if (C18CS.LIZ.LJ() != 1) {
            return new LinkedHashMap();
        }
        return C21244418Bu.LIZIZ(C21244418Bu.LIZ, str, i, str2, null, null, 24);
    }

    @Override // X.C18IQ
    public String getBcmChainStandardStringByFinder(String str, PageFinder pageFinder, BcmParams bcmParams) {
        int iIntValue;
        C21244318Bt c21244318Bt = new C21244318Bt();
        c21244318Bt.LIZ = str;
        c21244318Bt.LIZIZ = pageFinder;
        c21244318Bt.LIZJ = bcmParams;
        FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
        featureModelLIZJ.getClass();
        Object objLIZIZ = C1972007ny.LIZIZ(featureModelLIZJ, "standard_chain_length", Integer.valueOf(featureModelLIZJ.standardChainLength));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = featureModelLIZJ.standardChainLength;
        }
        featureModelLIZJ.standardChainLength = iIntValue;
        return C786410Ut5.J3(C18BV.LIZ.getBcmChainByBtmModel(c21244318Bt, Collections.singletonList("ecom_entrance"), iIntValue, true).LIZ());
    }

    @Override // X.C18IQ
    public Pair<Boolean, String> registerBtmPage(View view, String str, String str2) {
        C18CK.LIZLLL("NA_registerBtmPage", new C1870200yle(view.getClass().getName(), str));
        if (C18CS.LIZ.LJ() != 1) {
            return C18EV.LIZ.registerBtmPage(view, str, str2);
        }
        return C18E6.LIZIZ(view, str, str2);
    }

    @Override // X.C18IQ
    public void registerPageBtmWithSchemaAsync(final String str, final Object obj, final String str2, final String str3) {
        if (C18CS.LIZ.LIZJ().LJII()) {
            C18EU.LIZ.LIZLLL(null, null, new C18IG() { // from class: X.18FC
                @Override // X.C18IG
                public final void LIZ(String str4) {
                    String name = obj.getClass().getName();
                    Object obj2 = obj;
                    if (obj2 instanceof View) {
                        if (C18EU.LJ("getPageBtmWithSchemaAsyncBy", str4, "View", str, "", obj2)) {
                            String str5 = C18E6.LIZ;
                            C18E6.LIZIZ((View) obj, str4, str3);
                            return;
                        }
                        return;
                    }
                    if (obj2 instanceof Fragment) {
                        if (!C18EU.LJ("getPageBtmWithSchemaAsyncBy", str4, "Fragment", str, "V2", obj2)) {
                            return;
                        }
                        String str6 = C18E6.LIZ;
                        C18E6.LIZ(null, obj, str4, str3);
                        return;
                    }
                    C18CK.LJIIL("SchemaUtils_registerPageBtmWithSchemaAsync", new C18GA(str, name, str2));
                }
            }, str, str2);
        }
    }
}
