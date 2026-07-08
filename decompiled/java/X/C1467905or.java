package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.CommerceAgentCardContainerSharedVM;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.05or, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1467905or {
    public static CommerceAgentCardContainerSharedVM LIZ(Lifecycle lifecycle, EnumC1467505on enumC1467505on) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(lifecycle.hashCode());
        sbLIZ.append('-');
        sbLIZ.append(enumC1467505on.name());
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<String, CommerceAgentCardContainerSharedVM> value = CommerceAgentCardContainerSharedVM.LLILZ.getValue();
        CommerceAgentCardContainerSharedVM commerceAgentCardContainerSharedVM = value.get(strLIZIZ);
        if (commerceAgentCardContainerSharedVM == null) {
            commerceAgentCardContainerSharedVM = (CommerceAgentCardContainerSharedVM) new SharedViewModelProvider(new ViewModelProvider.NewInstanceFactory()).get(lifecycle, enumC1467505on.name(), CommerceAgentCardContainerSharedVM.class);
            commerceAgentCardContainerSharedVM.addCloseable(new AutoCloseable() { // from class: X.05oq
                @Override // java.lang.AutoCloseable
                public final void close() {
                    CommerceAgentCardContainerSharedVM.LLILZ.getValue().remove(strLIZIZ);
                }
            });
            CommerceAgentCardContainerSharedVM commerceAgentCardContainerSharedVMPutIfAbsent = value.putIfAbsent(strLIZIZ, commerceAgentCardContainerSharedVM);
            if (commerceAgentCardContainerSharedVMPutIfAbsent != null) {
                commerceAgentCardContainerSharedVM = commerceAgentCardContainerSharedVMPutIfAbsent;
            }
        }
        return commerceAgentCardContainerSharedVM;
    }
}
