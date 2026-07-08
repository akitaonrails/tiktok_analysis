package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0UoB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C783370UoB {
    public final C776980Uds LIZ = new C776980Uds();

    public static Drawable LIZ(int i, Context context) {
        Drawable drawableLIZIZ;
        if (context == null || i == -1) {
            return null;
        }
        InterfaceC783390UoD interfaceC783390UoDLJI = C011Z.LIZ.LJI();
        if (interfaceC783390UoDLJI == null || (drawableLIZIZ = interfaceC783390UoDLJI.LIZIZ(i, context)) == null) {
            return C14MI.LIZ(context, i);
        }
        return drawableLIZIZ;
    }

    public final boolean LIZIZ(int i, boolean z) {
        InterfaceC783410UoF interfaceC783410UoF = (InterfaceC783410UoF) ((ConcurrentHashMap) this.LIZ.LIZ).get(Integer.valueOf(i));
        if (interfaceC783410UoF != null) {
            C011Z.LIZ.LIZJ();
            return interfaceC783410UoF.LIZ();
        }
        return z;
    }
}
