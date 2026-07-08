package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: renamed from: X.19AW, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19AW implements InterfaceC21495319Ah {
    public final InterfaceC20675415vM LIZ;
    public int LIZIZ;

    @Override // X.InterfaceC21495319Ah
    public final int LIZJ() {
        return this.LIZIZ;
    }

    public C19AW(final Class cls) {
        this.LIZ = new InterfaceC20675415vM() { // from class: X.19BY
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
        for (int size = list.size() - 1; size >= 0; size--) {
            C0WIY c0wiy = (C0WIY) ListProtector.get(list, size);
            if (this.LIZ.LIZ((Scene) c0wiy.LIZ, (Bundle) c0wiy.LIZIZ)) {
                this.LIZIZ = (list.size() - size) - 1;
                return true;
            }
        }
        return false;
    }

    public C19AW(C20674815vG c20674815vG) {
        this.LIZ = c20674815vG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC21495319Ah
    public final void LIZ(Scene scene, Bundle bundle) {
        if (scene instanceof AnonymousClass1995) {
            ((AnonymousClass1995) scene).LLLLIILLL(bundle);
        }
    }
}
