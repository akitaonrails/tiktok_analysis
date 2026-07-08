package X;

import android.text.SpannableStringBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0K3X, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K3X extends C09AY implements Function1<SpannableStringBuilder, Unit> {
    public final /* synthetic */ C442901nv LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C118300cf LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0K3X(C442901nv c442901nv, C118300cf c118300cf, String str, C118300cf c118300cf2, String str2) {
        super(1);
        this.LL = c442901nv;
        this.LLILLJJLI = c118300cf;
        this.LLILLL = str;
        this.LLILZ = c118300cf2;
        this.LLILZIL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SpannableStringBuilder spannableStringBuilder) {
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        spannableStringBuilder2.append((CharSequence) e3.d);
        C510740K1g.LIZJ(spannableStringBuilder2, this.LL, 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) " ");
        this.LLILLJJLI.element = spannableStringBuilder2.length();
        spannableStringBuilder2.append((CharSequence) this.LLILLL);
        this.LLILZ.element = spannableStringBuilder2.length();
        spannableStringBuilder2.append((CharSequence) " ");
        spannableStringBuilder2.append((CharSequence) this.LLILZIL);
        return Unit.LIZ;
    }
}
