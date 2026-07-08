package X;

import kotlin.Unit;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: renamed from: X.1DFK, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1DFK extends JobSupport implements InterfaceC1841670y1d {
    public final boolean LLILLL;

    @Override // kotlinx.coroutines.JobSupport
    public final boolean LJJJJLL() {
        return true;
    }

    @Override // X.InterfaceC1841670y1d
    public final boolean LJFF() {
        return LJJLIIIJILLIZJL(Unit.LIZ);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean LJJJJL() {
        return this.LLILLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1DFK(C09AE c09ae) {
        C1DF1 c1df1;
        JobSupport jobSupportLJIIIIZZ;
        C1DF1 c1df12;
        super(true);
        boolean z = true;
        LJJLI(c09ae);
        InterfaceC2238208po interfaceC2238208po = (C1DFY) JobSupport.LLILLJJLI.get(this);
        if (!(interfaceC2238208po instanceof C1DFF) || (c1df1 = (C1DF1) interfaceC2238208po) == null || (jobSupportLJIIIIZZ = c1df1.LJIIIIZZ()) == null) {
            z = false;
            break;
        }
        while (!jobSupportLJIIIIZZ.LJJJJL()) {
            InterfaceC2238208po interfaceC2238208po2 = (C1DFY) JobSupport.LLILLJJLI.get(jobSupportLJIIIIZZ);
            if (!(interfaceC2238208po2 instanceof C1DFF) || (c1df12 = (C1DF1) interfaceC2238208po2) == null || (jobSupportLJIIIIZZ = c1df12.LJIIIIZZ()) == null) {
                z = false;
                break;
            }
        }
        this.LLILLL = z;
    }
}
