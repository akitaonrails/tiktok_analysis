package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KCL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KCL extends C09AY implements Function1<SpannableStringBuilder, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KCL(int i, int i2, Context context, Function0<Unit> function0, Context context2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = context;
        this.LLILZ = function0;
        this.LLILZIL = context2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SpannableStringBuilder spannableStringBuilder) {
        Integer numLIZJ;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        C510740K1g.LIZLLL(spannableStringBuilder2, this.LL, this.LLILLJJLI, 62, false, 33);
        C510740K1g.LIZJ(spannableStringBuilder2, new C521550Kcr(this.LLILZIL, 11), this.LL, this.LLILLJJLI, 33);
        Context context = this.LLILLL;
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.fa8, context)) != null) {
            C510740K1g.LIZJ(spannableStringBuilder2, new ForegroundColorSpan(numLIZJ.intValue()), this.LL, this.LLILLJJLI, 33);
        }
        if (this.LLILZ != null) {
            C510740K1g.LIZJ(spannableStringBuilder2, new C0ID7(this.LLILZ, 3), 0, this.LL - 1, 33);
        }
        return Unit.LIZ;
    }
}
