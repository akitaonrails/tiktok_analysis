package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.DramaDNUFeedCardConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0r9T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577450r9T {
    public final Context LIZ;
    public final boolean LIZIZ;
    public final Aweme LIZJ;
    public final Function1<DramaDNUFeedCardConfig, Unit> LIZLLL;

    public C1577450r9T(Context context, Aweme aweme, Function1 function1, boolean z) {
        this.LIZ = context;
        this.LIZIZ = z;
        this.LIZJ = aweme;
        this.LIZLLL = function1;
    }
}
