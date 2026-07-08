package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0SPP, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SPP extends C0SPN {
    public static final C0SPP LIZIZ = new C0SPP();

    @Override // X.C0SPN
    public final int LIZ() {
        return C0SPR.LIZ().fypVerticalCount;
    }

    @Override // X.C0SPN
    public final void LIZIZ(String str, Context context, List<? extends Aweme> list, int i, int i2, int i3) {
        super.LIZIZ(str, context, list, i, i2, i3);
        LJ((i - 1) - 2, Integer.MAX_VALUE);
    }
}
