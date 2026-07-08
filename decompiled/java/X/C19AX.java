package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: renamed from: X.19AX, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19AX implements InterfaceC21495319Ah {
    public final InterfaceC20675415vM LIZ;

    @Override // X.InterfaceC21495319Ah
    public final int LIZJ() {
        return 0;
    }

    public C19AX(final Class cls) {
        this.LIZ = new InterfaceC20675415vM() { // from class: X.19BZ
            @Override // X.InterfaceC20675415vM
            public final boolean LIZ(Scene scene, Bundle bundle) {
                if (scene.getClass() == cls) {
                    return true;
                }
                return false;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC21495319Ah
    public final boolean LIZIZ(List<C0WIY<Scene, Bundle>> list) {
        if (list.size() <= 0) {
            return false;
        }
        C0WIY c0wiy = (C0WIY) ListProtector.get(list, list.size() - 1);
        return this.LIZ.LIZ((Scene) c0wiy.LIZ, (Bundle) c0wiy.LIZIZ);
    }

    public C19AX(C20674715vF c20674715vF) {
        this.LIZ = c20674715vF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC21495319Ah
    public final void LIZ(Scene scene, Bundle bundle) {
        if (scene instanceof AnonymousClass1995) {
            ((AnonymousClass1995) scene).LLLLIILLL(bundle);
        }
    }
}
