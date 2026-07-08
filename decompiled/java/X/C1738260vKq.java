package X;

/* JADX INFO: renamed from: X.0vKq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.monitor.ProjectDurationReporter", f = "ProjectDurationReporter.kt", l = {83}, m = "readDurationInfo")
public final class C1738260vKq extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1738250vKp LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1738260vKq(C1738250vKp c1738250vKp, InterfaceC1364105Vn<? super C1738260vKq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1738250vKp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProjectDurationReporter@786.readDurationInfo$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, this);
        C1C7U.LIZIZ("ProjectDurationReporter@786.readDurationInfo$1");
        return objLIZJ;
    }
}
