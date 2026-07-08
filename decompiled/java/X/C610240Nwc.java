package X;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nwc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.ies.im.core.client.MessageRequestModelImpl$autoAcceptForBusinessInbox$1", f = "MessageRequestModelImpl.kt", l = {119, 132}, m = "invokeSuspend")
public final class C610240Nwc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C872760YLq LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ List<Pair<Long, String>> LLILZ;
    public final /* synthetic */ C872760YLq LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610240Nwc(List<Pair<Long, String>> list, C872760YLq c872760YLq, InterfaceC1364105Vn<? super C610240Nwc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = list;
        this.LLILZIL = c872760YLq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C610240Nwc(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0055 -> B:7:0x001c). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r6 = "MessageRequestModelImpl@bb78.autoAcceptForBusinessInbox$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r12.LLILLL
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L5b
            if (r0 == r2) goto L40
            if (r0 != r3) goto L8d
            java.lang.Object r5 = r12.LLILLJJLI
            java.util.Iterator r5 = (java.util.Iterator) r5
            X.0YLq r7 = r12.LL
            X.C155000ia.LIZIZ(r13)
        L1c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r8 = r5.next()
            java.util.List r8 = (java.util.List) r8
            r9 = 0
            X.0Nwb r10 = new X.0Nwb
            r10.<init>(r8, r7)
            X.05qM r11 = X.EnumC1477205qM.SWITCH_BIZ_INBOX_MODE
            r12.LL = r7
            r12.LLILLJJLI = r5
            r12.LLILLL = r2
            java.lang.Object r0 = r7.LIZIZ(r8, r9, r10, r11, r12)
            if (r0 != r4) goto L49
            X.C1C7U.LIZIZ(r6)
            return r4
        L40:
            java.lang.Object r5 = r12.LLILLJJLI
            java.util.Iterator r5 = (java.util.Iterator) r5
            X.0YLq r7 = r12.LL
            X.C155000ia.LIZIZ(r13)
        L49:
            r12.LL = r7
            r12.LLILLJJLI = r5
            r12.LLILLL = r3
            r0 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r12)
            if (r0 != r4) goto L1c
            X.C1C7U.LIZIZ(r6)
            return r4
        L5b:
            X.C155000ia.LIZIZ(r13)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "autoAcceptForBusinessInbox, start auto accept, total to accept size: "
            r1.append(r0)
            java.util.List<kotlin.Pair<java.lang.Long, java.lang.String>> r0 = r12.LLILZ
            int r0 = r0.size()
            r1.append(r0)
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            java.util.List<kotlin.Pair<java.lang.Long, java.lang.String>> r1 = r12.LLILZ
            r0 = 99
            java.util.List r0 = X.C13LP.LJJJIL(r1, r0)
            X.0YLq r7 = r12.LLILZIL
            java.util.Iterator r5 = r0.iterator()
            goto L1c
        L87:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L8d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C610240Nwc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
