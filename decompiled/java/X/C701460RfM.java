package X;

import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RfM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701460RfM extends C09AY implements Function0<C700170RdH> {
    public final /* synthetic */ C701370RfD LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701460RfM(C701370RfD c701370RfD) {
        super(0);
        this.LL = c701370RfD;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C700170RdH invoke() {
        C701370RfD c701370RfD = this.LL;
        ForkJoinPool forkJoinPool = c701370RfD.LLJ;
        Function0<FeedComponentPriorityData> function0 = c701370RfD.LLILLJJLI;
        String str = c701370RfD.LLILZIL;
        InterfaceC700020Rd2<?> interfaceC700020Rd2 = c701370RfD.LLILLL;
        Function0<? extends List<String>> function02 = c701370RfD.LLILZ;
        Function1<? super FcpNodeProtocol, Boolean> function1 = c701370RfD.LLJI;
        InterfaceC697640RYc interfaceC697640RYc = c701370RfD.LLJILJILJ;
        Function0<Boolean> function03 = c701370RfD.LLJILLL;
        Function0<? extends InterfaceC699620RcO> function04 = c701370RfD.LLJJIJI;
        InterfaceC699620RcO interfaceC699620RcOInvoke = function04 != null ? function04.invoke() : null;
        C701370RfD c701370RfD2 = this.LL;
        Function0<? extends InterfaceC699200Rbi<?>> function05 = c701370RfD2.LLJJIJIIJIL;
        InterfaceC700280RdS interfaceC700280RdS = c701370RfD2.LLJJIJIL;
        InterfaceC700270RdR interfaceC700270RdR = c701370RfD2.LLJJJ;
        AbstractC738140SxQ abstractC738140SxQ = c701370RfD2.LLJJJIL;
        FcpNodeProtocol fcpNodeProtocol = c701370RfD2.LLJJJJ;
        if (forkJoinPool == null || function0 == null || str == null) {
            return null;
        }
        return new C700170RdH(new C701040Reg(str), forkJoinPool, function0, str, interfaceC700020Rd2, function02, function1, interfaceC697640RYc, function03, interfaceC699620RcOInvoke, interfaceC700280RdS, interfaceC700270RdR, abstractC738140SxQ, fcpNodeProtocol, function05);
    }
}
