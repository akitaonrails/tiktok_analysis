package X;

import com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel;

/* JADX INFO: renamed from: X.0Li7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.config.AIPortraitDraftRestoreHandler", f = "AIPortraitDraftRestoreHandler.kt", l = {39, 52, 65, 66}, m = "restore")
public final class C550290Li7 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public AIPortraitGeneratingModel LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C550280Li6 LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C550290Li7(C550280Li6 c550280Li6, InterfaceC1364105Vn<? super C550290Li7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c550280Li6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitDraftRestoreHandler@541f.restore$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZIL.LIZ(null, this);
        C1C7U.LIZIZ("AIPortraitDraftRestoreHandler@541f.restore$1");
        return objLIZJ;
    }
}
