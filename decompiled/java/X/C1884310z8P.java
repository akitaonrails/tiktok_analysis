package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z8P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1884310z8P extends C09AY implements Function0<View> {
    public final /* synthetic */ C1884300z8O LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1884310z8P(C1884300z8O c1884300z8O) {
        super(0);
        this.LL = c1884300z8O;
    }

    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        return this.LL.findViewById(R.id.ohv);
    }
}
