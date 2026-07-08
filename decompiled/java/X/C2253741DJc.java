package X;

import com.ss.android.vesdk.VERecorder;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DJc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2253741DJc implements InterfaceC1437720nW6 {
    public final VERecorder LL;
    public final boolean LLILLJJLI;
    public final Function0<Boolean> LLILLL;
    public final CopyOnWriteArrayList<InterfaceC1437720nW6> LLILZ = new CopyOnWriteArrayList<>();

    public C2253741DJc(VERecorder vERecorder, boolean z, Function0<Boolean> function0) {
        this.LL = vERecorder;
        this.LLILLJJLI = z;
        this.LLILLL = function0;
    }

    @Override // X.InterfaceC1464200oCo
    public final void onCallback(int i, int i2, float f, String str) {
        if (this.LLILLL.invoke().booleanValue()) {
            return;
        }
        Iterator<InterfaceC1437720nW6> it2 = this.LLILZ.iterator();
        while (it2.hasNext()) {
            it2.next().onCallback(i, i2, f, str);
        }
    }
}
