package X;

import Y.AfS3S1200100_18;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.o;
import com.google.gson.s;
import java.io.EOFException;
import java.io.IOException;
import java.net.ConnectException;
import java.util.Map;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0Oqq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632140Oqq {
    public static final Pair<Integer, String> LJ(Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnknownError[");
        int cronetInternalErrorCode = Integer.MIN_VALUE;
        sbLIZ.append(Integer.MIN_VALUE);
        sbLIZ.append("][");
        sbLIZ.append(th.getMessage());
        sbLIZ.append(']');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (th instanceof C09HQ) {
            C09HQ c09hq = (C09HQ) th;
            cronetInternalErrorCode = c09hq.code();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("HttpException[");
            sbLIZ2.append(cronetInternalErrorCode);
            sbLIZ2.append("][");
            sbLIZ2.append(c09hq.message());
            sbLIZ2.append(']');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else if (th instanceof EOFException) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("EOFException[");
            cronetInternalErrorCode = -10010;
            sbLIZ3.append(-10010);
            sbLIZ3.append(']');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        } else if (th instanceof IllegalArgumentException) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("IllegalArgumentException[");
            cronetInternalErrorCode = -10011;
            sbLIZ4.append(-10011);
            sbLIZ4.append(']');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        } else if (th instanceof C0XIO) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("JSONParseException[");
            cronetInternalErrorCode = -10012;
            sbLIZ5.append(-10012);
            sbLIZ5.append(']');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
        } else if (th instanceof s) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("JsonSyntaxException[");
            cronetInternalErrorCode = -10013;
            sbLIZ6.append(-10013);
            sbLIZ6.append(']');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
        } else if (th instanceof o) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("JsonParseException[");
            cronetInternalErrorCode = -10015;
            sbLIZ7.append(-10015);
            sbLIZ7.append(']');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ7);
        } else if (th instanceof JSONException) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("JSONException[");
            cronetInternalErrorCode = -10016;
            sbLIZ8.append(-10016);
            sbLIZ8.append(']');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ8);
        } else if (th instanceof SSLHandshakeException) {
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("SSLHandshakeException[");
            cronetInternalErrorCode = -10017;
            sbLIZ9.append(-10017);
            sbLIZ9.append(']');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ9);
        } else if (th instanceof ConnectException) {
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("ConnectException[");
            cronetInternalErrorCode = -10018;
            sbLIZ10.append(-10018);
            sbLIZ10.append(']');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ10);
        } else if (th instanceof C23112093u) {
            cronetInternalErrorCode = ((C23112093u) th).getErrorCode();
            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
            sbLIZ11.append("ApiException[");
            sbLIZ11.append(cronetInternalErrorCode);
            sbLIZ11.append(']');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ11);
            if (th instanceof C0XIR) {
                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                sbLIZ12.append("ApiServerException[");
                sbLIZ12.append(cronetInternalErrorCode);
                sbLIZ12.append("][");
                sbLIZ12.append(((C0XIR) th).getErrorMsg());
                sbLIZ12.append(']');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ12);
            }
        } else if (th instanceof C632200Oqw) {
            C632200Oqw c632200Oqw = (C632200Oqw) th;
            cronetInternalErrorCode = c632200Oqw.getErrorCode();
            StringBuilder sbLIZ13 = C2188811AlT.LIZ();
            sbLIZ13.append("ApiServerException[");
            sbLIZ13.append(cronetInternalErrorCode);
            sbLIZ13.append("][");
            sbLIZ13.append(c632200Oqw.getErrorMsg());
            sbLIZ13.append(']');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ13);
        } else if (th instanceof C1494690ozz) {
            C1494690ozz c1494690ozz = (C1494690ozz) th;
            if (c1494690ozz.getStatusCode() > 0) {
                cronetInternalErrorCode = c1494690ozz.getStatusCode();
            } else {
                cronetInternalErrorCode = c1494690ozz.getCronetInternalErrorCode();
            }
            StringBuilder sbLIZ14 = C2188811AlT.LIZ();
            sbLIZ14.append("CronetIOException[");
            sbLIZ14.append(c1494690ozz.getStatusCode());
            sbLIZ14.append("][");
            sbLIZ14.append(c1494690ozz.getCronetInternalErrorCode());
            sbLIZ14.append(']');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ14);
        } else if (th instanceof IOException) {
            StringBuilder sbLIZ15 = C2188811AlT.LIZ();
            sbLIZ15.append("IOException[");
            cronetInternalErrorCode = -10014;
            sbLIZ15.append(-10014);
            sbLIZ15.append(']');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ15);
            if (th instanceof C1494450ozb) {
                StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                sbLIZ16.append("NetworkNotAvailabeException[");
                cronetInternalErrorCode = -10019;
                sbLIZ16.append(-10019);
                sbLIZ16.append(']');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ16);
            }
        }
        return new Pair<>(Integer.valueOf(cronetInternalErrorCode), strLIZIZ);
    }

    public static final void LIZJ(long j, String str, Map map) {
        try {
            C589830NBl.LIZ.getClass();
            C589830NBl.LIZIZ(str, 0, j, null, "", "", map);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final C19482711Kf LIZLLL(final C11NZ c11nz, final String str, final Map map) {
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0gJk
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<T> c09aj) {
                C1C7U.LIZ("ComplianceBizNetworkMonitorKt@21f4.networkMonitor$1");
                long jCurrentTimeMillis = System.currentTimeMillis();
                C11NZ<T> c11nz2 = c11nz;
                String str2 = str;
                Map<String, String> map2 = map;
                C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                c11nz2.LJJZ(new AfS3S1200100_18(c19482611Ke, str2, jCurrentTimeMillis, map2, 1), new AfS3S1200100_18(c19482611Ke, str2, jCurrentTimeMillis, map2, 2), new C1208880hZ0(c19482611Ke, 4));
                C1C7U.LIZIZ("ComplianceBizNetworkMonitorKt@21f4.networkMonitor$1");
            }
        });
    }

    public static final void LIZ(int i, long j, String str, boolean z) {
        int i2;
        C2241008qG c2241008qG = new C2241008qG();
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c2241008qG.LIZ.put("isSuccess", Integer.valueOf(i2));
        c2241008qG.LIZ.put("service", str);
        c2241008qG.LIZ.put("code", Integer.valueOf(i));
        c2241008qG.LIZ.put("duration", Long.valueOf(j));
        C20684815ws.LJIJ("compliance_api_status", c2241008qG.LJ());
    }

    public static final void LIZIZ(long j, String str, Throwable th, Map map) {
        try {
            Pair<Integer, String> pairLJ = LJ(th);
            int iIntValue = pairLJ.getFirst().intValue();
            String second = pairLJ.getSecond();
            C589830NBl c589830NBl = C589830NBl.LIZ;
            int iLIZIZ = C632190Oqv.LIZIZ(th);
            Integer numValueOf = Integer.valueOf(iIntValue);
            String strLIZJ = C632190Oqv.LIZJ(th);
            c589830NBl.getClass();
            C589830NBl.LIZIZ(str, iLIZIZ, j, numValueOf, second, strLIZJ, map);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }
}
