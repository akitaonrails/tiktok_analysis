package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0SaM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723840SaM {
    public static final void LIZ(LifecycleOwner lifecycleOwner, AbstractC724210Sax abstractC724210Sax, AssemSupervisor assemSupervisor, Assembler assembler) {
        if (abstractC724210Sax != null) {
            abstractC724210Sax.LIZ = assemSupervisor;
        }
        if (lifecycleOwner != null) {
            C723660Sa4 c723660Sa4 = assembler.LL;
            if (abstractC724210Sax == null) {
                ((ConcurrentHashMap) c723660Sa4.LIZLLL).remove(lifecycleOwner);
            } else {
                ((ConcurrentHashMap) c723660Sa4.LIZLLL).put(lifecycleOwner, abstractC724210Sax);
            }
        }
    }
}
