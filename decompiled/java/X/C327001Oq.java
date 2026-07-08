package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Oq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.input.scene.AiChatInputFeatureScene$addImageEntranceColorChange$1", f = "AiChatInputFeatureScene.kt", l = {621}, m = "invokeSuspend")
public final class C327001Oq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public C21296918Vz LLILLL;
    public Object LLILZ;
    public C118300cf LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ C118300cf LLIZ;
    public final /* synthetic */ C21296918Vz LLIZLLLIL;
    public final /* synthetic */ List<Integer> LLJ;
    public final /* synthetic */ C118300cf LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327001Oq(C118300cf c118300cf, C21296918Vz c21296918Vz, List<Integer> list, C118300cf c118300cf2, InterfaceC1364105Vn<? super C327001Oq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c118300cf;
        this.LLIZLLLIL = c21296918Vz;
        this.LLJ = list;
        this.LLJI = c118300cf2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327001Oq(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x005d -> B:6:0x001f). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "AiChatInputFeatureScene@cafb.addImageEntranceColorChange$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r11.LLILZLL
            r6 = 1
            if (r0 == 0) goto L63
            if (r0 != r6) goto L78
            int r8 = r11.LLILLJJLI
            int r1 = r11.LL
            X.00cf r5 = r11.LLILZIL
            java.lang.Object r4 = r11.LLILZ
            java.util.List r4 = (java.util.List) r4
            X.18Vz r0 = r11.LLILLL
            X.C155000ia.LIZIZ(r12)
        L1f:
            int r8 = r8 + 1
        L21:
            if (r8 >= r1) goto L72
            android.view.View r9 = r0.LLLLLJIL()
            r2 = 12
            java.lang.Integer r2 = X.C2286608xc.LJ(r2)
            float r3 = X.C418440Gaw.LIZIZ(r2)
            int r2 = r5.element
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            X.C21296918Vz.LLLLLLZ(r3, r2, r9)
            int r2 = r5.element
            int r3 = r2 + 1
            int r2 = r4.size()
            int r3 = r3 % r2
            r5.element = r3
            r11.LLILLL = r0
            r11.LLILZ = r4
            r11.LLILZIL = r5
            r11.LL = r1
            r11.LLILLJJLI = r8
            r11.LLILZLL = r6
            r2 = 100
            java.lang.Object r2 = X.AnonymousClass0958.LIZIZ(r2, r11)
            if (r2 != r7) goto L1f
            X.C1C7U.LIZIZ(r10)
            return r7
        L63:
            X.C155000ia.LIZIZ(r12)
            X.00cf r0 = r11.LLIZ
            int r1 = r0.element
            X.18Vz r0 = r11.LLIZLLLIL
            java.util.List<java.lang.Integer> r4 = r11.LLJ
            X.00cf r5 = r11.LLJI
            r8 = 0
            goto L21
        L72:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327001Oq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
