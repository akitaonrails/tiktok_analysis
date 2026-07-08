package X;

import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.commercialize.feed.assem.interactivead.AdInteractiveAssem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RLW, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RLW extends C09AY implements Function1<C0RTA, Unit> {
    public C0RLW() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C0RTA c0rta) {
        C0RTA c0rta2 = c0rta;
        c0rta2.getClass();
        c0rta2.LLILLL = C13LE.LIZ(AdInteractiveAssem.class);
        c0rta2.LLJI = R.id.a9m;
        ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJI();
        c0rta2.LLJIJIL = R.layout.d4e;
        c0rta2.LLILZIL = C694070RKj.LIZIZ;
        return Unit.LIZ;
    }
}
