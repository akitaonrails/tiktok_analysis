package X;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uNU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1701460uNU implements InterfaceC21264518Jn, Handler.Callback {
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper(), this);
    public final ConcurrentHashMap<String, ArrayList<Function0<Unit>>> LLILLJJLI = new ConcurrentHashMap<>();
    public final ArrayList<String> LLILLL = new ArrayList<>();
}
