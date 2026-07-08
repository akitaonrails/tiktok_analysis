package X;

import android.widget.CompoundButton;
import androidx.lifecycle.LifecycleKt;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingPanelDialog;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingViewModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.moderator.ui.LiveModeratorCell;

/* JADX INFO: renamed from: X.0yck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864680yck implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                break;
        }
    }

    public C1864680yck(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(C1864680yck c1864680yck, CompoundButton compoundButton, boolean z) {
        String str;
        AutoPostLivingViewModel autoPostLivingViewModelUS = ((AutoPostLivingPanelDialog) c1864680yck.l0).uS();
        if (z) {
            str = "auto_post_open";
        } else {
            str = "auto_post_close";
        }
        autoPostLivingViewModelUS.vQ2(new C1777310wLp(null, str));
        ((AutoPostLivingPanelDialog) c1864680yck.l0).uS().vQ2(new C1777250wLj(z));
    }

    public static final void onCheckedChanged$1(C1864680yck c1864680yck, CompoundButton compoundButton, boolean z) {
        LiveModeratorCell liveModeratorCell = (LiveModeratorCell) c1864680yck.l0;
        C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(liveModeratorCell.getLifecycle()), null, null, new C1819420xRk(liveModeratorCell, z, compoundButton, null), 3);
    }

    public static final void onCheckedChanged$2(C1864680yck c1864680yck, CompoundButton compoundButton, boolean z) {
        ((C013C) c1864680yck.l0).element = z;
    }

    public static final void onCheckedChanged$3(C1864680yck c1864680yck, CompoundButton compoundButton, boolean z) {
        LiveModeratorCell liveModeratorCell = (LiveModeratorCell) c1864680yck.l0;
        C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(liveModeratorCell.getLifecycle()), null, null, new C1819420xRk(liveModeratorCell, z, compoundButton, null), 3);
    }
}
