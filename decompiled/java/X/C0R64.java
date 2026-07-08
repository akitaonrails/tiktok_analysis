package X;

import com.ss.android.ugc.aweme.experiment.FromGroupIdScenarios;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R64, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R64 extends C09AY implements Function0<C0R63> {
    public C0R64() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0R63 invoke() {
        return new C0R54() { // from class: X.0R63
            public static String LIZIZ = "";
            public static long LIZJ;

            @Override // X.C0R54
            public final void LIZIZ() {
                LIZIZ = "";
                LIZJ = 0L;
            }

            @Override // X.C0R54
            public final String getFromGroupId() {
                if ((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - LIZJ > FromGroupIdScenarios.LIZ().timeGapSetting) {
                    LIZIZ();
                }
                return LIZIZ;
            }

            @Override // X.C0R54
            public final void LIZ(String str) {
                LIZIZ = str;
                LIZJ = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            }
        };
    }
}
