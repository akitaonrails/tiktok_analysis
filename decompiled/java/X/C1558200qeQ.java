package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.IProfileService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qeQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558200qeQ extends C09AY implements Function1<C0RUS, Unit> {
    public C1558200qeQ() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RUS c0rus) {
        c0rus.LL = ((IProfileService) ServiceManager.get().getService(IProfileService.class)).getSocialActivityAssem();
        return Unit.LIZ;
    }
}
