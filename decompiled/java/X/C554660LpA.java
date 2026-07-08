package X;

import com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0LpA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C554660LpA<T> implements InterfaceC346701Wf {
    public final /* synthetic */ InterfaceC346701Wf LL;
    public final /* synthetic */ Map LLILLJJLI;
    public final /* synthetic */ AIGCWorkflowCreationServiceImpl LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ List LLILZIL;

    public C554660LpA(InterfaceC346701Wf interfaceC346701Wf, Map map, AIGCWorkflowCreationServiceImpl aIGCWorkflowCreationServiceImpl, String str, List list) {
        this.LL = interfaceC346701Wf;
        this.LLILLJJLI = map;
        this.LLILLL = aIGCWorkflowCreationServiceImpl;
        this.LLILZ = str;
        this.LLILZIL = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    @Override // X.InterfaceC346701Wf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r9, X.InterfaceC1364105Vn r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C554670LpB
            if (r0 == 0) goto L59
            r6 = r10
            X.0LpB r6 = (X.C554670LpB) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r7 = 1
            if (r0 == 0) goto L25
            if (r0 != r7) goto L5f
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            X.01Wf r4 = r8.LL
            kotlin.Pair r9 = (kotlin.Pair) r9
            java.lang.Object r2 = r9.getFirst()
            java.lang.Object r1 = r9.getSecond()
            java.util.Map r0 = r8.LLILLJJLI
            r0.put(r2, r1)
            com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl r3 = r8.LLILLL
            java.lang.String r2 = r8.LLILZ
            java.util.Map r0 = r8.LLILLJJLI
            java.util.Collection r0 = r0.values()
            java.util.List r1 = X.C13LP.LLIIII(r0)
            java.util.List r0 = r8.LLILZIL
            r3.getClass()
            X.0LCf r0 = com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl.LJ(r2, r1, r0)
            r6.LLILLJJLI = r7
            java.lang.Object r0 = r4.emit(r0, r6)
            if (r0 != r5) goto L22
            return r5
        L59:
            X.0LpB r6 = new X.0LpB
            r6.<init>(r8, r10)
            goto L12
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C554660LpA.emit(java.lang.Object, X.05Vn):java.lang.Object");
    }
}
