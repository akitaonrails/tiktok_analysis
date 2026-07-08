package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.ui.framework.DialogLeaf;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0ek4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1100420ek4 extends ConstraintLayout {
    public Fragment LL;
    public final ConcurrentHashMap<Integer, AbstractC1100450ek7> LLILLJJLI;

    public final LifecycleCoroutineScope getLifecycleScope() {
        Fragment fragment = this.LL;
        if (!(fragment instanceof LifecycleOwner) || fragment == null) {
            return null;
        }
        return LifecycleOwnerKt.getLifecycleScope(fragment);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator<Map.Entry<Integer, AbstractC1100450ek7>> it2 = this.LLILLJJLI.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().LJIL();
        }
    }

    public final Fragment getFragment() {
        return this.LL;
    }

    public final boolean h0(int i) {
        AbstractC1100450ek7 abstractC1100450ek7 = this.LLILLJJLI.get(Integer.valueOf(i));
        if ((abstractC1100450ek7 instanceof DialogLeaf) && ((DialogLeaf) abstractC1100450ek7).LLJI) {
            i0(i);
            return false;
        }
        return this.LLILLJJLI.containsKey(Integer.valueOf(i));
    }

    public final void i0(int i) {
        AbstractC1100450ek7 abstractC1100450ek7Remove;
        if (getContext() != null && (abstractC1100450ek7Remove = this.LLILLJJLI.remove(Integer.valueOf(i))) != null) {
            abstractC1100450ek7Remove.LJJIZ();
        }
    }

    public final void setFragment(Fragment fragment) {
        this.LL = fragment;
    }

    public C1100420ek4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void e0(AbstractC1100450ek7 abstractC1100450ek7, ViewGroup viewGroup) {
        Context context;
        if (!this.LLILLJJLI.containsKey(Integer.valueOf(abstractC1100450ek7.LJIIJJI())) && (context = getContext()) != null) {
            abstractC1100450ek7.LLILZIL = this;
            LifecycleCoroutineScope lifecycleScope = getLifecycleScope();
            if (lifecycleScope != null) {
                C23250099c.LIZLLL(lifecycleScope, null, null, new C1100410ek3(abstractC1100450ek7, context, this, viewGroup, null), 3);
            }
        }
    }

    public C1100420ek4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = new ConcurrentHashMap<>();
    }
}
