package X;

import Y.ARunnableS103S0100000_3;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.internal.AwS88S1000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07zH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2042107zH {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        AwS88S1000000_3 awS88S1000000_3 = new AwS88S1000000_3(str, 22);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            awS88S1000000_3.invoke();
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS103S0100000_3((Object) awS88S1000000_3, 167));
        }
    }
}
