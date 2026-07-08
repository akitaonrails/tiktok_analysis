package X;

import com.ss.android.ugc.aweme.IAppWidgetService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.082B, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C082B extends C09AY implements Function0<Unit> {
    public C082B(C19EG c19eg) {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((IAppWidgetService) ServiceManager.get().getService(IAppWidgetService.class)).LJIIIIZZ();
        return Unit.LIZ;
    }
}
