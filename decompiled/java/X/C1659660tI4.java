package X;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.jedi.arch.JediViewModel;

/* JADX INFO: renamed from: X.0tI4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659660tI4 {
    public final ViewModelProvider LIZ;

    public final <T extends JediViewModel> T LIZ(Class<T> cls) {
        if (cls.getCanonicalName() != null) {
            return (T) this.LIZ.get(cls.getName(), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C1659660tI4(ViewModelStore viewModelStore, C1143250fr9 c1143250fr9) {
        this.LIZ = new ViewModelProvider(viewModelStore, c1143250fr9);
    }
}
