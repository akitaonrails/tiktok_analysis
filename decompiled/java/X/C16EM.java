package X;

import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarAssem;
import com.ss.android.ugc.aweme.feed.ghouse.InsertCacheWhenPlayLagAbility;
import com.ss.android.ugc.aweme.offlinemode.IOfflineModeSwitchAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.16EM, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16EM extends C09AY implements Function2<VideoProgressBarAssem, C291001Au<? extends String>, Unit> {
    public C16EM() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoProgressBarAssem videoProgressBarAssem, C291001Au<? extends String> c291001Au) {
        VideoProgressBarAssem videoProgressBarAssem2 = videoProgressBarAssem;
        if (c291001Au != null) {
            IOfflineModeSwitchAbility iOfflineModeSwitchAbility = (IOfflineModeSwitchAbility) videoProgressBarAssem2.LLJLLL.getValue();
            if (iOfflineModeSwitchAbility != null) {
                iOfflineModeSwitchAbility.dJ(false);
            }
            InsertCacheWhenPlayLagAbility insertCacheWhenPlayLagAbility = videoProgressBarAssem2.LLJZ;
            if (insertCacheWhenPlayLagAbility == null) {
                insertCacheWhenPlayLagAbility = (InsertCacheWhenPlayLagAbility) C1558520qew.LIZ(C1558520qew.LJIIL(videoProgressBarAssem2), InsertCacheWhenPlayLagAbility.class, null);
                if (insertCacheWhenPlayLagAbility != null) {
                    videoProgressBarAssem2.LLJZ = insertCacheWhenPlayLagAbility;
                    insertCacheWhenPlayLagAbility.K1(false);
                }
                videoProgressBarAssem2.Gp();
            } else {
                insertCacheWhenPlayLagAbility.K1(false);
                videoProgressBarAssem2.Gp();
            }
        }
        return Unit.LIZ;
    }
}
