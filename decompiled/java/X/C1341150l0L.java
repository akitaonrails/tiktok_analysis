package X;

import Y.ARunnableS121S0100000_21;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IMStickerPanelEventViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0l0L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341150l0L {
    public static final /* synthetic */ int LJJIIJZLJL = 0;
    public ViewStub LIZ;
    public View LIZIZ;
    public C424580Gkq LIZJ;
    public RadiusLayout LIZLLL;
    public C426320Gne LJ;
    public TuxIconView LJFF;
    public View LJI;
    public View LJII;
    public WeakReference<Fragment> LJIIIIZZ;
    public String LJIIIZ;
    public View LJIIJ;
    public Runnable LJIIJJI;
    public Runnable LJIIL;
    public ARunnableS121S0100000_21 LJIILIIL;
    public Aweme LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public CommentContextSource LJIIZILJ;
    public Comment LJIJ;
    public C1339550kxl LJIJI;
    public InterfaceC665370Q7z LJIJJ;
    public IMStickerPanelEventViewModel LJIJJLI;
    public C454150HrR LJIL;
    public C0P0T LJJ;
    public C0P0T LJJI;
    public boolean LJJIFFI;
    public String LJJII;
    public RecyclerView LJJIII;
    public final ARunnableS121S0100000_21 LJJIIJ = new ARunnableS121S0100000_21(this, 144);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r12 = this;
            r10 = r12
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r10.LJIJ
            r3 = 0
            r7 = 0
            if (r0 == 0) goto L40
            java.util.List r0 = r0.getImageList()
            if (r0 == 0) goto L40
            java.lang.Object r11 = X.C13LP.LJJJLZIJ(r3, r0)
            com.ss.android.ugc.aweme.comment.model.CommentImageStruct r11 = (com.ss.android.ugc.aweme.comment.model.CommentImageStruct) r11
            if (r11 == 0) goto L41
            com.ss.android.ugc.aweme.comment.model.CommentLivePhotoInfoModel r0 = r11.getLivePhotoInfoModel()
            if (r0 == 0) goto L41
            r8 = 1
        L1c:
            android.view.View r1 = r10.LJII
            if (r1 == 0) goto L26
            if (r8 == 0) goto L3d
            r0 = 0
        L23:
            X.C786410Ut5.LJLLLLLL(r0, r1)
        L26:
            int r0 = X.C1341200l0Q.LIZ
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r10.LJIJ
            X.0l0R r2 = X.C1341200l0Q.LIZLLL(r0)
            if (r2 != 0) goto L43
            X.0Gkq r1 = r10.LIZJ
            if (r1 == 0) goto L39
            java.lang.String r0 = ""
            r1.setImageURI(r0)
        L39:
            r10.LJIIIZ(r11)
            return
        L3d:
            r0 = 8
            goto L23
        L40:
            r11 = r7
        L41:
            r8 = 0
            goto L1c
        L43:
            android.util.Size r0 = r2.LIZJ
            if (r0 == 0) goto L66
            int r5 = r0.getWidth()
            int r4 = r0.getHeight()
            android.view.View r0 = r10.LIZIZ
            if (r0 == 0) goto L66
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L66
            if (r5 <= 0) goto L5d
            r1.width = r5
        L5d:
            if (r4 <= 0) goto L66
            int r0 = X.C1340260kyu.LIZ(r0)
            int r4 = r4 + r0
            r1.height = r4
        L66:
            X.0Gkq r0 = r10.LIZJ
            if (r0 == 0) goto L6d
            r0.setBackground(r7)
        L6d:
            if (r11 == 0) goto L79
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r11.getCropUrl()
            if (r7 != 0) goto L79
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r11.getOriginUrl()
        L79:
            boolean r9 = X.C708740Rr6.LIZIZ(r7)
            X.0Gkq r4 = r10.LIZJ
            if (r4 != 0) goto L82
            return
        L82:
            com.ss.android.ugc.aweme.comment.experiment.CommentPhotoQualityOptimizationV2$CommentPhotoQualityOptV2Config r0 = com.ss.android.ugc.aweme.comment.experiment.CommentPhotoQualityOptimizationV2.LIZ()
            if (r0 == 0) goto L99
            java.lang.Integer r0 = r0.enableScrollThrottleSr
            if (r0 == 0) goto L99
            int r0 = r0.intValue()
            if (r0 <= 0) goto L99
            boolean r0 = r10.LIZLLL()
            if (r0 == 0) goto L99
            r3 = 1
        L99:
            com.ss.android.ugc.aweme.comment.model.Comment r6 = r10.LJIJ
            X.0l0I r5 = new X.0l0I
            r5.<init>(r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r10.LJIJ
            X.0l0g r0 = new X.0l0g
            r0.<init>()
            X.C1344350l5V.LIZ(r2, r4, r5, r0, r3)
            if (r3 == 0) goto Laf
            r10.LJFF()
        Laf:
            r10.LJIIIZ(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1341150l0L.LIZ():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:274:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0541  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instruction units count: 1393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1341150l0L.LIZIZ():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> LIZJ() {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1341150l0L.LIZJ():java.util.Map");
    }

    public final boolean LIZLLL() {
        RecyclerView recyclerView = this.LJJIII;
        if (recyclerView == null) {
            View view = this.LJIIJ;
            if (view != null) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        break;
                    }
                    if (parent instanceof RecyclerView) {
                        recyclerView = (RecyclerView) parent;
                        if (recyclerView != null) {
                            this.LJJIII = recyclerView;
                        }
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            return false;
        }
        return recyclerView.getScrollState() != 0;
    }

    public final void LJ() {
        ViewGroup.LayoutParams layoutParams;
        int iLIZ;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        C424580Gkq c424580Gkq = this.LIZJ;
        if (c424580Gkq == null) {
            return;
        }
        int iLIZ2 = C0HD5.LIZ(c424580Gkq, 120);
        Context context = c424580Gkq.getContext();
        int iLIZ3 = C0HD5.LIZ(c424580Gkq, 40);
        View view = this.LIZIZ;
        Integer numValueOf = null;
        Integer numValueOf2 = (view == null || (layoutParams4 = view.getLayoutParams()) == null) ? null : Integer.valueOf(layoutParams4.width);
        View view2 = this.LIZIZ;
        if (view2 != null && (layoutParams3 = view2.getLayoutParams()) != null) {
            numValueOf = Integer.valueOf(layoutParams3.height);
        }
        c424580Gkq.setImageDrawable(C452170HoF.LIZIZ(context, iLIZ3, iLIZ2, numValueOf2, numValueOf, R.raw.icon_camera_sticker_round_fill));
        C786410Ut5.K9(c424580Gkq, new View.OnClickListener() { // from class: X.0THX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                C1389890mGx c1389890mGx = new C1389890mGx(view3);
                c1389890mGx.LJIIIZ(2131848895);
                c1389890mGx.LJIIJJI();
            }
        });
        View view3 = this.LIZIZ;
        if (view3 != null && (layoutParams = view3.getLayoutParams()) != null) {
            layoutParams.width = (view3 == null || (layoutParams2 = view3.getLayoutParams()) == null) ? iLIZ2 : layoutParams2.width;
            if (view3 != null) {
                ViewGroup.LayoutParams layoutParams5 = view3.getLayoutParams();
                if (layoutParams5 != null) {
                    iLIZ2 = layoutParams5.height;
                }
                iLIZ = C1340260kyu.LIZ(view3);
            } else {
                iLIZ = 0;
            }
            layoutParams.height = iLIZ2 + iLIZ;
        }
        View view4 = this.LIZIZ;
        if (view4 != null) {
            view4.requestLayout();
        }
    }

    public final void LJFF() {
        C424580Gkq c424580Gkq;
        Comment comment;
        String cid;
        if (this.LJJIFFI || (c424580Gkq = this.LIZJ) == null || (comment = this.LJIJ) == null || (cid = comment.getCid()) == null) {
            return;
        }
        this.LJJIFFI = true;
        this.LJJII = cid;
        HandlerHook.viewPostDelay(c424580Gkq, this.LJJIIJ, 150L);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r8.LJIJ
            r7 = 0
            if (r0 == 0) goto L92
            int r0 = r0.getCommentType()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        Ld:
            X.0Q7z r1 = r8.LJIJJ
            if (r1 == 0) goto L90
            java.lang.ref.WeakReference<androidx.fragment.app.Fragment> r0 = r8.LJIIIIZZ
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r0.get()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
        L1b:
            com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility r0 = X.C1345760l7m.LIZLLL(r0, r1)
            if (r0 == 0) goto L90
            X.15jK r0 = r0.ad0()
            if (r0 == 0) goto L90
            java.util.List r0 = r0.LJII()
        L2b:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r0 == 0) goto L95
            java.util.Iterator r5 = r0.iterator()
        L36:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r1 = r5.next()
            X.0zJl r1 = (X.InterfaceC1891350zJl) r1
            boolean r0 = r1 instanceof X.C1340400kz8
            if (r0 == 0) goto L36
            X.0dPr r1 = (X.AbstractC1049450dPr) r1
            if (r1 == 0) goto L36
            com.ss.android.ugc.aweme.comment.model.Comment r3 = r1.LIZ()
            if (r3 == 0) goto L36
            java.util.List r0 = r3.getImageList()
            r2 = 1
            if (r0 == 0) goto L36
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L36
            int r1 = r3.getCommentType()
            if (r6 == 0) goto L36
            int r0 = r6.intValue()
            if (r1 != r0) goto L36
            int r1 = r3.getCommentType()
            r0 = 2
            if (r1 != r0) goto L82
            java.lang.String r1 = r3.getRootCommentId()
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r8.LJIJ
            if (r0 == 0) goto L8c
            java.lang.String r0 = r0.getRootCommentId()
        L7c:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L88
        L82:
            int r0 = r3.getCommentType()
            if (r0 != r2) goto L36
        L88:
            r4.add(r3)
            goto L36
        L8c:
            r0 = r7
            goto L7c
        L8e:
            r0 = r7
            goto L1b
        L90:
            r0 = r7
            goto L2b
        L92:
            r6 = r7
            goto Ld
        L95:
            X.C1344010l4x.LIZLLL(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1341150l0L.LJI():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII() {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1341150l0L.LJII():void");
    }

    public final void LJIIIIZZ() {
        AbstractC1049450dPr abstractC1049450dPr;
        Comment commentLIZ;
        C20600815jK<InterfaceC1891350zJl> c20600815jKAd0;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LJIJJ;
        List<InterfaceC1891350zJl> listLJII = null;
        if (interfaceC665370Q7z != null) {
            WeakReference<Fragment> weakReference = this.LJIIIIZZ;
            ICommentListAssemAbility iCommentListAssemAbilityLIZLLL = C1345760l7m.LIZLLL(weakReference != null ? weakReference.get() : null, interfaceC665370Q7z);
            if (iCommentListAssemAbilityLIZLLL != null && (c20600815jKAd0 = iCommentListAssemAbilityLIZLLL.ad0()) != null) {
                listLJII = c20600815jKAd0.LJII();
            }
        }
        ArrayList arrayList = new ArrayList();
        if (listLJII != null) {
            for (InterfaceC1891350zJl interfaceC1891350zJl : listLJII) {
                if ((interfaceC1891350zJl instanceof C1340400kz8) && (abstractC1049450dPr = (AbstractC1049450dPr) interfaceC1891350zJl) != null && (commentLIZ = abstractC1049450dPr.LIZ()) != null && C1351950lHl.LJII(commentLIZ) && !commentLIZ.isUserBuried()) {
                    arrayList.add(commentLIZ);
                }
            }
        }
        C1344010l4x.LIZLLL(arrayList);
    }

    public final void LJIIIZ(CommentImageStruct commentImageStruct) {
        int progress;
        Context context;
        Integer numLIZJ;
        Context context2;
        Integer numLIZJ2;
        if (commentImageStruct != null) {
            progress = commentImageStruct.getProgress();
        } else {
            progress = 0;
        }
        if (progress != -1) {
            if (progress != 100) {
                View view = this.LJI;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                C426320Gne c426320Gne = this.LJ;
                if (c426320Gne != null) {
                    C786410Ut5.LLLZZ(c426320Gne, 0);
                }
                TuxIconView tuxIconView = this.LJFF;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                }
                View view2 = this.LJI;
                if (view2 != null && (context2 = view2.getContext()) != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.e6, context2)) != null) {
                    int iIntValue = numLIZJ2.intValue();
                    View view3 = this.LJI;
                    if (view3 != null) {
                        view3.setBackgroundColor(iIntValue);
                    }
                }
                C426320Gne c426320Gne2 = this.LJ;
                if (c426320Gne2 != null) {
                    c426320Gne2.LIZ(progress, false);
                    return;
                }
                return;
            }
            View view4 = this.LJI;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(8, view4);
            }
            C426320Gne c426320Gne3 = this.LJ;
            if (c426320Gne3 != null) {
                C786410Ut5.LLLZZ(c426320Gne3, 8);
            }
            TuxIconView tuxIconView2 = this.LJFF;
            if (tuxIconView2 == null) {
                return;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            return;
        }
        View view5 = this.LJI;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(0, view5);
        }
        TuxIconView tuxIconView3 = this.LJFF;
        if (tuxIconView3 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
        }
        C426320Gne c426320Gne4 = this.LJ;
        if (c426320Gne4 != null) {
            C786410Ut5.LLLZZ(c426320Gne4, 8);
        }
        View view6 = this.LJI;
        if (view6 == null || (context = view6.getContext()) == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.a1_, context)) == null) {
            return;
        }
        int iIntValue2 = numLIZJ.intValue();
        View view7 = this.LJI;
        if (view7 == null) {
            return;
        }
        view7.setBackgroundColor(iIntValue2);
    }
}
