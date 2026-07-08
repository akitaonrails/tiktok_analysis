package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08iq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.story.MessageRequestStoryAggregationSource$1", f = "MessageRequestStoryAggregationSource.kt", l = {85, 87}, m = "invokeSuspend")
public final class C2195008iq extends C09AX implements Function2<Unit, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C878880Ydq LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2195008iq(C878880Ydq c878880Ydq, InterfaceC1364105Vn<? super C2195008iq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c878880Ydq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2195008iq(this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "MessageRequestStoryAggregationSource@b8bb.<init>$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r3 = 2
            r5 = 1
            if (r0 == 0) goto L38
            if (r0 == r5) goto L5a
            if (r0 != r3) goto L72
            long r1 = r7.LL
            java.lang.Object r5 = r7.LLILLJJLI
            java.util.Iterator r5 = (java.util.Iterator) r5
            X.C155000ia.LIZIZ(r8)
        L1c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r5.next()
            X.08ir r0 = (X.InterfaceC2195108ir) r0
            r7.LLILLJJLI = r5
            r7.LL = r1
            r7.LLILLL = r3
            java.lang.Object r0 = r0.LIZ(r1, r7)
            if (r0 != r4) goto L1c
            X.C1C7U.LIZIZ(r6)
            return r4
        L38:
            X.C155000ia.LIZIZ(r8)
            X.0Ydq r2 = r7.LLILZ
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0Y9G> r0 = r2.LIZ
            java.util.Collection r1 = r0.values()
            r0 = 0
            X.0Y9G[] r0 = new X.C0Y9G[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.util.List r0 = X.C13LQ.LJJLL(r0)
            r7.LLILLL = r5
            java.lang.Object r8 = r2.LIZ(r0, r7)
            if (r8 != r4) goto L5d
            X.C1C7U.LIZIZ(r6)
            return r4
        L5a:
            X.C155000ia.LIZIZ(r8)
        L5d:
            java.lang.Number r8 = (java.lang.Number) r8
            long r1 = r8.longValue()
            X.0Ydq r0 = r7.LLILZ
            java.util.concurrent.CopyOnWriteArraySet<X.08ir> r0 = r0.LJ
            java.util.Iterator r5 = r0.iterator()
            goto L1c
        L6c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2195008iq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(unit, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
