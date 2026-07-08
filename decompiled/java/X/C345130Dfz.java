package X;

import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dfz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mediaselector.mediahandler.preprocess.MediaPreProcessManager$processBeforeOnChosenResult$1$2", f = "MediaPreProcessManager.kt", l = {}, m = "invokeSuspend")
public final class C345130Dfz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CreativeLoadingDialog LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345130Dfz(CreativeLoadingDialog creativeLoadingDialog, C013C c013c, Function0<Unit> function0, InterfaceC1364105Vn<? super C345130Dfz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = creativeLoadingDialog;
        this.LLILLJJLI = c013c;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C345130Dfz(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaPreProcessManager@9e45.processBeforeOnChosenResult$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CreativeLoadingDialog creativeLoadingDialog = this.LL;
        if (creativeLoadingDialog != null) {
            creativeLoadingDialog.dismiss();
        }
        if (this.LLILLJJLI.element) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MediaPreProcessManager@9e45.processBeforeOnChosenResult$1$2");
            return unit;
        }
        this.LLILLL.invoke();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MediaPreProcessManager@9e45.processBeforeOnChosenResult$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
