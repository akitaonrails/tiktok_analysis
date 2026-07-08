package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.common.setting.ActivityStatusInAppPushCTROptConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZFG, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZFG implements InterfaceC894140Z5w {
    public static final C01GW<C0ZFG> LJ = C452501pT.LIZIZ(new C0ZFJ());
    public final C603820NmG<String, Long> LIZ;
    public final Function0<String> LIZIZ;
    public final Function1<String, Boolean> LIZJ;
    public final long LIZLLL;

    public C0ZFG() {
        this(null);
    }

    public C0ZFG(Object obj) {
        C603820NmG<String, Long> c603820NmG = new C603820NmG<>(50);
        C054O c054o = new C054O();
        C06KU c06ku = new C06KU();
        long j = ((ActivityStatusInAppPushCTROptConfig) C0ZFH.LIZIZ.getValue()).sendMessageFrequencyThreshold;
        this.LIZ = c603820NmG;
        this.LIZIZ = c054o;
        this.LIZJ = c06ku;
        this.LIZLLL = j;
    }

    @Override // X.InterfaceC894140Z5w
    public final void LIZ(String str) {
        if (!((ActivityStatusInAppPushCTROptConfig) C0ZFH.LIZIZ.getValue()).enableSendMessageFrequencyStrategy || this.LIZJ.invoke(str).booleanValue()) {
            return;
        }
        this.LIZ.LIZLLL(LIZIZ(str), Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public final String LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
