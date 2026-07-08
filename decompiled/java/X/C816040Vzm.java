package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Vzm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816040Vzm extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0WGR LL;
    public final /* synthetic */ Function2<Boolean, Throwable, Unit> LLILLJJLI;
    public final /* synthetic */ Throwable LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ C816050Vzn LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C816040Vzm(C0WGR c0wgr, Function2<? super Boolean, ? super Throwable, Unit> function2, Throwable th, Context context, C816050Vzn c816050Vzn, String str) {
        super(0);
        this.LL = c0wgr;
        this.LLILLJJLI = function2;
        this.LLILLL = th;
        this.LLILZ = context;
        this.LLILZIL = c816050Vzn;
        this.LLILZLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0WGR c0wgr = this.LL;
        C0WGR c0wgr2 = C0WGR.GRANTED;
        if (c0wgr == c0wgr2) {
            Function2<Boolean, Throwable, Unit> function2 = this.LLILLJJLI;
            if (function2 != null) {
                function2.invoke(Boolean.FALSE, this.LLILLL);
            }
        } else if (((ILauncherShortcutService) ServiceManager.get().getService(ILauncherShortcutService.class)).LJIIIZ(this.LLILZ) == c0wgr2) {
            C816050Vzn c816050Vzn = this.LLILZIL;
            C816030Vzl c816030Vzl = new C816030Vzl(c816050Vzn, this.LLILZLL, this.LLILLJJLI);
            c816050Vzn.getClass();
            c816050Vzn.LJ(new C815830VzR(c816030Vzl, c816050Vzn));
        } else {
            Function2<Boolean, Throwable, Unit> function22 = this.LLILLJJLI;
            if (function22 != null) {
                function22.invoke(Boolean.FALSE, new Throwable("easyAddLauncherShortcut request permission fail"));
            }
        }
        return Unit.LIZ;
    }
}
