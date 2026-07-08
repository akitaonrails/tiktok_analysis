package X;

import com.bytedance.android.btm.impl.page.model.PageInfo;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18DU, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18DU extends C09AY implements Function0<String> {
    public final /* synthetic */ PageInfo LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18DU(PageInfo pageInfo) {
        super(0);
        this.LL = pageInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        AtomicLong atomicLong = C801030VbZ.LIZ;
        return C801030VbZ.LIZ(this.LL.getInstanceId(), null);
    }
}
