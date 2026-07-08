package X;

import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS7S0203000_9;

/* JADX INFO: renamed from: X.1Cle, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239881Cle implements InterfaceC1499080p74 {
    public C1499070p73 LIZ;
    public C0SZ8 LIZIZ;
    public int LJ;
    public final Map<Integer, IPhotoSlidesEventDispatchAbility> LIZJ = new LinkedHashMap();
    public final HashMap<String, HashSet<Integer>> LIZLLL = new HashMap<>();
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS578S0100000_34(this, 56));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS578S0100000_34(this, 55));
    public final C2239951Cll LJII = new InterfaceC469360Ias() { // from class: X.1Cll
        @Override // X.InterfaceC469360Ias
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // X.InterfaceC469360Ias
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // X.InterfaceC469360Ias
        public final void onPageSelected(int i) {
            this.LL.LIZJ(i);
        }
    };

    @Override // X.InterfaceC1499080p74
    public final void LIZ() {
        ((LinkedHashMap) this.LIZJ).clear();
    }

    @Override // X.InterfaceC1499080p74
    public final void LIZIZ(C1499070p73 c1499070p73) {
        this.LIZ = c1499070p73;
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJFF.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new C1D17(this, 2));
        }
    }

    public final void LIZJ(int i) {
        List<Aweme> listFg;
        Aweme aweme;
        int size;
        List<PhotoModeImageUrlModel> imageList;
        int i2 = this.LJ;
        C0SR4 c0sr4 = (C0SR4) this.LJI.getValue();
        if (c0sr4 != null && (listFg = c0sr4.Fg()) != null && (aweme = (Aweme) C13LP.LJJJLZIJ(i2, listFg)) != null && aweme.getAid() != null && AwemeExtKt.isPhotoMode(aweme)) {
            int i3 = i + 2;
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                size = imageList.size();
            } else {
                size = 0;
            }
            int iMin = Math.min(size, i + C2239941Clk.LIZ().horizontalLoadCount);
            if (iMin < i3) {
                return;
            }
            while (i3 < iMin) {
                LIZLLL(this.LJ, i3, 0, aweme);
                i3++;
            }
        }
    }

    public final void LIZLLL(int i, int i2, int i3, Aweme aweme) {
        String str;
        if (aweme == null) {
            return;
        }
        HashSet<Integer> hashSet = this.LIZLLL.get(aweme.getAid());
        if (hashSet != null && hashSet.contains(Integer.valueOf(i2))) {
            return;
        }
        C1EE2 c1ee2 = C1EE2.LIZIZ;
        C1499070p73 c1499070p73 = this.LIZ;
        if (c1499070p73 != null) {
            str = c1499070p73.LIZIZ;
        } else {
            str = null;
        }
        C844470XAv.LIZ.getClass();
        c1ee2.LJJIIZ(str, C844470XAv.LIZ(), aweme, i2, EnumC1334360kpO.MEDIUM, null, new AwS7S0203000_9(i3, this, aweme, i, i2, 1));
    }
}
