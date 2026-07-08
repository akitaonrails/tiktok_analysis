package X;

import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18Pp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21280318Pp extends C09AY implements Function0<TuxTextView> {
    public final /* synthetic */ C21279718Pj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21280318Pp(C21279718Pj c21279718Pj) {
        super(0);
        this.LL = c21279718Pj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.bytedance.tux.input.TuxTextView] */
    @Override // kotlin.jvm.functions.Function0
    public final TuxTextView invoke() {
        return this.LL.getMRootView().findViewById(R.id.tjq);
    }
}
