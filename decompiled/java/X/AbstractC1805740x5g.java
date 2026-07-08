package X;

import com.bytedance.android.live.gift.IGiftService;

/* JADX INFO: renamed from: X.0x5g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1805740x5g extends AbstractC1805960x62 {
    public final void LIZJ() {
        LIZ("recharge_live_scene", ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getRoomStatus());
    }

    public AbstractC1805740x5g(String str) {
        super(str);
    }

    public final void LIZLLL(int i, boolean z) {
        String str;
        if (i != 1 && i != 2) {
            if (i != 4 && i != 5) {
                str = "";
            } else if (z) {
                str = "bind_n_auth";
            } else {
                str = "only_bind";
            }
        } else {
            str = "only_auth";
        }
        LIZ("bind_type", str);
    }
}
