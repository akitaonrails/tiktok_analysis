package X;

import android.widget.PopupWindow;
import androidx.lifecycle.LifecycleKt;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.topguide.CreatorCareModePopView;

/* JADX INFO: renamed from: X.100i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("comment_creator_care_mode_top_guide")
public final class C191762100i extends AbstractC20660015ss<PopupWindow> {
    public final C19EG LL;
    public final EnumC1620106Vz LLILLJJLI;
    public final int LLILLL = 8002;

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        return true;
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        if (c19eg != null) {
            return new C688120Qyw(c19eg, c19eg, null);
        }
        return null;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILLL;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        if (this.LL == null) {
            return null;
        }
        CreatorCareModePopView creatorCareModePopView = new CreatorCareModePopView(this.LL, getStateWrapper(), this.LLILLJJLI);
        int i = C06W1.LIZ[creatorCareModePopView.LLILLL.ordinal()];
        if (i != 1 && i != 2) {
            creatorCareModePopView.LJJIIJZLJL();
            return creatorCareModePopView;
        }
        C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(creatorCareModePopView.LLIZLLLIL.getLifecycle()), C0PEM.LIZJ, null, new C05D6(500, creatorCareModePopView, null), 2);
        return creatorCareModePopView;
    }

    public C191762100i(C19EG c19eg, EnumC1620106Vz enumC1620106Vz) {
        this.LL = c19eg;
        this.LLILLJJLI = enumC1620106Vz;
    }

    @Override // X.AbstractC20656215sG
    public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
        super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
    }
}
