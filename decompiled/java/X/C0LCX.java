package X;

import Y.AgS199S0200000_8;

/* JADX INFO: renamed from: X.0LCX, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskDraftHelper$updateDraft$$inlined$map$1$2", f = "CreationAsyncTaskDraftHelper.kt", l = {224, 223}, m = "emit")
public final class C0LCX extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public InterfaceC346701Wf LLILLL;
    public final /* synthetic */ AgS199S0200000_8 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LCX(AgS199S0200000_8 agS199S0200000_8, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = agS199S0200000_8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationAsyncTaskDraftHelper@dd98.updateDraft$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILZ.emit(null, this);
        C1C7U.LIZIZ("CreationAsyncTaskDraftHelper@dd98.updateDraft$$inlined$map$1$2$1");
        return objEmit;
    }
}
