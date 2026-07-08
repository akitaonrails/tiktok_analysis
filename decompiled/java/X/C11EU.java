package X;

import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.11EU, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11EU extends AbstractC1762740vyK {
    public final int LLILZ;
    public List<Banner> LLILZIL;
    public final int LLILZLL;
    public final long LLIZ;
    public final long LLIZLLLIL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List<Banner> list = this.LLILZIL;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // X.AbstractC1762740vyK
    public final View LJJIJIL(int i, View view, ViewGroup viewGroup) {
        C11F3 c11f3;
        View viewTd = view;
        if (viewTd == null) {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cx6, viewGroup, false);
            c11f3 = new C11F3(viewTd, this.LLILZ, this.LLILZLL, this.LLIZ, this.LLIZLLLIL);
            viewTd.setTag(c11f3);
        } else {
            c11f3 = (C11F3) viewTd.getTag();
        }
        if (getCount() > 0) {
            Banner banner = (Banner) ListProtector.get(this.LLILZIL, i);
            if (banner != null) {
                if (banner != c11f3.LLILZIL) {
                    c11f3.LLILZIL = banner;
                    c11f3.LLILZLL = i + 1;
                    if (banner.getBannerUrl() != null && !C086I.LIZIZ(c11f3.LLILZIL.getBannerUrl().getUrlList())) {
                        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c11f3.LLILZIL.getBannerUrl()));
                        c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(601));
                        c1331670kl3LJIIIIZZ.LJJIJIIJIL(c11f3.LLILLJJLI);
                        c1331670kl3LJIIIIZZ.LIZLLL = true;
                        c1331670kl3LJIIIIZZ.LIZLLL("MusicBannerViewHolder");
                        c1331670kl3LJIIIIZZ.LJJ(c11f3.LLILLL);
                        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                    }
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(c11f3.itemView.getContext().getResources().getColor(R.color.uq));
                    gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(4));
                    gradientDrawable.setAlpha(76);
                }
            } else {
                c11f3.getClass();
                return viewTd;
            }
        }
        return viewTd;
    }

    public C11EU(LayoutInflater layoutInflater, int i, int i2, long j, long j2) {
        super(layoutInflater);
        this.LLILZ = i;
        this.LLILZLL = i2;
        this.LLIZ = j;
        this.LLIZLLLIL = j2;
    }
}
