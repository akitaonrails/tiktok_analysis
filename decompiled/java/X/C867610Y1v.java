package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0Y1v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867610Y1v {
    public static void LIZ(C0YEM c0yem, C0Y8T c0y8t, C869590Y9l c869590Y9l, boolean z) {
        String string = Long.toString(c0yem.getUid());
        boolean z2 = true;
        if (!z) {
            try {
                if (c0y8t.getCoreInfo() != null && c0y8t.getCoreInfo().getExt() != null) {
                    Map<String, String> ext = c0y8t.getCoreInfo().getExt();
                    if (!ext.containsKey("stranger") || !string.equals(ext.get("stranger"))) {
                        z2 = false;
                    }
                    c0y8t.setStranger(z2);
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c0yem.LIZLLL().LJIIIIZZ("StrangerUtil ", "updateStrangerFlag", e);
                c0yem.LJIIZILJ().LJFF().getEventTracker().LJ(e);
                return;
            }
        }
        if (c869590Y9l != null && c869590Y9l.getExt() != null) {
            Map<String, String> ext2 = c869590Y9l.getExt();
            if (ext2 == null || !string.equals(ext2.get("stranger"))) {
                z2 = false;
            }
            c0y8t.setStranger(z2);
            return;
        }
        c0y8t.setStranger(false);
    }
}
