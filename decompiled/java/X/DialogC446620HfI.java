package X;

import Y.ACListenerS141S0100000_6;
import Y.ACListenerS41S0201000_6;
import Y.ARunnableS15S0400000_6;
import Y.ATListenerS440S0100000_6;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS18S1210000_18;
import kotlin.jvm.internal.AwS22S1210000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HfI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class DialogC446620HfI extends AbstractDialogC1171850gbH {
    public final Context LLILZLL;
    public final int[] LLIZ;
    public final Function0<Unit> LLIZLLLIL;
    public final Function2<CollectionDetail, Integer, Unit> LLJ;
    public final Function0<Unit> LLJI;
    public final String LLJIJIL;
    public final boolean LLJILJIL;
    public LinearLayout LLJILJILJ;
    public List<CollectionDetail> LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public final float LLJJIJI;
    public final int LLJJIJIIJIL;

    @Override // X.C19GU, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        View view;
        View view2 = this.LLJJIII;
        if (view2 != null) {
            LJJZZI(view2, false);
        }
        this.LLJJIII = null;
        C21616519il c21616519ilLJIILLIIL = C1619980sG4.LJIILLIIL(this.LLJJ, AbstractC21616419ik.LJIILL, 0.3f);
        c21616519ilLJIILLIIL.LJI(1.0f);
        C21616519il c21616519ilLJIILLIIL2 = C1619980sG4.LJIILLIIL(this.LLJJ, AbstractC21616419ik.LJIILLIIL, 0.3f);
        c21616519ilLJIILLIIL2.LJI(1.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJJ, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(150L);
        View view3 = this.LLJJ;
        if (view3 == null || view3.getParent() == null || (view = this.LLJJ) == null) {
            return;
        }
        HandlerHook.viewPost(view, new ARunnableS15S0400000_6(objectAnimatorOfFloat, c21616519ilLJIILLIIL, c21616519ilLJIILLIIL2, this, 7));
    }

    @Override // X.InterfaceViewOnTouchListenerC1171830gbF
    public final void Di(List<CollectionDetail> list) {
        boolean z;
        int i;
        int size;
        int i2;
        List listLL;
        int iIntValue;
        LinearLayout linearLayout;
        WindowManager.LayoutParams attributes;
        int iIntValue2;
        Context context = this.LLILZLL;
        int i3 = R.style.y3;
        View viewSd = C786410Ut5.Sd(R.layout.i7_, C786410Ut5.ne(new C1361400lX0(context, R.style.y3)), null);
        this.LLJILJILJ = (LinearLayout) viewSd.findViewById(R.id.l52);
        this.LLJILLL = list;
        View viewFindViewById = viewSd.findViewById(R.id.p5w);
        this.LLJJI = null;
        List<CollectionDetail> list2 = this.LLJILLL;
        int iIntValue3 = 0;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C1378990lzN.LIZIZ(viewSd.findViewById(R.id.cover), Float.valueOf(C418440Gaw.LIZIZ(4)), null, null, null, null, 30);
            this.LLJJI = viewFindViewById;
            if (C2533409wK.LIZ()) {
                viewFindViewById.setOnTouchListener(new ATListenerS440S0100000_6(this, 12));
            } else {
                C786410Ut5.I7(new ACListenerS141S0100000_6(this, 154), viewFindViewById);
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            LinearLayout linearLayout2 = this.LLJILJILJ;
            if (linearLayout2 != null) {
                C786410Ut5.LJZL(8, linearLayout2);
            }
            i2 = 1;
        } else {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
            LinearLayout linearLayout3 = this.LLJILJILJ;
            if (linearLayout3 != null) {
                C786410Ut5.LJZL(0, linearLayout3);
            }
            List<CollectionDetail> list3 = this.LLJILLL;
            if (list3 != null && (listLL = C13LP.LL(list3, 3)) != null) {
                int i4 = 0;
                i = 0;
                for (Object obj : listLL) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        CollectionDetail collectionDetail = (CollectionDetail) obj;
                        C426290Gnb c426290Gnb = new C426290Gnb(this.LLILZLL);
                        c426290Gnb.setCollectionDetail(collectionDetail);
                        c426290Gnb.setTag(new C446630HfJ(collectionDetail, i4));
                        if (C2533409wK.LIZ()) {
                            c426290Gnb.setOnTouchListener(new ATListenerS440S0100000_6(this, 12));
                        } else {
                            C786410Ut5.qb(c426290Gnb, new ACListenerS41S0201000_6(this, collectionDetail, i4, 6));
                        }
                        LinearLayout linearLayout4 = this.LLJILJILJ;
                        if (linearLayout4 != null) {
                            linearLayout4.addView(c426290Gnb);
                        }
                        LinearLayout linearLayout5 = this.LLJILJILJ;
                        if (linearLayout5 != null) {
                            View view = new View(new C1361400lX0(this.LLILZLL, i3));
                            C786410Ut5.W5(view, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(180)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)))));
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, view.getContext());
                            if (numLIZJ != null) {
                                iIntValue = numLIZJ.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            view.setBackgroundColor(iIntValue);
                            linearLayout5.addView(view);
                        }
                        i++;
                        Integer num = collectionDetail.type;
                        if (num != null && num.intValue() == 1 && this.LLJILJIL) {
                            C1367960lha.LIZ.getClass();
                            C1367960lha.LIZ().onWantToGoShow();
                        }
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_from", this.LLJIJIL);
                        c2344009Gk.LJIIIIZZ("collection_id", collectionDetail.id);
                        c2344009Gk.LJIIIIZZ("enter_method", "click_bubble");
                        c2344009Gk.LJIIIIZZ("collection_name", collectionDetail.name);
                        c2344009Gk.LIZJ(i4, "order");
                        C20684815ws.LJIILLIIL("show_favourite_collection", c2344009Gk.LIZ);
                        i4 = i5;
                        i3 = R.style.y3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                i = 0;
            }
            List<CollectionDetail> list4 = this.LLJILLL;
            if (list4 != null) {
                size = list4.size();
            } else {
                size = 0;
            }
            if (size >= 4) {
                C426290Gnb c426290Gnb2 = new C426290Gnb(this.LLILZLL);
                C786410Ut5.LLLLLLZZ(c426290Gnb2.LLILLJJLI, 0);
                c426290Gnb2.LL.setText(c426290Gnb2.getContext().getString(2131836859));
                TuxIconView tuxIconView = c426290Gnb2.LLILLJJLI;
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_ellipsis_horizontal_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                tuxIconView.setTuxIcon(c419910GdJ);
                c426290Gnb2.setTag(C446660HfM.LIZ);
                if (C2533409wK.LIZ()) {
                    c426290Gnb2.setOnTouchListener(new ATListenerS440S0100000_6(this, 12));
                } else {
                    C786410Ut5.qb(c426290Gnb2, new ACListenerS141S0100000_6(this, 155));
                }
                LinearLayout linearLayout6 = this.LLJILJILJ;
                if (linearLayout6 != null) {
                    linearLayout6.addView(c426290Gnb2);
                }
            } else {
                C426290Gnb c426290Gnb3 = new C426290Gnb(this.LLILZLL);
                C786410Ut5.LLLLLLZZ(c426290Gnb3.LLILLJJLI, 0);
                c426290Gnb3.LL.setText(c426290Gnb3.getContext().getString(2131836860));
                TuxIconView tuxIconView2 = c426290Gnb3.LLILLJJLI;
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_plus_fill;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.a1j);
                c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                tuxIconView2.setTuxIcon(c419910GdJ2);
                c426290Gnb3.setTag(C446670HfN.LIZ);
                if (C2533409wK.LIZ()) {
                    c426290Gnb3.setOnTouchListener(new ATListenerS440S0100000_6(this, 12));
                } else {
                    C786410Ut5.qb(c426290Gnb3, new ACListenerS141S0100000_6(this, 156));
                }
                LinearLayout linearLayout7 = this.LLJILJILJ;
                if (linearLayout7 != null) {
                    linearLayout7.addView(c426290Gnb3);
                }
            }
            i2 = i + 1;
        }
        Window window = getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            Integer numLJJIIJ = C13LQ.LJJIIJ(1, this.LLIZ);
            if (numLJJIIJ != null) {
                iIntValue2 = numLJJIIJ.intValue();
            } else {
                iIntValue2 = 0;
            }
            Integer numLJJIIJ2 = C13LQ.LJJIIJ(3, this.LLIZ);
            if (numLJJIIJ2 != null) {
                iIntValue3 = numLJJIIJ2.intValue();
            }
            attributes.y = (((iIntValue2 + iIntValue3) / 2) - ((i2 * this.LLJJIJIIJIL) / 2)) - C12ES.LJIIJJI(window.getContext());
        }
        this.LLJJ = viewSd;
        setContentView(viewSd);
        if (C2533409wK.LIZ() && (linearLayout = this.LLJILJILJ) != null) {
            linearLayout.setOnTouchListener(new ATListenerS440S0100000_6(this, 11));
        }
    }

    @Override // X.InterfaceViewOnTouchListenerC1171830gbF
    public final void LJJ(boolean z) throws Throwable {
        DialogC19728412Gs dialogC19728412Gs;
        Object obj;
        View view;
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOypdZDc1SYJh7FSwtQaJ5OuoLl2EYAwyyYek258TcqX2VnWFmhdvX3GcoTIsUP96avhzyT2yIjVNCibVN0CK1YYm7ZXr6H6JMV6OlI=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/favorites/business/collection/quickfavorite/AbstractQuickFavoritePanelDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/favorites/business/collection/quickfavorite/AbstractQuickFavoritePanelDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null && (obj = objArr2[0]) != null) {
                dialogC19728412Gs = (DialogC19728412Gs) obj;
            } else {
                dialogC19728412Gs = this;
            }
            dialogC19728412Gs.show();
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/favorites/business/collection/quickfavorite/AbstractQuickFavoritePanelDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
        }
        C21616519il c21616519ilLJIILLIIL = C1619980sG4.LJIILLIIL(this.LLJJ, AbstractC21616419ik.LJIILL, 1.0f);
        c21616519ilLJIILLIIL.LJI(0.3f);
        C21616519il c21616519ilLJIILLIIL2 = C1619980sG4.LJIILLIIL(this.LLJJ, AbstractC21616419ik.LJIILLIIL, 1.0f);
        c21616519ilLJIILLIIL2.LJI(0.3f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJJ, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(150L);
        View view2 = this.LLJJ;
        if (view2 != null && view2.getParent() != null && (view = this.LLJJ) != null) {
            HandlerHook.viewPost(view, new ARunnableS15S0400000_6(objectAnimatorOfFloat, c21616519ilLJIILLIIL, c21616519ilLJIILLIIL2, this, 8));
        }
        new C0ZDN(this.LLILZLL).LIZ(0);
    }

    public final boolean LJJZZIII(MotionEvent motionEvent) {
        Object tag;
        AbstractC446650HfL abstractC446650HfL;
        int actionMasked = motionEvent.getActionMasked();
        View view = null;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return false;
                    }
                    View view2 = this.LLJJIII;
                    if (view2 != null) {
                        LJJZZI(view2, false);
                    }
                    this.LLJJIII = null;
                    return true;
                }
            } else {
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                View view3 = this.LLJJI;
                if (view3 != null && view3.getVisibility() == 0 && LJL(rawX, rawY, view3)) {
                    new C0ZDN(this.LLILZLL).LIZ(0);
                    this.LLIZLLLIL.invoke();
                    dismiss();
                    C785410UrT.LIZ(this);
                } else {
                    LinearLayout linearLayout = this.LLJILJILJ;
                    if (linearLayout != null) {
                        int childCount = linearLayout.getChildCount();
                        int i = 0;
                        while (true) {
                            if (i < childCount) {
                                View childAt = linearLayout.getChildAt(i);
                                if (childAt.getVisibility() == 0 && (childAt.getTag() instanceof AbstractC446650HfL) && LJL(rawX, rawY, childAt)) {
                                    tag = childAt.getTag();
                                    break;
                                }
                                i++;
                            } else {
                                tag = null;
                                break;
                            }
                        }
                        if ((tag instanceof AbstractC446650HfL) && (abstractC446650HfL = (AbstractC446650HfL) tag) != null) {
                            new C0ZDN(this.LLILZLL).LIZ(0);
                            if (abstractC446650HfL instanceof C446630HfJ) {
                                C446630HfJ c446630HfJ = (C446630HfJ) abstractC446650HfL;
                                this.LLJ.invoke(c446630HfJ.LIZ, Integer.valueOf(c446630HfJ.LIZIZ));
                            } else if (Intrinsics.LJFF(abstractC446650HfL, C446660HfM.LIZ)) {
                                this.LLJI.invoke();
                            } else if (Intrinsics.LJFF(abstractC446650HfL, C446670HfN.LIZ)) {
                                this.LLIZLLLIL.invoke();
                            } else {
                                throw new C1954807lC();
                            }
                            dismiss();
                            C785410UrT.LIZ(this);
                        }
                    }
                }
                View view4 = this.LLJJIII;
                if (view4 != null) {
                    LJJZZI(view4, false);
                }
                this.LLJJIII = null;
                return true;
            }
        }
        int rawX2 = (int) motionEvent.getRawX();
        int rawY2 = (int) motionEvent.getRawY();
        View view5 = this.LLJJI;
        if (view5 != null && view5.getVisibility() == 0 && LJL(rawX2, rawY2, view5)) {
            view = view5;
        } else {
            LinearLayout linearLayout2 = this.LLJILJILJ;
            if (linearLayout2 != null) {
                int childCount2 = linearLayout2.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount2) {
                        break;
                    }
                    View childAt2 = linearLayout2.getChildAt(i2);
                    if (childAt2.getVisibility() == 0 && (childAt2.getTag() instanceof AbstractC446650HfL) && LJL(rawX2, rawY2, childAt2)) {
                        view = childAt2;
                        break;
                    }
                    i2++;
                }
            }
        }
        if (!Intrinsics.LJFF(view, this.LLJJIII)) {
            View view6 = this.LLJJIII;
            if (view6 != null) {
                LJJZZI(view6, false);
            }
            this.LLJJIII = view;
            if (view != null) {
                new C0ZDN(this.LLILZLL).LIZ(0);
                LJJZZI(view, true);
            }
        }
        return true;
    }

    public final void LJJZZI(View view, boolean z) {
        int iIntValue = 0;
        if (view instanceof C426290Gnb) {
            C426290Gnb c426290Gnb = (C426290Gnb) view;
            if (z) {
                View view2 = c426290Gnb.LLILZ;
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, c426290Gnb.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                }
                view2.setBackgroundColor(iIntValue);
                return;
            }
            c426290Gnb.LLILZ.setBackground(null);
            return;
        }
        if (z) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, this.LLILZLL);
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            }
            view.setBackgroundColor(iIntValue);
            return;
        }
        view.setBackground(null);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view != null && motionEvent != null) {
            return LJJZZIII(motionEvent);
        }
        return false;
    }

    @Override // X.InterfaceViewOnTouchListenerC1171830gbF
    public final boolean s1(MotionEvent motionEvent, View view) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        if (!isShowing()) {
            return false;
        }
        if (!C2533409wK.LIZ()) {
            return true;
        }
        return LJJZZIII(motionEvent);
    }

    public static boolean LJL(int i, int i2, View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        return new Rect(i3, iArr[1], view.getWidth() + i3, iArr[1] + view.getHeight()).contains(i, i2);
    }

    public DialogC446620HfI(Context context, int[] iArr, AwS18S1210000_18 awS18S1210000_18, AwS22S1210000_12 awS22S1210000_12, AwS18S1210000_18 awS18S1210000_182, String str, boolean z) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int i;
        float f;
        super(context);
        this.LLILZLL = context;
        this.LLIZ = iArr;
        this.LLIZLLLIL = awS18S1210000_18;
        this.LLJ = awS22S1210000_12;
        this.LLJI = awS18S1210000_182;
        this.LLJIJIL = str;
        this.LLJILJIL = z;
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            window.setDimAmount(0.3f);
            Integer numLJJIIJ = C13LQ.LJJIIJ(0, iArr);
            if (numLJJIIJ != null) {
                iIntValue = numLJJIIJ.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numLJJIIJ2 = C13LQ.LJJIIJ(1, iArr);
            if (numLJJIIJ2 != null) {
                iIntValue2 = numLJJIIJ2.intValue();
            } else {
                iIntValue2 = 0;
            }
            Integer numLJJIIJ3 = C13LQ.LJJIIJ(2, iArr);
            if (numLJJIIJ3 != null) {
                iIntValue3 = numLJJIIJ3.intValue();
            } else {
                iIntValue3 = 0;
            }
            Integer numLJJIIJ4 = C13LQ.LJJIIJ(3, iArr);
            int iIntValue4 = numLJJIIJ4 != null ? numLJJIIJ4.intValue() : 0;
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                int iLJIIJJI = C12ES.LJIIJJI(window.getContext());
                if (C444960Hcc.LIZIZ()) {
                    i = 8388659;
                } else {
                    i = 8388661;
                }
                attributes.gravity = i;
                int iLJIIJ = C12ES.LJIIJ(context);
                int iLJIIIIZZ = C12ES.LJIIIIZZ(context);
                iLJIIJ = iLJIIJ > iLJIIIIZZ ? iLJIIIIZZ : iLJIIJ;
                if (C444960Hcc.LIZIZ()) {
                    f = iIntValue3;
                } else {
                    f = iLJIIJ - iIntValue;
                }
                attributes.x = (int) (f - this.LLJJIJI);
                attributes.y = (((iIntValue2 + iIntValue4) / 2) - iLJIIJJI) - (this.LLJJIJIIJIL / 2);
            }
        }
        this.LLJJIJI = C418440Gaw.LIZIZ(8);
        this.LLJJIJIIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
    }
}
