package X;

import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0zeT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904190zeT implements C0VWC {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1326));

    @Override // X.C0VWC
    public final void LJIIJ(String str) {
        if (((Boolean) this.LIZ.getValue()).booleanValue()) {
            C1904180zeS.LIZIZ(true);
        } else {
            C20737116Cr.LJ(new String[]{"start_jit_compile_opt", "start_log_block", "start_boot_finish", "main_thread_priority", "bind_big_core", "start_do_frame"}, 0L, 6);
        }
    }

    @Override // X.C0VWC
    public final void onStop(String str) {
        C1904180zeS.LIZIZ(false);
    }
}
