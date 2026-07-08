package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SvU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736940SvU {
    public static void LIZ(AssemViewModel assemViewModel, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function1 function1) {
        C0RTY c0rty;
        if (!assemViewModel._initialized) {
            assemViewModel.setLifecycleRef(new WeakReference<>(((LifecycleOwner) function0.invoke()).getLifecycle()));
            C724710Sbl c724710Sbl = null;
            if (function02 != null) {
                c0rty = (C0RTY) function02.invoke();
            } else {
                c0rty = null;
            }
            assemViewModel.hierarchyDataStore = c0rty;
            if (function03 != null) {
                c724710Sbl = (C724710Sbl) function03.invoke();
            }
            assemViewModel.hierarchyServiceStore = c724710Sbl;
            assemViewModel.injectHierarchyDataVScopeProducer(function04);
            assemViewModel.initialize((InterfaceC736830SvJ) function05.invoke(), function1);
        }
    }
}
