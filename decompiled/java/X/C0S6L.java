package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S6L, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S6L extends C09AY implements Function0<FrameLayout> {
    public final /* synthetic */ VideoDescAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S6L(VideoDescAssem videoDescAssem) {
        super(0);
        this.LL = videoDescAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, android.widget.FrameLayout] */
    @Override // kotlin.jvm.functions.Function0
    public final FrameLayout invoke() {
        return this.LL.getContentView().findViewById(R.id.fmv);
    }
}
