package X;

import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.model.OpenLoopUcpParams;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.model.UcpProperties;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DBY, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DBY {
    public static String LIZIZ(Double d) {
        if (d != null && d.doubleValue() > 0.0d) {
            return C786410Ut5.k4(Locale.US, "%.2f", Arrays.copyOf(new Object[]{d}, 1));
        }
        return null;
    }

    public static String LIZJ(String str) {
        boolean z;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        String strK4 = null;
        if (z) {
            return null;
        }
        String strReplace = new Regex("[^0-9.\\-]").replace(str, "");
        if (a0.LJJJIL(strReplace)) {
            return null;
        }
        try {
            double d = CastDoubleProtector.parseDouble(strReplace);
            if (d > 0.0d) {
                strK4 = C786410Ut5.k4(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                return strK4;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return strK4;
    }

    public static CommonAdData LIZLLL(Map map) {
        Long lLJIILIIL;
        long jLJIILIIL;
        CommonAdData commonAdData = null;
        if (map == null || map.isEmpty()) {
            return null;
        }
        String str = (String) map.get("creative_id");
        if (str != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(str);
        } else {
            lLJIILIIL = null;
        }
        String str2 = (String) map.get("log_extra");
        String str3 = (String) map.get("group_id");
        if (lLJIILIIL != null && str2 != null) {
            long jLongValue = lLJIILIIL.longValue();
            commonAdData = new CommonAdData();
            commonAdData.setCreativeId(Long.valueOf(jLongValue));
            commonAdData.setLogExtra(str2);
            if (str3 == null || (jLJIILIIL = C2095008Iq.LJIILIIL(str3)) == null) {
                jLJIILIIL = 0L;
            }
            commonAdData.setGroupId(jLJIILIIL);
        }
        return commonAdData;
    }

    public static long LJ(String str) {
        String string;
        String str2;
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != 0) {
                if (iHashCode != 54) {
                    switch (iHashCode) {
                        case 48:
                            str2 = CardStruct.IStatusCode.DEFAULT;
                            break;
                        case 49:
                            str2 = "1";
                            break;
                        case BaseNotice.RECOMMEND_LIVE /* 50 */:
                            if (!string.equals("2")) {
                                return 1L;
                            }
                            return 2L;
                        case 51:
                            if (!string.equals("3")) {
                                return 1L;
                            }
                            return 3L;
                        default:
                            return 1L;
                    }
                } else {
                    if (!string.equals("6")) {
                        return 1L;
                    }
                    return 6L;
                }
            } else {
                str2 = "";
            }
            string.equals(str2);
            return 1L;
        }
        return 1L;
    }

    public static String LIZ(final Map map, String str, UcpProperties ucpProperties) {
        String str2;
        boolean z;
        OpenLoopUcpParams openLoopUcpParams;
        String str3;
        Object c098200Yq;
        String str4;
        Object c098200Yq2;
        String str5;
        Integer numLJIIJJI;
        final String str6 = C335000DBi.LIZLLL.get(str);
        if (str6 == null) {
            return null;
        }
        if (map != null) {
            str2 = (String) map.get("open_loop_ucp_params");
        } else {
            str2 = null;
        }
        boolean z2 = true;
        if (str2 != null && !a0.LJJJIL(str2)) {
            z = false;
        } else {
            z = true;
        }
        if (z || (openLoopUcpParams = (OpenLoopUcpParams) C051K.LIZIZ(str2, OpenLoopUcpParams.class)) == null) {
            return null;
        }
        if (map == null || (str5 = (String) map.get("protocol_type")) == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str5)) == null || numLJIIJJI.intValue() != 1) {
            z2 = false;
        }
        if (z2) {
            str3 = "acp_ole";
        } else {
            str3 = "ucp_ole";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str6);
        sbLIZ.append('_');
        sbLIZ.append(UUID.randomUUID());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            c098200Yq = C051K.LIZLLL(false, false, false, new OpenLoopUcpParams(openLoopUcpParams.pixel, openLoopUcpParams.eventSource, str3, openLoopUcpParams.page, openLoopUcpParams.user, str6, strLIZIZ, simpleDateFormat.format(new Date()), ucpProperties, openLoopUcpParams.adInfo));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        final String str7 = (String) c098200Yq;
        if (str7 != null && map != null) {
            try {
                C0D6L c0d6l = (C0D6L) PluggableExtentionKt.pluggableSpi$default(C0D6L.class, false, false, false, 14, null);
                if (c0d6l != null && c0d6l.LIZJ()) {
                    if (ucpProperties != null) {
                        C0DBY c0dby = C335000DBi.LIZJ;
                        try {
                            c098200Yq2 = C051K.LIZLLL(false, false, false, ucpProperties);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c098200Yq2 = new C098200Yq(th2);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                            c098200Yq2 = null;
                        }
                        str4 = (String) c098200Yq2;
                    } else {
                        str4 = null;
                    }
                    final String str8 = "AdUcpEventTrackingLogger";
                    final String str9 = str4;
                    new Serializable(str6, map, str7, str9, str8) { // from class: X.0DBZ
                        public static final long serialVersionUID = 1;
                        public final String enrichedOpenLoopUcpParams;
                        public final String event;
                        public final String module;
                        public final Map<String, String> passThrough;
                        public final String propertiesJson;
                        public static final C334920DBa Companion = new Object() { // from class: X.0DBa
                        };
                        public static final List<String> SUPPORTED_EVENTS = C1697810uHb.LJIIJJI("on_web_detail", "initiate_order", "on_web_order", "add_billing");
                        public static final List<String> EVENTS_REQUIRING_PROPERTIES = C1697810uHb.LJIIJJI("initiate_order", "on_web_order", "add_billing");

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C0DBZ)) {
                                return false;
                            }
                            C0DBZ c0dbz = (C0DBZ) obj;
                            return Intrinsics.LJFF(this.event, c0dbz.event) && Intrinsics.LJFF(this.passThrough, c0dbz.passThrough) && Intrinsics.LJFF(this.enrichedOpenLoopUcpParams, c0dbz.enrichedOpenLoopUcpParams) && Intrinsics.LJFF(this.propertiesJson, c0dbz.propertiesJson) && Intrinsics.LJFF(this.module, c0dbz.module);
                        }

                        public int hashCode() {
                            int iHashCode = ((this.event.hashCode() * 31) + this.passThrough.hashCode()) * 31;
                            String str10 = this.enrichedOpenLoopUcpParams;
                            int iHashCode2 = (iHashCode + (str10 == null ? 0 : str10.hashCode())) * 31;
                            String str11 = this.propertiesJson;
                            int iHashCode3 = (iHashCode2 + (str11 == null ? 0 : str11.hashCode())) * 31;
                            String str12 = this.module;
                            return iHashCode3 + (str12 != null ? str12.hashCode() : 0);
                        }

                        public String toString() {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("ShallowAttributionDebugRequest(event=");
                            sbLIZ2.append(this.event);
                            sbLIZ2.append(", passThrough=");
                            sbLIZ2.append(this.passThrough);
                            sbLIZ2.append(", enrichedOpenLoopUcpParams=");
                            sbLIZ2.append(this.enrichedOpenLoopUcpParams);
                            sbLIZ2.append(", propertiesJson=");
                            sbLIZ2.append(this.propertiesJson);
                            sbLIZ2.append(", module=");
                            sbLIZ2.append(this.module);
                            sbLIZ2.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ2);
                        }

                        public final boolean requiresProperties() {
                            return EVENTS_REQUIRING_PROPERTIES.contains(this.event);
                        }

                        {
                            this.event = str6;
                            this.passThrough = map;
                            this.enrichedOpenLoopUcpParams = str7;
                            this.propertiesJson = str9;
                            this.module = str8;
                        }
                    };
                    c0d6l.LIZIZ();
                    return str7;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return str7;
    }
}
