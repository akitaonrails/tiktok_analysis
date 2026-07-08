package X;

import android.content.DialogInterface;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment.SpaceFeedGuestSettingDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JtC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C506200JtC extends C09AY implements Function0<Unit> {
    public final /* synthetic */ DialogInterface LL;
    public final /* synthetic */ SpaceFeedGuestSettingDialogFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C506200JtC(LiveDialog liveDialog, SpaceFeedGuestSettingDialogFragment spaceFeedGuestSettingDialogFragment) {
        super(0);
        this.LL = liveDialog;
        this.LLILLJJLI = spaceFeedGuestSettingDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.dismiss();
        this.LLILLJJLI.dismissAllowingStateLoss();
        return Unit.LIZ;
    }
}
