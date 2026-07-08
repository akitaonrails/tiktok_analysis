package X;

/* JADX INFO: renamed from: X.15ET, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.ui.SpecificGiftRule", f = "MatchCountDownTipsRules.kt", l = {178}, m = "execute")
public final class C15ET extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C15ES LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15ET(C15ES c15es, InterfaceC1364105Vn<? super C15ET> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c15es;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SpecificGiftRule@e9cb.execute$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("SpecificGiftRule@e9cb.execute$1");
        return objLIZ;
    }
}
