package X;

import android.content.Context;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.ss.android.ugc.aweme.nxreword.utils.NxResourceUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0W7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818140W7o extends C09AY implements Function1<C818160W7q, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ Function1<Context, Unit> LLILLJJLI;
    public final /* synthetic */ C818150W7p LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C818140W7o(Context context, Function1<? super Context, Unit> function1, C818150W7p c818150W7p, String str) {
        super(1);
        this.LL = context;
        this.LLILLJJLI = function1;
        this.LLILLL = c818150W7p;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C818160W7q c818160W7q) {
        C818160W7q c818160W7q2 = c818160W7q;
        c818160W7q2.LJII = NxRewordManager.LIZ(this.LL.getResources(), true);
        c818160W7q2.LJI = NxRewordManager.LJIIIIZZ;
        Function1<Context, Unit> function1 = this.LLILLJJLI;
        if (function1 != null) {
            function1.invoke(null);
        }
        NxResourceUtils nxResourceUtils = NxResourceUtils.INSTANCE;
        nxResourceUtils.nativeSetCustomFilePath(this.LLILLL.LJFF);
        nxResourceUtils.nativeLoadOtherResource(this.LLILZ, this.LL.getAssets(), NxRewordManager.LIZJ);
        return Unit.LIZ;
    }
}
