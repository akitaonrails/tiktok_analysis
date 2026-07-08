package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.api.ab.AddOptionForGuidanceExp;
import com.ss.android.ugc.aweme.notice.api.ab.EdmGuidePopupCoinExperiment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.GuideOutPushExperiment;
import com.ss.android.ugc.aweme.unifiedauthapi.push.tracking.IPushOptInTrackingApi;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AwS237S0300000_28;
import kotlin.jvm.internal.AwS61S0500000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0zzW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1917240zzW {
    public static int LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;
    public static final int LJ;
    public static final int LJFF;
    public static final int LJI;
    public static boolean LJII;
    public static final C1917240zzW LIZ = new C1917240zzW();
    public static String LJIIIIZZ = "";
    public static boolean LJIIIZ = true;

    static {
        LIZIZ = 3;
        LIZJ = 15;
        LIZLLL = 60;
        LJ = 3;
        LJFF = 4;
        LJI = 7;
        try {
            LIZIZ = ((Number) GuideOutPushExperiment.LJII.getValue()).intValue();
            LIZJ = ((Number) GuideOutPushExperiment.LJFF.getValue()).intValue();
            LIZLLL = ((Number) GuideOutPushExperiment.LJI.getValue()).intValue();
            LJ = ((Number) EdmGuidePopupCoinExperiment.LJFF.getValue()).intValue();
            LJFF = ((Number) EdmGuidePopupCoinExperiment.LIZLLL.getValue()).intValue();
            LJI = ((Number) EdmGuidePopupCoinExperiment.LJ.getValue()).intValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZIZ = 3;
            LIZJ = 15;
            LIZLLL = 60;
        }
    }

    public static void LIZIZ(C19EG c19eg) {
        C813020Vuu.LJIIL().LJIIIZ(c19eg, "key_cross_guide_out_edm_dialog", System.currentTimeMillis());
        C813020Vuu.LJIIL().LJIIIZ(c19eg, "key_times_guide_out_edm_dialog", C813020Vuu.LJIIL().LIZJ(c19eg, "key_times_guide_out_edm_dialog") + 1);
    }

    public static void LIZLLL(C19EG c19eg) {
        long jLIZJ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (GuideOutPushExperiment.LIZIZ()) {
            C0CLX.LIZ.getClass();
            C813020Vuu.LJIIL().LJIIIZ(c19eg, "key_cross_push_notification_guide", jCurrentTimeMillis);
        } else {
            C813020Vuu.LJIIL().LJIIIZ(c19eg, "key_cross_guide_out_push_dialog", jCurrentTimeMillis);
        }
        if (GuideOutPushExperiment.LIZIZ()) {
            C0CLX.LIZ.getClass();
            jLIZJ = C813020Vuu.LJIIL().LIZJ(c19eg, "key_times_push_notification_guide");
        } else {
            jLIZJ = C813020Vuu.LJIIL().LIZJ(c19eg, "key_times_guide_out_push_dialog");
        }
        long j = jLIZJ + 1;
        if (GuideOutPushExperiment.LIZIZ()) {
            C0CLX.LIZ.getClass();
            C813020Vuu.LJIIL().LJIIIZ(c19eg, "key_times_push_notification_guide", j);
        } else {
            C813020Vuu.LJIIL().LJIIIZ(c19eg, "key_times_guide_out_push_dialog", j);
        }
        if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getFriendCount() > 0 && ((Boolean) GuideOutPushExperiment.LJIIIZ.getValue()).booleanValue()) {
            SharedPreferences sharedPreferencesLJ = C813020Vuu.LJIIL().LJ(c19eg);
            int i = 0;
            if (sharedPreferencesLJ != null) {
                i = sharedPreferencesLJ.getInt("key_feature12_show_count", 0);
            }
            C813020Vuu.LJIIL().LJIIIIZZ(c19eg, "key_feature12_show_count", i + 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(android.content.Context r12, X.C1917290zzb r13) {
        /*
            Method dump skipped, instruction units count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1917240zzW.LJ(android.content.Context, X.0zzb):boolean");
    }

    public static void LIZ(Context context, C1917290zzb c1917290zzb, boolean z) {
        c1917290zzb.LJI = System.currentTimeMillis();
        if (C2255281DPa.LIZ() && !C824390WVp.LIZJ(context)) {
            long j = c1917290zzb.LJI;
            String str = c1917290zzb.LIZLLL;
            long j2 = c1917290zzb.LJII;
            String str2 = c1917290zzb.LJIIIIZZ;
            String str3 = c1917290zzb.LIZ;
            C10CR c10cr = C10CR.NOT_ACTION_TYPE;
            ((IPushOptInTrackingApi) ServiceManager.get().getService(IPushOptInTrackingApi.class)).LIZLLL(C19216610Fw.LIZ(j, z ? 1 : 0, str, c10cr.getValue(), str2, str3, j2, c10cr.getDisplayName()), !z);
        }
    }

    public static void LIZJ(String str, boolean z, boolean z2) {
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("recordShareOutAppAction(video: ");
            sbLIZ.append(z2);
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
        }
        LJII = z;
        if (z) {
            LJIIIIZZ = str;
            LJIIIZ = z2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, X.0zfN] */
    /* JADX WARN: Type inference failed for: r0v40, types: [T, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v44, types: [T, X.0zfM] */
    public static Class LJII(final Context context, final C1917290zzb c1917290zzb, final InterfaceC1917380zzk interfaceC1917380zzk) {
        boolean z;
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = new InterfaceC1917330zzf() { // from class: X.0zfN
            @Override // X.InterfaceC1917330zzf
            public final void LIZIZ() {
                if (Intrinsics.LJFF(c1917290zzb.LIZLLL, "dm")) {
                    return;
                }
                C1917240zzW c1917240zzW = C1917240zzW.LIZ;
                Context context2 = context;
                C1917290zzb c1917290zzb2 = c1917290zzb;
                c1917240zzW.getClass();
                C1917240zzW.LIZ(context2, c1917290zzb2, true);
            }

            @Override // X.InterfaceC1917330zzf
            public final void LIZ(String str) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tryShowGuideOutPushPanelDialog.onNotShow(");
                sbLIZ.append(str);
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
                C1917290zzb c1917290zzb2 = c1917290zzb;
                c1917290zzb2.LJIIIIZZ = str;
                C1917240zzW c1917240zzW = C1917240zzW.LIZ;
                Context context2 = context;
                c1917240zzW.getClass();
                C1917240zzW.LIZ(context2, c1917290zzb2, false);
            }
        };
        int i = 0;
        if (Intrinsics.LJFF(c1917290zzb.LIZLLL, "inbox")) {
            if (C1890430zIH.LIZ() && !((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LIZ() && LJ(context, c1917290zzb)) {
                c259800zU.element = new InterfaceC1917330zzf() { // from class: X.0zfM
                    @Override // X.InterfaceC1917330zzf
                    public final void LIZIZ() {
                        Keva keva = C1890430zIH.LIZ;
                        C1890430zIH.LIZ.storeLong("key_unified_push_permission", System.currentTimeMillis());
                    }

                    @Override // X.InterfaceC1917330zzf
                    public final void LIZ(String str) {
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("tryShowGuideOutPushPanelDialog.onNotShow(");
                        sbLIZ.append(str);
                        sbLIZ.append(')');
                        C2188811AlT.LIZIZ(sbLIZ);
                        C1917290zzb c1917290zzb2 = c1917290zzb;
                        c1917290zzb2.LJIIIIZZ = str;
                        C1917240zzW c1917240zzW = C1917240zzW.LIZ;
                        Context context2 = context;
                        c1917240zzW.getClass();
                        C1917240zzW.LIZ(context2, c1917290zzb2, false);
                    }
                };
            } else {
                if (!C1890430zIH.LIZ()) {
                    c1917290zzb.LJII = TimeUnit.DAYS.toMinutes(1L) * 1;
                    c1917290zzb.LJIIIIZZ = "frequency_control";
                }
                if (((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LIZ()) {
                    c1917290zzb.LJII = TimeUnit.DAYS.toMinutes(1L);
                    c1917290zzb.LJIIIIZZ = "during_system_popup_interval";
                }
                LIZ(context, c1917290zzb, false);
                return null;
            }
        } else {
            if (((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LIZ()) {
                c1917290zzb.LJII = TimeUnit.DAYS.toMinutes(1L);
                c1917290zzb.LJIIIIZZ = "during_system_popup_interval";
                LIZ(context, c1917290zzb, false);
                return null;
            }
            if (!LJ(context, c1917290zzb)) {
                LIZ(context, c1917290zzb, false);
                return null;
            }
        }
        final C259800zU c259800zU2 = new C259800zU();
        if (C824390WVp.LIZJ(context) && !Intrinsics.LJFF(c1917290zzb.LIZLLL, "dm") && !Intrinsics.LJFF(c1917290zzb.LIZLLL, "dm_streak")) {
            if (((Boolean) GuideOutPushExperiment.LJIIJ.getValue()).booleanValue()) {
                c259800zU.element = null;
                PushSettings pushSettingsLJ = C19328310jZ.LIZIZ.LJ();
                if (pushSettingsLJ == null) {
                    C15O7.LIZJ(new Callable() { // from class: X.0znJ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            PushSettings pushSettingsLJII;
                            C1C7U.LIZ("GuideUserOutPushManager@6ffa.tryShowGuideOutPushPanelDialog$5");
                            try {
                                pushSettingsLJII = ((IPushSettingService) ServiceManager.get().getService(IPushSettingService.class)).LJII();
                            } catch (IOException e) {
                                TryCatchGuardChecker.doCheck(e);
                                pushSettingsLJII = null;
                            }
                            C1C7U.LIZIZ("GuideUserOutPushManager@6ffa.tryShowGuideOutPushPanelDialog$5");
                            return pushSettingsLJII;
                        }
                    }).LJ(new InterfaceC2385309Wh() { // from class: X.0znI
                        /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Class] */
                        @Override // X.InterfaceC2385309Wh
                        public final Object then(C15O7 c15o7) {
                            C1C7U.LIZ("GuideUserOutPushManager@6ffa.tryShowGuideOutPushPanelDialog$6");
                            if (c15o7 != null) {
                                try {
                                    if (c15o7.LJIIL() != null) {
                                        PushSettings pushSettings = (PushSettings) c15o7.LJIIL();
                                        C19328310jZ.LIZIZ.LIZIZ((PushSettings) c15o7.LJIIL());
                                        C259800zU<Class<?>> c259800zU3 = c259800zU2;
                                        C1917240zzW c1917240zzW = C1917240zzW.LIZ;
                                        Context context2 = context;
                                        C1917290zzb c1917290zzb2 = c1917290zzb;
                                        InterfaceC1917380zzk interfaceC1917380zzk2 = interfaceC1917380zzk;
                                        InterfaceC1917330zzf interfaceC1917330zzf = c259800zU.element;
                                        c1917240zzW.getClass();
                                        c259800zU3.element = C1917240zzW.LJFF(context2, c1917290zzb2, pushSettings, interfaceC1917380zzk2, interfaceC1917330zzf);
                                    }
                                } catch (JSONException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("GuideUserOutPushManager@6ffa.tryShowGuideOutPushPanelDialog$6");
                            return unit;
                        }
                    }, C15O7.LJIIIIZZ, null);
                } else {
                    c259800zU2.element = LJFF(context, c1917290zzb, pushSettingsLJ, interfaceC1917380zzk, (InterfaceC1917330zzf) c259800zU.element);
                }
            }
        } else if (AddOptionForGuidanceExp.LIZJ > 0) {
            C609580NvY c609580NvY = C609580NvY.LIZ;
            AwS61S0500000_28 awS61S0500000_28 = new AwS61S0500000_28(context, c1917290zzb, interfaceC1917380zzk, c259800zU2, c259800zU, 4);
            c609580NvY.getClass();
            C609580NvY.LJI(context, c1917290zzb, awS61S0500000_28);
        } else {
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            if (((Boolean) GuideOutPushExperiment.LJIIIZ.getValue()).booleanValue() && curUser.getFriendCount() > 0) {
                z = true;
            } else {
                z = false;
            }
            String str = "normal";
            if (z) {
                SharedPreferences sharedPreferencesLJ = C813020Vuu.LJIIL().LJ(context);
                if (sharedPreferencesLJ != null) {
                    i = sharedPreferencesLJ.getInt("key_feature12_show_count", 0);
                }
                if (i % 2 != 0) {
                    str = "only_friends";
                }
                c1917290zzb.LIZ = str;
                C609580NvY c609580NvY2 = C609580NvY.LIZ;
                AwS61S0500000_28 awS61S0500000_282 = new AwS61S0500000_28(context, c1917290zzb, interfaceC1917380zzk, c259800zU2, c259800zU, 5);
                c609580NvY2.getClass();
                C609580NvY.LJI(context, c1917290zzb, awS61S0500000_282);
            } else if (((Boolean) GuideOutPushExperiment.LJIIIIZZ.getValue()).booleanValue()) {
                c1917290zzb.LIZ = "normal";
                C609580NvY c609580NvY3 = C609580NvY.LIZ;
                AwS61S0500000_28 awS61S0500000_283 = new AwS61S0500000_28(context, c1917290zzb, interfaceC1917380zzk, c259800zU2, c259800zU, 6);
                c609580NvY3.getClass();
                C609580NvY.LJI(context, c1917290zzb, awS61S0500000_283);
            }
        }
        return (Class) c259800zU2.element;
    }

    public static void LJIIIIZZ(Context context, C1917290zzb c1917290zzb, C10DS c10ds) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryShowUGGuideOutPushDialog(");
        sbLIZ.append(c1917290zzb.LIZLLL);
        sbLIZ.append(", ");
        sbLIZ.append(c1917290zzb.LIZ);
        sbLIZ.append(", ");
        sbLIZ.append(c1917290zzb.LIZIZ);
        sbLIZ.append(", ");
        sbLIZ.append(c1917290zzb.LIZJ);
        sbLIZ.append(", ");
        sbLIZ.append(c1917290zzb.LJ);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        if (((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LIZ()) {
            c1917290zzb.LJII = TimeUnit.DAYS.toMinutes(1L);
            c1917290zzb.LJIIIIZZ = "during_system_popup_interval";
            LIZ(context, c1917290zzb, false);
            if (c10ds != null) {
                c10ds.LIZ("during_system_popup_interval");
                return;
            }
            return;
        }
        C1917340zzg c1917340zzg = c1917290zzb.LJIIJ;
        if ((c1917340zzg != null && c1917340zzg.LIZ) || LJ(context, c1917290zzb)) {
            if (c1917290zzb.LJIIJ == null && C824390WVp.LIZJ(context)) {
                if (c10ds != null) {
                    c10ds.LIZ("has_notification_permission");
                    return;
                }
                return;
            } else {
                C609580NvY c609580NvY = C609580NvY.LIZ;
                AwS237S0300000_28 awS237S0300000_28 = new AwS237S0300000_28(context, c1917290zzb, c10ds, 5);
                c609580NvY.getClass();
                C609580NvY.LJI(context, c1917290zzb, awS237S0300000_28);
                return;
            }
        }
        LIZ(context, c1917290zzb, false);
        if (c10ds != null) {
            c10ds.LIZ("frequency_control");
        }
    }

    public static Class LJI(Context context, C10CQ c10cq, InterfaceC1917380zzk interfaceC1917380zzk, InterfaceC1917330zzf interfaceC1917330zzf) {
        boolean zIsSAAActivity;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (!PopupManager.LJI() && c19egLIZIZ != null) {
            ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
            if (iCreativeSAAService != null) {
                zIsSAAActivity = iCreativeSAAService.isSAAActivity(c19egLIZIZ);
            } else {
                zIsSAAActivity = false;
            }
            if (C290990Bar.LIZ() && zIsSAAActivity) {
                if (interfaceC1917330zzf != null) {
                    interfaceC1917330zzf.LIZ("creative_tools_forbid");
                    return null;
                }
                return null;
            }
            PopupManager.LJIJI(new C1917360zzi(c19egLIZIZ, c10cq, interfaceC1917380zzk, interfaceC1917330zzf), true);
            return C1917360zzi.class;
        }
        if (interfaceC1917330zzf == null) {
            return null;
        }
        interfaceC1917330zzf.LIZ("has_other_popup_showing");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Class LJFF(Context context, C1917290zzb c1917290zzb, PushSettings pushSettings, InterfaceC1917380zzk interfaceC1917380zzk, InterfaceC1917330zzf interfaceC1917330zzf) {
        C259800zU c259800zU = new C259800zU();
        if (pushSettings.diggPush == 0 || pushSettings.commentPush == 0 || pushSettings.followPush == 0 || pushSettings.mentionPush == 0) {
            c1917290zzb.LIZ = "toggle";
            C609580NvY c609580NvY = C609580NvY.LIZ;
            AwS61S0500000_28 awS61S0500000_28 = new AwS61S0500000_28(context, (Context) c1917290zzb, (C1917290zzb) c259800zU, (C259800zU<Class<?>>) interfaceC1917380zzk, (InterfaceC1917380zzk) interfaceC1917330zzf, (InterfaceC1917330zzf) 3);
            c609580NvY.getClass();
            C609580NvY.LJI(context, c1917290zzb, awS61S0500000_28);
        }
        return (Class) c259800zU.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Class LJIIIZ(android.content.Context r8, X.C10CQ r9, X.C1917290zzb r10, X.InterfaceC1917380zzk r11, X.InterfaceC1917330zzf r12) {
        /*
            X.19EG r2 = X.C1388190mED.LIZIZ(r8)
            boolean r0 = com.bytedance.poplayer.core.PopupManager.LJI()
            r8 = 0
            if (r0 != 0) goto L32
            if (r2 == 0) goto L32
            java.lang.Class<com.ss.android.ugc.aweme.services.ICreativeSAAService> r3 = com.ss.android.ugc.aweme.services.ICreativeSAAService.class
            r4 = 0
            r7 = 14
            r5 = r4
            r6 = r4
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.services.ICreativeSAAService r0 = (com.ss.android.ugc.aweme.services.ICreativeSAAService) r0
            if (r0 == 0) goto L30
            boolean r1 = r0.isSAAActivity(r2)
        L20:
            boolean r0 = X.C290990Bar.LIZ()
            if (r0 == 0) goto L3a
            if (r1 == 0) goto L3a
            if (r12 == 0) goto L2f
            java.lang.String r0 = "creative_tools_forbid"
            r12.LIZ(r0)
        L2f:
            return r8
        L30:
            r1 = 0
            goto L20
        L32:
            if (r12 == 0) goto L2f
            java.lang.String r0 = "has_other_popup_showing"
            r12.LIZ(r0)
            return r8
        L3a:
            X.0zzj r3 = new X.0zzj
            r3.<init>(r2, r9, r11, r12)
            java.lang.String r2 = r10.LIZ
            int r1 = r2.hashCode()
            r0 = -1039745817(0xffffffffc206bce7, float:-33.684475)
            if (r1 == r0) goto L76
            r0 = -868304044(0xffffffffcc3ebb54, float:-4.9999184E7)
            if (r1 == r0) goto L6b
            r0 = 1844104722(0x6deace12, float:9.083577E27)
            if (r1 != r0) goto L81
            java.lang.String r0 = "interaction"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L81
            java.lang.String r2 = "338_interaction"
        L5e:
            X.06g5 r1 = new X.06g5
            java.lang.String r0 = r10.LJIIJJI
            r1.<init>(r0)
            com.bytedance.poplayer.core.PopupManager.LJIJ(r3, r2, r1)
            java.lang.Class<X.0zzj> r8 = X.C1917370zzj.class
            return r8
        L6b:
            java.lang.String r0 = "toggle"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L81
            java.lang.String r2 = "338_toggle"
            goto L5e
        L76:
            java.lang.String r0 = "normal"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L81
            java.lang.String r2 = "338_normal"
            goto L5e
        L81:
            java.lang.String r2 = ""
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1917240zzW.LJIIIZ(android.content.Context, X.10CQ, X.0zzb, X.0zzk, X.0zzf):java.lang.Class");
    }
}
