package X;

import Y.ACListenerS155S0100000_21;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS121S0100000_21;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.text.NumberFormat;
import java.util.Collections;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.text.a0;
import u4.q0;

/* JADX INFO: renamed from: X.0mHN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class DialogC1390150mHN extends DialogC19728412Gs {
    public static final /* synthetic */ int LLJJIJI = 0;
    public float LL;
    public boolean LLILLJJLI;
    public String LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public InterfaceC1389630mGX LLILZLL;
    public View LLIZ;
    public TuxIconView LLIZLLLIL;
    public C426320Gne LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public final C1390140mHM LLJILJIL;
    public final View LLJILJILJ;
    public final ARunnableS121S0100000_21 LLJILLL;
    public final String LLJJ;
    public final AwS585S0100000_6 LLJJI;
    public boolean LLJJIII;

    public final void LJL() {
        View view = this.LLIZ;
        if (view != null) {
            view.setContentDescription(this.LLILLL);
            q0.LJJIFFI(view, (CharSequence) this.LLJJI.invoke(Float.valueOf(this.LL)));
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (C1389890mGx.LJFF < 4) {
            super.cancel();
            return;
        }
        this.LLJJIII = true;
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS113S0100000_13(this, 169));
        C786410Ut5.LJLIIL(300L, bPEAHandler, new ARunnableS113S0100000_13(this, 170));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (C1389890mGx.LJFF < 4) {
            super.dismiss();
        } else {
            if (this.LLJJIII) {
                LJJZZIII();
                return;
            }
            BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
            C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS113S0100000_13(this, 171));
            C786410Ut5.LJLIIL(300L, bPEAHandler, new ARunnableS113S0100000_13(this, 172));
        }
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() {
        Object obj;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW+pFQCz/9M4OWjqlBps0sZo4kglxFdH2hGN69iCfMPn6vj0zp", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
            super.show();
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
        }
        this.LLJJIII = false;
        if (C1389890mGx.LJFF >= 4) {
            LJJLIIIJLLLLLLLZ(true);
        }
    }

    public final void LJJZZI() {
        try {
            super.cancel();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJZZIII() {
        try {
            super.dismiss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public DialogC1390150mHN(Context context) {
        String str;
        super(C1388190mED.LJ(C1388190mED.LIZJ(context, true), context));
        this.LLILLJJLI = true;
        this.LLILZIL = true;
        this.LLJILJIL = new C1390140mHM();
        this.LLJILJILJ = C786410Ut5.Sd(R.layout.gv, C786410Ut5.ne(getContext()), null);
        this.LLJILLL = new ARunnableS121S0100000_21(this, 102);
        if (a0.LJJIZ(NumberFormat.getPercentInstance().format(0L), ' ', 0, false, 6) == -1) {
            str = "";
        } else {
            str = " ";
        }
        this.LLJJ = str;
        this.LLJJI = new AwS585S0100000_6(this, 257);
    }

    public final void LJJLIIIJLLLLLLLZ(boolean z) {
        float f;
        float f2;
        float f3;
        C19746312Np c19746312Np;
        View view = this.LLJILJILJ;
        if (view == null) {
            return;
        }
        float f4 = 0.8f;
        if (z) {
            f3 = 1.0f;
            f2 = 1.0f;
            f = 0.0f;
        } else {
            f = 1.0f;
            f2 = 0.0f;
            f3 = 0.8f;
            f4 = 1.0f;
        }
        if (C07XO.LIZ) {
            c19746312Np = new C19746312Np(EnumC19746112Nn.BEZIER, new C1776900wLA(new C1342130l1v(0.0f), new C1342130l1v(0.0f), new C1342130l1v(1.0f), new C1342130l1v(1.0f), 75L), Collections.singletonList(new C19746412Nq("alpha", new C0HUY(f, f2))));
        } else {
            c19746312Np = new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(1218.47f), new C1342130l1v(55.85f)), C1697810uHb.LJIIJJI(new C19746412Nq("alpha", new C0HUY(f, f2)), new C19746412Nq("scaleX", new C0HIW(f4, f3)), new C19746412Nq("scaleY", new C0HIX(f4, f3))));
        }
        try {
            new C21647019ng(view.getContext(), view, c19746312Np, false).LJI(true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJLIIJ(boolean z) {
        this.LLILLJJLI = z;
        LJJLL(this.LL, false);
    }

    public final void LJJLJ(boolean z) {
        this.LLILZ = z;
        if (z) {
            Window window = getWindow();
            if (window != null) {
                window.setDimAmount(C1389610mGV.LIZ());
                return;
            }
            return;
        }
        Window window2 = getWindow();
        if (window2 == null) {
            return;
        }
        window2.setDimAmount(0.0f);
    }

    public final void LJJLJLI(String str) {
        this.LLILLL = str;
        if (str != null && str.length() != 0) {
            TuxTextView tuxTextView = this.LLJIJIL;
            if (tuxTextView != null) {
                tuxTextView.setText(str);
            }
            TuxTextView tuxTextView2 = this.LLJIJIL;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
            }
        } else {
            TuxTextView tuxTextView3 = this.LLJIJIL;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
            }
        }
        LJL();
    }

    public final void LJJZ(boolean z) {
        this.LLILZIL = z;
        if (z) {
            TuxIconView tuxIconView = this.LLIZLLLIL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
            this.LLJILJIL.LIZIZ = this.LLJILLL;
            return;
        }
        TuxIconView tuxIconView2 = this.LLIZLLLIL;
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        }
        this.LLJILJIL.LIZIZ = null;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        Window window;
        Drawable drawableLIZ;
        WindowManager.LayoutParams attributes;
        super.onCreate(bundle);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.TuxLoadingProgressHUD, R.attr.y9, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxLoadingProgressHUD_tux_loadingProgressHUD_bgColor, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxLoadingProgressHUD_tux_loadingProgressHUD_bgRadius, 0.0f);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxLoadingProgressHUD_tux_loadingProgressHUD_newBgColor, 0);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxLoadingProgressHUD_tux_loadingProgressHUD_newBgRadius, 0.0f);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxLoadingProgressHUD_tux_loadingProgressHUD_clickActionLabel);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxLoadingProgressHUD_tux_loadingProgressHUD_closeIcon, 0);
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxLoadingProgressHUD_tux_loadingProgressHUD_closeIconColor, 0);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxLoadingProgressHUD_tux_loadingProgressHUD_textFont, 0);
        int color4 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxLoadingProgressHUD_tux_loadingProgressHUD_textColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        setCanceledOnTouchOutside(false);
        LJJLJ(this.LLILZ);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window3 = getWindow();
        if (window3 != null && (attributes = window3.getAttributes()) != null) {
            attributes.y = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-17));
        }
        setContentView(this.LLJILJILJ);
        this.LLIZ = findViewById(R.id.nwq);
        this.LLIZLLLIL = (TuxIconView) findViewById(R.id.e28);
        this.LLJ = (C426320Gne) findViewById(R.id.s_5);
        this.LLJI = (TuxTextView) findViewById(R.id.s9x);
        this.LLJIJIL = (TuxTextView) findViewById(R.id.o_8);
        View view = this.LLIZ;
        if (view != null) {
            if (C1389890mGx.LJFF >= 5) {
                C415490GQx c415490GQx = new C415490GQx();
                c415490GQx.LIZ(color2);
                c415490GQx.LIZIZ(dimension2);
                drawableLIZ = c415490GQx;
            } else {
                C384050F3z c384050F3z = new C384050F3z();
                if (C1389890mGx.LJFF >= 1) {
                    c384050F3z.LIZ = Integer.valueOf(color2);
                    c384050F3z.LIZJ = Float.valueOf(dimension2);
                } else {
                    c384050F3z.LIZ = Integer.valueOf(color);
                    c384050F3z.LIZJ = Float.valueOf(dimension);
                }
                drawableLIZ = c384050F3z.LIZ(getContext());
            }
            view.setBackground(drawableLIZ);
            C1390140mHM c1390140mHM = this.LLJILJIL;
            c1390140mHM.LIZ = strXd;
            int i2 = C20094413jq.LJIIZILJ;
            q0.LJIJ(view, (C20094213jo) c1390140mHM.LIZJ.getValue());
        }
        TuxIconView tuxIconView = this.LLIZLLLIL;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(resourceId);
            tuxIconView.setTintColor(color3);
            C786410Ut5.a9(tuxIconView, new ACListenerS155S0100000_21(this, 126));
        }
        TuxTextView tuxTextView = this.LLJI;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(i);
            tuxTextView.setTextColor(color4);
        }
        TuxTextView tuxTextView2 = this.LLJIJIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(i);
            tuxTextView2.setTextColor(color4);
        }
        LJJLL(this.LL, false);
        LJJLJLI(this.LLILLL);
        LJJZ(this.LLILZIL);
        if (C1389890mGx.LJFF >= 4 && (window = getWindow()) != null) {
            window.setWindowAnimations(-1);
        }
    }

    public final void LJJLL(float f, boolean z) {
        this.LL = f;
        C426320Gne c426320Gne = this.LLJ;
        if (c426320Gne != null) {
            c426320Gne.LIZ(f, z);
        }
        TuxTextView tuxTextView = this.LLJI;
        if (tuxTextView != null) {
            tuxTextView.setText((CharSequence) this.LLJJI.invoke(Float.valueOf(f)));
        }
        LJL();
        if (f == 100.0f && this.LLILLJJLI) {
            dismiss();
            C785410UrT.LIZ(this);
        }
    }
}
