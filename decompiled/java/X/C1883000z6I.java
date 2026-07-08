package X;

import android.util.Size;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0z6I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883000z6I extends C09AY implements Function2<Integer, Integer, Unit> {
    public final /* synthetic */ C1882980z6G LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1883000z6I(C1882980z6G c1882980z6G, C1883010z6J c1883010z6J) {
        super(2);
        this.LL = c1882980z6G;
        this.LLILLJJLI = c1883010z6J;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Integer num2) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        C1882980z6G c1882980z6G = this.LL;
        if (!c1882980z6G.LJI) {
            FrameLayout frameLayout = c1882980z6G.LJJIFFI;
            if (frameLayout != null) {
                frameLayout.addView(c1882980z6G.LJJI(), 0, new FrameLayout.LayoutParams(iIntValue, -2));
            }
            this.LL.LJJ().LJIJI(new Size(iIntValue, iIntValue2));
            this.LLILLJJLI.invoke();
        }
        return Unit.LIZ;
    }
}
