package androidx.appcompat.view.menu;

import X.C1602160rnK;
import X.C21411918qr;
import X.C21548219Uq;
import X.C786410Ut5;
import X.InterfaceC21549619Ve;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes34.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC21549619Ve, AbsListView.SelectionBoundsAdjuster {
    public C21548219Uq LL;
    public ImageView LLILLJJLI;
    public RadioButton LLILLL;
    public TextView LLILZ;
    public CheckBox LLILZIL;
    public TextView LLILZLL;
    public ImageView LLIZ;
    public ImageView LLIZLLLIL;
    public LinearLayout LLJ;
    public final Drawable LLJI;
    public final int LLJIJIL;
    public final Context LLJILJIL;
    public boolean LLJILJILJ;
    public final Drawable LLJILLL;
    public final boolean LLJJ;
    public LayoutInflater LLJJI;
    public boolean LLJJIII;

    private LayoutInflater getInflater() {
        if (this.LLJJI == null) {
            this.LLJJI = C786410Ut5.ne(getContext());
        }
        return this.LLJJI;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.LLJI);
        TextView textView = (TextView) findViewById(R.id.title);
        this.LLILZ = textView;
        int i = this.LLJIJIL;
        if (i != -1) {
            textView.setTextAppearance(this.LLJILJIL, i);
        }
        this.LLILZLL = (TextView) findViewById(R.id.v98);
        ImageView imageView = (ImageView) findViewById(R.id.whd);
        this.LLIZ = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.LLJILLL);
        }
        this.LLIZLLLIL = (ImageView) findViewById(R.id.j6s);
        this.LLJ = (LinearLayout) findViewById(R.id.eu1);
    }

    @Override // X.InterfaceC21549619Ve
    public C21548219Uq getItemData() {
        return this.LL;
    }

    private void setSubMenuArrowVisible(boolean z) {
        int i;
        ImageView imageView = this.LLIZ;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJZI(i, imageView);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014a  */
    @Override // X.InterfaceC21549619Ve
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(X.C21548219Uq r11) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.LJIIJJI(X.19Uq):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.LLIZLLLIL;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.LLIZLLLIL.getLayoutParams();
            rect.top += this.LLIZLLLIL.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public void setCheckable(boolean z) {
        boolean z2;
        CompoundButton compoundButton;
        View view;
        if (!z && this.LLILLL == null && this.LLILZIL == null) {
            return;
        }
        if ((this.LL.LJJ & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.LLILLL == null) {
                RadioButton radioButton = (RadioButton) C786410Ut5.Td(getInflater(), R.layout.hv, this, false);
                this.LLILLL = radioButton;
                LinearLayout linearLayout = this.LLJ;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.LLILLL;
            view = this.LLILZIL;
        } else {
            if (this.LLILZIL == null) {
                CheckBox checkBox = (CheckBox) C786410Ut5.Td(getInflater(), R.layout.hs, this, false);
                this.LLILZIL = checkBox;
                LinearLayout linearLayout2 = this.LLJ;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.LLILZIL;
            view = this.LLILLL;
        }
        if (z) {
            compoundButton.setChecked(this.LL.isChecked());
            if (compoundButton.getVisibility() != 0) {
                int visibility = compoundButton.getVisibility();
                compoundButton.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, compoundButton);
            }
            if (view != null && view.getVisibility() != 8) {
                int visibility2 = view.getVisibility();
                view.setVisibility(8);
                C1602160rnK.LIZIZ(visibility2, 8, view);
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.LLILZIL;
        if (checkBox2 != null) {
            C786410Ut5.LLIIIZ(checkBox2, 8);
        }
        RadioButton radioButton2 = this.LLILLL;
        if (radioButton2 == null) {
            return;
        }
        int visibility3 = radioButton2.getVisibility();
        radioButton2.setVisibility(8);
        C1602160rnK.LIZIZ(visibility3, 8, radioButton2);
    }

    public void setChecked(boolean z) {
        boolean z2;
        CompoundButton compoundButton;
        if ((this.LL.LJJ & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.LLILLL == null) {
                RadioButton radioButton = (RadioButton) C786410Ut5.Td(getInflater(), R.layout.hv, this, false);
                this.LLILLL = radioButton;
                LinearLayout linearLayout = this.LLJ;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.LLILLL;
        } else {
            if (this.LLILZIL == null) {
                CheckBox checkBox = (CheckBox) C786410Ut5.Td(getInflater(), R.layout.hs, this, false);
                this.LLILZIL = checkBox;
                LinearLayout linearLayout2 = this.LLJ;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.LLILZIL;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.LLJJIII = z;
        this.LLJILJILJ = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        int i;
        ImageView imageView = this.LLIZLLLIL;
        if (imageView != null) {
            if (!this.LLJJ && z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJZI(i, imageView);
        }
    }

    public void setIcon(Drawable drawable) {
        this.LL.LJIILIIL.getClass();
        boolean z = this.LLJJIII;
        if (!z && !this.LLJILJILJ) {
            return;
        }
        ImageView imageView = this.LLILLJJLI;
        if (imageView == null && drawable == null && !this.LLJILJILJ) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) C786410Ut5.Td(getInflater(), R.layout.ht, this, false);
            this.LLILLJJLI = imageView2;
            LinearLayout linearLayout = this.LLJ;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable == null && !this.LLJILJILJ) {
            C786410Ut5.LJZI(8, this.LLILLJJLI);
            return;
        }
        ImageView imageView3 = this.LLILLJJLI;
        if (!z) {
            drawable = null;
        }
        imageView3.setImageDrawable(drawable);
        if (this.LLILLJJLI.getVisibility() == 0) {
            return;
        }
        C786410Ut5.LJZI(0, this.LLILLJJLI);
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.LLILZ.setText(charSequence);
            if (this.LLILZ.getVisibility() != 0) {
                C786410Ut5.LLIL(this.LLILZ, 0);
                return;
            }
            return;
        }
        if (this.LLILZ.getVisibility() == 8) {
            return;
        }
        C786410Ut5.LLIL(this.LLILZ, 8);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C21411918qr c21411918qrLJIILIIL = C21411918qr.LJIILIIL(getContext(), attributeSet, R$styleable.MenuView, R.attr.c5_, 0);
        this.LLJI = c21411918qrLJIILIIL.LJ(R$styleable.MenuView_android_itemBackground);
        this.LLJIJIL = c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.MenuView_android_itemTextAppearance, -1);
        this.LLJILJILJ = c21411918qrLJIILIIL.LIZ(R$styleable.MenuView_preserveIconSpacing, false);
        this.LLJILJIL = context;
        this.LLJILLL = c21411918qrLJIILIIL.LJ(R$styleable.MenuView_subMenuArrow);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.bpq, 0);
        this.LLJJ = typedArrayObtainStyledAttributes.hasValue(0);
        c21411918qrLJIILIIL.LJIILJJIL();
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LLILLJJLI != null && this.LLJILJILJ) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.LLILLJJLI.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }
}
