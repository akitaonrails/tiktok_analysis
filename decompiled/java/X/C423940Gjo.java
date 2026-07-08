package X;

import X.AbstractC423990Gjt;
import Y.ACListenerS20S0301000_6;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Gjo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423940Gjo<T extends AbstractC423990Gjt> extends C423960Gjq {
    public C423940Gjo(int i) {
        super(i, -2);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.0GUR, android.view.ViewGroup] */
    public final void LJJIIJ(final Context context, final List<? extends T> list) {
        final AttributeSet attributeSet;
        int i;
        C424020Gjw c424020GjwLIZ;
        LinearLayout linearLayout = this.LLILLL;
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        } else {
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.LLILLL = linearLayout2;
            linearLayout2.setOrientation(1);
        }
        int size = list.size();
        int i2 = 0;
        while (true) {
            attributeSet = null;
            if (i2 >= size) {
                break;
            }
            View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.cxn, null);
            ((TextView) viewLJLLJ.findViewById(R.id.zyq)).setText(context.getString(((InterfaceC423980Gjs) ListProtector.get(list, i2)).LIZIZ()));
            ((TextView) viewLJLLJ.findViewById(R.id.zyq)).setTextColor(context.getResources().getColor(((InterfaceC423980Gjs) ListProtector.get(list, i2)).LIZJ()));
            viewLJLLJ.findViewById(R.id.lpj).setBackgroundResource(((InterfaceC423980Gjs) ListProtector.get(list, i2)).LIZ());
            View viewFindViewById = viewLJLLJ.findViewById(R.id.view_divider);
            if (i2 == list.size() - 1) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById);
            viewLJLLJ.setClickable(true);
            C786410Ut5.I7(new ACListenerS20S0301000_6(viewLJLLJ, this, i2, list, 3), viewLJLLJ);
            if (list.size() == 1) {
                c424020GjwLIZ = C423970Gjr.LIZ(C416920GWk.LIZ(12.0f), C416920GWk.LIZ(12.0f), C416920GWk.LIZ(12.0f), C416920GWk.LIZ(12.0f), C446980Hfs.LIZ(context, R.color.az), C446980Hfs.LIZ(context, R.color.br));
            } else if (i2 == 0) {
                c424020GjwLIZ = C423970Gjr.LIZ(C416920GWk.LIZ(12.0f), C416920GWk.LIZ(12.0f), 0.0f, 0.0f, C446980Hfs.LIZ(context, R.color.az), C446980Hfs.LIZ(context, R.color.br));
            } else if (i2 == list.size() - 1) {
                c424020GjwLIZ = C423970Gjr.LIZ(0.0f, 0.0f, C416920GWk.LIZ(12.0f), C416920GWk.LIZ(12.0f), C446980Hfs.LIZ(context, R.color.az), C446980Hfs.LIZ(context, R.color.br));
            } else {
                c424020GjwLIZ = C423970Gjr.LIZ(0.0f, 0.0f, 0.0f, 0.0f, C446980Hfs.LIZ(context, R.color.az), C446980Hfs.LIZ(context, R.color.br));
            }
            viewLJLLJ.setBackground(c424020GjwLIZ);
            LinearLayout linearLayout3 = this.LLILLL;
            if (linearLayout3 != null) {
                linearLayout3.addView(viewLJLLJ);
            }
            i2++;
        }
        if (this.LLILZ == null) {
            ?? r3 = new FrameLayout(context, attributeSet) { // from class: X.0GUR
                public float LL;
                public float LLILLJJLI;
                public float LLILLL;
                public float LLILZ;
                public final Path LLILZIL = new Path();
                public final Path LLILZLL = new Path();
                public final float LLIZ;
                public final Paint LLIZLLLIL;
                public boolean LLJ;
                public final Paint LLJI;
                public boolean LLJIJIL;
                public boolean LLJILJIL;
                public float LLJILJILJ;

                @Override // android.view.View
                public final void draw(Canvas canvas) {
                    LIZ(this.LLILZIL, this.LLJILJILJ);
                    canvas.clipPath(this.LLILZIL);
                    canvas.drawPath(this.LLILZIL, this.LLIZLLLIL);
                    super.draw(canvas);
                    if (this.LLJIJIL) {
                        LIZ(this.LLILZLL, (this.LLIZ / 2) + this.LLJILJILJ);
                        Path path = this.LLILZLL;
                        LinearGradient linearGradient = new LinearGradient(getWidth() / 2.0f, getTop(), getWidth() / 2.0f, getBottom(), C446980Hfs.LIZ(getContext(), R.color.gx), C446980Hfs.LIZ(getContext(), R.color.gw), Shader.TileMode.CLAMP);
                        if (this.LLJILJIL) {
                            this.LLJI.setShader(linearGradient);
                            canvas.drawPath(path, this.LLJI);
                        } else {
                            canvas.drawPath(path, this.LLJI);
                        }
                    }
                }

                public final void setBorderPaintColor(int i3) {
                    this.LLJI.setColor(i3);
                    invalidate();
                }

                public final void setGradientBorder(boolean z) {
                    this.LLJILJIL = z;
                }

                public final void setInsets(float f) {
                    this.LLJILJILJ = f;
                    invalidate();
                }

                public final void setRadius(float f) {
                    this.LL = f;
                    this.LLILLJJLI = f;
                    this.LLILLL = f;
                    this.LLILZ = f;
                }

                {
                    float fLIZ = C416920GWk.LIZ(1.0f);
                    this.LLIZ = fLIZ;
                    Paint paint = new Paint();
                    paint.setStyle(Paint.Style.FILL);
                    paint.setAntiAlias(true);
                    paint.setColor(0);
                    this.LLIZLLLIL = paint;
                    Paint paint2 = new Paint();
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(fLIZ);
                    paint2.setAntiAlias(true);
                    this.LLJI = paint2;
                    this.LLJIJIL = true;
                    this.LLJILJIL = true;
                    if (attributeSet != null) {
                        TypedArray typedArrayObtainStyledAttributes = null;
                        try {
                            try {
                                typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.RoundFrameLayout);
                                this.LL = typedArrayObtainStyledAttributes.getDimension(R$styleable.RoundFrameLayout_bottomLeftRadius, getResources().getDimension(R.dimen.mu));
                                this.LLILLJJLI = typedArrayObtainStyledAttributes.getDimension(R$styleable.RoundFrameLayout_topLeftRadius, getResources().getDimension(R.dimen.mu));
                                this.LLILLL = typedArrayObtainStyledAttributes.getDimension(R$styleable.RoundFrameLayout_bottomRightRadius, getResources().getDimension(R.dimen.mu));
                                this.LLILZ = typedArrayObtainStyledAttributes.getDimension(R$styleable.RoundFrameLayout_topRightRadius, getResources().getDimension(R.dimen.mu));
                                this.LLJIJIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RoundFrameLayout_showGradientBorder, false);
                                paint.setColor(typedArrayObtainStyledAttributes.getColor(R$styleable.RoundFrameLayout_roundPathColor, 0));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                if (typedArrayObtainStyledAttributes != null) {
                                }
                                setWillNotDraw(false);
                            }
                            typedArrayObtainStyledAttributes.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (typedArrayObtainStyledAttributes != null) {
                                typedArrayObtainStyledAttributes.recycle();
                            }
                            throw th;
                        }
                    }
                    setWillNotDraw(false);
                }

                public final void LIZ(Path path, float f) {
                    path.reset();
                    if (this.LLJ) {
                        setRadius((Math.max(getWidth(), getHeight()) / 2.0f) - f);
                    }
                    path.moveTo((getWidth() - this.LLILZ) - f, f);
                    path.arcTo((getWidth() - (this.LLILZ * 2.0f)) - f, f, getWidth() - f, (this.LLILZ * 2.0f) + f, 270.0f, 90.0f, false);
                    path.lineTo(getWidth() - f, (getHeight() - this.LLILLL) - f);
                    float f2 = 2;
                    path.arcTo((getWidth() - (this.LLILLL * 2.0f)) - f, (getHeight() - (this.LLILLL * f2)) - f, getWidth() - f, getHeight() - f, 0.0f, 90.0f, false);
                    path.lineTo(this.LL + f, getHeight() - f);
                    float height = getHeight();
                    float f3 = f2 * this.LL;
                    path.arcTo(f, (height - f3) - f, f3 + f, getHeight() - f, 90.0f, 90.0f, false);
                    path.lineTo(f, this.LLILLJJLI + f);
                    float f4 = (this.LLILLJJLI * 2.0f) + f;
                    path.arcTo(f, f, f4, f4, 180.0f, 90.0f, false);
                    path.close();
                }
            };
            r3.setBorderPaintColor(context.getResources().getColor(R.color.bn));
            r3.setGradientBorder(false);
            r3.setRadius(C12ES.LIZJ(12.0f, context));
            this.LLILZ = r3;
            r3.addView(this.LLILLL);
            setContentView(this.LLILZ);
        }
        this.LLILLJJLI = new InterfaceC424010Gjv<T>() { // from class: X.0Gjp
            @Override // X.InterfaceC424010Gjv
            public final void LIZ(int i3, Object obj) {
                ((AbstractC423990Gjt) ListProtector.get(list, i3)).LIZLLL();
            }
        };
    }
}
