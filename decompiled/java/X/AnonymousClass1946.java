package X;

import android.text.SpannableString;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1946, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1946 extends C09AY implements Function1<C190T, C190T> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ SpannableString LLILLJJLI;
    public final /* synthetic */ SpannableString LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass1946(float f, SpannableString spannableString, SpannableString spannableString2) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = spannableString;
        this.LLILLL = spannableString2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C190T invoke(C190T c190t) {
        SpannableString spannableString;
        C190T c190t2 = c190t;
        if (this.LL < 3300.0f) {
            spannableString = this.LLILLJJLI;
        } else {
            spannableString = this.LLILLL;
        }
        return C190T.LJII(c190t2, 0, false, false, new C861800XrO(spannableString), null, null, 959);
    }
}
