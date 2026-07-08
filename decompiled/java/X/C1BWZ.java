package X;

import android.app.Activity;
import android.app.Application;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.ies.ugc.appcontext.AppBuildConfig;
import com.bytedance.ies.ugc.appcontext.compact.task.AppContextCompactInitTask;

/* JADX INFO: renamed from: X.1BWZ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BWZ {
    public static final C1BWZ LIZ = new C1BWZ();
    public static final C2206151BWb LIZIZ = new InterfaceC2206171BWd() { // from class: X.1BWb
        @Override // X.InterfaceC2206171BWd
        public final boolean LIZ(Activity activity) {
            if (activity == null) {
                return false;
            }
            return !(activity instanceof BaseActivity);
        }
    };

    /* JADX WARN: Type inference failed for: r3v0, types: [X.1BWa] */
    public static void LIZ(Application application, final AppBuildConfig appBuildConfig) {
        ?? r3 = new InterfaceC844480XAw() { // from class: X.1BWa
            @Override // X.InterfaceC844480XAw
            public final void LJIIJ() {
            }

            @Override // X.InterfaceC844480XAw
            public final Boolean LIZIZ() {
                appBuildConfig.LIZIZ();
                return Boolean.FALSE;
            }

            @Override // X.InterfaceC844480XAw
            public final Boolean LIZJ() {
                appBuildConfig.LIZJ();
                return Boolean.TRUE;
            }

            @Override // X.InterfaceC844480XAw
            public final long LIZLLL() {
                appBuildConfig.LIZLLL();
                return 2024600010;
            }

            @Override // X.InterfaceC844480XAw
            public final boolean LJ() {
                appBuildConfig.LJ();
                return false;
            }

            @Override // X.InterfaceC844480XAw
            public final boolean LJFF() {
                appBuildConfig.LJFF();
                return false;
            }

            @Override // X.InterfaceC844480XAw
            public final String LJI() {
                appBuildConfig.LJI();
                return "develop";
            }

            @Override // X.InterfaceC844480XAw
            public final Boolean LJII() {
                appBuildConfig.LJII();
                return Boolean.TRUE;
            }

            @Override // X.InterfaceC844480XAw
            public final String LJIIIIZZ() {
                appBuildConfig.LJIIIIZZ();
                return "46.0.1";
            }

            @Override // X.InterfaceC844480XAw
            public final boolean LJIIIZ() {
                appBuildConfig.LJIIIZ();
                return false;
            }

            @Override // X.InterfaceC844480XAw
            public final Boolean isDebug() {
                appBuildConfig.LIZ();
                return Boolean.FALSE;
            }

            @Override // X.InterfaceC844480XAw
            public final void LIZ() {
            }

            @Override // X.InterfaceC844480XAw
            public final void LJIIJJI() {
            }

            @Override // X.InterfaceC844480XAw
            public final void appId() {
            }

            @Override // X.InterfaceC844480XAw
            public final void appName() {
            }
        };
        C0X35.LIZ("application_injectapplication_appcontextmanager", false);
        new AppContextCompactInitTask(application, r3).run(application);
        C0X35.LJIIJJI("application_injectapplication_appcontextmanager", false);
    }
}
