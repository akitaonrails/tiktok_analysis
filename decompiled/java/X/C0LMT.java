package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import njp.a;

/* JADX INFO: renamed from: X.0LMT, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.CreationDownloadTaskKt$downloadFile$2", f = "CreationDownloadTask.kt", l = {234}, m = "invokeSuspend")
public final class C0LMT extends C09AX implements Function2<C094D<? super C0LMR>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LMT(String str, String str2, String str3, InterfaceC1364105Vn<? super C0LMT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0LMT c0lmt = new C0LMT(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0lmt.LLILLJJLI = obj;
        return c0lmt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationDownloadTaskKt@6565.downloadFile$2");
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
            final C094D c094d = (C094D) this.LLILLJJLI;
            InterfaceC1385405bY interfaceC1385405bYLIZLLL = C0CHQ.LIZ().LIZLLL();
            final String str = this.LLILLL;
            interfaceC1385405bYLIZLLL.downloadFile(str, this.LLILZ, this.LLILZIL, 3, new C13UW() { // from class: X.0LMU
                public int LIZ = -1;
                public long LIZIZ = -1;
                public long LIZJ = -1;

                @Override // X.C13UW
                public final void LIZJ() {
                    this.LIZ = 0;
                    c094d.LJIIIIZZ(new C0LMR(C0LBD.ON_START, 0, null, null, null, 0L, 62));
                }

                @Override // X.C13UW
                public final void LIZLLL(String str2, String str3) {
                    this.LIZ = 100;
                    c094d.LJIIIIZZ(new C0LMR(C0LBD.ON_SUCCESS, 100, str3, null, null, 0L, 56));
                    c094d.LJIIJJI(null);
                }

                @Override // X.C13UW
                public final void LIZ(Exception exc, Integer num, String str2) {
                    String message;
                    C094D<C0LMR> c094d2 = c094d;
                    C0LBD c0lbd = C0LBD.ON_FAIL;
                    int i2 = this.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("url=");
                    sbLIZ.append(str);
                    sbLIZ.append(", errorMsg=");
                    sbLIZ.append(str2);
                    sbLIZ.append(", progress=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", cacheSize=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", totalSize=");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(", exception=");
                    if (exc != null) {
                        message = exc.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ.append(message);
                    c094d2.LJIIIIZZ(new C0LMR(c0lbd, i2, "", num, C2188811AlT.LIZIZ(sbLIZ), 0L, 32));
                    this.LIZ = 0;
                    this.LIZIZ = 0L;
                    this.LIZJ = 0L;
                    c094d.LJIIJJI(null);
                }

                @Override // X.C13UW
                public final void LIZIZ(int i2, long j, long j2) {
                    this.LIZ = i2;
                    this.LIZIZ = j;
                    this.LIZJ = j2;
                    c094d.LJIIIIZZ(new C0LMR(C0LBD.ON_PROGRESS, i2, null, null, null, 0L, 60));
                }
            });
            AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(51);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS194S0000000_8, this) == objLJFF) {
                C1C7U.LIZIZ("CreationDownloadTaskKt@6565.downloadFile$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreationDownloadTaskKt@6565.downloadFile$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super C0LMR> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
