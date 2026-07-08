package X;

import android.view.View;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rgn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C702350Rgn extends C09AY implements Function0<View> {
    public final /* synthetic */ FcpContainerAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C702350Rgn(FcpContainerAssem fcpContainerAssem) {
        super(0);
        this.LL = fcpContainerAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        return this.LL.LLJLL.invoke();
    }
}
