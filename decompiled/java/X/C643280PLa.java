package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.tako.arch.protocol.TakoCardContainerSharedVM;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0PLa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643280PLa {
    public static TakoCardContainerSharedVM LIZ(Lifecycle lifecycle, EnumC2012507uV enumC2012507uV) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(lifecycle.hashCode());
        sbLIZ.append('-');
        sbLIZ.append(enumC2012507uV.name());
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<String, TakoCardContainerSharedVM> value = TakoCardContainerSharedVM.LLILZLL.getValue();
        TakoCardContainerSharedVM takoCardContainerSharedVM = value.get(strLIZIZ);
        if (takoCardContainerSharedVM == null) {
            takoCardContainerSharedVM = (TakoCardContainerSharedVM) new SharedViewModelProvider(new ViewModelProvider.NewInstanceFactory()).get(lifecycle, enumC2012507uV.name(), TakoCardContainerSharedVM.class);
            takoCardContainerSharedVM.addCloseable(new AutoCloseable() { // from class: X.0PLb
                @Override // java.lang.AutoCloseable
                public final void close() {
                    TakoCardContainerSharedVM.LLILZLL.getValue().remove(strLIZIZ);
                }
            });
            TakoCardContainerSharedVM takoCardContainerSharedVMPutIfAbsent = value.putIfAbsent(strLIZIZ, takoCardContainerSharedVM);
            if (takoCardContainerSharedVMPutIfAbsent != null) {
                takoCardContainerSharedVM = takoCardContainerSharedVMPutIfAbsent;
            }
        }
        return takoCardContainerSharedVM;
    }
}
