package X;

import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RRw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C696020RRw extends C09AY implements Function1<C700170RdH, InterfaceC695090ROh> {
    public final /* synthetic */ AbstractC738140SxQ LL;
    public final /* synthetic */ FcpNodeProtocol LLILLJJLI;
    public final /* synthetic */ Function0<InterfaceC699200Rbi<?>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C696020RRw(AbstractC738140SxQ abstractC738140SxQ, FcpNodeProtocol fcpNodeProtocol, Function0<? extends InterfaceC699200Rbi<?>> function0) {
        super(1);
        this.LL = abstractC738140SxQ;
        this.LLILLJJLI = fcpNodeProtocol;
        this.LLILLL = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC695090ROh invoke(C700170RdH c700170RdH) {
        return new C695980RRs(this.LL, this.LLILLJJLI, c700170RdH, this.LLILLL);
    }
}
