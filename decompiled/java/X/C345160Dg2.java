package X;

import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dg2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mediaselector.mediahandler.preprocess.MediaPreProcessManager$processBeforeOnChosenResult$exceptionHandler$1$1", f = "MediaPreProcessManager.kt", l = {}, m = "invokeSuspend")
public final class C345160Dg2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CreativeLoadingDialog LL;
    public final /* synthetic */ Throwable LLILLJJLI;
    public final /* synthetic */ C1DRG LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345160Dg2(CreativeLoadingDialog creativeLoadingDialog, Throwable th, C1DRG c1drg, InterfaceC1364105Vn<? super C345160Dg2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = creativeLoadingDialog;
        this.LLILLJJLI = th;
        this.LLILLL = c1drg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C345160Dg2(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaPreProcessManager@9e45.processBeforeOnChosenResult$exceptionHandler$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CreativeLoadingDialog creativeLoadingDialog = this.LL;
        if (creativeLoadingDialog != null) {
            creativeLoadingDialog.dismiss();
        }
        InterfaceC345200Dg6 causer = ((C345190Dg5) this.LLILLJJLI).getCauser();
        C1DRG c1drg = this.LLILLL;
        ((C345190Dg5) this.LLILLJJLI).getReason();
        causer.LIZIZ(c1drg);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaPreProcessManager@9e45.processBeforeOnChosenResult$exceptionHandler$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
