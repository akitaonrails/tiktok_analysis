package X;

import androidx.lifecycle.LifecycleOwner;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0usc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720760usc {
    public final LifecycleOwner LIZ;
    public final InterfaceC1720050urT LIZIZ;
    public final Function0<Map<String, Object>> LIZJ;
    public final boolean LIZLLL;
    public final String LJ;

    public C1720760usc() {
        throw null;
    }

    public C1720760usc(LifecycleOwner lifecycleOwner, InterfaceC1720050urT interfaceC1720050urT, Function0 function0, boolean z, String str, int i) {
        function0 = (i & 4) != 0 ? null : function0;
        z = (i & 8) != 0 ? true : z;
        str = (i & 32) != 0 ? null : str;
        this.LIZ = lifecycleOwner;
        this.LIZIZ = interfaceC1720050urT;
        this.LIZJ = function0;
        this.LIZLLL = z;
        this.LJ = str;
    }
}
