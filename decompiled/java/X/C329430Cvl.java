package X;

import com.ss.android.ugc.aweme.tako.ccl.net.TakoAwemeRecallResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cvl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.video.videoenhanced.inner.TakoEnhancedVideoDetailFeedListModel$fetchData$1", f = "TakoEnhancedVideoDetailFeedListModel.kt", l = {82, 93}, m = "invokeSuspend")
public final class C329430Cvl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public TakoAwemeRecallResponse LL;
    public int LLILLJJLI;
    public final /* synthetic */ C329440Cvm LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329430Cvl(C329440Cvm c329440Cvm, InterfaceC1364105Vn<? super C329430Cvl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c329440Cvm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C329430Cvl(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r7 = "TakoEnhancedVideoDetailFeedListModel@c88f.fetchData$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILLJJLI
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L37
            if (r0 == r4) goto L50
            if (r0 != r5) goto L72
            com.ss.android.ugc.aweme.tako.ccl.net.TakoAwemeRecallResponse r1 = r8.LL
            X.C155000ia.LIZIZ(r9)
        L18:
            X.0Cvm r0 = r8.LLILLL
            r0.handleData(r1)
            X.0Cvm r0 = r8.LLILLL
            java.util.List<X.05yG> r0 = r0.mNotifyListeners
            if (r0 == 0) goto L6c
            java.util.Iterator r1 = r0.iterator()
        L27:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r1.next()
            X.05yG r0 = (X.InterfaceC1526205yG) r0
            r0.onSuccess()
            goto L27
        L37:
            X.C155000ia.LIZIZ(r9)
            X.1DFB r3 = X.C0PEM.LIZJ
            X.0Cvk r2 = new X.0Cvk
            X.0Cvm r1 = r8.LLILLL
            r0 = 0
            r2.<init>(r1, r0)
            r8.LLILLJJLI = r4
            java.lang.Object r9 = X.C23250099c.LJI(r8, r3, r2)
            if (r9 != r6) goto L53
            X.C1C7U.LIZIZ(r7)
            return r6
        L50:
            X.C155000ia.LIZIZ(r9)
        L53:
            com.ss.android.ugc.aweme.tako.ccl.net.TakoAwemeRecallResponse r9 = (com.ss.android.ugc.aweme.tako.ccl.net.TakoAwemeRecallResponse) r9
            X.0Cvm r1 = r8.LLILLL
            r0 = 0
            r1.mIsLoading = r0
            java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem> r0 = r9.videoList
            r8.LL = r9
            r8.LLILLJJLI = r5
            java.lang.Object r0 = r1.LJIIJ(r0, r8)
            if (r0 != r6) goto L6a
            X.C1C7U.LIZIZ(r7)
            return r6
        L6a:
            r1 = r9
            goto L18
        L6c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329430Cvl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
