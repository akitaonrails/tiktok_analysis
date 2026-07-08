package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatroom.input.container.BaseChatInputAssem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hCz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195230hCz {
    public static final List LIZ(BaseChatInputAssem baseChatInputAssem) {
        C19EG c19egLIZ;
        LifecycleOwner lifecycleOwner;
        Map<C187300nn, InterfaceC111300bX> map;
        ArrayList arrayList = new ArrayList();
        try {
            c19egLIZ = C724240Sb0.LIZ(baseChatInputAssem);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c19egLIZ = null;
        }
        if (c19egLIZ == null) {
            return arrayList;
        }
        Assembler assemblerLIZ = C0RPA.LIZ(c19egLIZ);
        for (InterfaceC665370Q7z vAssemScope = baseChatInputAssem.getVAssemScope(); !Intrinsics.LJFF(vAssemScope, GScope.LL); vAssemScope = vAssemScope.getTree().LJIIIIZZ()) {
            Object host = vAssemScope.getHost();
            if (host instanceof LifecycleOwner) {
                lifecycleOwner = (LifecycleOwner) host;
            } else {
                lifecycleOwner = null;
            }
            if (lifecycleOwner != null) {
                C0RTY c0rtyZQ2 = assemblerLIZ.zQ2(lifecycleOwner);
                if (c0rtyZQ2 != null) {
                    map = c0rtyZQ2.LIZIZ;
                } else {
                    map = null;
                }
                arrayList.add(new C443120HZe(lifecycleOwner, c0rtyZQ2, map));
            }
        }
        return arrayList;
    }
}
