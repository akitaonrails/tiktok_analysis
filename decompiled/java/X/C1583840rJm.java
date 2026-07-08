package X;

import androidx.lifecycle.Lifecycle;
import java.util.List;

/* JADX INFO: renamed from: X.0rJm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583840rJm {
    public static void LIZ(InterfaceC1583830rJl interfaceC1583830rJl, Lifecycle.Event event) {
        List<InterfaceC1583850rJn> listIo1 = interfaceC1583830rJl.io1();
        if (listIo1 != null) {
            for (InterfaceC1583850rJn interfaceC1583850rJn : listIo1) {
                switch (C2153608cA.LIZ[event.ordinal()]) {
                    case 1:
                        interfaceC1583850rJn.onCreate();
                        break;
                    case 2:
                        interfaceC1583850rJn.onStart();
                        break;
                    case 3:
                        interfaceC1583850rJn.onResume();
                        break;
                    case 4:
                        interfaceC1583850rJn.onPause();
                        break;
                    case 5:
                        interfaceC1583850rJn.onStop();
                        break;
                    case 6:
                        interfaceC1583850rJn.onDestroy();
                        break;
                }
            }
        }
    }
}
