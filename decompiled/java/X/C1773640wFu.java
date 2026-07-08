package X;

import Y.AsS52S0100000_26;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1773640wFu extends RecyclerView {
    public static final /* synthetic */ int LLILZIL = 0;
    public InterfaceC1773310wFN LL;
    public final Set<Function1<Integer, Unit>> LLILLJJLI;
    public int LLILLL;
    public View LLILZ;

    public void LIZJ() {
    }

    public final InterfaceC1773310wFN getController() {
        return this.LL;
    }

    public final Set<Function1<Integer, Unit>> getScrollListeners() {
        return this.LLILLJJLI;
    }

    public final View getStickyView() {
        return this.LLILZ;
    }

    public final int getStickyViewPosition() {
        return this.LLILLL;
    }

    public final void setController(InterfaceC1773310wFN interfaceC1773310wFN) {
        this.LL = interfaceC1773310wFN;
        LIZJ();
    }

    public final void setStickyView(View view) {
        if (this.LLILZ == null) {
            this.LLILZ = view;
        }
    }

    public final void setStickyViewPosition(int i) {
        this.LLILLL = i;
    }

    public C1773640wFu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1773640wFu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnScrollListener(new AsS52S0100000_26(this, 8));
        this.LLILLJJLI = new LinkedHashSet();
        this.LLILLL = Integer.MAX_VALUE;
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
