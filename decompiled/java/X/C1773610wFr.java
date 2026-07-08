package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.ECHybridAdapter;
import java.lang.ref.WeakReference;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773610wFr<T> extends FrameLayout implements InterfaceC1775450wIp<T> {
    public final InterfaceC1773310wFN LL;
    public T LLILLJJLI;
    public WeakReference<AbstractC1773460wFc<?>> LLILLL;

    @Override // X.InterfaceC1775450wIp
    public final InterfaceC1773310wFN LIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC1775450wIp
    public T getData() {
        return this.LLILLJJLI;
    }

    public final InterfaceC1773310wFN getMixMallController() {
        return this.LL;
    }

    @Override // X.InterfaceC1775450wIp
    public final boolean LIZIZ(Function1<? super Integer, Unit> function1) {
        AbstractC21673619ry<? extends RecyclerView.ViewHolder> bindingAdapter;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        ECHybridAdapter eCHybridAdapter;
        AbstractC1773460wFc<?> abstractC1773460wFc;
        WeakReference<AbstractC1773460wFc<?>> weakReference = this.LLILLL;
        C1773640wFu c1773640wFu = null;
        if (weakReference != null && (abstractC1773460wFc = weakReference.get()) != null) {
            bindingAdapter = abstractC1773460wFc.getBindingAdapter();
        } else {
            bindingAdapter = null;
        }
        if ((bindingAdapter instanceof ECHybridAdapter) && (eCHybridAdapter = (ECHybridAdapter) bindingAdapter) != null) {
            c1773640wFu = eCHybridAdapter.LLIZLLLIL;
        }
        C18Z6 bodyList = this.LL.LIZLLL().LJ.getBodyList();
        if (c1773640wFu != null && bodyList != null) {
            Set<Function1<Integer, Unit>> scrollListeners = c1773640wFu.getScrollListeners();
            if (scrollListeners != null && (boolValueOf = Boolean.valueOf(scrollListeners.add(function1))) != null) {
                boolValueOf.booleanValue();
                Set<Function1<Integer, Unit>> scrollListeners2 = bodyList.getScrollListeners();
                if (scrollListeners2 != null && (boolValueOf2 = Boolean.valueOf(scrollListeners2.add(function1))) != null) {
                    boolValueOf2.booleanValue();
                    return true;
                }
            }
            return false;
        }
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxCard setScrollListener error: rv1:");
        sbLIZ.append(c1773640wFu);
        sbLIZ.append(", rv2:");
        sbLIZ.append(bodyList);
        C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZIZ();
        return false;
    }

    public void setVHRef(AbstractC1773460wFc<?> abstractC1773460wFc) {
        if (abstractC1773460wFc != null) {
            this.LLILLL = new WeakReference<>(abstractC1773460wFc);
        }
    }

    public C1773610wFr(Context context, InterfaceC1773310wFN interfaceC1773310wFN) {
        super(context);
        this.LL = interfaceC1773310wFN;
    }
}
