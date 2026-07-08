package X;

import android.content.ComponentName;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.12mx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19858912mx {
    public final Context LIZ;
    public ServiceConnectionC19859312n1 LIZJ;
    public C19859212n0 LJI;
    public final ComponentName LIZIZ = null;
    public final Set<String> LIZLLL = new LinkedHashSet();
    public final Map<String, C19858812mw> LJ = new LinkedHashMap();
    public final BPEAHandler LJFF = new BPEAHandler(Looper.getMainLooper());
    public String LJII = "";
    public final BinderC19858712mv LJIIIIZZ = new BinderC19858712mv(this);

    public C19858912mx(Context context) {
        this.LIZ = context;
    }

    public final void LIZ(InterfaceC19858412ms interfaceC19858412ms) {
        for (String str : this.LIZLLL) {
            this.LJ.put(str, new C19858812mw());
            interfaceC19858412ms.f0(str, this.LJII);
        }
        this.LIZLLL.clear();
    }
}
