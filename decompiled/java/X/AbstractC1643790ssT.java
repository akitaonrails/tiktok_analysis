package X;

import Y.ACListenerS159S0100000_25;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import avg.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS569S0100000_25;
import mf.a;

/* JADX INFO: renamed from: X.0ssT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1643790ssT extends FrameLayout {
    public static final /* synthetic */ int LLILLL = 0;
    public Function0<Unit> LL;
    public final C01GW<C1629670sVh> LLILLJJLI;

    public abstract void LJ();

    private final C1629670sVh getAutoRetryManager() {
        return this.LLILLJJLI.getValue();
    }

    public final void LIZ() {
        if (C20510015Ni.LIZ.LJI() == EnumC1641500som.AVAILABLE) {
            return;
        }
        getAutoRetryManager().LIZ();
    }

    public final void LIZJ() {
        if (this.LLILLJJLI.isInitialized()) {
            getAutoRetryManager().LIZIZ();
        } else if (C20510015Ni.LIZ.LJI() == EnumC1641500som.AVAILABLE) {
            this.LL.invoke();
        }
    }

    public final void LIZLLL() {
        if (this.LLILLJJLI.isInitialized()) {
            getAutoRetryManager().LIZJ();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZLLL();
    }

    public static void LIZIZ(AbstractC1643790ssT abstractC1643790ssT) {
        abstractC1643790ssT.getClass();
        C786410Ut5.X1(abstractC1643790ssT, 8);
    }

    public final void setAutoRetryCondition(Function0<Boolean> function0) {
        getAutoRetryManager().LIZ = function0;
    }

    public final void setRetryCallback(Function0<Unit> function0) {
        this.LL = function0;
        View.OnClickListener aCListenerS159S0100000_25 = new ACListenerS159S0100000_25(this, 54);
        if (C1848410yCV.LIZ) {
            aCListenerS159S0100000_25 = new f(aCListenerS159S0100000_25);
        }
        a aVar = new a(aCListenerS159S0100000_25);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            LJ();
        } else {
            LIZLLL();
        }
    }

    public AbstractC1643790ssT(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC1643790ssT(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = AFwS207S0000000_19.get$arr$(685);
        this.LLILLJJLI = C452501pT.LIZ(EnumC452301pR.NONE, new AwS569S0100000_25(this, 858));
    }
}
