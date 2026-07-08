package X;

import com.ss.android.ugc.aweme.base.ui.bottom.banner.FeedBottomBannerView;
import com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0SMb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC719990SMb {
    public static final int LIZ;

    public abstract int LIZ(C720110SMn c720110SMn, C0SN7 c0sn7, C0SN7 c0sn72, int i);

    public abstract int LIZIZ(C720110SMn c720110SMn);

    public abstract int LIZJ(C0SFT c0sft);

    public abstract int LIZLLL(C720110SMn c720110SMn, int i, int i2, int i3, int i4, float f);

    public abstract int LJ(C0SFT c0sft);

    static {
        Pair<Integer, Integer> pair = FeedBottomBannerView.LLJJIJIIJIL;
        LIZ = FeedBottomBannerView.LLJJIJIIJIL.getFirst().intValue();
    }

    public static FeedContentLayoutInfo LJFF(int i, C0SN7 c0sn7, C0SN7 c0sn72, int i2, int i3) {
        return new FeedContentLayoutInfo(c0sn7.LIZIZ, c0sn72.LIZIZ, c0sn72.LIZLLL, i2, c0sn7.LIZ() + c0sn72.LIZ(), i, i3, c0sn7.LIZJ, c0sn72.LIZJ, 3584);
    }
}
