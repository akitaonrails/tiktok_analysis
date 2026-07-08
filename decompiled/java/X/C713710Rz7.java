package X;

import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.vibefeed.service.IVibeFeedService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rz7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C713710Rz7 extends C09AY implements Function1<C0RF0, C0SZ8> {
    public C713710Rz7() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0SZ8 invoke(C0RF0 c0rf0) {
        C0RF0 c0rf02 = c0rf0;
        IVibeFeedService iVibeFeedServiceLIZIZ = C1557990qe5.LIZIZ();
        C0N7Z c0n7zLJFF = null;
        if (iVibeFeedServiceLIZIZ != null) {
            c0n7zLJFF = iVibeFeedServiceLIZIZ.LJFF(70, c0rf02);
        }
        if (!(c0n7zLJFF instanceof C0SZ8) || c0n7zLJFF == null) {
            return new VideoViewCell(c0rf02);
        }
        return c0n7zLJFF;
    }
}
