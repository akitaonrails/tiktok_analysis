package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S6B, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S6B extends C09AY implements Function0<TuxTextView> {
    public final /* synthetic */ VideoDescAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S6B(VideoDescAssem videoDescAssem) {
        super(0);
        this.LL = videoDescAssem;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, com.bytedance.tux.input.TuxTextView] */
    @Override // kotlin.jvm.functions.Function0
    public final TuxTextView invoke() {
        View contentView;
        int i;
        if (C294240Bg6.LIZ()) {
            contentView = this.LL.getContentView();
            i = R.id.p60;
        } else {
            contentView = this.LL.getContentView();
            i = R.id.tv_toggle;
        }
        return contentView.findViewById(i);
    }
}
