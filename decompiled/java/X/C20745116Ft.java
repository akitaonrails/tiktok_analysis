package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.16Ft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20745116Ft extends C19XT {
    public C16FV LLILZIL;
    public C16FV LLILZLL;
    public TextView LLIZ;
    public View LLIZLLLIL;
    public C20745016Fs LLJ;

    public void setIcon(Drawable drawable) {
        this.LLILZIL.setImageDrawable(drawable);
        if (drawable == null) {
            C786410Ut5.LLJJJJJIL(this.LLILZIL, 8);
            this.LLIZ.setGravity(17);
        } else {
            C786410Ut5.LLJJJJJIL(this.LLILZIL, 0);
            this.LLIZ.setGravity(8388611);
        }
    }

    public void setIconCenter(Drawable drawable) {
        this.LLILZLL.setImageDrawable(drawable);
        if (drawable == null) {
            C786410Ut5.LLJJJJJIL(this.LLILZLL, 8);
        } else {
            C786410Ut5.LLJJJJJIL(this.LLILZLL, 0);
            ViewGroup.LayoutParams layoutParams = this.LLIZ.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                layoutParams.width = -2;
                ((LinearLayout.LayoutParams) layoutParams).weight = 0.0f;
                setGravity(17);
                C786410Ut5.g6(this.LLIZ, layoutParams);
            }
        }
        this.LLIZ.setGravity(17);
    }

    public void setIsShowRedDotView(boolean z) {
        if (z) {
            C786410Ut5.LJLLLLLL(0, this.LLIZLLLIL);
        } else {
            C786410Ut5.LJLLLLLL(8, this.LLIZLLLIL);
        }
    }

    public void setText(int i) {
        this.LLIZ.setText(i);
    }

    public void setIcon(int i) {
        setIcon(C14MI.LIZ(getContext(), i));
    }

    public void setText(CharSequence charSequence) {
        this.LLIZ.setText(charSequence);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.16Ck, X.16Fs] */
    public C20745116Ft(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LinearLayout.inflate(getContext(), R.layout.dea, this);
        this.LLILZIL = (C16FV) findViewById(R.id.mtd);
        this.LLILZLL = (C16FV) findViewById(R.id.mte);
        this.LLIZ = (TextView) findViewById(R.id.mtf);
        this.LLIZLLLIL = findViewById(R.id.k38);
        Context context2 = getContext();
        if (context2 != null) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(C20736316Cj.LIZIZ(R.attr.ex_, context2));
            this.LLIZLLLIL.setBackground(shapeDrawable);
        }
        ?? r1 = new AbstractC20736416Ck<C20745116Ft>(this) { // from class: X.16Fs
            @Override // X.AbstractC20736516Cl
            public final int[] LIZLLL() {
                return R$styleable.LiveActionButton;
            }

            {
                super(this);
            }

            @Override // X.AbstractC20736416Ck
            public final void LJFF(TypedArray typedArray) {
                int indexCount = typedArray.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = typedArray.getIndex(i);
                    if (index == R$styleable.LiveActionButton_android_textAppearance) {
                        int resourceId = typedArray.getResourceId(index, 0);
                        if (resourceId != 0) {
                            ((C20745116Ft) this.LL).LLIZ.setTextAppearance(resourceId);
                        }
                    } else if (index == R$styleable.LiveActionButton_lineHeight) {
                        C21382118m3.LJFF(((C20745116Ft) this.LL).LLIZ, typedArray.getDimensionPixelSize(index, 0));
                    } else if (index == R$styleable.LiveActionButton_liveActionButtonElementColor) {
                        ColorStateList colorStateListLIZ = C16F8.LIZ(this.LL.getContext(), typedArray, index);
                        if (colorStateListLIZ != null) {
                            C1763660vzo.LIZJ(((C20745116Ft) this.LL).LLILZIL, colorStateListLIZ);
                            ((C20745116Ft) this.LL).LLIZ.setTextColor(colorStateListLIZ);
                        }
                    } else if (index == R$styleable.LiveActionButton_android_padding) {
                        int dimensionPixelSize = typedArray.getDimensionPixelSize(index, 0);
                        this.LL.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                    } else if (index == R$styleable.LiveActionButton_android_orientation) {
                        ((LinearLayout) this.LL).setOrientation(typedArray.getInt(index, -1));
                    } else if (index == R$styleable.LiveActionButton_android_background) {
                        this.LL.setBackground(typedArray.getDrawable(index));
                    } else if (index == R$styleable.LiveActionButton_icon) {
                        int resourceId2 = typedArray.getResourceId(index, 0);
                        if (resourceId2 != 0) {
                            T t = this.LL;
                            ((C20745116Ft) t).setIcon(C14MI.LIZ(t.getContext(), resourceId2));
                        } else {
                            ((C20745116Ft) this.LL).setIcon((Drawable) null);
                        }
                    } else if (index == R$styleable.LiveActionButton_android_text) {
                        ((C20745116Ft) this.LL).setText(C786410Ut5.Yd(typedArray, index));
                    }
                }
            }

            @Override // X.AbstractC20736416Ck
            public final void LJII(AttributeSet attributeSet2, int i, int i2) {
                super.LJII(attributeSet2, R.attr.c5l, 0);
            }
        };
        this.LLJ = r1;
        r1.LJII(attributeSet, R.attr.c5l, 0);
    }
}
