package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Kns, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C528380Kns extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C528320Knm LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C528380Kns(C528320Knm c528320Knm, long j, int i, int i2) {
        super(0);
        this.LL = c528320Knm;
        this.LLILLJJLI = j;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C528320Knm c528320Knm = this.LL;
        long j = this.LLILLJJLI;
        int i = this.LLILLL + this.LLILZ;
        c528320Knm.getClass();
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(j, "duration");
        c0lab.LIZ(0, "type");
        c0lab.LIZ(i, "count");
        c0lab.LJ("shoot_way", c528320Knm.LLLIIIIL);
        C2341909Fp.LIZ("tool_performance_fetch_album_assets", c0lab.LIZ);
        return Unit.LIZ;
    }
}
