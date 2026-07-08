package X;

import com.bytedance.im.core.model.DefaultConvReadInfoHelper;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YDI, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YDI extends C09AY implements Function0<DefaultConvReadInfoHelper> {
    public final /* synthetic */ C0YDN LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YDI(C0YDN c0ydn) {
        super(0);
        this.LL = c0ydn;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DefaultConvReadInfoHelper invoke() {
        return new DefaultConvReadInfoHelper(this.LL.LIZ);
    }
}
