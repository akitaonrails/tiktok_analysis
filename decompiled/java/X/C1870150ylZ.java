package X;

import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.GameCTAInfo;
import webcast.api.partnership.AudienceRoomInfoResponse;

/* JADX INFO: renamed from: X.0ylZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1870150ylZ {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final BriefGameTask LJ;
    public final AudienceRoomInfoResponse.DropsInfo LJFF;
    public GameCTAInfo LJI;

    public /* synthetic */ C1870150ylZ(int i, String str, String str2, long j, BriefGameTask briefGameTask, GameCTAInfo gameCTAInfo, int i2) {
        this(i, str, str2, j, (i2 & 16) != 0 ? null : briefGameTask, (AudienceRoomInfoResponse.DropsInfo) null, (i2 & 64) != 0 ? null : gameCTAInfo);
    }

    public C1870150ylZ(int i, String str, String str2, long j, BriefGameTask briefGameTask, AudienceRoomInfoResponse.DropsInfo dropsInfo, GameCTAInfo gameCTAInfo) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = j;
        this.LJ = briefGameTask;
        this.LJFF = dropsInfo;
        this.LJI = gameCTAInfo;
    }
}
