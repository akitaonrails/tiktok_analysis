package X;

import com.ss.android.ugc.aweme.minis.page.main.functions.guide.GameAddLauncherNoticeControl;
import com.ss.android.ugc.aweme.minis.page.main.functions.guide.MinisAddShortCutFloatingNoticeAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.page.main.functions.guide.MinisAddShortCutFloatingNoticeAssem$autoDismissToast$1$1", f = "MinisAddShortCutFloatingNoticeAssem.kt", l = {155}, m = "invokeSuspend")
public final class C604720Nni extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MinisAddShortCutFloatingNoticeAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C604720Nni(MinisAddShortCutFloatingNoticeAssem minisAddShortCutFloatingNoticeAssem, InterfaceC1364105Vn<? super C604720Nni> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = minisAddShortCutFloatingNoticeAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C604720Nni(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisAddShortCutFloatingNoticeAssem@5824.autoDismissToast$1$1");
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
            long j = ((GameAddLauncherNoticeControl) this.LLILLJJLI.LLILLJJLI.getValue()).floatingNoticeDuration;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("MinisAddShortCutFloatingNoticeAssem@5824.autoDismissToast$1$1");
                return objLJFF;
            }
        }
        MinisAddShortCutFloatingNoticeAssem minisAddShortCutFloatingNoticeAssem = this.LLILLJJLI;
        C20515215Pi c20515215Pi = minisAddShortCutFloatingNoticeAssem.LL;
        if (c20515215Pi != null) {
            c20515215Pi.LIZIZ();
        }
        minisAddShortCutFloatingNoticeAssem.LLILZIL = false;
        minisAddShortCutFloatingNoticeAssem.LL = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MinisAddShortCutFloatingNoticeAssem@5824.autoDismissToast$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
