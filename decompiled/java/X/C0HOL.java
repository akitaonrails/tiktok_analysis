package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HOL, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem$onViewCreated$27$1$1$1", f = "MixStudioHomePageAssem.kt", l = {1163, 1189}, m = "invokeSuspend")
public final class C0HOL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public C0HOM LLILLJJLI;
    public MixStudioHomePageAssem LLILLL;
    public InterfaceC440230HOb LLILZ;
    public TuxTextView LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ C0HOM<? extends List<C440440HOw>> LLIZ;
    public final /* synthetic */ MixStudioHomePageAssem LLIZLLLIL;
    public final /* synthetic */ InterfaceC440230HOb<? extends List<C440440HOw>> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HOL(C0HOM<? extends List<C440440HOw>> c0hom, MixStudioHomePageAssem mixStudioHomePageAssem, InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb, InterfaceC1364105Vn<? super C0HOL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c0hom;
        this.LLIZLLLIL = mixStudioHomePageAssem;
        this.LLJ = interfaceC440230HOb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HOL(this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HOL.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
