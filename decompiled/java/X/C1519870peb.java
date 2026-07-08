package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.keva.KevaBuilder;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ttf.storage.task.IInitStorageHook;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0peb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519870peb {
    public static final AtomicBoolean LIZ;
    public static Context LIZIZ;
    public static final IInitStorageHook LIZJ;

    static {
        UUID.randomUUID().toString();
        LIZ = new AtomicBoolean(false);
        LIZJ = (IInitStorageHook) PluggableExtentionKt.pluggableSpi(IInitStorageHook.class);
    }

    public static void LIZ(final Context context) {
        IInitStorageHook iInitStorageHook = LIZJ;
        iInitStorageHook.LIZIZ(context);
        KevaBuilder.setKevaBuildConfigCallBack(new KevaBuilder.IKevaBuildConfig() { // from class: X.0pea
            @Override // com.bytedance.keva.KevaBuilder.IKevaBuildConfig
            public final void setKevaConfig(KevaBuilder kevaBuilder) {
                boolean z;
                kevaBuilder.setContext(context);
                kevaBuilder.setMonitor(new C1519880pec());
                kevaBuilder.setPortedRepoName("aweme_ported_sp_repo");
                IInitStorageHook iInitStorageHook2 = C1519870peb.LIZJ;
                kevaBuilder.setExecutor(iInitStorageHook2.LIZLLL(context));
                kevaBuilder.setEnableLoadOpt(iInitStorageHook2.LJ(context));
                kevaBuilder.setIsLoadFromNative(2);
                kevaBuilder.setIsEnableMultiProcessLoadFromNative(1);
                Context context2 = context;
                boolean z2 = false;
                if (C302470BtN.LIZ == null) {
                    C302470BtN.LIZ = context2.getSharedPreferences("aweme_keva_exp", 0);
                }
                SharedPreferences sharedPreferences = C302470BtN.LIZ;
                if (sharedPreferences != null) {
                    z = sharedPreferences.getBoolean("keva_multi_process_io_exp", false);
                } else {
                    z = false;
                }
                kevaBuilder.setEnableMultiProcessHashIndex(z);
                Context context3 = context;
                if (C302470BtN.LIZ == null) {
                    C302470BtN.LIZ = context3.getSharedPreferences("aweme_keva_exp", 0);
                }
                SharedPreferences sharedPreferences2 = C302470BtN.LIZ;
                if (sharedPreferences2 != null) {
                    z2 = sharedPreferences2.getBoolean("keva_single_process_io_exp", false);
                }
                kevaBuilder.setEnableSingleProcessHashIndex(z2);
                iInitStorageHook2.LJFF(kevaBuilder);
            }
        });
        iInitStorageHook.LJI(context);
        LIZ.set(true);
    }
}
