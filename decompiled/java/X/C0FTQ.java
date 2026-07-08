package X;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FTQ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FTQ extends C09AY implements Function1<C0FTO, C0FTO> {
    public final /* synthetic */ Rect LL;
    public final /* synthetic */ EnumC1466150oFx LLILLJJLI;
    public final /* synthetic */ RectF LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ float LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FTQ(Rect rect, EnumC1466150oFx enumC1466150oFx, RectF rectF, float f, String str, float f2) {
        super(1);
        this.LL = rect;
        this.LLILLJJLI = enumC1466150oFx;
        this.LLILLL = rectF;
        this.LLILZ = f;
        this.LLILZIL = str;
        this.LLILZLL = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0FTO invoke(C0FTO c0fto) {
        return C0FTO.LIZ(c0fto, this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, true, this.LLILZIL, this.LLILZLL, 32);
    }
}
