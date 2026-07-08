package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NmE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C603800NmE extends C09AY implements Function0<C603780NmC> {
    public C603800NmE() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0NmC, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final C603780NmC invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        C603780NmC c603780NmC = C603790NmD.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("tt_im_light_interaction_exit_settings", C603780NmC.class, c603780NmC);
        return LJIIIIZZ != 0 ? LJIIIIZZ : c603780NmC;
    }
}
