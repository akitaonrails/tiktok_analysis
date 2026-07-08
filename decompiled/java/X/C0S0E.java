package X;

import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0S0E, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S0E extends C09AY implements Function1<C0RF0, C0SZ8> {
    public C0S0E() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0SZ8, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final C0SZ8 invoke(C0RF0 c0rf0) {
        C0RF0 c0rf02 = c0rf0;
        ?? LJFF = C1577460r9U.LLILLJJLI.LJFF(c0rf02);
        if (!(LJFF instanceof C0SZ8) || LJFF == 0) {
            return new VideoViewCell(c0rf02);
        }
        return LJFF;
    }
}
