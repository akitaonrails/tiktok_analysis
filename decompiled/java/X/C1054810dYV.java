package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0dYV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1054810dYV {
    public static final C1054810dYV LIZ = new C1054810dYV();
    public static InterfaceC1008670cM5 LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(C0SSX c0ssx, Activity activity, InterfaceC1034470d1h interfaceC1034470d1h, InterfaceC1008670cM5 interfaceC1008670cM5, InterfaceC1253300iie interfaceC1253300iie) {
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        C19EH c19ehLJIIJ;
        try {
            Fragment fragment = (Fragment) c0ssx;
            if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
                c19ehLJIIJ.LJIIZILJ(fragment);
                c19ehLJIIJ.LJIIJ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "ShowProfilePageInTopUtils");
        }
        if (interfaceC1008670cM5 != null) {
            interfaceC1008670cM5.enable(false);
        }
        if (interfaceC1034470d1h != null) {
            interfaceC1034470d1h.pd();
        }
        if (c0ssx != 0) {
            c0ssx.mu(interfaceC1253300iie);
        }
    }
}
