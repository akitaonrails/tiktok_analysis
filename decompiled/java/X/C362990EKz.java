package X;

/* JADX INFO: renamed from: X.0EKz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.startup.task.MusicDataTask", f = "MusicDataTask.kt", l = {57}, m = "run")
public final class C362990EKz extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C362980EKy LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C362990EKz(C362980EKy c362980EKy, InterfaceC1364105Vn<? super C362990EKz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c362980EKy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicDataTask@382f.run$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(this);
        C1C7U.LIZIZ("MusicDataTask@382f.run$1");
        return objLIZJ;
    }
}
