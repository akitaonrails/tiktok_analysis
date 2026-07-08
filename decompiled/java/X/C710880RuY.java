package X;

import com.ss.android.ugc.aweme.IToolsBusinessService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RuY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710880RuY extends C09AY implements Function1<C0RUS, Unit> {
    public C710880RuY() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RUS c0rus) {
        c0rus.LL = ((IToolsBusinessService) ServiceManager.get().getService(IToolsBusinessService.class)).getToolsActivityAssem();
        return Unit.LIZ;
    }
}
