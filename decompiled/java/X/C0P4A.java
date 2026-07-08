package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.emojideatil.BulletinEmojiDetailViewViewpagerAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinEmojiDetailFragmentData;
import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitHorizontalCardAssem;
import java.util.List;

/* JADX INFO: renamed from: X.0P4A, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4A extends AbstractC712240Rwk {
    public final int $t;
    public Object l0;

    public static final void onPageScrolled$0(C0P4A c0p4a, int i, float f, int i2) {
    }

    public static final void onPageSelected$0(C0P4A c0p4a, int i) {
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrollStateChanged(int i) {
        if (this.$t != 0) {
            super.onPageScrollStateChanged(i);
        } else {
            onPageScrollStateChanged$0(this, i);
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrolled(int i, float f, int i2) {
        if (this.$t != 0) {
            super.onPageScrolled(i, f, i2);
        } else {
            onPageScrolled$0(this, i, f, i2);
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
            default:
                super.onPageSelected(i);
                break;
        }
    }

    public C0P4A(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$0(C0P4A c0p4a, int i) {
        if (i == 0) {
            ((PoiRevisitHorizontalCardAssem) c0p4a.l0).LLJJIJIIJIL = false;
        }
    }

    public static final void onPageSelected$1(C0P4A c0p4a, int i) {
        BulletinEmojiDetailFragmentData bulletinEmojiDetailFragmentData;
        String str;
        List<BulletinEmojiDetailFragmentData> list;
        BulletinEmojiDetailFragmentData bulletinEmojiDetailFragmentData2;
        BulletinEmojiDetailViewViewpagerAssem bulletinEmojiDetailViewViewpagerAssem = (BulletinEmojiDetailViewViewpagerAssem) c0p4a.l0;
        if (bulletinEmojiDetailViewViewpagerAssem.LLJILJILJ) {
            bulletinEmojiDetailViewViewpagerAssem.LLJILJILJ = false;
            if (bulletinEmojiDetailViewViewpagerAssem.LLJILLL && (list = bulletinEmojiDetailViewViewpagerAssem.LLJJI) != null && (bulletinEmojiDetailFragmentData2 = (BulletinEmojiDetailFragmentData) ListProtector.get(list, i)) != null && bulletinEmojiDetailFragmentData2.tabType == 1) {
                ((BulletinEmojiDetailViewViewpagerAssem) c0p4a.l0).Lo("default_tab");
                ((BulletinEmojiDetailViewViewpagerAssem) c0p4a.l0).LLJJ = false;
                return;
            }
            return;
        }
        List<BulletinEmojiDetailFragmentData> list2 = bulletinEmojiDetailViewViewpagerAssem.LLJJI;
        if (list2 == null || (bulletinEmojiDetailFragmentData = (BulletinEmojiDetailFragmentData) ListProtector.get(list2, i)) == null || bulletinEmojiDetailFragmentData.tabType != 1) {
            return;
        }
        BulletinEmojiDetailViewViewpagerAssem bulletinEmojiDetailViewViewpagerAssem2 = (BulletinEmojiDetailViewViewpagerAssem) c0p4a.l0;
        if (bulletinEmojiDetailViewViewpagerAssem2.LLJJ) {
            str = "click_tab";
        } else {
            str = "slide";
        }
        bulletinEmojiDetailViewViewpagerAssem2.Lo(str);
        ((BulletinEmojiDetailViewViewpagerAssem) c0p4a.l0).LLJJ = false;
    }
}
