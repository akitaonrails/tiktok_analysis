package X;

import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TtB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.bgeffect.BgEffectViewModel$fetchCategoryListFromServer$1", f = "BgEffectViewModel.kt", l = {246, 248, 251}, m = "invokeSuspend")
public final class C760990TtB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ BgEffectViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ InterfaceC761010TtD LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760990TtB(BgEffectViewModel bgEffectViewModel, String str, InterfaceC761010TtD interfaceC761010TtD, InterfaceC1364105Vn<? super C760990TtB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = bgEffectViewModel;
        this.LLILZ = str;
        this.LLILZIL = interfaceC761010TtD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760990TtB(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[Catch: Exception -> 0x008e, TRY_LEAVE, TryCatch #0 {Exception -> 0x008e, blocks: (B:23:0x007c, B:24:0x007f, B:26:0x0083, B:19:0x0052, B:20:0x0055, B:16:0x0038), top: B:38:0x0013 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r10 = r16
            java.lang.String r9 = "BgEffectViewModel@1cd8.fetchCategoryListFromServer$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r15.LLILLJJLI
            r7 = 12
            r6 = 0
            r5 = 3
            r8 = 2
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 == r1) goto L30
            if (r0 == r8) goto L2b
            if (r0 != r5) goto Lab
            X.C155000ia.LIZIZ(r10)
        L1e:
            X.0TtD r0 = r15.LLILZIL
            if (r0 == 0) goto L25
            r0.LIZ()
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L2b:
            java.lang.Object r3 = r15.LL
            java.util.List r3 = (java.util.List) r3
            goto L7c
        L30:
            java.lang.Object r3 = r15.LL
            java.util.List r3 = (java.util.List) r3
            goto L52
        L35:
            X.C155000ia.LIZIZ(r10)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L8e
            r3.<init>()     // Catch: java.lang.Exception -> L8e
            com.bytedance.android.live.effect.bgeffect.BgEffectViewModel r0 = r15.LLILLL     // Catch: java.lang.Exception -> L8e
            X.0UMA r10 = r0.LLJJIJIIJIL     // Catch: java.lang.Exception -> L8e
            java.lang.String r11 = r15.LLILZ     // Catch: java.lang.Exception -> L8e
            r15.LL = r3     // Catch: java.lang.Exception -> L8e
            r15.LLILLJJLI = r1     // Catch: java.lang.Exception -> L8e
            java.lang.String r12 = ""
            r13 = 0
            r14 = r13
            java.lang.Object r10 = r10.LJJJIL(r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L8e
            if (r10 != r4) goto L55
            goto Lb3
        L52:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Exception -> L8e
        L55:
            X.0U8u r10 = (X.C767500U8u) r10     // Catch: java.lang.Exception -> L8e
            com.bytedance.android.live.effect.bgeffect.BgEffectViewModel r2 = r15.LLILLL     // Catch: java.lang.Exception -> L8e
            java.lang.String r1 = r15.LLILZ     // Catch: java.lang.Exception -> L8e
            java.util.List<com.bytedance.android.livesdkapi.depend.model.LiveEffect> r0 = r10.LIZ     // Catch: java.lang.Exception -> L8e
            r2.getClass()     // Catch: java.lang.Exception -> L8e
            com.bytedance.android.live.effect.bgeffect.BgEffectViewModel.aR2(r1, r0, r6, r6)     // Catch: java.lang.Exception -> L8e
            r3.addAll(r0)     // Catch: java.lang.Exception -> L8e
            com.bytedance.android.live.effect.bgeffect.BgEffectViewModel r0 = r15.LLILLL     // Catch: java.lang.Exception -> L8e
            X.1DDr r2 = r0.LLILLL     // Catch: java.lang.Exception -> L8e
            X.01gM r1 = new X.01gM     // Catch: java.lang.Exception -> L8e
            java.lang.String r0 = r15.LLILZ     // Catch: java.lang.Exception -> L8e
            r1.<init>(r0, r3, r6, r7)     // Catch: java.lang.Exception -> L8e
            r15.LL = r3     // Catch: java.lang.Exception -> L8e
            r15.LLILLJJLI = r8     // Catch: java.lang.Exception -> L8e
            java.lang.Object r0 = r2.emit(r1, r15)     // Catch: java.lang.Exception -> L8e
            if (r0 != r4) goto L7f
            goto Lb7
        L7c:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Exception -> L8e
        L7f:
            X.0TtD r2 = r15.LLILZIL     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L25
            X.01gM r1 = new X.01gM     // Catch: java.lang.Exception -> L8e
            java.lang.String r0 = r15.LLILZ     // Catch: java.lang.Exception -> L8e
            r1.<init>(r0, r3, r6, r7)     // Catch: java.lang.Exception -> L8e
            r2.LIZIZ(r1)     // Catch: java.lang.Exception -> L8e
            goto L25
        L8e:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            com.bytedance.android.live.effect.bgeffect.BgEffectViewModel r0 = r15.LLILLL
            X.1DDr r2 = r0.LLILLL
            X.01vk r1 = new X.01vk
            java.lang.String r0 = r15.LLILZ
            r1.<init>(r0)
            r15.LL = r3
            r15.LLILLJJLI = r5
            java.lang.Object r0 = r2.emit(r1, r15)
            if (r0 != r4) goto L1e
            X.C1C7U.LIZIZ(r9)
            return r4
        Lab:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb3:
            X.C1C7U.LIZIZ(r9)
            return r4
        Lb7:
            X.C1C7U.LIZIZ(r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C760990TtB.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
