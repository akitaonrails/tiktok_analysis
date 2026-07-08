package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.BaseSheet;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import u4.q0;

/* JADX INFO: renamed from: X.0mGQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class DialogC1389560mGQ extends DialogC1389100mFg {
    public static final /* synthetic */ int LLJLIL = 0;
    public final boolean LLJILJIL;
    public final int LLJILJILJ;
    public AbstractC343940De4 LLJILLL;
    public AbstractC343940De4 LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public View LLJJIJIIJIL;
    public final GradientDrawable LLJJIJIL;
    public ViewGroup LLJJJ;
    public final String LLJJJIL;
    public final String LLJJJJ;
    public boolean LLJJJJJIL;
    public C21647019ng LLJJJJLIIL;
    public C21647019ng LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final C1776900wLA LLJL;

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.LLJJJJJIL = false;
        C1378370lyN.LIZ.getClass();
        C1378370lyN.LIZ();
        super.onDetachedFromWindow();
    }

    @Override // X.C19GU, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (!C07XO.LIZ || this.LLJJLIIIJLLLLLLLZ) {
            LJLIIL();
            return;
        }
        C21647019ng c21647019ng = this.LLJJL;
        if (c21647019ng != null) {
            c21647019ng.LJI(true);
        }
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        Object obj;
        C21647019ng c21647019ng;
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJJ(this);
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW+o1UGj6gX46Kip5Arc8v", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
            super.show();
            c0wst.LIZ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
        }
        if (this.LLJILJIL) {
            View viewFindViewById = findViewById(R.id.fpl);
            if (viewFindViewById != null) {
                viewFindViewById.setImportantForAccessibility(2);
            }
        } else {
            ViewGroup viewGroup = this.LLJJJ;
            if (viewGroup != null) {
                C426750GoL.LJI(viewGroup);
            }
        }
        if (!C07XO.LIZ || (c21647019ng = this.LLJJJJLIIL) == null) {
            return;
        }
        c21647019ng.LJI(true);
    }

    public final void LJLI() {
        View viewFindViewById;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.fpl);
        if (viewGroup != null) {
            viewGroup.setBackground(this.LLJJIJIL);
            this.LLJJJ = viewGroup;
        }
        ViewGroup viewGroup2 = this.LLJJJ;
        if (viewGroup2 != null) {
            viewGroup2.setContentDescription(this.LLJJJJ);
            q0.LJIILL(viewGroup2, C20092413jW.LJI, this.LLJJJIL, new InterfaceC20092813ja() { // from class: X.0mGR
                @Override // X.InterfaceC20092813ja
                public final boolean LIZ(View view) {
                    DialogC1389560mGQ dialogC1389560mGQ = this.LIZ;
                    dialogC1389560mGQ.LLJILLL = C343990De9.LIZ;
                    dialogC1389560mGQ.cancel();
                    return true;
                }
            });
        }
        if (this.LLJJI) {
            C1175270ggn c1175270ggn = new C1175270ggn(getContext(), null, 6);
            c1175270ggn.setFitsSystemWindows(true);
            c1175270ggn.setRemoveTopInsets(true);
            LJLIIIL(c1175270ggn);
        } else if (this.LLJJIII && Build.VERSION.SDK_INT < 30) {
            ViewGroup c1091670eVx = new C1091670eVx(getContext(), null, 6);
            c1091670eVx.setFitsSystemWindows(true);
            LJLIIIL(c1091670eVx);
        } else if (this.LLJJIJI && Build.VERSION.SDK_INT >= 30 && (viewFindViewById = findViewById(R.id.eqx)) != null) {
            viewFindViewById.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: X.0m3U
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
                    if (view.getFitsSystemWindows()) {
                        View viewFindViewById2 = this.LIZ.findViewById(R.id.exx);
                        if (viewFindViewById2 != null) {
                            viewFindViewById2.setFitsSystemWindows(true);
                        }
                        View viewFindViewById3 = this.LIZ.findViewById(R.id.fpl);
                        if (viewFindViewById3 != null) {
                            viewFindViewById3.setFitsSystemWindows(true);
                        }
                        return view.onApplyWindowInsets(windowInsets);
                    }
                    DialogC1389560mGQ dialogC1389560mGQ = this.LIZ;
                    if (dialogC1389560mGQ.LLJJIJIIJIL == null) {
                        int i = insets.bottom;
                        dialogC1389560mGQ.getClass();
                        ViewGroup viewGroup3 = (ViewGroup) dialogC1389560mGQ.findViewById(android.R.id.content);
                        View view2 = new View(dialogC1389560mGQ.getContext());
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i);
                        layoutParams.gravity = 80;
                        C786410Ut5.W5(view2, layoutParams);
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a29, view2.getContext());
                        if (numLIZJ != null) {
                            view2.setBackgroundColor(numLIZJ.intValue());
                        }
                        if (viewGroup3 != null) {
                            viewGroup3.addView(view2);
                        }
                        dialogC1389560mGQ.LLJJIJIIJIL = view2;
                    }
                    view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), 0);
                    View viewFindViewById4 = this.LIZ.findViewById(R.id.exx);
                    if (viewFindViewById4 != null) {
                        viewFindViewById4.setFitsSystemWindows(false);
                    }
                    View viewFindViewById5 = this.LIZ.findViewById(R.id.fpl);
                    if (viewFindViewById5 == null) {
                        return windowInsets;
                    }
                    viewFindViewById5.setFitsSystemWindows(false);
                    return windowInsets;
                }
            });
        }
        ViewGroup viewGroup3 = this.LLJJJ;
        if (viewGroup3 != null) {
            Context context = getContext();
            EnumC19746112Nn enumC19746112Nn = EnumC19746112Nn.BEZIER;
            this.LLJJJJLIIL = new C21647019ng(context, viewGroup3, new C19746312Np(enumC19746112Nn, this.LLJL, Collections.singletonList(new C19746412Nq("alpha", new C0HUY(0.0f, 1.0f)))), false);
            C21647019ng c21647019ng = new C21647019ng(getContext(), viewGroup3, new C19746312Np(enumC19746112Nn, this.LLJL, Collections.singletonList(new C19746412Nq("alpha", new C0HUY(1.0f, 0.0f)))), false);
            c21647019ng.LIZJ("alpha", new C1402210map(this, 4));
            this.LLJJL = c21647019ng;
        }
    }

    public final void LJLIIL() {
        try {
            super.dismiss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJLIIIL(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.eqx);
        if (viewGroup2 == null) {
            return;
        }
        viewGroup.setId(viewGroup2.getId());
        C786410Ut5.X5(viewGroup2.getLayoutParams(), viewGroup);
        ViewParent parent = viewGroup2.getParent();
        if (parent instanceof ViewGroup) {
            int childCount = viewGroup2.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup2.getChildAt(i);
                C786410Ut5.LJJJLZIJ(childAt, viewGroup2);
                viewGroup.addView(childAt);
            }
            ViewGroup viewGroup3 = (ViewGroup) parent;
            C786410Ut5.LJJJLZIJ(viewGroup2, viewGroup3);
            viewGroup3.addView(viewGroup);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.LLJJJJJIL != z) {
            if (z) {
                C1378370lyN.LIZ.getClass();
                C1378370lyN.LIZIZ(this);
            } else {
                C1378370lyN.LIZ.getClass();
                C1378370lyN.LIZ();
            }
            this.LLJJJJJIL = z;
        }
    }

    @Override // X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(i);
        LJLI();
    }

    @Override // X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(view);
        LJLI();
    }

    public final void LJLIL(boolean z, boolean z2) {
        float f;
        float f2 = 0.0f;
        if (z) {
            String str = BaseSheet._pnsPageId;
            f = BaseSheet.LLJJI;
            if (z2) {
                String str2 = BaseSheet._pnsPageId;
                f2 = BaseSheet.LLJJI;
            }
        } else {
            f = 0.0f;
        }
        GradientDrawable gradientDrawable = this.LLJJIJIL;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadii(new float[]{f, f, f, f, f2, f2, f2, f2});
        }
    }

    @Override // X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        LJLI();
    }

    public DialogC1389560mGQ(Context context, int i, Integer num, GradientDrawable gradientDrawable, boolean z) {
        int color;
        Window window;
        WindowManager.LayoutParams attributes;
        super(context, R.style.sq);
        this.LLJILJIL = z;
        C343970De7 c343970De7 = C343970De7.LIZ;
        this.LLJILLL = c343970De7;
        this.LLJJ = c343970De7;
        this.LLJL = new C1776900wLA(new C1342130l1v(0.25f), new C1342130l1v(0.25f), new C1342130l1v(0.75f), new C1342130l1v(0.75f), 150L);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxSheet, i, 0);
        if (num != null) {
            color = num.intValue();
        } else {
            color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSheet__tux_sheetBackgroundColor, 1);
        }
        this.LLJILJILJ = color;
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxSheet__tux_sheetCloseLabel);
        this.LLJJJIL = strXd == null ? "" : strXd;
        String strXd2 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxSheet__tux_sheetContainerLabel);
        this.LLJJJJ = strXd2 != null ? strXd2 : "";
        typedArrayObtainStyledAttributes.recycle();
        Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(256);
        }
        if (Build.VERSION.SDK_INT >= 30 && (window = getWindow()) != null && (attributes = window.getAttributes()) != null) {
            attributes.setFitInsetsSides(0);
        }
        if (gradientDrawable != null) {
            this.LLJJIJIL = gradientDrawable;
            return;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = Integer.valueOf(color);
        float f = BaseSheet.LLJJI;
        c384050F3z.LJIIIIZZ = Float.valueOf(f);
        c384050F3z.LJIIIZ = Float.valueOf(f);
        this.LLJJIJIL = (GradientDrawable) c384050F3z.LIZ(context);
    }
}
