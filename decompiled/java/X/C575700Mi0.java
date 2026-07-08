package X;

import X.C575620Mhs;

/* JADX INFO: renamed from: X.0Mi0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.creative.tangram.workflow.parse.AbsParseNodeTask", f = "AbsParseNodeTask.kt", l = {41, 51}, m = "run$suspendImpl")
public final class C575700Mi0<T extends C575620Mhs> extends AbstractC23140094w {
    public AbstractC575670Mhx LL;
    public InterfaceC569070MTp LLILLJJLI;
    public Object LLILLL;
    public InterfaceC575750Mi5 LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ AbstractC575670Mhx<T> LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C575700Mi0(AbstractC575670Mhx<T> abstractC575670Mhx, InterfaceC1364105Vn<? super C575700Mi0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = abstractC575670Mhx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbsParseNodeTask@8a67.run$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJFF = AbstractC575670Mhx.LJFF(this.LLILZLL, null, this);
        C1C7U.LIZIZ("AbsParseNodeTask@8a67.run$1");
        return objLJFF;
    }
}
