package X;

import Y.AfS10S2000000_12;
import com.bytedance.android.live.wallet.data.api.ICancelRetentionApi;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.RechargeRetentionPopupConfig;

/* JADX INFO: renamed from: X.0Tc0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C750340Tc0 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(RechargeRetentionPopupConfig rechargeRetentionPopupConfig) {
        C0U53.Rd.LIZJ(Boolean.valueOf(rechargeRetentionPopupConfig.showRetentionPopup));
        if (rechargeRetentionPopupConfig.eventInfo.containsKey("show")) {
            LIZIZ("show", rechargeRetentionPopupConfig.eventInfo.get("show"));
        }
        if (rechargeRetentionPopupConfig.eventInfo.containsKey("cancel")) {
            LIZIZ("cancel", rechargeRetentionPopupConfig.eventInfo.get("cancel"));
        }
    }

    public static void LIZ(final String str, final String str2) {
        C480460Ism.LIZ().getClass();
        ICancelRetentionApi iCancelRetentionApi = (ICancelRetentionApi) C480460Ism.LIZLLL(ICancelRetentionApi.class);
        long jCurrentTimeMillis = System.currentTimeMillis();
        final C118300cf c118300cf = new C118300cf();
        iCancelRetentionApi.updateRetentionFrequency(str2, jCurrentTimeMillis, str).LJIILIIL(new C0UO0()).LJJLIIIJLJLI(new InterfaceC1487280oo2() { // from class: X.0Tc1
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                final C11NZ c11nz = (C11NZ) obj;
                final String str3 = str;
                final C118300cf c118300cf2 = c118300cf;
                final int i = 1;
                final long j = 500;
                final String str4 = str2;
                return c11nz.LJJJ(new InterfaceC1487280oo2() { // from class: X.0Tc2
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj2) {
                        LinkedHashMap linkedHashMap;
                        long j2;
                        RechargeRetentionPopupConfig.EventInfo eventInfo;
                        RechargeRetentionPopupConfig.EventInfo eventInfo2;
                        if (Intrinsics.LJFF(str3, "recharge_cancel_retention_dialog")) {
                            C118300cf c118300cf3 = c118300cf2;
                            int i2 = c118300cf3.element;
                            if (i2 < i) {
                                c118300cf3.element = i2 + 1;
                                return C11NZ.LJJJJZ(c11nz).LJJI(j, TimeUnit.MILLISECONDS);
                            }
                            String str5 = str4;
                            C0JT6<Map<String, RechargeRetentionPopupConfig.EventInfo>> c0jt6 = C0U53.Sd;
                            Map<String, RechargeRetentionPopupConfig.EventInfo> mapLIZ = c0jt6.LIZ();
                            if (mapLIZ != null) {
                                linkedHashMap = new LinkedHashMap(mapLIZ);
                            } else {
                                linkedHashMap = new LinkedHashMap();
                            }
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            RechargeRetentionPopupConfig.EventInfo eventInfo3 = (RechargeRetentionPopupConfig.EventInfo) linkedHashMap.get(str5);
                            if (eventInfo3 != null) {
                                j2 = eventInfo3.latestTimestamp;
                            } else {
                                j2 = 0;
                            }
                            if (j2 < jCurrentTimeMillis2) {
                                if ((Intrinsics.LJFF(str5, "show") || Intrinsics.LJFF(str5, "cancel")) && (eventInfo = (RechargeRetentionPopupConfig.EventInfo) linkedHashMap.get(str5)) != null) {
                                    eventInfo.latestTimestamp = jCurrentTimeMillis2;
                                }
                                if (Intrinsics.LJFF(str5, "reset") && (eventInfo2 = (RechargeRetentionPopupConfig.EventInfo) linkedHashMap.get("cancel")) != null) {
                                    eventInfo2.currentCount = 0;
                                }
                            }
                            c0jt6.LIZJ(linkedHashMap);
                            return C11NZ.LJJIJLIJ(new Throwable("retry reaches maximum"));
                        }
                        if (Intrinsics.LJFF(str3, "recharge_v3_retention_dialog") && Intrinsics.LJFF(str4, "show")) {
                            if (C1804180x3A.LIZIZ()) {
                                C0U53.Ud.LIZJ(Long.valueOf(C158B.LIZ()));
                            }
                            return C11NZ.LJJJJZ(c11nz);
                        }
                        return C11IR.LL;
                    }
                }, false);
            }
        }).LJJLJLI(new AfS10S2000000_12(str, str2, 1));
    }

    public static void LIZIZ(String str, RechargeRetentionPopupConfig.EventInfo eventInfo) {
        LinkedHashMap linkedHashMap;
        if (eventInfo == null) {
            return;
        }
        C0JT6<Map<String, RechargeRetentionPopupConfig.EventInfo>> c0jt6 = C0U53.Sd;
        Map<String, RechargeRetentionPopupConfig.EventInfo> mapLIZ = c0jt6.LIZ();
        if (mapLIZ != null) {
            linkedHashMap = new LinkedHashMap(mapLIZ);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put(str, eventInfo);
        c0jt6.LIZJ(linkedHashMap);
    }
}
