package com.bytedance.android.live.design.view.sheet.action;

import X.C0TVI;
import X.C14K9;
import X.C20097313kJ;
import X.C20736316Cj;
import X.C20745116Ft;
import X.C786410Ut5;
import X.C933130aOF;
import X.C933140aOG;
import X.C933150aOH;
import X.C933850aPP;
import X.C933860aPQ;
import X.C933870aPR;
import X.C935260aRg;
import X.C935270aRh;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS81S0300000_15;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.sheet.LiveFixedHeightSheetDialog;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class LiveActionSheetDialog extends LiveFixedHeightSheetDialog {
    public static final /* synthetic */ int LLL = 0;
    public LinearLayout LLJLILLLLZIIL;
    public View LLJLL;
    public TextView LLJLLIL;
    public final List<C933860aPQ> LLJLLL;
    public CharSequence LLJZ;
    public C933850aPP LLJZIJLIL;

    @Override // com.bytedance.android.live.design.view.sheet.LiveFixedHeightSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJLJ() {
        /*
            r4 = this;
            android.view.View r0 = r4.LLJLL
            if (r0 == 0) goto L63
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            java.util.List<X.0aPQ> r0 = r4.LLJLLL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            r3 = 0
            if (r0 <= 0) goto L64
            java.util.List<X.0aPQ> r0 = r4.LLJLLL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            X.0aPQ r0 = (X.C933860aPQ) r0
            java.util.List<X.0aPP> r0 = r0.LIZIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L64
            java.util.List<X.0aPQ> r0 = r4.LLJLLL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            X.0aPQ r0 = (X.C933860aPQ) r0
            java.util.List<X.0aPP> r0 = r0.LIZIZ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            X.0aPP r0 = (X.C933850aPP) r0
            X.0aOF r1 = r0.LIZIZ
            java.lang.CharSequence r0 = r4.LLJZ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L64
            boolean r0 = r1 instanceof X.C933140aOG
            if (r0 == 0) goto L64
            X.0aOG r1 = (X.C933140aOG) r1
            android.graphics.drawable.Drawable r0 = r1.LJ
            if (r0 == 0) goto L64
            android.view.View r0 = r4.LLJLL
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131297390(0x7f09046e, float:1.8212724E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.topMargin = r0
        L5e:
            android.view.View r0 = r4.LLJLL
            X.C786410Ut5.W5(r0, r2)
        L63:
            return
        L64:
            r2.topMargin = r3
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog.LJLJLJ():void");
    }

    public final void LJLJLLL() {
        if (this.LLJLLIL != null) {
            if (TextUtils.isEmpty(this.LLJZ)) {
                C786410Ut5.LLIL(this.LLJLLIL, 8);
            } else {
                this.LLJLLIL.setText(this.LLJZ);
                C786410Ut5.LLIL(this.LLJLLIL, 0);
            }
        }
        LJLJLJ();
    }

    public final int LJLLI(int i) {
        int size = 0;
        for (int i2 = 0; i2 < i; i2++) {
            size += ((ArrayList) ((C933860aPQ) ListProtector.get(this.LLJLLL, i2)).LIZIZ).size() * 2;
        }
        return size;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveFixedHeightSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C786410Ut5.Sd(R.layout.deb, getLayoutInflater(), null), new ViewGroup.LayoutParams(-1, -2));
        this.LLJLLIL = (TextView) findViewById(R.id.a4n);
        this.LLJLILLLLZIIL = (LinearLayout) findViewById(R.id.a4k);
        final int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.a5h);
        final int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.a57);
        C14K9.LJIJJ(this.LLJLILLLLZIIL, new C0TVI() { // from class: X.0TYF
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                int i = dimensionPixelSize;
                int i2 = dimensionPixelSize2;
                if (view != null) {
                    if (c20246014Ju.LIZ.LJIIJ().LIZLLL <= 0) {
                        i = i2;
                    }
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
                }
                return c20246014Ju;
            }
        });
        C20097313kJ.LIZJ(this.LLJLILLLLZIIL);
        View viewFindViewById = findViewById(R.id.a4m);
        this.LLJLL = viewFindViewById;
        if (this.LLJLLIL != null && this.LLJLILLLLZIIL != null && viewFindViewById != null) {
            LJLJLLL();
            for (int i = 0; i < ((ArrayList) this.LLJLLL).size(); i++) {
                LJLJJL(i, LJLLI(i), (C933860aPQ) ListProtector.get(this.LLJLLL, i));
            }
            LinearLayout linearLayout = this.LLJLILLLLZIIL;
            if (linearLayout != null && this.LLJZIJLIL != null) {
                LJLJJLL(linearLayout.getChildCount(), this.LLJZIJLIL);
                LJLJJI(false, this.LLJLILLLLZIIL.getChildCount(), this.LLJZIJLIL);
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, X.C19GU, android.app.Dialog
    public final void setTitle(int i) {
        setTitle(getContext().getResources().getString(i));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, X.C19GU, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.LLJZ = charSequence;
        LJLJLLL();
    }

    public LiveActionSheetDialog(Context context, C935270aRh c935270aRh) {
        List<C933130aOF> list;
        boolean z;
        super(context, c935270aRh);
        this.LLJLLL = new ArrayList();
        this.LLJZ = null;
        List<C935260aRg> list2 = c935270aRh.LIZJ;
        if (list2 != null && !((ArrayList) list2).isEmpty()) {
            for (C935260aRg c935260aRg : (ArrayList) c935270aRh.LIZJ) {
                int size = ((ArrayList) this.LLJLLL).size();
                if (size >= 0 && size <= ((ArrayList) this.LLJLLL).size() && c935260aRg != null && (list = c935260aRg.LIZIZ) != null && !list.isEmpty()) {
                    C933860aPQ c933860aPQ = new C933860aPQ();
                    Iterator<C933130aOF> it2 = c935260aRg.LIZIZ.iterator();
                    while (it2.hasNext()) {
                        ((ArrayList) c933860aPQ.LIZIZ).add(new C933850aPP(it2.next()));
                    }
                    if (size == ((ArrayList) this.LLJLLL).size()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ListProtector.add(this.LLJLLL, size, c933860aPQ);
                    if (this.LLJLILLLLZIIL != null) {
                        if (z && size > 0) {
                            LJLJJLL(LJLLI(size) - 1, (C933870aPR) ListProtector.get(this.LLJLLL, size - 1));
                        }
                        LJLJJL(size, LJLLI(size), c933860aPQ);
                    }
                    LJLJLJ();
                }
            }
        }
        C933150aOH c933150aOH = c935270aRh.LIZLLL;
        if (c933150aOH != null) {
            this.LLJZIJLIL = new C933850aPP(c933150aOH);
        }
    }

    public final void LJLJJLL(int i, C933870aPR c933870aPR) {
        if (c933870aPR.LIZ == null) {
            View view = new View(getContext());
            C786410Ut5.W5(view, new LinearLayout.LayoutParams(-1, view.getContext().getResources().getDimensionPixelSize(R.dimen.a64)));
            view.setBackgroundColor(C20736316Cj.LIZIZ(R.attr.fx5, view.getContext()));
            this.LLJLILLLLZIIL.addView(view, i);
            c933870aPR.LIZ = view;
        }
    }

    public final void LJLL(C933130aOF c933130aOF, C20745116Ft c20745116Ft) {
        if (c933130aOF instanceof C933140aOG) {
            c20745116Ft.setIcon(((C933140aOG) c933130aOF).LJ);
        }
        c20745116Ft.setIsShowRedDotView(c933130aOF.LIZLLL);
        c20745116Ft.setText(c933130aOF.LIZ);
        C786410Ut5.f8(c20745116Ft, new ACListenerS81S0300000_15(this, c933130aOF, c20745116Ft, 19));
        c20745116Ft.setEnabled(true);
        int i = c933130aOF.LIZIZ;
        c20745116Ft.LLILZ.LJI(i);
        c20745116Ft.LLJ.LJI(i);
    }

    public LiveActionSheetDialog(Context context, int i) {
        super(context, i);
        this.LLJLLL = new ArrayList();
    }

    public final void LJLJJI(boolean z, int i, C933850aPP c933850aPP) {
        C933130aOF c933130aOF = c933850aPP.LIZIZ;
        C20745116Ft c20745116Ft = new C20745116Ft(getContext(), null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20745116Ft);
        c20745116Ft.setLayoutParams(layoutParams);
        LJLL(c933130aOF, c20745116Ft);
        this.LLJLILLLLZIIL.addView(c20745116Ft, i);
        c933850aPP.LIZJ = c20745116Ft;
        if (z) {
            int i2 = i + 1;
            if (c933850aPP.LIZ == null) {
                View view = new View(getContext());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, view.getContext().getResources().getDimensionPixelSize(R.dimen.a4n));
                C933130aOF c933130aOF2 = c933850aPP.LIZIZ;
                if ((c933130aOF2 instanceof C933140aOG) && ((C933140aOG) c933130aOF2).LJ != null) {
                    int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.a5g);
                    layoutParams2.rightMargin = dimensionPixelSize;
                    layoutParams2.leftMargin = dimensionPixelSize;
                }
                C786410Ut5.W5(view, layoutParams2);
                view.setBackgroundColor(C20736316Cj.LIZIZ(R.attr.fxk, view.getContext()));
                this.LLJLILLLLZIIL.addView(view, i2);
                c933850aPP.LIZ = view;
            }
        }
    }

    public final void LJLJJL(int i, int i2, C933860aPQ c933860aPQ) {
        List<C933850aPP> list = c933860aPQ.LIZIZ;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            boolean z = true;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (i3 >= ((ArrayList) c933860aPQ.LIZIZ).size() - 1) {
                z = false;
            }
            LJLJJI(z, i2, (C933850aPP) ListProtector.get(arrayList, i3));
            i2 += 2;
            i3++;
        }
        if (i < ((ArrayList) this.LLJLLL).size() - 1) {
            LJLJJLL(LJLLI(i + 1) - 1, c933860aPQ);
        }
    }
}
