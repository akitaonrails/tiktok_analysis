package X;

import android.content.Context;
import com.ss.android.ugc.aweme.story.celebration.entrance.OpenCelebrationCreateAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05IP, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.celebration.entrance.OpenCelebrationCreateAction$openReal$1", f = "OpenCelebrationCreateAction.kt", l = {}, m = "invokeSuspend")
public final class C05IP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ OpenCelebrationCreateAction LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ C259800zU<String> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ C259800zU<String> LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05IP(OpenCelebrationCreateAction openCelebrationCreateAction, Context context, int i, C259800zU<String> c259800zU, C259800zU<String> c259800zU2, String str, String str2, C259800zU<String> c259800zU3, String str3, InterfaceC1364105Vn<? super C05IP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = openCelebrationCreateAction;
        this.LLILLJJLI = context;
        this.LLILLL = i;
        this.LLILZ = c259800zU;
        this.LLILZIL = c259800zU2;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = c259800zU3;
        this.LLJ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05IP(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OpenCelebrationCreateAction@524e.openReal$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        OpenCelebrationCreateAction openCelebrationCreateAction = this.LL;
        Context context = this.LLILLJJLI;
        int i = this.LLILLL;
        String str = this.LLILZ.element;
        String str2 = this.LLILZIL.element;
        String str3 = this.LLILZLL;
        String str4 = this.LLIZ;
        String str5 = this.LLIZLLLIL.element;
        String str6 = this.LLJ;
        openCelebrationCreateAction.getClass();
        OpenCelebrationCreateAction.LIZIZ(i, context, str, str2, str3, str4, str5, str6);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OpenCelebrationCreateAction@524e.openReal$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
