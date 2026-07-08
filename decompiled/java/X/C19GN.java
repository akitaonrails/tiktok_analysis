package X;

import Y.ACListenerS166S0100000_32;
import Y.ARunnableS25S0110000_6;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;

/* JADX INFO: renamed from: X.19GN, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19GN extends C19GI {
    public static final Float LLLLIIL = Float.valueOf(17.0f);
    public static final Float LLLLIILL;
    public static final Float LLLLIILLL;
    public static final Float LLLLIL;
    public Context LLIZLLLIL;
    public C16F5 LLJ;
    public C16F5 LLJI;
    public C16F5 LLJIJIL;
    public C16F5 LLJILJIL;
    public C16F5 LLJILJILJ;
    public C16F5 LLJILLL;
    public CharSequence LLJJ;
    public ImageView LLJJI;
    public ImageView LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public View LLJJJIL;
    public FrameLayout LLJJJJ;
    public FrameLayout LLJJJJJIL;
    public FrameLayout LLJJJJLIIL;
    public FrameLayout LLJJL;
    public FrameLayout LLJJLIIIJLLLLLLLZ;
    public C21538519Qx LLJL;
    public CharSequence LLJLIL;
    public CharSequence LLJLILLLLZIIL;
    public CharSequence LLJLL;
    public CharSequence LLJLLIL;
    public String LLJLLL;
    public String LLJZ;
    public int LLJZIJLIL;
    public int LLL;
    public DialogInterface.OnClickListener LLLF;
    public DialogInterface.OnClickListener LLLFF;
    public View.OnClickListener LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public int LLLIIIIL;
    public DialogInterface.OnDismissListener LLLIIIL;
    public DialogInterface.OnShowListener LLLIIL;
    public int LLLIILIL;
    public int LLLIL;
    public boolean LLLILZ;
    public View LLLILZJ;
    public View LLLILZLLLI;
    public int LLLIZZ;
    public boolean LLLJ;
    public String LLLJIL;
    public String LLLJL;
    public float LLLL;
    public C19GP LLLLII;
    public boolean LLLLIIIILLL;

    @Override // X.C19GI
    public final boolean LJJLL() {
        return true;
    }

    @Override // X.C19GI
    public final boolean LJJZ() {
        return false;
    }

    static {
        Float fValueOf = Float.valueOf(15.0f);
        LLLLIILL = fValueOf;
        LLLLIILLL = Float.valueOf(8.0f);
        LLLLIL = fValueOf;
    }

    @Override // X.C19GI
    public final String LJJLIIJ() {
        CharSequence charSequence = this.LLJLLIL;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // X.C19GI
    public final String LJJLJ() {
        CharSequence charSequence = this.LLJLL;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // X.C19GI
    public final String LJJLJLI() {
        CharSequence charSequence = this.LLJLIL;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final int LJJZZI() {
        int iLIZIZ = (int) C497740JfY.LIZIZ(310.0f);
        int iLJIIJ = (int) (((double) C12ES.LJIIJ(this.LLIZLLLIL)) * 0.8d);
        return iLJIIJ <= iLIZIZ ? iLJIIJ : iLIZIZ;
    }

    @Override // X.C19GI, X.DialogC21505919Ej, android.app.Dialog
    public final void onStart() throws JSONException {
        super.onStart();
        C21538519Qx c21538519Qx = this.LLJL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21538519Qx);
        c21538519Qx.setAlpha(0.0f);
        C786410Ut5.LJLLLLLL(0, this.LLLILZLLLI);
        C786410Ut5.LLJJJJ(this.LLJI, 0);
        this.LLJI.setTextIsSelectable(this.LLLJ);
        if (!TextUtils.isEmpty(this.LLJJ)) {
            this.LLJI.setText(this.LLJJ);
        } else if (TextUtils.isEmpty(this.LLJLLL)) {
            C786410Ut5.LJLLLLLL(8, this.LLLILZLLLI);
        } else {
            this.LLJI.setText(this.LLJLLL);
        }
        this.LLJI.setGravity(this.LLLIIIIL);
        boolean zIsEmpty = TextUtils.isEmpty(this.LLJLIL);
        Float f = LLLLIIL;
        if (zIsEmpty) {
            this.LLJI.setTextSize(1, f.floatValue());
            this.LLJI.setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, this.LLIZLLLIL));
        } else {
            this.LLJ.setText(this.LLJLIL);
            this.LLJI.setTextSize(1, LLLLIILL.floatValue());
            this.LLJI.setTextColor(C20736316Cj.LIZIZ(R.attr.ex3, this.LLIZLLLIL));
        }
        if (this.LLJLILLLLZIIL != null) {
            C786410Ut5.LLJJJJ(this.LLJIJIL, 0);
            this.LLJIJIL.setText(this.LLJLILLLLZIIL);
            if (this.LLLFFI != null) {
                this.LLJIJIL.setTextColor(C20736316Cj.LIZIZ(R.attr.eu5, this.LLIZLLLIL));
                C786410Ut5.l8(this.LLJIJIL, this.LLLFFI);
            }
            this.LLJIJIL.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, this.LLL, 0);
        }
        this.LLJILJILJ.setText(this.LLJLL);
        this.LLJJJJ.setBackgroundColor(0);
        if (TextUtils.isEmpty(this.LLJLLIL)) {
            C786410Ut5.LLJJJJ(this.LLJILJIL, 8);
            C786410Ut5.LJLLLLLL(8, this.LLJJJ);
            this.LLJILJILJ.setBackgroundResource(R.drawable.fee);
        } else {
            this.LLJILJIL.setText(this.LLJLLIL);
        }
        if (TextUtils.isEmpty(this.LLJZ)) {
            this.LLJILJIL.setTextColor(C20736316Cj.LIZIZ(R.attr.ex3, this.LLIZLLLIL));
            C1119920fFW.LJI(400, this.LLJILJIL);
            C786410Ut5.LLJJJJ(this.LLJILLL, 8);
            C786410Ut5.LJLLLLLL(8, this.LLJJJIL);
        } else {
            this.LLJILLL.setText(this.LLJZ);
        }
        if (TextUtils.isEmpty(this.LLJLIL)) {
            C786410Ut5.LLJJJJ(this.LLJ, 8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.LLLILZLLLI.getLayoutParams();
            if (this.LLLILZJ == null || this.LLJZIJLIL > 0) {
                layoutParams.topMargin = (int) C497740JfY.LIZIZ(24.0f);
            } else {
                layoutParams.topMargin = (int) C497740JfY.LIZIZ(16.0f);
            }
            C786410Ut5.W5(this.LLLILZLLLI, layoutParams);
            this.LLJI.setTextSize(1, 17.0f);
        }
        int i = this.LLJZIJLIL;
        if (i > 0) {
            if (i == Integer.MAX_VALUE) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.LLJJI.getLayoutParams();
                layoutParams2.height = (int) (LJJZZI() / this.LLLL);
                C786410Ut5.c6(this.LLJJI, layoutParams2);
                this.LLJJI.setAdjustViewBounds(false);
                this.LLJJI.setScaleType(ImageView.ScaleType.CENTER_CROP);
                this.LLLLII.LIZ(this.LLJJI, this.LLLJIL, this.LLLJL);
            } else {
                this.LLJJI.setImageResource(i);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLJ.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 0, 0);
            C786410Ut5.y6(this.LLJ, marginLayoutParams);
        } else if (this.LLLILZJ != null) {
            C786410Ut5.LJZ(8, this.LLJJJJ);
            C786410Ut5.LJZ(0, this.LLJJJJLIIL);
            int i2 = this.LLLIILIL;
            int iLIZIZ = i2 == 0 ? -2 : (int) C497740JfY.LIZIZ(i2);
            int i3 = this.LLLIL;
            this.LLJJL.addView(this.LLLILZJ, 0, new FrameLayout.LayoutParams(iLIZIZ, i3 == 0 ? -2 : (int) C497740JfY.LIZIZ(i3)));
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.LLJ.getLayoutParams();
            marginLayoutParams2.setMargins(0, (int) C497740JfY.LIZIZ(16.0f), 0, 0);
            C786410Ut5.y6(this.LLJ, marginLayoutParams2);
        } else {
            C786410Ut5.LJZ(8, this.LLJJJJ);
        }
        if (this.LLJJIJIL != null) {
            this.LLJ.setTextSize(1, f.floatValue());
            C786410Ut5.LJZ(0, this.LLJJLIIIJLLLLLLLZ);
            this.LLJJLIIIJLLLLLLLZ.addView(this.LLJJIJIL, 0, new FrameLayout.LayoutParams(-1, -2, 17));
        }
        if (!this.LLLIIII) {
            this.LLJILJILJ.setEnabled(false);
        }
        setCancelable(this.LLLILZ);
        DialogInterface.OnDismissListener onDismissListener = this.LLLIIIL;
        if (onDismissListener != null) {
            setOnDismissListener(onDismissListener);
        }
        DialogInterface.OnShowListener onShowListener = this.LLLIIL;
        if (onShowListener != null) {
            setOnShowListener(onShowListener);
        }
        C786410Ut5.l8(this.LLJILJIL, new ACListenerS166S0100000_32(this, 65));
        C786410Ut5.l8(this.LLJILJILJ, new ACListenerS166S0100000_32(this, 66));
        C786410Ut5.l8(this.LLJILLL, new ACListenerS166S0100000_32(this, 67));
        C786410Ut5.Q7(this.LLJJIII, new ACListenerS166S0100000_32(this, 68));
        try {
            LJJZZIII(this.LLJL, true);
            setContentView(this.LLJJIJI);
            Window window = getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.ajq);
                window.setBackgroundDrawableResource(R.color.dr);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.dimAmount = 0.5f;
                window.addFlags(2);
                attributes.gravity = 1;
                attributes.width = LJJZZI();
                window.setAttributes(attributes);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (this.LLLILZ && this.LLLLIIIILLL) {
            C786410Ut5.I7(new ACListenerS166S0100000_32(this, 69), findViewById(R.id.wrapper_layout));
        }
    }

    @Override // X.C19GI
    public final String LJJLIIIJLLLLLLLZ() {
        return this.LLJLLL;
    }

    public C19GN(Context context) {
        super(context);
        this.LLLIIII = true;
        this.LLLILZ = true;
        this.LLLIZZ = -1;
        this.LLLLIIIILLL = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19GN.onCreate(android.os.Bundle):void");
    }

    public C19GN(Context context, C19GO c19go) {
        super(context, c19go);
        this.LLLIIII = true;
        this.LLLILZ = true;
        this.LLLIZZ = -1;
        this.LLLLIIIILLL = true;
    }

    public static void LJJZZIII(C21538519Qx c21538519Qx, boolean z) {
        if (c21538519Qx == null) {
            return;
        }
        HandlerHook.viewPost(c21538519Qx, new ARunnableS25S0110000_6((Object) c21538519Qx, z, 3));
    }
}
