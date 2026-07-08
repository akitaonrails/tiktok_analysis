package X;

import Y.ACListenerS166S0100000_32;
import Y.ACListenerS63S0101000_32;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS98S0100000_32;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.18Vz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21296918Vz extends AbstractC1664490tPr<C21295318Vj, C21296618Vw> {
    public List<C18W1> LLJLLL;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 665));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 663));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 659));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 667));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 661));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 662));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1252));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 658));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 660));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 664));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 666));
    public boolean LLJZ = true;

    public final View LLLLLJIL() {
        return (View) this.LLJLIL.getValue();
    }

    public final TuxIconView LLLLLJLJLL() {
        return (TuxIconView) this.LLJL.getValue();
    }

    public final View LLLLLL() {
        return (View) this.LLJJJJJIL.getValue();
    }

    public final C0I7D LLLLLLJ() {
        return (C0I7D) this.LLJLILLLLZIIL.getValue();
    }

    public final View LLLLLLL() {
        return (View) this.LLJJJJ.getValue();
    }

    public final TuxIconView LLLLLLLLL() {
        return (TuxIconView) this.LLJLLIL.getValue();
    }

    public final View LLLLLLLLLL() {
        return (View) this.LLJJJJLIIL.getValue();
    }

    public static TuxIconView LLLLLLIL(ViewGroup viewGroup) {
        TuxIconView tuxIconView;
        if (viewGroup != null && (tuxIconView = (TuxIconView) viewGroup.findViewById(R.id.fkk)) != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZ = R.raw.icon_x_mark_small;
            c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(tuxIconView.getContext());
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zg);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            tuxIconView.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(tuxIconView.getContext())));
            return tuxIconView;
        }
        return null;
    }

    public static ViewGroup LLLLLLLZIL(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        int iIntValue;
        if (viewGroup != null && (viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.t6q)) != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zd, viewGroup2.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            float fLIZIZ = C418440Gaw.LIZIZ(14);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColors(new int[]{iIntValue, 16777215 & iIntValue});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
            gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ});
            viewGroup2.setBackground(gradientDrawable);
            return viewGroup2;
        }
        return null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        final int iIntValue5;
        final int iIntValue6;
        int iIntValue7;
        C18W3 c18w3;
        C1322110kVd c1322110kVd;
        C1322110kVd c1322110kVd2;
        super.onActivityCreated(bundle);
        LLLLLLZ(C418440Gaw.LIZIZ(23), R.attr.zo, (View) this.LLJJJIL.getValue());
        LLLLLLZ(C418440Gaw.LIZIZ(12), R.attr.a03, LLLLLJIL());
        this.LLJLLL = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.umb);
        TuxIconView tuxIconViewLLLLLLIL = LLLLLLIL(viewGroup);
        List<C18W1> list = this.LLJLLL;
        final View view = null;
        if (list != null) {
            if (viewGroup != null) {
                c1322110kVd2 = (C1322110kVd) viewGroup.findViewById(R.id.kc6);
            } else {
                c1322110kVd2 = null;
            }
            ((ArrayList) list).add(new C18W1(viewGroup, c1322110kVd2, tuxIconViewLLLLLLIL, LLLLLLLZIL(viewGroup)));
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.umc);
        TuxIconView tuxIconViewLLLLLLIL2 = LLLLLLIL(viewGroup2);
        List<C18W1> list2 = this.LLJLLL;
        if (list2 != null) {
            if (viewGroup2 != null) {
                c1322110kVd = (C1322110kVd) viewGroup2.findViewById(R.id.kc6);
            } else {
                c1322110kVd = null;
            }
            ((ArrayList) list2).add(new C18W1(viewGroup2, c1322110kVd, tuxIconViewLLLLLLIL2, LLLLLLLZIL(viewGroup2)));
        }
        List<C18W1> list3 = this.LLJLLL;
        if (list3 != null) {
            int i = 0;
            for (Object obj : (ArrayList) list3) {
                int i2 = i + 1;
                if (i >= 0) {
                    C18W1 c18w1 = (C18W1) obj;
                    TuxIconView tuxIconView = c18w1.LIZJ;
                    if (tuxIconView != null) {
                        C786410Ut5.a9(tuxIconView, new ACListenerS166S0100000_32(this, 95));
                    }
                    C1322110kVd c1322110kVd3 = c18w1.LIZIZ;
                    if (c1322110kVd3 != null) {
                        C786410Ut5.q9(c1322110kVd3, new ACListenerS63S0101000_32(this, i, 1));
                    }
                    ViewGroup viewGroup3 = c18w1.LIZLLL;
                    if (viewGroup3 != null) {
                        C786410Ut5.K7(viewGroup3, new ACListenerS63S0101000_32(this, i, 2));
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        C0I7D c0i7dLLLLLLJ = LLLLLLJ();
        if (c0i7dLLLLLLJ != null) {
            c0i7dLLLLLLJ.setHint(C21291518Tx.LJFF(LLLLILI().LIZ.LIZJ));
        }
        LLLLIL().LJIIIZ.invoke(LLLLLLJ());
        final C0I7D c0i7dLLLLLLJ2 = LLLLLLJ();
        if (c0i7dLLLLLLJ2 != null) {
            HandlerHook.viewPost(c0i7dLLLLLLJ2, new Runnable() { // from class: X.06Jc
                public final /* synthetic */ double LLILLJJLI = 4.5d;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AiChatInputFeatureScene@cafb.setMaxHeight$1");
                    try {
                        c0i7dLLLLLLJ2.setMaxHeight((int) (this.LLILLJJLI * ((double) c0i7dLLLLLLJ2.getLineHeight())));
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AiChatInputFeatureScene@cafb.setMaxHeight$1");
                }
            });
        }
        C0I7D c0i7dLLLLLLJ3 = LLLLLLJ();
        if (c0i7dLLLLLLJ3 != null) {
            c0i7dLLLLLLJ3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC21523319Lb(this, 4));
        }
        C0I7D c0i7dLLLLLLJ4 = LLLLLLJ();
        if (c0i7dLLLLLLJ4 != null) {
            c0i7dLLLLLLJ4.addTextChangedListener(new C21524019Li(this, 6));
        }
        TuxIconView tuxIconView2 = (TuxIconView) this.LLJLL.getValue();
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS166S0100000_32(this, 91));
        }
        View view2 = (View) this.LLJJL.getValue();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ch, view2.getContext());
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zm, view2.getContext());
        final int[] iArr = new int[4];
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.cc, view2.getContext());
        int iIntValue8 = -1;
        if (numLIZJ3 != null) {
            iIntValue = numLIZJ3.intValue();
        } else {
            iIntValue = -1;
        }
        iArr[0] = iIntValue;
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.ch, view2.getContext());
        if (numLIZJ4 != null) {
            iIntValue2 = numLIZJ4.intValue();
        } else {
            iIntValue2 = -1;
        }
        iArr[1] = iIntValue2;
        Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.cp, view2.getContext());
        if (numLIZJ5 != null) {
            iIntValue3 = numLIZJ5.intValue();
        } else {
            iIntValue3 = -65536;
        }
        iArr[2] = iIntValue3;
        Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.ch, view2.getContext());
        int iIntValue9 = -16777216;
        if (numLIZJ6 != null) {
            iIntValue4 = numLIZJ6.intValue();
        } else {
            iIntValue4 = -16777216;
        }
        iArr[3] = iIntValue4;
        final float[] fArr = {0.0f, 0.33333334f, 0.6666667f, 1.0f};
        final float fLIZIZ = C418440Gaw.LIZIZ(23);
        final float fLIZIZ2 = C418440Gaw.LIZIZ(14);
        if (numLIZJ != null) {
            iIntValue5 = numLIZJ.intValue();
        } else {
            iIntValue5 = -65536;
        }
        if (numLIZJ2 != null) {
            iIntValue6 = numLIZJ2.intValue();
        } else {
            iIntValue6 = -16777216;
        }
        final Float fValueOf = Float.valueOf(C418440Gaw.LIZIZ(1));
        view2.setBackground(new GradientDrawable(fLIZIZ, fLIZIZ2, iIntValue5, iIntValue6, iArr, fValueOf, fArr) { // from class: X.0F7C
            public final float LIZ;
            public final float LIZIZ;
            public final int LIZJ;
            public final int LIZLLL;
            public final int[] LJ;
            public final Float LJFF;
            public final float[] LJI;
            public final Paint LJII = new Paint(1);
            public final Paint LJIIIIZZ = new Paint(1);

            @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                RectF rectF = new RectF(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
                Path path = new Path();
                float f = this.LIZ;
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                this.LJII.setColor(this.LIZJ);
                this.LJII.setAlpha(50);
                this.LJII.setMaskFilter(new BlurMaskFilter(this.LIZIZ, BlurMaskFilter.Blur.NORMAL));
                float f2 = this.LIZ;
                canvas.drawRoundRect(rectF, f2, f2, this.LJII);
                Paint paint = this.LJII;
                paint.setColor(0);
                float f3 = 2;
                paint.setShadowLayer(this.LIZIZ * f3, 0.0f, 0.0f, this.LIZLLL);
                float f4 = this.LIZ;
                canvas.drawRoundRect(rectF, f4, f4, this.LJII);
                canvas.restore();
                if (this.LJ != null && this.LJFF != null) {
                    float fWidth = getBounds().width() / 2.0f;
                    float fHeight = getBounds().height() / 2.0f;
                    LinearGradient linearGradient = new LinearGradient(fWidth - (rectF.width() / f3), fHeight, fWidth + (rectF.width() / f3), fHeight, this.LJ, this.LJI, Shader.TileMode.CLAMP);
                    RectF rectF2 = new RectF(rectF.left + (this.LJFF.floatValue() / f3), rectF.top + (this.LJFF.floatValue() / f3), rectF.right - (this.LJFF.floatValue() / f3), rectF.bottom - (this.LJFF.floatValue() / f3));
                    this.LJIIIIZZ.setShader(linearGradient);
                    this.LJIIIIZZ.setStrokeWidth(this.LJFF.floatValue());
                    this.LJIIIIZZ.setStyle(Paint.Style.STROKE);
                    float f5 = this.LIZ;
                    canvas.drawRoundRect(rectF2, f5, f5, this.LJIIIIZZ);
                }
            }

            @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
            public final void setAlpha(int i3) {
                this.LJII.setAlpha(i3);
            }

            {
                this.LIZ = fLIZIZ;
                this.LIZIZ = fLIZIZ2;
                this.LIZJ = iIntValue5;
                this.LIZLLL = iIntValue6;
                this.LJ = iArr;
                this.LJFF = fValueOf;
                this.LJI = fArr;
            }
        });
        ((TextView) this.LLJJLIIIJLLLLLLLZ.getValue()).setText(C21291518Tx.LJ(EnumC21291418Tw.INPUT_UPLOAD_BUTTON_TEXT, new Object[0]));
        TuxTextView tuxTextView = (TuxTextView) this.LLJJLIIIJLLLLLLLZ.getValue();
        int[] iArr2 = new int[3];
        Integer numLIZJ7 = C1308910kAL.LIZJ(R.attr.cn, ((View) this.LLJJLIIIJLLLLLLLZ.getValue()).getContext());
        if (numLIZJ7 != null) {
            iIntValue7 = numLIZJ7.intValue();
        } else {
            iIntValue7 = -1;
        }
        iArr2[0] = iIntValue7;
        Integer numLIZJ8 = C1308910kAL.LIZJ(R.attr.ce, ((View) this.LLJJLIIIJLLLLLLLZ.getValue()).getContext());
        if (numLIZJ8 != null) {
            iIntValue8 = numLIZJ8.intValue();
        }
        iArr2[1] = iIntValue8;
        Integer numLIZJ9 = C1308910kAL.LIZJ(R.attr.cc, ((View) this.LLJJLIIIJLLLLLLLZ.getValue()).getContext());
        if (numLIZJ9 != null) {
            iIntValue9 = numLIZJ9.intValue();
        }
        iArr2[2] = iIntValue9;
        C432070Gwv.LIZIZ(tuxTextView, iArr2, new float[]{0.0f, 0.4f, 1.0f});
        C786410Ut5.I7(new ACListenerS166S0100000_32(this, 92), (View) this.LLJJL.getValue());
        TuxIconView tuxIconViewLLLLLJLJLL = LLLLLJLJLL();
        if (tuxIconViewLLLLLJLJLL != null) {
            C786410Ut5.a9(tuxIconViewLLLLLJLJLL, new ACListenerS166S0100000_32(this, 93));
        }
        View viewLLLLLJIL = LLLLLJIL();
        if (viewLLLLLJIL != null) {
            C786410Ut5.I7(new ACListenerS166S0100000_32(this, 94), viewLLLLLJIL);
        }
        TuxIconView tuxIconViewLLLLLLLLL = LLLLLLLLL();
        if (tuxIconViewLLLLLLLLL != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.cc);
            Drawable drawableLIZ = c384050F3z.LIZ(tuxIconViewLLLLLLLLL.getContext());
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            c419910GdJ.LIZ = R.raw.icon_paperplane_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a0o);
            tuxIconViewLLLLLLLLL.setImageDrawable(new LayerDrawable(new Drawable[]{drawableLIZ, c419910GdJ.LIZ(tuxIconViewLLLLLLLLL.getContext())}));
        }
        TuxIconView tuxIconViewLLLLLLLLL2 = LLLLLLLLL();
        if (tuxIconViewLLLLLLLLL2 != null) {
            C786410Ut5.I7(new AkS98S0100000_32(this, 15), tuxIconViewLLLLLLLLL2);
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18Vr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C21295318Vj) obj2).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 320));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18Vu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C21295318Vj) obj2).LJ;
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 321));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18Vy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C21295318Vj) obj2).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 322));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18Vs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C21295318Vj) obj2).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 694));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.18Vv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C21295318Vj) obj2).LJFF;
            }
        }, new AwS608S0100000_29(this, 692));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.18Vt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C21295318Vj) obj2).LJI;
            }
        }, new AwS608S0100000_29(this, 693));
        Scene sceneLIZ = C565530MFz.LIZ(this);
        if (sceneLIZ != null) {
            view = sceneLIZ.mView;
        }
        if ((view instanceof C18W3) && (c18w3 = (C18W3) view) != null) {
            c18w3.LIZ(new C18XA() { // from class: X.18W0
                @Override // X.C18XA
                public final void LIZ(MotionEvent motionEvent) {
                }

                @Override // X.C18XA
                public final void onTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0) {
                        return;
                    }
                    int rawX = (int) motionEvent.getRawX();
                    int rawY = (int) motionEvent.getRawY();
                    C21296918Vz c21296918Vz = this.LIZ;
                    View view3 = view;
                    c21296918Vz.getClass();
                    View viewFindViewById = view3.findViewById(R.id.dpb);
                    View viewFindViewById2 = view3.findViewById(R.id.dp1);
                    if (!C432070Gwv.LIZJ(rawX, rawY, viewFindViewById) && !C432070Gwv.LIZJ(rawX, rawY, viewFindViewById2)) {
                        this.LIZ.LLLLIL().LIZ.invoke(Boolean.FALSE);
                    }
                }
            });
        }
    }

    public static void LLLLLLZ(float f, int i, View view) {
        int iIntValue;
        Context context;
        Integer numLIZJ;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f);
        if (view != null && (context = view.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(i, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -7829368;
        }
        gradientDrawable.setColor(iIntValue);
        if (view != null) {
            view.setBackground(gradientDrawable);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.bg5, viewGroup, false);
    }
}
