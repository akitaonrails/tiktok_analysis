package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wpn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835330Wpn extends C09AY implements Function0<C835260Wpg> {
    public static final C835330Wpn LL;

    static {
        boolean zLJI = MethodIDManager.LJI(72060);
        LL = new C835330Wpn();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public C835330Wpn() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C835260Wpg invoke() {
        return new C835260Wpg();
    }
}
