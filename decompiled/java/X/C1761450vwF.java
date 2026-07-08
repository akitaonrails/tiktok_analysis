package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import m2b.b;

/* JADX INFO: renamed from: X.0vwF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@InterfaceC1294060jmO
public class C1761450vwF implements InterfaceC1761370vw7 {
    public final GalleryViewerFragment LL;
    public final GalleryViewerViewModel LLILLJJLI;
    public final int LLILLL;
    public View LLILZ;
    public Integer LLIZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1633));
    public EnumC1407150min LLILZLL = EnumC1407150min.NONE;
    public final int LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(548));

    public final void LIZIZ() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer num = this.LLIZ;
        if (num != null) {
            int iIntValue = num.intValue();
            View view = this.LLILZ;
            ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                return;
            }
            marginLayoutParams.bottomMargin = iIntValue;
        }
    }

    @Override // X.InterfaceC1761370vw7
    public final void LJFF() {
        ViewGroup viewGroup;
        View view = this.LLILZ;
        ViewParent parent = view != null ? view.getParent() : null;
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(this.LLILZ, viewGroup);
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIZ(final X.C1761290vvz r9) {
        /*
            Method dump skipped, instruction units count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1761450vwF.LIZ(X.0vvz):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC1761370vw7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPageSelected(int r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel r1 = r4.LLILLJJLI
            if (r1 == 0) goto La
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.LLJJJIL = r0
        La:
            com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel r0 = r4.LLILLJJLI
            r3 = 0
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<java.util.concurrent.CopyOnWriteArrayList<X.0vw0>> r0 = r0.LLJJIII
            if (r0 == 0) goto L4a
            java.lang.Object r2 = r0.getValue()
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            if (r2 == 0) goto L4b
            int r0 = r2.size()
        L1f:
            if (r5 >= r0) goto L47
            com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel r0 = r4.LLILLJJLI
            if (r0 == 0) goto L38
            com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<X.0vvz> r1 = r0.LLJJIJI
            if (r1 == 0) goto L38
            if (r2 == 0) goto L48
            java.lang.Object r0 = r2.get(r5)
            X.0vw0 r0 = (X.C1761300vw0) r0
            if (r0 == 0) goto L48
            X.0vvz r0 = r0.LIZIZ
        L35:
            r1.postValue(r0)
        L38:
            if (r2 == 0) goto L44
            java.lang.Object r0 = r2.get(r5)
            X.0vw0 r0 = (X.C1761300vw0) r0
            if (r0 == 0) goto L44
            X.0vvz r3 = r0.LIZIZ
        L44:
            r4.LIZ(r3)
        L47:
            return
        L48:
            r0 = r3
            goto L35
        L4a:
            r2 = r3
        L4b:
            r0 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1761450vwF.onPageSelected(int):void");
    }

    @Override // X.InterfaceC1761370vw7
    public final void onShow(int i) {
        View view = this.LLILZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @Override // X.InterfaceC1761370vw7
    public final void setAlpha(float f) {
        View view = this.LLILZ;
        if (view != null) {
            C786410Ut5.T4(view, f);
        }
    }

    @Override // X.InterfaceC1761370vw7
    public void LJII(FrameLayout frameLayout, InterfaceC1763860w08 interfaceC1763860w08) {
        C01GW c01gw = C954703oH.LIZ;
        View viewLIZ = C954703oH.LIZ(frameLayout.getContext(), R.layout.av2, null, false);
        DataBinderMapperImpl dataBinderMapperImpl = C1842040y2E.LIZ;
        ((C1DUI) ViewDataBinding.LIZIZ(R.layout.av2, viewLIZ)).LJIILLIIL((b) this.LLJ.getValue());
        ((C0DJG) viewLIZ.findViewById(R.id.srx)).setStarSize(((b) this.LLJ.getValue()).LJJIII());
        View viewFindViewById = viewLIZ.findViewById(R.id.bkz);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.LayoutParams) && layoutParams != null) {
            layoutParams.width = ((b) this.LLJ.getValue()).LJIILIIL();
            layoutParams.height = ((b) this.LLJ.getValue()).LJIJI();
            C786410Ut5.W5(viewFindViewById, layoutParams);
        }
        this.LLILZ = viewLIZ;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        frameLayout.addView(this.LLILZ, layoutParams2);
        LIZIZ();
    }

    public C1761450vwF(GalleryViewerFragment galleryViewerFragment, GalleryViewerViewModel galleryViewerViewModel, int i) {
        this.LL = galleryViewerFragment;
        this.LLILLJJLI = galleryViewerViewModel;
        this.LLILLL = i;
    }
}
