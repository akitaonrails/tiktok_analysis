package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ErH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.EditorProAIGCComponent$createPlaceholder$1", f = "EditorProAIGCComponent.kt", l = {266, 270, 272}, m = "invokeSuspend")
public final class C377610ErH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C381540Exc LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C377590ErF LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ AIGCGenerationParam LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C377610ErH(C377590ErF c377590ErF, String str, String str2, AIGCGenerationParam aIGCGenerationParam, boolean z, String str3, Function0<Unit> function0, InterfaceC1364105Vn<? super C377610ErH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c377590ErF;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = aIGCGenerationParam;
        this.LLIZLLLIL = z;
        this.LLJ = str3;
        this.LLJI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C377610ErH(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            r22 = this;
            r13 = r23
            java.lang.String r9 = "EditorProAIGCComponent@c6d2.createPlaceholder$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r7 = X.C099R.LJFF()
            r8 = r22
            int r0 = r8.LLILLL
            r6 = 3
            r3 = 2
            r2 = 1
            r5 = 0
            if (r0 == 0) goto L24
            if (r0 == r2) goto L3b
            if (r0 == r3) goto L6e
            if (r0 != r6) goto Lb2
            X.C155000ia.LIZIZ(r13)
        L1e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L24:
            X.C155000ia.LIZIZ(r13)
            X.0ErF r0 = r8.LLILZ
            X.0DxH r1 = r0.v5()
            java.lang.String r0 = r8.LLILZIL
            r8.LLILLL = r2
            java.lang.Object r13 = r1.LIZIZ(r0, r8)
            if (r13 != r7) goto L3e
            X.C1C7U.LIZIZ(r9)
            return r7
        L3b:
            X.C155000ia.LIZIZ(r13)
        L3e:
            X.0Exc r13 = (X.C381540Exc) r13
            X.0ErF r0 = r8.LLILZ
            java.lang.String r15 = r0.E3()
            java.lang.String r4 = r8.LLILZLL
            if (r4 != 0) goto L7b
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam r0 = r8.LLIZ
            java.lang.String r2 = r0.imagePath
            int r0 = r2.length()
            if (r0 <= 0) goto L6c
            X.0ErF r1 = r8.LLILZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r1.getEditModel()
            r8.LL = r13
            r8.LLILLJJLI = r15
            r8.LLILLL = r3
            java.lang.Object r4 = r1.Z1(r2, r0, r8)
            if (r4 != r7) goto L6a
            X.C1C7U.LIZIZ(r9)
            return r7
        L6a:
            r0 = r13
            goto L78
        L6c:
            r4 = r5
            goto L7b
        L6e:
            java.lang.Object r15 = r8.LLILLJJLI
            java.lang.String r15 = (java.lang.String) r15
            X.0Exc r0 = r8.LL
            X.C155000ia.LIZIZ(r13)
            r4 = r13
        L78:
            java.lang.String r4 = (java.lang.String) r4
            r13 = r0
        L7b:
            X.0ErF r1 = r8.LLILZ
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam r0 = r8.LLIZ
            com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCTemplateModel r16 = r1.H3(r0)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.0ErI r10 = new X.0ErI
            X.0ErF r11 = r8.LLILZ
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam r12 = r8.LLIZ
            java.lang.String r14 = r8.LLILZIL
            boolean r2 = r8.LLIZLLLIL
            java.lang.String r1 = r8.LLJ
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r8.LLJI
            r19 = r1
            r20 = r0
            r21 = r5
            r17 = r4
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r8.LL = r5
            r8.LLILLJJLI = r5
            r8.LLILLL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r8, r3, r10)
            if (r0 != r7) goto L1e
            X.C1C7U.LIZIZ(r9)
            return r7
        Lb2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377610ErH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
