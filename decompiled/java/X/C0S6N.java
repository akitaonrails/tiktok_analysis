package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S6N, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S6N extends C09AY implements Function0<View> {
    public final /* synthetic */ VideoDescAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S6N(VideoDescAssem videoDescAssem) {
        super(0);
        this.LL = videoDescAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        return this.LL.getContentView().findViewById(R.id.y5j);
    }
}
