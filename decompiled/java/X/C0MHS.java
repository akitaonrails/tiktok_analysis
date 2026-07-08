package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0MHS, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$startDownloadVideo$1$9", f = "ForwardOnThisDayEnvironment.kt", l = {}, m = "invokeSuspend")
public final class C0MHS extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super Pair<? extends C0MKE, ? extends CanvasVideoData>>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ InterfaceC346701Wf LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C259800zU<CreativeLoadingDialog> LLILLL;
    public final /* synthetic */ C259800zU<ProgressDialogC1399790mWv> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ ForwardMedia LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MHS(C259800zU<CreativeLoadingDialog> c259800zU, C259800zU<ProgressDialogC1399790mWv> c259800zU2, boolean z, long j, int i, String str, ForwardMedia forwardMedia, InterfaceC1364105Vn<? super C0MHS> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = c259800zU;
        this.LLILZ = c259800zU2;
        this.LLILZIL = z;
        this.LLILZLL = j;
        this.LLIZ = i;
        this.LLIZLLLIL = str;
        this.LLJ = forwardMedia;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ForwardOnThisDayEnvironment@5609.startDownloadVideo$1$9");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC346701Wf interfaceC346701Wf = this.LL;
        Throwable th = (Throwable) this.LLILLJJLI;
        CreativeLoadingDialog creativeLoadingDialog = this.LLILLL.element;
        if (creativeLoadingDialog != null) {
            C0MKJ.LIZ.getClass();
            creativeLoadingDialog.dismiss();
            C0MKJ.LIZJ(interfaceC346701Wf);
        }
        ProgressDialogC1399790mWv progressDialogC1399790mWv = this.LLILZ.element;
        if (progressDialogC1399790mWv != null) {
            C0MKJ.LIZ.getClass();
            C0FNV.LIZ(progressDialogC1399790mWv);
            C0MKJ.LIZJ(interfaceC346701Wf);
        }
        if (this.LLILZIL) {
            C0ML7 c0ml7 = C0ML7.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZLL;
            int i = this.LLIZ;
            String str = this.LLIZLLLIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th.getMessage());
            sbLIZ.append(" photo url: ");
            sbLIZ.append(C0MKZ.LIZ(this.LLJ));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c0ml7.getClass();
            C0ML7.LJIIJJI(1, 0, i, jCurrentTimeMillis, str, strLIZIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ForwardOnThisDayEnvironment@5609.startDownloadVideo$1$9");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super Pair<? extends C0MKE, ? extends CanvasVideoData>> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C0MHS c0mhs = new C0MHS(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c0mhs.LL = interfaceC346701Wf;
        c0mhs.LLILLJJLI = th;
        return c0mhs.invokeSuspend(Unit.LIZ);
    }
}
