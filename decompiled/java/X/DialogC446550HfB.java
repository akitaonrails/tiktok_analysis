package X;

import Y.ACListenerS141S0100000_6;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS15S0400000_6;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.RectF;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS18S1210000_18;
import kotlin.jvm.internal.AwS22S1210000_12;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0HfB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class DialogC446550HfB extends AbstractDialogC1171850gbH {
    public final Context LLILZLL;
    public final int[] LLIZ;
    public final Function0<Unit> LLIZLLLIL;
    public final Function2<CollectionDetail, Integer, Unit> LLJ;
    public final Function0<Unit> LLJI;
    public final String LLJIJIL;
    public LinearLayout LLJILJIL;
    public List<CollectionDetail> LLJILJILJ;
    public int LLJILLL;
    public List<? extends RectF> LLJJ;
    public List<? extends RectF> LLJJI;
    public final float LLJJIII;
    public final float LLJJIJI;
    public final int LLJJIJIIJIL;
    public final int LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final List<C426280Gna> LLJJJJLIIL;
    public View LLJJL;
    public final ARunnableS106S0100000_6 LLJJLIIIJLLLLLLLZ;
    public final ARunnableS106S0100000_6 LLJL;

    @Override // X.C19GU, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        View view;
        LinearLayout linearLayout = this.LLJILJIL;
        if (linearLayout != null) {
            HandlerHook.viewRemoveCallbacks(linearLayout, this.LLJJLIIIJLLLLLLLZ);
            HandlerHook.viewRemoveCallbacks(linearLayout, this.LLJL);
        }
        C21616519il c21616519ilLJIILLIIL = C1619980sG4.LJIILLIIL(this.LLJJL, AbstractC21616419ik.LJIILL, 0.3f);
        c21616519ilLJIILLIIL.LJI(1.0f);
        C21616519il c21616519ilLJIILLIIL2 = C1619980sG4.LJIILLIIL(this.LLJJL, AbstractC21616419ik.LJIILLIIL, 0.3f);
        c21616519ilLJIILLIIL2.LJI(1.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJJL, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(150L);
        View view2 = this.LLJJL;
        if (view2 == null || view2.getParent() == null || (view = this.LLJJL) == null) {
            return;
        }
        HandlerHook.viewPost(view, new ARunnableS15S0400000_6(objectAnimatorOfFloat, c21616519ilLJIILLIIL, c21616519ilLJIILLIIL2, this, 5));
    }

    public final int LJJZZIII() {
        return ((Number) this.LLJJJIL.getValue()).intValue();
    }

    public final void LJL() {
        C426280Gna c426280Gna;
        int i = this.LLJILLL;
        if (i != -1) {
            if (i != -1 && (c426280Gna = (C426280Gna) C13LP.LJJJLZIJ(i, this.LLJJJJLIIL)) != null) {
                if (c426280Gna.LLILZIL) {
                    this.LLIZLLLIL.invoke();
                } else if (c426280Gna.LLILZLL) {
                    this.LLJI.invoke();
                } else {
                    CollectionDetail collectionDetail = c426280Gna.getCollectionDetail();
                    if (collectionDetail != null) {
                        this.LLJ.invoke(collectionDetail, c426280Gna.getCollectionDetailIndex());
                    }
                }
            }
            LJLI(-1);
            dismiss();
            C785410UrT.LIZ(this);
        }
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        Activity activityLIZ = C1388190mED.LIZ(this.LLILZLL);
        if (activityLIZ == null) {
            return;
        }
        C487280J9a.LIZ(activityLIZ.hashCode(), new InterfaceC487330J9f() { // from class: X.0HfC
            @Override // X.InterfaceC487330J9f
            public final void onConfigurationChanged(Activity activity, Configuration configuration) {
                C487280J9a.LIZJ(this);
                DialogC446550HfB dialogC446550HfB = this.LL;
                dialogC446550HfB.dismiss();
                C785410UrT.LIZ(dialogC446550HfB);
            }
        });
    }

    @Override // X.InterfaceViewOnTouchListenerC1171830gbF
    public final void Di(List<CollectionDetail> list) {
        boolean z;
        int size;
        List listLL;
        List listLJLJJLL;
        WindowManager.LayoutParams attributes;
        View viewSd = C786410Ut5.Sd(R.layout.cd0, C786410Ut5.ne(new C1361400lX0(this.LLILZLL, R.style.y3)), null);
        this.LLJJL = viewSd;
        this.LLJILJIL = (LinearLayout) viewSd.findViewById(R.id.l52);
        this.LLJILJILJ = list;
        View viewFindViewById = viewSd.findViewById(R.id.p5w);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS141S0100000_6(this, 153), viewFindViewById);
        }
        List<CollectionDetail> list2 = this.LLJILJILJ;
        int i = 0;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C1378990lzN.LIZIZ(viewSd.findViewById(R.id.cover), Float.valueOf(C418440Gaw.LIZIZ(6)), null, null, null, null, 30);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
            }
            LinearLayout linearLayout = this.LLJILJIL;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
            }
            Window window = getWindow();
            if (window != null && (attributes = window.getAttributes()) != null) {
                attributes.y = (((LJJZZIII() + ((Number) this.LLJJJJJIL.getValue()).intValue()) / 2) - (this.LLJJIJIL / 2)) - C12ES.LJIIJJI(window.getContext());
            }
        } else {
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            LinearLayout linearLayout2 = this.LLJILJIL;
            if (linearLayout2 != null) {
                C786410Ut5.LJZL(0, linearLayout2);
            }
            List<CollectionDetail> list3 = this.LLJILJILJ;
            if (list3 != null) {
                size = list3.size();
            } else {
                size = 0;
            }
            C426280Gna c426280Gna = new C426280Gna(this.LLILZLL);
            if (size >= 4) {
                c426280Gna.LLILZLL = true;
                C786410Ut5.LLLLLLZZ(c426280Gna.LLILLJJLI, 0);
                c426280Gna.LL.setText(c426280Gna.getContext().getString(2131836859));
                TuxIconView tuxIconView = c426280Gna.LLILLJJLI;
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_ellipsis_horizontal_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                tuxIconView.setTuxIcon(c419910GdJ);
            } else {
                c426280Gna.LLILZIL = true;
                C786410Ut5.LLLLLLZZ(c426280Gna.LLILLJJLI, 0);
                c426280Gna.LL.setText(c426280Gna.getContext().getString(2131836860));
                TuxIconView tuxIconView2 = c426280Gna.LLILLJJLI;
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_plus_fill;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.a1j);
                c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                tuxIconView2.setTuxIcon(c419910GdJ2);
            }
            ((ArrayList) this.LLJJJJLIIL).add(c426280Gna);
            LinearLayout linearLayout3 = this.LLJILJIL;
            if (linearLayout3 != null) {
                linearLayout3.addView(c426280Gna);
            }
            c426280Gna.LIZ();
            List<CollectionDetail> list4 = this.LLJILJILJ;
            if (list4 != null && (listLL = C13LP.LL(list4, 3)) != null && (listLJLJJLL = C13LP.LJLJJLL(listLL)) != null) {
                for (Object obj : listLJLJJLL) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        CollectionDetail collectionDetail = (CollectionDetail) obj;
                        C426280Gna c426280Gna2 = new C426280Gna(this.LLILZLL);
                        c426280Gna2.setCollectionDetail(collectionDetail);
                        int i3 = 2 - i;
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_from", this.LLJIJIL);
                        c2344009Gk.LJIIIIZZ("collection_id", collectionDetail.id);
                        c2344009Gk.LJIIIIZZ("enter_method", "click_bubble");
                        c2344009Gk.LJIIIIZZ("collection_name", collectionDetail.name);
                        c2344009Gk.LIZJ(i3, "order");
                        C20684815ws.LJIILLIIL("show_favourite_collection", c2344009Gk.LIZ);
                        c426280Gna2.setCollectionIndex(i3);
                        LinearLayout linearLayout4 = this.LLJILJIL;
                        if (linearLayout4 != null) {
                            linearLayout4.addView(c426280Gna2);
                        }
                        c426280Gna2.LIZ();
                        ((ArrayList) this.LLJJJJLIIL).add(c426280Gna2);
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            LinearLayout linearLayout5 = this.LLJILJIL;
            if (linearLayout5 != null) {
                linearLayout5.setOnTouchListener(this);
            }
            LinearLayout linearLayout6 = this.LLJILJIL;
            if (linearLayout6 != null) {
                HandlerHook.viewPost(linearLayout6, this.LLJJLIIIJLLLLLLLZ);
            }
            LinearLayout linearLayout7 = this.LLJILJIL;
            if (linearLayout7 != null) {
                HandlerHook.viewPost(linearLayout7, this.LLJL);
            }
        }
        setContentView(viewSd);
    }

    @Override // X.InterfaceViewOnTouchListenerC1171830gbF
    public final void LJJ(boolean z) throws Throwable {
        DialogC19728412Gs dialogC19728412Gs;
        Object obj;
        View view;
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOypdZDc1SYJh7FSwtQaJ5OuoLl2EYAwyyYek258TcqX2VnWFmhdvX3GcoTIr0n99LjtwDzG0bD6y972eFCai9+IvO1Q9NovScKj//RSag==", null);
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
        C21616519il c21616519ilLJIILLIIL = C1619980sG4.LJIILLIIL(this.LLJJL, AbstractC21616419ik.LJIILL, 1.0f);
        c21616519ilLJIILLIIL.LJI(0.3f);
        C21616519il c21616519ilLJIILLIIL2 = C1619980sG4.LJIILLIIL(this.LLJJL, AbstractC21616419ik.LJIILLIIL, 1.0f);
        c21616519ilLJIILLIIL2.LJI(0.3f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJJL, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(150L);
        View view2 = this.LLJJL;
        if (view2 != null && view2.getParent() != null && (view = this.LLJJL) != null) {
            HandlerHook.viewPost(view, new ARunnableS15S0400000_6(objectAnimatorOfFloat, c21616519ilLJIILLIIL, c21616519ilLJIILLIIL2, this, 6));
        }
        new C0ZDN(this.LLILZLL).LIZ(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLI(int r8) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC446550HfB.LJLI(int):void");
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        LinearLayout linearLayout = this.LLJILJIL;
        if (linearLayout != null) {
            HandlerHook.viewRemoveCallbacks(linearLayout, this.LLJJLIIIJLLLLLLLZ);
            HandlerHook.viewRemoveCallbacks(linearLayout, this.LLJL);
        }
        super.setOnDismissListener(onDismissListener);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return false;
                    }
                }
            }
            LJL();
            return true;
        }
        LJJZZI(this.LLJJI, motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // X.InterfaceViewOnTouchListenerC1171830gbF
    public final boolean s1(MotionEvent motionEvent, View view) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return false;
                }
            } else {
                LJJZZI(this.LLJJ, motionEvent.getX(), motionEvent.getY());
                return true;
            }
        }
        LJL();
        return true;
    }

    public final void LJJZZI(List list, float f, float f2) {
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (((RectF) it2.next()).contains(f, f2)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            LJLI(i);
        }
    }

    public DialogC446550HfB(Context context, int[] iArr, AwS18S1210000_18 awS18S1210000_18, AwS22S1210000_12 awS22S1210000_12, AwS18S1210000_18 awS18S1210000_182, String str) {
        int i;
        int iIntValue;
        super(context);
        this.LLILZLL = context;
        this.LLIZ = iArr;
        this.LLIZLLLIL = awS18S1210000_18;
        this.LLJ = awS22S1210000_12;
        this.LLJI = awS18S1210000_182;
        this.LLJIJIL = str;
        this.LLJILLL = -1;
        this.LLJJIII = C418440Gaw.LIZIZ(8);
        float fLIZIZ = C418440Gaw.LIZIZ(8);
        this.LLJJIJI = fLIZIZ;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90));
        this.LLJJIJIIJIL = iLIZIZ;
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        this.LLJJIJIL = iLIZIZ2;
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1445));
        this.LLJJJ = c01gwLIZIZ;
        this.LLJJJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1447));
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1446));
        this.LLJJJJ = c01gwLIZIZ2;
        C01GW c01gwLIZIZ3 = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1444));
        this.LLJJJJJIL = c01gwLIZIZ3;
        this.LLJJJJLIIL = new ArrayList();
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            window.setDimAmount(0.3f);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
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
                    iIntValue = ((Number) c01gwLIZIZ2.getValue()).intValue();
                } else {
                    iIntValue = iLJIIJ - ((Number) c01gwLIZIZ.getValue()).intValue();
                }
                attributes.x = (int) (iIntValue - fLIZIZ);
                attributes.y = ((((LJJZZIII() + ((Number) c01gwLIZIZ3.getValue()).intValue()) / 2) - C12ES.LJIIJJI(window.getContext())) - (iLIZIZ - iLIZIZ2)) - (iLIZIZ2 / 2);
            }
        }
        this.LLJJLIIIJLLLLLLLZ = new ARunnableS106S0100000_6(this, 278);
        this.LLJL = new ARunnableS106S0100000_6(this, 279);
    }
}
