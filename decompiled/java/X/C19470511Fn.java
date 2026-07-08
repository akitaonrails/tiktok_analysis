package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11Fn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19470511Fn extends FrameLayout {
    public static final int LLLFFI;
    public static final int LLLFZ;
    public static final int LLLI;
    public C19470411Fm LL;
    public C19470711Fp LLILLJJLI;
    public LinearLayout LLILLL;
    public ImageView LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public FrameLayout LLIZ;
    public ImageView LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public C19670811xi LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public Animation LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public Drawable LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public int LLJLIL;
    public Drawable LLJLILLLLZIIL;
    public Drawable LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public int LLJZ;
    public int LLJZIJLIL;
    public int LLL;
    public LinearLayout LLLF;
    public FrameLayout LLLFF;

    static {
        Context context = C19733712It.LIZ;
        LLLFFI = C19733712It.LJFF;
        LLLFZ = ColorProtector.parseColor("#80000000");
        LLLI = R.color.b8;
    }

    public final void LJI() {
        Drawable drawableLIZJ;
        C1331100kk8 c1331100kk8 = new C1331100kk8();
        C1331070kk5 c1331070kk5LIZ = new C1331090kk7(getResources()).LIZ();
        int i = this.LLL;
        int iLIZ = C960203pA.LIZ(R.attr.a04, getContext());
        int iLIZ2 = C960203pA.LIZ(R.attr.a1r, getContext());
        getAvTextView().setStatusTextColor(iLIZ);
        int i2 = this.LLJILLL;
        this.LLJJ = this.LLJJIJIL + i2;
        if (this.LLJIJIL) {
            c1331100kk8.LIZIZ = true;
            c1331070kk5LIZ.LJJIII(c1331100kk8);
            if (this.LLJLILLLLZIIL == null) {
                this.LLJLILLLLZIIL = C426580Go4.LIZ(i, i, 0);
            }
        } else {
            c1331100kk8.LIZIZ = false;
            c1331100kk8.LJII(i2);
            if (this.LLJLILLLLZIIL == null) {
                this.LLJLILLLLZIIL = C426580Go4.LIZJ(i, i, 0, this.LLJILLL);
            }
        }
        if (this.LLJILJILJ) {
            drawableLIZJ = C426580Go4.LIZ(iLIZ, 0, this.LLJJIJIL);
            this.LLJLL = C426580Go4.LIZ(i, i, 0);
        } else {
            drawableLIZJ = C426580Go4.LIZJ(iLIZ, 0, this.LLJJIJIL, this.LLJJ);
            this.LLJLL = C426580Go4.LIZJ(i, i, 0, this.LLJILLL);
        }
        c1331070kk5LIZ.LJJIII(c1331100kk8);
        c1331070kk5LIZ.LJIJ(this.LLJLILLLLZIIL, 1);
        c1331070kk5LIZ.LJIJ(this.LLJLILLLLZIIL, 5);
        getImageView().setImageHierarchy(c1331070kk5LIZ);
        C19470411Fm imageView = getImageView();
        boolean z = this.LLJJJJLIIL;
        if (!imageView.LLJ) {
            ImageView imageView2 = imageView.LLILZIL;
            if (imageView2 == null) {
                imageView2 = null;
            }
            C786410Ut5.LJZI(z ? 0 : 8, imageView2);
        }
        C19470411Fm imageView3 = getImageView();
        int i3 = this.LLJLIL;
        imageView3.setPadding(i3, i3, i3, i3);
        if (this.LLJLLL) {
            getImageView().setBackground(this.LLJLL);
        }
        View view = this.LLILZIL;
        if (view == null) {
            view = null;
        }
        view.setBackground(drawableLIZJ);
        View view2 = this.LLILZIL;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.LJLLLLLL(8, view2);
        ImageView imageView4 = this.LLILZ;
        if (imageView4 == null) {
            imageView4 = null;
        }
        C786410Ut5.LJZI(8, imageView4);
        LinearLayout linearLayout = this.LLILLL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.LJZL(this.LLJJIII ? 0 : 8, linearLayout);
        C19470711Fp avTextView = getAvTextView();
        int i4 = this.LLJJIII ? 0 : 8;
        int visibility = avTextView.getVisibility();
        avTextView.setVisibility(i4);
        C1602160rnK.LIZIZ(visibility, i4, avTextView);
        if (this.LLJLLIL) {
            this.LLJLLIL = true;
            getAvTextView().setSingleLine();
            getAvTextView().setHorizontalFadingEdgeEnabled(true);
            getAvTextView().setFadingEdgeLength((int) C11VU.LIZIZ(4.0f, getContext()));
        }
        if (this.LLJJIII) {
            getAvTextView().setTuxFont(71);
        } else {
            getAvTextView().setTuxFont(41);
        }
        getAvTextView().setOldPanelStyle(this.LLJJJ);
        Drawable drawableLIZ = C426580Go4.LIZ(iLIZ2, iLIZ2, this.LLJJIJIL);
        View view3 = this.LLILZLL;
        if (view3 == null) {
            view3 = null;
        }
        view3.setBackground(drawableLIZ);
        View view4 = this.LLILZLL;
        if (view4 == null) {
            view4 = null;
        }
        C786410Ut5.LJLLLLLL(8, view4);
        Drawable drawable = this.LLJJLIIIJLLLLLLLZ;
        if (drawable != null) {
            Context context = C19733712It.LIZ;
            this.LLJJLIIIJLLLLLLLZ = C19733712It.LIZLLL(drawable);
            getImageView().setIconImageViewScaleType(InterfaceC1320380kSq.LJI);
            C19470411Fm imageView5 = getImageView();
            Drawable drawable2 = this.LLJJLIIIJLLLLLLLZ;
            if (imageView5.LL) {
                SmartImageView smartImageView = imageView5.LLILZ;
                if (smartImageView == null) {
                    smartImageView = null;
                }
                smartImageView.setImageDrawable(drawable2);
            } else {
                C1324800kZy c1324800kZy = imageView5.LLILLL;
                if (c1324800kZy == null) {
                    c1324800kZy = null;
                }
                c1324800kZy.setImageDrawable(drawable2);
            }
            getImageView().setBackground(this.LLJLL);
        }
        if (!TextUtils.isEmpty(this.LLJL)) {
            setText(this.LLJL);
        }
        boolean z2 = this.LLJJIJI;
        FrameLayout frameLayout = this.LLIZ;
        C786410Ut5.LJZ(z2 ? 0 : 8, frameLayout != null ? frameLayout : null);
    }

    public final C19470711Fp getAvTextView() {
        C19470711Fp c19470711Fp = this.LLILLJJLI;
        if (c19470711Fp != null) {
            return c19470711Fp;
        }
        return null;
    }

    public final C19470411Fm getImageView() {
        C19470411Fm c19470411Fm = this.LL;
        if (c19470411Fm != null) {
            return c19470411Fm;
        }
        return null;
    }

    public final FrameLayout getImgLayout() {
        return this.LLLFF;
    }

    public final void LIZ(float f) {
        C19470411Fm imageView = getImageView();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(imageView);
        imageView.setAlpha(f);
    }

    public final void LIZIZ(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        C19470411Fm imageView = getImageView();
        ImageView imageView2 = null;
        if (imageView.LL) {
            SmartImageView smartImageView = imageView.LLILZ;
            if (smartImageView != null) {
                imageView2 = smartImageView;
            }
            imageView2.setImageDrawable(drawable);
            return;
        }
        C1324800kZy c1324800kZy = imageView.LLILLL;
        if (c1324800kZy != null) {
            imageView2 = c1324800kZy;
        }
        imageView2.setImageDrawable(drawable);
    }

    public final void LIZJ(Uri uri) {
        if (uri == null) {
            return;
        }
        C19470411Fm imageView = getImageView();
        C1324800kZy c1324800kZy = null;
        SmartImageView smartImageView = null;
        if (imageView.LL) {
            C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(uri);
            C19470411Fm.LIZ(c1331670kl3LJI);
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LIZ = true;
            c1331670kl3LJI.LJJI = new C1331730kl9(c1331750klB);
            SmartImageView smartImageView2 = imageView.LLILZ;
            if (smartImageView2 != null) {
                smartImageView = smartImageView2;
            }
            c1331670kl3LJI.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJI);
            return;
        }
        C1324800kZy c1324800kZy2 = imageView.LLILLL;
        if (c1324800kZy2 != null) {
            c1324800kZy = c1324800kZy2;
        }
        C1324750kZt.LJIIIZ(c1324800kZy, uri.toString(), -1, -1);
    }

    public final void LIZLLL(String str) {
        if (str == null) {
            return;
        }
        C19470411Fm imageView = getImageView();
        C1324800kZy c1324800kZy = null;
        SmartImageView smartImageView = null;
        if (imageView.LL) {
            C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(str));
            C19470411Fm.LIZ(c1331670kl3LJII);
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LIZ = true;
            c1331670kl3LJII.LJJI = new C1331730kl9(c1331750klB);
            SmartImageView smartImageView2 = imageView.LLILZ;
            if (smartImageView2 != null) {
                smartImageView = smartImageView2;
            }
            c1331670kl3LJII.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJII);
            return;
        }
        C1324800kZy c1324800kZy2 = imageView.LLILLL;
        if (c1324800kZy2 != null) {
            c1324800kZy = c1324800kZy2;
        }
        C1324750kZt.LJIIIZ(c1324800kZy, new C0VSJ(str).toURI().toString(), -1, -1);
    }

    public final void LJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C19470411Fm imageView = getImageView();
        SmartImageView smartImageView = null;
        if (imageView.LL) {
            if (str != null) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                C19470411Fm.LIZ(c1331670kl3LJIIIZ);
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LIZ = true;
                c1331670kl3LJIIIZ.LJJI = new C1331730kl9(c1331750klB);
                SmartImageView smartImageView2 = imageView.LLILZ;
                if (smartImageView2 != null) {
                    smartImageView = smartImageView2;
                }
                c1331670kl3LJIIIZ.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LJIIIZ);
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("editing_music_list_panel");
        sbLIZ.append("@@");
        sbLIZ.append("creation");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1324800kZy c1324800kZy = imageView.LLILLL;
        if (c1324800kZy == null) {
            c1324800kZy = null;
        }
        C1324750kZt.LJIIJJI(c1324800kZy, str, -1, -1, null, null, null, strLIZIZ);
    }

    public final void LJFF(boolean z) {
        int i;
        if (this.LLJJIII) {
            C19470711Fp avTextView = getAvTextView();
            avTextView.LLJL = z;
            if (z) {
                if (avTextView.LLJJJJ) {
                    avTextView.setTextColor(avTextView.LLJJL);
                }
            } else {
                avTextView.setTextColor(avTextView.LLJJJJLIIL);
            }
            getAvTextView().setSelected(z);
        }
        if (this.LLJJI) {
            View view = this.LLILZIL;
            if (view == null) {
                view = null;
            }
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        if (z && this.LLJLLIL) {
            getAvTextView().setEllipsize(TextUtils.TruncateAt.MARQUEE);
        } else {
            getAvTextView().setEllipsize(null);
        }
    }

    public final void LJII(boolean z) {
        ImageView imageView = null;
        if (z) {
            ImageView imageView2 = this.LLILZ;
            if (imageView2 == null) {
                imageView2 = null;
            }
            imageView2.clearAnimation();
            ImageView imageView3 = this.LLILZ;
            if (imageView3 == null) {
                imageView3 = null;
            }
            C786410Ut5.LJZI(0, imageView3);
            ImageView imageView4 = this.LLILZ;
            if (imageView4 != null) {
                imageView = imageView4;
            }
            imageView.startAnimation(this.LLJJJJJIL);
            return;
        }
        ImageView imageView5 = this.LLILZ;
        if (imageView5 == null) {
            imageView5 = null;
        }
        C786410Ut5.LJZI(8, imageView5);
        ImageView imageView6 = this.LLILZ;
        if (imageView6 != null) {
            imageView = imageView6;
        }
        imageView.clearAnimation();
    }

    public final void setAvTextView(C19470711Fp c19470711Fp) {
        this.LLILLJJLI = c19470711Fp;
    }

    public final void setClickStatusColor(int i) {
        Drawable drawableLIZJ;
        if (this.LLJIJIL) {
            drawableLIZJ = C426580Go4.LIZ(i, 0, this.LLJJIJIL);
        } else {
            drawableLIZJ = C426580Go4.LIZJ(i, 0, this.LLJJIJIL, this.LLJJ);
        }
        View view = this.LLILZIL;
        if (view == null) {
            view = null;
        }
        view.setBackground(drawableLIZJ);
        getAvTextView().setStatusTextColor(i);
    }

    public final void setEnableUI(boolean z) {
        getImageView().setEnableUI(z);
        getAvTextView().setEnableUI(z);
        ImageView imageView = null;
        if (z) {
            ImageView imageView2 = this.LLIZLLLIL;
            if (imageView2 != null) {
                imageView = imageView2;
            }
            imageView.clearColorFilter();
            return;
        }
        ImageView imageView3 = this.LLIZLLLIL;
        if (imageView3 != null) {
            imageView = imageView3;
        }
        imageView.setColorFilter(R.color.eq, PorterDuff.Mode.DST_IN);
    }

    public final void setIconImagePadding(int i) {
        int iLIZIZ = (int) C11VU.LIZIZ(i, getContext());
        getImageView().setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
    }

    public final void setImageView(C19470411Fm c19470411Fm) {
        this.LL = c19470411Fm;
    }

    public final void setImageViewPadding(int i) {
        getImageView().setPadding(i, i, i, i);
    }

    public final void setImgBackground(int i) {
        getImageView().setImageBackground(i);
    }

    public final void setImgLayout(FrameLayout frameLayout) {
        this.LLLFF = frameLayout;
    }

    public final void setOnlyTextClickStatusColor(int i) {
        getAvTextView().setStatusTextColor(i);
    }

    public final void setRoundRadius(int i) {
        this.LLJILLL = i;
        this.LLJJ = i + this.LLJJIJIL;
        LJI();
    }

    public final void setShowDownloadIcon(boolean z) {
        getImageView().setShowDownloadIcon(z);
    }

    public final void setShowDownloadStateIcon(boolean z) {
        int i;
        C19470411Fm imageView = getImageView();
        if (!imageView.LLJ) {
            ImageView imageView2 = imageView.LLILZIL;
            if (imageView2 == null) {
                imageView2 = null;
            }
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJZI(i, imageView2);
        }
    }

    public final void setText(CharSequence charSequence) {
        int iFloatValue;
        if (charSequence != null && charSequence.length() != 0) {
            int iMeasureText = (int) getAvTextView().getPaint().measureText(charSequence, 0, charSequence.length());
            if (this.LLJJIJIIJIL) {
                iFloatValue = (int) ((Number) C19470811Fq.LJFF.getValue()).floatValue();
            } else {
                iFloatValue = this.LLJ;
            }
            if (iMeasureText > iFloatValue && this.LLJLLIL) {
                getAvTextView().setGravity(8388611);
            } else {
                getAvTextView().setGravity(17);
            }
            LinearLayout linearLayout = this.LLILLL;
            if (linearLayout == null) {
                linearLayout = null;
            }
            C786410Ut5.LJZL(0, linearLayout);
            C19470711Fp avTextView = getAvTextView();
            int visibility = avTextView.getVisibility();
            avTextView.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, avTextView);
            getAvTextView().setText(charSequence);
        }
    }

    public final void setTextColor(int i) {
        getAvTextView().setSelectTextColor(i);
    }

    public C19470511Fn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C19470511Fn(Context context, AttributeSet attributeSet, int i) {
        int iIntValue;
        int i2;
        int i3;
        LinearLayout.LayoutParams layoutParams;
        int i4;
        super(context, attributeSet, i);
        this.LLJJL = true;
        this.LLJLLIL = true;
        this.LLJJIJIL = (int) C11VU.LIZIZ(2.0f, context);
        this.LLJJJJJIL = AnimationUtils.loadAnimation(context, R.anim.gi);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            this.LLJ = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.AVDmtView_itemImgWidth, 0.0f);
            this.LLJI = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.AVDmtView_itemImgHeight, 0.0f);
            boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_isCircle, false);
            this.LLJIJIL = z;
            this.LLJILJILJ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_isCircleBackground, z);
            this.LLJILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            this.LLJJI = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_isShowBorder, true);
            this.LLJJIII = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_isShowText, true);
            this.LLJJIJI = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_isShowBottomDot, false);
            this.LLJJJJLIIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_isShowDownloadIcon, true);
            this.LLJJL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_isShowDotOnImageView, true);
            this.LLJL = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.AVDmtView_titleText);
            this.LLJJLIIIJLLLLLLLZ = typedArrayObtainStyledAttributes.getDrawable(R$styleable.AVDmtView_localSrc);
            this.LLJLIL = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.AVDmtView_padding, 0.0f);
            this.LLJJJ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_oldPanel, false);
            this.LLJJJIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_newStickerPanel, false);
            this.LLJJJJ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_multiStickerPanel, false);
            this.LLJLLIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_textMarquee, true);
            this.LLJLLL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_showBgDrawable, false);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.AVDmtView_placeHolderDrawable);
            this.LLJLILLLLZIIL = drawable;
            this.LLJLILLLLZIIL = C19733712It.LJ(drawable, C19733712It.LIZIZ);
            int i5 = R$styleable.AVDmtView_placeHolderDrawableColor;
            if (this.LLJJJIL) {
                i4 = LLLFZ;
            } else if (!this.LLJJIII) {
                i4 = LLLI;
            } else {
                i4 = LLLFFI;
            }
            this.LLL = typedArrayObtainStyledAttributes.getColor(i5, i4);
            this.LLJJIJIIJIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_useNewWidthRule, false);
            this.LLJZ = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.AVDmtView_textTopMargin, C11VU.LIZIZ(4.0f, context));
            this.LLJZIJLIL = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.AVDmtView_bottomDotTopMargin, C11VU.LIZIZ(4.0f, context));
            typedArrayObtainStyledAttributes.recycle();
        }
        this.LLLF = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        LinearLayout linearLayout = this.LLLF;
        C786410Ut5.d6(linearLayout == null ? null : linearLayout, layoutParams2);
        LinearLayout linearLayout2 = this.LLLF;
        (linearLayout2 == null ? null : linearLayout2).setOrientation(1);
        C19670811xi c19670811xi = new C19670811xi(context, null);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19670811xi);
        c19670811xi.setLayoutParams(layoutParams2);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e4, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -7829368;
        }
        c19670811xi.setProgressColor(iIntValue);
        c19670811xi.setCircleRadius(c19670811xi.getLayoutParams().width / 2);
        c19670811xi.setUseCenterIfNeed(true);
        c19670811xi.setMaxProgress(100);
        C786410Ut5.G1(c19670811xi, 8);
        this.LLJILJIL = c19670811xi;
        setImageView(new C19470411Fm(context, this.LLJJJIL, this.LLJJJJ, this.LLJJIJIIJIL, c19670811xi));
        setAvTextView(new C19470711Fp(context));
        this.LLILZIL = new View(context);
        this.LLLFF = new FrameLayout(context);
        if (this.LLJJI) {
            int i6 = this.LLJJIJIL * 2;
            i2 = this.LLJ + i6;
            i3 = i6 + this.LLJI;
        } else {
            i2 = this.LLJ;
            i3 = this.LLJI;
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i2, i3);
        layoutParams3.gravity = 1;
        FrameLayout frameLayout = this.LLLFF;
        if (frameLayout != null) {
            C786410Ut5.a6(frameLayout, layoutParams3);
        }
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(this.LLJ, this.LLJI);
        layoutParams4.gravity = 17;
        C19470411Fm imageView = getImageView();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(imageView);
        imageView.setLayoutParams(layoutParams4);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(i2, i3);
        View view = this.LLILZIL;
        C786410Ut5.W5(view == null ? null : view, layoutParams5);
        this.LLILZ = new ImageView(context);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 17;
        ImageView imageView2 = this.LLILZ;
        (imageView2 == null ? null : imageView2).setImageDrawable(getResources().getDrawable(R.drawable.bw1));
        ImageView imageView3 = this.LLILZ;
        C786410Ut5.c6(imageView3 == null ? null : imageView3, layoutParams6);
        FrameLayout frameLayout2 = this.LLLFF;
        if (frameLayout2 != null) {
            frameLayout2.addView(getImageView());
        }
        FrameLayout frameLayout3 = this.LLLFF;
        if (frameLayout3 != null) {
            View view2 = this.LLILZIL;
            frameLayout3.addView(view2 == null ? null : view2);
        }
        FrameLayout frameLayout4 = this.LLLFF;
        if (frameLayout4 != null) {
            ImageView imageView4 = this.LLILZ;
            frameLayout4.addView(imageView4 == null ? null : imageView4);
        }
        FrameLayout frameLayout5 = this.LLLFF;
        if (frameLayout5 != null) {
            C19670811xi c19670811xi2 = this.LLJILJIL;
            frameLayout5.addView(c19670811xi2 == null ? null : c19670811xi2);
        }
        if (this.LLJJIJIIJIL) {
            layoutParams = new LinearLayout.LayoutParams((int) ((Number) C19470811Fq.LJFF.getValue()).floatValue(), -2);
        } else {
            layoutParams = new LinearLayout.LayoutParams(this.LLJ, -2);
        }
        layoutParams.gravity = 1;
        layoutParams.topMargin = this.LLJZ;
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.LLILLL = linearLayout3;
        C786410Ut5.d6(linearLayout3, layoutParams);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams7.weight = 1.0f;
        layoutParams7.gravity = 1;
        C19470711Fp avTextView = getAvTextView();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(avTextView);
        avTextView.setLayoutParams(layoutParams7);
        getAvTextView().setGravity(17);
        LinearLayout linearLayout4 = this.LLILLL;
        (linearLayout4 == null ? null : linearLayout4).addView(getAvTextView());
        this.LLILZLL = new View(context);
        int iLIZIZ = (int) C11VU.LIZIZ(6.0f, context);
        if (this.LLJJL) {
            FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ);
            layoutParams8.gravity = 8388661;
            if (this.LLJJJIL) {
                int iLIZIZ2 = (int) C11VU.LIZIZ(4.0f, context);
                View view3 = this.LLILZLL;
                if (view3 != null && view3.getLayoutDirection() == 1) {
                    layoutParams8.leftMargin = iLIZIZ2;
                } else {
                    layoutParams8.rightMargin = iLIZIZ2;
                }
                layoutParams8.topMargin = iLIZIZ2;
                View view4 = this.LLILZLL;
                C786410Ut5.W5(view4 == null ? null : view4, layoutParams8);
                C19470411Fm imageView5 = getImageView();
                View view5 = this.LLILZLL;
                imageView5.addView(view5 == null ? null : view5);
            } else {
                View view6 = this.LLILZLL;
                C786410Ut5.W5(view6 == null ? null : view6, layoutParams8);
                FrameLayout frameLayout6 = this.LLLFF;
                if (frameLayout6 != null) {
                    View view7 = this.LLILZLL;
                    frameLayout6.addView(view7 == null ? null : view7);
                }
            }
        } else {
            LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(iLIZIZ, iLIZIZ);
            layoutParams9.gravity = 8388661;
            layoutParams9.weight = 0.0f;
            View view8 = this.LLILZLL;
            C786410Ut5.W5(view8 == null ? null : view8, layoutParams9);
            LinearLayout linearLayout5 = this.LLILLL;
            linearLayout5 = linearLayout5 == null ? null : linearLayout5;
            View view9 = this.LLILZLL;
            linearLayout5.addView(view9 == null ? null : view9);
        }
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(this.LLJ, -2);
        layoutParams10.gravity = 1;
        layoutParams10.topMargin = this.LLJZIJLIL;
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.LLIZ = frameLayout7;
        C786410Ut5.a6(frameLayout7, layoutParams10);
        ImageView imageView6 = new ImageView(context);
        this.LLIZLLLIL = imageView6;
        imageView6.setImageResource(R.drawable.a_j);
        int iLIZIZ3 = (int) C11VU.LIZIZ(4.0f, context);
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(iLIZIZ3, iLIZIZ3);
        layoutParams11.gravity = 1;
        ImageView imageView7 = this.LLIZLLLIL;
        C786410Ut5.c6(imageView7 == null ? null : imageView7, layoutParams11);
        FrameLayout frameLayout8 = this.LLIZ;
        frameLayout8 = frameLayout8 == null ? null : frameLayout8;
        ImageView imageView8 = this.LLIZLLLIL;
        frameLayout8.addView(imageView8 == null ? null : imageView8);
        if (!this.LLJJIII) {
            LinearLayout linearLayout6 = this.LLLF;
            (linearLayout6 == null ? null : linearLayout6).addView(this.LLLFF);
        } else {
            LinearLayout linearLayout7 = this.LLLF;
            (linearLayout7 == null ? null : linearLayout7).addView(this.LLLFF);
            LinearLayout linearLayout8 = this.LLLF;
            linearLayout8 = linearLayout8 == null ? null : linearLayout8;
            LinearLayout linearLayout9 = this.LLILLL;
            linearLayout8.addView(linearLayout9 == null ? null : linearLayout9);
        }
        LinearLayout linearLayout10 = this.LLLF;
        linearLayout10 = linearLayout10 == null ? null : linearLayout10;
        FrameLayout frameLayout9 = this.LLIZ;
        linearLayout10.addView(frameLayout9 == null ? null : frameLayout9);
        LinearLayout linearLayout11 = this.LLLF;
        addView(linearLayout11 != null ? linearLayout11 : null);
        LJI();
    }
}
