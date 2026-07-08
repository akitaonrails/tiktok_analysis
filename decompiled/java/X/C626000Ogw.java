package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.offlinemode.database.OfflineModeFeedPBDataBase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.0Ogw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626000Ogw extends C09AY implements Function0<OfflineModeFeedPBDataBase> {
    public C626000Ogw() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0VMm, com.ss.android.ugc.aweme.offlinemode.database.OfflineModeFeedPBDataBase] */
    @Override // kotlin.jvm.functions.Function0
    public final OfflineModeFeedPBDataBase invoke() {
        AbstractC796510VMj abstractC796510VMj = new AbstractC796510VMj() { // from class: X.1E5b
            @Override // X.AbstractC796510VMj
            public final void migrate(C0VLF c0vlf) {
                try {
                    c0vlf.LJIILJJIL("ALTER TABLE offline_mode_feed_pb ADD COLUMN score REAL NOT NULL DEFAULT 0");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i = C19319410i8.LJ;
                    new C19319410i8("OfflineModeFeedPBDataBase").LJIIJJI(new AwS579S0100000_35(e, 135));
                }
            }
        };
        AbstractC796510VMj abstractC796510VMj2 = new AbstractC796510VMj() { // from class: X.1E5c
            @Override // X.AbstractC796510VMj
            public final void migrate(C0VLF c0vlf) {
                try {
                    c0vlf.LJIILJJIL("ALTER TABLE offline_mode_feed_pb ADD COLUMN ug_approved INTEGER NOT NULL DEFAULT 0");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i = C19319410i8.LJ;
                    new C19319410i8("OfflineModeFeedPBDataBase").LJIIJJI(new AwS579S0100000_35(e, 136));
                }
            }
        };
        C844470XAv.LIZ.getClass();
        C796500VMi c796500VMiLIZ = C0OGG.LIZ(C844470XAv.LIZ(), OfflineModeFeedPBDataBase.class, "offline_mode_feed_pb");
        c796500VMiLIZ.LIZ(abstractC796510VMj, abstractC796510VMj2);
        return c796500VMiLIZ.LIZIZ();
    }
}
