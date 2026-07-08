package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0H36, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H36 extends C09AY implements Function0<C16F5> {
    public final /* synthetic */ View LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H36(View view) {
        super(0);
        this.LL = view;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.16F5, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C16F5 invoke() {
        return this.LL.findViewById(R.id.kya);
    }
}
