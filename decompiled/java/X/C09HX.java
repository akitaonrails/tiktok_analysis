package X;

/* JADX INFO: renamed from: X.09HX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.data.DraftLoader$observeDraftWithAsyncTasks$1$invokeSuspend$lambda$1$$inlined$map$1$2", f = "DraftLoader.kt", l = {224, 223}, m = "emit")
public final class C09HX extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public InterfaceC346701Wf LLILLL;
    public final /* synthetic */ C09HW LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09HX(C09HW c09hw, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c09hw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftLoader@8d42.observeDraftWithAsyncTasks$1$invokeSuspend$lambda$1$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILZ.emit(null, this);
        C1C7U.LIZIZ("DraftLoader@8d42.observeDraftWithAsyncTasks$1$invokeSuspend$lambda$1$$inlined$map$1$2$1");
        return objEmit;
    }
}
