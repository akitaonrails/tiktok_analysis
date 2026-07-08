package X;

import android.os.Bundle;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T9J, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T9J extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Bundle LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0T9J(String str, Bundle bundle) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = bundle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
