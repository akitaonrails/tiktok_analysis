package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.multihost.biz.link.viewbinder.randomlinkmic.InteractRandomLinkMicLargeViewBinder;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bnc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987300bnc extends C0IYA {
    public final int $t;
    public Object l0;

    @Override // X.C0IYA, X.InterfaceC1142670fqD
    public final void LIZLLL(String str, Exception exc) {
        if (1 - this.$t != 0) {
            super.LIZLLL(str, exc);
        } else {
            LIZLLL$0(this, str, exc);
        }
    }

    @Override // X.C0IYA
    public final void LJ(boolean z) {
        switch (this.$t) {
            case 0:
                LJ$0(this, z);
                break;
            case 1:
            default:
                super.LJ(z);
                break;
            case 2:
                LJ$1(this, z);
                break;
            case 3:
                LJ$2(this, z);
                break;
        }
    }

    public C987300bnc(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJ$0(C987300bnc c987300bnc, boolean z) {
        if (!z) {
            ((C1324720kZq) c987300bnc.l0).setBackgroundResource(R.drawable.el_);
        }
    }

    public static final void LJ$1(C987300bnc c987300bnc, boolean z) {
        if (!z) {
            ((C1324720kZq) c987300bnc.l0).setBackgroundResource(R.drawable.el_);
        }
    }

    public static final void LJ$2(C987300bnc c987300bnc, boolean z) {
        if (!z) {
            ((C1324720kZq) c987300bnc.l0).setBackgroundResource(R.drawable.el_);
        }
    }

    public static final void LIZLLL$0(C987300bnc c987300bnc, String str, Exception exc) {
        ((InteractRandomLinkMicLargeViewBinder.InteractRandomLinkMicLargeViewHolder) c987300bnc.l0).getClass();
        C20441214yg.LJIILIIL("InteractRandomLinkMicLargeViewHolder", "loadRivalAvatarRippleGraphic failed channel=tiktok_live_interaction_demand_19 file=ttlive_bg_random_linkmic_rival_avatar_ripple.png, fallback to channel=tiktok_live_interaction_normal_1 file=ttlive_bg_random_linkmic_rival_avatar.png", exc);
        C1143680frq.LIZLLL((View) ((InteractRandomLinkMicLargeViewBinder.InteractRandomLinkMicLargeViewHolder) c987300bnc.l0).LLLII.getValue(), "tiktok_live_interaction_normal_1", "ttlive_bg_random_linkmic_rival_avatar.png");
    }
}
