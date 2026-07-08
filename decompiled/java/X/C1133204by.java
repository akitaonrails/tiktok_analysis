package X;

import com.ss.android.ugc.aweme.IAccountMainService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04by, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1133204by extends C09AY implements Function1<C0RUS, Unit> {
    public C1133204by() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RUS c0rus) {
        c0rus.LL = ((IAccountMainService) ServiceManager.get().getService(IAccountMainService.class)).LIZ();
        return Unit.LIZ;
    }
}
