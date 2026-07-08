package X;

import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RZJ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RZJ extends C09AY implements Function0<String> {
    public final /* synthetic */ FcpContainerAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RZJ(FcpContainerAssem fcpContainerAssem) {
        super(0);
        this.LL = fcpContainerAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return C698800Rb4.LJ(this.LL.jm());
    }
}
