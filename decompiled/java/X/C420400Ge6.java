package X;

import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ge6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420400Ge6 extends C09AY implements Function0<TuxTextView> {
    public final /* synthetic */ AbstractC420810Gel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C420400Ge6(AbstractC420810Gel abstractC420810Gel) {
        super(0);
        this.LL = abstractC420810Gel;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.bytedance.tux.input.TuxTextView] */
    @Override // kotlin.jvm.functions.Function0
    public final TuxTextView invoke() {
        return this.LL.findViewById(R.id.tv_upvote);
    }
}
