package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.top.BottomNoticeViewModel;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.06hn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1678906hn extends LinearLayout implements InterfaceC497601wk, InterfaceC1632106aF, GenericLifecycleObserver {
    public final InterfaceC1632106aF LL;
    public final AbstractC2238408pq LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;

    @Override // X.InterfaceC1632106aF
    public final void LJIILIIL() {
        this.LL.LJIILIIL();
    }

    @Override // X.C06OA
    public final void LLLZIL(C06MF c06mf) {
        this.LL.LLLZIL(c06mf);
    }

    @Override // X.C06OA
    public final void LLZLI() {
        this.LL.LLZLI();
    }

    @Override // X.C06OA
    public final void l(C06MF c06mf) {
        this.LL.l(c06mf);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    static {
        C418440Gaw.LIZIZ(146);
    }

    private final TuxIconView getDismissButton() {
        return (TuxIconView) this.LLILZIL.getValue();
    }

    private final TuxTextView getTitleView() {
        return (TuxTextView) this.LLILZ.getValue();
    }

    private final BottomNoticeViewModel getViewModel() {
        return (BottomNoticeViewModel) this.LLILLL.getValue();
    }

    public final RecyclerView getRecyclerview() {
        return (RecyclerView) this.LLILZLL.getValue();
    }

    public final View getSuggestedStickerContainer() {
        return (View) this.LLIZ.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2157308cl.LIZ();
    }

    @Override // X.InterfaceC497601wk
    public CoroutineContext getCoroutineContext() {
        return this.LLILLJJLI;
    }

    public C1678906hn(Context context, AttributeSet attributeSet) {
        C1631706aB c1631706aB = new C1631706aB();
        super(context, attributeSet, 0);
        this.LL = c1631706aB;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLILLJJLI = C2107308Nj.LIZ;
        this.LLILLL = C452501pT.LIZIZ(new AwS546S0100000_2(context, 1194));
        this.LLILZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1193));
        this.LLILZIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1190));
        this.LLILZLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1191));
        this.LLIZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1192));
    }
}
