package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.virtual.AudienceDecorationVirtualMeasureAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xNP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816730xNP extends C09AY implements Function1<AbstractC1817030xNt, Unit> {
    public final /* synthetic */ AudienceDecorationVirtualMeasureAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816730xNP(AudienceDecorationVirtualMeasureAssem audienceDecorationVirtualMeasureAssem) {
        super(1);
        this.LL = audienceDecorationVirtualMeasureAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1817030xNt abstractC1817030xNt) {
        AbstractC1817030xNt abstractC1817030xNt2 = abstractC1817030xNt;
        Context context = this.LL.getContext();
        if (context != null) {
            this.LL.No().vQ2(abstractC1817030xNt2, context);
        }
        return Unit.LIZ;
    }
}
