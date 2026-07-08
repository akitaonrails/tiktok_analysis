package X;

import X.InterfaceC340040DUs;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.166V, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C166V<A extends UISlotAssem, T extends InterfaceC340040DUs> extends C166U<A, T> {
    public C166V(Function1<? super A, ? extends T> function1) {
        super(function1);
    }

    @Override // X.C166U
    public final boolean LIZIZ(Object obj) {
        UIAssem uIAssem = (UIAssem) obj;
        if (!uIAssem.LLILZ && !uIAssem.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.INITIALIZED)) {
            return false;
        }
        return true;
    }

    @Override // X.C166U
    public final /* bridge */ /* synthetic */ String LIZJ(Object obj) {
        return "in ViewBinding.onBind call, current UISlotAssem's view is not ready. Please make sure viewbinding is accessed after onViewCreated";
    }
}
