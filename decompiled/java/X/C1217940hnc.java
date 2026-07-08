package X;

import com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hnc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1217940hnc extends C09AY implements Function1<C1218060hno, Unit> {
    public final /* synthetic */ AuditRequestListViewModel LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1217940hnc(AuditRequestListViewModel auditRequestListViewModel, long j) {
        super(1);
        this.LL = auditRequestListViewModel;
        this.LLILLJJLI = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081 A[LOOP:3: B:26:0x007b->B:28:0x0081, LOOP_END] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.C1218060hno r13) {
        /*
            r12 = this;
            X.0hno r13 = (X.C1218060hno) r13
            X.0Ojc<X.0hni> r0 = r13.LL
            java.util.List<ITEM> r0 = r0.LLILZ
            if (r0 == 0) goto L9e
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            long r3 = r12.LLILLJJLI
            java.util.Iterator r7 = r8.iterator()
            r9 = 0
            r6 = 0
        L15:
            boolean r0 = r7.hasNext()
            r5 = -1
            if (r0 == 0) goto L9e
            java.lang.Object r0 = r7.next()
            X.0hni r0 = (X.C1218000hni) r0
            X.0ho0 r0 = r0.LL
            long r1 = r0.LIZLLL
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L69
            if (r6 == r5) goto L9e
            com.bytedance.mt.protector.impl.collections.ListProtector.remove(r8, r6)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L67
            java.util.Iterator r1 = r8.iterator()
        L39:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r1.next()
            X.0hni r0 = (X.C1218000hni) r0
            boolean r0 = r0.LLILLL
            if (r0 != 0) goto L39
        L49:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r8.iterator()
        L52:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0hni r0 = (X.C1218000hni) r0
            boolean r0 = r0.LLILLL
            if (r0 == 0) goto L52
            r3.add(r1)
            goto L52
        L67:
            r9 = 1
            goto L49
        L69:
            int r6 = r6 + 1
            goto L15
        L6c:
            java.util.ArrayList r10 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r3, r0)
            r10.<init>(r0)
            java.util.Iterator r2 = r3.iterator()
        L7b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L93
            java.lang.Object r0 = r2.next()
            X.0hni r0 = (X.C1218000hni) r0
            X.0ho0 r0 = r0.LL
            long r0 = r0.LIZLLL
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.add(r0)
            goto L7b
        L93:
            com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel r7 = r12.LL
            kotlin.jvm.internal.AwS39S0310000_19 r6 = new kotlin.jvm.internal.AwS39S0310000_19
            r11 = 2
            r6.<init>(r7, r8, r9, r10, r11)
            r7.setState(r6)
        L9e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1217940hnc.invoke(java.lang.Object):java.lang.Object");
    }
}
