package X;

import android.animation.Animator;
import java.util.HashMap;

/* JADX INFO: renamed from: X.18eJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21334118eJ {
    public static final /* synthetic */ int LIZLLL = 0;
    public final AbstractC21333318eB<?> LIZ;
    public final int LIZIZ;
    public final HashMap<String, Animator> LIZJ = new HashMap<>();

    public C21334118eJ(AbstractC21333318eB<?> abstractC21333318eB) {
        this.LIZ = abstractC21333318eB;
        this.LIZIZ = abstractC21333318eB.getView().getLayerType();
    }
}
