package X;

import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S6I, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S6I extends C09AY implements Function0<TuxIconView> {
    public final /* synthetic */ VideoDescAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S6I(VideoDescAssem videoDescAssem) {
        super(0);
        this.LL = videoDescAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.bytedance.tux.icon.TuxIconView] */
    @Override // kotlin.jvm.functions.Function0
    public final TuxIconView invoke() {
        return this.LL.getContentView().findViewById(R.id.dcj);
    }
}
