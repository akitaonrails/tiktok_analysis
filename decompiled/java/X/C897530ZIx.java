package X;

import com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZIx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897530ZIx extends C09AY implements Function0<InterfaceC897330ZId> {
    public final /* synthetic */ C897520ZIw LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Function0<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C897530ZIx(C897520ZIw c897520ZIw, boolean z, Function0<String> function0) {
        super(0);
        this.LL = c897520ZIw;
        this.LLILLJJLI = z;
        this.LLILLL = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC897330ZId invoke() {
        boolean z = C595800NYk.LIZ().preCheckPrerequisite;
        InterfaceC897380ZIi.LIZIZ.getClass();
        boolean z2 = C897370ZIh.LIZ().LJ().LIZ() || C1689706jX.LIZ();
        if (z && !C897520ZIw.LJFF.contains(this.LL.LIZ) && !z2) {
            return null;
        }
        this.LL.LIZIZ.LJIILLIIL();
        ActivityStatusService.LIZ.getClass();
        return C595830NYn.LIZ().LJFF(this.LL.LIZ.getScene(), this.LLILLL.invoke(), this.LLILLJJLI);
    }
}
