package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gel, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC420810Gel extends ConstraintLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C08I7<String, Float> LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;

    public static /* synthetic */ void getWhiteBarStyle$annotations() {
    }

    public final Drawable getGreyBarBG() {
        return (Drawable) this.LLILZIL.getValue();
    }

    public View getTouchArea() {
        return (View) this.LLILLJJLI.getValue();
    }

    public final TuxTextView getUpvoteTV() {
        return (TuxTextView) this.LL.getValue();
    }

    public final Drawable getWhiteBarBG() {
        return (Drawable) this.LLILZ.getValue();
    }

    public int getWhiteBarStyle() {
        return this.LLILZLL;
    }

    public final float e0(String str) {
        Float fLIZIZ = this.LLILLL.LIZIZ(str);
        if (fLIZIZ != null && !Intrinsics.LIZLLL(fLIZIZ, 0.0f)) {
            return fLIZIZ.floatValue();
        }
        float fMeasureText = getUpvoteTV().getPaint().measureText(str);
        this.LLILLL.LIZLLL(str, Float.valueOf(fMeasureText));
        return fMeasureText;
    }

    public void setSummaryInfo(boolean z) {
        this.LLIZ = z;
    }

    public void setWhiteBarStyle(int i) {
        this.LLILZLL = i;
    }

    public AbstractC420810Gel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC420810Gel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LL = C452501pT.LIZ(enumC452301pR, new C420400Ge6(this));
        this.LLILLJJLI = C452501pT.LIZ(enumC452301pR, new C420390Ge5(this));
        this.LLILLL = new C08I7<>(64);
        setMaxWidth((C497820Jfg.LIZIZ(context) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        this.LLILZ = C452501pT.LIZ(enumC452301pR, new C420380Ge4(context));
        this.LLILZIL = C452501pT.LIZ(enumC452301pR, new C420370Ge3(context));
    }
}
