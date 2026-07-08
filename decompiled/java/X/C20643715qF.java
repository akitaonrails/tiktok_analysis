package X;

import com.ss.android.ugc.aweme.innerpush.settings.PullSettings;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15qF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20643715qF extends C09AY implements Function0<PullSettings.MetaData> {
    public C20643715qF() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.innerpush.settings.PullSettings$MetaData, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final PullSettings.MetaData invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        PullSettings.MetaData metaData = PullSettings.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(PullSettings.MetaData.class, metaData, "in_app_push_pull_strategy", true);
        return LJJII != 0 ? LJJII : metaData;
    }
}
