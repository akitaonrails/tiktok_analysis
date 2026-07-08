package X;

import android.content.res.Resources;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0W81, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W81 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Resources LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0W81(Resources resources) {
        super(0);
        this.LL = resources;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        NxRewordManager.LIZ(this.LL, true);
        return Unit.LIZ;
    }
}
