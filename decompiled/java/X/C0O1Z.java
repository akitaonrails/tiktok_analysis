package X;

import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.CleanModeProtocol;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0O1Z, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O1Z {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ(ReusedUIAssem reusedUIAssem, List list) {
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility = (CommonCellAbility) C1558520qew.LIZ(C1558520qew.LJIIL(reusedUIAssem), CommonCellAbility.class, null);
        if (commonCellAbility != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C1554610qYd.LIZJ(interfaceC665370Q7zLIZIZ, CleanModeProtocol.class, C1697810uHb.LJIILJJIL(it2.next()));
            }
        }
    }
}
