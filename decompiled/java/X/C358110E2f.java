package X;

/* JADX INFO: renamed from: X.0E2f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.startup.task.StripMusicDataTask", f = "StripMusicDataTask.kt", l = {41}, m = "run")
public final class C358110E2f extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C358100E2e LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C358110E2f(C358100E2e c358100E2e, InterfaceC1364105Vn<? super C358110E2f> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c358100E2e;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StripMusicDataTask@16de.run$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(this);
        C1C7U.LIZIZ("StripMusicDataTask@16de.run$1");
        return objLIZJ;
    }
}
