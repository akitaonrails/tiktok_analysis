package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1D95, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D95 extends C09AY implements Function0<C422850Gi3> {
    public final /* synthetic */ C1D92 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1D95(C1D92 c1d92) {
        super(0);
        this.LL = c1d92;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Gi3, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C422850Gi3 invoke() {
        return this.LL.findViewById(R.id.oty);
    }
}
