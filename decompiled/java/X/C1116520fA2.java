package X;

import Y.ACListenerS152S0100000_17;
import Y.ARunnableS50S0300000_17;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fA2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116520fA2 extends AbstractC1116530fA3 {
    public final InterfaceC1116540fA4 LL;
    public final View LLILLJJLI;
    public final ImageView LLILLL;
    public final C16F5 LLILZ;
    public final C1088810eRL LLILZIL;

    public C1116520fA2(View view, InterfaceC1116540fA4 interfaceC1116540fA4) {
        super(view);
        this.LL = interfaceC1116540fA4;
        this.LLILLJJLI = view.findViewById(R.id.bnu);
        this.LLILLL = (ImageView) view.findViewById(R.id.jxe);
        this.LLILZ = (C16F5) view.findViewById(R.id.title);
        this.LLILZIL = (C1088810eRL) view.findViewById(R.id.e3y);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C497740JfY.LIZIZ(C497740JfY.LJIIIZ(R.dimen.arw) - 36.0f);
        C786410Ut5.W5(view, layoutParams);
    }

    @Override // X.AbstractC1116530fA3
    public final void I5(C1116450f9v c1116450f9v, List<? extends Object> list) {
        if (!list.isEmpty() && !Intrinsics.LJFF(ListProtector.get(list, 0), "ChangeSelect")) {
            if ((!list.isEmpty()) && Intrinsics.LJFF(ListProtector.get(list, 0), "AdjustPrice")) {
                C1088810eRL c1088810eRL = this.LLILZIL;
                String strValueOf = String.valueOf(c1116450f9v.LIZ);
                EnumC1088820eRM enumC1088820eRM = c1116450f9v.LJ;
                if (enumC1088820eRM == null) {
                    enumC1088820eRM = EnumC1088820eRM.LOW;
                }
                c1088810eRL.getClass();
                c1088810eRL.postOnAnimation(new ARunnableS50S0300000_17(c1088810eRL, strValueOf, enumC1088820eRM, 7));
                return;
            }
            return;
        }
        C786410Ut5.I7(new ACListenerS152S0100000_17(this, 86), this.itemView);
        if (getPosition() != 0) {
            C500260Jjc.LJLJJL((int) C497740JfY.LIZIZ(12.0f), this.itemView);
        } else {
            C500260Jjc.LJLJJL((int) C497740JfY.LIZIZ(0.0f), this.itemView);
        }
        this.LLILZIL.setText$liverevenue_impl_release(String.valueOf(c1116450f9v.LIZ));
        if (c1116450f9v.LIZLLL) {
            this.LLILLJJLI.setBackgroundResource(R.drawable.e7s);
        } else {
            this.LLILLJJLI.setBackgroundResource(R.drawable.e7r);
        }
        if (c1116450f9v.LJ == EnumC1088820eRM.HIGH) {
            AbstractC1116530fA3.L5(this.LLILZ);
            this.LLILZ.setText(C497740JfY.LJIJJ(2131844111, String.valueOf(c1116450f9v.LIZIZ)));
            this.LLILLL.setImageResource(R.drawable.fb6);
        } else {
            this.LLILZ.setText(C497740JfY.LJIJJ(2131844104, String.valueOf(c1116450f9v.LIZIZ)));
            this.LLILLL.setImageResource(R.drawable.fb5);
        }
    }
}
