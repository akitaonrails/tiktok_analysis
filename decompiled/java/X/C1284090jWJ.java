package X;

import android.telephony.TelephonyManager;
import com.bytedance.bpea.basics.Cert;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0jWJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284090jWJ extends C09AY implements Function0<String> {
    public final /* synthetic */ TelephonyManager LL;
    public final /* synthetic */ Cert LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1284090jWJ(TelephonyManager telephonyManager, Cert cert) {
        super(0);
        this.LL = telephonyManager;
        this.LLILLJJLI = cert;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        AtomicBoolean atomicBoolean = C794320VDy.LIZ;
        return C1300840jxK.LJIIIZ(this.LL, this.LLILLJJLI);
    }
}
