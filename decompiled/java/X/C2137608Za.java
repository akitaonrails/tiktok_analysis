package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Za, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$fetchInstantCloneInfo$2$1$onSuccess$1", f = "TTSPanelUIComponent.kt", l = {3352, 3125, 3128}, m = "invokeSuspend")
public final class C2137608Za extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C118300cf LL;
    public InterfaceC383701eN LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C11Y7 LLILZLL;
    public final /* synthetic */ InterfaceC1364105Vn<Unit> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2137608Za(C11Y7 c11y7, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn, String str, InterfaceC1364105Vn<? super C2137608Za> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILZLL = c11y7;
        this.LLIZ = interfaceC1364105Vn;
        this.LLIZLLLIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2137608Za(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.String r10 = "TTSPanelUIComponent@ceaf.fetchInstantCloneInfo$2$1$onSuccess$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r11.LLILZIL
            r8 = 3
            r9 = 2
            r7 = 1
            r5 = 0
            if (r0 == 0) goto L43
            if (r0 == r7) goto L33
            if (r0 == r9) goto L2a
            if (r0 != r8) goto Lae
            X.C155000ia.LIZIZ(r12)
        L1a:
            X.05Vn<kotlin.Unit> r1 = r11.LLIZ
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C189200o6.m2constructorimpl(r0)
            r1.resumeWith(r0)
        L24:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L2a:
            java.lang.Object r1 = r11.LLILLL
            X.00cf r1 = (X.C118300cf) r1
            X.01eN r2 = r11.LLILLJJLI
            X.00cf r3 = r11.LL
            goto L7b
        L33:
            java.lang.Object r4 = r11.LLILZ
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r11.LLILLL
            X.11Y7 r3 = (X.C11Y7) r3
            X.01eN r2 = r11.LLILLJJLI
            X.00cf r1 = r11.LL
            X.C155000ia.LIZIZ(r12)
            goto L68
        L43:
            X.C155000ia.LIZIZ(r12)
            X.00cf r1 = new X.00cf
            r1.<init>()
            r0 = -1
            r1.element = r0
            X.11Y7 r3 = r11.LLILZLL
            X.01eN r2 = r3.LLLLLJLJLL
            java.lang.String r4 = r11.LLIZLLLIL
            r11.LL = r1
            r11.LLILLJJLI = r2
            r11.LLILLL = r3
            r11.LLILZ = r4
            r11.LLILZIL = r7
            java.lang.Object r0 = r2.LIZLLL(r5, r11)
            if (r0 != r6) goto L68
            X.C1C7U.LIZIZ(r10)
            return r6
        L68:
            r11.LL = r1     // Catch: java.lang.Throwable -> Lba
            r11.LLILLJJLI = r2     // Catch: java.lang.Throwable -> Lba
            r11.LLILLL = r1     // Catch: java.lang.Throwable -> Lba
            r11.LLILZ = r5     // Catch: java.lang.Throwable -> Lba
            r11.LLILZIL = r9     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r12 = r3.d8(r4, r11)     // Catch: java.lang.Throwable -> Lba
            if (r12 != r6) goto L79
            goto Lb6
        L79:
            r3 = r1
            goto L7e
        L7b:
            X.C155000ia.LIZIZ(r12)     // Catch: java.lang.Throwable -> Lbf
        L7e:
            java.lang.Number r12 = (java.lang.Number) r12     // Catch: java.lang.Throwable -> Lbf
            int r0 = r12.intValue()     // Catch: java.lang.Throwable -> Lbf
            r1.element = r0     // Catch: java.lang.Throwable -> Lbf
            r2.LIZIZ(r5)
            int r0 = r3.element
            if (r0 != 0) goto La2
            X.11Y7 r1 = r11.LLILZLL
            r11.LL = r5
            r11.LLILLJJLI = r5
            r11.LLILLL = r5
            r11.LLILZIL = r8
            r0 = 0
            java.lang.Object r0 = r1.cb(r0, r11)
            if (r0 != r6) goto L1a
            X.C1C7U.LIZIZ(r10)
            return r6
        La2:
            X.05Vn<kotlin.Unit> r1 = r11.LLIZ
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C189200o6.m2constructorimpl(r0)
            r1.resumeWith(r0)
            goto L24
        Lae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb6:
            X.C1C7U.LIZIZ(r10)
            return r6
        Lba:
            r0 = move-exception
        Lbb:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lbf
            goto Lc1
        Lbf:
            r0 = move-exception
            goto Lbb
        Lc1:
            r2.LIZIZ(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2137608Za.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
