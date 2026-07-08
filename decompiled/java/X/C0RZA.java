package X;

import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RZA, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RZA extends C09AY implements Function0<String> {
    public final /* synthetic */ FcpContainerAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RZA(FcpContainerAssem fcpContainerAssem) {
        super(0);
        this.LL = fcpContainerAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        C0RJN c0rjnLIZIZ = this.LL.jm().LIZIZ();
        if (c0rjnLIZIZ != null) {
            return C1389300mG0.LIZ(c0rjnLIZIZ);
        }
        return null;
    }
}
