package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.lemon.postmode.ui.photo.model.PostModeFullPageViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.19uy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21692219uy extends AbstractC21691819uu<AbstractC21692819v4> {
    public final InterfaceC21651419oO LLILLL;
    public final InterfaceC21692419v0 LLILZ;
    public final InterfaceC21693319v9 LLILZIL;
    public final ViewGroup LLILZLL;
    public final InterfaceC21693419vA LLIZ;
    public final C0HYF LLIZLLLIL;
    public AbstractC21692819v4 LLJIJIL;
    public int LLJILJIL;
    public final List<AbstractC21692819v4> LLJ = new ArrayList();
    public final ArrayList<PhotoModeImageUrlModel> LLJI = new ArrayList<>();
    public final Map<Integer, InterfaceC469401sC> LLJILJILJ = new LinkedHashMap();

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        return -2;
    }

    @Override // X.AbstractC21691819uu
    public final C21692619v2 LJJIJIL(ViewGroup viewGroup) {
        C21692619v2 c21692619v2 = new C21692619v2(C20742916Ex.LIZ(viewGroup.getContext(), R.layout.dam, viewGroup, false, -1), this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL);
        ((ArrayList) this.LLJ).add(c21692619v2);
        return c21692619v2;
    }

    public final AbstractC21692819v4 LJJIJL(int i) {
        AbstractC21692819v4 next;
        Iterator<AbstractC21692819v4> it2 = this.LLJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZIZ == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public final void LJJIJLIJ(int i) {
        AbstractC21692819v4 abstractC21692819v4LJJIJL = LJJIJL(i);
        if (abstractC21692819v4LJJIJL != null) {
            C21692619v2 c21692619v2 = (C21692619v2) abstractC21692819v4LJJIJL;
            C21693219v8 c21693219v8 = c21692619v2.LJIIZILJ;
            EnumC720680SOs enumC720680SOs = c21692619v2.LJIILJJIL;
            C21693119v7 c21693119v7 = c21693219v8.LJIIIZ;
            if (c21693219v8.LIZLLL) {
                c21693119v7.getClass();
            } else {
                c21693119v7.getClass();
                if ((enumC720680SOs == EnumC720680SOs.NONE || (enumC720680SOs == EnumC720680SOs.BLUR_PLACEHOLDER && c21693119v7.LJI)) && c21693119v7.LJI) {
                    c21693119v7.LIZIZ(c21693119v7.LIZLLL);
                }
            }
            c21692619v2.LJIILIIL.setTouchEnabled(true);
            c21692619v2.LJIILIIL.setPinchEnabled(c21692619v2.LJIIZILJ.LIZLLL);
            CharSequence contentDescription = c21692619v2.LJIIL.getContentDescription();
            if (contentDescription != null && C1601690rmZ.LIZIZ()) {
                c21692619v2.LJIIL.announceForAccessibility(contentDescription);
                c21692619v2.LJIIL.requestFocus();
                c21692619v2.LJIIL.sendAccessibilityEvent(8);
            }
        }
    }

    public C21692219uy(C451910Hnp c451910Hnp, C451920Hnq c451920Hnq, PostModeFullPageViewModel postModeFullPageViewModel, ViewGroup viewGroup, C1356060lOO c1356060lOO, C0HYF c0hyf) {
        this.LLILLL = c451910Hnp;
        this.LLILZ = c451920Hnq;
        this.LLILZIL = postModeFullPageViewModel;
        this.LLILZLL = viewGroup;
        this.LLIZ = c1356060lOO;
        this.LLIZLLLIL = c0hyf;
    }
}
