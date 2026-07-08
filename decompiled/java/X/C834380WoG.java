package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.localtest.LocalTestDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.ILocalTestDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.PipoPackageDiffSPI;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WoG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C834380WoG {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(87));
    public final C834270Wo5 LIZLLL;
    public Function1<? super C834300Wo8, Unit> LJ;
    public Function1<? super Boolean, Unit> LJFF;

    public C834380WoG(Context context) {
        String strLJI;
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin2;
        IECommerceHostService iECommerceHostService;
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin3;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateILocalTestDependencyServicebyMonsterPlugin;
        boolean z;
        String strLIZ;
        List<String> listLJJLIIIJILLIZJL;
        boolean z2;
        boolean z3;
        String name;
        boolean z4;
        String name2;
        boolean z5;
        String name3;
        boolean z6;
        String name4;
        String str = "";
        InterfaceC834240Wo2 interfaceC834240Wo2 = new InterfaceC834240Wo2() { // from class: X.03YB
            @Override // X.InterfaceC834240Wo2
            public final void LIZ(C834300Wo8 c834300Wo8) {
                if (c834300Wo8.LIZ == C03YA.LaunchActivityError) {
                    C1AF0.LIZJ("GooglePay LaunchActivityError");
                }
                this.LIZ.LJ.invoke(c834300Wo8);
            }

            @Override // X.InterfaceC834240Wo2
            public final void LIZIZ(boolean z7) {
                this.LIZ.LIZ.set(z7);
                this.LIZ.LJFF.invoke(Boolean.valueOf(z7));
            }
        };
        this.LJ = AFwS228S0000000_1.get$arr$(238);
        this.LJFF = AFwS228S0000000_1.get$arr$(239);
        try {
            SettingsManager.LIZLLL().getClass();
            if (Intrinsics.LJFF(SettingsManager.LJI("google_pay_display_label", ""), "")) {
                strLJI = null;
            } else {
                SettingsManager.LIZLLL().getClass();
                strLJI = SettingsManager.LJI("google_pay_display_label", "");
            }
            C834400WoI c834400WoI = new C834400WoI(0);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                String name5 = IAccountDependencyService.class.getName();
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                    name4 = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name4 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name5, name4, z6);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
            }
            c834400WoI.LIZJ = ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getDeviceVersionMinor();
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin2 = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin2 != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                String name6 = IAccountDependencyService.class.getName();
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin2 != null) {
                    name3 = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin2.getClass().getName();
                } else {
                    name3 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name6, name3, z5);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
            }
            String deviceId = ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin2).getDeviceId();
            c834400WoI.LIZ = deviceId == null ? "" : deviceId;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                if (iECommerceHostService2 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                String name7 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService2 != null) {
                    name2 = iECommerceHostService2.getClass().getName();
                } else {
                    name2 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime3, 1, name7, name2, z4);
                iECommerceHostService = (IECommerceHostService) service;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            c834400WoI.LIZIZ = String.valueOf(((IApplicationDependencyService) iECommerceHostService).getAppId());
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin3 = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin3 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String name8 = IAccountDependencyService.class.getName();
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin3 != null) {
                    name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin3.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime4, 1, name8, name, z3);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
            }
            String deviceChannel = ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin3).getDeviceChannel(context);
            String str2 = c834400WoI.LIZ;
            if (str2 != null) {
                C834360WoE c834360WoE = new C834360WoE(str2, c834400WoI.LIZIZ, deviceChannel, c834400WoI.LIZJ, null);
                C834270Wo5 c834270Wo5 = C834270Wo5.LIZ;
                C834390WoH c834390WoH = new C834390WoH(null);
                c834390WoH.LIZIZ = C786410Ut5.N3(context);
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime5 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C1AQS.LIZJ(jElapsedRealtime5, 1, ILocationDependencyService.class.getName(), anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName() : null, z2);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
                }
                c834390WoH.LIZLLL = ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).getPriorityRegion().toUpperCase(Locale.ROOT);
                SettingsManager.LIZLLL().getClass();
                String strLJI2 = SettingsManager.LJI("pipo_tts_google_pay_allowed_methods", "");
                if (strLJI2 != null && C1533950q1J.LJ(strLJI2) && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJI2, new String[]{","}, 0, 6)) != null && (!listLJJLIIIJILLIZJL.isEmpty())) {
                    c834390WoH.LJIIIIZZ = listLJJLIIIJILLIZJL;
                }
                PipoPackageDiffSPI pipoPackageDiffSPI = (PipoPackageDiffSPI) PluggableExtentionKt.pluggableSpi$default(PipoPackageDiffSPI.class, false, false, false, 14, null);
                if (pipoPackageDiffSPI != null && (strLIZ = pipoPackageDiffSPI.LIZ()) != null) {
                    str = strLIZ;
                }
                c834390WoH.LJ = str;
                c834390WoH.LJI = strLJI;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime6 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateILocalTestDependencyServicebyMonsterPlugin = LocalTestDependencyService.createILocalTestDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateILocalTestDependencyServicebyMonsterPlugin != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C1AQS.LIZJ(jElapsedRealtime6, 1, ILocalTestDependencyService.class.getName(), anonymousClass0317CreateILocalTestDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILocalTestDependencyServicebyMonsterPlugin.getClass().getName() : null, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateILocalTestDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocalTestDependencyService.class);
                }
                c834390WoH.LIZ = Boolean.valueOf(((ILocalTestDependencyService) anonymousClass0317CreateILocalTestDependencyServicebyMonsterPlugin).enableBoe());
                c834390WoH.LJFF = c834360WoE;
                c834390WoH.LIZJ = interfaceC834240Wo2;
                C834270Wo5.LIZIZ(c834390WoH.LIZ());
                this.LIZLLL = c834270Wo5;
                return;
            }
            throw new IllegalArgumentException("need to set did");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GooglePay.init :");
            sbLIZ.append(e.getMessage());
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZ(Function1<? super Boolean, Unit> function1) {
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("start getPix Available");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("start", true);
        C03WD.LJI("pix_google_pay", "GET_PIX_AVAILABLE", C786410Ut5.J3(jSONObject));
        if (this.LIZLLL != null) {
            final AwS210S0300000_1 awS210S0300000_1 = new AwS210S0300000_1(jSONObject, (JSONObject) this, (C834380WoG) function1, (Function1<? super Boolean, Unit>) 33);
            if (C834270Wo5.LJII) {
                C834350WoD c834350WoD = C834270Wo5.LJFF;
                C833960Wna c833960Wna = null;
                if (c834350WoD != null) {
                    c834350WoD.LIZIZ("pipo_googlepayapi_isready_start", null, null);
                }
                C834280Wo6 c834280Wo6 = C834270Wo5.LJ;
                if (c834280Wo6 == null) {
                    c834280Wo6 = null;
                }
                c834280Wo6.getClass();
                JSONObject jSONObject2 = C834280Wo6.LJFF;
                jSONObject2.put("allowedPaymentMethods", new JSONArray().put(C834280Wo6.LIZIZ(null)));
                String strJ3 = C786410Ut5.J3(jSONObject2);
                IsReadyToPayRequest isReadyToPayRequest = new IsReadyToPayRequest();
                C0W3J.LJIIIZ(strJ3, "isReadyToPayRequestJson cannot be null!");
                isReadyToPayRequest.zzf = strJ3;
                C833960Wna c833960Wna2 = C834270Wo5.LIZIZ;
                if (c833960Wna2 != null) {
                    c833960Wna = c833960Wna2;
                }
                c833960Wna.getClass();
                C832510WlF c832510WlF = new C832510WlF();
                c832510WlF.LIZLLL = 23705;
                c832510WlF.LIZ = new C833760WnG(isReadyToPayRequest);
                c833960Wna.doRead(c832510WlF.LIZ()).LIZIZ(new InterfaceC834580Woa() { // from class: X.0Wo4
                    @Override // X.InterfaceC834580Woa
                    public final void LIZ(AbstractC835450Wpz abstractC835450Wpz) throws JSONException {
                        Function1 function12 = awS210S0300000_1;
                        try {
                            Boolean bool = (Boolean) abstractC835450Wpz.LJIIJJI(C0W4V.class);
                            function12.invoke(bool);
                            C834350WoD c834350WoD2 = C834270Wo5.LJFF;
                            if (c834350WoD2 != null) {
                                c834350WoD2.LIZJ(bool.booleanValue());
                            }
                        } catch (C0W4V e) {
                            TryCatchGuardChecker.doCheck(e);
                            C834270Wo5.LIZLLL.LIZIZ(false);
                            C834350WoD c834350WoD3 = C834270Wo5.LJFF;
                            if (c834350WoD3 != null) {
                                c834350WoD3.LIZJ(false);
                            }
                        }
                    }
                });
                return;
            }
            throw new Error("need to call init first");
        }
    }
}
