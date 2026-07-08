package X;

import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchAllInOneReportSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0emD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101750emD {
    public static final String LIZ(String str) {
        if (str.length() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static C1101820emK LIZIZ(String str) {
        if (!LiveShortTouchAllInOneReportSetting.INSTANCE.enable()) {
            return null;
        }
        return (C1101820emK) ((LinkedHashMap) C1101900emS.LIZ).get(str);
    }

    public static void LJFF(AbstractC1101760emE abstractC1101760emE) {
        InterfaceC1101720emA interfaceC1101720emA;
        String strSr;
        if (!LiveShortTouchAllInOneReportSetting.INSTANCE.enable()) {
            return;
        }
        Map<String, C1101820emK> map = C1101900emS.LIZ;
        map.remove(abstractC1101760emE.LJII());
        if ((abstractC1101760emE instanceof C1101620em0) && (interfaceC1101720emA = ((C1101620em0) abstractC1101760emE).LLIZ) != null && (strSr = interfaceC1101720emA.Sr()) != null) {
            map.remove(strSr);
        }
    }

    public static void LJI(C1101640em2 c1101640em2) {
        String strSr;
        if (!LiveShortTouchAllInOneReportSetting.INSTANCE.enable()) {
            return;
        }
        InterfaceC1101720emA interfaceC1101720emA = c1101640em2.LIZIZ;
        if (interfaceC1101720emA != null && (strSr = interfaceC1101720emA.Sr()) != null) {
            C1101900emS.LIZ.remove(strSr);
        }
        C1101900emS.LIZ.remove(c1101640em2.LIZ.Sr());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019b A[PHI: r2
      0x019b: PHI (r2v17 java.lang.String) = (r2v11 java.lang.String), (r2v11 java.lang.String), (r2v19 java.lang.String) binds: [B:38:0x017d, B:40:0x0183, B:42:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C1101820emK r8, com.bytedance.ies.sdk.datachannel.DataChannel r9, com.bytedance.android.livesdkapi.depend.model.live.Room r10, java.util.Map r11) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1101750emD.LIZJ(X.0emK, com.bytedance.ies.sdk.datachannel.DataChannel, com.bytedance.android.livesdkapi.depend.model.live.Room, java.util.Map):void");
    }

    public static void LIZLLL(DataChannel dataChannel, boolean z, Boolean bool, Long l, Integer num, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_short_touch_request");
        c474500IjALIZ.LJIIIIZZ();
        c474500IjALIZ.LJIJJLI(dataChannel);
        int i = 1;
        c474500IjALIZ.LJJII(Integer.valueOf(!z ? 1 : 0), "stage");
        if (dataChannel == null || !C500260Jjc.LJIIZILJ(dataChannel)) {
            i = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_anchor");
        if (bool != null) {
            c474500IjALIZ.LJJII(Integer.valueOf(bool.booleanValue() ? 1 : 0), "is_success");
        }
        if (l != null) {
            c474500IjALIZ.LJJII(l, "request_duration");
        }
        if (num != null) {
            c474500IjALIZ.LJJII(num, "error_code");
        }
        if (str != null) {
            c474500IjALIZ.LJJII(str, "envelop_permission");
        }
        if (str2 != null) {
            c474500IjALIZ.LJJII(str2, "goody_bag_permission");
        }
        c474500IjALIZ.LIZ();
    }
}
