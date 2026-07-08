package X;

import android.telephony.TelephonyManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0jxP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1300890jxP extends C09AY implements Function1<C838040WuA, String> {
    public final /* synthetic */ TelephonyManager LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1300890jxP(TelephonyManager telephonyManager) {
        super(1);
        this.LL = telephonyManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(C838040WuA c838040WuA) {
        return this.LL.getSimCountryIso();
    }
}
