package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.livesdk.model.FeedBanner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0ehw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1099100ehw extends PagerAdapter {
    public final LinkedList<View> LLILLJJLI = new LinkedList<>();
    public final LayoutInflater LLILLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return view == obj;
    }

    public AbstractC1099100ehw(LayoutInflater layoutInflater) {
        this.LLILLL = layoutInflater;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        View viewTd;
        C1099090ehv c1099090ehv;
        if (!this.LLILLJJLI.isEmpty()) {
            viewTd = this.LLILLJJLI.removeFirst();
        } else {
            viewTd = null;
        }
        C1099110ehx c1099110ehx = (C1099110ehx) this;
        if (viewTd == null) {
            viewTd = C786410Ut5.Td(c1099110ehx.LLILLL, R.layout.gpl, viewGroup, false);
            c1099090ehv = new C1099090ehv(i % ((ArrayList) c1099110ehx.LLILZ).size(), viewGroup.getContext(), viewTd, c1099110ehx.LLILZIL);
            viewTd.setTag(c1099090ehv);
        } else {
            c1099090ehv = (C1099090ehv) viewTd.getTag();
        }
        List<FeedBanner> list = c1099110ehx.LLILZ;
        if (list != null && !((ArrayList) list).isEmpty()) {
            int size = i % ((ArrayList) c1099110ehx.LLILZ).size();
            FeedBanner feedBanner = (FeedBanner) ListProtector.get(c1099110ehx.LLILZ, size);
            c1099090ehv.LJ = feedBanner;
            c1099090ehv.LJII = size;
            if (feedBanner != null) {
                C786410Ut5.LLIL(c1099090ehv.LIZJ, 8);
                String str = feedBanner.text;
                if (feedBanner.LIZIZ() != null && feedBanner.LIZIZ().getUrls() != null && feedBanner.LIZIZ().getUrls().size() > 0) {
                    c1099090ehv.LIZ.setImageURI((String) ListProtector.get(feedBanner.LIZIZ().getUrls(), 0));
                }
                if (TextUtils.isEmpty(str)) {
                    C786410Ut5.LLIL(c1099090ehv.LIZIZ, 8);
                } else {
                    C786410Ut5.LLIL(c1099090ehv.LIZIZ, 0);
                    c1099090ehv.LIZIZ.setText(str);
                }
            }
        }
        viewGroup.addView(viewTd);
        return viewTd;
    }
}
