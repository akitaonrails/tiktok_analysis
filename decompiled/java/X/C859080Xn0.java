package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Xn0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C859080Xn0 implements Function0<Integer> {
    public final WeakReference<VideoPublishEditModel> LL;

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        VideoPublishEditModel videoPublishEditModel = this.LL.get();
        return Integer.valueOf(videoPublishEditModel != null ? C1428470nHB.LJJIL(videoPublishEditModel) : -1);
    }

    public C859080Xn0(WeakReference<VideoPublishEditModel> weakReference) {
        this.LL = weakReference;
    }
}
