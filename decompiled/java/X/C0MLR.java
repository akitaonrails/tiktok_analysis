package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0MLR, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.component.OnThisDayUnifiedPublishComponent$publish$1$6", f = "OnThisDayUnifiedPublishComponent.kt", l = {}, m = "invokeSuspend")
public final class C0MLR extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super C0MKG>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CreativeLoadingDialog LLILLJJLI;
    public final /* synthetic */ C0MLM LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MLR(CreativeLoadingDialog creativeLoadingDialog, C0MLM c0mlm, long j, String str, InterfaceC1364105Vn<? super C0MLR> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = creativeLoadingDialog;
        this.LLILLL = c0mlm;
        this.LLILZ = j;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OnThisDayUnifiedPublishComponent@4f3.publish$1$6");
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
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(th.getMessage());
        sbLIZ.append(" video");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c0ml7.getClass();
        C0ML7.LJIIJJI(1, 1, 0, jX1, str, strLIZIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OnThisDayUnifiedPublishComponent@4f3.publish$1$6");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super C0MKG> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C0MLR c0mlr = new C0MLR(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0mlr.LL = th;
        return c0mlr.invokeSuspend(Unit.LIZ);
    }
}
