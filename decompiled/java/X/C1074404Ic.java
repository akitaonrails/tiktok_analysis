package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.04Ic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1074404Ic extends FrameLayout {
    public final ViewGroup LL;
    public Function2<? super Integer, ? super ReviewFilterStruct, Unit> LLILLJJLI;

    public final void setOnSelectedChangeListener(Function2<? super Integer, ? super ReviewFilterStruct, Unit> function2) {
        this.LLILLJJLI = function2;
    }

    public C1074404Ic(Context context, AttributeSet attributeSet) {
        ViewGroup viewGroup;
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.commerce_HorizontalFilterGroup);
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.commerce_HorizontalFilterGroup_use_flowLayout, false)) {
            C426160GnO c426160GnO = new C426160GnO(context, null, 6);
            C786410Ut5.a7(c426160GnO, new FrameLayout.LayoutParams(-1, -1));
            c426160GnO.setGravity(-1);
            c426160GnO.setMaxTagLines(1);
            viewGroup = c426160GnO;
        } else {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            viewGroup = linearLayout;
        }
        this.LL = viewGroup;
        typedArrayObtainStyledAttributes.recycle();
        addView(viewGroup);
    }
}
