package X;

import Y.ACListenerS166S0100000_32;
import Y.ATListenerS464S0100000_32;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.18S8, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18S8 extends AbstractC1664490tPr<C18S9, C18S7> {
    public View LLJJJIL;
    public TuxIconView LLJJJJ;
    public TuxIconView LLJJJJJIL;
    public View LLJJJJLIIL;
    public C420620GeS LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public Float LLJLIL;
    public float LLJLILLLLZIIL;
    public C367460Eau LLJLL;
    public C367460Eau LLJLLIL;
    public boolean LLJLLL;
    public C1777880wMk LLJZ;
    public ValueAnimator LLJZIJLIL;

    public final void LLLLLJIL(boolean z) {
        View view = this.LLJJJIL;
        if (view == null) {
            return;
        }
        if (!z) {
            view.setOnTouchListener(null);
        } else {
            view.setOnTouchListener(new ATListenerS464S0100000_32(this, 1));
        }
    }

    public final View LLLLLJLJLL(View view) {
        Context context;
        View rootView;
        float f;
        int i;
        Window window;
        View decorView;
        View viewFindViewById;
        View view2 = this.LLJL;
        if (view2 != null) {
            return view2;
        }
        View viewFindViewById2 = null;
        if ((view != null && (context = view.getContext()) != null) || (context = this.mActivity) != null) {
            int iN3 = C786410Ut5.n3(context.getResources(), "voice_box_tip_bg", FollowStatusChangeMethod.PARAM_UID, context.getPackageName());
            if (iN3 == 0) {
                return null;
            }
            Activity activity = this.mActivity;
            if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewFindViewById = decorView.findViewById(iN3)) != null) {
                viewFindViewById2 = viewFindViewById;
            } else if (view != null && (rootView = view.getRootView()) != null) {
                viewFindViewById2 = rootView.findViewById(iN3);
            }
            this.LLJL = viewFindViewById2;
            if (viewFindViewById2 != null) {
                if (this.LLJLIL == null) {
                    ViewGroup.LayoutParams layoutParams = viewFindViewById2.getLayoutParams();
                    if (layoutParams != null && (i = layoutParams.height) > 0) {
                        f = i;
                    } else {
                        f = context.getResources().getDisplayMetrics().density * 70.0f;
                    }
                    this.LLJLIL = Float.valueOf(f);
                }
                final int iLIZIZ = C420640GeU.LIZIZ(R.attr.zm, context);
                final float f2 = 70.0f * context.getResources().getDisplayMetrics().density;
                viewFindViewById2.setBackground(new Drawable(iLIZIZ, f2) { // from class: X.0Eam
                    public final int LIZ;
                    public final float LIZIZ;
                    public final Paint LIZJ;
                    public final RectF LIZLLL;

                    @Override // android.graphics.drawable.Drawable
                    public final int getOpacity() {
                        return -3;
                    }

                    @Override // android.graphics.drawable.Drawable
                    public final void setAlpha(int i2) {
                    }

                    @Override // android.graphics.drawable.Drawable
                    public final void setColorFilter(ColorFilter colorFilter) {
                    }

                    @Override // android.graphics.drawable.Drawable
                    public final void draw(Canvas canvas) {
                        canvas.drawRect(this.LIZLLL, this.LIZJ);
                    }

                    @Override // android.graphics.drawable.Drawable
                    public final void onBoundsChange(Rect rect) {
                        super.onBoundsChange(rect);
                        this.LIZLLL.set(rect.left, rect.top, rect.right, rect.bottom);
                        float fHeight = this.LIZLLL.height();
                        if (fHeight < 1.0f) {
                            fHeight = 1.0f;
                        }
                        float fLIZLLL = C13LZ.LIZLLL(this.LIZIZ, 0.0f, fHeight);
                        int[] iArr = new int[10];
                        float[] fArr = new float[10];
                        int iRed = Color.red(this.LIZ);
                        int iGreen = Color.green(this.LIZ);
                        int iBlue = Color.blue(this.LIZ);
                        for (int i2 = 0; i2 < 9; i2++) {
                            float f3 = i2 / 8;
                            float f4 = 1.0f - f3;
                            iArr[i2] = Color.argb(C13LZ.LJ((int) ((1.0f - ((f4 * f4) * f4)) * 255.0f), 0, 255), iRed, iGreen, iBlue);
                            fArr[i2] = C13LZ.LIZLLL((f3 * fLIZLLL) / fHeight, 0.0f, 1.0f);
                        }
                        iArr[9] = Color.argb(255, iRed, iGreen, iBlue);
                        fArr[9] = 1.0f;
                        Paint paint = this.LIZJ;
                        RectF rectF = this.LIZLLL;
                        float f5 = rectF.left;
                        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, fArr, Shader.TileMode.CLAMP));
                    }

                    {
                        this.LIZ = iLIZIZ;
                        this.LIZIZ = f2;
                        Paint paint = new Paint(1);
                        paint.setStyle(Paint.Style.FILL);
                        this.LIZJ = paint;
                        this.LIZLLL = new RectF();
                    }
                });
            }
        }
        return viewFindViewById2;
    }

    public final void LLLLLL(C18S6 c18s6) {
        int i = C18S5.LIZIZ[c18s6.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C420620GeS c420620GeS = this.LLJJL;
                if (c420620GeS != null) {
                    c420620GeS.LIZIZ();
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        C420620GeS c420620GeS2 = this.LLJJL;
        if (c420620GeS2 == null || c420620GeS2.LLJJ) {
            return;
        }
        c420620GeS2.LLJJ = true;
        c420620GeS2.LLJJI = 0L;
        c420620GeS2.LLJILJIL = 0.0f;
        c420620GeS2.LLJILJILJ = c420620GeS2.LLIZLLLIL;
        c420620GeS2.invalidate();
    }

    public final void LLLLLLIL(C18S9 c18s9) {
        boolean z;
        Context context;
        Context context2;
        Context context3;
        int i;
        if (c18s9.LIZIZ != EnumC559620LxA.LONG_PRESS && c18s9.LJFF == null) {
            z = false;
        } else {
            z = true;
        }
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        int i2 = 8;
        if (tuxTextView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
        }
        View viewLLLLLJLJLL = LLLLLJLJLL(this.mView);
        if (viewLLLLLJLJLL != null) {
            if (c18s9.LIZ) {
                i2 = 0;
            }
            C786410Ut5.LJLLLLLL(i2, viewLLLLLJLJLL);
        }
        LLLLLLJ(c18s9, z);
        if (!z) {
            return;
        }
        C1777880wMk c1777880wMk = c18s9.LJFF;
        String string = null;
        if (c18s9.LIZJ) {
            View view = this.mView;
            if (view != null && (context3 = view.getContext()) != null) {
                string = context3.getString(2131846083);
            }
        } else if (c1777880wMk != null) {
            View view2 = this.mView;
            if (view2 != null && (context2 = view2.getContext()) != null) {
                Object objValueOf = c1777880wMk.LIZJ;
                if (objValueOf == null) {
                    objValueOf = Integer.valueOf(c1777880wMk.LIZIZ);
                }
                string = context2.getResources().getQuantityString(c1777880wMk.LIZ, c1777880wMk.LIZIZ, objValueOf);
            }
        } else {
            View view3 = this.mView;
            if (view3 != null && (context = view3.getContext()) != null) {
                string = context.getString(2131846084);
            }
        }
        TuxTextView tuxTextView2 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(string);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLJ(X.C18S9 r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18S8.LLLLLLJ(X.18S9, boolean):void");
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        EnumC429070Gs5 enumC429070Gs5;
        C367460Eau c367460Eau;
        int i;
        super.onViewCreated(view, bundle);
        this.LLJJJIL = view.findViewById(R.id.voice_box_root);
        this.LLJJJJ = (TuxIconView) view.findViewById(R.id.voice_box_stop);
        this.LLJJJJJIL = (TuxIconView) view.findViewById(R.id.voice_box_send);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.voice_box_tip);
        LLLLLJLJLL(view);
        this.LLJJJJLIIL = view.findViewById(R.id.voice_box_talking_container);
        this.LLJJL = (C420620GeS) view.findViewById(R.id.voice_box_waveform);
        boolean z2 = false;
        this.LLJLL = C420640GeU.LIZ(view.getContext(), false);
        this.LLJLLIL = C420640GeU.LIZ(view.getContext(), true);
        View view2 = this.LLJJJIL;
        if (view2 != null) {
            view2.setBackground(this.LLJLL);
        }
        TuxIconView tuxIconView = this.LLJJJJ;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS166S0100000_32(this, 4));
        }
        TuxIconView tuxIconView2 = this.LLJJJJJIL;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS166S0100000_32(this, 5));
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18SB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C18S9) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 369));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18SE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C18S9) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 370));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18SC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C18S9) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 48));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18SF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C18S9) obj).LJFF;
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 371));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18SG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C18S9) obj).LJI;
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 366));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18SA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C18S9) obj).LIZLLL);
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 367));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18SD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C18S9) obj).LJ;
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 368));
        C18S9 c18s9 = LLLLILI().LIZ;
        if (c18s9.LIZ) {
            View view3 = this.mView;
            if (view3 != null) {
                C786410Ut5.T4(view3, 1.0f);
            }
            View view4 = this.mView;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(0, view4);
            }
        }
        if (c18s9.LIZIZ == EnumC559620LxA.LONG_PRESS) {
            z = true;
        } else {
            z = false;
        }
        TuxIconView tuxIconView3 = this.LLJJJJ;
        int i2 = 8;
        if (tuxIconView3 != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView3, i);
        }
        TuxIconView tuxIconView4 = this.LLJJJJJIL;
        if (tuxIconView4 != null) {
            if (!z) {
                i2 = 0;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView4, i2);
        }
        if (z && c18s9.LIZ) {
            z2 = true;
        }
        LLLLLJIL(z2);
        View view5 = this.LLJJJIL;
        if (view5 != null) {
            if (c18s9.LIZJ) {
                c367460Eau = this.LLJLLIL;
            } else {
                c367460Eau = this.LLJLL;
            }
            view5.setBackground(c367460Eau);
        }
        C420620GeS c420620GeS = this.LLJJL;
        if (c420620GeS != null) {
            if (c18s9.LIZJ) {
                enumC429070Gs5 = EnumC429070Gs5.CANCEL;
            } else {
                enumC429070Gs5 = EnumC429070Gs5.INPUT;
            }
            c420620GeS.setMode(enumC429070Gs5);
        }
        LLLLLLIL(c18s9);
        C420620GeS c420620GeS2 = this.LLJJL;
        if (c420620GeS2 != null) {
            c420620GeS2.setVolume(c18s9.LIZLLL);
        }
        LLLLLL(c18s9.LJ);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.og, viewGroup, false);
    }
}
