package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SW4, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SW4 extends C09AY implements Function0<FrameLayout> {
    public final /* synthetic */ C0SW3 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SW4(C0SW3 c0sw3) {
        super(0);
        this.LL = c0sw3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View, android.widget.FrameLayout] */
    @Override // kotlin.jvm.functions.Function0
    public final FrameLayout invoke() {
        C0SW3 c0sw3 = this.LL;
        C0R7E c0r7e = c0sw3.LIZIZ;
        if (!(c0r7e instanceof C0SZ8)) {
            "invalid input component should be implemented from IFeedViewHolder".toString();
            throw new IllegalStateException("invalid input component should be implemented from IFeedViewHolder");
        }
        View viewQg = ((C0SZ8) c0r7e).Qg("ad4ad_button", true);
        ViewGroup viewGroup = viewQg instanceof ViewGroup ? (ViewGroup) viewQg : 0;
        ?? Td = C786410Ut5.Td(C786410Ut5.ne(c0sw3.LIZ.getContext()), R.layout.b4s, viewGroup, false);
        if (viewGroup != 0) {
            viewGroup.addView(Td);
        }
        return Td;
    }
}
