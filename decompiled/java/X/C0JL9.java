package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.moderator.PcsServiceBioModeratorDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JL9, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JL9 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsServiceBioModeratorDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JL9(PcsServiceBioModeratorDialog pcsServiceBioModeratorDialog) {
        super(0);
        this.LL = pcsServiceBioModeratorDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.uS().vQ2();
        return Unit.LIZ;
    }
}
