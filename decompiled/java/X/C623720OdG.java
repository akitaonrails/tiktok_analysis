package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0OdG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623720OdG {
    public static final ExecutorService LIZ = C786410Ut5.h4();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static final HashSet<String> LIZJ = new HashSet<>();
    public static final ConcurrentHashMap<String, List<C623710OdF>> LIZLLL = new ConcurrentHashMap<>();

    public static final void LIZ(InterfaceC1334290kpH interfaceC1334290kpH, UrlModel urlModel, String str, EnumC1334360kpO enumC1334360kpO) {
        C623670OdB c623670OdB = new C623670OdB();
        c623670OdB.LIZ = urlModel;
        c623670OdB.LIZIZ = interfaceC1334290kpH;
        c623670OdB.LIZJ = str;
        c623670OdB.LIZLLL = enumC1334360kpO;
        c623670OdB.LIZ();
    }
}
