package X;

import com.ss.android.ugc.aweme.creative.model.edit.FeatureExtraction;
import com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08tX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService$getAllFeatureExtraction$3", f = "MixEditingFeatureExtractionService.kt", l = {294}, m = "invokeSuspend")
public final class C2261308tX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Pair<? extends FeatureExtraction, ? extends Integer>>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ List<C2262608tk> LLILZ;
    public final /* synthetic */ MixEditingFeatureExtractionService LLILZIL;
    public final /* synthetic */ Set<String> LLILZLL;
    public final /* synthetic */ C2263508tt LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2261308tX(List<C2262608tk> list, MixEditingFeatureExtractionService mixEditingFeatureExtractionService, Set<String> set, C2263508tt c2263508tt, InterfaceC1364105Vn<? super C2261308tX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = list;
        this.LLILZIL = mixEditingFeatureExtractionService;
        this.LLILZLL = set;
        this.LLIZ = c2263508tt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2261308tX c2261308tX = new C2261308tX(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c2261308tX.LLILLL = obj;
        return c2261308tX;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003e -> B:6:0x001c). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r6 = "MixEditingFeatureExtractionService@fa48.getAllFeatureExtraction$3"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r1 = r13.LLILLJJLI
            r12 = 0
            r0 = 1
            if (r1 == 0) goto L44
            if (r1 != r0) goto Lb3
            java.lang.Object r3 = r13.LL
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r2 = r13.LLILLL
            java.util.Collection r2 = (java.util.Collection) r2
            X.C155000ia.LIZIZ(r14)
        L1c:
            if (r14 == 0) goto L21
            r2.add(r14)
        L21:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Laa
            java.lang.Object r1 = r3.next()
            X.0957 r1 = (X.AnonymousClass0957) r1
            boolean r0 = r1.isCancelled()
            if (r0 != 0) goto L21
            r13.LLILLL = r2
            r13.LL = r3
            r0 = 1
            r13.LLILLJJLI = r0
            java.lang.Object r14 = r1.LJLIIIL(r13)
            if (r14 != r5) goto L1c
            X.C1C7U.LIZIZ(r6)
            return r5
        L44:
            X.C155000ia.LIZIZ(r14)
            java.lang.Object r4 = r13.LLILLL
            X.01wk r4 = (X.InterfaceC497601wk) r4
            java.util.List<X.08tk> r0 = r13.LLILZ
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r0.iterator()
        L56:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.08tk r0 = (X.C2262608tk) r0
            java.lang.String r0 = r0.LIZ
            int r0 = r0.length()
            if (r0 <= 0) goto L56
            r2.add(r1)
            goto L56
        L6f:
            com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService r8 = r13.LLILZIL
            java.util.Set<java.lang.String> r10 = r13.LLILZLL
            X.08tt r11 = r13.LLIZ
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r2, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
        L84:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9f
            java.lang.Object r9 = r2.next()
            X.08tk r9 = (X.C2262608tk) r9
            X.08tY r7 = new X.08tY
            r1 = r7
            r7.<init>(r8, r9, r10, r11, r12)
            r0 = 3
            X.099G r0 = X.C23250099c.LIZIZ(r4, r12, r12, r1, r0)
            r3.add(r0)
            goto L84
        L9f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r3.iterator()
            goto L21
        Laa:
            com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService r1 = r13.LLILZIL
            r0 = 0
            r1.LIZLLL = r0
            X.C1C7U.LIZIZ(r6)
            return r2
        Lb3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2261308tX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Pair<? extends FeatureExtraction, ? extends Integer>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
