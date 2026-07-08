package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0MLP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.component.OnThisDayUnifiedPublishComponent$publish$1$4", f = "OnThisDayUnifiedPublishComponent.kt", l = {}, m = "invokeSuspend")
public final class C0MLP extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super Pair<? extends C0MKE, ? extends CanvasVideoData>>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CreativeLoadingDialog LLILLJJLI;
    public final /* synthetic */ C0MLM LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MLP(CreativeLoadingDialog creativeLoadingDialog, C0MLM c0mlm, long j, int i, String str, InterfaceC1364105Vn<? super C0MLP> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = creativeLoadingDialog;
        this.LLILLL = c0mlm;
        this.LLILZ = j;
        this.LLILZIL = i;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OnThisDayUnifiedPublishComponent@4f3.publish$1$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Throwable th = (Throwable) this.LL;
        this.LLILLJJLI.dismiss();
        Activity activity = this.LLILLL.W2().mActivity;
        if (activity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(R.string.m25);
            c1389890mGx.LJIIJJI();
        }
        C0ML7 c0ml7 = C0ML7.LIZ;
        long jX1 = this.LLILLL.X1(this.LLILZ);
        int i = this.LLILZIL;
        String str = this.LLILZLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(th.getMessage());
        sbLIZ.append(" single photo");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c0ml7.getClass();
        C0ML7.LJIIJJI(1, 0, i, jX1, str, strLIZIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OnThisDayUnifiedPublishComponent@4f3.publish$1$4");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super Pair<? extends C0MKE, ? extends CanvasVideoData>> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C0MLP c0mlp = new C0MLP(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c0mlp.LL = th;
        return c0mlp.invokeSuspend(Unit.LIZ);
    }
}
