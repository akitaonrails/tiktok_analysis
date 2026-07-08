package X;

import android.content.DialogInterface;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment.SpaceFeedGuestSettingDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jt8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C506160Jt8 extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ SpaceFeedGuestSettingDialogFragment LL;
    public final /* synthetic */ DialogInterface LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C506160Jt8(LiveDialog liveDialog, SpaceFeedGuestSettingDialogFragment spaceFeedGuestSettingDialogFragment) {
        super(1);
        this.LL = spaceFeedGuestSettingDialogFragment;
        this.LLILLJJLI = liveDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        C501540Jlg.LIZJ(this.LL.getContext(), th);
        this.LLILLJJLI.dismiss();
        return Unit.LIZ;
    }
}
