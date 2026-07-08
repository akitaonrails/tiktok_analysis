package X;

import androidx.lifecycle.ViewModelStore;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.19Ai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21495419Ai implements InterfaceC214938199s {
    public final ViewModelStore LIZ;
    public final Class<? extends Scene> LIZIZ;

    public C21495419Ai() {
        throw null;
    }

    @Override // X.InterfaceC214938199s
    public final void onUnRegister() {
        this.LIZ.clear();
    }

    public C21495419Ai(ViewModelStore viewModelStore, Class cls) {
        this.LIZ = viewModelStore;
        this.LIZIZ = cls;
    }
}
