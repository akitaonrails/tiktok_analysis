package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0dKo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1046320dKo {
    public static Aweme LIZIZ;
    public static boolean LIZJ;
    public static final C1046320dKo LIZ = new C1046320dKo();
    public static int LIZLLL = -1;
    public static final C1046300dKm LJ = new BroadcastReceiver() { // from class: X.0dKm
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.LJFF(r0, r5) == false) goto L30;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void LIZ(android.content.Intent r17) {
            /*
                Method dump skipped, instruction units count: 597
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1046300dKm.LIZ(android.content.Intent):void");
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!C2214201BlK.LJIIJJI && intent != null) {
                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                    C2188191AkT.LIZIZ();
                }
            }
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                LIZ(intent);
            } else {
                C2408409cA.LIZ();
                LIZ(intent);
            }
        }
    };

    public static void LIZ(Context context, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Object c098200Yq;
        LIZIZ = aweme;
        if (!LIZJ && context != null && aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && C1017180cZo.LJIIIIZZ(awemeRawAd) == 1) {
            try {
                C838410Wul.LJFF(context, LJ, new IntentFilter("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT"), 2);
                LIZJ = true;
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
    }
}
