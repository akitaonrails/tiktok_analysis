package com.bytedance.android.btm.api;

import X.C08CX;
import X.C0PSL;
import X.C1127104az;
import X.C1127204b0;
import X.C1523880pl4;
import X.C15WL;
import X.C15WM;
import X.C18A6;
import X.C18BV;
import X.C18BZ;
import X.C18C6;
import X.C18CK;
import X.C18EK;
import X.C18EV;
import X.C18EW;
import X.C18GZ;
import X.C18HS;
import X.C18IG;
import X.C18IJ;
import X.C18IN;
import X.C18IO;
import X.C18IP;
import X.C18IQ;
import X.C18IS;
import X.C18IV;
import X.C18J6;
import X.C18J7;
import X.C18J8;
import X.C1939307ih;
import X.C21244318Bt;
import X.C21246818Cs;
import X.C21259218Hm;
import X.C669610QOh;
import X.C677080Qh8;
import X.C786410Ut5;
import X.C786530UtH;
import X.EnumC20164613vA;
import X.EnumC21242418Ba;
import X.InterfaceC1294060jmO;
import X.InterfaceC1549050qPf;
import X.InterfaceC20337014hs;
import X.InterfaceC21258218Hc;
import X.InterfaceC21260718Ib;
import X.InterfaceC2217461Bqa;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.config.BtmEventConfigModel;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.btm.api.util.LazyNullable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class BtmSDK {
    public static final BtmSDK INSTANCE = new BtmSDK();
    public static C18IQ service = C18EV.LIZ;

    public final Map<String, Object> createReportParams(String str, PageFinder pageFinder) {
        return createReportParams$default(this, str, pageFinder, null, 4, null);
    }

    private final void createService() {
        C18IQ c18iq = service;
        if (c18iq instanceof C18EV) {
            c18iq.setInitPrerequisites(1);
            try {
                try {
                    Constructor<?> declaredConstructor = Class.forName("com.bytedance.android.btm.impl.BtmServiceImpl").getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    service = (C18IQ) declaredConstructor.newInstance(new Object[0]);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    public final boolean enableRouterMonitor() {
        return service.enableRouterMonitor();
    }

    public final Object getCurrentResumedPage() {
        return service.getCurrentResumedPage();
    }

    public final Object getLastCreatePage() {
        return service.getLastCreatePage();
    }

    public final C18IJ getLaunchApi() {
        return service.getLaunchApi();
    }

    public final InterfaceC1549050qPf getOnHybridContainerLoadSchemaCallback() {
        return service.getHybridContainerLoadSchemaCallback();
    }

    public final BtmPageLifecycle getPageLifecycle() {
        return service.getPageLifecycle();
    }

    public final C18A6 getThreadExecutor() {
        return service.getThreadExecutor();
    }

    public final void preloadWhenInit() {
        service.preloadWhenInit();
    }

    public final boolean removeBcmChainPageId() {
        return service.removeBcmChainPageId();
    }

    public final boolean useV2Api() {
        return service.useV2ApiMall();
    }

    public final C18IP getDepend() {
        return C18IP.LIZ;
    }

    public final C18IQ getService() {
        return service;
    }

    public static final Map<String, Object> getPageParams(PageFinder pageFinder) {
        return C18BV.LIZ.getPageParams(pageFinder);
    }

    public static final void updateHybridPatternSetting(String str) {
        service.updateHybridPatternSetting(str);
    }

    public static final void updateLibraConfig(BtmEventConfigModel btmEventConfigModel) {
        service.updateLibraConfig(btmEventConfigModel);
    }

    public static final void updateSDKSetting(String str) {
        service.updateSDKSetting(str);
    }

    public final C786530UtH addBtmEventParam(C786530UtH c786530UtH) {
        service.addBtmEventParam(c786530UtH);
        return c786530UtH;
    }

    @InterfaceC1294060jmO
    public final JSONObject createBtmChain(C18EK c18ek) {
        return service.createBtmChain(c18ek);
    }

    @InterfaceC1294060jmO
    public final String createBtmId(C18EK c18ek) {
        return service.createBtmId(c18ek);
    }

    public final String createJumpSourceBtmToken(C21244318Bt c21244318Bt) {
        return service.createJumpSourceBtmToken(c21244318Bt, false);
    }

    public final String createJumpSourceBtmTokenForJSB(C21244318Bt c21244318Bt) {
        return service.createJumpSourceBtmToken(c21244318Bt, true);
    }

    public final boolean enableExternalEvokeAbility(String str) {
        return service.enableDeepLinkProcess(str);
    }

    public final void externalEvoke(C21259218Hm c21259218Hm) {
        service.setStartNode(c21259218Hm);
    }

    @InterfaceC1294060jmO
    public final C21246818Cs getBtmPageInfo(PageFinder pageFinder) {
        return service.getBtmPageInfo(pageFinder);
    }

    public final C21246818Cs getBtmPageInfoV2(PageFinder pageFinder) {
        return service.getBtmPageInfoV2(pageFinder);
    }

    public final String getPageId(PageFinder pageFinder) {
        return service.getPageId(pageFinder);
    }

    public final void init(C18IS c18is) {
        createService();
        C18IP c18ip = C18IP.LIZ;
        c18ip.getClass();
        Application application = c18is.LIZ;
        LazyNullable lazyNullable = C18IP.LIZLLL;
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = C18IP.LIZIZ;
        boolean z = false;
        lazyNullable.setValue(c18ip, interfaceC2217461BqaArr[0], application);
        C18IP.LJ.setValue(c18ip, interfaceC2217461BqaArr[1], Boolean.valueOf(c18is.LIZIZ));
        C18IP.LJFF.setValue(c18ip, interfaceC2217461BqaArr[2], c18is.LIZJ);
        C18IP.LJI.setValue(c18ip, interfaceC2217461BqaArr[3], c18is.LIZLLL);
        C18IP.LJII.setValue(c18ip, interfaceC2217461BqaArr[4], null);
        C18IP.LJIIIIZZ.setValue(c18ip, interfaceC2217461BqaArr[5], c18is.LJ);
        C18IP.LJIIIZ.setValue(c18ip, interfaceC2217461BqaArr[6], null);
        C18IP.LJIIJ.setValue(c18ip, interfaceC2217461BqaArr[7], c18is.LJFF);
        C18IP.LJIIJJI.setValue(c18ip, interfaceC2217461BqaArr[8], c18is.LJI);
        C18IP.LJIIL.setValue(c18ip, interfaceC2217461BqaArr[9], c18is.LJII);
        C18IP.LJIILIIL.setValue(c18ip, interfaceC2217461BqaArr[10], null);
        C18IP.LJIILJJIL.setValue(c18ip, interfaceC2217461BqaArr[11], c18is.LJIIIZ);
        C18IP.LJIILL.setValue(c18ip, interfaceC2217461BqaArr[12], c18is.LJIIJ);
        C18IP.LJIILLIIL.setValue(c18ip, interfaceC2217461BqaArr[13], Boolean.valueOf(c18is.LJIIJJI));
        C18IP.LJIIZILJ.setValue(c18ip, interfaceC2217461BqaArr[14], Boolean.TRUE);
        C18IP.LJIJ.setValue(c18ip, interfaceC2217461BqaArr[15], Boolean.FALSE);
        C18IP.LJIJI.setValue(c18ip, interfaceC2217461BqaArr[16], c18is.LJIIL);
        C18IP.LJIJJ.setValue(c18ip, interfaceC2217461BqaArr[17], c18is.LJIILIIL);
        C18IP.LJJIIJ.setValue(c18ip, interfaceC2217461BqaArr[23], c18is.LJIIIIZZ);
        C18IP.LJIJJLI.setValue(c18ip, interfaceC2217461BqaArr[18], Integer.valueOf(c18is.LJIILL));
        C18IP.LJIL.setValue(c18ip, interfaceC2217461BqaArr[19], c18is.LJIILJJIL);
        C18IP.LJJ.setValue(c18ip, interfaceC2217461BqaArr[20], c18is.LJIILLIIL);
        C18IP.LJJIIJZLJL.setValue(c18ip, interfaceC2217461BqaArr[24], c18is.LJIIZILJ);
        C18IP.LJJIIZ.setValue(c18ip, interfaceC2217461BqaArr[25], c18is.LJIJ);
        InterfaceC20337014hs monitor = INSTANCE.getService().getMonitor();
        if (c18ip.LIZIZ() != null && c18ip.LIZJ() != null) {
            z = true;
        }
        monitor.LIZ(new C18J7(), z);
        Application applicationLIZIZ = c18ip.LIZIZ();
        if (applicationLIZIZ != null) {
            C786410Ut5.u4(applicationLIZIZ, new ComponentCallbacks2() { // from class: X.18In
                @Override // android.content.ComponentCallbacks
                public final void onConfigurationChanged(Configuration configuration) {
                }

                @Override // android.content.ComponentCallbacks
                public final void onLowMemory() {
                    BtmSDK.INSTANCE.getService().onLowMemory();
                }

                @Override // android.content.ComponentCallbacks2
                public final void onTrimMemory(int i) {
                    if (i == 80) {
                        BtmSDK.INSTANCE.getService().onLowMemory();
                    }
                }
            });
        }
        service.init();
    }

    public final void initByProvider(InterfaceC21260718Ib interfaceC21260718Ib) {
        boolean z;
        createService();
        C18IP c18ip = C18IP.LIZ;
        c18ip.getClass();
        C18IP.LIZJ = interfaceC21260718Ib;
        InterfaceC20337014hs monitor = INSTANCE.getService().getMonitor();
        if (c18ip.LIZIZ() != null && c18ip.LIZJ() != null) {
            z = true;
        } else {
            z = false;
        }
        monitor.LIZ(new C18J8(), z);
        Application applicationLIZIZ = c18ip.LIZIZ();
        if (applicationLIZIZ != null) {
            C786410Ut5.u4(applicationLIZIZ, new ComponentCallbacks2() { // from class: X.18Io
                @Override // android.content.ComponentCallbacks
                public final void onConfigurationChanged(Configuration configuration) {
                }

                @Override // android.content.ComponentCallbacks
                public final void onLowMemory() {
                    BtmSDK.INSTANCE.getService().onLowMemory();
                }

                @Override // android.content.ComponentCallbacks2
                public final void onTrimMemory(int i) {
                    if (i == 80) {
                        BtmSDK.INSTANCE.getService().onLowMemory();
                    }
                }
            });
        }
        service.init();
    }

    @InterfaceC1294060jmO
    public final String obtainEventBtmParams(C18EK c18ek) {
        c18ek.LIZIZ = Boolean.FALSE;
        return service.createBtmId(c18ek);
    }

    public final void processEventModel(C786530UtH c786530UtH) {
        service.processEventModel(c786530UtH);
    }

    public final void registerBtmPageCallback(C18HS c18hs) {
        service.registerBtmPageCallback(c18hs);
    }

    public final void registerBtmPageOnCreate(C18IN c18in) {
        getDepend().getClass();
        C18IP.LJII(c18in);
    }

    public final void registerEventChecker(InterfaceC21258218Hc interfaceC21258218Hc) {
        service.registerEventChecker(interfaceC21258218Hc);
    }

    @InterfaceC1294060jmO
    public final void registerPageClass(C18GZ c18gz) {
        getDepend().getClass();
        if (c18gz.LIZJ.length() != 0) {
            C18IP.LJJI.add(c18gz);
            C18CK.LIZLLL("registerPageClass", new C18J6(c18gz));
            INSTANCE.getService().onRegisterPage(c18gz);
        }
    }

    @InterfaceC1294060jmO
    public final void registerPageInstance(C18EW c18ew) {
        getDepend().getClass();
        C18IP.LJIIJ(c18ew);
    }

    public final boolean removeSourceBtmTokenInQueue(String str) {
        return service.removeSourceBtmTokenInQueue(str);
    }

    public final void setInitTag(String str) {
        service.setInitTag(str);
    }

    public final void setService(C18IQ c18iq) {
        service = c18iq;
    }

    public final void unregisterBtmPageCallback(C18HS c18hs) {
        service.unregisterBtmPageCallback(c18hs);
    }

    public final void unregisterPageInstance(Object obj) {
        getDepend().getClass();
        String name = obj.getClass().getName();
        for (C18EW c18ew : C18IP.LJJIFFI) {
            if (Intrinsics.LJFF(c18ew.LIZ.get(), obj)) {
                C18IP.LJJIFFI.remove(c18ew);
                INSTANCE.getService().onUnregisterPage(c18ew);
                C18CK.LIZLLL("NA_unregisterPageInstance", new C1127104az(name));
                return;
            }
        }
        C18CK.LIZLLL("NA_unregisterPageInstance", new C1127204b0(name));
    }

    @InterfaceC1294060jmO
    public final void willJumpToNextPage(C18EK c18ek) {
        c18ek.LIZIZ = Boolean.TRUE;
        service.createBtmId(c18ek);
    }

    public final C1523880pl4 addBtmEventParam(C1523880pl4 c1523880pl4) {
        service.addBtmEventParam(c1523880pl4);
        return c1523880pl4;
    }

    public final void registerBtmPageOnCreate(C18IO c18io) {
        getDepend().getClass();
        C18IP.LJII(c18io);
    }

    public final boolean addBcmBySourceBtmToken(String str, BcmParams bcmParams) {
        return service.addBtmBySourceBtmToken(str, bcmParams);
    }

    public final void clearBcmPageParams(PageFinder pageFinder, List<String> list) {
        C18BV.LIZ.clearBcmPageParams(pageFinder, list);
    }

    public final void getPageBtmWithSchemaAsync(String str, C18IG c18ig) {
        service.getPageBtmWithSchemaAsync(str, c18ig);
    }

    public final void onPageHide(Object obj, Boolean bool) {
        onPageHide(obj, bool, null);
    }

    public final void onPageShow(Object obj, Boolean bool) {
        onPageShow(obj, bool, null);
    }

    public final void registerAndRunFirstActivityCallbackAfterInit(Activity activity, Bundle bundle) {
        service.registerAndRunFirstActivityCallbackAfterInit(activity, bundle);
    }

    public final void updateBtmPage(Activity activity, String str) {
        service.updateBtmPage(activity, str);
    }

    public final void updateBtmPage(Fragment fragment, String str) {
        service.updateBtmPage(fragment, str);
    }

    public final String createExternalEvokeBtmToken(String str, String str2, BcmParams bcmParams) {
        return service.createExternalEvokeBtmToken(str, str2, bcmParams);
    }

    public final String createJumpSourceBtmToken(String str, PageFinder pageFinder, BcmParams bcmParams) {
        C18IQ c18iq = service;
        C21244318Bt c21244318Bt = new C21244318Bt();
        c21244318Bt.LIZ = str;
        c21244318Bt.LIZIZ = pageFinder;
        c21244318Bt.LIZJ = bcmParams;
        return c18iq.createJumpSourceBtmToken(c21244318Bt, false);
    }

    public final Map<String, Object> createReportParams(String str, PageFinder pageFinder, Set<? extends EnumC20164613vA> set) {
        return service.createReportParams(str, pageFinder, set);
    }

    public final Map<String, Object> generateBtmEventParams(String str, int i, String str2) {
        return service.generateBtmEventParams(str, i, str2);
    }

    public final C18C6 getBcmChainByBtmModel(C21244318Bt c21244318Bt, int i, boolean z) {
        return C18BV.LIZ.getBcmChainByBtmModel(c21244318Bt, Collections.singletonList("ecom_entrance"), i, z);
    }

    public final C18C6 getBcmChainByFinder(PageFinder pageFinder, int i, boolean z) {
        return C18BV.LIZ.getBcmChainByFinder(pageFinder, Collections.singletonList("ecom_entrance"), i, z);
    }

    public final C18C6 getBcmChainByToken(String str, int i, boolean z) {
        return C18BV.LIZ.getBcmChainByToken(str, Collections.singletonList("ecom_entrance"), i, z);
    }

    public final String getBcmChainStandardStringByFinder(String str, PageFinder pageFinder, BcmParams bcmParams) {
        return service.getBcmChainStandardStringByFinder(str, pageFinder, bcmParams);
    }

    public final void onPageHide(Object obj, Boolean bool, C669610QOh c669610QOh) {
        String name;
        if (obj != null) {
            name = obj.getClass().getName();
        } else {
            name = null;
        }
        C18CK.LIZLLL("NA_onPageHide", new C15WM(name, bool, c669610QOh));
        getPageLifecycle().LJFF(obj, bool, c669610QOh);
    }

    public final void onPageShow(Object obj, Boolean bool, C0PSL c0psl) {
        String name;
        if (obj != null) {
            name = obj.getClass().getName();
        } else {
            name = null;
        }
        C18CK.LIZLLL("NA_onPageShow", new C15WL(name, bool, c0psl));
        getPageLifecycle().LIZLLL(obj, bool, c0psl);
    }

    public final boolean registerBtmPage(View view, String str, String str2) {
        return service.registerBtmPage(view, str, str2).getFirst().booleanValue();
    }

    public final void registerBtmPageOnCreate(Fragment fragment, String str, String str2) {
        boolean z = false;
        registerBtmPageOnCreate(new C18IO(fragment, str, z, z, z, str2, 92));
    }

    @InterfaceC1294060jmO
    public final void registerPageClass(Class<?> cls, String str, boolean z) {
        C18IP depend = getDepend();
        C18IP c18ip = C18IP.LIZ;
        depend.getClass();
        C18IP.LJIIIZ(cls, str, z, false);
    }

    @InterfaceC1294060jmO
    public final void registerPageInstance(Object obj, String str, boolean z) {
        getDepend().getClass();
        if (str.length() != 0) {
            C18EW c18ew = new C18EW(new WeakReference(obj), str, z, null, 120);
            C18CK.LIZLLL("NA_registerPageInstance", new C1939307ih(obj, str, z));
            C18IP.LJJIFFI.add(c18ew);
            INSTANCE.getService().onRegisterPage(c18ew);
        }
    }

    public final void setBcmPageParams(PageFinder pageFinder, BcmParams bcmParams, Boolean bool) {
        C18BV.LIZ.setBcmPageParams(pageFinder, bcmParams, bool);
    }

    @InterfaceC1294060jmO
    public final C18C6 getBcmChainByFinder(PageFinder pageFinder, List<String> list, int i) {
        return C18BV.LIZ.getBcmChainByFinder(pageFinder, list, i, false);
    }

    @InterfaceC1294060jmO
    public final C18C6 getBcmChainByToken(String str, List<String> list, int i) {
        return C18BV.LIZ.getBcmChainByToken(str, list, i, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.18IN] */
    public final void registerBtmPageOnCreate(final Activity activity, final String str, final String str2) {
        registerBtmPageOnCreate((C18IN) new C18IV<Activity>(activity, str, str2) { // from class: X.18IN
            public final Activity LJII;
            public final String LJIIIIZZ;
            public final boolean LJIIIZ;
            public final boolean LJIIJ;
            public final boolean LJIIJJI;
            public final String LJIIL;
            public final boolean LJIILIIL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C18IN)) {
                    return false;
                }
                C18IN c18in = (C18IN) obj;
                return Intrinsics.LJFF(this.LJII, c18in.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c18in.LJIIIIZZ) && this.LJIIIZ == c18in.LJIIIZ && this.LJIIJ == c18in.LJIIJ && this.LJIIJJI == c18in.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c18in.LJIIL) && this.LJIILIIL == c18in.LJIILIIL;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v16 */
            /* JADX WARN: Type inference failed for: r0v17 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v19 */
            /* JADX WARN: Type inference failed for: r0v20 */
            /* JADX WARN: Type inference failed for: r0v5, types: [int] */
            /* JADX WARN: Type inference failed for: r0v7, types: [int] */
            /* JADX WARN: Type inference failed for: r0v9, types: [int] */
            public final int hashCode() {
                int iHashCode = ((this.LJII.hashCode() * 31) + this.LJIIIIZZ.hashCode()) * 31;
                boolean z = this.LJIIIZ;
                ?? r0 = z;
                if (z) {
                    r0 = 1;
                }
                int i = (iHashCode + r0) * 31;
                boolean z2 = this.LJIIJ;
                ?? r02 = z2;
                if (z2) {
                    r02 = 1;
                }
                int i2 = (i + r02) * 31;
                boolean z3 = this.LJIIJJI;
                ?? r03 = z3;
                if (z3) {
                    r03 = 1;
                }
                int i3 = (i2 + r03) * 31;
                String str3 = this.LJIIL;
                return ((i3 + (str3 == null ? 0 : str3.hashCode())) * 31) + (this.LJIILIIL ? 1 : 0);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ActivityPageInstance(page=");
                sbLIZ.append(this.LJII);
                sbLIZ.append(", btm=");
                sbLIZ.append(this.LJIIIIZZ);
                sbLIZ.append(", auto=");
                sbLIZ.append(this.LJIIIZ);
                sbLIZ.append(", singleton=");
                sbLIZ.append(this.LJIIJ);
                sbLIZ.append(", reuse=");
                sbLIZ.append(this.LJIIJJI);
                sbLIZ.append(", sourceBtmToken=");
                sbLIZ.append(this.LJIIL);
                sbLIZ.append(", ignoreSystemFirstResume=");
                sbLIZ.append(this.LJIILIIL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                super(activity, str, true, false, false, str2, false);
                this.LJII = activity;
                this.LJIIIIZZ = str;
                this.LJIIIZ = true;
                this.LJIIJ = false;
                this.LJIIJJI = false;
                this.LJIIL = str2;
                this.LJIILIIL = false;
            }
        });
    }

    public static final List<C677080Qh8> getBcmParamsWithBtm(PageFinder pageFinder, List<String> list, int i, boolean z) {
        return C18BV.LIZ.getBcmParamsWithBtm(pageFinder, list, i, z);
    }

    public final void registerPageBtmWithSchemaAsync(String str, Object obj, String str2, String str3) {
        service.registerPageBtmWithSchemaAsync(str, obj, str2, str3);
    }

    @InterfaceC1294060jmO
    public final void registerPageClass(String str, String str2, boolean z, boolean z2) {
        getDepend().getClass();
        if (str2.length() != 0) {
            C18GZ c18gz = new C18GZ(null, str, str2, z, z2);
            C18IP.LJJI.add(c18gz);
            INSTANCE.getService().onRegisterPage(c18gz);
        }
    }

    @InterfaceC1294060jmO
    public final void registerPageClass(Class<?> cls, String str, boolean z, boolean z2) {
        getDepend().getClass();
        C18IP.LJIIIZ(cls, str, z, z2);
    }

    public static final Map<String, Object> getFullBcmParams(PageFinder pageFinder, EnumC21242418Ba enumC21242418Ba, C18BZ c18bz, int i, boolean z) {
        return C18BV.LIZ.getFullBcmParams(pageFinder, enumC21242418Ba, c18bz, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map createReportParams$default(BtmSDK btmSDK, String str, PageFinder pageFinder, Set set, int i, Object obj) {
        if ((i & 4) != 0) {
            set = C08CX.INSTANCE;
        }
        return btmSDK.createReportParams(str, pageFinder, set);
    }

    public static final Map<String, Object> getBcmParamsWithKey(PageFinder pageFinder, List<String> list, EnumC21242418Ba enumC21242418Ba, C18BZ c18bz, int i, boolean z) {
        return C18BV.LIZ.getBcmParamsWithKey(pageFinder, list, enumC21242418Ba, c18bz, i, z);
    }
}
