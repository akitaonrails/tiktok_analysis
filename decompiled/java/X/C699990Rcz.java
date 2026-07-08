package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS96S1200000_11;

/* JADX INFO: renamed from: X.0Rcz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699990Rcz extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC634910OvJ<Object> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ FcpNodeProtocol LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C700190RdJ LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C699990Rcz(AbstractC634910OvJ<Object> abstractC634910OvJ, boolean z, FcpNodeProtocol fcpNodeProtocol, String str, C700190RdJ c700190RdJ) {
        super(0);
        this.LL = abstractC634910OvJ;
        this.LLILLJJLI = z;
        this.LLILLL = fcpNodeProtocol;
        this.LLILZ = str;
        this.LLILZIL = c700190RdJ;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AbstractC634910OvJ<Object> abstractC634910OvJ = this.LL;
        boolean z = this.LLILLJJLI;
        FcpNodeProtocol fcpNodeProtocol = this.LLILLL;
        String str = this.LLILZ;
        C700190RdJ c700190RdJ = this.LLILZIL;
        ReusedAssem<?> reusedAssem = abstractC634910OvJ.LLILLL;
        if (reusedAssem != null) {
            C695930RRn.LJ(reusedAssem);
        }
        abstractC634910OvJ.LLILLJJLI = z;
        if (z) {
            abstractC634910OvJ.LJI(new AwS96S1200000_11(fcpNodeProtocol, c700190RdJ, str, 4));
        }
        return Unit.LIZ;
    }
}
