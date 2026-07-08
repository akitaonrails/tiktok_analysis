package X;

import com.ss.android.ugc.aweme.template.TemplateOperationData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L5x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.template.TemplateOperation$updateTemplateOperationResource$1", f = "TemplateOperation.kt", l = {240, 240}, m = "invokeSuspend")
public final class C537430L5x extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ TemplateOperationData LLILLL;
    public final /* synthetic */ List<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537430L5x(TemplateOperationData templateOperationData, List<String> list, InterfaceC1364105Vn<? super C537430L5x> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = templateOperationData;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C537430L5x c537430L5x = new C537430L5x(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c537430L5x.LLILLJJLI = obj;
        return c537430L5x;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "TemplateOperation@6730.updateTemplateOperationResource$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r11.LL
            r6 = 2
            r9 = 1
            r5 = 0
            if (r0 == 0) goto L4a
            if (r0 == r9) goto L7b
            if (r0 != r6) goto L9c
            X.C155000ia.LIZIZ(r12)
        L17:
            X.00o6 r12 = (X.C189200o6) r12
            java.lang.Object r0 = r12.m10unboximpl()
            boolean r0 = X.C189200o6.m8isSuccessimpl(r0)
            if (r0 == 0) goto L42
            java.lang.String r0 = "template_operation"
            com.bytedance.keva.Keva r2 = com.bytedance.keva.Keva.getRepo(r0)
            X.04rF r1 = X.C1227904rF.LIZ
            com.ss.android.ugc.aweme.template.TemplateOperationData r0 = r11.LLILLL
            r1.getClass()
            java.lang.String r1 = X.C1227904rF.LJI(r0)
            java.lang.String r0 = "template_operation_data"
            r2.storeString(r0, r1)
            X.0L62 r1 = X.C0L62.LIZ
            com.ss.android.ugc.aweme.template.TemplateOperationData r0 = r11.LLILLL
            r1.getClass()
            X.C0L62.LJI = r0
        L42:
            X.C0L62.LIZIZ = r5
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L4a:
            X.C155000ia.LIZIZ(r12)
            java.lang.Object r8 = r11.LLILLJJLI
            X.01wk r8 = (X.InterfaceC497601wk) r8
            X.1DFB r4 = X.C0PEM.LIZJ
            X.0L5z r2 = new X.0L5z
            com.ss.android.ugc.aweme.template.TemplateOperationData r1 = r11.LLILLL
            java.util.List<java.lang.String> r0 = r11.LLILZ
            r2.<init>(r1, r0, r5)
            X.099G r3 = X.C23250099c.LIZIZ(r8, r4, r5, r2, r6)
            X.0L5y r2 = new X.0L5y
            com.ss.android.ugc.aweme.template.TemplateOperationData r1 = r11.LLILLL
            java.util.List<java.lang.String> r0 = r11.LLILZ
            r2.<init>(r1, r0, r5)
            X.099G r1 = X.C23250099c.LIZIZ(r8, r4, r5, r2, r6)
            r11.LLILLJJLI = r1
            r11.LL = r9
            java.lang.Object r12 = r3.LJLIIIL(r11)
            if (r12 != r7) goto L82
            X.C1C7U.LIZIZ(r10)
            return r7
        L7b:
            java.lang.Object r1 = r11.LLILLJJLI
            X.0957 r1 = (X.AnonymousClass0957) r1
            X.C155000ia.LIZIZ(r12)
        L82:
            X.00o6 r12 = (X.C189200o6) r12
            java.lang.Object r0 = r12.m10unboximpl()
            boolean r0 = X.C189200o6.m8isSuccessimpl(r0)
            if (r0 == 0) goto L42
            r11.LLILLJJLI = r5
            r11.LL = r6
            java.lang.Object r12 = r1.LJLIIIL(r11)
            if (r12 != r7) goto L17
            X.C1C7U.LIZIZ(r10)
            return r7
        L9c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C537430L5x.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
