package X;

/* JADX INFO: renamed from: X.0Lf4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.creation.generation.component.AITheaterGenerationDraftComponent", f = "AITheaterGenerationDraftComponent.kt", l = {232}, m = "executeSaveDraftInternal-IoAF18A")
public final class C548400Lf4 extends AbstractC23140094w {
    public C548370Lf1 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C548370Lf1 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C548400Lf4(C548370Lf1 c548370Lf1, InterfaceC1364105Vn<? super C548400Lf4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c548370Lf1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITheaterGenerationDraftComponent@85c0.executeSaveDraftInternal$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objX1 = this.LLILLL.X1(this);
        if (objX1 == C099R.LJFF()) {
            C1C7U.LIZIZ("AITheaterGenerationDraftComponent@85c0.executeSaveDraftInternal$1");
            return objX1;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objX1);
        C1C7U.LIZIZ("AITheaterGenerationDraftComponent@85c0.executeSaveDraftInternal$1");
        return c189200o6M1boximpl;
    }
}
