package X;

import com.ss.android.ugc.aweme.network.INetwork;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R00, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R00 extends C09AY implements Function0<Long> {
    public final /* synthetic */ Function0<INetwork> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0R00(Function0<? extends INetwork> function0) {
        super(0);
        this.LL = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(this.LL.invoke().LIZIZ());
    }
}
