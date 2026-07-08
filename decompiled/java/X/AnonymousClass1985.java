package X;

import Y.ALAdapterS26S0100000_32;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.1985, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1985 implements InterfaceC194555119t {
    public final Function1<FrameLayout, Unit> LL;
    public final Effect LLILLJJLI;
    public FrameLayout LLILLL;
    public View LLILZ;
    public boolean LLILZIL;

    @Override // X.InterfaceC194555119t
    public final boolean isShowing() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC194555119t
    public final void LIZ(FrameLayout frameLayout) {
        if (this.LLILLJJLI != null && frameLayout != null) {
            this.LLILLL = frameLayout;
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(frameLayout.getContext()), R.layout.d9e, frameLayout, false);
            this.LLILZ = viewTd;
            this.LLILLL.addView(viewTd);
            View view = this.LLILZ;
            if (view != null) {
                C786410Ut5.T4(view, 0.0f);
                view.animate().alpha(1.0f).setDuration(150L).start();
            }
            Function1<FrameLayout, Unit> function1 = this.LL;
            if (function1 != null) {
                function1.invoke(frameLayout);
            }
            this.LLILZIL = true;
        }
    }

    @Override // X.InterfaceC194555119t
    public final void LJJJJLL(boolean z) {
        if (this.LLILLJJLI == null) {
            return;
        }
        View view = this.LLILZ;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(150L).setListener(new ALAdapterS26S0100000_32(this, 2)).start();
        }
        this.LLILZIL = false;
    }

    public AnonymousClass1985(Effect effect, AwS611S0100000_32 awS611S0100000_32) {
        this.LL = awS611S0100000_32;
        this.LLILLJJLI = effect;
    }
}
