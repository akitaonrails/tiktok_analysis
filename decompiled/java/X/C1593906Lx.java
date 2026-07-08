package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.analytics.IIMChatRoomAnalytics;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.06Lx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1593906Lx {
    public static void LIZ(IIMChatRoomAnalytics iIMChatRoomAnalytics, EnterChatParams enterChatParams, String str, C866530Xz1 c866530Xz1, boolean z, IMUser iMUser, int i) {
        InterfaceC876950Yaj interfaceC876950YajLIZIZ;
        InterfaceC1493505sz interfaceC1493505szLIZIZ;
        boolean z2;
        String fromGroupId;
        C1DFB c1dfb;
        boolean z3;
        IMUser iMUser2 = iMUser;
        boolean z4 = z;
        String str2 = str;
        if ((i & 2) != 0) {
            str2 = "-1";
        }
        AwS581S0100000_2 awS581S0100000_2 = null;
        if ((i & 4) != 0) {
            interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
        } else {
            interfaceC876950YajLIZIZ = null;
        }
        if ((i & 16) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        } else {
            interfaceC1493505szLIZIZ = null;
        }
        if ((i & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 64) != 0) {
            fromGroupId = C1336205Ku.LIZ(false).getImVideoService().getFromGroupId();
        } else {
            fromGroupId = null;
        }
        if ((i & 128) != 0) {
            c1dfb = C0PEM.LIZJ;
        } else {
            c1dfb = null;
        }
        if ((i & 256) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 512) != 0) {
            z4 = false;
        }
        if ((i & 1024) != 0) {
            iMUser2 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            awS581S0100000_2 = new AwS581S0100000_2(enterChatParams, 70);
        }
        iIMChatRoomAnalytics.LJFF(enterChatParams, str2, interfaceC876950YajLIZIZ, c866530Xz1, interfaceC1493505szLIZIZ, z2, fromGroupId, c1dfb, z3, z4, iMUser2, awS581S0100000_2);
    }
}
