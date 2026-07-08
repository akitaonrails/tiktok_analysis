package X;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FTP, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FTP extends C09AY implements Function1<C0FTO, C0FTO> {
    public final /* synthetic */ Rect LL;
    public final /* synthetic */ EnumC1466150oFx LLILLJJLI;
    public final /* synthetic */ RectF LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ float LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FTP(Rect rect, EnumC1466150oFx enumC1466150oFx, RectF rectF, float f, float f2, String str, float f3) {
        super(1);
        this.LL = rect;
        this.LLILLJJLI = enumC1466150oFx;
        this.LLILLL = rectF;
        this.LLILZ = f;
        this.LLILZIL = f2;
        this.LLILZLL = str;
        this.LLIZ = f3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0FTO invoke(C0FTO c0fto) {
        Rect rect = this.LL;
        EnumC1466150oFx enumC1466150oFx = this.LLILLJJLI;
        RectF rectF = this.LLILLL;
        float f = this.LLILZ;
        float f2 = this.LLILZIL;
        String str = this.LLILZLL;
        float f3 = this.LLIZ;
        c0fto.getClass();
        return new C0FTO(rect, enumC1466150oFx, rectF, f, true, f2, str, f3);
    }
}
