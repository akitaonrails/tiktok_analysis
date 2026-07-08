package X;

import Y.ARunnableS131S0100000_31;
import Y.ARunnableS42S0101000_31;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.16FT, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16FT extends C1091790eW9 {
    public LiveIconView LLILLL;
    public ImageView LLILZ;
    public C16F5 LLILZIL;
    public C16F5 LLILZLL;
    public C16FS LLIZ;
    public LinearLayout LLIZLLLIL;
    public View LLJ;
    public int LLJI;

    public C16FT() {
        throw null;
    }

    public static /* synthetic */ void h0(C16FT c16ft) {
        c16ft.getClass();
        C1C7U.LIZ("LiveStatusView@643b.initView$1L");
        c16ft.setLayoutMargin(c16ft.LLJI);
        C1C7U.LIZIZ("LiveStatusView@643b.initView$1L");
    }

    public static /* synthetic */ void i0(C16FT c16ft) {
        c16ft.getClass();
        C1C7U.LIZ("LiveStatusView@643b.setHeaderType$1L");
        c16ft.setLayoutMargin(c16ft.LLJI);
        C1C7U.LIZIZ("LiveStatusView@643b.setHeaderType$1L");
    }

    private void setLayoutMargin(int i) {
        int height;
        double d;
        float dimension;
        int measuredHeight = getMeasuredHeight();
        if (i == 0) {
            if (this.LLILZ.getVisibility() == 0) {
                d = ((double) measuredHeight) * 0.4d;
                dimension = getContext().getResources().getDimension(R.dimen.a5m);
            } else {
                d = ((double) measuredHeight) * 0.4d;
                dimension = getContext().getResources().getDimension(R.dimen.a5k);
            }
            height = (int) (d - ((double) dimension));
            C19ME c19me = (C19ME) this.LLIZ.getLayoutParams();
            c19me.topToTop = 0;
            c19me.topToBottom = -1;
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = (int) ((((double) measuredHeight) * 0.7d) + ((double) getContext().getResources().getDimensionPixelSize(R.dimen.a5n)));
            C786410Ut5.x6(this.LLIZ, c19me);
        } else {
            height = (int) ((((double) measuredHeight) * 0.4d) - (((double) (((this.LLILZIL.getHeight() + this.LLILZLL.getHeight()) + this.LLIZ.getHeight()) + getContext().getResources().getDimensionPixelSize(R.dimen.a5o))) * 0.4d));
            C19ME c19me2 = (C19ME) this.LLIZ.getLayoutParams();
            c19me2.topToTop = -1;
            c19me2.topToBottom = R.id.ndn;
            ((ViewGroup.MarginLayoutParams) c19me2).topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.a5l);
            C786410Ut5.x6(this.LLIZ, c19me2);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLIZLLLIL.getLayoutParams();
        marginLayoutParams.topMargin = height;
        C786410Ut5.d6(this.LLIZLLLIL, marginLayoutParams);
    }

    public final void j0(int i) {
        if (i == 0) {
            C786410Ut5.LLJJIJIL(this.LLILLL, 8);
            C786410Ut5.LJZI(8, this.LLILZ);
        } else if (i == 1) {
            C786410Ut5.LLJJIJIL(this.LLILLL, 0);
            C786410Ut5.LJZI(8, this.LLILZ);
        } else if (i == 2) {
            C786410Ut5.LLJJIJIL(this.LLILLL, 8);
            C786410Ut5.LJZI(0, this.LLILZ);
        }
        HandlerHook.viewPost(this, new ARunnableS131S0100000_31(this, 199));
    }

    public void setButtonIcon(int i) {
        this.LLIZ.setIcon(i);
        this.LLIZ.setIconAutoMirrored(true);
    }

    public void setButtonStyle(int i) {
        this.LLIZ.j0(i);
    }

    public void setButtonText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C786410Ut5.LLJJJ(this.LLIZ, 8);
        } else {
            this.LLIZ.setText(charSequence);
            C786410Ut5.LLJJJ(this.LLIZ, 0);
        }
    }

    public void setIcon(int i) {
        boolean zLIZIZ = C783380UoC.LIZ.LIZIZ(i, false);
        Drawable drawableLIZ = C783370UoB.LIZ(i, getContext());
        LiveIconView liveIconView = this.LLILLL;
        if (liveIconView != null) {
            liveIconView.setIcon(drawableLIZ);
            this.LLILLL.setIconAutoMirrored(zLIZIZ);
        }
        if (drawableLIZ == null) {
            j0(0);
        } else {
            j0(1);
        }
    }

    public void setIconAttr(int i) {
        setIcon(C20736316Cj.LJ(i, getContext()));
    }

    public void setIconSize(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.LLILLL.getLayoutParams();
        layoutParams.height = i;
        layoutParams.width = i;
        C786410Ut5.w6(this.LLILLL, layoutParams);
    }

    public void setIconTint(ColorStateList colorStateList) {
        LiveIconView liveIconView = this.LLILLL;
        if (liveIconView != null) {
            liveIconView.setIconTintList(colorStateList);
        }
    }

    public void setIllustration(Drawable drawable) {
        this.LLILZ.setImageDrawable(drawable);
        if (drawable == null) {
            j0(0);
        } else {
            j0(2);
            drawable.setAutoMirrored(false);
        }
    }

    public void setLayoutType(int i) {
        this.LLJI = i;
        setLayoutMargin(i);
    }

    public void setMessage(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C786410Ut5.LLJJJJ(this.LLILZLL, 8);
        } else {
            this.LLILZLL.setText(charSequence);
            C786410Ut5.LLJJJJ(this.LLILZLL, 0);
        }
    }

    public void setMessageStyle(int i) {
        this.LLILZLL.LJJJI(i);
    }

    public void setOnButtonClickListener(View.OnClickListener onClickListener) {
        C786410Ut5.h8(this.LLIZ, onClickListener);
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C786410Ut5.LLJJJJ(this.LLILZIL, 8);
        } else {
            this.LLILZIL.setText(charSequence);
            C786410Ut5.LLJJJJ(this.LLILZIL, 0);
        }
    }

    public void setTitleStyle(int i) {
        this.LLILZIL.LJJJI(i);
    }

    public void setButtonIcon(Drawable drawable) {
        this.LLIZ.setIcon(drawable);
        this.LLIZ.setIconAutoMirrored(true);
    }

    public void setButtonText(int i) {
        setButtonText(getContext().getString(i));
    }

    public void setIcon(Drawable drawable) {
        LiveIconView liveIconView = this.LLILLL;
        if (liveIconView != null) {
            liveIconView.setIcon(drawable);
            this.LLILLL.setIconAutoMirrored(true);
        }
        if (drawable == null) {
            j0(0);
        } else {
            j0(1);
        }
    }

    public void setIllustration(int i) {
        setIllustration(C14MI.LIZ(getContext(), i));
    }

    public void setMessage(int i) {
        setMessage(getContext().getString(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getString(i));
    }

    public C16FT(C1361400lX0 c1361400lX0, int i) {
        super(c1361400lX0, null, R.attr.ewm);
        ViewGroup.inflate(c1361400lX0, R.layout.dhr, this);
        this.LLILLL = (LiveIconView) findViewById(R.id.lkw);
        this.LLILZ = (ImageView) findViewById(R.id.ll6);
        this.LLIZ = (C16FS) findViewById(R.id.clq);
        this.LLILZIL = (C16F5) findViewById(R.id.tv_title);
        this.LLILZLL = (C16F5) findViewById(R.id.zxa);
        this.LLIZLLLIL = (LinearLayout) findViewById(R.id.ndn);
        this.LLJ = findViewById(R.id.nnp);
        new AbstractC20736416Ck<C16FT>(this) { // from class: X.16FU
            @Override // X.AbstractC20736516Cl
            public final int[] LIZLLL() {
                return R$styleable.LiveStatusView;
            }

            {
                super(this);
            }

            @Override // X.AbstractC20736416Ck
            public final void LJFF(TypedArray typedArray) {
                TextView textView;
                ColorStateList colorStateListLIZ;
                ColorStateList colorStateListLIZ2;
                int indexCount = typedArray.getIndexCount();
                for (int i2 = 0; i2 < indexCount; i2++) {
                    int index = typedArray.getIndex(i2);
                    if (index == R$styleable.LiveStatusView_layoutType) {
                        HandlerHook.viewPost(this.LL, new ARunnableS42S0101000_31(typedArray.getInt(index, 0), this, 6));
                    } else if (index == R$styleable.LiveStatusView_iconSize) {
                        ((C16FT) this.LL).setIconSize(typedArray.getDimensionPixelSize(index, this.LL.getContext().getResources().getDimensionPixelSize(R.dimen.a5r)));
                    } else if (index == R$styleable.LiveStatusView_illustration) {
                        ((C16FT) this.LL).setIllustration(typedArray.getResourceId(index, 0));
                    } else if (index == R$styleable.LiveStatusView_icon) {
                        int iLJFF = C20736316Cj.LJFF(this.LL.getContext(), typedArray, index);
                        if (iLJFF != -1) {
                            ((C16FT) this.LL).setIcon(iLJFF);
                        } else {
                            ((C16FT) this.LL).setIcon((Drawable) null);
                        }
                    } else if (index == R$styleable.LiveStatusView_iconTint) {
                        ((C16FT) this.LL).setIconTint(C16F8.LIZ(this.LL.getContext(), typedArray, index));
                    } else if (index == R$styleable.LiveStatusView_title) {
                        ((C16FT) this.LL).setTitle(C786410Ut5.Xd(typedArray, index));
                    } else if (index == R$styleable.LiveStatusView_message) {
                        ((C16FT) this.LL).setMessage(C786410Ut5.Xd(typedArray, index));
                    } else if (index == R$styleable.LiveStatusView_buttonMessage) {
                        ((C16FT) this.LL).setButtonText(C786410Ut5.Xd(typedArray, index));
                    } else if (index == R$styleable.LiveStatusView_buttonIcon) {
                        int iLJFF2 = C20736316Cj.LJFF(this.LL.getContext(), typedArray, index);
                        if (iLJFF2 != -1) {
                            ((C16FT) this.LL).setButtonIcon(iLJFF2);
                        } else {
                            ((C16FT) this.LL).setButtonIcon((Drawable) null);
                        }
                    } else if (index == R$styleable.LiveStatusView_buttonStyle) {
                        int resourceId = typedArray.getResourceId(index, 0);
                        if (resourceId != 0) {
                            ((C16FT) this.LL).setButtonStyle(resourceId);
                        }
                    } else if (index == R$styleable.LiveStatusView_titleStyle) {
                        int resourceId2 = typedArray.getResourceId(index, 0);
                        if (resourceId2 != 0) {
                            ((C16FT) this.LL).setTitleStyle(resourceId2);
                        }
                    } else if (index == R$styleable.LiveStatusView_messageStyle) {
                        int resourceId3 = typedArray.getResourceId(index, 0);
                        if (resourceId3 != 0) {
                            ((C16FT) this.LL).setMessageStyle(resourceId3);
                        }
                    } else if (index == R$styleable.LiveStatusView_titleTextColor) {
                        TextView textView2 = (TextView) this.LL.findViewById(R.id.tv_title);
                        if (textView2 != null && (colorStateListLIZ2 = C16F8.LIZ(this.LL.getContext(), typedArray, index)) != null) {
                            textView2.setTextColor(colorStateListLIZ2);
                        }
                    } else if (index == R$styleable.LiveStatusView_messageTextColor && (textView = (TextView) this.LL.findViewById(R.id.zxa)) != null && (colorStateListLIZ = C16F8.LIZ(this.LL.getContext(), typedArray, index)) != null) {
                        textView.setTextColor(colorStateListLIZ);
                    }
                }
            }
        }.LJII(null, R.attr.ewm, R.style.a35);
        HandlerHook.viewPost(this, new ARunnableS131S0100000_31(this, 200));
    }
}
