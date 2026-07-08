package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xwr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {61, BaseNotice.CREATOR}, m = "withFrameNanos")
public final class C1838710xwr<R> extends AbstractC23140094w {
    public C1838650xwl LL;
    public Function1 LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1838650xwl LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1838710xwr(C1838650xwl c1838650xwl, InterfaceC1364105Vn<? super C1838710xwr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1838650xwl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        return this.LLILZ.LJLZ(this, null);
    }
}
