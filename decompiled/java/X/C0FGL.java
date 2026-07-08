package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FGL, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.common.text.pro.style.TextStyleCategoryPagerComponent$onTextStyleClick$2", f = "TextStyleCategoryPagerComponent.kt", l = {259, 260}, m = "invokeSuspend")
public final class C0FGL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C0FGO LLILZ;
    public final /* synthetic */ C0FGT LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Effect LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ Effect LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FGL(String str, C0FGO c0fgo, C0FGT c0fgt, int i, boolean z, Effect effect, boolean z2, Effect effect2, InterfaceC1364105Vn<? super C0FGL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c0fgo;
        this.LLILZIL = c0fgt;
        this.LLILZLL = i;
        this.LLIZ = z;
        this.LLIZLLLIL = effect;
        this.LLJ = z2;
        this.LLJI = effect2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0FGL c0fgl = new C0FGL(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c0fgl.LLILLJJLI = obj;
        return c0fgl;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FGL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
