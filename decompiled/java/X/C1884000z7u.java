package X;

import com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem;

/* JADX INFO: renamed from: X.0z7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem", f = "MatchCountDownAssem.kt", l = {1808}, m = "showMessageText")
public final class C1884000z7u extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MatchCountDownAssem LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1884000z7u(MatchCountDownAssem matchCountDownAssem, InterfaceC1364105Vn<? super C1884000z7u> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = matchCountDownAssem;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MatchCountDownAssem@1efb.showMessageText$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objTp = this.LLILLJJLI.tp(null, this);
        C1C7U.LIZIZ("MatchCountDownAssem@1efb.showMessageText$1");
        return objTp;
    }
}
