package X;

import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpPageNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18KT, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18KT extends C09AY implements Function1<FcpPageNode, Boolean> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18KT(String str) {
        super(1);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(FcpPageNode fcpPageNode) {
        boolean z;
        FcpPageNode fcpPageNode2 = fcpPageNode;
        if (fcpPageNode2.isComponentMatch(this.LL) && (this.LLILLJJLI || !fcpPageNode2.getInfo().getWillEndRecordManually())) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
