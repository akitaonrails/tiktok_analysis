package X;

import android.text.TextUtils;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0HJ1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HJ1 extends C09AY implements Function1<Integer, Boolean> {
    public final /* synthetic */ CharSequence LL;
    public final /* synthetic */ C0HJ0 LLILLJJLI;
    public final /* synthetic */ CharSequence LLILLL;
    public final /* synthetic */ float LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HJ1(CharSequence charSequence, C0HJ0 c0hj0, CharSequence charSequence2, float f) {
        super(1);
        this.LL = charSequence;
        this.LLILLJJLI = c0hj0;
        this.LLILLL = charSequence2;
        this.LLILZ = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Integer num) {
        CharSequence charSequenceEllipsize = TextUtils.ellipsize(this.LL, this.LLILLJJLI.getPaint(), num.intValue(), TextUtils.TruncateAt.END);
        C0HJ0 c0hj0 = this.LLILLJJLI;
        CharSequence charSequence = this.LLILLL;
        float f = this.LLILZ;
        c0hj0.getClass();
        return Boolean.valueOf(c0hj0.LJJJJL(C0HJ0.LJJJJJ(charSequence, charSequenceEllipsize), f));
    }
}
