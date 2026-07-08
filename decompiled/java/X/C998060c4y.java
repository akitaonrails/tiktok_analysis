package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0c4y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998060c4y implements InterfaceC998100c52<InterfaceC998070c4z> {
    public static final C998080c50 LLILZLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final InterfaceC998070c4z LL;
    public final C997320c3m LLILLJJLI = new C997320c3m(AFwS252S0000000_16.get$arr$(428));
    public final View LLILLL;
    public final TuxTextView LLILZ;
    public final RemoteImageView LLILZIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0c50] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C998060c4y.class, "container", "getContainer()Landroid/view/ViewGroup;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = new Object() { // from class: X.0c50
        };
    }

    public final ViewGroup LIZ() {
        C997320c3m c997320c3m = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (ViewGroup) c997320c3m.LIZ(this);
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
        this.LLILZ.setText(this.LL.getButtonText());
        View view = this.LLILLL;
        GradientDrawable gradientDrawable = new GradientDrawable();
        LLILZLL.getClass();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(C299670Bor.LIZ() ? 6 : 2)));
        gradientDrawable.setShape(0);
        view.setBackground(gradientDrawable);
        String strLIZ = this.LL.LIZ();
        if (strLIZ == null || strLIZ.length() <= 0) {
            C786410Ut5.l(this.LLILZIL, 8);
            return;
        }
        if (u.LJIIZILJ(strLIZ, ".webp", false)) {
            C1324840ka2.LIZIZ(this.LLILZIL, this.LL.LIZ(), -1, -1, false);
        } else {
            C1324840ka2.LJIIJ(this.LLILZIL, this.LL.LIZ(), -1, -1);
        }
        C786410Ut5.l(this.LLILZIL, 0);
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LL;
    }

    public C998060c4y(InterfaceC998070c4z interfaceC998070c4z) {
        this.LL = interfaceC998070c4z;
        if (LIZ().findViewById(R.id.eg8) == null) {
            LIZ().addView(C786410Ut5.Td(C786410Ut5.ne(LIZ().getContext()), R.layout.al6, LIZ(), false));
        }
        this.LLILLL = LIZ().findViewById(R.id.eg8);
        this.LLILZ = (TuxTextView) LIZ().findViewById(R.id.eg_);
        this.LLILZIL = (RemoteImageView) LIZ().findViewById(R.id.eg9);
    }

    @Override // X.InterfaceC998100c52
    public final void LLLIIL(int i) {
        C997370c3r.LIZ(this, i);
    }

    @Override // X.InterfaceC998100c52
    public final void XV1(int i) {
        C997370c3r.LIZIZ(this, i);
    }

    @Override // X.InterfaceC998100c52
    public final void m61(float f) {
        ViewGroup viewGroupLJIJI = ((InterfaceC997360c3q) Mh()).LJIJI();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewGroupLJIJI);
        viewGroupLJIJI.setRotation(f);
    }

    @Override // X.InterfaceC998100c52
    public final void setBackgroundColor(int i) {
        GradientDrawable gradientDrawable;
        View view = this.LLILLL;
        Drawable background = view.getBackground();
        if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
            gradientDrawable.setColor(i);
        }
        view.setBackground(view.getBackground());
    }

    @Override // X.InterfaceC998100c52
    public final void setVisibility(int i) {
        C997370c3r.LIZJ(this, 0);
    }
}
