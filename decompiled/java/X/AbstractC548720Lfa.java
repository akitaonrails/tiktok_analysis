package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0Lfa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC548720Lfa implements InterfaceC548750Lfd {
    public abstract List<InterfaceC548750Lfd> provideDataSources();

    @Override // X.InterfaceC548750Lfd
    public final <T> T getValue(InterfaceC548900Lfs<T> interfaceC548900Lfs) {
        List<InterfaceC548750Lfd> listProvideDataSources = provideDataSources();
        for (int size = listProvideDataSources.size() - 1; -1 < size; size--) {
            T t = (T) ((InterfaceC548750Lfd) ListProtector.get(listProvideDataSources, size)).getValue(interfaceC548900Lfs);
            if (t != null) {
                return t;
            }
        }
        return null;
    }
}
