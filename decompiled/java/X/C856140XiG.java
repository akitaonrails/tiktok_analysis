package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0XiG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856140XiG {
    public static final ConcurrentHashMap<String, C855100Xga> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, CountDownLatch> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZIZ(String str) {
        for (Map.Entry<String, C855100Xga> entry : LIZ.entrySet()) {
            if (u.LJJIIJZLJL(entry.getKey(), str, false)) {
                LIZ.remove(entry.getKey());
            }
        }
        for (Map.Entry<String, CountDownLatch> entry2 : LIZIZ.entrySet()) {
            if (u.LJJIIJZLJL(entry2.getKey(), str, false)) {
                LIZ.remove(entry2.getKey());
            }
        }
    }

    public static void LIZ(Context context, final C855100Xga c855100Xga) {
        if (c855100Xga.LIZIZ != 0) {
            ConcurrentHashMap<String, C855100Xga> concurrentHashMap = LIZ;
            if (!concurrentHashMap.containsKey(c855100Xga.LIZ) && !c855100Xga.LJ && !c855100Xga.LJFF) {
                concurrentHashMap.put(c855100Xga.LIZ, c855100Xga);
                if (!c855100Xga.LJFF && !c855100Xga.LJ) {
                    c855100Xga.LJFF = true;
                    new C18L3(new MutableContextWrapper(context)).LIZ(c855100Xga.LIZIZ, c855100Xga.LIZJ, new InterfaceC487670JAn() { // from class: X.0XiF
                        @Override // X.InterfaceC487670JAn
                        public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
                            C855100Xga c855100Xga2 = c855100Xga;
                            c855100Xga2.LIZLLL = view;
                            c855100Xga2.LJFF = false;
                            CountDownLatch countDownLatch = C856140XiG.LIZIZ.get(c855100Xga2.LIZ);
                            if (countDownLatch != null) {
                                countDownLatch.countDown();
                            }
                        }
                    });
                }
            }
        }
    }
}
