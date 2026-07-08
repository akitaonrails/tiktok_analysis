package X;

import android.animation.Animator;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.18jg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21367418jg {
    public static final Map<String, InterfaceC21367518jh> LIZ = new LinkedHashMap();

    public static final void LIZ(String str, Animator animator, View view) {
        InterfaceC21367518jh interfaceC21367518jh = (InterfaceC21367518jh) ((LinkedHashMap) LIZ).get(str);
        if (interfaceC21367518jh != null) {
            if (!interfaceC21367518jh.LIZIZ()) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            if (interfaceC21367518jh.enable()) {
                interfaceC21367518jh.LIZ();
                animator.start();
            }
        }
    }
}
