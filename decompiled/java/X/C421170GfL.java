package X;

import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0GfL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421170GfL extends C09AY implements Function0<LinearLayout> {
    public final /* synthetic */ C428890Grn LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C421170GfL(C428890Grn c428890Grn) {
        super(0);
        this.LL = c428890Grn;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, android.widget.LinearLayout] */
    @Override // kotlin.jvm.functions.Function0
    public final LinearLayout invoke() {
        return this.LL.findViewById(R.id.ieb);
    }
}
