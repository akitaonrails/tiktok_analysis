package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.141D, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C141D extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C141D(Context context, String str, String str2, String str3, boolean z, String str4, String str5, String str6) {
        super(1);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = z;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = str6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        bool.booleanValue();
        C1864020ybg c1864020ybg = C1864020ybg.LIZ;
        Context context = this.LL;
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String str3 = this.LLILZ;
        boolean z = this.LLILZIL;
        String str4 = this.LLILZLL;
        String str5 = this.LLIZ;
        String str6 = this.LLIZLLLIL;
        c1864020ybg.getClass();
        C1864020ybg.LJIILL(context, str, str2, str3, z, str4, str5, str6);
        return Unit.LIZ;
    }
}
