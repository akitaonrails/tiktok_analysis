package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01cl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.photo.PhotoAsyncTaskRecorder$waitTaskDone$1", f = "PhotoAsyncTaskRecorder.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C373701cl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ List<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C373701cl(List<String> list, InterfaceC1364105Vn<? super C373701cl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C373701cl(this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0036 -> B:6:0x001b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0042 -> B:6:0x001b). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "PhotoAsyncTaskRecorder@7afa.waitTaskDone$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r6 = 1
            if (r0 == 0) goto L48
            if (r0 != r6) goto L93
            java.lang.Object r2 = r9.LLILLJJLI
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r1 = r9.LL
            java.util.Iterator r1 = (java.util.Iterator) r1
            X.C155000ia.LIZIZ(r10)
        L1b:
            java.lang.Object r0 = r2.getKey()
            java.lang.String r0 = (java.lang.String) r0
            X.C373801cm.LIZIZ(r0)
        L24:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getValue()
            X.0957 r0 = (X.AnonymousClass0957) r0
            if (r0 == 0) goto L1b
            r9.LL = r1
            r9.LLILLJJLI = r2
            r9.LLILLL = r6
            java.lang.Object r0 = r0.LJLIIIL(r9)
            if (r0 != r7) goto L1b
            X.C1C7U.LIZIZ(r8)
            return r7
        L48:
            X.C155000ia.LIZIZ(r10)
            X.01GW r0 = X.C373801cm.LIZ
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.util.List<java.lang.String> r5 = r9.LLILZ
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L62:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L62
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r0 = r2.getValue()
            r4.put(r1, r0)
            goto L62
        L84:
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r1 = r0.iterator()
            goto L24
        L8d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C373701cl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
