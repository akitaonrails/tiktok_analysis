package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.algorefresh.IAlgoRefreshService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04fi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1156404fi extends C09AY implements Function1<C0SZ5, Unit> {
    public C1156404fi() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0SZ5 c0sz5) {
        C19719912Dl c19719912DlLIZLLL;
        C0SZ5 c0sz52 = c0sz5;
        c0sz52.LLIZLLLIL = R.id.awl;
        c0sz52.LLJIJIL = C1163440gNi.LIZLLL;
        IAlgoRefreshService iAlgoRefreshService = (IAlgoRefreshService) PluggableExtentionKt.pluggableSpi$default(IAlgoRefreshService.class, false, false, false, 14, null);
        if (iAlgoRefreshService != null) {
            c19719912DlLIZLLL = iAlgoRefreshService.LIZLLL();
        } else {
            c19719912DlLIZLLL = null;
        }
        c0sz52.LL = c19719912DlLIZLLL;
        return Unit.LIZ;
    }
}
