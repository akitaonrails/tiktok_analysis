package X;

import android.content.DialogInterface;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment.DetailSettingDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JsI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C505640JsI extends C09AY implements Function0<Unit> {
    public final /* synthetic */ DialogInterface LL;
    public final /* synthetic */ DetailSettingDialogFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C505640JsI(LiveDialog liveDialog, DetailSettingDialogFragment detailSettingDialogFragment) {
        super(0);
        this.LL = liveDialog;
        this.LLILLJJLI = detailSettingDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.dismiss();
        this.LLILLJJLI.dismissAllowingStateLoss();
        C766270U4b.LIZLLL(2131844296);
        return Unit.LIZ;
    }
}
