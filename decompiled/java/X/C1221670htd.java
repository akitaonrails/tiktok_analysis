package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0htd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.AIGCQuickTask$fakeProgressJob$2$1", f = "AIGCQuickTask.kt", l = {25}, m = "invokeSuspend")
public final class C1221670htd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ AbstractC1242220iQm LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1221670htd(AbstractC1242220iQm abstractC1242220iQm, InterfaceC1364105Vn<? super C1221670htd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = abstractC1242220iQm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1221670htd(this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[LOOP:0: B:7:0x0021->B:9:0x0027, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006a -> B:6:0x0019). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            java.lang.String r7 = "AIGCQuickTask@c2a8.fakeProgressJob$2$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r4 = X.C099R.LJFF()
            r5 = r18
            int r1 = r5.LLILLL
            r0 = 1
            if (r1 == 0) goto L52
            if (r1 != r0) goto L6d
            int r6 = r5.LLILLJJLI
            int r3 = r5.LL
            X.C155000ia.LIZIZ(r19)
        L19:
            X.0iQm r0 = r5.LLILZ
            java.util.List<X.0htc> r0 = r0.listenerList
            java.util.Iterator r1 = r0.iterator()
        L21:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r0 = r1.next()
            X.0htc r0 = (X.InterfaceC1221660htc) r0
            X.0hth r8 = new X.0hth
            X.0hte r9 = X.EnumC1221680hte.IN_PROGRESS
            r10 = 0
            r11 = 0
            java.lang.Integer r13 = X.C2286608xc.LJ(r6)
            java.lang.String r15 = "fast"
            r17 = 328(0x148, float:4.6E-43)
            r12 = r11
            r14 = r11
            r16 = r11
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.onUpdate(r8)
            goto L21
        L46:
            r0 = 99
            if (r3 <= r0) goto L50
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L50:
            r0 = 1
            goto L56
        L52:
            X.C155000ia.LIZIZ(r19)
            r3 = 0
        L56:
            int r2 = r3 + 1
            r5.LL = r2
            r5.LLILLJJLI = r3
            r5.LLILLL = r0
            r0 = 20
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r5)
            if (r0 != r4) goto L6a
            X.C1C7U.LIZIZ(r7)
            return r4
        L6a:
            r6 = r3
            r3 = r2
            goto L19
        L6d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1221670htd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
