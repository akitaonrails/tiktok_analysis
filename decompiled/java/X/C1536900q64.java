package X;

import android.util.LruCache;
import com.bytedance.forest.Forest;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0q64, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536900q64 {
    public static final /* synthetic */ int LIZ = 0;

    public static C099G LIZ(C1537480q70 c1537480q70, Forest forest, Boolean bool) {
        LruCache<String, C1536930q67> lruCache = C1536910q65.LIZ;
        String strLIZ = C01CL.LIZ(c1537480q70.LJIJI());
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) C1536910q65.LIZLLL;
        if (!copyOnWriteArrayList.contains(strLIZ)) {
            copyOnWriteArrayList.add(strLIZ);
        }
        InterfaceC497601wk interfaceC497601wk = c1537480q70.coroutineScope;
        if (interfaceC497601wk == null) {
            interfaceC497601wk = C817503Hh.LL;
        }
        C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1536890q63(c1537480q70, forest, bool, null), 3);
        String strLIZJ = C1536910q65.LIZJ(c1537480q70.LJIJI());
        if (C1533950q1J.LJ(strLIZJ)) {
            C1536940q68 c1536940q68 = (C1536940q68) C1536910q65.LIZLLL().get(strLIZJ);
            if (c1536940q68 != null) {
                c1536940q68.LIZLLL.put(C01CL.LIZ(c1537480q70.LJIJI()), c099gLIZIZ);
            }
            return c099gLIZIZ;
        }
        C1536910q65.LIZJ.put(C01CL.LIZ(c1537480q70.LJIJI()), c099gLIZIZ);
        return c099gLIZIZ;
    }

    public static C099G LIZJ(C1537480q70 c1537480q70, Forest forest, boolean z) {
        InterfaceC497601wk interfaceC497601wk = c1537480q70.coroutineScope;
        if (interfaceC497601wk == null) {
            interfaceC497601wk = C817503Hh.LL;
        }
        C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1536690q5j(c1537480q70, forest, z, null), 3);
        if (!Intrinsics.LJFF(C1535630q41.LIZIZ("need_disable_save_load_template_deferred"), true)) {
            LruCache<String, C1536930q67> lruCache = C1536910q65.LIZ;
            C1536910q65.LIZIZ.put(C01CL.LIZ(c1537480q70.LJIJI()), c099gLIZIZ);
        }
        return c099gLIZIZ;
    }
}
