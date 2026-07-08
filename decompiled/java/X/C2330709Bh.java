package X;

/* JADX INFO: renamed from: X.09Bh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$observeDraftWithAsyncTasks$1$invokeSuspend$lambda$1$$inlined$map$1$2", f = "DraftViewModel.kt", l = {224, 223}, m = "emit")
public final class C2330709Bh extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public InterfaceC346701Wf LLILLL;
    public final /* synthetic */ C2330609Bg LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2330709Bh(C2330609Bg c2330609Bg, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c2330609Bg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftViewModel@38a5.observeDraftWithAsyncTasks$1$invokeSuspend$lambda$1$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILZ.emit(null, this);
        C1C7U.LIZIZ("DraftViewModel@38a5.observeDraftWithAsyncTasks$1$invokeSuspend$lambda$1$$inlined$map$1$2$1");
        return objEmit;
    }
}
