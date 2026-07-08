package X;

import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS243S0000000_11;

/* JADX INFO: renamed from: X.0RGT, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RGT extends C09AY implements Function1<VideoPlayViewModel, Unit> {
    public static final /* synthetic */ int LL = 0;

    static {
        new C0RGT();
    }

    public C0RGT() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(VideoPlayViewModel videoPlayViewModel) {
        VideoPlayViewModel videoPlayViewModel2 = videoPlayViewModel;
        if (videoPlayViewModel2 != null) {
            videoPlayViewModel2.setState(AFwS243S0000000_11.get$arr$(729));
        }
        return Unit.LIZ;
    }
}
