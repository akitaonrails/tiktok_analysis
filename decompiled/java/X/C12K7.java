package X;

import android.content.Context;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextLayoutConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12K7, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextBean$parseEffectTextRes$2$1", f = "EffectTextBean.kt", l = {}, m = "invokeSuspend")
public final class C12K7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<C2280608we> LL;
    public final /* synthetic */ C11UK LLILLJJLI;
    public final /* synthetic */ OuterEffectTextLayoutConfig LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12K7(List<C2280608we> list, C11UK c11uk, OuterEffectTextLayoutConfig outerEffectTextLayoutConfig, Context context, InterfaceC1364105Vn<? super C12K7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c11uk;
        this.LLILLL = outerEffectTextLayoutConfig;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C12K7(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x038e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r57) {
        /*
            Method dump skipped, instruction units count: 1097
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12K7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
