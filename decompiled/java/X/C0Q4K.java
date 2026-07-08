package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tako.ITakoService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Q4K, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q4K extends C09AY implements Function0<Unit> {
    public C0Q4K() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((ITakoService) ServiceManager.get().getService(ITakoService.class)).LJLLLLLL();
        return Unit.LIZ;
    }
}
