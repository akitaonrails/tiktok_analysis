package X;

import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qyZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1570690qyZ extends C09AY implements Function0<MainBusinessAbility> {
    public final /* synthetic */ C1602750roH LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570690qyZ(C1602750roH c1602750roH) {
        super(0);
        this.LL = c1602750roH;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MainBusinessAbility invoke() {
        C19EG c19eg = this.LL.LIZ;
        if (c19eg == null) {
            return null;
        }
        if (C296200BjG.LIZ()) {
            return C1058560deY.LIZ(c19eg);
        }
        MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg);
        if (mainActivityScopeLIZJ != null) {
            return C1058560deY.LIZIZ(mainActivityScopeLIZJ);
        }
        return null;
    }
}
