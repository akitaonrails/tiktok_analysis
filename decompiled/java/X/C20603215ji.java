package X;

import android.app.Activity;
import com.bytedance.ies.powerlist.PowerAdapter;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15ji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20603215ji extends C09AY implements Function0<C19EG> {
    public final /* synthetic */ PowerAdapter LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20603215ji(PowerAdapter powerAdapter) {
        super(0);
        this.LL = powerAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.19EG] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final C19EG invoke() {
        ?? next;
        Iterator it2 = C09R4.LJ(new C741200T5q(), this.LL.LL.getContext()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = 0;
                break;
            }
            next = it2.next();
            if (next instanceof Activity) {
                break;
            }
        }
        if (next instanceof C19EG) {
            return next;
        }
        return null;
    }
}
