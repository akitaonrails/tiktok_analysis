package X;

import X.C1858660yT2;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;

/* JADX INFO: renamed from: X.0yWQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem", f = "TakoAnswerBaseAssem.kt", l = {2201}, m = "collectImageDownloadEvent$suspendImpl")
public final class C1860760yWQ<T extends C1858660yT2> extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TakoAnswerBaseAssem<T> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1860760yWQ(TakoAnswerBaseAssem<T> takoAnswerBaseAssem, InterfaceC1364105Vn<? super C1860760yWQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = takoAnswerBaseAssem;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAnswerBaseAssem@27d.collectImageDownloadEvent$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objAq = TakoAnswerBaseAssem.aq(this.LLILLJJLI, null, this);
        C1C7U.LIZIZ("TakoAnswerBaseAssem@27d.collectImageDownloadEvent$1");
        return objAq;
    }
}
