package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Xbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C852090Xbj extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C259800zU<C0XWD> LLILLL;
    public final /* synthetic */ Activity LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C852090Xbj(String str, int i, C259800zU c259800zU, C19EG c19eg, Function0 function0) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = c259800zU;
        this.LLILZ = c19eg;
        this.LLILZIL = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LJFF(2131838738, new C852070Xbh(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ));
        c1397620mTQ2.LJII(2131838771, new C852080Xbi(this.LL, this.LLILLJJLI, this.LLILZIL));
        return Unit.LIZ;
    }
}
