package X;

import com.bytedance.scene.navigation.NavigationScene;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.19BR, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19BR implements InterfaceC21497419Bc {
    public final /* synthetic */ NavigationScene LIZ;

    @Override // X.InterfaceC21497419Bc
    public final void LIZLLL() {
        Iterator it2 = new ArrayList(this.LIZ.LLJJJIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC21497419Bc) it2.next()).LIZLLL();
        }
    }

    @Override // X.InterfaceC21497419Bc
    public final void onStart() {
        Iterator it2 = new ArrayList(this.LIZ.LLJJJIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC21497419Bc) it2.next()).onStart();
        }
    }

    public C19BR(NavigationScene navigationScene) {
        this.LIZ = navigationScene;
    }

    @Override // X.InterfaceC21497419Bc
    public final void onProgress(float f) {
        Iterator it2 = new ArrayList(this.LIZ.LLJJJIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC21497419Bc) it2.next()).onProgress(f);
        }
    }
}
