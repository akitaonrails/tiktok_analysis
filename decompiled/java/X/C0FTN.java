package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.0FTN, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FTN extends FrameLayout {
    public final InterfaceC388760FMc LL;
    public C1664690tQB<C0FTO> LLILLJJLI;
    public LifecycleOwner LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    public final View getRectView() {
        return (View) this.LLILZ.getValue();
    }

    public final TuxTextView getTextView() {
        return (TuxTextView) this.LLILZIL.getValue();
    }

    public C0FTN(Context context, InterfaceC388760FMc interfaceC388760FMc) {
        super(context, null, 0);
        this.LL = interfaceC388760FMc;
        this.LLILZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 910));
        this.LLILZIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 911));
    }
}
