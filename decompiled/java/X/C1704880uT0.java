package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uT0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.effectplatform.impl.DefaultResourceProvider$panelFetch$1", f = "DefaultResourceProvider.kt", l = {95, 97, 99, 102, 107, 109, 110}, m = "invokeSuspend")
public final class C1704880uT0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public EffectChannelResponse LL;
    public Object LLILLJJLI;
    public C1705310uTh LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C1705310uTh LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ AbstractC1705800uUU<T> LLJ;
    public final /* synthetic */ InterfaceC1705380uTo<T> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1704880uT0(C1705310uTh c1705310uTh, String str, boolean z, AbstractC1705800uUU<T> abstractC1705800uUU, InterfaceC1705380uTo<? super T> interfaceC1705380uTo, InterfaceC1364105Vn<? super C1704880uT0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c1705310uTh;
        this.LLIZ = str;
        this.LLIZLLLIL = z;
        this.LLJ = abstractC1705800uUU;
        this.LLJI = interfaceC1705380uTo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1704880uT0(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1704880uT0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
