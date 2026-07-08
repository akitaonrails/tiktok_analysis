package X;

import com.bytedance.android.livesdk.gift.model.GiftChallengeProgress;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model.GiftRandomEffectInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.List;

/* JADX INFO: renamed from: X.0fRe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127440fRe {
    public GiftPanelBanner LIZ;
    public GiftPanelBanner LIZIZ;
    public GiftRandomEffectInfo LIZJ;
    public List<GiftColorInfo> LIZLLL;
    public Gift.ColorPickerInfo LJ;
    public long LJFF;
    public long LJI;
    public C1127920fSQ LJII;
    public Gift LJIIIIZZ;
    public GiftPanelBanner LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public C1127900fSO LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public boolean LJJII;
    public GiftPanelBanner LJJIII;
    public boolean LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public Room LJJIIZI;

    /* JADX WARN: Removed duplicated region for block: B:35:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ() {
        /*
            r5 = this;
            com.bytedance.android.livesdk.model.Gift r0 = r5.LJIIIIZZ
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L43
            com.bytedance.android.livesdk.model.Gift$ColorPickerInfo r0 = r0.colorPickerInfo
            if (r0 == 0) goto L43
            java.util.List<com.bytedance.android.livesdk.model.Gift$ColorGroup> r1 = r0.groups
            if (r1 == 0) goto L43
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L43
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r0 = r1.next()
            com.bytedance.android.livesdk.model.Gift$ColorGroup r0 = (com.bytedance.android.livesdk.model.Gift.ColorGroup) r0
            java.util.List<com.bytedance.android.livesdk.gift.model.GiftColorInfo> r0 = r0.colorInfos
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L18
            r3 = 1
        L2f:
            java.util.List<com.bytedance.android.livesdk.gift.model.GiftColorInfo> r1 = r5.LIZLLL
            if (r1 == 0) goto L3f
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L3f
            int r0 = r1.size()
            if (r0 > r2) goto L42
        L3f:
            if (r3 != 0) goto L42
            r2 = 0
        L42:
            return r2
        L43:
            r3 = 0
            com.bytedance.android.livesdk.model.Gift r0 = r5.LJIIIIZZ
            if (r0 == 0) goto L2f
            boolean r0 = r0.LIZJ()
            if (r0 != r2) goto L2f
            com.bytedance.android.livesdk.model.Gift r0 = r5.LJIIIIZZ
            r1 = 0
            if (r0 == 0) goto L2f
            com.bytedance.android.livesdk.model.GiftPanelBanner r0 = r0.giftPanelBanner
            if (r0 == 0) goto L2f
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r5.LJJIIZI
            if (r0 == 0) goto L5f
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r1 = r0.getStreamType()
        L5f:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO
            if (r1 != r0) goto L2f
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1127440fRe.LIZIZ():boolean");
    }

    public final boolean LIZ(GiftChallengeProgress giftChallengeProgress, boolean z) {
        GiftPanelBanner giftPanelBanner;
        String str;
        if (!z && giftChallengeProgress != null) {
            if ((giftChallengeProgress.status == 1 || giftChallengeProgress.status == 2 || giftChallengeProgress.status == 3) && (giftPanelBanner = this.LIZ) != null && giftPanelBanner.bannerLynxExtra != null && giftPanelBanner != null && (str = giftPanelBanner.bannerLynxExtra) != null && str.length() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
