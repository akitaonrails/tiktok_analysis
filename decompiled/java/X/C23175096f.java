package X;

import android.content.Context;
import com.ss.android.ugc.aweme.service.TemplateMediaServiceImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.096f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.TemplateMediaServiceImpl$compressMedias$compressJob$1", f = "TemplateMediaServiceImpl.kt", l = {84, 85}, m = "invokeSuspend")
public final class C23175096f extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public boolean LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ List<C23179096j> LLILZ;
    public final /* synthetic */ InterfaceC23176096g LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ TemplateMediaServiceImpl LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23175096f(List<C23179096j> list, InterfaceC23176096g interfaceC23176096g, long j, TemplateMediaServiceImpl templateMediaServiceImpl, Context context, String str, InterfaceC1364105Vn<? super C23175096f> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = list;
        this.LLILZIL = interfaceC23176096g;
        this.LLILZLL = j;
        this.LLIZ = templateMediaServiceImpl;
        this.LLIZLLLIL = context;
        this.LLJ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C23175096f c23175096f = new C23175096f(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c23175096f.LLILLL = obj;
        return c23175096f;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23175096f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
