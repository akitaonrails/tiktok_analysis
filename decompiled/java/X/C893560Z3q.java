package X;

import android.util.ArrayMap;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;

/* JADX INFO: renamed from: X.0Z3q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C893560Z3q {
    public static final C893560Z3q LIZ = new C893560Z3q();

    public static void LIZ(String str, ArrayMap arrayMap) {
        String strLIZ;
        IIMAnalyticsUtil iIMAnalyticsUtil = (IIMAnalyticsUtil) PluggableExtentionKt.pluggableSpiForReal(IIMAnalyticsUtil.class);
        if (iIMAnalyticsUtil == null || (strLIZ = iIMAnalyticsUtil.LIZ(str)) == null) {
            strLIZ = "";
        }
        arrayMap.put("chat_type", strLIZ);
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ != null && c0y8tLIZ.isGroupChat()) {
            arrayMap.put("group_type", C1229100i5c.LJI(str));
            arrayMap.put("group_owner_account_type", C1528505yd.LIZ(String.valueOf(C0ZFW.LJJI(c0y8tLIZ))));
        }
    }

    public static void LIZJ(C893560Z3q c893560Z3q, Long l, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, String str6, String str7, String str8, SessionInfo sessionInfo, int i) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ;
        String str9 = str8;
        String str10 = str7;
        boolean z5 = z2;
        boolean z6 = z;
        String str11 = str6;
        boolean z7 = z4;
        boolean z8 = z3;
        if ((i & 64) != 0) {
            z6 = false;
        }
        if ((i & 128) != 0) {
            z5 = false;
        }
        if ((i & 256) != 0) {
            z8 = false;
        }
        if ((i & 512) != 0) {
            z7 = false;
        }
        SessionInfo sessionInfo2 = null;
        if ((i & 1024) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        } else {
            interfaceC1493505szLIZIZ = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str11 = "";
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str10 = null;
        }
        if ((i & 8192) != 0) {
            str9 = null;
        }
        if ((i & 32768) == 0) {
            sessionInfo2 = sessionInfo;
        }
        c893560Z3q.getClass();
        if (sessionInfo2 != null && sessionInfo2.isChatroomAnalyticsBlocked()) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C893550Z3p(str, str2, str3, str4, str11, str9, str5, z6, z5, z8, z7, str10, null, l, interfaceC1493505szLIZIZ, null), 3);
    }

    public static void LIZIZ(C893560Z3q c893560Z3q, Long l, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str6, String str7, String str8, String str9, int i) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ;
        String str10 = str9;
        String str11 = str8;
        String str12 = str7;
        String str13 = str6;
        boolean z6 = z5;
        boolean z7 = z4;
        boolean z8 = z3;
        boolean z9 = z2;
        boolean z10 = z;
        if ((i & 64) != 0) {
            z10 = false;
        }
        if ((i & 128) != 0) {
            z9 = false;
        }
        if ((i & 256) != 0) {
            z8 = false;
        }
        if ((i & 512) != 0) {
            z7 = false;
        }
        if ((i & 1024) != 0) {
            z6 = false;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        } else {
            interfaceC1493505szLIZIZ = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str13 = null;
        }
        if ((i & 8192) != 0) {
            str12 = null;
        }
        if ((i & 16384) != 0) {
            str11 = null;
        }
        if ((i & 32768) != 0) {
            str10 = null;
        }
        c893560Z3q.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C893540Z3o(str, str2, str3, str4, str5, z10, z9, z8, z7, str13, str11, str10, str12, z6, l, interfaceC1493505szLIZIZ, null), 3);
    }
}
