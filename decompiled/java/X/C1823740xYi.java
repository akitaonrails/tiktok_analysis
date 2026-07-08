package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.viewmodel.PcsServicePlusOptinVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823740xYi extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ PcsServicePlusOptinVM LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1823740xYi(PcsServicePlusOptinVM pcsServicePlusOptinVM, String str) {
        super(1);
        this.LL = pcsServicePlusOptinVM;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.LL.yQ2(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
