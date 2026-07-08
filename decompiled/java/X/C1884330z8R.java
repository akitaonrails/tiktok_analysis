package X;

import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z8R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1884330z8R extends C09AY implements Function0<ViewGroup> {
    public final /* synthetic */ C1884300z8O LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1884330z8R(C1884300z8O c1884300z8O) {
        super(0);
        this.LL = c1884300z8O;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, android.view.ViewGroup] */
    @Override // kotlin.jvm.functions.Function0
    public final ViewGroup invoke() {
        return this.LL.findViewById(R.id.ohw);
    }
}
