package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zeS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904180zeS {
    public static final void LIZIZ(boolean z) {
        if (z) {
            C20737116Cr.LJFF();
            C20737116Cr.LJ(new String[]{"start_jit_compile_opt", "start_log_block", "start_boot_finish", "main_thread_priority", "bind_big_core", "start_do_frame"}, 0L, 6);
        } else {
            C20737116Cr.LJ(new String[]{"stop_jit_compile_opt", "stop_log_block", "stop_boot_finish", "reset_main_thread_priority", "reset_bind_big_core", "stop_do_frame"}, 0L, 6);
        }
    }

    public static final void LIZ(int i, boolean z) {
        if (i <= 0) {
            return;
        }
        if (z) {
            if (i == 2) {
                LIZIZ(true);
                return;
            } else {
                C20737116Cr.LJ(new String[]{"start_jit_compile_opt", "start_log_block", "start_boot_finish", "main_thread_priority", "bind_big_core", "start_do_frame"}, 10000L, 2);
                return;
            }
        }
        C20737116Cr.LJ(new String[]{"stop_jit_compile_opt", "stop_log_block", "stop_boot_finish", "reset_main_thread_priority", "reset_bind_big_core", "stop_do_frame"}, 0L, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZJ(String str, InterfaceC1086570eNj interfaceC1086570eNj) {
        RecyclerView recyclerView;
        int i;
        if (interfaceC1086570eNj == 0) {
            return;
        }
        boolean z = false;
        int i2 = -1;
        if (C1868010yi7.LIZ().enable) {
            if (a0.LJJIIZI(str, "explore", false)) {
                i = C1868010yi7.LIZ().frescoDyExplore;
            } else {
                i = C1868010yi7.LIZ().frescoDy;
            }
            if (i > 0) {
                interfaceC1086570eNj.LIZ(i);
            }
        }
        if (interfaceC1086570eNj instanceof RecyclerView) {
            recyclerView = (RecyclerView) interfaceC1086570eNj;
        } else {
            recyclerView = null;
        }
        if (C1868010yi7.LIZ().enable) {
            if (a0.LJJIIZI(str, "explore", false)) {
                i2 = C1868010yi7.LIZ().flingVerExplore;
            } else {
                i2 = C1868010yi7.LIZ().flingVer;
            }
        }
        if (C1868010yi7.LIZ().enable && (!a0.LJJIIZI(str, "explore", false) ? C1868010yi7.LIZ().usePagerSlot != 0 : C1868010yi7.LIZ().usePagerSlot == 2)) {
            z = true;
        }
        if (recyclerView != null && i2 > 0) {
            try {
                int maxFlingVelocity = recyclerView.getMaxFlingVelocity();
                Field fieldLIZ = C1959507lx.LIZ(RecyclerView.class, "mMaxFlingVelocity");
                if (fieldLIZ != null) {
                    fieldLIZ.setAccessible(true);
                    fieldLIZ.set(recyclerView, Integer.valueOf(Math.min(i2, maxFlingVelocity)));
                }
                if (z) {
                    recyclerView.setScrollingTouchSlop(1);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LIZIZ();
            }
        }
    }
}
