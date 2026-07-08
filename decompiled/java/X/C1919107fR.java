package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageSender;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07fR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1919107fR {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(787));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(790));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(791));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(788));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(789));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(786));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(785));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(793));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(794));
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(792));

    public static final int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static final int LIZIZ(boolean z) {
        if (z) {
            return ((Number) LIZIZ.getValue()).intValue();
        }
        return ((Number) LIZJ.getValue()).intValue();
    }

    public static final boolean LIZJ(InterfaceC1858000yRy interfaceC1858000yRy, InterfaceC1858000yRy interfaceC1858000yRy2) {
        MessageSender messageSender;
        Message messageLIZ;
        MessageSender messageSender2;
        String str;
        String str2;
        String str3;
        Message messageLIZ2;
        Message messageLIZ3;
        Message messageLIZ4 = C321970Cjj.LIZ(interfaceC1858000yRy);
        if (messageLIZ4 != null && (messageSender = messageLIZ4.sender) != null && !messageSender.isSelf && (messageLIZ = C321970Cjj.LIZ(interfaceC1858000yRy2)) != null && (messageSender2 = messageLIZ.sender) != null && !messageSender2.isSelf) {
            Message messageLIZ5 = C321970Cjj.LIZ(interfaceC1858000yRy2);
            String str4 = null;
            if (messageLIZ5 != null) {
                str = messageLIZ5.replyUuid;
            } else {
                str = null;
            }
            if (C123100dR.LIZ(str)) {
                if (interfaceC1858000yRy != null && (messageLIZ3 = C321970Cjj.LIZ(interfaceC1858000yRy)) != null) {
                    str2 = messageLIZ3.replyUuid;
                } else {
                    str2 = null;
                }
                if (C123100dR.LIZ(str2)) {
                    Message messageLIZ6 = C321970Cjj.LIZ(interfaceC1858000yRy2);
                    if (messageLIZ6 != null) {
                        str3 = messageLIZ6.replyUuid;
                    } else {
                        str3 = null;
                    }
                    if (interfaceC1858000yRy != null && (messageLIZ2 = C321970Cjj.LIZ(interfaceC1858000yRy)) != null) {
                        str4 = messageLIZ2.replyUuid;
                    }
                    if (Intrinsics.LJFF(str3, str4)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
