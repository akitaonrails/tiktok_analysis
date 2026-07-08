package androidx.cardview.widget;

import X.C19RO;
import X.C19RP;
import X.C19RQ;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: loaded from: classes34.dex */
public class CardView extends FrameLayout {
    public static final int[] LLILZLL = {R.attr.colorBackground};
    public static final C19RO LLIZ = new C19RO();
    public boolean LL;
    public boolean LLILLJJLI;
    public final Rect LLILLL;
    public final Rect LLILZ;
    public final C19RQ LLILZIL;

    public CardView() {
        throw null;
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C19RP) this.LLILZIL.LIZ).LJII;
    }

    public float getCardElevation() {
        return this.LLILZIL.LIZIZ.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.LLILLL.bottom;
    }

    public int getContentPaddingLeft() {
        return this.LLILLL.left;
    }

    public int getContentPaddingRight() {
        return this.LLILLL.right;
    }

    public int getContentPaddingTop() {
        return this.LLILLL.top;
    }

    public float getMaxCardElevation() {
        return ((C19RP) this.LLILZIL.LIZ).LJ;
    }

    public float getRadius() {
        return ((C19RP) this.LLILZIL.LIZ).LIZ;
    }

    public boolean getPreventCornerOverlap() {
        return this.LLILLJJLI;
    }

    public boolean getUseCompatPadding() {
        return this.LL;
    }

    public void setCardBackgroundColor(int i) {
        C19RQ c19rq = this.LLILZIL;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        C19RP c19rp = (C19RP) c19rq.LIZ;
        c19rp.LIZIZ(colorStateListValueOf);
        c19rp.invalidateSelf();
    }

    public void setCardElevation(float f) {
        this.LLILZIL.LIZIZ.setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        LLIZ.LIZ(this.LLILZIL, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setPreventCornerOverlap(boolean z) {
        if (z != this.LLILLJJLI) {
            this.LLILLJJLI = z;
            C19RO c19ro = LLIZ;
            C19RQ c19rq = this.LLILZIL;
            c19ro.LIZ(c19rq, ((C19RP) c19rq.LIZ).LJ);
        }
    }

    public void setRadius(float f) {
        C19RP c19rp = (C19RP) this.LLILZIL.LIZ;
        if (f != c19rp.LIZ) {
            c19rp.LIZ = f;
            c19rp.LIZJ(null);
            c19rp.invalidateSelf();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setUseCompatPadding(boolean z) {
        if (this.LL != z) {
            this.LL = z;
            C19RO c19ro = LLIZ;
            C19RQ c19rq = this.LLILZIL;
            c19ro.LIZ(c19rq, ((C19RP) c19rq.LIZ).LJ);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C19RP c19rp = (C19RP) this.LLILZIL.LIZ;
        c19rp.LIZIZ(colorStateList);
        c19rp.invalidateSelf();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.zhiliaoapp.musically.R.attr.bfj);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.LLILLL = rect;
        this.LLILZ = new Rect();
        C19RQ c19rq = new C19RQ(this);
        this.LLILZIL = c19rq;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CardView, i, com.zhiliaoapp.musically.R.style.hp);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.CardView_cardBackgroundColor)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.CardView_cardBackgroundColor);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(LLILZLL);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.zhiliaoapp.musically.R.color.gj);
            } else {
                color = getResources().getColor(com.zhiliaoapp.musically.R.color.gi);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.CardView_cardCornerRadius, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.CardView_cardElevation, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(R$styleable.CardView_cardMaxElevation, 0.0f);
        this.LL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CardView_cardUseCompatPadding, false);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPadding, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPaddingBottom, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        C19RO c19ro = LLIZ;
        C19RP c19rp = new C19RP(dimension, colorStateListValueOf);
        c19rq.LIZ = c19rp;
        setBackgroundDrawable(c19rp);
        setClipToOutline(true);
        setElevation(dimension2);
        c19ro.LIZ(c19rq, dimension3);
    }

    public void LJII(int i, int i2, int i3, int i4) {
        this.LLILLL.set(i, i2, i3, i4);
        C19RO.LIZIZ(this.LLILZIL);
    }
}
