package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.ui.MusicDetailAwemeListFragment;
import com.ss.android.ugc.aweme.series.commonfeed.overlay.PaidContentOverlayV1;

/* JADX INFO: renamed from: X.0ma9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1401790ma9 extends AbstractC214823195h {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC214823195h
    public final int LJFF(int i) {
        switch (this.$t) {
            case 0:
                return LJFF$0(this, i);
            case 1:
                return LJFF$1(this, i);
            case 2:
                return LJFF$2(this, i);
            default:
                return super.LJFF(i);
        }
    }

    public C1401790ma9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int LJFF$0(C1401790ma9 c1401790ma9, int i) {
        try {
            int itemViewType = ((MusicDetailAwemeListFragment) c1401790ma9.l0).LLJJJJ.getItemViewType(i);
            if (itemViewType != 110005 && itemViewType != 110009 && itemViewType != 110010 && itemViewType != 110011) {
                if (itemViewType != 110006 && itemViewType != 110007 && itemViewType != 110008) {
                    if (itemViewType == 110003) {
                        return ((MusicDetailAwemeListFragment) c1401790ma9.l0).LLLLLLIL / MusicDetailAwemeListFragment.yS();
                    }
                    C1261230ivR c1261230ivR = ((MusicDetailAwemeListFragment) c1401790ma9.l0).LLJJJJ;
                    if (c1261230ivR.mShowFooter && i == c1261230ivR.getBasicItemCount()) {
                        return ((MusicDetailAwemeListFragment) c1401790ma9.l0).LLLLLLIL;
                    }
                    return ((MusicDetailAwemeListFragment) c1401790ma9.l0).LLLLLLIL / MusicDetailAwemeListFragment.yS();
                }
                return ((MusicDetailAwemeListFragment) c1401790ma9.l0).LLLLLLIL / 2;
            }
            return ((MusicDetailAwemeListFragment) c1401790ma9.l0).LLLLLLIL;
        } catch (ArrayIndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            return ((MusicDetailAwemeListFragment) c1401790ma9.l0).LLLLLLIL / 2;
        }
    }

    public static final int LJFF$1(C1401790ma9 c1401790ma9, int i) {
        if (((MusicDetailAwemeListFragment) c1401790ma9.l0).LLJJJJ.getItemViewType(i) == 110003) {
            return 1;
        }
        C1261230ivR c1261230ivR = ((MusicDetailAwemeListFragment) c1401790ma9.l0).LLJJJJ;
        if (!c1261230ivR.mShowFooter || i != c1261230ivR.getBasicItemCount()) {
            return 1;
        }
        return 3;
    }

    public static final int LJFF$2(C1401790ma9 c1401790ma9, int i) {
        int itemCount;
        C1387980mDs c1387980mDs = ((PaidContentOverlayV1) c1401790ma9.l0).LLJI;
        if (c1387980mDs != null) {
            itemCount = c1387980mDs.getItemCount();
        } else {
            itemCount = 0;
        }
        if (i == itemCount - 1 && itemCount % 2 != 0) {
            return 2;
        }
        return 1;
    }
}
