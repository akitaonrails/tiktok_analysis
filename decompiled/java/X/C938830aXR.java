package X;

import android.graphics.Rect;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aXR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C938830aXR extends C09AY implements Function1<C938810aXP, C938810aXP> {
    public final /* synthetic */ EnumC938840aXS LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Rect LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C938830aXR(EnumC938840aXS enumC938840aXS, Integer num, Integer num2, String str, Rect rect) {
        super(1);
        this.LL = enumC938840aXS;
        this.LLILLJJLI = num;
        this.LLILLL = num2;
        this.LLILZ = str;
        this.LLILZIL = rect;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C938810aXP invoke(C938810aXP c938810aXP) {
        int i = this.LL.type;
        Integer num = this.LLILLJJLI;
        Integer num2 = this.LLILLL;
        String str = this.LLILZ;
        Rect rect = this.LLILZIL;
        c938810aXP.getClass();
        return new C938810aXP(num, num2, str, i, rect);
    }
}
