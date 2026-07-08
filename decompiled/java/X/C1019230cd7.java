package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.feed.experiment.VSAProductIdRecordSetting;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggSetting;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS31S0000100_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cd7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019230cd7 implements IMainAdScene {
    public InterfaceC1019190cd3 LIZ;
    public C19GS LIZIZ;
    public InterfaceC1019330cdH LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public long LJFF;
    public LifecycleOwner LJI;
    public Fragment LJII;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C1019370cdL(this));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new C1019300cdE(this));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new C1019320cdG(this));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new C1019210cd5());
    public final C01GW LJIIL = C452501pT.LIZIZ(new C1019310cdF());
    public final List<WeakReference<InterfaceC1019340cdI>> LJIILIIL = new ArrayList();
    public final List<WeakReference<InterfaceC1019350cdJ>> LJIILJJIL = new ArrayList();
    public final C1019250cd9 LJIILL = new Observer() { // from class: X.0cd9
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            C19GS c19gs = this.LL.LIZIZ;
            InterfaceC1019330cdH interfaceC1019330cdH = null;
            if (c19gs == null) {
                c19gs = null;
            }
            C1030680cva.LJIILLIIL(c19gs, zBooleanValue);
            InterfaceC1019330cdH interfaceC1019330cdH2 = this.LL.LIZJ;
            if (interfaceC1019330cdH2 != null) {
                interfaceC1019330cdH = interfaceC1019330cdH2;
            }
            interfaceC1019330cdH.LIZIZ();
        }
    };

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene
    public final void onResume() {
    }

    public final AdHomePageDataVM LIZJ() {
        return (AdHomePageDataVM) this.LJIIJ.getValue();
    }

    public final HomePageDataViewModel LIZLLL() {
        return (HomePageDataViewModel) this.LJIIIZ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPause() {
        /*
            r3 = this;
            X.0cd3 r0 = r3.LIZ
            if (r0 != 0) goto L5
            r0 = 0
        L5:
            androidx.fragment.app.Fragment r2 = r0.getCurFragment()
            r1 = 1
            if (r2 != 0) goto Lf
            X.C1030680cva.LJIIIZ = r1
            return
        Lf:
            androidx.fragment.app.Fragment r0 = r3.LJII
            X.0caF r0 = (X.InterfaceC1017450caF) r0
            boolean r0 = r0.mainPageOnFeed()
            if (r0 == 0) goto L3a
            boolean r0 = r2 instanceof X.InterfaceC1593630rZZ
            if (r0 == 0) goto L3a
            X.0rZZ r2 = (X.InterfaceC1593630rZZ) r2
            boolean r0 = r2.Ik()
            if (r0 != 0) goto L37
            boolean r0 = r2.VJ()
            if (r0 != 0) goto L37
            boolean r0 = r2.i6()
            if (r0 != 0) goto L37
            boolean r0 = r2.iH()
            if (r0 == 0) goto L3a
        L37:
            X.C1030680cva.LJIIIZ = r1
            return
        L3a:
            r1 = 0
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1019230cd7.onPause():void");
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene
    public final void onCreate() {
        boolean zLJI = MethodIDManager.LJI(202290);
        EventBus.LIZLLL().LJIJJ(this);
        MutableLiveData<Boolean> mutableLiveData = LIZJ().LLILZ;
        LifecycleOwner lifecycleOwner = this.LJI;
        if (lifecycleOwner == null) {
            "Required value was null.".toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Required value was null.");
            if (!zLJI) {
                throw illegalArgumentException;
            }
            MethodIDManager.LJ();
            throw illegalArgumentException;
        }
        mutableLiveData.observe(lifecycleOwner, this.LJIILL);
        if (!((Boolean) C274700Apg.LIZ.getValue()).booleanValue()) {
            C19GS c19gs = this.LIZIZ;
            if (c19gs == null) {
                c19gs = null;
            }
            checkSplashAdsForColdStart(c19gs.getIntent());
        }
        C15O7.LIZIZ(new Callable() { // from class: X.0cd2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("MainAdScene@dc2d.onCreate$1");
                InterfaceC1019190cd3 interfaceC1019190cd3 = this.LL.LIZ;
                if (interfaceC1019190cd3 == null) {
                    interfaceC1019190cd3 = null;
                }
                interfaceC1019190cd3.LJIJJLI();
                C1C7U.LIZIZ("MainAdScene@dc2d.onCreate$1");
                return null;
            }
        }, C823050WQl.LIZIZ(), null);
        BaseScrollSwitchStateManager baseScrollSwitchStateManager = (BaseScrollSwitchStateManager) this.LJIIIIZZ.getValue();
        C19GS c19gs2 = this.LIZIZ;
        baseScrollSwitchStateManager.LLJILJIL.observe(c19gs2 != null ? c19gs2 : null, new Observer() { // from class: X.0caD
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                IAdPhotoModeService iAdPhotoModeService;
                Aweme aweme = this.LL.LIZLLL().LLJILJILJ;
                if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
                    Aweme aweme2 = this.LL.LIZLLL().LLJILJILJ;
                    if (aweme2 != null && C1017070cZd.LLIIL(aweme2) && (iAdPhotoModeService = (IAdPhotoModeService) PluggableExtentionKt.pluggableSpi$default(IAdPhotoModeService.class, false, false, false, 14, null)) != null) {
                        iAdPhotoModeService.LJJI(EnumC1002140cBY.ONE_PIXEL);
                    }
                    if (((InterfaceC1017450caF) this.LL.LJII).mainPageOnFeed() && !C0SQJ.LIZ(this.LL.LIZLLL().LLJILJILJ)) {
                        IFeedAdService iFeedAdService = (IFeedAdService) PluggableExtentionKt.pluggableSpi$default(IFeedAdService.class, false, false, false, 14, null);
                        if (iFeedAdService != null) {
                            iFeedAdService.setEnterFrom(this.LL.LIZLLL().getEventType());
                        }
                        C1019230cd7 c1019230cd7 = this.LL;
                        C19GS c19gs3 = c1019230cd7.LIZIZ;
                        if (c19gs3 == null) {
                            c19gs3 = null;
                        }
                        C1022290ci3.LJIILLIIL(c19gs3, c1019230cd7.LIZLLL().getEventType());
                    }
                }
            }
        });
        InterfaceC1019350cdJ interfaceC1019350cdJ = new InterfaceC1019350cdJ() { // from class: X.0cd4
            @Override // X.InterfaceC1019350cdJ
            public final void LIZ(String str, String str2, String str3, JSONObject jSONObject) throws JSONException {
                Object c098200Yq;
                AwemeRawAd awemeRawAd;
                if (Intrinsics.LJFF("realtime_click", str2)) {
                    C1049030dPB.LIZ.LIZ(str3);
                }
                InterfaceC1019190cd3 interfaceC1019190cd3 = this.LIZ.LIZ;
                String incentiveInfo = null;
                if (interfaceC1019190cd3 == null) {
                    interfaceC1019190cd3 = null;
                }
                interfaceC1019190cd3.LIZJ(str, str2, jSONObject);
                C1019230cd7 c1019230cd7 = this.LIZ;
                InterfaceC1019190cd3 interfaceC1019190cd32 = c1019230cd7.LIZ;
                if (interfaceC1019190cd32 == null) {
                    interfaceC1019190cd32 = null;
                }
                C19GS c19gs3 = c1019230cd7.LIZIZ;
                if (c19gs3 == null) {
                    c19gs3 = null;
                }
                interfaceC1019190cd32.LIZLLL(c19gs3, str, str2);
                InterfaceC1019190cd3 interfaceC1019190cd33 = this.LIZ.LIZ;
                if (interfaceC1019190cd33 == null) {
                    interfaceC1019190cd33 = null;
                }
                interfaceC1019190cd33.LJIILLIIL(str, str2, str3);
                try {
                    String strOptString = jSONObject.optString("ad_extra_data");
                    if (TextUtils.isEmpty(strOptString)) {
                        c098200Yq = new JSONObject();
                    } else {
                        c098200Yq = new JSONObject(strOptString);
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = new JSONObject();
                }
                JSONObject jSONObject2 = (JSONObject) c098200Yq;
                Aweme aweme = this.LIZ.LIZLLL().LLJILJILJ;
                if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                    incentiveInfo = awemeRawAd.getIncentiveInfo();
                }
                if (TextUtils.equals(str2, "click") && incentiveInfo != null && incentiveInfo.length() != 0) {
                    jSONObject2.put("coupon_info", incentiveInfo);
                }
                if (Intrinsics.LJFF("othershow", str2)) {
                    jSONObject2.put("add_on_show_timing", C987970boh.LIZ());
                }
                try {
                    if (((VSAProductIdRecordSetting.VSAProductIdRecordParam) VSAProductIdRecordSetting.LIZIZ.getValue()).enable && Intrinsics.LJFF("click", str2) && Intrinsics.LJFF("draw_ad", str)) {
                        String strOptString2 = jSONObject.optString("refer");
                        if (!Intrinsics.LJFF("slide", strOptString2)) {
                            String strOptString3 = jSONObject2.optString("product_id");
                            if (!TextUtils.isEmpty(strOptString3)) {
                                C1048110dNh.LIZLLL.getClass();
                                C1048110dNh.LJ().LIZ(strOptString3, strOptString2);
                            }
                        }
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
                this.LIZ.LJ(str, str2, new AwS560S0100000_16(jSONObject2, 1));
                jSONObject.put("ad_extra_data", C786410Ut5.J3(jSONObject2));
            }
        };
        ((ArrayList) this.LJIILJJIL).add(new WeakReference(interfaceC1019350cdJ));
        synchronized (C1019240cd8.LIZ) {
            List<InterfaceC1019350cdJ> list = C1019240cd8.LIZIZ;
            if (!((ArrayList) list).contains(interfaceC1019350cdJ)) {
                ((ArrayList) list).add(interfaceC1019350cdJ);
            }
        }
        AdSessionPositionHelper adSessionPositionHelper = AdSessionPositionHelper.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        adSessionPositionHelper.getClass();
        AdSessionPositionHelper.LJIIL(jCurrentTimeMillis);
        C1019400cdO.LJI();
        InterfaceC1019340cdI interfaceC1019340cdI = new InterfaceC1019340cdI() { // from class: X.0ccx
            /* JADX WARN: Removed duplicated region for block: B:177:0x032c  */
            @Override // X.InterfaceC1019340cdI
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(com.bytedance.ies.ugc.aweme.rich.model.CommonAdData r14, X.C1022820ciu r15) {
                /*
                    Method dump skipped, instruction units count: 1000
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1019130ccx.LIZ(com.bytedance.ies.ugc.aweme.rich.model.CommonAdData, X.0ciu):void");
            }
        };
        ((ArrayList) this.LJIILIIL).add(new WeakReference(interfaceC1019340cdI));
        C1019290cdD c1019290cdD = C1019290cdD.LIZ;
        c1019290cdD.LIZ(interfaceC1019340cdI);
        InterfaceC1019340cdI interfaceC1019340cdI2 = new InterfaceC1019340cdI() { // from class: X.0cd1
            @Override // X.InterfaceC1019340cdI
            public final void LIZ(CommonAdData commonAdData, C1022820ciu c1022820ciu) {
                if (TextUtils.equals(c1022820ciu.LIZIZ, "othershow_fail") && TextUtils.equals(c1022820ciu.LIZ, "draw_ad")) {
                    c1022820ciu.LIZIZ(-1, "failed_reason_status");
                }
            }
        };
        ((ArrayList) this.LJIILIIL).add(new WeakReference(interfaceC1019340cdI2));
        c1019290cdD.LIZ(interfaceC1019340cdI2);
        InterfaceC1019340cdI interfaceC1019340cdI3 = new InterfaceC1019340cdI() { // from class: X.0cd0
            @Override // X.InterfaceC1019340cdI
            public final void LIZ(CommonAdData commonAdData, C1022820ciu c1022820ciu) {
                Aweme awemeZr;
                String creativeIdStr = commonAdData.getCreativeIdStr();
                if (creativeIdStr == null) {
                    return;
                }
                IAwemeService iAwemeService = (IAwemeService) this.LIZ.LJIIL.getValue();
                if ((iAwemeService == null || (awemeZr = iAwemeService.zr(creativeIdStr)) == null) && (awemeZr = this.LIZ.LIZLLL().LLJILJILJ) == null) {
                    return;
                }
                if (C1019110ccv.LIZIZ.LJII(awemeZr, C1017070cZd.LJIIIIZZ(awemeZr)) == null) {
                    return;
                }
                c1022820ciu.LIZIZ(C1019100ccu.LIZLLL(awemeZr), "anchor_id");
                c1022820ciu.LIZIZ(C1019100ccu.LJ(awemeZr), "room_id");
            }
        };
        ((ArrayList) this.LJIILIIL).add(new WeakReference(interfaceC1019340cdI3));
        c1019290cdD.LIZ(interfaceC1019340cdI3);
        C2214201BlK.LIZLLL().LJJLJLI(new C09JN() { // from class: X.0UwY
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MainAdScene@dc2d.monitorAppBackground$1");
                if (((Boolean) obj).booleanValue()) {
                    if (C1019270cdB.LJFF) {
                        C1019270cdB.LJ = Long.valueOf(System.currentTimeMillis());
                    }
                } else if (C1019270cdB.LJFF) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    Long l = C1019270cdB.LJ;
                    if (l != null && jCurrentTimeMillis2 - l.longValue() >= 1800000) {
                        C1019270cdB.LIZJ();
                    }
                }
                C1C7U.LIZIZ("MainAdScene@dc2d.monitorAppBackground$1");
            }
        });
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LJJIFFI(new InterfaceC427710Gpt() { // from class: X.0cdA
            @Override // X.InterfaceC427710Gpt
            public final void LLLLLLZZ(int i, User user, User user2) {
                String uid;
                if (i != 1 && i != 2 && i != 3) {
                    return;
                }
                String str = C1019270cdB.LIZ;
                if (user2 == null || (uid = user2.getUid()) == null) {
                    uid = CardStruct.IStatusCode.DEFAULT;
                }
                if (!C123100dR.LIZ(uid) || Intrinsics.LJFF(uid, C1019270cdB.LIZLLL)) {
                    return;
                }
                C1019270cdB.LIZLLL = uid;
                C1019270cdB.LIZJ();
            }
        });
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.0cdC
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                String uid;
                if (z && i == 1) {
                    String str = C1019270cdB.LIZ;
                    if (user == null || (uid = user.getUid()) == null) {
                        uid = CardStruct.IStatusCode.DEFAULT;
                    }
                    if (C123100dR.LIZ(uid) && !Intrinsics.LJFF(uid, C1019270cdB.LIZLLL)) {
                        C1019270cdB.LIZLLL = uid;
                        C1019270cdB.LIZJ();
                    }
                }
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene
    public final void onDestroy() {
        ((ISplashAdService) ServiceManager.get().getService(ISplashAdService.class)).LJI();
        Iterator it2 = ((ArrayList) this.LJIILIIL).iterator();
        while (it2.hasNext()) {
            Object obj = ((Reference) it2.next()).get();
            if (obj != null) {
                synchronized (C1019290cdD.LIZ) {
                    List<InterfaceC1019340cdI> list = C1019290cdD.LIZIZ;
                    if (((ArrayList) list).contains(obj)) {
                        ((ArrayList) list).remove(obj);
                    }
                }
            }
        }
        ((ArrayList) this.LJIILIIL).clear();
        Iterator it3 = ((ArrayList) this.LJIILJJIL).iterator();
        while (it3.hasNext()) {
            InterfaceC1019350cdJ interfaceC1019350cdJ = (InterfaceC1019350cdJ) ((Reference) it3.next()).get();
            if (interfaceC1019350cdJ != null) {
                C1019240cd8.LIZ.LIZIZ(interfaceC1019350cdJ);
            }
        }
        ((ArrayList) this.LJIILJJIL).clear();
        ((Boolean) C1034390d1Z.LIZLLL.getValue()).booleanValue();
        C1222204qK.LIZJ = null;
        EventBus.LIZLLL().LJJI(this);
        C1030680cva.LJIILLIIL = false;
    }

    public final void LIZ(ViewGroup viewGroup) {
        if (this.LJ) {
            return;
        }
        InterfaceC1019330cdH interfaceC1019330cdH = this.LIZJ;
        C19GS c19gs = null;
        if (interfaceC1019330cdH == null) {
            interfaceC1019330cdH = null;
        }
        interfaceC1019330cdH.LIZ();
        C19GS c19gs2 = this.LIZIZ;
        if (c19gs2 == null) {
            c19gs2 = null;
        }
        View decorView = c19gs2.getWindow().getDecorView();
        C19GS c19gs3 = this.LIZIZ;
        if (c19gs3 != null) {
            c19gs = c19gs3;
        }
        decorView.setBackgroundColor(C475630Ikz.LIZIZ(R.attr.oh, c19gs));
        C786410Ut5.R4(0.0f, viewGroup);
        this.LJ = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void checkSplashAdsForColdStart(android.content.Intent r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "hasSplashAdForColdStart called intent=null? "
            r1.append(r0)
            r5 = 1
            r4 = 0
            if (r8 != 0) goto L19
            r0 = 1
        Le:
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            boolean r0 = X.C1030680cva.LJ
            if (r0 != 0) goto L1b
            return
        L19:
            r0 = 0
            goto Le
        L1b:
            X.C1030680cva.LJIIZILJ(r8)
            X.0cd3 r1 = r7.LIZ
            r6 = 0
            if (r1 != 0) goto L24
            r1 = r6
        L24:
            java.lang.String r0 = "method_main_create_begin_to_splash_ad"
            r1.LIZIZ(r0, r4)
            X.0cd3 r0 = r7.LIZ
            if (r0 != 0) goto L2e
            r0 = r6
        L2e:
            java.lang.String r3 = "method_splash_try_show_ad_duration"
            r0.LIZIZ(r3, r5)
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM r0 = r7.LIZJ()
            r0.LL = r4
            X.0cd3 r0 = r7.LIZ
            if (r0 != 0) goto L3e
            r0 = r6
        L3e:
            boolean r0 = r0.isNewUser()
            if (r0 != 0) goto L61
            X.01GW r0 = X.C1865910yej.LIZJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L74
            X.15iQ r0 = X.C20595215iQ.LIZ
            float r1 = X.C20595215iQ.LIZJ
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L74
            r0 = 1083179008(0x40900000, float:4.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L74
        L61:
            X.0cd3 r0 = r7.LIZ
            if (r0 != 0) goto L66
            r0 = r6
        L66:
            r0.LIZIZ(r3, r4)
            X.0cd3 r0 = r7.LIZ
            if (r0 == 0) goto L6e
            r6 = r0
        L6e:
            java.lang.String r0 = "method_splash_ad_to_main_create_end"
            r6.LIZIZ(r0, r5)
            return
        L74:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService> r0 = com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService.class
            java.lang.Object r2 = r1.getService(r0)
            com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService r2 = (com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService) r2
            if (r2 == 0) goto L61
            X.0cd3 r0 = r7.LIZ
            if (r0 != 0) goto L87
            r0 = r6
        L87:
            r0.LJJII()
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM r1 = r7.LIZJ()
            X.19GS r0 = r7.LIZIZ
            if (r0 != 0) goto L93
            r0 = r6
        L93:
            boolean r0 = r2.LJJIFFI(r0)
            if (r0 != 0) goto Lb3
            java.lang.String r0 = X.C1030680cva.LJIIJJI
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lb3
            r0 = 0
        La2:
            r1.LL = r0
            X.0cd3 r1 = r7.LIZ
            if (r1 != 0) goto La9
            r1 = r6
        La9:
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM r0 = r7.LIZJ()
            boolean r0 = r0.LL
            r1.LJIIZILJ(r0)
            goto L61
        Lb3:
            r0 = 1
            goto La2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1019230cd7.checkSplashAdsForColdStart(android.content.Intent):void");
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene, X.InterfaceC1022320ci6
    public final void init(AbstractC1017400caA abstractC1017400caA) {
        C1017380ca8 c1017380ca8;
        C1017380ca8 c1017380ca82;
        C1017380ca8 c1017380ca83;
        C1017380ca8 c1017380ca84 = (C1017380ca8) abstractC1017400caA;
        C19GS c19gs = null;
        if (c1017380ca84 == null) {
            c1017380ca8 = null;
        } else {
            c1017380ca8 = c1017380ca84;
        }
        this.LIZ = (InterfaceC1019190cd3) c1017380ca8.LIZ;
        if (c1017380ca84 == null) {
            c1017380ca82 = null;
        } else {
            c1017380ca82 = c1017380ca84;
        }
        this.LIZIZ = c1017380ca82.LIZIZ;
        if (c1017380ca84 == null) {
            c1017380ca83 = null;
        } else {
            c1017380ca83 = c1017380ca84;
        }
        this.LJI = c1017380ca83.LIZLLL;
        if (c1017380ca84 == null) {
            c1017380ca84 = null;
        }
        this.LJII = c1017380ca84.LIZJ;
        ISplashAdService iSplashAdService = (ISplashAdService) ServiceManager.get().getService(ISplashAdService.class);
        C19GS c19gs2 = this.LIZIZ;
        if (c19gs2 != null) {
            c19gs = c19gs2;
        }
        this.LIZJ = iSplashAdService.LJFF(c19gs);
        if (!ShakeEggSetting.LIZ().closeShakeEgg) {
            C1017440caE c1017440caE = new C1017440caE(this);
            if (!((Boolean) C1222204qK.LIZIZ.getValue()).booleanValue()) {
                c1017440caE.invoke();
            } else if (C1030680cva.LJIIIZ()) {
                c1017440caE.invoke();
            } else {
                C1222204qK.LIZJ = c1017440caE;
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onAwesomeSplashEvent(C740360T2k c740360T2k) {
        LIZJ().LLILLJJLI.setValue(c740360T2k);
        if (c740360T2k.LIZ == 4) {
            LIZJ().LL = false;
        }
        if (!LIZJ().LLILZIL && c740360T2k.LIZ == 2) {
            LIZJ().LLILZIL = true;
        }
        C19GS c19gs = this.LIZIZ;
        InterfaceC1019190cd3 interfaceC1019190cd3 = null;
        if (c19gs == null) {
            c19gs = null;
        }
        ViewGroup viewGroup = (ViewGroup) c19gs.findViewById(android.R.id.content);
        int i = c740360T2k.LIZ;
        if (i == 0) {
            LIZ(viewGroup);
            this.LJFF = SystemClock.elapsedRealtime();
        } else if (i == 1) {
            LIZ(viewGroup);
            if (this.LJFF != 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LJFF;
                C1020790cfd c1020790cfd = new C1020790cfd(new Object[0]);
                C1030840cvq.LIZ.getClass();
                c1020790cfd.log(C1030840cvq.LJFF, new AwS31S0000100_16(jElapsedRealtime, 9));
            }
        } else {
            if (viewGroup != null) {
                C786410Ut5.R4(1.0f, viewGroup);
            }
            LIZJ().LLILZ.setValue(Boolean.TRUE);
        }
        int i2 = c740360T2k.LIZ;
        if (i2 == 2) {
            if (!C1030680cva.LJIJ(c740360T2k.LIZIZ)) {
                ((InterfaceC1017450caF) this.LJII).setVpEnableDispatchTouchEventCheck(false);
            }
        } else if (i2 == 4 && C1017070cZd.LLIZLLLIL(c740360T2k.LIZIZ)) {
            InterfaceC1019190cd3 interfaceC1019190cd32 = this.LIZ;
            if (interfaceC1019190cd32 != null) {
                interfaceC1019190cd3 = interfaceC1019190cd32;
            }
            interfaceC1019190cd3.LJIILL();
        }
        if (c740360T2k.LIZ == 4) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("AwesomeSplash", "onAwesomeSplashEvent is AwesomeSplashEvent.GONE");
            if (this.LIZLLL) {
                this.LIZLLL = false;
                ((InterfaceC1017450caF) this.LJII).splashOverShowMandatoryLoginPage();
                return;
            }
            return;
        }
        if (!C1017070cZd.LLIZLLLIL(c740360T2k.LIZIZ)) {
            return;
        }
        this.LIZLLL = true;
    }

    @C14EU
    public final void onSplashAdEvent(C2040907z5 c2040907z5) {
        if (c2040907z5 != null && c2040907z5.LIZ == 0) {
            LIZJ().LL = false;
            ((InterfaceC1017450caF) this.LJII).splashOverShowMandatoryLoginPage();
        }
    }

    @C14EU
    public final void onTabChangeEvent(C0R6M c0r6m) {
        if (!Intrinsics.LJFF(c0r6m.LIZIZ, "HOME")) {
            C1030680cva.LIZLLL().LJJIIZI();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene
    public final void onVideoPageChangeEvent(Aweme aweme, boolean z) {
        C19GS c19gs = this.LIZIZ;
        if (c19gs == null) {
            c19gs = null;
        }
        C1022290ci3.LJIJJ(aweme, c19gs, z, false);
    }

    public final void LJ(String str, String str2, Function0<Unit> function0) {
        if ((Intrinsics.LJFF("background_ad", str) || Intrinsics.LJFF("result_ad_bg", str)) && Intrinsics.LJFF("replay", str2)) {
            function0.invoke();
            return;
        }
        if ((Intrinsics.LJFF("background_ad", str) || Intrinsics.LJFF("draw_ad", str)) && Intrinsics.LJFF("othershow", str2)) {
            function0.invoke();
            return;
        }
        if (Intrinsics.LJFF("live_ad", str) && Intrinsics.LJFF("show", str2)) {
            function0.invoke();
        } else if ((Intrinsics.LJFF("draw_ad", str) || Intrinsics.LJFF("result_ad", str)) && ((Set) this.LJIIJJI.getValue()).contains(str2)) {
            function0.invoke();
        }
    }
}
