package X;

import Y.ARunnableS116S0100000_16;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem;
import com.ss.android.ugc.aweme.model.AnolePlayerVideoDataModel;
import com.ss.android.ugc.aweme.model.VideoConfigInfo;
import com.ss.android.ugc.aweme.relation.ffp.ui.RecFriendsEmptyFragment;
import com.ss.android.ugc.aweme.tako.multipletemplate.album.TakoMediaChooseAlbumAssem;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class ViewOnLayoutChangeListenerC1077260e8i implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 5:
                onLayoutChange$5(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 6:
                onLayoutChange$6(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 7:
                onLayoutChange$7(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC1077260e8i(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC1077260e8i viewOnLayoutChangeListenerC1077260e8i, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        C1013630cU5 c1013630cU5 = (C1013630cU5) viewOnLayoutChangeListenerC1077260e8i.l0;
        boolean zI5 = c1013630cU5.I5(c1013630cU5.LLJ, true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLayoutChange updateSuccess=");
        sbLIZ.append(zI5);
        C1022620cia.LIZ("MultiContentVideoItemViewHolder", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC1077260e8i viewOnLayoutChangeListenerC1077260e8i, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iLIZIZ;
        C1003650cDz c1003650cDz = (C1003650cDz) viewOnLayoutChangeListenerC1077260e8i.l0;
        TuxTextView tuxTextView = c1003650cDz.LLJLIL;
        if (tuxTextView != null) {
            int[] iArr = new int[2];
            tuxTextView.getLocationOnScreen(iArr);
            int iLIZ = C1618190sDB.LIZ(98);
            ViewGroup viewGroup = c1003650cDz.LLJJIII;
            if (viewGroup != null) {
                iLIZIZ = viewGroup.getWidth();
            } else {
                iLIZIZ = C497820Jfg.LIZIZ(c1003650cDz.LLILZ);
            }
            c1003650cDz.LLJLL = new Rect(0, iLIZ, iLIZIZ, iArr[1]);
        }
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC1077260e8i viewOnLayoutChangeListenerC1077260e8i, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        VideoConfigInfo videoConfigInfo;
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII = ((C1018320cbe) viewOnLayoutChangeListenerC1077260e8i.l0).LJJIII();
        if (anolePlayerVideoDataModelLJJIII == null || (videoConfigInfo = anolePlayerVideoDataModelLJJIII.videoConfigInfo) == null || videoConfigInfo.videoLayoutInContentView == null) {
            ((C1018320cbe) viewOnLayoutChangeListenerC1077260e8i.l0).LJJIJIIJIL("layoutChange");
        }
        ((C1018320cbe) viewOnLayoutChangeListenerC1077260e8i.l0).LJJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onLayoutChange$3(X.ViewOnLayoutChangeListenerC1077260e8i r4, android.view.View r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13) {
        /*
            java.lang.Object r0 = r4.l0
            X.0dPA r0 = (X.C1049020dPA) r0
            android.widget.FrameLayout r3 = r0.LLILZLL
            if (r3 != 0) goto L9
            return
        L9:
            int r0 = r3.getHeight()
            if (r0 <= 0) goto L89
            java.lang.Object r0 = r4.l0
            X.0dPA r0 = (X.C1049020dPA) r0
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L89
            java.lang.Object r0 = r4.l0
            X.0dPA r0 = (X.C1049020dPA) r0
            r0.getClass()
            int r0 = r3.getChildCount()
            r2 = 1
            if (r0 == 0) goto L8c
            int r0 = r3.getChildCount()
            int r0 = r0 - r2
            android.view.View r1 = r3.getChildAt(r0)
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L8c
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r0 = r1.getChildCount()
            if (r0 == 0) goto L8c
            int r0 = r1.getChildCount()
            int r0 = r0 - r2
            android.view.View r1 = r1.getChildAt(r0)
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L8c
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r0 = r1.getChildCount()
            if (r0 == 0) goto L8c
            int r0 = r1.getChildCount()
            int r0 = r0 - r2
            android.view.View r0 = r1.getChildAt(r0)
            int r0 = r0.getHeight()
        L5e:
            java.lang.Object r1 = r4.l0
            X.0dPA r1 = (X.C1049020dPA) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LJIILL(r0)
            java.lang.Object r1 = r4.l0
            X.0dPA r1 = (X.C1049020dPA) r1
            float r2 = r1.LLJILJILJ
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L89
            X.14Zm r1 = r1.LLIZ
            if (r1 == 0) goto L89
            android.view.View r0 = r1.LJJIJIIJI
            r1.LJJIIJ(r0, r2)
            X.0dPM r0 = r1.LJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L8a
            android.view.View r0 = r0.LIZ()
        L86:
            r1.LJJIIJ(r0, r2)
        L89:
            return
        L8a:
            r0 = 0
            goto L86
        L8c:
            int r0 = r3.getHeight()
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnLayoutChangeListenerC1077260e8i.onLayoutChange$3(X.0e8i, android.view.View, int, int, int, int, int, int, int, int):void");
    }

    public static final void onLayoutChange$4(ViewOnLayoutChangeListenerC1077260e8i viewOnLayoutChangeListenerC1077260e8i, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C1342230l25 c1342230l25Up;
        Object next;
        if ((i != i5 || i2 != i6 || i3 != i7 || i4 != i8) && (c1342230l25Up = ((CommentPowerListAssem) viewOnLayoutChangeListenerC1077260e8i.l0).up()) != null) {
            View viewBp = ((CommentPowerListAssem) viewOnLayoutChangeListenerC1077260e8i.l0).Bp();
            ViewGroup viewGroup = (ViewGroup) ((CommentPowerListAssem) viewOnLayoutChangeListenerC1077260e8i.l0).LLJJIJI.getValue();
            if (viewGroup != null && c1342230l25Up.LIZIZ) {
                int top = 0;
                if (C1342230l25.LJIIJJI && viewGroup.getHeight() > 0) {
                    Iterator it2 = new C1077420e8y(viewGroup, 2).iterator();
                    while (true) {
                        C1077410e8x c1077410e8x = (C1077410e8x) it2;
                        if (c1077410e8x.hasNext()) {
                            next = c1077410e8x.next();
                            if (((View) next).getId() == R.id.eb0) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    View view2 = (View) next;
                    if (view2 == null) {
                        view2 = new View(viewGroup.getContext());
                        view2.setId(R.id.eb0);
                        viewGroup.addView(view2);
                    }
                    float height = viewGroup.getHeight();
                    int i9 = (int) (0.19f * height);
                    view2.setBackgroundColor(872349696);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) (height * 0.48000002f));
                    layoutParams.topMargin = i9;
                    C786410Ut5.W5(view2, layoutParams);
                    view2.setTag("red_mask");
                }
                ViewParent parent = viewBp.getParent();
                while ((parent instanceof View) && !Intrinsics.LJFF(viewBp.getParent(), viewGroup)) {
                    top += viewBp.getTop();
                    viewBp = (View) parent;
                    parent = viewBp.getParent();
                }
                if (Intrinsics.LJFF(viewBp.getParent(), viewGroup)) {
                    top += viewBp.getTop();
                }
                c1342230l25Up.LJFF = top;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateCommentListTopInCommentPanel commentListTopInCommentPanel = ");
                sbLIZ.append(c1342230l25Up.LJFF);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        HandlerHook.viewPostDelay(((CommentPowerListAssem) viewOnLayoutChangeListenerC1077260e8i.l0).Bp(), new ARunnableS116S0100000_16((CommentPowerListAssem) viewOnLayoutChangeListenerC1077260e8i.l0, 33), 50L);
    }

    public static final void onLayoutChange$5(ViewOnLayoutChangeListenerC1077260e8i viewOnLayoutChangeListenerC1077260e8i, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((RecFriendsEmptyFragment) viewOnLayoutChangeListenerC1077260e8i.l0).hS();
    }

    public static final void onLayoutChange$6(ViewOnLayoutChangeListenerC1077260e8i viewOnLayoutChangeListenerC1077260e8i, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        if (i9 != i8 - i6 && ((TakoMediaChooseAlbumAssem) viewOnLayoutChangeListenerC1077260e8i.l0).LJJIJL().getTranslationY() != 0.0f) {
            C786410Ut5.ed(((TakoMediaChooseAlbumAssem) viewOnLayoutChangeListenerC1077260e8i.l0).LJJIJL(), -i9);
        }
    }

    public static final void onLayoutChange$7(ViewOnLayoutChangeListenerC1077260e8i viewOnLayoutChangeListenerC1077260e8i, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int width;
        if (i3 - i != i7 - i5) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("layout changed");
            C998550c5l c998550c5l = (C998550c5l) viewOnLayoutChangeListenerC1077260e8i.l0;
            int width2 = c998550c5l.LIZ.getWidth();
            C186G c186g = c998550c5l.LIZLLL;
            int i9 = 0;
            if (c186g != null) {
                width = c186g.getWidth();
            } else {
                width = 0;
            }
            int i10 = width2 - width;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sellerInfoRenderSpace == ");
            sbLIZ.append(i10);
            C2341109Fh.LJ(C2188811AlT.LIZIZ(sbLIZ));
            if (i10 > 0 && i10 < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) && ((ViewGroup) c998550c5l.LIZ).getChildCount() > 1) {
                Iterator it2 = new C1077420e8y((ViewGroup) c998550c5l.LIZ, 29).iterator();
                while (true) {
                    C1077410e8x c1077410e8x = (C1077410e8x) it2;
                    if (c1077410e8x.hasNext()) {
                        Object next = c1077410e8x.next();
                        int i11 = i9 + 1;
                        if (i9 >= 0) {
                            View view2 = (View) next;
                            if (i9 > 0) {
                                C0H1U.LIZIZ(view2);
                            }
                            i9 = i11;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                Iterator it3 = new C1077420e8y((ViewGroup) c998550c5l.LIZ, 30).iterator();
                while (true) {
                    C1077410e8x c1077410e8x2 = (C1077410e8x) it3;
                    if (c1077410e8x2.hasNext()) {
                        C337180DJs.LIZJ((View) c1077410e8x2.next());
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
