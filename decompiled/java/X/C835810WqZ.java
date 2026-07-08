package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0WqZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.web.jsbridge.UploadALogUtil$doUploadAllLogs$1$abMockConfigUri$1", f = "UploadALogUtil.kt", l = {}, m = "invokeSuspend")
public final class C835810WqZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ C835770WqV LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C835810WqZ(C835770WqV c835770WqV, InterfaceC1364105Vn<? super C835810WqZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c835770WqV;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C835810WqZ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("UploadALogUtil@5934.doUploadAllLogs$1$abMockConfigUri$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        String strLJIIIIZZ = C835770WqV.LJIIIIZZ();
        C1C7U.LIZIZ("UploadALogUtil@5934.doUploadAllLogs$1$abMockConfigUri$1");
        return strLJIIIIZZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
