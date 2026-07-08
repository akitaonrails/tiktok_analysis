package X;

import com.ss.android.ugc.aweme.service.IFeedDebugService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RZe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697920RZe extends C09AY implements Function0<Unit> {
    public final /* synthetic */ IFeedDebugService LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C697920RZe(IFeedDebugService iFeedDebugService, String str, String str2) {
        super(0);
        this.LL = iFeedDebugService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJJIII();
        return Unit.LIZ;
    }
}
