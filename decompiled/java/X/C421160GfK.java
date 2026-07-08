package X;

import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0GfK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421160GfK extends C09AY implements Function0<FrameLayout> {
    public final /* synthetic */ C428890Grn LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C421160GfK(C428890Grn c428890Grn) {
        super(0);
        this.LL = c428890Grn;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, android.widget.FrameLayout] */
    @Override // kotlin.jvm.functions.Function0
    public final FrameLayout invoke() {
        return this.LL.findViewById(R.id.nau);
    }
}
