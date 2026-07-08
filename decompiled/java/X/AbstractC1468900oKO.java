package X;

import com.ss.ttm.player.SubInfo;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0oKO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1468900oKO<T> extends SubInfo {
    public WeakReference<T> LIZIZ = new WeakReference<>(null);
    public final WeakReference<InterfaceC1467240oHi> LIZJ;
    public int LIZLLL;
    public long LJ;

    public AbstractC1468900oKO(InterfaceC1467240oHi interfaceC1467240oHi, C1466990oHJ c1466990oHJ) {
        this.LIZJ = new WeakReference<>(interfaceC1467240oHi);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(c1466990oHJ);
        TTVideoEngineLog.d("BaseSubInfoAdapter", C2188811AlT.LIZIZ(sbLIZ));
    }
}
