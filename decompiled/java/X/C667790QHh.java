package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0QHh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C667790QHh extends C0Q49<C667770QHf> {
    public static final C667790QHh LIZJ = new C667790QHh();
    public static final long LIZLLL;

    static {
        SettingsManager.LIZLLL().getClass();
        LIZLLL = SettingsManager.LJ("effective_click_signal_threshold", 5) * LSPassThroughRecordSizeConfig.DEFAULT;
    }

    public C667790QHh() {
        super(C0QI2.LJII);
    }

    @Override // X.C0Q49
    public final void LIZ() {
        C0QI2 c0qi2 = C0QI2.LJII;
        c0qi2.LIZLLL.LIZ(C13LE.LIZ(C0QI8.class), new C667940QHw());
        c0qi2.LIZLLL.LIZ(C13LE.LIZ(C0Q44.class), new C667810QHj());
        c0qi2.LIZLLL.LIZ(C13LE.LIZ(C0QHZ.class), new C667840QHm());
        c0qi2.LIZLLL.LIZ(C13LE.LIZ(C0Q43.class), new C667780QHg(LIZJ));
    }
}
