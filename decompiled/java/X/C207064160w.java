package X;

import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.160w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207064160w extends C09AY implements Function0<TuxTextView> {
    public final /* synthetic */ C207056160o LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207064160w(C207056160o c207056160o) {
        super(0);
        this.LL = c207056160o;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.bytedance.tux.input.TuxTextView] */
    @Override // kotlin.jvm.functions.Function0
    public final TuxTextView invoke() {
        return this.LL.LIZ.findViewById(R.id.dcg);
    }
}
