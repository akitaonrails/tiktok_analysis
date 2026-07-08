package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Mcg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.TextImageForwardResolver$startSynthesisSession$1", f = "TextImageForwardResolver.kt", l = {227, 228, 229, 238}, m = "invokeSuspend")
public final class C572400Mcg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Text2ImageGenerator LL;
    public C572380Mce LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ ForwardMedia LLILZIL;
    public final /* synthetic */ C572370Mcd LLILZLL;
    public final /* synthetic */ Function1<C572410Mch, Unit> LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;
    public final /* synthetic */ Function1<Integer, Unit> LLJ;
    public final /* synthetic */ Function1<C572380Mce, Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C572400Mcg(Context context, ForwardMedia forwardMedia, C572370Mcd c572370Mcd, Function1<? super C572410Mch, Unit> function1, Function0<Unit> function0, Function1<? super Integer, Unit> function12, Function1<? super C572380Mce, Unit> function13, InterfaceC1364105Vn<? super C572400Mcg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = context;
        this.LLILZIL = forwardMedia;
        this.LLILZLL = c572370Mcd;
        this.LLIZ = function1;
        this.LLIZLLLIL = function0;
        this.LLJ = function12;
        this.LLJI = function13;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C572400Mcg(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0119  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C572400Mcg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
