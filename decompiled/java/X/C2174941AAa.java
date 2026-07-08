package X;

import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.adapter.widget.TitleWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AAa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2174941AAa extends C09AY implements Function0<ImageView> {
    public final /* synthetic */ TitleWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2174941AAa(TitleWidget titleWidget) {
        super(0);
        this.LL = titleWidget;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, android.widget.ImageView] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ImageView invoke() {
        return this.LL.findViewById(R.id.hef);
    }
}
