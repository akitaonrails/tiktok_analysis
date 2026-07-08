package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Hb1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443970Hb1 extends C444090HbD<InterfaceC444050Hb9> {
    public View LL;
    public RemoteImageView LLILLJJLI;
    public View LLILLL;
    public TuxIconView LLILZ;
    public InterfaceC444050Hb9 LLILZIL;
    public final /* synthetic */ C443960Hb0 LLILZLL;

    @Override // X.C444090HbD
    public final void N5() {
        Integer num;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Drawable drawable;
        Drawable drawableNewDrawable;
        View viewFindViewById = this.itemView.findViewById(R.id.wx9);
        this.LL = viewFindViewById;
        C449650HkB c449650HkB = this.LLILZLL.LLILLL;
        View view = null;
        if (c449650HkB != null && (drawable = c449650HkB.LLILZIL) != null && viewFindViewById != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            viewFindViewById.setBackground((constantState == null || (drawableNewDrawable = constantState.newDrawable()) == null) ? null : drawableNewDrawable.mutate());
        }
        C449650HkB c449650HkB2 = this.LLILZLL.LLILLL;
        if (c449650HkB2 != null && (num = c449650HkB2.LLJJJJLIIL) != null) {
            int iIntValue = num.intValue();
            View view2 = this.LL;
            ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMarginStart((int) (iIntValue / 2));
                    marginLayoutParams.setMarginEnd((int) (iIntValue / 2));
                    marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                }
            } else {
                marginLayoutParams = null;
            }
            View view3 = this.LL;
            if (view3 != null) {
                C786410Ut5.W5(view3, marginLayoutParams);
            }
        }
        this.LLILLJJLI = (RemoteImageView) this.itemView.findViewById(R.id.wy_);
        this.LLILZ = (TuxIconView) this.itemView.findViewById(R.id.wxw);
        View viewFindViewById2 = this.itemView.findViewById(R.id.wys);
        if (viewFindViewById2 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
            viewFindViewById2.setBackground(c384050F3z.LIZ(viewFindViewById2.getContext()));
            view = viewFindViewById2;
        }
        this.LLILLL = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C443970Hb1(C443960Hb0 c443960Hb0, View view) {
        super(view);
        this.LLILZLL = c443960Hb0;
    }

    @Override // X.C444090HbD
    public final void I5(int i, Object obj) {
        new C443980Hb2(this, (InterfaceC444050Hb9) obj, this.LLILZLL, i).invoke();
    }
}
