package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vwE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@InterfaceC1294060jmO
public final class C1761440vwE extends C1761450vwF {
    public View LLJI;
    public boolean LLJIJIL;
    public EnumC1407150min LLJILJIL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0462 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0807  */
    /* JADX WARN: Type inference failed for: r6v17, types: [T, java.lang.String] */
    @Override // X.C1761450vwF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1761290vvz r23) {
        /*
            Method dump skipped, instruction units count: 2061
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1761440vwE.LIZ(X.0vvz):void");
    }

    public final boolean LIZLLL(C1761290vvz c1761290vvz) {
        EnumC1407150min enumC1407150min = this.LLJILJIL;
        EnumC1407150min enumC1407150min2 = EnumC1407150min.SHOW_ORIGINAL;
        if (enumC1407150min != enumC1407150min2 || c1761290vvz.LJJI != EnumC1407150min.SHOW_TRANSLATION || c1761290vvz.LJJIFFI == null) {
            if (enumC1407150min == EnumC1407150min.SHOW_TRANSLATION && c1761290vvz.LJJI == enumC1407150min2 && c1761290vvz.LJJIFFI != null) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // X.C1761450vwF, X.InterfaceC1761370vw7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageSelected(int r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C1761440vwE.onPageSelected(int):void");
    }

    public final void LIZJ(Boolean bool, Integer num) {
        View view;
        int i;
        TuxTextView tuxTextView;
        View view2;
        int i2;
        TuxIconView tuxIconView;
        int i3;
        View viewFindViewById;
        View viewFindViewById2;
        Resources resources;
        View viewFindViewById3;
        int i4;
        String string = null;
        if (this.LLJIJIL) {
            view = this.LLJI;
            if (view != null) {
                i = R.id.tv_review_cell_digg_count_v2;
                tuxTextView = (TuxTextView) view.findViewById(i);
            }
            tuxTextView = null;
        } else {
            view = this.LLJI;
            if (view != null) {
                i = R.id.mnh;
                tuxTextView = (TuxTextView) view.findViewById(i);
            }
            tuxTextView = null;
        }
        if (this.LLJIJIL) {
            view2 = this.LLJI;
            if (view2 != null) {
                i2 = R.id.tv_review_cell_digg_v2;
                tuxIconView = (TuxIconView) view2.findViewById(i2);
            }
            tuxIconView = null;
        } else {
            view2 = this.LLJI;
            if (view2 != null) {
                i2 = R.id.mn0;
                tuxIconView = (TuxIconView) view2.findViewById(i2);
            }
            tuxIconView = null;
        }
        boolean zLJFF = Intrinsics.LJFF(bool, Boolean.TRUE);
        int i5 = R.attr.eg;
        if (zLJFF) {
            boolean z = this.LLJIJIL;
            if (z) {
                i3 = R.raw.icon_thumbs_up_fill;
                i4 = R.attr.a1k;
            } else {
                i3 = R.raw.icon_heart_fill;
                i4 = R.attr.a1r;
            }
            if (tuxTextView != null) {
                if (!z) {
                    i5 = R.attr.a1r;
                }
                tuxTextView.setTextColorRes(i5);
            }
            i5 = i4;
        } else {
            if (this.LLJIJIL) {
                i3 = R.raw.icon_thumbs_up;
            } else {
                i3 = R.raw.icon_heart;
            }
            if (tuxTextView != null) {
                tuxTextView.setTextColorRes(R.attr.eg);
            }
        }
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i3;
            c419910GdJ.LJ = Integer.valueOf(i5);
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        int i6 = 8;
        if (num != null && num.intValue() == 0) {
            if (tuxTextView != null) {
                C786410Ut5.LJLLLLLL(8, tuxTextView);
            }
            View view3 = this.LLJI;
            if (view3 != null && (viewFindViewById3 = view3.findViewById(R.id.mnk)) != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById3);
            }
            if (this.LLJIJIL && tuxTextView != null) {
                C786410Ut5.LJLLLLLL(0, tuxTextView);
                View view4 = this.LLJI;
                if (view4 != null && (resources = view4.getResources()) != null) {
                    string = resources.getString(2131857253);
                }
                tuxTextView.setText(string);
                return;
            }
            return;
        }
        if (tuxTextView != null) {
            C786410Ut5.LJLLLLLL(0, tuxTextView);
        }
        View view5 = this.LLJI;
        if (view5 != null && (viewFindViewById = view5.findViewById(R.id.mnk)) != null) {
            View view6 = this.LLJI;
            if (view6 != null && (viewFindViewById2 = view6.findViewById(R.id.tgd)) != null && viewFindViewById2.getVisibility() == 0) {
                i6 = 0;
            }
            C786410Ut5.LJLLLLLL(i6, viewFindViewById);
        }
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setText(String.valueOf(num));
    }

    @Override // X.C1761450vwF, X.InterfaceC1761370vw7
    public final void LJII(FrameLayout frameLayout, InterfaceC1763860w08 interfaceC1763860w08) {
        this.LLJI = C992303uL.LIZ(frameLayout.getContext(), R.layout.av3, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.addView(this.LLJI, layoutParams);
    }

    public C1761440vwE(GalleryViewerFragment galleryViewerFragment, GalleryViewerViewModel galleryViewerViewModel, int i) {
        super(galleryViewerFragment, galleryViewerViewModel, i);
    }
}
