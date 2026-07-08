package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0H44, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H44 extends RecyclerView.ViewHolder {
    public final TuxTextView LL;
    public final Function2<String, Integer, Unit> LLILLJJLI;
    public int LLILLL;
    public String LLILZ;
    public final SearchRefreshPredictMobCanShowVM LLILZIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C0H44(TuxTextView tuxTextView, Fragment fragment, Function2<? super String, ? super Integer, Unit> function2) {
        super(tuxTextView);
        this.LL = tuxTextView;
        this.LLILLJJLI = function2;
        this.LLILZ = "";
        this.LLILZIL = C0P72.LIZ(fragment);
        InterfaceC435500H5w.LIZ.getClass();
        C435490H5v.LIZ();
        tuxTextView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0H43
            public boolean LL;

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                C0H44 c0h44 = this.LLILLJJLI;
                if (c0h44.LLILZIL != null) {
                    if (!this.LL) {
                        this.LL = true;
                        C2211631BhB.LJ(c0h44.LL, new AwS585S0100000_6(c0h44, 354));
                        return;
                    }
                    return;
                }
                Function2<String, Integer, Unit> function22 = c0h44.LLILLJJLI;
                if (function22 == null) {
                    return;
                }
                function22.invoke(c0h44.LLILZ, Integer.valueOf(c0h44.LLILLL));
            }
        });
    }
}
