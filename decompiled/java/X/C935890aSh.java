package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0aSh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C935890aSh extends AbstractC960470b6L<InterfaceC935960aSo> {
    public final Context LL;
    public final LiveIconView LLILLJJLI;
    public final View LLILLL;

    public C935890aSh(Context context, ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(context), R.layout.he1, viewGroup, false));
        this.LL = context;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke((int) C497740JfY.LIZIZ(2.0f), C20736316Cj.LIZIZ(R.attr.c5w, context));
        gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(12.0f));
        this.LLILLJJLI = (LiveIconView) this.itemView.findViewById(R.id.l9n);
        View viewFindViewById = this.itemView.findViewById(R.id.bk6);
        viewFindViewById.setBackground(gradientDrawable);
        this.LLILLL = viewFindViewById;
    }

    @Override // X.AbstractC960470b6L
    /* JADX INFO: renamed from: L5, reason: merged with bridge method [inline-methods] */
    public void I5(InterfaceC935960aSo interfaceC935960aSo, int i) {
        int i2;
        View view = this.LLILLL;
        if (interfaceC935960aSo.LIZJ()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, view);
        if (interfaceC935960aSo.getEnable()) {
            this.LLILLJJLI.setIconTint(C20736316Cj.LIZIZ(R.attr.eyw, this.LL));
        } else {
            this.LLILLJJLI.setIconTint(C20736316Cj.LIZIZ(R.attr.exr, this.LL));
        }
        this.itemView.setTag(interfaceC935960aSo);
    }
}
