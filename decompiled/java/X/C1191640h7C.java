package X;

import Y.ACListenerS153S0100000_18;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0h7C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191640h7C implements InterfaceC1192080h7u {
    public final Function0<InterfaceC1191710h7J> LIZ;
    public final Function0<Integer> LIZIZ;
    public final C1191680h7G LIZJ;
    public final Function0<String> LIZLLL;
    public final Function0<Boolean> LJ;
    public final Function0<Unit> LJFF;
    public ViewGroup LJI;
    public ViewGroup LJII;
    public SmartImageView LJIIIIZZ;
    public SmartImageView LJIIIZ;
    public SmartImageView LJIIJ;
    public View LJIIJJI;
    public TuxTextView LJIIL;
    public TuxIconView LJIILIIL;
    public int LJIILJJIL;
    public InterfaceC1191840h7W LJIILL;
    public final ACListenerS153S0100000_18 LJIILLIIL = new ACListenerS153S0100000_18(this, 179);

    @Override // X.InterfaceC1192080h7u
    public final boolean LIZ() {
        return false;
    }

    public final ArrayList<PoiGalleryAnchorData> LJ() {
        ArrayList<PoiGalleryAnchorData> arrayList = new ArrayList<>();
        int[] iArr = new int[2];
        SmartImageView smartImageView = this.LJIIIIZZ;
        if (smartImageView != null && smartImageView.getVisibility() == 0) {
            smartImageView.getLocationOnScreen(iArr);
            arrayList.add(new PoiGalleryAnchorData(smartImageView.getWidth(), smartImageView.getHeight(), iArr[0], iArr[1], 240));
        }
        SmartImageView smartImageView2 = this.LJIIIZ;
        if (smartImageView2 != null && smartImageView2.getVisibility() == 0) {
            smartImageView2.getLocationOnScreen(iArr);
            arrayList.add(new PoiGalleryAnchorData(smartImageView2.getWidth(), smartImageView2.getHeight(), iArr[0], iArr[1], 240));
        }
        SmartImageView smartImageView3 = this.LJIIJ;
        if (smartImageView3 != null && smartImageView3.getVisibility() == 0) {
            smartImageView3.getLocationOnScreen(iArr);
            arrayList.add(new PoiGalleryAnchorData(smartImageView3.getWidth(), smartImageView3.getHeight(), iArr[0], iArr[1], 240));
        }
        return arrayList;
    }

    public final View LJFF() {
        AbstractRefactorPoiReviewCell abstractRefactorPoiReviewCellLLLLLLIL;
        InterfaceC1191840h7W interfaceC1191840h7W = this.LJIILL;
        if (interfaceC1191840h7W == null || (abstractRefactorPoiReviewCellLLLLLLIL = interfaceC1191840h7W.LLLLLLIL()) == null) {
            return null;
        }
        return abstractRefactorPoiReviewCellLLLLLLIL.itemView;
    }

    public final InterfaceC1191710h7J LJI() {
        return this.LIZ.invoke();
    }

    @Override // X.InterfaceC1192080h7u
    public final void LIZIZ(InterfaceC1191840h7W interfaceC1191840h7W) {
        int iLIZIZ;
        SmartImageView smartImageView;
        SmartImageView smartImageView2;
        SmartImageView smartImageView3;
        Drawable drawableLIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C19ME c19me;
        ViewGroup.LayoutParams layoutParams;
        this.LJIILL = interfaceC1191840h7W;
        View view = interfaceC1191840h7W.LLLLLLIL().itemView;
        this.LJI = (ViewGroup) view.findViewById(R.id.kc4);
        this.LJII = (ViewGroup) view.findViewById(R.id.tgq);
        interfaceC1191840h7W.y5(this.LJI, "imageGrid.imageContainer");
        Function2<View, View, Unit> function2 = this.LIZJ.LJFF;
        if (function2 != null) {
            View view2 = this.LJI;
            if (view2 == null) {
                view2 = view;
            }
            function2.invoke(view2, this.LJII);
        }
        Function1<Integer, Integer> function1 = this.LIZJ.LJ;
        if (function1 != null) {
            iLIZIZ = function1.invoke(Integer.valueOf(C0FV2.LIZIZ(view.getContext()))).intValue();
        } else if (C297470BlJ.LIZ()) {
            iLIZIZ = C814420VxA.LIZIZ((((C0FV2.LIZIZ(view.getContext()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * 2)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))) / 3.0f);
        } else {
            iLIZIZ = C814420VxA.LIZIZ(((C0FV2.LIZIZ(view.getContext()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * 2)) / 3.0f);
        }
        this.LJIILJJIL = iLIZIZ;
        ViewGroup viewGroup = this.LJI;
        if (viewGroup != null && (smartImageView = (SmartImageView) viewGroup.findViewById(R.id.tgn)) != null) {
            int i = this.LJIILJJIL;
            C786410Ut5.G6(smartImageView, new LinearLayout.LayoutParams(i, i));
        } else {
            smartImageView = null;
        }
        this.LJIIIIZZ = smartImageView;
        ViewGroup viewGroup2 = this.LJI;
        if (viewGroup2 != null && (smartImageView2 = (SmartImageView) viewGroup2.findViewById(R.id.tgo)) != null) {
            int i2 = this.LJIILJJIL;
            C786410Ut5.G6(smartImageView2, new LinearLayout.LayoutParams(i2, i2));
        } else {
            smartImageView2 = null;
        }
        this.LJIIIZ = smartImageView2;
        ViewGroup viewGroup3 = this.LJI;
        if (viewGroup3 != null && (smartImageView3 = (SmartImageView) viewGroup3.findViewById(R.id.tgp)) != null) {
            int i3 = this.LJIILJJIL;
            C786410Ut5.G6(smartImageView3, new LinearLayout.LayoutParams(i3, i3));
        } else {
            smartImageView3 = null;
        }
        this.LJIIJ = smartImageView3;
        SmartImageView smartImageView4 = this.LJIIIIZZ;
        if (smartImageView4 != null) {
            C786410Ut5.Q8(smartImageView4, this.LJIILLIIL);
        }
        SmartImageView smartImageView5 = this.LJIIIZ;
        if (smartImageView5 != null) {
            C786410Ut5.Q8(smartImageView5, this.LJIILLIIL);
        }
        SmartImageView smartImageView6 = this.LJIIJ;
        if (smartImageView6 != null) {
            C786410Ut5.Q8(smartImageView6, this.LJIILLIIL);
        }
        SmartImageView smartImageView7 = this.LJIIIIZZ;
        if (smartImageView7 != null) {
            smartImageView7.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 30));
        }
        SmartImageView smartImageView8 = this.LJIIIZ;
        if (smartImageView8 != null) {
            smartImageView8.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 31));
        }
        SmartImageView smartImageView9 = this.LJIIJ;
        if (smartImageView9 != null) {
            smartImageView9.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 32));
        }
        this.LJIIJJI = view.findViewById(R.id.olm);
        this.LJIIL = (TuxTextView) view.findViewById(R.id.oll);
        this.LJIILIIL = (TuxIconView) view.findViewById(R.id.oln);
        Function1<Context, Drawable> function12 = this.LIZJ.LJI;
        if (function12 == null || (drawableLIZ = function12.invoke(view.getContext())) == null) {
            if (C297470BlJ.LIZ()) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1_);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
                drawableLIZ = c384050F3z.LIZ(view.getContext());
            } else {
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZIZ = Integer.valueOf(R.attr.e3);
                c384050F3z2.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                drawableLIZ = c384050F3z2.LIZ(view.getContext());
            }
        }
        View view3 = this.LJIIJJI;
        if (view3 != null) {
            view3.setBackground(drawableLIZ);
            if (this.LIZJ.LJIIIIZZ && C297470BlJ.LIZ() && (layoutParams = view3.getLayoutParams()) != null) {
                int i4 = this.LJIILJJIL;
                layoutParams.width = i4;
                layoutParams.height = i4;
            }
            C786410Ut5.I7(new ACListenerS153S0100000_18(this, 180), view3);
        }
        if (C297470BlJ.LIZ() && this.LIZJ.LJIIIZ) {
            ViewGroup viewGroup4 = this.LJI;
            if (viewGroup4 != null) {
                ViewGroup.LayoutParams layoutParams2 = viewGroup4.getLayoutParams();
                if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
                    ((ViewGroup.MarginLayoutParams) c19me).width = 0;
                    ((ViewGroup.MarginLayoutParams) c19me).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    c19me.startToStart = R.id.ji7;
                    c19me.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
                    c19me.endToEnd = 0;
                    C786410Ut5.X5(c19me, viewGroup4);
                }
            }
            ViewGroup viewGroup5 = this.LJII;
            if (viewGroup5 != null) {
                viewGroup5.setPadding(0, 0, 0, 0);
            }
            SmartImageView smartImageView10 = this.LJIIIIZZ;
            if (smartImageView10 != null) {
                C1378990lzN.LIZIZ(smartImageView10, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
            }
            SmartImageView smartImageView11 = this.LJIIIZ;
            if (smartImageView11 != null) {
                C1378990lzN.LIZIZ(smartImageView11, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
            }
            SmartImageView smartImageView12 = this.LJIIJ;
            if (smartImageView12 != null) {
                C1378990lzN.LIZIZ(smartImageView12, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
            }
            View view4 = this.LJIIJJI;
            if (view4 != null) {
                view4.setPadding(0, 0, 0, 0);
                C1189060h32.LJJII(view4, 0, 0, 0, 0);
                if (view4 instanceof LinearLayout) {
                    ((LinearLayout) view4).setGravity(17);
                }
                ViewGroup.LayoutParams layoutParams3 = view4.getLayoutParams();
                if ((layoutParams3 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                    marginLayoutParams.setMarginEnd(0);
                    marginLayoutParams.bottomMargin = 0;
                    C786410Ut5.W5(view4, marginLayoutParams);
                }
            }
            TuxTextView tuxTextView = this.LJIIL;
            if (tuxTextView != null) {
                tuxTextView.setTextColorRes(R.attr.zi);
                tuxTextView.setTuxFont(22);
                ViewGroup.LayoutParams layoutParams4 = tuxTextView.getLayoutParams();
                if ((layoutParams4 instanceof C19ME) && layoutParams4 != null) {
                    tuxTextView.setWidth(-2);
                    tuxTextView.setHeight(-2);
                    C786410Ut5.R6(tuxTextView, layoutParams4);
                }
            }
            TuxIconView tuxIconView = this.LJIILIIL;
            if (tuxIconView != null) {
                C786410Ut5.LJLLLLLL(8, tuxIconView);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2 A[PHI: r18 r19
      0x00a2: PHI (r18v5 java.lang.Integer) = (r18v1 java.lang.Integer), (r18v6 java.lang.Integer) binds: [B:52:0x00be, B:43:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r19v4 com.ss.android.ugc.aweme.base.model.UrlModel) = (r19v0 com.ss.android.ugc.aweme.base.model.UrlModel), (r19v5 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:52:0x00be, B:43:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1 A[PHI: r18 r19
      0x00c1: PHI (r18v2 java.lang.Integer) = (r18v1 java.lang.Integer), (r18v5 java.lang.Integer) binds: [B:52:0x00be, B:45:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x00c1: PHI (r19v1 com.ss.android.ugc.aweme.base.model.UrlModel) = (r19v0 com.ss.android.ugc.aweme.base.model.UrlModel), (r19v4 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:52:0x00be, B:45:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1191390h6n LIZLLL(com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi.PoiReviewModel r24) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1191640h7C.LIZLLL(com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi$PoiReviewModel):X.0h6n");
    }

    @Override // X.InterfaceC1192080h7u
    public final void onResume(boolean z) {
        InterfaceC1191710h7J interfaceC1191710h7JLJI;
        if (z && (interfaceC1191710h7JLJI = LJI()) != null) {
            interfaceC1191710h7JLJI.iC(null);
        }
    }

    @Override // X.InterfaceC1192080h7u
    public final void LIZJ(PoiReviewsApi.PoiReviewModel poiReviewModel, List<? extends Object> list) {
        List<PoiReviewsApi.ImageDataModel> list2;
        int size;
        String strValueOf;
        List<PoiReviewsApi.ImageDataModel> list3;
        SmartImageView smartImageView;
        View viewLJFF;
        Context context;
        UrlModel urlModel;
        int iIntValue;
        int i = 1;
        if ((!list.isEmpty()) || !C297460BlI.LIZ()) {
            return;
        }
        ViewGroup viewGroup = this.LJI;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        SmartImageView smartImageView2 = this.LJIIIIZZ;
        if (smartImageView2 != null) {
            C786410Ut5.LLFF(8, smartImageView2);
        }
        SmartImageView smartImageView3 = this.LJIIIZ;
        if (smartImageView3 != null) {
            C786410Ut5.LLFF(8, smartImageView3);
        }
        SmartImageView smartImageView4 = this.LJIIJ;
        if (smartImageView4 != null) {
            C786410Ut5.LLFF(8, smartImageView4);
        }
        PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
        if (content != null && (list3 = content.images) != null && (!list3.isEmpty())) {
            ViewGroup viewGroup2 = this.LJI;
            if (viewGroup2 != null) {
                C786410Ut5.LJLZ(0, viewGroup2);
            }
            int i2 = 0;
            for (Object obj : C13LP.LL(C13LP.LJJJJLI(list3), 3)) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    PoiReviewsApi.ImageDataModel imageDataModel = (PoiReviewsApi.ImageDataModel) obj;
                    if (i2 != 0) {
                        if (i2 != i) {
                            if (i2 == 2) {
                                smartImageView = this.LJIIJ;
                            } else {
                                i2 = i3;
                                i = 1;
                            }
                        } else {
                            smartImageView = this.LJIIIZ;
                        }
                    } else {
                        smartImageView = this.LJIIIIZZ;
                    }
                    if (smartImageView != null && (viewLJFF = LJFF()) != null && (context = viewLJFF.getContext()) != null) {
                        C1180600gpO c1180600gpO = new C1180600gpO(this.LIZJ.LIZ, "poi_reviews_image", new C1180560gpK(context, EnumC1177490gkN.FALLBACK_26_PX, new C1180580gpM(Float.valueOf(C418440Gaw.LIZIZ(12))), null));
                        if (imageDataModel != null) {
                            urlModel = imageDataModel.cropImage;
                        } else {
                            urlModel = null;
                        }
                        C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZ(urlModel));
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c7, context);
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        } else {
                            iIntValue = -1;
                        }
                        c1189360h3WLIZ.LIZ.LJIJJ = new ColorDrawable(iIntValue);
                        C1331750klB c1331750klB = new C1331750klB();
                        c1331750klB.LJ = C418440Gaw.LIZIZ(12);
                        c1331750klB.LJII = EnumC1203020hPY.BITMAP_ONLY;
                        c1189360h3WLIZ.LIZ.LJJI = new C1331730kl9(c1331750klB);
                        c1189360h3WLIZ.LIZLLL(smartImageView);
                        c1189360h3WLIZ.LIZIZ();
                        C786410Ut5.LLFF(0, smartImageView);
                    }
                    i2 = i3;
                    i = 1;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        PoiReviewsApi.PoiReviewContentModel content2 = poiReviewModel.getContent();
        if (content2 != null && (list2 = content2.images) != null && (size = list2.size() - 3) > 0) {
            TuxTextView tuxTextView = this.LJIIL;
            if (tuxTextView != null) {
                if (this.LIZJ.LJII) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('+');
                    sbLIZ.append(size);
                    strValueOf = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strValueOf = String.valueOf(size);
                }
                tuxTextView.setText(strValueOf);
            }
            View view = this.LJIIJJI;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
                return;
            }
            return;
        }
        View view2 = this.LJIIJJI;
        if (view2 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1191640h7C(Function0<? extends InterfaceC1191710h7J> function0, Function0<Integer> function02, C1191680h7G c1191680h7G, Function0<String> function03, Function0<Boolean> function04, Function0<Unit> function05) {
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZJ = c1191680h7G;
        this.LIZLLL = function03;
        this.LJ = function04;
        this.LJFF = function05;
    }
}
