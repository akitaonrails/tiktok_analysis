package X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.11ET, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11ET extends AbstractC1762740vyK implements C11DI {
    public final C11DI LLILZ;
    public List<? extends Banner> LLILZIL;

    @Override // X.C11DI
    public final void cQ() {
        this.LLILZ.cQ();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLILZIL.size();
    }

    public C11ET(C11DI c11di, LayoutInflater layoutInflater) {
        super(layoutInflater);
        this.LLILZ = c11di;
        this.LLILZIL = C13BV.INSTANCE;
    }

    @Override // X.AbstractC1762740vyK
    public final View LJJIJIL(int i, View view, ViewGroup viewGroup) {
        C11ES c11es;
        if (view == null) {
            view = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f882bn3, viewGroup, false);
            c11es = new C11ES(this, view);
            view.setTag(c11es);
        } else {
            c11es = (C11ES) view.getTag();
        }
        if (getCount() > 0) {
            Banner banner = (Banner) ListProtector.get(this.LLILZIL, i);
            if (banner != null && banner != c11es.LLILLJJLI) {
                c11es.LLILLJJLI = banner;
                String schema = banner.getSchema();
                if (!TextUtils.isEmpty(schema) && (C1030670cvZ.LIZ(schema) || !C19254610Um.LIZIZ.LJJIIJZLJL())) {
                    C988700bps.LIZ.LIZIZ().preloadMiniApp(schema);
                }
                c11es.LLILLL = i;
                if (c11es.LLILLJJLI.getBannerUrl() != null && !C086I.LIZIZ(c11es.LLILLJJLI.getBannerUrl().getUrlList())) {
                    int[] iArrLIZ = C422830Gi1.LIZ(600);
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c11es.LLILLJJLI.getBannerUrl()));
                    c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(600));
                    c1331670kl3LJIIIIZZ.LJJIJIIJIL(iArrLIZ);
                    c1331670kl3LJIIIIZZ.LIZLLL = true;
                    c1331670kl3LJIIIIZZ.LIZLLL("BannerViewHolder");
                    c1331670kl3LJIIIIZZ.LJJ(c11es.LL);
                    C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                }
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(c11es.itemView.getContext().getResources().getColor(R.color.c0));
                gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(4));
                gradientDrawable.setAlpha(76);
                TuxTextView tuxTextView = (TuxTextView) c11es.itemView.findViewById(R.id.efe);
                tuxTextView.setBackgroundDrawable(gradientDrawable);
                if (c11es.LLILLJJLI.getAdData() != null && c11es.LLILLJJLI.getAdData().getAdLabel() != null) {
                    tuxTextView.setText(c11es.LLILLJJLI.getAdData().getAdLabel().text);
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                } else {
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                }
            }
            SmartImageView smartImageView = c11es.LL;
            if (smartImageView != null) {
                smartImageView.setForeground(viewGroup.getContext().getDrawable(R.drawable.bhy));
            }
        }
        return view;
    }
}
