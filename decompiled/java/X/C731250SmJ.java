package X;

import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerVM;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SmJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C731250SmJ extends C09AY implements Function1<C695520RPy, C695520RPy> {
    public final /* synthetic */ RightAreaContainerVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C731250SmJ(RightAreaContainerVM rightAreaContainerVM) {
        super(1);
        this.LL = rightAreaContainerVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C695520RPy invoke(C695520RPy c695520RPy) {
        C695520RPy c695520RPy2 = c695520RPy;
        return new C695520RPy(c695520RPy2.LL, c695520RPy2.LLILLJJLI, this.LL.getForceTextVisible());
    }
}
