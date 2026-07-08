package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/* JADX INFO: renamed from: X.086W, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C086W {
    public static final Object LJFF = new Object();
    public static volatile C086W LJI;
    public final ThreadLocal<Handler> LIZ = new ThreadLocal<>();
    public final ThreadLocal<List<C086Y>> LIZIZ = new ThreadLocal<>();
    public final ThreadLocal<C086X> LIZJ = new ThreadLocal<>();
    public final ThreadLocal<Queue<Message>> LIZLLL = new ThreadLocal<>();
    public BPEAHandler LJ;

    public final void LIZ(C086Y c086y) {
        List<C086Y> arrayList = this.LIZIZ.get();
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.LIZIZ.set(arrayList);
        }
        arrayList.add(c086y);
    }

    public final void LIZIZ(C086Y c086y) {
        List<C086Y> list;
        if (c086y != null && (list = this.LIZIZ.get()) != null) {
            list.remove(c086y);
        }
    }
}
