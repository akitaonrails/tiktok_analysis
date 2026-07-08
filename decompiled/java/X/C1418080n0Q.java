package X;

import com.ss.android.ugc.aweme.autocut.s;

/* JADX INFO: renamed from: X.0n0Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.AutoCutHelper", f = "AutoCutHelper.kt", l = {776, 785}, m = "onSuccess")
public final class C1418080n0Q extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ s LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1418080n0Q(s sVar, InterfaceC1364105Vn<? super C1418080n0Q> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = sVar;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCutHelper@27e4.onSuccess$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJI = this.LLILLJJLI.LJJJJI(null, null, null, this);
        C1C7U.LIZIZ("AutoCutHelper@27e4.onSuccess$1");
        return objLJJJJI;
    }
}
