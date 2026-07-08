package X;

import Y.AgS166S0300000_8;

/* JADX INFO: renamed from: X.0Lb1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ugc.ProfileDraftTaskProgress$restoreDraftProgressWithAsyncTask$1$invokeSuspend$$inlined$map$1$2", f = "ProfileDraftTaskProgress.kt", l = {224, 223}, m = "emit")
public final class C545890Lb1 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public InterfaceC346701Wf LLILLL;
    public final /* synthetic */ AgS166S0300000_8 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C545890Lb1(AgS166S0300000_8 agS166S0300000_8, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = agS166S0300000_8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileDraftTaskProgress@1fb5.restoreDraftProgressWithAsyncTask$1$invokeSuspend$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILZ.emit(null, this);
        C1C7U.LIZIZ("ProfileDraftTaskProgress@1fb5.restoreDraftProgressWithAsyncTask$1$invokeSuspend$$inlined$map$1$2$1");
        return objEmit;
    }
}
