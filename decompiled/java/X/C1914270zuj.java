package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0zuj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1914270zuj {
    public static final C1914270zuj LIZ = new C1914270zuj();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(779));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01e4, code lost:
    
        if (r3.intValue() == r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0135, code lost:
    
        if (r1.equals("Undecided") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013e, code lost:
    
        if (r1.equals("3") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0141, code lost:
    
        r8 = X.EnumC1876780ywG.NOTDETERMINED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014a, code lost:
    
        if (r1.equals("2") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0153, code lost:
    
        if (r1.equals("1") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015c, code lost:
    
        if (r1.equals("Reject") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x015f, code lost:
    
        r8 = X.EnumC1876780ywG.REJECT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0168, code lost:
    
        if (r1.equals("Approve") != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x016a, code lost:
    
        r8 = X.EnumC1876780ywG.APPROVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x016c, code lost:
    
        if (r8 != null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0191, code lost:
    
        if (r3 == r8.getI()) goto L100;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:103:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam r17, com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction r18, X.C1519370pdn r19, X.InterfaceC1631630sYr<? super java.lang.String, ? super X.EnumC1876780ywG, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1914270zuj.LIZIZ(com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam, com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction, X.0pdn, X.0sYr):void");
    }

    public static void LIZ(C1914270zuj c1914270zuj, String str, String str2, String str3, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        c1914270zuj.getClass();
        InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("reason", str));
        if (str2 != null) {
            mapLJIIJ.put("consent_key", str2);
        }
        if (str3 != null) {
            mapLJIIJ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3);
        }
        interfaceC1519030pdFLIZJ.LIZJ("pns_consent_collector_exception", null, mapLJIIJ, null);
    }
}
