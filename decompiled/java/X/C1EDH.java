package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.sessionrefactor.processor.vosnapshot.DMCellSnapshotConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EDH, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EDH extends C09AY implements Function0<DMCellSnapshotConfig> {
    public C1EDH() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.chatlist.impl.feature.sessionrefactor.processor.vosnapshot.DMCellSnapshotConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final DMCellSnapshotConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        DMCellSnapshotConfig dMCellSnapshotConfig = C1ED8.LIZIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("tt_im_vo_snapshot", DMCellSnapshotConfig.class, dMCellSnapshotConfig);
        return LJIIIIZZ != 0 ? LJIIIIZZ : dMCellSnapshotConfig;
    }
}
