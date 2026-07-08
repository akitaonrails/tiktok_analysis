package X;

import Y.ARunnableS129S0100000_29;
import android.os.Looper;
import com.ss.android.legoimpl.BusinessToolsTask;
import com.ss.android.ugc.aweme.legoImp.task.InitAVModule;
import com.ss.android.ugc.aweme.legoImp.task.InitModules;
import com.ss.android.ugc.aweme.legoImp.task.InitPushTask;
import com.ss.android.ugc.aweme.legoImp.task.PowerPageTask;
import com.ss.android.ugc.aweme.legoImp.task.TasksHolder;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.InitLegoInflate;
import com.ss.android.ugc.aweme.legoImp.task.uitask.UIInitTask;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BX2, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BX2 implements Runnable {
    public final int LL;

    public final void LIZ() {
        int i = this.LL;
        if (i != 2) {
            if (i == 3) {
                LIZIZ();
                return;
            }
            return;
        }
        if (((Boolean) C1E21.LJ.getValue()).booleanValue()) {
            return;
        }
        if (!C104100aN.LIZ().isNewUser()) {
            LIZIZ();
        }
        ((Number) C0CD2.LJIILL.getValue()).intValue();
        C1150504el.LIZ().LIZLLL("method_ensure_duration", false);
        C1150504el.LIZ().LIZLLL("method_business_tools_ensure_duration", false);
        C799900VZk c799900VZk = C799900VZk.LIZ;
        BusinessToolsTask businessToolsTaskLIZ = BusinessToolsTask.LIZ();
        c799900VZk.getClass();
        C799900VZk.LIZJ(businessToolsTaskLIZ);
        C1150504el.LIZ().LJI("method_business_tools_ensure_duration", false);
        C1150504el.LIZ().LIZLLL("method_absdk_ensure_duration", false);
        C799900VZk.LIZJ(TasksHolder.LIZ());
        C1150504el.LIZ().LJI("method_absdk_ensure_duration", false);
        C1150504el.LIZ().LIZLLL("method_init_module_ensure_duration", false);
        if (InitModules.LL == null) {
            InitModules.LL = new InitModules();
        }
        C799900VZk.LIZJ(InitModules.LL);
        C1150504el.LIZ().LJI("method_init_module_ensure_duration", false);
        C1150504el.LIZ().LIZLLL("method_init_avmodule_ensure_duration", false);
        InitAVModule initAVModuleLJIIIIZZ = InitAVModule.LJIIIIZZ();
        C799900VZk.LIZJ(initAVModuleLJIIIIZZ);
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            initAVModuleLJIIIIZZ.LJIIIZ();
        } else {
            C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS129S0100000_29(initAVModuleLJIIIIZZ, 215));
        }
        C1150504el.LIZ().LJI("method_init_avmodule_ensure_duration", false);
        if (InitPushTask.LJFF()) {
            C1150504el.LIZ().LIZLLL("method_init_push_async_ensure_duration", false);
            C799900VZk.LIZJ(InitPushTask.LIZ());
            C1150504el.LIZ().LJI("method_init_push_async_ensure_duration", false);
        }
        C1150504el.LIZ().LIZLLL("method_power_page_ensure_duration", false);
        C799900VZk.LIZJ(PowerPageTask.LL);
        C1150504el.LIZ().LJI("method_power_page_ensure_duration", false);
        C1150504el.LIZ().LIZLLL("method_init_foundation_ensure_duration", false);
        C799900VZk.LIZJ(TasksHolder.LIZIZ());
        C1150504el.LIZ().LJI("method_init_foundation_ensure_duration", false);
        C1150504el.LIZ().LIZLLL("method_init_ui_ensure_duration", false);
        if (!((Boolean) C1866440yfa.LIZLLL.getValue()).booleanValue()) {
            C799900VZk.LIZJ(UIInitTask.LL);
        }
        C1150504el.LIZ().LJI("method_init_ui_ensure_duration", false);
        if (C07OX.LIZIZ()) {
            C1150504el.LIZ().LIZLLL("method_fix_inflate_crash_ensure_duration", false);
            C792860V8i c792860V8i = InitLegoInflate.LL;
            C844470XAv.LIZ.getClass();
            c792860V8i.LIZ(C844470XAv.LIZ());
            C1150504el.LIZ().LJI("method_fix_inflate_crash_ensure_duration", false);
        }
        C1150504el.LIZ().LJI("method_ensure_duration", false);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("EnsureTaskInitRunnable@10cb.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EnsureTaskInitRunnable@10cb.run");
    }

    public static void LIZIZ() {
        C1150504el.LIZ().LIZLLL("method_init_push_early_ensure_duration", false);
        C799900VZk c799900VZk = C799900VZk.LIZ;
        InitPushTask initPushTaskLIZ = InitPushTask.LIZ();
        c799900VZk.getClass();
        C799900VZk.LIZJ(initPushTaskLIZ);
        C1150504el.LIZ().LJI("method_init_push_early_ensure_duration", false);
    }

    public C1BX2(int i) {
        this.LL = i;
    }
}
