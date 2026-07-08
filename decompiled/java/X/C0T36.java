package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T36, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T36 extends C09AY implements Function0<Unit> {
    public C0T36() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Aweme awemeLJ = C740740T3w.LJ();
        C0T3N.LIZ.getClass();
        if (awemeLJ != null) {
            String aid = awemeLJ.getAid();
            Aweme aweme = C0T3N.LIZLLL;
            if (!TextUtils.equals(aid, aweme != null ? aweme.getAid() : null)) {
                C0T3N.LJFF++;
            }
        }
        return Unit.LIZ;
    }
}
