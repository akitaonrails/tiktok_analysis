package X;

import com.ss.android.ugc.aweme.choosemusic.widgets.ViewPager2MusicBoardWidget;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.ecommerce.base.selector.viewmodel.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicViewV2;
import java.util.List;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.16Hi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20749216Hi implements InterfaceC469360Ias {
    public final int $t;
    public Object l0;

    public static final void onPageScrollStateChanged$0(C20749216Hi c20749216Hi, int i) {
    }

    public static final void onPageScrollStateChanged$1(C20749216Hi c20749216Hi, int i) {
    }

    public static final void onPageScrolled$0(C20749216Hi c20749216Hi, int i, float f, int i2) {
    }

    public static final void onPageScrolled$1(C20749216Hi c20749216Hi, int i, float f, int i2) {
    }

    public static final void onPageScrolled$2(C20749216Hi c20749216Hi, int i, float f, int i2) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                break;
            case 1:
                onPageScrollStateChanged$1(this, i);
                break;
            case 2:
                onPageScrollStateChanged$2(this, i);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                break;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                break;
            case 2:
                onPageScrolled$2(this, i, f, i2);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
            case 2:
                onPageSelected$2(this, i);
                break;
        }
    }

    public C20749216Hi(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$2(C20749216Hi c20749216Hi, int i) {
        VerticalMusicViewV2 verticalMusicViewV2 = (VerticalMusicViewV2) c20749216Hi.l0;
        int i2 = verticalMusicViewV2.LLJJIJIL;
        verticalMusicViewV2.LLJJIJIIJIL = i2;
        verticalMusicViewV2.LLJJIJIL = i;
        if ((i2 | 2) > 0 && i == 1) {
            C155H c155h = verticalMusicViewV2.LLIZ;
            if (c155h == null) {
                c155h = null;
            }
            c155h.LJIILIIL.LJIILLIIL(verticalMusicViewV2.LLLF.getStringValue());
        }
    }

    public static final void onPageSelected$0(C20749216Hi c20749216Hi, int i) {
        ((ViewPager2MusicBoardWidget) c20749216Hi.l0).LLJILJIL = i;
        int i2 = 0;
        while (true) {
            ViewPager2MusicBoardWidget viewPager2MusicBoardWidget = (ViewPager2MusicBoardWidget) c20749216Hi.l0;
            boolean[] zArr = viewPager2MusicBoardWidget.LLJJJIL;
            if (i2 < zArr.length) {
                zArr[i2] = viewPager2MusicBoardWidget.LLJJJ[i2];
                i2++;
            } else {
                viewPager2MusicBoardWidget.LJIJI();
                return;
            }
        }
    }

    public static final void onPageSelected$1(C20749216Hi c20749216Hi, int i) {
        C16CP c16cp;
        List<TikTokMediaModel> list;
        ChooseMediaViewModel chooseMediaViewModel;
        C16CO c16co = (C16CO) c20749216Hi.l0;
        c16co.LLJJL = i;
        if (!c16co.LLJILLL && (c16cp = c16co.LLJJIII) != null && (list = c16cp.LLILZLL) != null) {
            c16co.LLLLIIIILLL(list, new AwS397S0200000_31((List) list, (List<TikTokMediaModel>) c16co, (C16CO) 89));
            TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) C13LP.LJJJLZIJ(i, list);
            if (tikTokMediaModel != null && (chooseMediaViewModel = c16co.LLJJIJIIJIL) != null) {
                chooseMediaViewModel.setState(new AwS610S0100000_31(tikTokMediaModel, 416));
            }
        }
    }

    public static final void onPageSelected$2(C20749216Hi c20749216Hi, int i) {
        VerticalMusicViewV2 verticalMusicViewV2 = (VerticalMusicViewV2) c20749216Hi.l0;
        int i2 = verticalMusicViewV2.LLJJIJIL;
        if (i2 != 0) {
            if (i2 != 2 || verticalMusicViewV2.LLJJIJIIJIL != 0) {
                verticalMusicViewV2.LJJJLZIJ(i, true, true);
            }
        }
    }
}
