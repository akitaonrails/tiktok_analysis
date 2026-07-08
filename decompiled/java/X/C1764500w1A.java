package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0w1A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764500w1A extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1764380w0y LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1764500w1A(C1764380w0y c1764380w0y, C259800zU<String> c259800zU, Context context, int i, String str, String str2, String str3, String str4, Boolean bool) {
        super(0);
        this.LL = c1764380w0y;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = context;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = bool;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJIILIIL(this.LLILLJJLI.element, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ);
        return Unit.LIZ;
    }
}
