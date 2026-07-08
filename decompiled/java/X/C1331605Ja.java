package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.dispatch.ComponentDispatcher$triggerSparseTask$1", f = "ComponentDispatcher.kt", l = {128, 129}, m = "invokeSuspend")
public final class C1331605Ja extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1333305Jr LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ List<AbstractC1333605Ju<Object, Object>> LLILZ;
    public final /* synthetic */ C1333305Jr<Object, Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1331605Ja(List<? extends AbstractC1333605Ju<Object, Object>> list, C1333305Jr<Object, Object> c1333305Jr, InterfaceC1364105Vn<? super C1331605Ja> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = list;
        this.LLILZIL = c1333305Jr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1331605Ja(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005a -> B:7:0x001c). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "ComponentDispatcher@4f48.triggerSparseTask$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r11.LLILLL
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L60
            if (r0 == r6) goto L45
            if (r0 != r7) goto L72
            java.lang.Object r9 = r11.LLILLJJLI
            java.util.Iterator r9 = (java.util.Iterator) r9
            X.05Jr r5 = r11.LL
            X.C155000ia.LIZIZ(r12)
        L1c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r4 = r9.next()
            X.05Ju r4 = (X.AbstractC1333605Ju) r4
            X.05Jw<COMPONENT, PARAM> r3 = r5.LIZLLL
            r11.LL = r5
            r11.LLILLJJLI = r9
            r11.LLILLL = r6
            r3.getClass()
            X.1DFB r2 = X.C0PEM.LIZJ
            X.05JY r1 = new X.05JY
            r0 = 0
            r1.<init>(r3, r4, r0)
            java.lang.Object r0 = X.C23250099c.LJI(r11, r2, r1)
            if (r0 != r8) goto L4e
            X.C1C7U.LIZIZ(r10)
            return r8
        L45:
            java.lang.Object r9 = r11.LLILLJJLI
            java.util.Iterator r9 = (java.util.Iterator) r9
            X.05Jr r5 = r11.LL
            X.C155000ia.LIZIZ(r12)
        L4e:
            r11.LL = r5
            r11.LLILLJJLI = r9
            r11.LLILLL = r7
            r0 = 20
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r11)
            if (r0 != r8) goto L1c
            X.C1C7U.LIZIZ(r10)
            return r8
        L60:
            X.C155000ia.LIZIZ(r12)
            java.util.List<X.05Ju<java.lang.Object, java.lang.Object>> r0 = r11.LLILZ
            X.05Jr<java.lang.Object, java.lang.Object> r5 = r11.LLILZIL
            java.util.Iterator r9 = r0.iterator()
            goto L1c
        L6c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1331605Ja.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
