package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0iqT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1258150iqT<T extends AmeBaseFragment> extends AbstractC480470Isn {
    public final List<T> LLIZ;
    public final List<Integer> LLIZLLLIL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLIZ.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        if (this.LLIZ.contains(obj)) {
            return this.LLIZ.indexOf(obj);
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        Integer num = (Integer) ListProtector.get(this.LLIZLLLIL, i);
        if (ListProtector.get(this.LLIZ, i) instanceof InterfaceC1055740da0) {
            return ((InterfaceC1055740da0) ListProtector.get(this.LLIZ, i)).getTitle();
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    if (iIntValue != 3) {
                        if (iIntValue != 8) {
                            if (iIntValue != 16) {
                                if (iIntValue != 19) {
                                    if (iIntValue != 26) {
                                        if (iIntValue != 34) {
                                            switch (iIntValue) {
                                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                                    return C20642515q3.LJI(R.string.fge);
                                                case BdTuring.TYPE_EMAIL /* 11 */:
                                                    return C20642515q3.LJI(2131828941);
                                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                    return C20642515q3.LJI(2131834570);
                                                default:
                                                    return "";
                                            }
                                        }
                                        return C20642515q3.LJI(2131844820);
                                    }
                                    return C20642515q3.LJI(R.string.fij);
                                }
                                return C20642515q3.LJI(2131835124);
                            }
                            return C20642515q3.LJI(2131828934);
                        }
                        return C20642515q3.LJI(2131828943);
                    }
                    if (ListProtector.get(this.LLIZ, i) != null && ((AmeBaseFragment) ListProtector.get(this.LLIZ, i)).isCommerce) {
                        return C20642515q3.LJI(2131829270);
                    }
                }
            }
            return C20642515q3.LJI(2131834894);
        }
        if (ListProtector.get(this.LLIZ, i) != null && ((AmeBaseFragment) ListProtector.get(this.LLIZ, i)).isCommerce) {
            return C20642515q3.LJI(2131829270);
        }
        return C20642515q3.LJI(2131835611);
    }

    @Override // X.AbstractC480470Isn
    public final Fragment LJJIJIL(int i) {
        return (Fragment) ListProtector.get(this.LLIZ, i);
    }

    @Override // X.AbstractC480470Isn
    public final long LJJIJL(int i) {
        return ((Integer) ListProtector.get(this.LLIZLLLIL, i)).intValue();
    }

    public C1258150iqT(FragmentManager fragmentManager, List<T> list, List<Integer> list2) {
        super(fragmentManager, 0);
        this.LLIZ = list;
        this.LLIZLLLIL = list2;
    }
}
