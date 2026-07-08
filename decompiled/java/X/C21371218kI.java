package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.widget.NameWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18kI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21371218kI extends C09AY implements Function0<TuxTextView> {
    public final /* synthetic */ NameWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21371218kI(NameWidget nameWidget) {
        super(0);
        this.LL = nameWidget;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.bytedance.tux.input.TuxTextView] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ TuxTextView invoke() {
        return this.LL.findViewById(R.id.f844zvb);
    }
}
