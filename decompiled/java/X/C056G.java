package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.virtual.AudienceDecorationVirtualMeasureAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.056G, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C056G extends C09AY implements Function0<C1816500xN2> {
    public final /* synthetic */ AudienceDecorationVirtualMeasureAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C056G(AudienceDecorationVirtualMeasureAssem audienceDecorationVirtualMeasureAssem) {
        super(0);
        this.LL = audienceDecorationVirtualMeasureAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0xN2, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C1816500xN2 invoke() {
        return this.LL.LJJIJL().findViewById(R.id.ba1);
    }
}
