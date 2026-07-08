package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [VM] */
/* JADX INFO: renamed from: X.0SxB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737990SxB<VM> extends C09AY implements Function1<VM, VM> {
    public final /* synthetic */ AbstractC724260Sb2 LL;
    public final /* synthetic */ C259800zU<ReusedAssem<? extends C03H5>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C737990SxB(C724270Sb3 c724270Sb3, C259800zU c259800zU) {
        super(1);
        this.LL = c724270Sb3;
        this.LLILLJJLI = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AssemViewModelWithItem assemViewModelWithItem;
        InterfaceC738070SxJ interfaceC738070SxJ;
        LifecycleOwner lifecycleOwner = (AssemViewModel) obj;
        C738040SxG c738040SxG = null;
        if ((lifecycleOwner instanceof InterfaceC738070SxJ) && (interfaceC738070SxJ = (InterfaceC738070SxJ) lifecycleOwner) != null) {
            c738040SxG = new C738040SxG(interfaceC738070SxJ);
        }
        if ((lifecycleOwner instanceof AssemViewModelWithItem) && (assemViewModelWithItem = (AssemViewModelWithItem) lifecycleOwner) != null) {
            assemViewModelWithItem.proxy = this.LL;
        }
        if (c738040SxG != null) {
            this.LLILLJJLI.element.LLIZLLLIL.LIZ(lifecycleOwner, c738040SxG, this.LL);
        }
        return lifecycleOwner;
    }
}
