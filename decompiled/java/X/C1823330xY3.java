package X;

import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.assem.PcsServiceBioContentAssemV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xY3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823330xY3 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsServiceBioContentAssemV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1823330xY3(PcsServiceBioContentAssemV2 pcsServiceBioContentAssemV2) {
        super(0);
        this.LL = pcsServiceBioContentAssemV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ValueAnimator valueAnimator = this.LL.LLJJJJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        return Unit.LIZ;
    }
}
