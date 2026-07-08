package X;

import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService;

/* JADX INFO: renamed from: X.0ec8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1095500ec8 {
    public final FrameLayout LIZ;
    public final LifecycleOwner LIZIZ;
    public final ILiveGiftDelegatePlayerService LIZJ = (ILiveGiftDelegatePlayerService) C1161920gLG.LIZJ(ILiveGiftDelegatePlayerService.class);
    public Object LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    public C1095500ec8(FrameLayout frameLayout, LifecycleOwner lifecycleOwner) {
        String str;
        String str2;
        String str3;
        this.LIZ = frameLayout;
        this.LIZIZ = lifecycleOwner;
        if (C454590Hs9.LIZ(frameLayout.getContext())) {
            str = "tiktok_live_super_fans_resource";
        } else {
            str = "tiktok_live_fans_club_join_dialog";
        }
        this.LJ = str;
        if (C454590Hs9.LIZ(frameLayout.getContext())) {
            str2 = "ttlive_switch_to_super_fan_effect_rtl";
        } else {
            str2 = "ttlive_switch_to_super_fan_effect";
        }
        this.LJFF = str2;
        if (C454590Hs9.LIZ(frameLayout.getContext())) {
            str3 = "ttlive_switch_to_fans_club_effect_rtl";
        } else {
            str3 = "ttlive_switch_to_fans_club_effect";
        }
        this.LJI = str3;
    }
}
