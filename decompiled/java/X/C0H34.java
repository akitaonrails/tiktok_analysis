package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0H34, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H34 extends C09AY implements Function0<C1324720kZq> {
    public final /* synthetic */ View LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H34(View view) {
        super(0);
        this.LL = view;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0kZq, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C1324720kZq invoke() {
        return this.LL.findViewById(R.id.flr);
    }
}
