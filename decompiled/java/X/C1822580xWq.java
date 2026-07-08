package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.dialog.PcsServiceBioDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xWq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822580xWq extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ PcsServiceBioDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1822580xWq(PcsServiceBioDialog pcsServiceBioDialog) {
        super(1);
        this.LL = pcsServiceBioDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2;
        C1822330xWR c1822330xWRUS = this.LL.uS();
        if (c1822330xWRUS != null) {
            str2 = c1822330xWRUS.LLILLL;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str, str2)) {
            this.LL.close(1);
        }
        return Unit.LIZ;
    }
}
