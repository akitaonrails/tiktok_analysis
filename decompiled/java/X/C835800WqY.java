package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0WqY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.web.jsbridge.UploadALogUtil$doUploadAllLogs$1$draftLogUri$1", f = "UploadALogUtil.kt", l = {140}, m = "invokeSuspend")
public final class C835800WqY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ C835770WqV LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C835800WqY(C835770WqV c835770WqV, InterfaceC1364105Vn<? super C835800WqY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c835770WqV;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C835800WqY(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("UploadALogUtil@5934.doUploadAllLogs$1$draftLogUri$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C835770WqV c835770WqV = this.LLILLJJLI;
            this.LL = 1;
            obj = c835770WqV.LJIIIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("UploadALogUtil@5934.doUploadAllLogs$1$draftLogUri$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("UploadALogUtil@5934.doUploadAllLogs$1$draftLogUri$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
