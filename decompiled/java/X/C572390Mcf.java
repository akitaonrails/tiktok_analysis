package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Mcf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.TextImageForwardResolver$synthesizeImage$1", f = "TextImageForwardResolver.kt", l = {187, 188, 200}, m = "invokeSuspend")
public final class C572390Mcf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C572380Mce LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ ForwardMedia LLILZLL;
    public final /* synthetic */ C572370Mcd LLIZ;
    public final /* synthetic */ Function1<C572410Mch, Unit> LLIZLLLIL;
    public final /* synthetic */ Function0<Unit> LLJ;
    public final /* synthetic */ Function1<Integer, Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C572390Mcf(String str, Context context, ForwardMedia forwardMedia, C572370Mcd c572370Mcd, Function1<? super C572410Mch, Unit> function1, Function0<Unit> function0, Function1<? super Integer, Unit> function12, InterfaceC1364105Vn<? super C572390Mcf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = context;
        this.LLILZLL = forwardMedia;
        this.LLIZ = c572370Mcd;
        this.LLIZLLLIL = function1;
        this.LLJ = function0;
        this.LLJI = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C572390Mcf(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf A[Catch: all -> 0x010f, TryCatch #8 {all -> 0x010f, blocks: (B:8:0x0022, B:63:0x0110, B:45:0x00b4, B:47:0x00bf, B:48:0x00c7, B:50:0x00d7, B:51:0x00db, B:18:0x0043, B:31:0x008d), top: B:77:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7 A[Catch: all -> 0x010f, TryCatch #8 {all -> 0x010f, blocks: (B:8:0x0022, B:63:0x0110, B:45:0x00b4, B:47:0x00bf, B:48:0x00c7, B:50:0x00d7, B:51:0x00db, B:18:0x0043, B:31:0x008d), top: B:77:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0115  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C572390Mcf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
