package X;

import X.InterfaceC340040DUs;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.166X, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C166X<A extends ReusedUISlotAssem<?>, T extends InterfaceC340040DUs> extends C166U<A, T> {
    public C166X(Function1<? super A, ? extends T> function1) {
        super(function1);
    }

    @Override // X.C166U
    public final boolean LIZIZ(Object obj) {
        return ((ReusedUIAssem) obj).LLJJIII;
    }

    @Override // X.C166U
    public final /* bridge */ /* synthetic */ String LIZJ(Object obj) {
        return "in ViewBinding.onBind call, current ReusedUISlotAssem's view is not ready. Please make sure viewbinding is accessed after onViewCreated";
    }
}
