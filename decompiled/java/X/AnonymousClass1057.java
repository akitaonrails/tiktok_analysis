package X;

import Y.AfS197S0100000_28;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1057, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class AnonymousClass1057 {
    public static final AnonymousClass1057 LIZ = new AnonymousClass1057();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(801));
    public static final Keva LIZJ = KevaImpl.getRepo("privacy_settings_notify", 1);
    public static String LIZLLL;
    public static Long LJ;

    public static Long LIZIZ() {
        C191819102n.LIZ.getClass();
        String strLIZIZ = C191819102n.LIZIZ();
        String str = LIZLLL;
        if (str == null || !TextUtils.equals(strLIZIZ, str)) {
            LJ = null;
        }
        if (LJ == null) {
            Keva keva = LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("video_reported_time-");
            sbLIZ.append(strLIZIZ);
            long j = keva.getLong(C2188811AlT.LIZIZ(sbLIZ), -1L);
            if (j != -1) {
                LJ = Long.valueOf(j);
            }
            LIZLLL = strLIZIZ;
        }
        return LJ;
    }

    public static boolean LIZ(String str) {
        C191821102p.LIZIZ().getClass();
        Integer numLJIIIIZZ = C191880104w.LJIIIIZZ(str, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (numLJIIIIZZ != null && numLJIIIIZZ.intValue() == 1) {
            return true;
        }
        return false;
    }

    public static void LIZLLL(Long l) {
        if (Intrinsics.LJFF(l, LJ)) {
            return;
        }
        LJ = l;
        C191819102n.LIZ.getClass();
        String strLIZIZ = C191819102n.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("video_reported_time-");
        sbLIZ.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        if (l == null) {
            LIZJ.erase(strLIZIZ2);
        } else {
            LIZJ.storeLong(strLIZIZ2, l.longValue());
        }
    }

    public static void LIZJ(final String str, Function0 function0) {
        C191880104w.LJIILLIIL(C191821102p.LIZIZ(), str, 4).LJJIIJ(new InterfaceC781210Ukh() { // from class: X.105E
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                C191880104w c191880104wLIZIZ = C191821102p.LIZIZ();
                String str2 = str;
                c191880104wLIZIZ.getClass();
                C191880104w.LJIIZILJ(str2);
            }
        }).LJJLL(new AfS197S0100000_28(function0, 91), new C09JN() { // from class: X.0ylq
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("NotifyManager@4ebb.notifyByInboxNotification$3");
                C1C7U.LIZIZ("NotifyManager@4ebb.notifyByInboxNotification$3");
            }
        });
    }
}
