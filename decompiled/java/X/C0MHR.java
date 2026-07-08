package X;

import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0MHR, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$startDownloadVideo$1$11", f = "ForwardOnThisDayEnvironment.kt", l = {}, m = "invokeSuspend")
public final class C0MHR extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super C0MKG>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ InterfaceC346701Wf LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ ForwardMedia LLILZLL;
    public final /* synthetic */ C259800zU<CreativeLoadingDialog> LLIZ;
    public final /* synthetic */ C259800zU<ProgressDialogC1399790mWv> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MHR(boolean z, long j, String str, ForwardMedia forwardMedia, C259800zU<CreativeLoadingDialog> c259800zU, C259800zU<ProgressDialogC1399790mWv> c259800zU2, InterfaceC1364105Vn<? super C0MHR> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = j;
        this.LLILZIL = str;
        this.LLILZLL = forwardMedia;
        this.LLIZ = c259800zU;
        this.LLIZLLLIL = c259800zU2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ForwardOnThisDayEnvironment@5609.startDownloadVideo$1$11");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC346701Wf interfaceC346701Wf = this.LL;
        Throwable th = (Throwable) this.LLILLJJLI;
        C201955140j.LJIIJ(C1429810nJL.LIZIZ, "prepare video failed", th);
        if (this.LLILLL) {
            C0ML7 c0ml7 = C0ML7.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZ;
            String str = this.LLILZIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th.getMessage());
            sbLIZ.append(" video url: ");
            sbLIZ.append(C0MKZ.LIZJ(this.LLILZLL));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c0ml7.getClass();
            C0ML7.LJIIJJI(1, 1, 0, jCurrentTimeMillis, str, strLIZIZ);
        }
        CreativeLoadingDialog creativeLoadingDialog = this.LLIZ.element;
        if (creativeLoadingDialog != null) {
            C0MKJ.LIZ.getClass();
            creativeLoadingDialog.dismiss();
            C0MKJ.LIZJ(interfaceC346701Wf);
        }
        ProgressDialogC1399790mWv progressDialogC1399790mWv = this.LLIZLLLIL.element;
        if (progressDialogC1399790mWv != null) {
            C0MKJ.LIZ.getClass();
            C0FNV.LIZ(progressDialogC1399790mWv);
            C0MKJ.LIZJ(interfaceC346701Wf);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ForwardOnThisDayEnvironment@5609.startDownloadVideo$1$11");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super C0MKG> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C0MHR c0mhr = new C0MHR(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c0mhr.LL = interfaceC346701Wf;
        c0mhr.LLILLJJLI = th;
        return c0mhr.invokeSuspend(Unit.LIZ);
    }
}
