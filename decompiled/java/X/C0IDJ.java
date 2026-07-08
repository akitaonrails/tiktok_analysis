package X;

import com.ss.android.ugc.aweme.im.sticker.basic.panel.BasicStickerPanelAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.MixStudioResultsPageV2Assem;
import kotlin.jvm.internal.AwS21S0001000_6;

/* JADX INFO: renamed from: X.0IDJ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDJ extends AbstractC712240Rwk {
    public final int $t;
    public Object l0;

    public static final void onPageScrolled$0(C0IDJ c0idj, int i, float f, int i2) {
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrollStateChanged(int i) {
        if (1 - this.$t != 0) {
            super.onPageScrollStateChanged(i);
        } else {
            onPageScrollStateChanged$0(this, i);
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrolled(int i, float f, int i2) {
        if (1 - this.$t != 0) {
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
            case 2:
                onPageSelected$2(this, i);
                break;
            default:
                super.onPageSelected(i);
                break;
        }
    }

    public C0IDJ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$0(C0IDJ c0idj, int i) {
        if (i == 1) {
            ((MixStudioResultsPageV2Assem) c0idj.l0).LLLLIIL = true;
        }
    }

    public static final void onPageSelected$0(C0IDJ c0idj, int i) {
        ((BasicStickerPanelAssem) c0idj.l0).lp().IQ2(i);
    }

    public static final void onPageSelected$1(C0IDJ c0idj, int i) {
        ((MixStudioResultsPageV2Assem) c0idj.l0).tp().setStateImmediate(new AwS21S0001000_6(i, 13));
        MixStudioResultsPageV2Assem mixStudioResultsPageV2Assem = (MixStudioResultsPageV2Assem) c0idj.l0;
        if (mixStudioResultsPageV2Assem.LLLLIIL) {
            mixStudioResultsPageV2Assem.tp().BQ2(EnumC440980HQy.OTHER_STICKER, ((MixStudioResultsPageV2Assem) c0idj.l0).hp().vQ2(), ((MixStudioResultsPageV2Assem) c0idj.l0).hp().getState().LLILLL, ((MixStudioResultsPageV2Assem) c0idj.l0).hp().isNewUser());
            ((MixStudioResultsPageV2Assem) c0idj.l0).LLLLIIL = false;
        }
    }

    public static final void onPageSelected$2(C0IDJ c0idj, int i) {
        C806303Cz c806303Cz = (C806303Cz) c0idj.l0;
        if (c806303Cz != null) {
            c806303Cz.setCurrentDot(i);
        }
    }
}
