package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS587S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0Kxc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mediaselector.mediahandler.preprocess.DownloadLiveRecordingsVideoTask$process$2", f = "DownloadLiveRecordingsVideoTask.kt", l = {}, m = "invokeSuspend")
public final class C534420Kxc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<CreativeLoadingDialog> LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ C534440Kxe LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C534420Kxc(C259800zU<CreativeLoadingDialog> c259800zU, Context context, C534440Kxe c534440Kxe, InterfaceC1364105Vn<? super C534420Kxc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = context;
        this.LLILLL = c534440Kxe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C534420Kxc(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        Resources resources;
        C1C7U.LIZ("DownloadLiveRecordingsVideoTask@7993.process$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C259800zU<CreativeLoadingDialog> c259800zU = this.LL;
        C19576911iZ c19576911iZ = C19576911iZ.LIZ;
        Context context = this.LLILLJJLI;
        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
        creativeLoadingDialogBuilder.showProgress(true);
        creativeLoadingDialogBuilder.backCanCancel(false);
        creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE_AFTER_5S);
        Context context2 = this.LLILLL.LIZ;
        if (context2 == null || (resources = context2.getResources()) == null || (string = resources.getString(2131853553)) == null) {
            string = "Preparing...";
        }
        creativeLoadingDialogBuilder.loadingMessage(string);
        creativeLoadingDialogBuilder.clickCancelListener(new AwS587S0100000_8(this.LLILLL, 638));
        creativeLoadingDialogBuilder.dismissListener(new DialogInterface.OnDismissListener() { // from class: X.0Kxd
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
            }
        });
        c259800zU.element = c19576911iZ.createLoadingDialog(context, 1203, creativeLoadingDialogBuilder);
        this.LL.element.delayShow(500L);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DownloadLiveRecordingsVideoTask@7993.process$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
