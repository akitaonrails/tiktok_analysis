package X;

import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.IStrategyCenterService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Ut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19255310Ut {
    public static final List<C10VA> LIZ;
    public static final Map<String, C10S6> LIZIZ;

    static {
        List<C10VA> listLJIIJJI = C1697810uHb.LJIIJJI(C10V0.LIZ, new AbstractC19255610Uw() { // from class: X.10Us
            @Override // X.C10S6
            public final String getName() {
                return "app_id";
            }

            @Override // X.AbstractC19255610Uw
            public final String LIZLLL() {
                C1904800zfS.LIZ.getClass();
                C844470XAv.LIZ.getClass();
                String strValueOf = String.valueOf(C844470XAv.LJIIJ);
                return strValueOf == null ? "" : strValueOf;
            }
        }, new AbstractC19255610Uw() { // from class: X.10Ud
            @Override // X.C10S6
            public final String getName() {
                return "app_language";
            }

            @Override // X.AbstractC19255610Uw
            public final String LIZLLL() {
                String appLanguage;
                String upperCase;
                C1904800zfS.LIZ.getClass();
                ISettingService iSettingService = (ISettingService) PluggableExtentionKt.pluggableSpi$default(ISettingService.class, false, false, false, 14, null);
                return (iSettingService == null || (appLanguage = iSettingService.getAppLanguage()) == null || (upperCase = appLanguage.toUpperCase(Locale.ROOT)) == null) ? "" : upperCase;
            }
        }, new AbstractC19255610Uw() { // from class: X.10Ur
            @Override // X.C10S6
            public final String getName() {
                return "app_region";
            }

            @Override // X.AbstractC19255610Uw
            public final String LIZLLL() {
                C1904800zfS.LIZ.getClass();
                String strLIZIZ = C2222691Bz1.LIZIZ();
                return strLIZIZ == null ? "" : strLIZIZ;
            }
        }, new AbstractC19255610Uw() { // from class: X.10UD
            @Override // X.C10S6
            public final String getName() {
                return "device_check_result";
            }

            @Override // X.AbstractC19255610Uw
            public final String LIZLLL() {
                C10UB.LIZ.getClass();
                return C10UB.LIZ();
            }
        }, new AbstractC19255710Ux() { // from class: X.10V1
            @Override // X.C10S6
            public final String getName() {
                return "did_empty";
            }

            @Override // X.AbstractC19255710Ux
            public final boolean LIZLLL() {
                C1904800zfS.LIZ.getClass();
                String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
                return strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId == null || strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.length() == 0;
            }
        }, new AbstractC19255610Uw() { // from class: X.10U9
            @Override // X.C10S6
            public final String getName() {
                return "feed_ready";
            }

            @Override // X.AbstractC19255610Uw
            public final String LIZLLL() {
                C10UB.LIZ.getClass();
                C1913090zsp.LIZ.getClass();
                String value = C1913090zsp.LJ ? C1913090zsp.LJIIIIZZ ? EnumC1006850cJ9.HAS_UID.getValue() : C1913090zsp.LJII ? EnumC1006850cJ9.HAS_DID.getValue() : EnumC1006850cJ9.NO_DID_OR_UID.getValue() : EnumC1006850cJ9.NOT_READY.getValue();
                return value == null ? "" : value;
            }
        }, new AbstractC19255710Ux() { // from class: X.10V4
            @Override // X.C10S6
            public final String getName() {
                return "guest_mode";
            }

            @Override // X.AbstractC19255710Ux
            public final boolean LIZLLL() {
                C10V3.LIZ.getClass();
                IGuestModeService iGuestModeService = (IGuestModeService) PluggableExtentionKt.pluggableSpi$default(IGuestModeService.class, false, false, false, 14, null);
                if (iGuestModeService != null) {
                    return iGuestModeService.isGuestMode();
                }
                return false;
            }
        }, new AbstractC19255410Uu() { // from class: X.10VF
            @Override // X.C10S6
            public final String getName() {
                return "intention_check";
            }
        }, new AbstractC19255710Ux() { // from class: X.10VB
            @Override // X.C10S6
            public final String getName() {
                return "login_status";
            }

            @Override // X.AbstractC19255710Ux
            public final boolean LIZLLL() {
                C10V3.LIZ.getClass();
                return C10V3.LIZ();
            }
        }, new AbstractC19255610Uw() { // from class: X.10V5
            @Override // X.C10S6
            public final String getName() {
                return "new_registered_user";
            }

            @Override // X.AbstractC19255610Uw
            public final String LIZLLL() {
                C10V3.LIZ.getClass();
                return !C10V3.LIZ() ? EnumC1086010eMp.NOT_LOGIN.getValue() : C10V3.LIZIZ() ? EnumC1086010eMp.NEW_USER.getValue() : EnumC1086010eMp.NOT_NEW_USER.getValue();
            }
        }, new AbstractC19255710Ux() { // from class: X.10V7
            @Override // X.C10S6
            public final String getName() {
                return "nuj_revamp_row";
            }

            @Override // X.AbstractC19255710Ux
            public final boolean LIZLLL() {
                C10VG.LIZ.getClass();
                IStrategyCenterService iStrategyCenterService = (IStrategyCenterService) PluggableExtentionKt.pluggableSpi$default(IStrategyCenterService.class, false, false, false, 14, null);
                if (iStrategyCenterService != null) {
                    return iStrategyCenterService.LIZIZ();
                }
                return false;
            }
        }, new AbstractC19255710Ux() { // from class: X.10V8
            @Override // X.C10S6
            public final String getName() {
                return "nuj_revamp_us_eu_ab";
            }

            @Override // X.AbstractC19255710Ux
            public final boolean LIZLLL() {
                C10VG.LIZ.getClass();
                IStrategyCenterService iStrategyCenterService = (IStrategyCenterService) PluggableExtentionKt.pluggableSpi$default(IStrategyCenterService.class, false, false, false, 14, null);
                if (iStrategyCenterService != null) {
                    return iStrategyCenterService.LJ();
                }
                return false;
            }
        }, new AbstractC19255710Ux() { // from class: X.10V6
            @Override // X.C10S6
            public final String getName() {
                return "nuj_revamp_kr";
            }

            @Override // X.AbstractC19255710Ux
            public final boolean LIZLLL() {
                C10VG.LIZ.getClass();
                IStrategyCenterService iStrategyCenterService = (IStrategyCenterService) PluggableExtentionKt.pluggableSpi$default(IStrategyCenterService.class, false, false, false, 14, null);
                if (iStrategyCenterService != null) {
                    return iStrategyCenterService.LIZ();
                }
                return false;
            }
        }, new AbstractC19255710Ux() { // from class: X.10V2
            @Override // X.C10S6
            public final String getName() {
                return "old_user";
            }

            @Override // X.AbstractC19255710Ux
            public final boolean LIZLLL() {
                boolean zLJFF;
                C10V3.LIZ.getClass();
                if (C10V3.LIZ()) {
                    zLJFF = C10V3.LIZIZ();
                } else {
                    C10UB.LIZ.getClass();
                    zLJFF = Intrinsics.LJFF(C10UB.LIZ(), EnumC043600Dq.NET_NEW.getValue());
                }
                return !zLJFF;
            }
        }, new AbstractC19255710Ux() { // from class: X.10V9
            @Override // X.C10S6
            public final String getName() {
                return "private_account";
            }

            @Override // X.AbstractC19255710Ux
            public final boolean LIZLLL() {
                C10VG.LIZ.getClass();
                IStrategyCenterService iStrategyCenterService = (IStrategyCenterService) PluggableExtentionKt.pluggableSpi$default(IStrategyCenterService.class, false, false, false, 14, null);
                if (iStrategyCenterService != null) {
                    return iStrategyCenterService.LIZLLL();
                }
                return false;
            }
        }, new AbstractC19255610Uw() { // from class: X.10Uq
            @Override // X.C10S6
            public final String getName() {
                return "store_region";
            }

            @Override // X.AbstractC19255610Uw
            public final String LIZLLL() {
                String storeRegionUpperCase;
                C1904800zfS.LIZ.getClass();
                IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
                return (iAccountService == null || (storeRegionUpperCase = iAccountService.getStoreRegionUpperCase()) == null) ? "" : storeRegionUpperCase;
            }
        }, new AbstractC19255710Ux() { // from class: X.10Uy
            @Override // X.C10S6
            public final String getName() {
                return "first_launch";
            }

            @Override // X.AbstractC19255710Ux
            public final boolean LIZLLL() {
                C1904800zfS.LIZ.getClass();
                return C1514430pVp.LIZLLL().booleanValue();
            }
        }, new AbstractC19255610Uw() { // from class: X.10UA
            @Override // X.C10S6
            public final String getName() {
                return "media_source";
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
            @Override // X.AbstractC19255610Uw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.String LIZLLL() {
                /*
                    r6 = this;
                    X.10UB r0 = X.C10UB.LIZ
                    r0.getClass()
                    boolean r1 = X.C10UB.LIZJ()
                    java.lang.String r0 = "preinstall"
                    if (r1 == 0) goto Le
                    return r0
                Le:
                    boolean r1 = X.C10UB.LIZJ()
                    if (r1 != 0) goto L3a
                    java.lang.Class<com.ss.android.ugc.aweme.ug.IUgCommonService> r0 = com.ss.android.ugc.aweme.ug.IUgCommonService.class
                    r1 = 0
                    r4 = 14
                    r5 = 0
                    r2 = r1
                    r3 = r1
                    java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
                    com.ss.android.ugc.aweme.ug.IUgCommonService r0 = (com.ss.android.ugc.aweme.ug.IUgCommonService) r0
                    if (r0 == 0) goto L3b
                    r0.LJIILLIIL()
                    X.10Wk r0 = X.C19259610Wk.LIZ
                    if (r0 == 0) goto L3b
                    boolean r1 = X.C19259610Wk.LJI()
                    r0 = 1
                    if (r1 != r0) goto L3b
                    java.lang.String r0 = X.C19259610Wk.LIZLLL()
                L36:
                    if (r0 != 0) goto L3a
                    java.lang.String r0 = ""
                L3a:
                    return r0
                L3b:
                    java.lang.String r0 = "un_know_not_ready"
                    goto L36
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C10UA.LIZLLL():java.lang.String");
            }
        }, new AbstractC19255710Ux() { // from class: X.10VC
            @Override // X.C10S6
            public final String getName() {
                return "is_preinstall";
            }

            @Override // X.AbstractC19255710Ux
            public final boolean LIZLLL() {
                C10UB.LIZ.getClass();
                return C10UB.LIZJ();
            }
        }, new AbstractC19255710Ux() { // from class: X.10Uz
            @Override // X.C10S6
            public final String getName() {
                return "settings_request_ready";
            }

            @Override // X.AbstractC19255710Ux
            public final boolean LIZLLL() {
                C1904800zfS.LIZ.getClass();
                IUgCommonService iUgCommonService = (IUgCommonService) PluggableExtentionKt.pluggableSpi$default(IUgCommonService.class, false, false, false, 14, null);
                if (iUgCommonService != null) {
                    return iUgCommonService.LIZIZ();
                }
                return false;
            }
        }, new AbstractC19255610Uw() { // from class: X.10VD
            @Override // X.C10S6
            public final String getName() {
                return "nuj_revamp_client_ab";
            }

            @Override // X.AbstractC19255610Uw
            public final String LIZLLL() {
                C10VG.LIZ.getClass();
                return "";
            }
        }, new AbstractC19255610Uw() { // from class: X.10VE
            @Override // X.C10S6
            public final String getName() {
                return "nuj_revamp_us_eu_client_ab";
            }

            @Override // X.AbstractC19255610Uw
            public final String LIZLLL() {
                C10VG.LIZ.getClass();
                return "";
            }
        });
        LIZ = listLJIIJJI;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJIIJJI, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ >= 16 ? iLIZIZ : 16);
        for (C10VA c10va : listLJIIJJI) {
            linkedHashMap.put(c10va.getName(), c10va);
        }
        LIZIZ = linkedHashMap;
    }

    public static EnumC19255510Uv LIZ(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1039699439) {
            if (iHashCode != 60) {
                if (iHashCode != 62) {
                    if (iHashCode != 1084) {
                        if (iHashCode != 1921) {
                            if (iHashCode != 1952) {
                                if (iHashCode != 1983) {
                                    if (iHashCode == 3365 && str.equals("in")) {
                                        return EnumC19255510Uv.IN;
                                    }
                                } else if (str.equals(">=")) {
                                    return EnumC19255510Uv.GREATER_THAN_OR_EQUAL;
                                }
                            } else if (str.equals("==")) {
                                return EnumC19255510Uv.EQUAL;
                            }
                        } else if (str.equals("<=")) {
                            return EnumC19255510Uv.LESS_THAN_OR_EQUAL;
                        }
                    } else if (str.equals("!=")) {
                        return EnumC19255510Uv.NOT_EQUAL;
                    }
                } else if (str.equals(">")) {
                    return EnumC19255510Uv.GREATER_THAN;
                }
            } else if (str.equals("<")) {
                return EnumC19255510Uv.LESS_THAN;
            }
        } else if (str.equals("not_in")) {
            return EnumC19255510Uv.NOT_IN;
        }
        return EnumC19255510Uv.UNKNOWN;
    }

    public static C10S6 LIZIZ(String str) {
        C1865740yeS c1865740yeS = C1865740yeS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get filter:");
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZIZ;
        sbLIZ.append(linkedHashMap.get(str));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1865740yeS.getClass();
        C1865740yeS.LIZJ("kmp_swipe_up", strLIZIZ);
        C10S6 c10s6 = (C10S6) linkedHashMap.get(str);
        if (c10s6 == null) {
            return C10V0.LIZ;
        }
        return c10s6;
    }
}
