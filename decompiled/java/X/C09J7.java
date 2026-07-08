package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09J7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl$cancelTasksByTaskIds$2", f = "CreationAsyncTaskManagerImpl.kt", l = {384}, m = "invokeSuspend")
public final class C09J7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public CreationAsyncTaskManagerImpl LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ List<InterfaceC542770LQl<C09JG, AbsTaskOutput>> LLILZIL;
    public final /* synthetic */ List<String> LLILZLL;
    public final /* synthetic */ CreationAsyncTaskManagerImpl LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09J7(List<? extends InterfaceC542770LQl<? super C09JG, ? extends AbsTaskOutput>> list, List<String> list2, CreationAsyncTaskManagerImpl creationAsyncTaskManagerImpl, InterfaceC1364105Vn<? super C09J7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = list;
        this.LLILZLL = list2;
        this.LLIZ = creationAsyncTaskManagerImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09J7(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0090 -> B:6:0x001d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009e -> B:6:0x001d). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r12 = "CreationAsyncTaskManagerImpl@3207.cancelTasksByTaskIds$2"
            X.C1C7U.LIZ(r12)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r13.LLILZ
            r5 = 1
            if (r0 == 0) goto L77
            if (r0 != r5) goto La4
            java.lang.Object r7 = r13.LLILLL
            java.util.Iterator r7 = (java.util.Iterator) r7
            com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl r4 = r13.LLILLJJLI
            java.lang.Object r3 = r13.LL
            java.util.List r3 = (java.util.List) r3
            X.C155000ia.LIZIZ(r14)
        L1d:
            java.util.Iterator r11 = r3.iterator()
        L21:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r9 = r11.next()
            java.lang.String r9 = (java.lang.String) r9
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<X.09AE>> r0 = r4.LIZJ
            java.lang.Object r0 = r0.get(r9)
            if (r0 == 0) goto L21
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<X.09AE>> r0 = r4.LIZJ
            java.lang.Object r0 = r0.get(r9)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L71
            java.util.Iterator r10 = r0.iterator()
        L43:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r8 = r10.next()
            X.09AE r8 = (X.C09AE) r8
            boolean r0 = r8.isActive()
            if (r0 == 0) goto L43
            X.0F8u r2 = X.C385300F8u.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "cancelTasksByTaskIds : "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "CreationAsyncTask"
            X.C201955140j.LIZLLL(r2, r0, r1)
            r0 = 0
            r8.LIZIZ(r0)
            goto L43
        L71:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<X.09AE>> r0 = r4.LIZJ
            r0.remove(r9)
            goto L21
        L77:
            X.C155000ia.LIZIZ(r14)
            java.util.List<X.0LQl<X.09JG, com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput>> r0 = r13.LLILZIL
            java.util.List<java.lang.String> r3 = r13.LLILZLL
            com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl r4 = r13.LLIZ
            java.util.Iterator r7 = r0.iterator()
        L84:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lac
            java.lang.Object r0 = r7.next()
            X.0LQl r0 = (X.InterfaceC542770LQl) r0
            if (r0 == 0) goto L1d
            r13.LL = r3
            r13.LLILLJJLI = r4
            r13.LLILLL = r7
            r13.LLILZ = r5
            java.lang.Object r0 = r0.LJIIJ(r13)
            if (r0 != r6) goto L1d
            X.C1C7U.LIZIZ(r12)
            return r6
        La4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lac:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09J7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
