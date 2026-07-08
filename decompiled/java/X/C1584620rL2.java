package X;

import android.R;
import android.widget.TextView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rL2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584620rL2 extends C09AY implements Function0<TextView> {
    public final /* synthetic */ C1584610rL1 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1584620rL2(C1584610rL1 c1584610rL1) {
        super(0);
        this.LL = c1584610rL1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, android.widget.TextView] */
    @Override // kotlin.jvm.functions.Function0
    public final TextView invoke() {
        return this.LL.LL.findViewById(R.id.text1);
    }
}
