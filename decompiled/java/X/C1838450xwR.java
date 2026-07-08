package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.ColorBackground;
import com.bytedance.android.livesdk.model.EdgeInsets;
import com.bytedance.android.livesdk.model.ImageBackground;
import com.bytedance.android.livesdk.model.ImageContent;
import com.bytedance.android.livesdk.model.RichTextStyle;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xwR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838450xwR extends ConstraintLayout {
    public final List<C1838520xwY> LL;
    public final View LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public Function0<Unit> LLILZIL;

    private final LinearLayout getStyledParagraphContainer() {
        return (LinearLayout) this.LLILLL.getValue();
    }

    public final ImageView getImageView() {
        return (ImageView) this.LLILZ.getValue();
    }

    public final List<C1838520xwY> getParagraphs() {
        return this.LL;
    }

    public final Function0<Unit> getRenderCallback() {
        return this.LLILZIL;
    }

    public final void e0(RichTextStyle richTextStyle) {
        if (richTextStyle != null) {
            ColorBackground colorBackground = richTextStyle.colorBackground;
            if (colorBackground != null) {
                int iLIZJ = C202500qF.LIZJ(0, colorBackground.color);
                float f = colorBackground.radius;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Float.valueOf(f)));
                gradientDrawable.setColor(iLIZJ);
                setBackground(gradientDrawable);
            }
            ImageModel imageModel = null;
            if (richTextStyle.colorBackground == null) {
                setBackground(null);
            }
            ImageBackground imageBackground = richTextStyle.imageBackground;
            if (imageBackground != null) {
                ImageContent imageContent = imageBackground.image;
                if (imageContent != null) {
                    imageModel = imageContent.image;
                }
                final C1838490xwV c1838490xwV = new C1838490xwV(this);
                C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
                c1324610kZfLJIIIZ.LJIIL = new InterfaceC1142670fqD() { // from class: X.0xwS
                    @Override // X.InterfaceC1142670fqD
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZIZ(Animatable animatable) {
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZLLL(String str, Exception exc) {
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZJ(int i, int i2, String str) {
                        C500260Jjc.LJLJLLL(i, this.LIZ.getImageView());
                        C500260Jjc.LJJZ(i2, this.LIZ.getImageView());
                        c1838490xwV.invoke();
                    }
                };
                c1324610kZfLJIIIZ.LJJ = Boolean.TRUE;
                c1324610kZfLJIIIZ.LJJI(getImageView());
            }
            EdgeInsets edgeInsets = richTextStyle.padding;
            if (edgeInsets != null) {
                setPadding((int) C497740JfY.LIZIZ(edgeInsets.left), (int) C497740JfY.LIZIZ(edgeInsets.top), (int) C497740JfY.LIZIZ(edgeInsets.right), (int) C497740JfY.LIZIZ(edgeInsets.bottom));
            }
            if (richTextStyle.padding == null) {
                setPadding(0, 0, 0, 0);
            }
        }
    }

    public final void setRenderCallback(Function0<Unit> function0) {
        this.LLILZIL = function0;
    }

    public C1838450xwR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new ArrayList();
        this.LLILLJJLI = ViewGroup.inflate(context, R.layout.g23, this);
        this.LLILLL = C452501pT.LIZIZ(new C1838480xwU(this));
        this.LLILZ = C452501pT.LIZIZ(new C1838470xwT(this));
        this.LLILZIL = new C1838500xwW();
    }

    public final void h0(C229100uX c229100uX, boolean z) throws Throwable {
        C1838520xwY c1838520xwY = new C1838520xwY(getContext(), null);
        if (z) {
            C20441214yg.LIZIZ("DslBoardEditText", "setEditable");
            c1838520xwY.LLJIJIL = false;
            c1838520xwY.setInputType(131073);
            c1838520xwY.setFocusableInTouchMode(true);
            c1838520xwY.setFocusable(true);
            c1838520xwY.setClickable(true);
            c1838520xwY.setImeOptions(1);
            c1838520xwY.setMinimumWidth((int) C497740JfY.LIZIZ(10.0f));
            if (Build.VERSION.SDK_INT >= 29) {
                c1838520xwY.setTextCursorDrawable(R.drawable.edc);
            }
            c1838520xwY.setHintTextColor(C20736316Cj.LIZIZ(R.attr.ezy, new ContextThemeWrapper(c1838520xwY.getContext(), R.style.z4)));
        }
        c1838520xwY.setText(c229100uX.LIZ());
        c1838520xwY.LJIIIIZZ(c229100uX.LJ);
        LinearLayout styledParagraphContainer = getStyledParagraphContainer();
        if (styledParagraphContainer != null) {
            styledParagraphContainer.addView(c1838520xwY);
        }
        ((ArrayList) this.LL).add(c1838520xwY);
    }

    public final void i0(C229200uY c229200uY, boolean z) throws Throwable {
        LinearLayout styledParagraphContainer = getStyledParagraphContainer();
        if (styledParagraphContainer != null) {
            C786410Ut5.LJJJJJL(styledParagraphContainer);
        }
        ((ArrayList) this.LL).clear();
        e0(c229200uY.LIZIZ);
        if (c229200uY.LIZ.isEmpty() && z) {
            h0(new C229100uX(0), true);
            return;
        }
        Iterator<C229100uX> it2 = c229200uY.LIZ.iterator();
        while (it2.hasNext()) {
            h0(it2.next(), z);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        String strLJJLIIIJ = C13LP.LJJLIIIJ(this.LL, ",", null, null, 0, null, new C1100260ejo(), 30);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Container-onMeasure] widthMode=");
        sbLIZ.append(mode);
        sbLIZ.append(", widthSize=");
        sbLIZ.append(size);
        sbLIZ.append(", measured=(");
        sbLIZ.append(getMeasuredWidth());
        sbLIZ.append('x');
        sbLIZ.append(getMeasuredHeight());
        sbLIZ.append("), paragraphs=[");
        sbLIZ.append(strLJJLIIIJ);
        sbLIZ.append("], paddingL=");
        sbLIZ.append(getPaddingLeft());
        sbLIZ.append(", paddingR=");
        sbLIZ.append(getPaddingRight());
        C1092200eWo.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }
}
