package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.09ZX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.debug.server.HttpServerResponseFile$responseWithFile$externalCoreJS$1", f = "HttpServerResponseFile.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C09ZX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;

    public C09ZX(InterfaceC1364105Vn<? super C09ZX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09ZX(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("HttpServerResponseFile@bd25.responseWithFile$externalCoreJS$1");
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
            final C099F c099fLIZIZ = C090F.LIZIZ();
            C09ZS c09zs = C09ZS.LIZ;
            C09ZV c09zv = new C09ZV() { // from class: X.09ZY
                @Override // X.C09ZV
                public final void LIZIZ(String str) {
                }

                @Override // X.C09ZV
                public final void LIZ(String str) {
                    c099fLIZIZ.LJIIZILJ(str);
                }
            };
            c09zs.getClass();
            C09ZS.LJ(c09zv);
            this.LL = 1;
            obj = c099fLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("HttpServerResponseFile@bd25.responseWithFile$externalCoreJS$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("HttpServerResponseFile@bd25.responseWithFile$externalCoreJS$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return new C09ZX(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
