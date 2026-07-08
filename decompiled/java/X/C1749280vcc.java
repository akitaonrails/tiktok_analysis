package X;

import Y.ARunnableS54S0300000_21;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.0vcc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1749280vcc extends FrameLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public C1CRB LLILLL;
    public TuxIconView LLILZ;
    public ImageView LLILZIL;
    public ImageView LLILZLL;
    public C197039127h LLIZ;
    public View LLIZLLLIL;
    public InterfaceC1235890iGZ LLJ;
    public InterfaceC1749320vcg LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public ARunnableS54S0300000_21 LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public final float LLJJI;
    public final float LLJJIII;
    public final int LLJJIJI;
    public final int LLJJIJIIJIL;
    public final int LLJJIJIL;
    public final int LLJJJ;
    public final int LLJJJIL;
    public final int LLJJJJ;
    public final int LLJJJJJIL;
    public InterfaceC878303bx LLJJJJLIIL;
    public final C20094413jq LLJJL;

    public C1749280vcc(Context context) {
        this(context, null, 6);
    }

    public C1749280vcc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZJ() {
        if (this.LLJILJIL) {
            return;
        }
        FrameLayout.inflate(getContext(), R.layout.h5, this);
        this.LL = (TuxTextView) findViewById(R.id.y3j);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.message_tv);
        this.LLILLL = (C1CRB) findViewById(R.id.w2c);
        this.LLILZ = (TuxIconView) findViewById(R.id.k1_);
        this.LLILZIL = (ImageView) findViewById(R.id.brw);
        this.LLILZLL = (ImageView) findViewById(R.id.k67);
        this.LLIZ = (C197039127h) findViewById(R.id.d6g);
        this.LLIZLLLIL = findViewById(R.id.ybm);
        float f = this.LLJJI;
        if (f > 0.0f) {
            setTopMarginInner(f);
        }
        float f2 = this.LLJJIII;
        if (f2 > 0.0f) {
            setButtonTopMarginInner(f2);
        }
        setLayoutVariantInner(this.LLJJ);
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setTuxFont(this.LLJJJJ);
        TuxTextView tuxTextView2 = this.LL;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        tuxTextView2.setTextColor(this.LLJJIJI);
        TuxTextView tuxTextView3 = this.LL;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        q0.LJIJI(tuxTextView3, true);
        TuxTextView tuxTextView4 = this.LLILLJJLI;
        if (tuxTextView4 == null) {
            tuxTextView4 = null;
        }
        tuxTextView4.setTuxFont(this.LLJJJJJIL);
        TuxTextView tuxTextView5 = this.LLILLJJLI;
        if (tuxTextView5 == null) {
            tuxTextView5 = null;
        }
        tuxTextView5.setTextColor(this.LLJJIJIIJIL);
        C1CRB c1crb = this.LLILLL;
        C1CRB c1crb2 = c1crb != null ? c1crb : null;
        int visibility = c1crb2.getVisibility();
        c1crb2.setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, c1crb2);
        this.LLJILJIL = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, X.0mHn, android.view.View] */
    public final void LJ() {
        if (this.LLJI == null) {
            final C259800zU c259800zU = new C259800zU();
            ?? FindViewById = findViewById(R.id.z1_);
            c259800zU.element = FindViewById;
            if (FindViewById == 0) {
                ?? c1390410mHn = new C1390410mHn(getContext(), null, 6);
                c1390410mHn.setId(R.id.z1_);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ);
                layoutParams.gravity = 17;
                C786410Ut5.V6(c1390410mHn, layoutParams);
                if (c1390410mHn.getParent() == null) {
                    addView(c1390410mHn);
                }
                c259800zU.element = c1390410mHn;
            }
            LIZ(new InterfaceC1749320vcg() { // from class: X.0Hu8
                @Override // X.InterfaceC1749320vcg
                public final void hide() {
                    C786410Ut5.LLLZZIL(c259800zU.element, 4);
                    c259800zU.element.LIZLLL();
                }

                @Override // X.InterfaceC1749320vcg
                public final void show() {
                    C786410Ut5.LLLZZIL(c259800zU.element, 0);
                    c259800zU.element.LIZJ();
                }
            });
        }
        InterfaceC1749320vcg interfaceC1749320vcg = this.LLJI;
        if (interfaceC1749320vcg != null) {
            interfaceC1749320vcg.show();
        }
        this.LLJIJIL = true;
        this.LLJILJILJ = null;
        setTouchDelegate(null);
        if (this.LLJILJIL) {
            C1CRB c1crb = this.LLILLL;
            if (c1crb == null) {
                c1crb = null;
            }
            int visibility = c1crb.getVisibility();
            c1crb.setVisibility(4);
            C1602160rnK.LIZIZ(visibility, 4, c1crb);
            TuxTextView tuxTextView = this.LL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            C786410Ut5.h9(tuxTextView, null);
            TuxTextView tuxTextView2 = this.LL;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            CharSequence text = tuxTextView2.getText();
            if (text == null) {
                text = "";
            }
            TuxTextView tuxTextView3 = this.LLILLJJLI;
            if (tuxTextView3 == null) {
                tuxTextView3 = null;
            }
            CharSequence text2 = tuxTextView3.getText();
            if (text2 == null) {
                text2 = "";
            }
            C197039127h c197039127h = this.LLIZ;
            if (c197039127h == null) {
                c197039127h = null;
            }
            CharSequence text3 = c197039127h.getText();
            new C1390470mHt(text, text2, text3 != null ? text3 : "", true, C1390480mHu.LIZ).LIZ(this);
        }
        InterfaceC878303bx interfaceC878303bx = this.LLJJJJLIIL;
        C1390480mHu c1390480mHu = C1390480mHu.LIZ;
        LIZLLL(interfaceC878303bx, c1390480mHu);
        this.LLJJJJLIIL = c1390480mHu;
        setContentDescription(null);
        setImportantForAccessibility(2);
    }

    public final InterfaceC1235890iGZ getStatusMonitor() {
        return this.LLJ;
    }

    private final void setButtonTopMarginInner(float f) {
        C197039127h c197039127h = this.LLIZ;
        if (c197039127h == null) {
            c197039127h = null;
        }
        C1CRC c1crc = (C1CRC) c197039127h.getLayoutParams();
        Context context = getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("message_tv.bottom+");
        sbLIZ.append(f);
        sbLIZ.append("px");
        c1crc.LIZJ = C2230281CQw.LIZ(context, C2188811AlT.LIZIZ(sbLIZ), "layout_top");
    }

    private final void setLayoutVariantInner(int i) {
        int i2;
        View view = this.LLIZLLLIL;
        View view2 = null;
        if (view == null) {
            view = null;
        }
        view.setTag(Integer.valueOf(i));
        if (i == 1) {
            i2 = this.LLJJJ;
        } else {
            i2 = this.LLJJJIL;
        }
        this.LLJILLL = i2;
        View view3 = this.LLIZLLLIL;
        if (view3 != null) {
            view2 = view3;
        }
        view2.requestLayout();
    }

    private final void setTopMarginInner(float f) {
        View view = this.LLIZLLLIL;
        if (view == null) {
            view = null;
        }
        C1CRC c1crc = (C1CRC) view.getLayoutParams();
        Context context = getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(f);
        sbLIZ.append("px");
        c1crc.LJII = C2230281CQw.LIZ(context, C2188811AlT.LIZIZ(sbLIZ), "layout_height");
    }

    public final void LIZ(InterfaceC1749320vcg interfaceC1749320vcg) {
        InterfaceC1749320vcg interfaceC1749320vcg2 = this.LLJI;
        if (interfaceC1749320vcg2 != null) {
            interfaceC1749320vcg2.hide();
        }
        this.LLJI = interfaceC1749320vcg;
    }

    public final void LIZIZ(final View view) {
        if (view.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            addView(view, layoutParams);
        }
        LIZ(new InterfaceC1749320vcg(view) { // from class: X.0vcf
            public final View LIZ;

            @Override // X.InterfaceC1749320vcg
            public final void hide() {
                C786410Ut5.LJLLLLLL(4, this.LIZ);
            }

            @Override // X.InterfaceC1749320vcg
            public final void show() {
                C786410Ut5.LJLLLLLL(0, this.LIZ);
            }

            {
                this.LIZ = view;
            }
        });
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        InterfaceC1235890iGZ interfaceC1235890iGZ;
        if (!z && (interfaceC1235890iGZ = this.LLJ) != null) {
            ((C1235880iGY) interfaceC1235890iGZ).LIZJ();
        }
        super.onVisibilityAggregated(z);
    }

    public final void setButtonTopMargin(float f) {
        LIZJ();
        setButtonTopMarginInner(f);
    }

    public final void setLayoutVariant(int i) {
        if (this.LLJILJIL) {
            setLayoutVariantInner(i);
        }
        this.LLJJ = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setStatus(X.C1722300uv6 r15) {
        /*
            Method dump skipped, instruction units count: 767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1749280vcc.setStatus(X.0uv6):void");
    }

    public final void setStatusMonitor(InterfaceC1235890iGZ interfaceC1235890iGZ) {
        this.LLJ = interfaceC1235890iGZ;
    }

    public final void setTopMargin(float f) {
        LIZJ();
        setTopMarginInner(f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        InterfaceC1235890iGZ interfaceC1235890iGZ;
        if ((i == 4 || i == 8) && getVisibility() == 0 && Intrinsics.LJFF(this.LLJJJJLIIL, C1390480mHu.LIZ) && (interfaceC1235890iGZ = this.LLJ) != null) {
            ((C1235880iGY) interfaceC1235890iGZ).LIZLLL(true);
        }
        super.setVisibility(i);
    }

    public final void LIZLLL(InterfaceC878303bx interfaceC878303bx, InterfaceC878303bx interfaceC878303bx2) {
        InterfaceC1235890iGZ interfaceC1235890iGZ = this.LLJ;
        if (interfaceC1235890iGZ != null) {
            C1235880iGY c1235880iGY = (C1235880iGY) interfaceC1235890iGZ;
            C878203bw c878203bw = C878203bw.LIZ;
            if (Intrinsics.LJFF(interfaceC878303bx2, c878203bw)) {
                c1235880iGY.LIZLLL(false);
            }
            if (Intrinsics.LJFF(interfaceC878303bx, c878203bw) && Intrinsics.LJFF(interfaceC878303bx2, C1390480mHu.LIZ) && c1235880iGY.LJFF > 0) {
                c1235880iGY.LIZIZ++;
                c1235880iGY.LIZJ = System.currentTimeMillis();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1749280vcc(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.yu;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        this.LLJJJJLIIL = C618310OMz.LIZ;
        C1397760mTe c1397760mTe = new C1397760mTe();
        c1397760mTe.LJ = new View.OnClickListener() { // from class: X.0vce
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ARunnableS54S0300000_21 aRunnableS54S0300000_21 = this.LL.LLJILJILJ;
                if (aRunnableS54S0300000_21 != null) {
                    aRunnableS54S0300000_21.run();
                }
            }
        };
        c1397760mTe.LJI = new C1749290vcd(this);
        this.LLJJL = c1397760mTe.LIZ();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxStatusView, i2, 0);
        this.LLJJ = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxStatusView_tux_layoutVariant, 0);
        this.LLJJI = typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxStatusView_tux_statusForceTopMargin, 0.0f);
        this.LLJJIII = typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxStatusView_tux_statusForceButtonTopMargin, 0.0f);
        this.LLJJIJI = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxStatusView__tux_statusTitleColor, -16777216);
        this.LLJJIJIIJIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxStatusView__tux_statusMessageColor, -16777216);
        this.LLJJIJIL = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxStatusView__tux_statusButtonVariant, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxStatusView__tux_statusButtonSize, 0);
        this.LLJJJIL = i3;
        this.LLJJJ = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxStatusView__tux_statusButtonSizeMedium, 0);
        this.LLJILLL = i3;
        this.LLJJJJ = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxStatusView__tux_statusTitleFont, 0);
        this.LLJJJJJIL = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxStatusView__tux_statusMessageFont, 0);
        typedArrayObtainStyledAttributes.recycle();
        setStatusMonitor(new C1235880iGY(this));
    }
}
