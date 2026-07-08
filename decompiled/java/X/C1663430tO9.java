package X;

import com.ss.android.vesdk.VERecorder;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0tO9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1663430tO9 implements InterfaceC1652830t73 {
    public final VERecorder LL;
    public final Function0<Boolean> LLILLJJLI;
    public final CopyOnWriteArrayList<InterfaceC1652830t73> LLILLL = new CopyOnWriteArrayList<>();

    public C1663430tO9(VERecorder vERecorder, Function0<Boolean> function0) {
        this.LL = vERecorder;
        this.LLILLJJLI = function0;
    }

    @Override // X.InterfaceC1464200oCo
    public final void onCallback(int i, int i2, float f, String str) {
        if (this.LLILLJJLI.invoke().booleanValue()) {
            return;
        }
        Iterator<InterfaceC1652830t73> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().onCallback(i, i2, f, str);
        }
    }
}
