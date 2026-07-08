package X;

import Y.AsS33S0100000_6;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.comment.gift.model.GiftPage;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0lDr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349530lDr extends PagerAdapter {
    public final Fragment LLILLJJLI;
    public final C19EG LLILLL;
    public final GiftViewModel LLILZ;
    public final C1235900iGa LLILZIL;
    public final C1355450lNP LLILZLL;
    public CommentContextSource LLIZ;
    public final List<GiftPage> LLIZLLLIL = new ArrayList();

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return view == obj;
    }

    public final CommentContextSource LJJIJIL() {
        if (this.LLIZ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this.LLILLJJLI, null), "source_default_key", CommentContextSource.class, null);
            this.LLIZ = interfaceC1555100qZQLIZIZ != null ? (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLIZ;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LLIZLLLIL).size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        String str = ((GiftPage) ListProtector.get(this.LLIZLLLIL, i)).pageName;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        GridLayoutManager gridLayoutManager;
        GiftStruct[] giftStructArr;
        int i2;
        int i3 = 0;
        if (C290520Ba6.LIZ()) {
            gridLayoutManager = new GridLayoutManager(4, 1, (Context) this.LLILLL, false);
        } else {
            gridLayoutManager = new GridLayoutManager(2, 0, (Context) this.LLILLL, false);
        }
        RecyclerView recyclerView = new RecyclerView(this.LLILLL);
        C786410Ut5.p6(recyclerView, new RecyclerView.LayoutParams(-1, -1));
        recyclerView.setLayoutManager(gridLayoutManager);
        C1349430lDh c1349430lDh = new C1349430lDh(this.LLILLJJLI, this.LLILLL, this.LLILZ, (String) LJIJJLI(i), this.LLILZLL);
        recyclerView.setAdapter(c1349430lDh);
        C20635215os c20635215os = new C20635215os() { // from class: X.0lDt
            @Override // X.C20635215os, X.AbstractC20634815oo
            public final View LIZJ(RecyclerView.LayoutManager layoutManager) {
                View viewLIZJ = super.LIZJ(layoutManager);
                if (viewLIZJ == null) {
                    return null;
                }
                return viewLIZJ;
            }
        };
        if (c20635215os.LIZJ > 0) {
            c20635215os.LIZJ = 2;
            if (c20635215os.LIZLLL > 0) {
                c20635215os.LIZLLL = 4;
                RecyclerView recyclerView2 = c20635215os.LIZ;
                if (recyclerView2 != recyclerView) {
                    if (recyclerView2 != null) {
                        recyclerView2.removeOnScrollListener(c20635215os.LIZIZ);
                        c20635215os.LIZ.setOnFlingListener(null);
                    }
                    c20635215os.LIZ = recyclerView;
                    if (recyclerView.getOnFlingListener() == null) {
                        c20635215os.LIZ.addOnScrollListener(c20635215os.LIZIZ);
                        c20635215os.LIZ.setOnFlingListener(c20635215os);
                        new Scroller(c20635215os.LIZ.getContext(), new DecelerateInterpolator());
                        c20635215os.LIZLLL();
                    } else {
                        throw new IllegalStateException("An instance of OnFlingListener already set.");
                    }
                }
                recyclerView.addOnScrollListener(new AsS33S0100000_6(this, 2));
                c1349430lDh.LLJI = ((GiftPage) ListProtector.get(this.LLIZLLLIL, i)).giftPageType;
                List<GiftStruct> list = ((GiftPage) ListProtector.get(this.LLIZLLLIL, i)).giftList;
                if (list != null && !list.isEmpty()) {
                    if (C290520Ba6.LIZ()) {
                        giftStructArr = (GiftStruct[]) list.toArray(new GiftStruct[0]);
                    } else {
                        int size = list.size() - 1;
                        int i4 = c1349430lDh.LLJ;
                        int i5 = ((size / i4) + 1) * i4;
                        giftStructArr = new GiftStruct[i5];
                        for (GiftStruct giftStruct : list) {
                            int i6 = i3 + 1;
                            int i7 = c1349430lDh.LLJ;
                            int i8 = i3 / i7;
                            int i9 = i3 % i7;
                            int i10 = i7 / 2;
                            if (i9 < i10) {
                                i2 = i9 * 2;
                            } else {
                                i2 = ((i9 - i10) * 2) + 1;
                            }
                            int i11 = i2 + (i8 * i7);
                            if (i11 < i5) {
                                giftStructArr[i11] = giftStruct;
                            }
                            i3 = i6;
                        }
                    }
                    c1349430lDh.LLILZLL = giftStructArr;
                    c1349430lDh.notifyDataSetChanged();
                }
                viewGroup.addView(recyclerView);
                return recyclerView;
            }
            throw new IllegalArgumentException("column must be greater than zero");
        }
        throw new IllegalArgumentException("row must be greater than zero");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        ViewPager viewPager = (ViewPager) viewGroup;
        View view = (View) obj;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewPager, view);
        viewPager.removeView(view);
    }

    public C1349530lDr(Fragment fragment, C19EG c19eg, GiftViewModel giftViewModel, C1235900iGa c1235900iGa, C1355450lNP c1355450lNP) {
        this.LLILLJJLI = fragment;
        this.LLILLL = c19eg;
        this.LLILZ = giftViewModel;
        this.LLILZIL = c1235900iGa;
        this.LLILZLL = c1355450lNP;
        if (C1142730fqJ.LJII == null) {
            C1129810fVT c1129810fVT = new C1129810fVT(C786410Ut5.P3(c19eg));
            c1129810fVT.LJ = 2;
            c1129810fVT.LIZJ = 2;
            c1129810fVT.LIZLLL = 5;
            C1142730fqJ.LJII = c1129810fVT.LIZ();
        }
    }
}
