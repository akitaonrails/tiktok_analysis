package X;

import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: renamed from: X.0RdH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700170RdH {
    public static final /* synthetic */ int LJIJJLI = 0;
    public final C701040Reg LIZ;
    public final ForkJoinPool LIZIZ;
    public final Function0<FeedComponentPriorityData> LIZJ;
    public final String LIZLLL;
    public final InterfaceC700020Rd2<?> LJ;
    public final Function0<List<String>> LJFF;
    public final Function1<FcpNodeProtocol, Boolean> LJI;
    public final InterfaceC697640RYc LJII;
    public final Function0<Boolean> LJIIIIZZ;
    public final InterfaceC699620RcO LJIIIZ;
    public final InterfaceC700280RdS LJIIJ;
    public final InterfaceC700270RdR LJIIJJI;
    public final AbstractC738140SxQ LJIIL;
    public final FcpNodeProtocol LJIILIIL;
    public Function0<? extends InterfaceC699200Rbi<?>> LJIILJJIL;
    public Map<InterfaceC700010Rd1, C699980Rcy> LJIILL;
    public C0RXZ LJIILLIIL;
    public AwS625S0100000_11 LJIIZILJ;
    public C701450RfL LJIJ;
    public final String LJIJI;
    public final List<String> LJIJJ;

    public C700170RdH() {
        throw null;
    }

    public final FeedComponentPriorityData LIZ() {
        return this.LIZJ.invoke();
    }

    public C700170RdH(C701040Reg c701040Reg, ForkJoinPool forkJoinPool, Function0 function0, String str, InterfaceC700020Rd2 interfaceC700020Rd2, Function0 function02, Function1 function1, InterfaceC697640RYc interfaceC697640RYc, Function0 function03, InterfaceC699620RcO interfaceC699620RcO, InterfaceC700280RdS interfaceC700280RdS, InterfaceC700270RdR interfaceC700270RdR, AbstractC738140SxQ abstractC738140SxQ, FcpNodeProtocol fcpNodeProtocol, Function0 function04) {
        String strLJLI;
        this.LIZ = c701040Reg;
        this.LIZIZ = forkJoinPool;
        this.LIZJ = function0;
        this.LIZLLL = str;
        this.LJ = interfaceC700020Rd2;
        this.LJFF = function02;
        this.LJI = function1;
        this.LJII = interfaceC697640RYc;
        this.LJIIIIZZ = function03;
        this.LJIIIZ = interfaceC699620RcO;
        this.LJIIJ = interfaceC700280RdS;
        this.LJIIJJI = interfaceC700270RdR;
        this.LJIIL = abstractC738140SxQ;
        this.LJIILIIL = fcpNodeProtocol;
        this.LJIILJJIL = function04;
        if (interfaceC700020Rd2 != null) {
            strLJLI = interfaceC700020Rd2.LJLI();
        } else {
            strLJLI = null;
        }
        this.LJIJI = strLJLI;
        this.LJIJJ = new ArrayList();
    }
}
