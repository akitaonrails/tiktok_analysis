package X;

import com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftFeedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CSm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftFeedViewModel$loadDraftVideos$1$1", f = "KidsDraftFeedViewModel.kt", l = {25, 26}, m = "invokeSuspend")
public final class C313980CSm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ KidsDraftFeedViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C313980CSm(KidsDraftFeedViewModel kidsDraftFeedViewModel, InterfaceC1364105Vn<? super C313980CSm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = kidsDraftFeedViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C313980CSm(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "KidsDraftFeedViewModel@b2da.loadDraftVideos$1$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L3f
            if (r0 != r2) goto L57
            java.lang.Object r2 = r5.LL
            X.C155000ia.LIZIZ(r6)
        L18:
            if (r6 == 0) goto L26
            com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftFeedViewModel r1 = r5.LLILLL
            androidx.lifecycle.MutableLiveData<X.1DWa> r0 = r1.LLILLJJLI
            r0.postValue(r6)
            androidx.lifecycle.MutableLiveData<java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel>> r0 = r1.LLILLL
            r0.postValue(r2)
        L26:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L2c:
            X.C155000ia.LIZIZ(r6)
            com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftFeedViewModel r0 = r5.LLILLL
            X.0CSn r0 = r0.LL
            r5.LLILLJJLI = r1
            java.lang.Object r6 = r0.LIZIZ(r5)
            if (r6 != r3) goto L42
            X.C1C7U.LIZIZ(r4)
            return r3
        L3f:
            X.C155000ia.LIZIZ(r6)
        L42:
            com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftFeedViewModel r0 = r5.LLILLL
            X.0CSn r0 = r0.LL
            r5.LL = r6
            r5.LLILLJJLI = r2
            X.1DWa r0 = r0.LIZ()
            if (r0 != r3) goto L54
            X.C1C7U.LIZIZ(r4)
            return r3
        L54:
            r2 = r6
            r6 = r0
            goto L18
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C313980CSm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
