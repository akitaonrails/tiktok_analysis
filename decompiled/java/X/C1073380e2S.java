package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;

/* JADX INFO: renamed from: X.0e2S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1073380e2S {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1910850zpD());

    public static String LIZIZ(C19EG c19eg) {
        for (String str : C324520Cnq.LIZ) {
            if (Hox.LLJILJIL.LIZ(c19eg).KQ2(str)) {
                return str;
            }
        }
        return null;
    }

    public static void LIZ(C19EG c19eg, Aweme aweme) {
        ((C1910890zpH) LIZ.getValue()).LIZ("permission_popup_checker", "new auth dialog center, trigger: FYP");
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(IMainSAFLifecycleKt.requireMainSAFLifecycle(c19eg, null, false)), C0PEM.LIZJ, null, new C1073370e2R(c19eg, aweme, null), 2);
    }
}
