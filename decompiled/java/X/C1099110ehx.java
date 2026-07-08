package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.model.FeedBanner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ehx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099110ehx extends AbstractC1099100ehw {
    public final List<FeedBanner> LLILZ;
    public final String LLILZIL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List<FeedBanner> list = this.LLILZ;
        if (list == null) {
            return 0;
        }
        if (((ArrayList) list).size() > 1) {
            return Integer.MAX_VALUE;
        }
        return ((ArrayList) this.LLILZ).size();
    }

    public final FeedBanner LJJIJIL(int i) {
        List<FeedBanner> list = this.LLILZ;
        if (list != null && !((ArrayList) list).isEmpty() && i >= 0) {
            return (FeedBanner) ListProtector.get(this.LLILZ, i % ((ArrayList) this.LLILZ).size());
        }
        return null;
    }

    public C1099110ehx(LayoutInflater layoutInflater, String str) {
        super(layoutInflater);
        this.LLILZ = new ArrayList();
        this.LLILZIL = str;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        if (obj == null) {
            return;
        }
        View view = (View) obj;
        C786410Ut5.LJJJLZIJ(view, viewGroup);
        if (this.LLILLJJLI.size() < ((ArrayList) this.LLILZ).size()) {
            this.LLILLJJLI.add(view);
        }
    }
}
