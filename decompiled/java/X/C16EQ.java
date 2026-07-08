package X;

import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarAssem;
import com.ss.android.ugc.aweme.offlinemode.IOfflineModeSwitchAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.16EQ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16EQ extends C09AY implements Function0<IOfflineModeSwitchAbility> {
    public final /* synthetic */ VideoProgressBarAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16EQ(VideoProgressBarAssem videoProgressBarAssem) {
        super(0);
        this.LL = videoProgressBarAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.offlinemode.IOfflineModeSwitchAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IOfflineModeSwitchAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IOfflineModeSwitchAbility.class, null);
    }
}
