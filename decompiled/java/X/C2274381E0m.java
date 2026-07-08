package X;

import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.1E0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2274381E0m implements IIMAabPluginService {
    public static final C2274381E0m LIZIZ = new C2274381E0m();
    public final /* synthetic */ IIMAabPluginService LIZ;

    @Override // com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService
    public final void LIZ(String str, boolean z) {
        this.LIZ.LIZ(str, z);
    }

    @Override // com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService
    public final boolean LIZIZ(Context context, String str, boolean z) {
        return this.LIZ.LIZIZ(context, str, z);
    }

    @Override // com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService
    public final boolean LIZJ(boolean z, boolean z2) {
        return this.LIZ.LIZJ(z, z2);
    }

    @Override // com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService
    public final C0CCZ LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService
    public final Future LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService
    public final boolean LJFF(boolean z) {
        return this.LIZ.LJFF(z);
    }

    @Override // com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService
    public final void LJI(Activity activity) {
        this.LIZ.LJI(activity);
    }

    public C2274381E0m() {
        IIMAabPluginService iIMAabPluginService = (IIMAabPluginService) PluggableExtentionKt.pluggableSpiForReal(IIMAabPluginService.class);
        this.LIZ = iIMAabPluginService == null ? new IIMAabPluginService() { // from class: X.1E0l
            @Override // com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService
            public final void LIZ(String str, boolean z) {
            }

            @Override // com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService
            public final boolean LIZIZ(Context context, String str, boolean z) {
                return true;
            }

            @Override // com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService
            public final boolean LIZJ(boolean z, boolean z2) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService
            public final boolean LJFF(boolean z) {
                return true;
            }

            @Override // com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService
            public final void LJI(Activity activity) {
            }

            @Override // com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService
            public final C0CCZ LIZLLL() {
                return new C0CCZ() { // from class: com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService$getDownloadTask$1
                    @Override // X.InterfaceC800080Va2
                    public final /* synthetic */ List finalizedBy() {
                        return null;
                    }

                    @Override // X.InterfaceC800080Va2
                    public final String key() {
                        return "IIMAabPluginService$getDownloadTask$1";
                    }

                    @Override // X.InterfaceC800080Va2
                    public final /* synthetic */ boolean meetTrigger() {
                        return true;
                    }

                    @Override // X.InterfaceC308150C6b
                    public final void run(Context context) {
                    }

                    @Override // X.C0CCZ
                    public final /* synthetic */ boolean serialExecute() {
                        return false;
                    }

                    @Override // X.InterfaceC800080Va2
                    public final /* synthetic */ int targetProcess() {
                        return C0VZ0.LIZ();
                    }

                    @Override // X.InterfaceC800080Va2
                    public final /* synthetic */ EnumC799980VZs triggerType() {
                        return C0VZ0.LIZIZ(this);
                    }

                    @Override // X.C0CCZ
                    public final EnumC799870VZh type() {
                        return EnumC799870VZh.BOOT_FINISH;
                    }
                };
            }

            @Override // com.ss.android.ugc.aweme.im.aab.plugin.api.IIMAabPluginService
            public final Future LJ() {
                return new Future<Integer>() { // from class: X.0N7z
                    @Override // java.util.concurrent.Future
                    public final boolean cancel(boolean z) {
                        return false;
                    }

                    @Override // java.util.concurrent.Future
                    public final Integer get() {
                        return -1;
                    }

                    @Override // java.util.concurrent.Future
                    public final boolean isCancelled() {
                        return false;
                    }

                    @Override // java.util.concurrent.Future
                    public final boolean isDone() {
                        return true;
                    }

                    @Override // java.util.concurrent.Future
                    public final Integer get(long j, TimeUnit timeUnit) {
                        return -1;
                    }
                };
            }
        } : iIMAabPluginService;
    }
}
