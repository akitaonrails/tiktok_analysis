package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Swp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737770Swp {
    public static final AssemViewModel LIZ(Function0 function0, C452070Ho5 c452070Ho5, C1622206Wu c1622206Wu, C338490DOt c338490DOt, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function1 function1, C19719912Dl c19719912Dl) {
        AssemViewModel assemViewModelLIZJ;
        synchronized (c19719912Dl) {
            try {
                assemViewModelLIZJ = LIZJ(function02, c338490DOt, function0, c1622206Wu, function03, function04, function05, c452070Ho5, function1, c19719912Dl);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return assemViewModelLIZJ;
    }

    public static final AssemViewModel LIZJ(Function0 function0, C338490DOt c338490DOt, Function0 function02, C1622206Wu c1622206Wu, Function0 function03, Function0 function04, Function0 function05, C452070Ho5 c452070Ho5, Function1 function1, C19719912Dl c19719912Dl) {
        C0RTY c0rty = null;
        AssemViewModel assemViewModel = (AssemViewModel) new ViewModelProvider((ViewModelStore) c338490DOt.invoke(), (ViewModelProvider.Factory) function0.invoke(), C903300Zc8.LIZJ).get((String) function02.invoke(), C09R7.LIZ(c19719912Dl));
        assemViewModel.setLifecycleRef(new WeakReference<>(((LifecycleOwner) c1622206Wu.invoke()).getLifecycle()));
        C724710Sbl c724710Sbl = null;
        if (function03 != null) {
            c0rty = (C0RTY) function03.invoke();
        }
        assemViewModel.hierarchyDataStore = c0rty;
        if (function04 != null) {
            c724710Sbl = (C724710Sbl) function04.invoke();
        }
        assemViewModel.hierarchyServiceStore = c724710Sbl;
        assemViewModel.injectHierarchyDataVScopeProducer(function05);
        c452070Ho5.getClass();
        assemViewModel.initialize(new C736850SvL(), function1);
        return assemViewModel;
    }
}
