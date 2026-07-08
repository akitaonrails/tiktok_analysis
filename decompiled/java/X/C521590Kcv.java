package X;

import com.bytedance.android.livesdk.feed.drawerfeed.DrawerFeedLiveFragmentV2;
import com.bytedance.android.livesdk.feed.drawerfeed.base.BaseDrawerFeedLiveFragment;
import com.bytedance.android.livesdk.feed.drawerfeed.search.result.LiveSearchContainerFragment;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.assem.GameDrawerCategoryFullDisplayAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Kcv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521590Kcv extends AbstractC214823195h {
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
            case 3:
                return LJFF$3(this, i);
            case 4:
                return LJFF$4(this, i);
            default:
                return super.LJFF(i);
        }
    }

    public C521590Kcv(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int LJFF$0(C521590Kcv c521590Kcv, int i) {
        Integer numValueOf;
        C471910Iez c471910Iez = ((LiveSearchContainerFragment) c521590Kcv.l0).LLILZ;
        if (c471910Iez != null && (numValueOf = Integer.valueOf(c471910Iez.getItemViewType(i))) != null) {
            if (numValueOf.intValue() == 2 || numValueOf.intValue() == 3) {
                return 2;
            }
            return 1;
        }
        return 1;
    }

    public static final int LJFF$1(C521590Kcv c521590Kcv, int i) {
        int itemCount;
        C476570ImV c476570ImV = ((GameDrawerCategoryFullDisplayAssem) c521590Kcv.l0).LLJJI;
        if (c476570ImV != null) {
            itemCount = c476570ImV.getItemCount();
        } else {
            itemCount = 0;
        }
        if (i != itemCount - 1) {
            return 1;
        }
        return 2;
    }

    public static final int LJFF$2(C521590Kcv c521590Kcv, int i) {
        InterfaceC483930IyN interfaceC483930IyN = (InterfaceC483930IyN) c521590Kcv.l0;
        if (interfaceC483930IyN == null || !interfaceC483930IyN.LJJJJLL() || i != interfaceC483930IyN.LJLJJL().getItemCount() - 1) {
            return 1;
        }
        return 2;
    }

    public static final int LJFF$3(C521590Kcv c521590Kcv, int i) {
        if (((DrawerFeedLiveFragmentV2) c521590Kcv.l0).LLILZ.getItemViewType(i) == R.layout.gqc) {
            return 1;
        }
        return 2;
    }

    public static final int LJFF$4(C521590Kcv c521590Kcv, int i) {
        Integer numValueOf;
        C470660Icy c470660Icy = ((BaseDrawerFeedLiveFragment) c521590Kcv.l0).LLIZ;
        if (c470660Icy != null && (numValueOf = Integer.valueOf(c470660Icy.getItemViewType(i))) != null && numValueOf.intValue() == R.layout.gqc) {
            return 1;
        }
        return 2;
    }
}
