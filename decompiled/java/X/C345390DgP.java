package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DgP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.audiodownload.progress.TTSProgressHelper$show$1", f = "TTSProgressHelper.kt", l = {}, m = "invokeSuspend")
public final class C345390DgP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ C345410DgR LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345390DgP(Context context, C345410DgR c345410DgR, InterfaceC1364105Vn<? super C345390DgP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = c345410DgR;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C345390DgP(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSProgressHelper@83e9.show$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TTSProgressHelper@83e9.show$1");
            return unit;
        }
        CreativeDialogWrapper creativeDialogWrapper = this.LLILLJJLI.LIZ;
        if (creativeDialogWrapper != null) {
            creativeDialogWrapper.dismiss();
        }
        C345410DgR c345410DgR = this.LLILLJJLI;
        C19576911iZ c19576911iZ = C19576911iZ.LIZ;
        Context context = this.LL;
        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
        creativeLoadingDialogBuilder.showProgress(false);
        creativeLoadingDialogBuilder.backCanCancel(true);
        creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.GONE);
        creativeLoadingDialogBuilder.loadingMessage(this.LL.getString(2131850135));
        CreativeDialogWrapper creativeDialogWrapper2 = (CreativeDialogWrapper) c19576911iZ.createLoadingDialog(context, 1111, creativeLoadingDialogBuilder);
        creativeDialogWrapper2.show();
        c345410DgR.LIZ = creativeDialogWrapper2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C345410DgR.LIZLLL);
        sbLIZ.append("loading dialog show");
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TTSProgressHelper@83e9.show$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
