package X;

import com.ss.android.ugc.aweme.app.services.ILauncherService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04bx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1133104bx extends C09AY implements Function1<C0RUS, Unit> {
    public C1133104bx() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RUS c0rus) {
        c0rus.LL = ((ILauncherService) ServiceManager.get().getService(ILauncherService.class)).LIZJ();
        return Unit.LIZ;
    }
}
