package X;

import android.view.ViewGroup;
import android.widget.OverScroller;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.16Bd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20733116Bd {
    public static final C21586019dq LIZ(ViewGroup viewGroup, InterfaceC20733816Bk interfaceC20733816Bk, AbstractC21586119dr abstractC21586119dr, Function0<? extends OverScroller> function0) {
        C21586019dq c21586019dqLJIIIZ = C21586019dq.LJIIIZ(viewGroup, abstractC21586119dr);
        try {
            Field declaredField = C21586019dq.class.getDeclaredField("LJIIZILJ");
            declaredField.setAccessible(true);
            OverScroller overScrollerInvoke = function0.invoke();
            if (overScrollerInvoke == null) {
                overScrollerInvoke = new OverScroller(viewGroup.getContext(), interfaceC20733816Bk.create());
            }
            declaredField.set(c21586019dqLJIIIZ, overScrollerInvoke);
            return c21586019dqLJIIIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return c21586019dqLJIIIZ;
        }
    }
}
