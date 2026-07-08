package X;

import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aVk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C937780aVk extends C2217421BqW implements Function1<Integer, Unit> {
    public C937780aVk(Object obj) {
        super(1, obj, C937770aVj.class, "handleMultiLiveUIChangeEvent", "handleMultiLiveUIChangeEvent(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        C937770aVj c937770aVj = (C937770aVj) this.receiver;
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                c937770aVj.getClass();
                if (iIntValue == 3 && C925150aBN.LJJIJIIJI() && c937770aVj.LIZJ != null) {
                    c937770aVj.LJIILLIIL(false);
                }
            } else {
                c937770aVj.LJIIZILJ(true);
                TextView textView = c937770aVj.LIZJ;
                if (textView != null) {
                    c937770aVj.LJIILLIIL(true);
                    textView.setTextColor(C497740JfY.LJFF(R.color.a51));
                    c937770aVj.LJIJI();
                }
            }
        } else {
            c937770aVj.LJIIZILJ(true);
            TextView textView2 = c937770aVj.LIZJ;
            if (textView2 != null) {
                c937770aVj.LJIILLIIL(true);
                textView2.setTextColor(C497740JfY.LJFF(R.color.a50));
                c937770aVj.LJIJI();
            }
        }
        return Unit.LIZ;
    }
}
