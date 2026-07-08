package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS109S0400000_11;

/* JADX INFO: renamed from: X.0RRu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C696000RRu extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C699960Rcw LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C701040Reg LLILLL;
    public final /* synthetic */ C700170RdH LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C696000RRu(C699960Rcw c699960Rcw, boolean z, C701040Reg c701040Reg, C700170RdH c700170RdH) {
        super(0);
        this.LL = c699960Rcw;
        this.LLILLJJLI = z;
        this.LLILLL = c701040Reg;
        this.LLILZ = c700170RdH;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C699960Rcw c699960Rcw = this.LL;
        boolean z = this.LLILLJJLI;
        C701040Reg c701040Reg = this.LLILLL;
        C700170RdH c700170RdH = this.LLILZ;
        c699960Rcw.getClass();
        ReusedAssem<?> reusedAssem = c699960Rcw.LJ.LLILLL;
        if (reusedAssem != null) {
            C695930RRn.LJ(reusedAssem);
        }
        new C634920OvK(c699960Rcw.LJ, z);
        C0T6L.LIZLLL();
        AbstractC634910OvJ<Object> abstractC634910OvJ = c699960Rcw.LJ;
        abstractC634910OvJ.LLILLJJLI = z;
        if (z) {
            abstractC634910OvJ.LJI(new AwS109S0400000_11(c701040Reg, (C701040Reg) c699960Rcw.LIZIZ, (FcpNodeProtocol) c700170RdH, (C700170RdH) c699960Rcw.LIZLLL, (Function0<? extends InterfaceC699200Rbi<?>>) 5));
        }
        return Unit.LIZ;
    }
}
