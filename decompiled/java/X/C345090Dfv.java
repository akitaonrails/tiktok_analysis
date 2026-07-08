package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dfv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "dmt.av.video.record.RecordConditionCheck__RecordConditionCheckKt$optPreStorageCheck$1$dialog$1", f = "RecordConditionCheck.kt", l = {}, m = "invokeSuspend")
public final class C345090Dfv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CreativeLoadingDialog>, Object> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345090Dfv(Activity activity, long j, long j2, long j3, InterfaceC1364105Vn<? super C345090Dfv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = activity;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = j3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C345090Dfv(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19576911iZ c19576911iZ = C19576911iZ.LIZ;
        Activity activity = this.LL;
        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
        creativeLoadingDialogBuilder.showProgress(false);
        creativeLoadingDialogBuilder.loadingMessage(this.LL.getString(R.string.txr));
        creativeLoadingDialogBuilder.backCanCancel(false);
        creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE_AFTER_5S);
        creativeLoadingDialogBuilder.clickCancelListener(new C345100Dfw(this.LLILLJJLI, this.LLILLL, this.LLILZ));
        creativeLoadingDialogBuilder.cancelListener(new DialogInterface.OnCancelListener() { // from class: X.0Dfx
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C344950Dfh.LIZ = false;
            }
        });
        CreativeLoadingDialog creativeLoadingDialogCreateLoadingDialog = c19576911iZ.createLoadingDialog(activity, 1201, creativeLoadingDialogBuilder);
        ((CreativeDialogWrapper) creativeLoadingDialogCreateLoadingDialog).show();
        return creativeLoadingDialogCreateLoadingDialog;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CreativeLoadingDialog> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
